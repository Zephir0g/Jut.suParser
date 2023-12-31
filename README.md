# Jut.su Parser
## Anime Achievement Timing Parser

This project is a Java-based application that parses HTML data from the anime streaming website jut.su and extracts timing information for achievements while watching anime. It allows users to input a URL of an anime episode on jut.su and retrieves the HTML code to analyze the timing of various events that occur throughout the episode.

## Features

- Parsing URL: The application prompts the user to input the URL of an anime episode on jut.su. It utilizes the Jsoup library to connect to the provided URL and retrieve the HTML code.
- HTML Parsing: The retrieved HTML code is parsed to extract timing information related to achievements while watching the anime episode.
- Saving to File: The extracted timing information is saved to a file named `decode.txt` for further processing and analysis.
- Decoding Base64: The application decodes the Base64 encoded strings found in the extracted timing information, revealing additional details about the achievements.
- Displaying Achievements: The application displays the decoded achievements, including the timing and corresponding titles, on the console.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven (for building the project)

## Installation

1. Clone the repository to your local machine.
2. Navigate to the project directory and build the project using Maven.
3. Launch the application by running the `Main.java` file.

## Usage

1. Launch the application and provide the URL of the desired anime episode on jut.su when prompted.
2. The application will parse the URL, extract the timing information, and display the decoded achievements on the console.
3. Additionally, the decoded achievements will be saved to the `decode.txt` file for further reference.

## License

This project has no license.

## Acknowledgements

- [Jsoup](https://jsoup.org/): Java HTML Parser library used for retrieving and parsing HTML data.
- [Base64](https://docs.oracle.com/javase/8/docs/api/java/util/Base64.html): Java library for Base64 encoding and decoding.

Feel free to contribute to the project by submitting bug reports, feature requests, or pull requests. Enjoy parsing anime achievement timings with ease!

