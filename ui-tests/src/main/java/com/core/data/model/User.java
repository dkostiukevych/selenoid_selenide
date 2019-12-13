package com.core.data.model;

@SuppressWarnings("JavadocType")
public class User {

    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return "User: [" 
                + "firstName='" + firstName + '\'' 
                + ", lastName='" + lastName + '\'' 
                + ", email='" + email + '\'' + ']';
    }
}
