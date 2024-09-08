# Setup of basic gradle using cli:
```agsl
gradle init --use-defaults --type java-application
```

The above command will set up a basic gradle project

```agsl
./gradlew build
```

To prepare a jar which is executable, you need to set up manifest property in `build.gradle` to identify what is the main class to execute
```groovy
jar {
    manifest {
        attributes (
            'Main-Class': 'org.example.Main'
        )
    }
    from {
        configurations.compileClasspath.collect { it.isDirectory() ? it : zipTree(it) }
    }
}

```


The above command can build your project

```agsl
./gradlew jar
```

The above command creates a new jar file in `build/libs` folder

```agsl
java -jar build/libs/filename.jar
```

The above command will execute your code


## Homework

- Try to build a jar and run it directly from cli and see if the okhttp code is working or not just like it is working by running directly from intellij
- instead of okhttp try to integrate retrofit library to make the same http call

## Notes

1. if we try to run this program using cli command gradlew jar. it will throw error because compiler won't be able to find okhttp class.
   to defend this situation we will create a fat jar which consist of dependencies file as well.
   we are required to add from {
   configurations.compileClasspath.collect { it.isDirectory() ? it : zipTree(it) }
   } line after manifest. ex
   jar {
   manifest {
   attributes (
   'Main-Class': 'org.example.Main'
   )
   }
   from {
   configurations.compileClasspath.collect { it.isDirectory() ? it : zipTree(it) }
   }
   }
2. at this stage one problem is resolved, but we will still get one error:
    the error statement is : no duplicate handle strategy is used. to solve this problem we need to add duplicatesStrategy = DuplicatesStrategy.INCLUDE
    in jar like above we did.