
# Tic-Tac-Toe - The Best Game
### Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them
Any of these given software you can Install.
```
Java Development Platforms
1. Intellij Idea (JetBrains)
2. Eclipse(Optional)
```

### Installing
[Intellij Idea Download](https://www.jetbrains.com/idea/download/)
  OR [Eclipse Download](https://www.eclipse.org/downloads/)
A step by step series of examples that tell you how to get a development env running

Say what the step will be
There are the given links you can follow these links and You can Install a environment for this Software.
End with an example of getting some data out of the system or using it for a little demo
### How to Open Project On Intellij Idea
```
Steps:
1. Clone this Project
2. Open Intellij On Computer
3. Click on "Get from Version Control"
4. Paste the link on opened Blank Space
5. Then Click 'Ok'   untill the project will not open.
6.Congrats!
```
### Explanations of this Project
This is a tic-tac Game where creating a multi-dimensional array 
and there is two players playing . First "X" and Second "O" . 
The co-ordinates that is enter by user first will point to column and
 second will point to row from bottom. While the player will win then 
it shows corresponding player win the game.
 The co-ordinates is between (1-3,1-3).
 ### Descriptions
 ```
Suppose the bottom left cell has the coordinates (1, 1) and the top right cell has the coordinates (3, 3) like in this table:
 
 (1, 3) (2, 3) (3, 3)
 (1, 2) (2, 2) (3, 2)
 (1, 1) (2, 1) (3, 1)
 
 The program should work in the following way:
 
 Get the 3x3 field from the input as in the previous stages,
 Output this 3x3 field with cells before the user's move,
 Then ask the user about his next move,
 Then the user should input 2 numbers that represent the cell on which user wants to make his X or O. (9 symbols representing the field would be on the first line and these 2 numbers would be on the second line of the user input),
 Then output the table including the user's most recent move.
 Do not delete code that checks for table state; it will be useful in the future.
 
 Note that in this stage user moves as X, not O. Keep in mind that the first coordinate goes from left to right and the second coordinate goes from bottom to top. Also, notice that coordinates start with 1 and can be 1, 2 or 3.
 
 But what if the user enters incorrect coordinates? The user could enter symbols instead of numbers or enter coordinates representing occupied cells. You need to prevent all of that by checking a user's input and catching possible exceptions.
 
 The program should also check user input. If the user input is unsuitable, the program should ask him to enter coordinates again. 
 
 So, you need to output a field from the first line of the input and then ask the user to enter a move. Keep asking until the user enters coordinate that represents an empty cell on the field and after that output the field with that move. You should output the field only 2 times - before the move and after a legal move.
```

## Running the tests
Description
Now it is time to make a working game!

In the last stage, make it so you can play a full game with a friend. First one of you moves as X, and then the other one moves as O.

You need to create a game loop. The game starts with empty cells and ends when someone wins or there is a draw. You need to output the final result after the end of the game.

Good luck gaming!


### And coding style tests

```
Example
The example below shows how your program should work.

---------
|       |
|       |
|       |
---------
Enter the coordinates: 2 2
---------
|       |
|   X   |
|       |
---------
Enter the coordinates: 2 2
This cell is occupied! Choose another one!
Enter the coordinates: two two
You should enter numbers!
Enter the coordinates: 1 4
Coordinates should be from 1 to 3!
Enter the coordinates: 1 3
---------
| O     |
|   X   |
|       |
---------
Enter the coordinates: 3 1
---------
| O     |
|   X   |
|     X |
---------
Enter the coordinates: 1 2
---------
| O     |
| O X   |
|     X |
---------
Enter the coordinates: 1 1
---------
| O     |
| O X   |
| X   X |
---------
Enter the coordinates: 3 2
---------
| O     |
| O X O |
| X   X |
---------
Enter the coordinates: 2 1
---------
| O     |
| O X O |
| X X X |
---------
X wins

```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With
* Project Initial Source -Hyperskills teams Platforms
* [Intellij Idea] Jetbrains Application Development Software
* Uploaded in Github (Open Source)

## Contributing
There is no any Contributors in this Application.
## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Om Narayan Sharma** - *Initial work* - [Github Profile](https://github.com/Omsharma456) - [Hyperskill Profile](https://hyperskill.org/profile/3784466)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

