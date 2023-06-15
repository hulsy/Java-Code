/*
Student Name: Alex Hulford
Student Number: 041066068
Course & Section #: 22S_CST8288_014
Declaration:
This is my own original work and is free from Plagiarism.
*/
package dataaccesslayer;

import java.util.List;
import transferobjects.RecipientsDTO;

/**
 * Data access object interface that will be implemented by a concrete DAO class.
 * @author Alex Hulford
 */
public interface RecipientsDao {
    /**
     * retrieves a list of recipients
     * @return list of recipients
     */
    List<RecipientsDTO> getAllRecipients();
    
    /**
     * retrieves a recipient by their award ID
     * @param awardID the award ID of the recipient to be retrieved
     * @return a recipient
     */
    RecipientsDTO getRecipientByAwardId(Integer awardID);
    
    /**
     * creates an entry in the recipients table
     * @param recipient a recipient to be entered
     */
    void create(RecipientsDTO recipient);
    /**
     * update a recipient in the table
     * @param recipient the recipient to be updated
     */
    void update(RecipientsDTO recipient);
    
    /**
     * delete a recipient from the table
     * @param recipient the recipient to be deleted
     */
    void delete(RecipientsDTO recipient);
    /**
     * print the metadata of the database table
     */
    void printMetaData();
}
