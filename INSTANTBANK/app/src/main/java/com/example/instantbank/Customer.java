package com.example.instantbank;

public class Customer {
    // To try and store in database
    private String firstName;
    private String lastName;
    private Integer phoneNumber;
    private Integer idNumber;
    private Integer accountNumber;



    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    /*The end of the firebase trial
                                        /* Declaring and initializing a variable person1 */
           /* person1 is an array with a length of 8
           /* person1 mainly stores String as the datatype */
    String [] person1 = new String[8];

    /* Creating a method called customerDataNames which will be collecting the customer's firstname,
    lastname and phone number. This data is then sent to the respective indexes of the array person1 */
    public void customerDataNames (String firstName, String lastName, String phoneNumber) {
        person1[0] = firstName;
        person1[1] = lastName;
        person1[2] = phoneNumber;
    }

    // Doing the same here but the difference being we're actually using a method overload
    public void customerDataNames (String id, String gender, String dOB, String age) {
        person1[3] = id;
        person1[4] = gender;
        person1[5] = dOB;
        person1[6] = age;
    }

    // Same as here, we're using a method overload with one parameter
    public void customerDataNames (String accountNumber) {
        person1[7] = accountNumber;
    }
}
