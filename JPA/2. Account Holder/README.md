# AAccount Holder
 This web application uses EJBs( <em> JPA </em> ) to store info into a database
 
Using basic annotations and secondary tables.
Example
Create a web application that will perform part of the CRUD (Create Read Update Delete) operations on a list of bank account holders.
Specifically we want the appli-cation to be able to create, search and retrieve the list. 
An account holder has an id, full name, street, city, code, cell number, email address, balance, and crea-tion date attributes. 
The street, city and code attributes of each account holder must be kept in a table of its own called Address. 
The cell numbers and email addresses of account holders must be kept another secondary table called Con-tacts. 
The table below shows all the fields of an account holder and the applicable constraints for each field.