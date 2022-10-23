/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.aed.backend;

import java.util.ArrayList;

/**
 *
 * @author tarush
 */
public class FirstAssignment {
    private String Name;
    private String EmployeeID;
    private String Age;
    private String Gender;
    private String StartDate;
    private String Level;
    private String Team;
    private String Position;
    private String PhoneNumber;
    private String Email;
    private String Path;
    private ArrayList<String> errors = new ArrayList<>();

    public String getPath() {
        return Path;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        int i = Integer.parseInt(Age);
        if (i>18){
            this.Age = Age;
        }else {
            this.errors.add("Age of the employee must be greater than 18.");
        }
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        if (Gender != null && !Gender.trim().isEmpty()){
            this.Gender = Gender;            
        }else{
            this.errors.add("Gender is not selected. Please specify."); 
        }
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        if (StartDate == null && StartDate.trim().isEmpty()){
            this.errors.add("Start date is empty. Please select a start date.");
        }else{
            this.StartDate = StartDate;
        }
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String Team) {
        this.Team = Team;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        if (PhoneNumber.length() <= 12 && PhoneNumber.length()>=10){
            this.PhoneNumber = PhoneNumber;
        }else{
            this.errors.add("Phone number needs to be 10-12 digist long. Please verify.");
        }
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        if (Email.contains("@")||Email.endsWith(".com")){
            this.Email = Email;
        }else{
            this.errors.add("Email seems to be incomplete or incorrect. Please verify.");
        }
    }
}
