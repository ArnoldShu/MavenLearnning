### 1.Maven的常用命令(*注意：运行Maven命令时一定要进入pom.xml文件所在的目录)演示:

	    mvn compile	编译
        编译的内容命令行展示窗口展示内容
        [WARNING]
        [WARNING] Some problems were encountered while building the effective settings
        [WARNING] Unrecognised tag: 'mirrors' (position: START_TAG seen ...</mirror>\n-->\n\t \n<mirrors>... @160:14)    
        @ D:\Maven\apache-maven-3.5.3\bin\..\conf\settings.xml, line 160, column 14
        [WARNING]
        [INFO] Scanning for projects...
        [INFO]
        [INFO] --------------------------< maven_3:maven_3 >---------------------------
        [INFO] Building maven_3 1.0-SNAPSHOT
        [INFO] --------------------------------[ jar ]---------------------------------
        Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/4.0/junit-4.0.pom
        Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/4.0/junit-4.0.pom (210 B at 129 B/s)
        [INFO]
        [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ maven_3 ---
        [WARNING] Using platform encoding (GBK actually) to copy filtered resources, i.e. build is platform dependent!
        [INFO] Copying 1 resource
        [INFO]
        [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ maven_3 ---
        [INFO] Changes detected - recompiling the module!
        [WARNING] File encoding has not been set, using platform encoding GBK, i.e. build is platform dependent!
        [INFO] Compiling 1 source file to D:\ArnoldSu\Maven-learnning\maven_3_maven项目与常用命令\target\classes
        [INFO] ------------------------------------------------------------------------
        [INFO] BUILD SUCCESS
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time: 7.092 s
        [INFO] Finished at: 2019-02-01T10:37:11+08:00
        [INFO] ------------------------------------------------------------------------

        mvn clean	清理
        [WARNING]
        [WARNING] Some problems were encountered while building the effective settings
        [WARNING] Unrecognised tag: 'mirrors' (position: START_TAG seen ...</mirror>\n-->\n\t \n<mirrors>... @160:14)      
        @ D:\Maven\apache-maven-3.5.3\bin\..\conf\settings.xml, line 160, column 14
        [WARNING]
        [INFO] Scanning for projects...
        [INFO]
        [INFO] --------------------------< maven_3:maven_3 >---------------------------
        [INFO] Building maven_3 1.0-SNAPSHOT
        [INFO] --------------------------------[ jar ]---------------------------------
        [INFO]
        [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ maven_3 ---
        [INFO] Deleting D:\ArnoldSu\Maven-learnning\maven_3_maven项目与常用命令\target
        [INFO] ------------------------------------------------------------------------
        [INFO] BUILD SUCCESS
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time: 0.572 s
        [INFO] Finished at: 2019-02-01T11:55:52+08:00
        [INFO] ------------------------------------------------------------------------

        mvn test	测试
        [WARNING]
        [WARNING] Some problems were encountered while building the effective settings
        [WARNING] Unrecognised tag: 'mirrors' (position: START_TAG seen ...</mirror>\n-->\n\t \n<mirrors>... @160:14)      
        @ D:\Maven\apache-maven-3.5.3\bin\..\conf\settings.xml, line 160, column 14
        [WARNING]
        [INFO] Scanning for projects...
        [INFO]
        [INFO] --------------------------< maven_3:maven_3 >---------------------------
        [INFO] Building maven_3 1.0-SNAPSHOT
        [INFO] --------------------------------[ jar ]---------------------------------
        [INFO]
        [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ maven_3 ---
        [INFO] Deleting D:\ArnoldSu\Maven-learnning\maven_3_maven项目与常用命令\target
        [INFO] ------------------------------------------------------------------------
        [INFO] BUILD SUCCESS
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time: 0.572 s
        [INFO] Finished at: 2019-02-01T11:55:52+08:00
        [INFO] ------------------------------------------------------------------------

        mvn package	打包
        打包的内容命令行展示窗口展示内容
        [WARNING]
        [WARNING] Some problems were encountered while building the effective settings
        [WARNING] Unrecognised tag: 'mirrors' (position: START_TAG seen ...</mirror>\n-->\n\t\n<mirrors>...         
        @160:14)  @ D:\Maven\apache-maven-3.5.3\bin\..\conf\settings.xml, line 160, column 14
        [WARNING]
        [INFO] Scanning for projects...
        [INFO]
        [INFO] --------------------------< maven_3:maven_3 >---------------------------
        [INFO] Building maven_3 1.0-SNAPSHOT
        [INFO] --------------------------------[ jar ]---------------------------------
        [INFO]
        [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ maven_3 ---
        [WARNING] Using platform encoding (GBK actually) to copy filtered resources, i.e. build is platform dependent!
        [INFO] Copying 1 resource
        [INFO]
        [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ maven_3 ---
        [INFO] Nothing to compile - all classes are up to date
        [INFO]
        [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ maven_3 ---
        [WARNING] Using platform encoding (GBK actually) to copy filtered resources, i.e. build is platform dependent!
        [INFO] skip non existing resourceDirectory D:\ArnoldSu\Maven-learnning\maven_3_maven项目与常用命令\src\test\resources
        [INFO]
        [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ maven_3 ---
        [INFO] Nothing to compile - all classes are up to date
        [INFO]
        [INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ maven_3 ---
        [INFO] Surefire report directory: D:\ArnoldSu\Maven-learnning\maven_3_maven项目与常用命令\target\surefire-reports

        -------------------------------------------------------
         T E S T S
        -------------------------------------------------------
        Running com.boommob.www.HelloWorldTest
        Hello litingwei!Hello litingwei!
        Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.176 sec
        Results :

        Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

        [INFO]
        [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ maven_3 ---
        [INFO] ------------------------------------------------------------------------
        [INFO] BUILD SUCCESS
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time: 4.588 s
        [INFO] Finished at: 2019-02-01T10:57:07+08:00
        [INFO] ------------------------------------------------------------------------

 

### 2.在执行完相应的maven命令之后会在该项目的路径下生成target文件夹:
     target
         |-- classes 编译之后的类文件
         |-- maven-archeiver maven打包时候生成的得一个工程对象模型属性文件里面记载的是该项目的POM.xml的一些相关属性
         |-- maven-status maven状态,一些maven编译的插件信息
         |-- surefire-reports maven打包生成的一个报告,测试报告
         |-- test-classes 编译之后的测试类文件


