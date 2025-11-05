# AnsiWithGroovy

A simple "Hello World" Groovy application that demonstrates the use of the [Jansi](https://github.com/fusesource/jansi) library for ANSI colored terminal output.

## Features

- Uses Groovy 4.0.28
- Demonstrates Jansi library (version 2.4.1) for ANSI color support
- Shows various text colors (red, yellow, cyan, magenta, green, blue)
- Demonstrates background colors and text formatting (bold)

## Prerequisites

- Java 8 or higher
- No need to install Gradle separately - the project includes the Gradle wrapper

## Building the Application

To build the application, run:

```bash
./gradlew build
```

On Windows, use:

```cmd
gradlew.bat build
```

## Running the Application

To run the application, use:

```bash
./gradlew run
```

On Windows, use:

```cmd
gradlew.bat run
```

## Project Structure

```
.
├── build.gradle           # Gradle build configuration
├── src/
│   └── main/
│       └── groovy/
│           └── HelloWorld.groovy  # Main application
├── gradle/                # Gradle wrapper files
├── gradlew                # Gradle wrapper script (Unix)
└── gradlew.bat            # Gradle wrapper script (Windows)
```

## About Jansi

Jansi is a Java library that allows you to use ANSI escape codes to format console output. It provides:
- Cross-platform support (Windows, Mac, Linux)
- Colored text output
- Text formatting (bold, underline, etc.)
- Background colors

For more information, visit the [Jansi GitHub repository](https://github.com/fusesource/jansi).