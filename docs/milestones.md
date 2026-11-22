# 22 November 2026

1. Created the github repo.
2. Created folders src and docs.
3. Added the options 1 (start new game), 2 (exit) to Main.java
4. Created class ResultStore in ResultStore.java
5. Declared and initialized private variables in Expedition.java and created public Expedition()
6. Wrote the milestones.txt file.

# Known problems:
1. If the user inputs ' 1' instead of '1' the program doesn't understand that the player actually wants to start a new game.

# A Design decision:
1. I decided that in order to prevent crashing when the program asks the user to input 1 and 2, and the user gives a non-numerical input such as 'abc', I made the scanner get a string value since strings can hold numerical and string values.

# Assistance:
1. I googled how can i compare string values in an if block. (string.equals("1)) 
