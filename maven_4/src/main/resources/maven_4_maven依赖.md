1.首先项目POM.xml添加maven_3_maven模块与常用命令的依赖,这是我们本地库的一个模块依赖,如果直接在命令行直接执行:mvn compile 的话会报错,
此处需要先在maven_3_maven模块执行mvn install,将模块安装到本地,在结合maven_4_maven依赖进行编译.

2.POM.xml元素解释
dependencies:(Many) This element describes all of the dependencies associated with a project.
These dependencies are used to construct a classpath for your project during the build process.
They are automatically downloaded from the repositories defined in this project.See the dependency mechanism for more information.
(此元素描述与项目关联的所有依赖项。这些依赖项用于在构建过程中为项目构造类路径。它们会自动从此项目中定义的存储库下载,参考依赖机制:https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html);

### 3:Dependency Mechanism(依赖机制)
    3.1.Transitive Dependencies(传递依赖)
        Dependency mediation(依赖调解),多个版本依赖项nearest definition
        (最近定义原则:表示所使用的版本将是依赖关系树中与项目最接近的版本。例如，如果A，B和C
        的依赖关系定义为A - > B - > C - > D 2.0和A - > E - > D 1.0，则构建A时将使用D 1.0,
        因为A的路径到D到E更短.您可以在A中向D 2.0明确添加依赖项以强制使用D 2.0);

    3.2.Dependency management(依赖管理),在3.1的示例中，依赖项直接添加到A，即使它不是由A直接使用。
        相反，A可以在其dependencyManagement部分中包含D作为依赖项,并直接控制在何时使用D的哪个版本;

    3.3.Dependency scope(依赖范围),下面4点详细讲解;

    3.4.Dependency scope(排除依赖项),如果项目X依赖于项目Y，项目Y依赖于项目Z，则项目X的所有者可以使用
        exclusion元素将项目Z明确地排除为依赖项;

    3.5.Optional dependencies(可选择的依赖项),如果项目Y依赖于项目Z，项目Y的所有者可以使用optional元素
        将项目Z标记为可选依赖项。当项目X依赖于项目Y时，X将仅依赖于Y而不依赖于Y的可选依赖项Z.项目X的所有者可以
        在她的选项中明确地添加对Z的依赖性;

Maven提供dependency:analyze插件,可以帮助最佳实现依赖机制.

### 4:Dependency scope(依赖范围)

    依赖关系范围用于限制依赖关系的传递性，还用于影响用于各种构建任务的类路径。包含六个范围:
        4.1.compile,默认范围,编译依赖项在项目的所有类路径中都可用,这些依赖项将传播到其他依赖项目。

        4.2.provided,和compile很相似,但是但表示您希望JDK或容器在运行时提供依赖项。例如，在为Java
            Enterprise Edition构建Web应用程序时，您可以将Servlet API和相关Java EE API的依赖关系设置
            为提供的范围，因为Web容器提供了这些类。此范围仅在编译和测试类路径中可用，并且不可传递。

        4.3.runtime,此范围表示编译不需要依赖项，但是用于执行。它位于运行时和测试类路径中，但不是编译类路径。
            可执行不需要编译的依赖

        4.4.test,测试编译和执行的依赖,依赖不传递

        4.5.system,和provided很相似只是您必须提供明确包含它的JAR。可以使用但是不能在库中找到

        4.6.import,仅在POM.xml中引入<dependencyManagement>元素才支持此作用域。并且一旦标注为import,就不参与传递依赖
            每个依赖范围（import除外）以不同方式影响传递依赖性，如下表所示。如果依赖项设置为左列中的作用域，则该依赖项与顶行
            中作用域的传递依赖性将导致主项目中的依赖项，并在交集处列出作用域。如果未列出范围，则表示将省略依赖关系。
![依赖范围](https://images.gitee.com/uploads/images/2019/0202/135822_124ff85b_1635774.png "[EF5RN$22FD@[FBW%9O7P]Y.png")

### 5:Dependency Management(依赖管理)

    5.1.集中依赖信息管理,官方图示来说明其机制:两个扩展同一父级的POM
    项目A共同依赖group-a,但是第一个依赖排除对grouo-c的依赖,依赖于artifact-a模块,第二个依赖是group-a下的artifact-b
![A项目](https://images.gitee.com/uploads/images/2019/0202/141529_e3a76059_1635774.png "a.png")
    项目B,第一个依赖grouo-c下的artifact-b,第二个依赖是group-a下的artifact-b
![B项目](https://images.gitee.com/uploads/images/2019/0202/141821_806a52cf_1635774.png "b.png")
    用依赖管理<dependencyManagement>放在其父级项目POM.xml
![父项目](https://images.gitee.com/uploads/images/2019/0202/142540_69b8cf95_1635774.png "c.png")
    两个子项目的配置就会简单很多
![简化之后的配置](https://images.gitee.com/uploads/images/2019/0214/125712_94c48474_1635774.png "B_BW16~YI80{X%Q}475D[89.png")
    注意:其中子项目用Dependency Management之后需要指明<type>的类型,因为Dependency Management
    只针对{groupId, artifactId, type, classifier}为最小单位进行依赖管理
    
    5.2.还有个重要的特性就是模块版本控制上面,并且依赖管理的依赖级别是:dependency management>transitive dependencies除了继承依赖传递,还可以通过<import>来导入依赖,在较大的项目中比较实用,并且讲究谁先申明谁且本身pom并未申明版本号,就引用第一个申明的版本号作为当前的版本号.

### 6:System Dependencies(系统依赖,已经弃用)


