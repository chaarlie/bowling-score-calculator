Hello, this is a sample calculator for USA bowling 
score sheet. 

Project is in Java language and can be run as a console application.

**Requirements**
1. JDK 8
2. mvn

**Running Steps**

1. mvn package (in the root dir)
2. **mvn exec:java -Dexec.mainClass="com.bowlingscore.GameAnalyzer"**

Note: If you'd like to pass in your own score sheet, you must
modify pom.xml and replace file name (Book1.txt) with yours.

**Test**
1. mvn test