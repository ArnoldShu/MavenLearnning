###  **1.解压部署Maven核心程序** 

	①检查JAVA_HOME环境变量
		首先确保你的JDK已经正确安装;
	②解压Maven的核心程序
		将apache-maven-3.5.3-bin.zip(在项目中以上传元安装包)解压到一个非中文无空格的目录下。例如：D:\DevInstall\apache-maven-3.5.3
	③配置环境变量
		M2_HOME D:\DevInstall\apache-maven-3.5.3
		path	D:\DevInstall\apache-maven-3.5.3\bin
	④查看Maven版本信息验证安装是否正确
	C:\Windows\System32>mvn -v
        Apache Maven 3.5.3 (3383c37e1f9e9b3bc3df5050c29c8aff9f295297; 2018-02-25T03:49:05+08:00)
        Maven home: D:\Maven\apache-maven-3.5.3\bin\..
        Java version: 1.8.0_131, vendor: Oracle Corporation
        Java home: D:\Program Files\Java\jdk1.8.0_131\jre
        Default locale: zh_CN, platform encoding: GBK
        OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

### 2.修改本地仓库

	①默认本地仓库位置：~\.m2\repository,~表示当前用户的家目录，例如：C:\Users\[你当前登录系统的用户名]
	②指定本地仓库位置的配置信息文件：apache-maven-3.5.3\conf\settings.xml
	③在根标签settings下添加如下内容：<localRepository>[本地仓库路径，也就是RepMaven.zip的解压目录]</localRepository>
