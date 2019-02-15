## CS 474 HomeWork3
### By Unaiza Faiz(651052450)

This assignment checks if the RMI Framework holds the referential integrity property. 

Steps to run the Program:
1. Clone the project 
2. Open 2 terminals and navigate to the project folder an
3. Run the following command in both the terminals:

`` sbt clean compile run ``

3. When prompted to select the main class to run enter the number corresponding to "Server" (2)
4. Wait for the message "Server started"
5. In the second terminal, select the number corresponding to "Client" class

The output for client must show "response: true" if the objects passed as parameters in RMI call have the same reference in client side and thus showing that they maintain same reference when passed to server too

