package edu.acc.j2ee.hubbub;

import java.time.LocalDate;

public class User implements java.io.Serializable {
    private String username;
    private char[] password;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate joinDate;

    public User(String username, char[] password) {
        this.username = username;
        this.password = password;
        this.joinDate = LocalDate.now();
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + 
                password.toString() + ", firstName=" + firstName +
                ", lastName=" + lastName + ", email=" + email +
                ", joinDate=" + joinDate + '}';
    }
    
    

}
