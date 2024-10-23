# CalculatorJava

CalculatorJava is a simple command-line calculator application written in Java. It allows users to perform various mathematical operations such as addition, subtraction, multiplication, division, root extraction, exponentiation, and modulus operations.

## Features

- Addition
- Subtraction
- Multiplication
- Division

## How to Use

1. **Enter the First Number:**
   The program prompts you to enter the first number and press Enter.

      Result screen: // Enter the 1st digit then press Enter


2. **Choose an Operation:**
After entering the first number, you can choose an operation by entering the corresponding number and pressing Enter.

      I. Addition II. Subtraction III. Multiplication
      IV. Division 0. To exit


3. **Enter the Second Number:**
The program then prompts you to enter the second number and press Enter.

      Result screen: // Enter the 2nd number then press Enter


4. **View the Result:**
The program displays the result of the operation on the screen.

   Result screen: // Displays the result


## Code Structure

### `CalcScreen.java`

Handles the main interaction with the user and the flow of the calculator operations.

### `Calculator.java`

Contains the methods for performing various mathematical operations.

### `DigitController.java`

Validates user input and removes trailing zeros from decimal numbers.

### `Menu.java`

Displays various menus and messages to the user.

### `OptionController.java`

Validates the operation choices made by the user.

## Running the Application

To run the application, compile all the Java files and execute the `Main` class. Ensure you have Java installed on your system.

```bash
javac -d bin src/se/meteTurkan/calculatorJava/*.java
java -cp bin se.meteTurkan.calculatorJava.Main
```

### License
This project is licensed under the MIT License.
