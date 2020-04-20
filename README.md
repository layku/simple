# simple
SpringBoot最精简模式

# 关键点
#### 1.maven配置
~~~
<build>
    <finalName>simple</finalName>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.5</version>
            <configuration>
                <skipTests>true</skipTests>
            </configuration>
        </plugin>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <version>2.1.3.RELEASE</version>
            <configuration>
                <jvmArguments>-Dfile.encoding=UTF-8</jvmArguments>
                <mainClass>cn.layku.simple.SimpleApplication</mainClass>
                <layout>ZIP</layout>
                <!--打包排除所有jar包核心代码-->
                <includes>
                    <include>
                        <groupId>nothing</groupId>
                        <artifactId>nothing</artifactId>
                    </include>
                </includes>
                <!--打包排除所有jar包核心代码-->
            </configuration>
            <executions>
                <execution>
                    <goals>
                        <goal>repackage</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
~~~

#### 2.运行代码
~~~
java -Dloader.path=lib -jar simple.jar

lib代表jar包所在路径,simple.jar代表生成的jar包所在路径