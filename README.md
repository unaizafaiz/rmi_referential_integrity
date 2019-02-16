## CS 474 HomeWork3
### By Unaiza Faiz(651052450)

This assignment checks if the RMI Framework holds the referential integrity property. 

Steps to run the Program:

	- Clone the project 
	- Open 2 terminals and navigate to the project folder 
`` cd <path/to/unaiza_faiz_hw3>``


	- Run the following command in both the terminals:
`` sbt clean compile run ``	



	- When prompted to select the main class, enter the number corresponding to "Server" [2]
	- Wait for the message "Server started"
	- In the second terminal, when prompted by sbt to select class enter the number corresponding to "Client" class

The output for client must show "response: true" if the objects passed as parameters in RMI have the same reference in client side and thus showing that they maintain same reference when passed to server too. 

On the server terminal we can view the output for change in field variables before and after for both objects. 

