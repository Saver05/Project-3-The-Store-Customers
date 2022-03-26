/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3jackframbes;

import java.lang.StringIndexOutOfBoundsException;

/**
 *
 * @author jfram
 */
public class Customer {

    private String name; // for purposes of this project, first name 
    private String studentID;
    private String email;
    private boolean validID;
    private boolean validEmail;

    /**
     * Constructor for customer class defines everything and assumes Id and
     * Email are true
     *
     * @param n name
     * @param sID studentID
     * @param e email
     */
    public Customer(String n, String sID, String e) {
        name = n;
        studentID = sID;
        email = e;
        validID = checkID(sID);
        validEmail = true;
    }

    /**
     * Returns name of the customer
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the studentID of the customer
     *
     * @return studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * Returns the masked student ID
     *
     * @return masked
     */
    public String getMaskedStudentID() {
        int length = studentID.length();
        String subID = studentID.substring(length - 2);
        String masked = "*****" + subID;
        return masked;
    }

    /**
     * Returns the email of the customer
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns whether the Id of the customer is valid
     *
     * @return validID
     */
    public boolean isIDValid() {
        return validID;
    }

    /**
     * Returns whether the email of the customer is valid
     *
     * @return validEmail
     */
    public boolean isEmailValid() {
        return validEmail;
    }

    /**
     * toString method to return all available information about the customer
     *
     * @return all information on customer
     */
    public String toString() {
        String vaID;
        String vaE;
        if (validID) {
            vaID = "Valid";
        } else {
            vaID = "Invalid";
        }
        if (validEmail) {
            vaE = "Valid";
        } else {
            vaE = "Invalid";
        }
        return name + " " + getMaskedStudentID() + " " + email + " ID: " + vaID + " Email: " + vaE;
    }

    /**
     * checkID checks the ID against the specifications to make sure it is valid
     *
     * @param id String id
     * @return true if the id is valid false if it is not
     */
    private static boolean checkID(String id) {
        try //try catch statement for when the id is less then 9 characters
        {
            for (int i = 0; i < 9; i++) //iterate through the id
            {
                char c = id.charAt(i); //get the character at a certain position
                if (Character.isDigit(c)) //check to make sure it is a digit
                {
                    int number = Character.getNumericValue(c);
                    if (i < 3) //if it on the first three numbers
                    {
                        if (number != 0) //checks to make sure they are zero
                        {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            return true; //if it passes all conditions returns true
        } catch (StringIndexOutOfBoundsException e) //if the ID is to short catches the error and returns false
        {
            return false;
        }
    }
}
