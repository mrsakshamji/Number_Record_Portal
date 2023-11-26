The provided Java code is a simple console-based application for a "Number Record Portal." It includes a menu system allowing users to record and display BigInteger numbers. Here's a summary:

Menu Design Class (MenuDesign):

Prints a welcome message and a menu with three options:
Option 1: Record numbers.
Option 2: Display a message indicating no data is available.
Option 3: Exit the program.
Main Class (MyMain):

Uses a Scanner for user input.
Displays the menu using the MDesign method from the MenuDesign class.
Reads the user's choice and uses a switch statement to handle different menu options.
Option 1: Record Data
Prompts the user for the number of numbers they want to save.
Accepts BigInteger input for each number.
Asks the user if they want to show the numbers or exit.
Displays the numbers if the user chooses to show them.
Option 2: Show Data
Displays a message indicating no data is available.
Asks the user if they want to save a new number or exit.
Accepts BigInteger input for the new number if the user chooses to save.
Asks the user if they want to show the numbers or exit.
Displays the numbers if the user chooses to show them.
Option 3: Exit
Displays a thank-you message.
