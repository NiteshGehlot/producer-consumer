This is a simple message-driven application in Core Java that simulates a Producer-Consumer scenario using a message queue.
The application processes messages, tracks the total number of successful messages and errors encountered, and gracefully stops execution after processing all messages.

🛠 Features
✔ Thread-safe Message Queue
✔ Producer-Consumer Design
✔ Random Failure Simulation (20% failure rate)
✔ JUnit Test Cases for success & failure scenarios

🛠 Prerequisites
Java 8+
Maven (if using the provided pom.xml for dependency management)

🚀 How to Run the Application

1. Compile the Java files

javac -d out src/main/java/org/example/*.java

2. Run the application

java -cp out org.example.MessageProcessor

✅ Running Unit Tests
1. Compile the test files
   
javac -cp .:junit-5.9.2.jar -d out test/java/org/example/*.java

3. Run the tests
   
java -jar junit-platform-console-standalone-1.9.2.jar --classpath out --select-package org.example
