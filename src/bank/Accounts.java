/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author saimh
 */
public class Accounts {
    private String name;
    private String fatherName;
    private int age;
    private boolean isMarried;
    private String spouseName;
    private String address;
    private String zipcode;
    private String contact;
    private String accountNo;
    private String email;
    private String password;
    ArrayList<Accounts> accountList = new ArrayList<Accounts>();
    
    public void populateAccountList(){
        try{
            FileInputStream file = new FileInputStream("accountsList.dat");
            ObjectInputStream fileInput = new ObjectInputStream(file);
            boolean endOfFile = false;
            while(!endOfFile){
                try{
                    accountList.add((Accounts) fileInput.readObject());
                }catch(EOFException e){
                    endOfFile = true;
                }catch(Exception j){
                    JOptionPane.showMessageDialog(null, j.getMessage());
                }
            }
            fileInput.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
    
    public void saveToFile(){
        try{
            FileOutputStream file = new FileOutputStream("accountsList.dat");
            ObjectOutputStream fileOutput = new ObjectOutputStream(file);
            
            for(int i=0; i<accountList.size(); i++){
                fileOutput.writeObject(accountList.get(i));
            }
            fileOutput.close();
            JOptionPane.showMessageDialog(null, "Successfully Saved!");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public Accounts(String name, String fatherName, int age, boolean isMarried, String spouseName, String address, String zipcode, String contact, String accountNo, String email, String password) {
        this.name = name;
        this.fatherName = fatherName;
        this.age = age;
        this.isMarried = isMarried;
        this.spouseName = spouseName;
        this.address = address;
        this.zipcode = zipcode;
        this.contact = contact;
        this.accountNo = accountNo;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Accounts> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Accounts> accountList) {
        this.accountList = accountList;
    }

    
}
