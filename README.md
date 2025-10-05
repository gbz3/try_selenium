# try_selenium

## 準備

### Maven

```
$ sdk list maven
$ sdk install maven 3.9.11
$ sdk current maven
Using maven version 3.9.11
$ mvn --version
Apache Maven 3.9.11 (3e54c93a704957b63ee3494413a2b544fd3d825b)
Maven home: /home/***/.sdkman/candidates/maven/current
Java version: 25, vendor: Oracle Corporation, runtime: /home/***/.sdkman/candidates/java/25-open
Default locale: en, platform encoding: UTF-8
OS name: "linux", version: "6.6.87.2-microsoft-standard-wsl2", arch: "aarch64", family: "unix"
```

### ひな形プロジェクト

```
$ mvn archetype:generate \
    -DgroupId=com.example \
    -DartifactId=selenium-junit5-project \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DinteractiveMode=false
$ cd selenium-junit5-project
$ mvn test
...
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.example.AppTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.030 s -- in com.example.AppTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
...
$ 
```
