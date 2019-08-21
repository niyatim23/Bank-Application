# Bank-Application
1. It is a desktop application for bank system with basic functionalities like “Add account”, “Remove Account”, “Deposit” and “Withdrawal”. It uses a tabular format to display the data. Here except “Add account”, the other functionalities are accessible to the user only when a row is selected from the table of data.
    - Add account: It expects the users to enter their first name, last name, unique identity number (xxx-xxx-xxxx format), initial deposit and account type. The main application cannot be used unless this dialog box is closed. On addition of a new account, it is displayed in the table.
    - Remove account: It removes the selected account from the table.
	- Deposit: It adds certain amount specified by the user to the account balance of the selected account.
    - Withdrawal:  It withdraws a particular amount only if sufficient funds are available in the selected account. Else it displays an error message.
2. Double clicking on any row from the table displays data about that user in a new dialog box.
3. It allows the user to save, open, save as files with “.bof (Bank Object File)” extension. If the user tries to open a file of any other type with this application, it notifies the user that the file format is not supported. 
4. Shortcut keys are provided for operations like Open (Ctrl+O),  Save(Ctrl+S), Save As(Ctrl+Shift+S), Exit(Ctrl+E) as in Windows OS.
5.The user can sort the data in the table in ascending as well as descending order as per the first name, last name, balance and account number by clicking on the headings of the specific fields.
6. Swing classes in Java are used to create the GUI.
