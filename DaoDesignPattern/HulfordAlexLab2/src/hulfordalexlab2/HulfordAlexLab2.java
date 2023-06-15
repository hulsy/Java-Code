/*
Student Name: Alex Hulford
Student Number: 041066068
Course & Section #: 22S_CST8288_014
Declaration:
This is my own original work and is free from Plagiarism.
*/
package hulfordalexlab2;

import businesslayer.RecipientsBusinessLogic;
import java.util.List;
import transferobjects.RecipientsDTO;

/**
 * The testing class for the program.
 * @author Alex Hulford
 */
public class HulfordAlexLab2 {

    /**
     * The entry point for the main method of this program.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
           RecipientsBusinessLogic logic = new RecipientsBusinessLogic();
           List<RecipientsDTO> list = null;
           RecipientsDTO recipient = null;
           
           System.out.println("Printing Recipients");
           System.out.println();
           list = logic.getAllRecipients();
           printRecipients(list);
           
           System.out.println("Inserting One Recipient");
           System.out.println();

           recipient = new RecipientsDTO();
           recipient.setName("Alex Hulford");
           recipient.setYear(2023);
           recipient.setCity("Ottawa");
           recipient.setCategory("Golf Champ");
           logic.create(recipient);
           list = logic.getAllRecipients();
           printRecipients(list);
                        
           System.out.println("Deleting last author");
           System.out.println();

           recipient = list.get(list.size() - 1);
           logic.delete(recipient);
           list = logic.getAllRecipients();
           printRecipients(list);
           
           logic.printMetaData();
                        
    }
    /**
     * prints all recipients from database
     * @param recipients list of recipients to be printed
     */
    private static void printRecipients(List<RecipientsDTO> recipients) {
        for(RecipientsDTO recipient : recipients){
            printRecipient(recipient);
        }
        System.out.println();
    }

    /**
     * print one recipient
     * @param recipient the recipient to be printed
     */
    private static void printRecipient(RecipientsDTO recipient) {
        String output = String.format("%d, %s, %d, %s, %s", 
	    			recipient.getAwardID(),
	    			recipient.getName(),
	    			recipient.getYear(),
                                recipient.getCity(),
                                recipient.getCategory());
	    	System.out.println(output);
    }
    
}
