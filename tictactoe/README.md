
# Tic-Tac-Toe Game

## Description

This is a simple implementation of the classic Tic-Tac-Toe game, built using Java with a graphical user interface (GUI) based on Swing. The game allows two players to take turns playing on a 3x3 grid, with 'X' and 'O' as the two possible markers. The game includes logic for validating moves, detecting winners, and handling draws.

### Features:
- **2-player gameplay**: The game alternates between two players ('X' and 'O').
- **Move validation**: Ensures that players cannot make invalid moves, such as playing out of bounds or on an already occupied cell.
- **Winner detection**: Automatically checks for a winner after each move, checking rows, columns, and diagonals.
- **Game reset**: After a game ends (either a win or a draw), the board resets for a new round.
- **Error handling**: Displays error messages (pop-ups) when a player attempts an invalid move (e.g., selecting an occupied cell or out-of-bounds move).
  
## Technologies Used:
- **Java**: The main programming language used for game logic and UI.
- **Swing**: Used for creating the graphical user interface (GUI).
- **JUnit**: Used for unit testing the game logic.

## How to Play:
1. Run the `TicTacToeGUI` class to launch the game window.
2. Players take turns clicking on the grid to place their respective marks ('X' or 'O').
3. The game checks after every move for a winner or a draw.
4. If a player wins, a message will pop up with the winner's name. The board will reset automatically for another round.

## Running the Game:
To run the Tic-Tac-Toe game, you need to have Java installed on your computer. Follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/tictactoegame.git
   ```

2. Navigate to the project directory:
   ```bash
   cd tictactoegame
   ```

3. Compile and run the game:
   ```bash
   javac TicTacToeGUI.java TicTacToe.java
   java TicTacToeGUI
   ```

## Tests:
The project includes unit tests using JUnit to ensure the game logic works as expected. Tests cover scenarios like invalid moves, alternating players, and checking for winners.

To run the tests:
1. Compile the tests:
   ```bash
   javac -cp .:junit-4.13.2.jar TicTacToeTest.java
   ```

2. Run the tests:
   ```bash
   java -cp .:junit-4.13.2.jar org.junit.runner.JUnitCore TicTacToeTest
   ```

## License:
This project is open source and available under the MIT License.
