# Maven Multi-Module Project: coding-tasks and spark-test

This repository is a **Maven multi-module project** with two modules:
- **`coding-tasks`**: Contains code related to various coding tasks and exercises.
- **`spark-test`**: Contains test cases and implementations for working with Apache Spark.

## Project Structure

The project is structured as follows:<br>
├── pom.xml # Parent POM file <br>
├── coding-tasks # First module: coding tasks and exercises <br>
│ ├── src # Source code for coding tasks <br>
│ └── pom.xml # Module-specific POM <br>
├── spark-test # Second module: Spark testing <br>
│ ├── src # Source code for Spark tests <br>
│ └── pom.xml # Module-specific POM


### Modules
1. **`coding-tasks`**:
    - This module includes various coding tasks and exercises. These tasks are designed to help solve common algorithmic and data structure problems.
    - Tasks in this module may include sorting algorithms, dynamic programming exercises, and other coding challenges.

2. **`spark-test`**:
    - This module is designed to include unit tests and other test cases for testing Spark-based applications or components.
    - It includes Spark jobs or data processing test cases using the **Apache Spark** framework.
    - Useful for anyone interested in testing Spark applications using **JUnit** or **ScalaTest**.

## Prerequisites

- **Maven**: This project uses Maven for dependency management and building the project. Please ensure you have **Maven 3.x** or later installed.
- **JDK**: Java Development Kit 8 or above is required to compile and run this project.
- **Apache Spark**: For the `spark-test` module, **Apache Spark** should be set up in your environment if running Spark-specific tests.

## Building the Project

To build the project, navigate to the root directory and run:

### This command will build both the coding-tasks and spark-test modules.
```bash
mvn clean install
```