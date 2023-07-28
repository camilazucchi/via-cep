# Java Project: ViaCEP
Don't speak Portuguese? Click <a href="https://github.com/camilazucchi/ViaCEP/blob/main/README.md">here</a> to view this page in English.

The ViaCEP Project is a Java application that interacts with the public ViaCEP API to obtain detailed address information based on the ZIP code provided by the user. The project's goal is to learn about API consumption with Java.

## Features
- Enter a ZIP code and obtain address details, including street, neighborhood, city, and state. 
- Handle cases where the provided ZIP code is not found in the database and display appropriate error messages. 
- Use the Gson library to parse JSON responses from the ViaCEP API into Java objects. 
- Implement custom exceptions to handle specific errors and provide informative error messages.

## How to Get Started
To run the ViaCEP application, follow these steps:
1. Clone the repository to your local machine using the command:
```bash
git clone https://github.com/camilazucchi/ViaCEP
```
2. Open the project in your preferred Java development environment (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code).
3. Ensure that the Gson library (<a href="https://mvnrepository.com/artifact/com.google.code.gson/gson">com.google.code.gson</a>) is added to the project's classpath. If not, download the Gson JAR file and include it in the project.
4. Compile and execute the Main class to start the application.

## How to Use
1. Start the ViaCEP application. 
2. Enter a valid Brazilian ZIP code when prompted. 
3. The application will connect to the ViaCEP API, retrieve address details, and display them in a structured format. 
4. If the ZIP code is not found in the database, an appropriate error message will be displayed. 
5. The application will also generate a JSON file named "address.json" containing the address details for the provided ZIP code.

## Dependencies
The ViaCEP Project requires the following library:
- Gson (<a href="https://mvnrepository.com/artifact/com.google.code.gson/gson">com.google.code.gson</a>): A library for parsing JSON data into Java objects and vice versa.

## Contributions
Contributions to the ViaCEP Project are welcome. If you encounter any bugs, have suggestions for improvements, or want to add new features, feel free to open an issue or submit a pull request.

## License
This project is licensed under the MIT License - see the <a href="https://github.com/camilazucchi/ViaCEP/blob/main/LICENSE">LICENSE</a> file for details.

## Authors
- [@camilazucchi](https://github.com/camilazucchi)