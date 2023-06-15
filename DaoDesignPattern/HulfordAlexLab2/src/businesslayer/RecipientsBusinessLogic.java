/*
Student Name: Alex Hulford
Student Number: 041066068
Course & Section #: 22S_CST8288_014
Declaration:
This is my own original work and is free from Plagiarism.
*/
package businesslayer;

import dataaccesslayer.RecipientsDao;
import dataaccesslayer.RecipientsDaoImpl;
import java.util.List;
import transferobjects.RecipientsDTO;

/**
 * The business logic class for managing recipients.
 * @author Alex Hulford
 */
public class RecipientsBusinessLogic {
    
    
    private RecipientsDao recipientsDao = null;
    
    /**
     * Constructs a new instance of RecipientsBusinessLogic and initializes the recipientsDao.
     */
    public RecipientsBusinessLogic() {
        recipientsDao = new RecipientsDaoImpl();
    }
    /**
     * Retrieves a list of all recipients.
     * @return a list of RecipientsDTO objects representing the recipients
     */
    public List<RecipientsDTO> getAllRecipients(){
        return recipientsDao.getAllRecipients();
    }
    /**
     * Retrieves a recipient based on the award ID.
     * @param awardID the award ID of the recipient to retrieve
     * @return the RecipientsDTO object representing the recipient
     */
    public RecipientsDTO getRecipientbyAwardID(Integer awardID){
        return recipientsDao.getRecipientByAwardId(awardID);
    }
    /**
     * Creates a new recipient.
     * @param recipient the RecipientsDTO object representing the recipient to create
     */
    public void create(RecipientsDTO recipient){
        recipientsDao.create(recipient);  
    }
    /**
     * Updates an existing recipient.
     * @param recipient the RecipientsDTO object representing the recipient to update
     */
    public void update(RecipientsDTO recipient){
        recipientsDao.update(recipient);
    }
    /**
     * Deletes a recipient.
     * @param recipient the RecipientsDTO object representing the recipient to delete
     */
    public void delete(RecipientsDTO recipient){
        recipientsDao.delete(recipient);
    }
    /**
     * Prints the metadata of the recipients.
     */
    public void printMetaData(){
        recipientsDao.printMetaData();
    }
}
