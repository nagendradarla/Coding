# Coding Practice (Maven)

This repository contains Java coding exercises and algorithm practice problems.
The project is now a single Maven module at the repository root.

## Project Structure

```text
Coding/
├── pom.xml
├── README.md
├── LeetCode150.txt
└── src/
    ├── main/java/
    │   ├── binarytrees/
    │   ├── com/ndarla/
    │   ├── graphs/
    │   ├── leetcode/
    │   ├── queues/
    │   ├── recursion/
    │   ├── sorting/
    │   └── stacks/
    └── test/java/
```

## Prerequisites

- Maven 3.x+
- JDK 17 (based on `pom.xml` compiler settings)

## Build And Test

From the repository root:

```bash
mvn clean test
```

To build the jar artifact:

```bash
mvn clean package
```

## Task Documentation

Each task area now includes a local `README.md` with a short description and usage notes.
Start from:

- `src/main/java/binarytrees/README.md`
- `src/main/java/com/ndarla/README.md`
- `src/main/java/graphs/README.md`
- `src/main/java/leetcode/README.md`
- `src/main/java/queues/README.md`
- `src/main/java/recursion/README.md`
- `src/main/java/sorting/README.md`
- `src/main/java/stacks/README.md`

## Notes

- Generated files (for example `target/`) and local OS files (for example `.DS_Store`) are not meant to be tracked in Git.
