# Using Legacy Systems

A company can access customer data through an old legacy system and a new developed system. 
The old system can access data stored on external disk using a USB connection. The new system 
can access data stored on external server using REST API over HTTPS connection. This application 
implements a software system that allows the interface of the old system to be used as the new 
interface and is able to convert these two interfaces.
 
This application is designed using the Adapter pattern. It converts the interface of a class into 
another interface expected by the client. The adapter lets incompatible classes work together. 
The Target is CustomerData and the Adaptee is CustomerDataOverHTTPS.
 
Since Adapter pattern is used, implementation is flexible. The adapter can work with multiple 
adaptees. Different adapters can be added to convert different backend classes and new 
implementations can be added as long as they adhere to the target interface.  This design has also 
reduced the amount of duplicated code. Each overridden method is unique to its class.

The Object-oriented design of this application allows the implementation to be simple and 
easily understood. Ex: The adaptee is not aware of the adapter. The adapter encapsulates 
any changes made to the interface over time. 

Repo: https://github.com/metcs/met-cs665-assignment-4-ccelia365


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




