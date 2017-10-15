[Gradle 中的 buildScript 代码块 - 黄博文 - 博客园](http://www.cnblogs.com/huang0925/p/3940528.html)

> buildscript 中的声明是 gradle 脚本自身需要使用的资源。
> 可以声明的资源包括依赖项、第三方插件、maven 仓库地址等。而在 build.gradle 文件中直接声明的依赖项、
> 仓库地址等信息是项目自身需要的资源。

比如这里的 commons-csv 库只是 task 里面用到, 代码并没有用到, 所以定义在 buildscript.dependencies 下面:

```groovy
buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        classpath 'org.apache.commons:commons-csv:1.0'
    }
}

import org.apache.commons.csv.*

task printCSV() {
    doLast {
        def records = CSVFormat.EXCEL.parse(new FileReader('config/sample.csv'))
        for (item in records) {
            print item.get(0) + ' '
            println item.get(1)
        }

    }
}
```

[build - Gradle buildscript dependencies - Stack Overflow](https://stackoverflow.com/questions/13923766/gradle-buildscript-dependencies)

> The repositories in the buildScript block are used to fetch the dependencies of your 
> buildScript dependencies. These are the dependencies that are put on the classpath 
> of your build and that you can refer to from your build file. For instance extra 
> plugins that exist on the internet.
> 
> The repositories on the root level are used to fetch the dependencies that 
> your project depends on. So all the dependencies you need to compile your project.
