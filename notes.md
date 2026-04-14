# Truffula Notes
As part of Wave 0, please fill out notes for each of the below files. They are in the order I recommend you go through them. A few bullet points for each file is enough. You don't need to have a perfect understanding of everything, but you should work to gain an idea of how the project is structured and what you'll need to implement. Note that there are programming techniques used here that we have not covered in class! You will need to do some light research around things like enums and and `java.io.File`.

PLEASE MAKE FREQUENT COMMITS AS YOU FILL OUT THIS FILE.

## App.java
 - Appears to be the "MAIN" file of the project.
 - Connects the classes together by being responsible of object creation and calling the required methods to perform the desired task by the user.
## ConsoleColor.java
 - Establishes an enum class to represent an ANSI code for the console.
 - Each enum represents a code assigned to it made in the class intended to be used when the console prints in color.
 - Method of doing so is appending the needed code prior to the text then the reset after the text.
## ColorPrinter.java / ColorPrinterTest.java
 - This class represents an object that gets sets the color of the text.
 - It is also responsible for printing when the method is called, the method automatically resets.
 - Test checks for a message in red.
## TruffulaOptions.java / TruffulaOptionsTest.java
 - This class is the configuration object for the program, given the desired options the class will alter boolean values within itself and represent the configuration.
 - When the command is run this will act as what reads the user options that are passed and changed accordingly.
 - Tests create a directory and test a configuration of the program.
## TruffulaPrinter.java / TruffulaPrinterTest.java
 - Truffula printer is responsible for linking the previous classes together and executing functions required for the app to work.
 - Objects like TruffuluaOptions are created along with the colors and Printer object for outputting the command.
 - Tests aim to build a directory to be explored and will check if the output is the expected structure.
## AlphabeticalFileSorter.java
 - App description is quite accurate to its function, "Utility class for sorting an array of files alphabetically by name" Beyond that, the syntax is somewhat foreign to me, but somewhat familiar from somethign like JS.