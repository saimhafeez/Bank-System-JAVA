/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author saimh
 */
public class Accounts {
    private String name;
    private String fatherName;
    private boolean isMarried;
    private String wifeName;
    private String address;
    private int zipcode;
    private String cnic;
    private String accountNo;

    public Accounts(String name, String fatherName, boolean isMarried, String wifeName, String address, int zipcode, String cnic, String accountNo) {
        this.name = name;
        this.fatherName = fatherName;
        this.isMarried = isMarried;
        this.wifeName = wifeName;
        this.address = address;
        this.zipcode = zipcode;
        this.cnic = cnic;
        this.accountNo = accountNo;
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

    public boolean isIsMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }    
    
}
