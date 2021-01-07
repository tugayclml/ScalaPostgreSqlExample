# Welcome to my first Scala project

 In this project I tried connect to postgresql database and execute some sql. I used sbt build tool.

# What is the 'sbt'?

**sbt** is a build tool for Scala and Java. It requires **Java 1.8** or later.
If you want to learn more, you can visit this https://www.scala-sbt.org/1.x/docs/ site.

# How to run sbt project? 
Open terminal:

    $ cd path/to/project
    $ $path/to/project: sbt run

- Then it will download some libraries what you added to build.sbt.
	**You can check build.sbt for postgresql jdbc driver** 
- After that it will compile your project and run your scala file.
 - In my project, it will run DbConnection.scala file and returns inserted accounts username.
