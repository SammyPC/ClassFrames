package com.company;
/**
 * Employee Class -
 * This superclass tracks and contains methods for
 * various attributes related to business employees
 */

public class Employee extends Person {
    private int employeeID;
    private String email;
    private String phoneNumber;

    /**
     * This method generates an empty Employee object
     */
    public Employee()
    {
    } // end no-Arg Constructor

    /**
     * This method generates an empty Person object and accpets arguments for the
     * employee's ID, email address, and phone number
     * @param id The integer value for the Employee ID
     * @param emailAddress The email address of the employee
     * @param phone The phone number of the employee
     */
    public Employee( int id, String emailAddress, String phone )
    {
        setEmployeeID( id );
        setEmail( emailAddress );
        setPhoneNumber( phone );
    } //end three arg Employee constructor

    /**
     * This method sets the value for the hours flown by the pilot
     * @param id The integer value for the Employee's ID number
     */
    public void setEmployeeID( int id )
    {
        employeeID = id;
    } // end method setEmployeeID

    /**
     * This method gets the double value stored for the number of hours flown
     * @return The current value for the Employee's ID number
     */
    public int getEmployeeID()
    {
        return employeeID;
    } // end method get employee ID

    /**
     * This method sets the value for the hours flown by the pilot
     * @param emailAddress The current employee's email address
     */
    public void setEmail( String emailAddress )
    {
        email = emailAddress;
    } // end method setEmail

    /**
     * This method gets the double value stored for the number of hours flown
     * @return The current value for the employee's email address
     */
    public String getEmail()
    {
        return email;
    } // end method getEmail

    /**
     * This method sets the value for the hours flown by the pilot
     * @param phone The current value for the employee's phone number
     */
    public void setPhoneNumber( String phone )
    {
        phoneNumber = phone;
    } // end method setPhoneNumber

    /**
     * This method gets the double value stored for the number of hours flown
     * @return The current value for the employee's phone number
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    } // end method getPhoneNumber

    /**
     * This method returns the current state of the Pilot Object as a string
     * @return String containing the values for the Pilot object
     */
    public String toString() {
        String item = "";

        item = item + "Employee ID: " + employeeID + '\n';
        item = item + super.toString();
        item = item + "Email: " + email + '\n';
        item = item + "Phone: " + phoneNumber + '\n';
        item = item + "Employee ID: " + employeeID + '\n';
        return item;
    }

    /**
     * Can compare two instances of employee ids and will return a ranking based on ID
     * value
     * @param e The ID of the employee you would like to compare to
     * @return This returns a 1 if the employeeID is greater than, a -1 if it is less than,
     * and a 0 otherwise
     */
    public int compareTo(Employee e)
    {
        if (employeeID > e.employeeID)
            return 1;
        else
        if (employeeID < e.employeeID)
            return -1;
        else
            return 0;
    }

    /**
     * Can compare two instances of employee ids and check if one already exists
     * @param e The Employee ID you wish to check
     * @return This returns TRUE if the IDs are a match and FALSE if not
     */
    public boolean equals(Employee e)
    {
        return (employeeID == e.employeeID);
    }

} //end employee class
