package edu.redbasin.so.model;

/**
 * @author Rohan
 * 
 * Class Person.
 * Contains the general attributes a person should have.
 * 
 * Fields:
 * -> name: String
 * -> isMale: boolean
 * -> phone: String
 * -> zipCode: String
 * -> address: String
 * Methods:
 * -> getIsMale(): boolean
 *   -> Accessor for isMale
 * -> getIsAdult(): boolean
 *   -> Accessor for isAdult
 * -> getPhone(): String
 *   -> Get phone
 * -> getZipCode(): String
 *   -> Get zipCode
 * -> getAddress(): String
 *   -> Get address
 * -> setPhone(String phone)
 *   -> Set phone
 * -> setZipCode(String zipCode)
 *   -> Set zipCode
 * -> setAddress(String address)
 *   -> Set address
 */
public class Person {
    // Fields:
    private final String name;
    private final boolean isMale;
    private String phone;
    private String zipCode;
    private String address;
    private final boolean isAdult;
    // Constructor:
    protected Person(String name, boolean isMale, boolean isAdult) {
        this.name = name;
        this.isMale = isMale;
        this.isAdult = isAdult;
    }
    // Accessors:
    public boolean getIsMale() { return isMale; }
    public boolean getIsAdult() { return isAdult; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getZipCode() { return zipCode; }
    // Mutators:
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
}
