# software-assignments

# Adapter Pattern Example - Weather Data Visualization

This Java application demonstrates the use of the **Adapter Pattern** to seamlessly integrate two different weather data sources into a common weather data visualization system. The two data sources, "SourseOne" and "SourseTwo," have different interfaces and data structures. The `Main` class orchestrates the system, and the `View` class handles the presentation of the weather data.

## Table of Contents
- [Introduction](#introduction)
- [Usage](#usage)
- [Classes](#classes)
- [Adapter Pattern](#adapter-pattern)
- [How it Works](#how-it-works)
- [Contributors](#contributors)
- [License](#license)

## Introduction

In this project, we have two distinct sources of weather data:

- **SourseOne**: Provides weather data in a specific format, including location, temperature, humidity, wind speed, and pressure.

- **SourseTwo**: Provides weather data in a different format, including location, temperature, humidity, wind speed, and air quality.

The challenge is to integrate both data sources into a common weather data visualization system, making it possible to display weather information consistently, regardless of the source. To achieve this, we use the **Adapter Pattern**.

## Usage

1. Clone this repository to your local machine.

2. Open the project in your favorite Java IDE.

3. Run the `Main` class to see the integrated weather data from both sources displayed using adapters.

## Classes

1. **Main**: The main class where the application starts. It initializes the data sources, creates adapters, and displays weather information.

2. **View**: Responsible for presenting weather data. It can show weather information from different sources seamlessly.

3. **SourseOne**: Represents the first data source with its own format.

4. **SourseTwo**: Represents the second data source with its own format.

5. **Model**: An interface representing a common data structure for weather information.

6. **SourseOneAdapter**: An adapter that allows the `SourseOne` data to be used as a `Model` object.

7. **SourseTwoAdapter**: An adapter that allows the `SourseTwo` data to be used as a `Model` object.

## Adapter Pattern

The **Adapter Pattern** is used to make two incompatible interfaces work together. In this project, we have implemented two adapters, `SourseOneAdapter` and `SourseTwoAdapter`, that allow the data from `SourseOne` and `SourseTwo` to be treated as `Model` objects, which is the common interface used by the `View`.

## How it Works

1. `SourseOne` and `SourseTwo` represent two different data sources, each with its own data structure and interface.

2. `SourseOneAdapter` and `SourseTwoAdapter` are created to adapt the specific data source formats to the common `Model` interface.

3. In the `Main` class, we create instances of `SourseOne`, `SourseTwo`, and their respective adapters.

4. The `View` class is used to display weather information. It takes `Model` objects as input, which can be either `SourseOneAdapter` or `SourseTwoAdapter`.

5. The `View` can seamlessly show weather data from both sources using adapters, providing a consistent and unified presentation.

## Contributors

- [Ibrahim]
