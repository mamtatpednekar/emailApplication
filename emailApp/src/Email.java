import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String email;
    private String companySuffix = "ae.com";

    //Constructor to recieve firstname and lastname
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created successfully for " +this.firstName+" "+this.lastName);

        //Call a method asking for a department - return the department
        this.department = setDepartment();
        System.out.println("Department set to "+this.department);

        //Call a method that creates random password
        this.password = setPassword(defaultPasswordLength);
        System.out.println("Your password is "+this.password);

        //Combine elements to make an email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +department + "." +companySuffix;
        System.out.println("Your email is " +email);
    }

    //Ask for the department
    private String setDepartment(){
        System.out.println("Please enter the department\n 1.Sales\n 2.Development\n 3.Accounting\n 4.None of the above\n");
        Scanner input = new Scanner(System.in);
        int departmentNo = input.nextInt();
        if(departmentNo == 1)
            return "Sales";
        else if(departmentNo == 2)
            return "Development";
        else if(departmentNo ==3)
            return "Accounting";
        else
            return "None";
    }

    //Generate a random passcode
    private String setPassword(int length){
        String passwordSet = "587578876gvs*^%#@@$%fdhvdamvchjvhv####vdvffvdasb";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            int randCharacter = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(randCharacter);
        }
        return new String(password);
    }

    //Set  the mailbox capacity

    //Set the alternate email

    //Change the password
}
