/*
Student Name: Alex Hulford
Student Number: 041066068
Course & Section #: 22S_CST8288_014
Declaration:
This is my own original work and is free from Plagiarism.
*/
package transferobjects;

import java.io.Serializable;

/**
 * Data Transfer Object for encapsulating data and providing methods for exchanging data between
 * the business and persistence layers.
 * @author Alex Hulford
 */
public class RecipientsDTO implements Serializable{
    private Integer awardID;
    private String name;
    private Integer year;
    private String city;
    private String category;

    /**
     * retrieves the award ID of the recipient
     * @return the awardID
     */
    public int getAwardID() {
        return awardID;
    }
    /**
     * Sets the award ID of the recipient
     * @param awardID of recipient
     */
    public void setAwardID(Integer awardID) {
        this.awardID = awardID;
    }
    
    /**
     * gets the name of the recipient
     * @return name of recipient
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name of the recipient
     * @param name of recipient 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets the city of the recipient
     * @return city recipient received the award in
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of the recipient
     * @param city the award was received in
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the year the recipient received the award
     * @return the year the award was received
     */
    public int getYear() {
        return year;
    }
    /**
     * Sets the year the recipient received award
     * @param year the award was received
     */
    public void setYear(Integer year) {
        this.year = year;
    }
    /**
     * gets the category of the award
     * @return category of the award 
     */
    public String getCategory() {
        return category;
    }
    /**
     * Sets the category of the award 
     * @param category of the award 
     */
    public void setCategory(String category) {
        this.category = category;
    }

    
}
