## CS 474 HomeWork3
### By Unaiza Faiz(651052450)

This assignment checks if the RMI Framework holds the referential integrity property. 

Steps to run the Program:
1. Clone the project 
2. Open 2 terminals and navigate to the project folder 

`` cd <path_to_ /unaiza_faiz_hw3``

3. Run the following command in both the terminals:

`` sbt clean compile run ``

4. When prompted to select the main class, enter the number corresponding to "Server" [2]
5. Wait for the message "Server started"
6. In the second terminal, when prompted by sbt to select class enter the number corresponding to "Client" class

The output for client must show "response: true" if the objects passed as parameters in RMI have the same reference in client side and thus showing that they maintain same reference when passed to server too. 

On the server terminal we can view the output for change in field variables before and after for both objects. 

