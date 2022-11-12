# Bank_Management_System
Built a Bank Management System GUI application to help the admin store various data such as new Customer bank account details like account number,pin,transaction history like deposit and withdrawls. -Added functionality for user to create new bank account,withdraw/deposit money through a complete ATM look-a-like GUI. -Used mysql database to store/fetch data entered into the GUI.

Used mysql JDBC driver library to connect the library : JDBC drivers are Java library files with the extension .jar used by all Java applications to connect to the database. Usually, they are provided by the same company which implemented the MySql software. DbSchema Tool already includes an MySql driver, which is automatically downloaded when you connect to MySql.

rs2xml.jar library to fetch the data from database

![Screenshot (66)](https://user-images.githubusercontent.com/102048152/201469663-b897cadf-abd5-42d2-92b2-c87b4134a86d.png)
login page



![Screenshot (67)](https://user-images.githubusercontent.com/102048152/201469716-762bcaf0-fd06-4dee-8faa-460764940f03.png)
transactions

![Screenshot (68)](https://user-images.githubusercontent.com/102048152/201469725-022619c6-f3d8-4d0e-bcae-a6d4a22147eb.png)
deposit

![Screenshot (69)](https://user-images.githubusercontent.com/102048152/201469731-e5fc61ff-c618-4f75-8fc9-136d8dd540cb.png)
withdrwal

![Screenshot (70)](https://user-images.githubusercontent.com/102048152/201469737-bf8fda6b-7706-46fb-934a-62d91cdfe47a.png)
balance

![Screenshot (71)](https://user-images.githubusercontent.com/102048152/201469740-1d5f1b79-1315-4e0f-93ee-5dde409abeef.png)
application form

![Screenshot (72)](https://user-images.githubusercontent.com/102048152/201469742-fd35f7ee-0172-44ed-8dd8-f23964d983bd.png)
new account details

# About The Project
SignUp Page: In this new customer has to fill the personal,professional details such as name,father's name,DOB,maritial status etc. without filling each details customer cannot got further in this process.On successfull submission of the form customer will be given account number,debit card number,and 4 digit pin all of which will be auto generated.

Login Page: In this existing customer will have to put debit card number and correct pin to login to his/her account where they will get a complete ATM like experience stating from withdrawl,fast cash,deposit. If withdrawl amount becomes greater than balance it will show insufficient balance. He/She will get option to change pin also.


# MySQL
MySQL is a database management system that is used to maintain relational databases. It is an open-source software backed by Oracle Corporation. This was originally founded by a Swedish company called MYSQL AB which was later acquired by sun microsystems and finally is with Oracle Corporation. As it is an open-source database system, the source code can be modified according to our needs. It also offers premium services if a commercial license is purchased from Oracle Corporation. MySQL is a scalable, fast, and reliable database management system which can run on any platform like Windows, Unix, Linux, etc., and can be installed on the desktop or any server machine.

# JAVA SWING and AWT
AWT and Swing are used to develop window-based applications in Java. Awt is an abstract window toolkit that provides various component classes like Label, Button, TextField, etc., to show window components on the screen. All these classes are part of the Java.awt package.

On the other hand, Swing is the part of JFC (Java Foundation Classes) built on the top of AWT and written entirely in Java . The javax.swing API provides all the component classes like JButton, JTextField, JCheckbox, JMenu, etc.

The components of Swing are platform-independent, i.e., swing doesn't depend on the operating system to show the components. Also, the Swing's components are lightweight.

# Conclusion
By now I’m sure you understand exactly how to Make a connection with database and how we can store and update the Information and also learned java swing and awt and help of that how can we make a beautiful GUL,I hope y’all enjoyed reading this article as much as I enjoyed writing it!
