/*
Student Name: Alex Hulford
Student Number: 041066068
Course & Section #: 22S_CST8288_014
Declaration:
This is my own original work and is free from Plagiarism.
*/
package dataaccesslayer;


import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import transferobjects.RecipientsDTO;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * DAO implementation class overrides all methods of the DAO interface and handles
 * data source related exceptions
 * @author Alex Hulford
 */
public class RecipientsDaoImpl implements RecipientsDao {

    /**
     * Retrieves a list of all recipients from the database.
     * @return the recipients
     */
    @Override
    public List<RecipientsDTO> getAllRecipients() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<RecipientsDTO> recipients = null;
        try{
            DataSource ds = new DataSource();
            conn = ds.createConnection();
            ps = conn.prepareStatement(
                "SELECT AwardID, Name, Year, City, Category FROM recipients ORDER BY AwardID");
            rs = ps.executeQuery();
            
            recipients = new ArrayList<>();
            while(rs.next()){
                    RecipientsDTO recipient = new RecipientsDTO();
                    recipient.setAwardID(rs.getInt("AwardID"));
                    recipient.setName(rs.getString("Name"));
                    recipient.setYear(rs.getInt("Year"));
                    recipient.setCity(rs.getString("City"));
                    recipient.setCategory(rs.getString("Category"));
                    recipients.add(recipient);
            }
            }
            catch(SQLException e){
            }
            finally{
                    try{ if(rs != null){ rs.close(); } }
                    catch(SQLException ex){System.out.println(ex.getMessage());}
                    try{ if(ps != null){ ps.close(); }}
                    catch(SQLException ex){System.out.println(ex.getMessage());}
                    try{ if(conn != null){ conn.close(); }}
                    catch(SQLException ex){System.out.println(ex.getMessage());}
            }
        return recipients;
    }

    /**
     * retrieves a recipient based on the awardID
     * @param awardID the primary key number from the database
     * @return one recipient that matches awardID
     */
    @Override
    public RecipientsDTO getRecipientByAwardId(Integer awardID) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        RecipientsDTO recipient = null;
        try{
            DataSource ds = new DataSource();
            conn = ds.createConnection();
            ps = conn.prepareStatement(
                "SELECT AwardID, Name, Year, City, Category FROM recipients WHERE AwardID = ?");
            ps.setInt(1, awardID);
            rs = ps.executeQuery();
            while(rs.next()){
                recipient = new RecipientsDTO();
                recipient.setAwardID(rs.getInt("AwardID"));
                recipient.setName(rs.getString("Name"));
                recipient.setYear(rs.getInt("Year"));
                recipient.setCity(rs.getString("City"));
                recipient.setCategory(rs.getString("Category"));
            }
        }
        catch(SQLException e){
        }
        finally{
            try{ if(rs != null){ rs.close(); } }
            catch(SQLException ex){System.out.println(ex.getMessage());}
            try{ if(ps != null){ ps.close(); }}
            catch(SQLException ex){System.out.println(ex.getMessage());}
            try{ if(conn != null){ conn.close(); }}
            catch(SQLException ex){System.out.println(ex.getMessage());}
        }
        return recipient;
    }

    /**
     * create one entry in the recipients database
     * @param recipient a recipient to be entered into the database
     */
    @Override
    public void create(RecipientsDTO recipient) {
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            DataSource ds = new DataSource();
            conn = ds.createConnection();
            ps = conn.prepareStatement(
                    "INSERT INTO Recipients (Name, Year, City, Category) " +
                    "VALUES(?, ?, ?, ?)");
            ps.setString(1, recipient.getName());
            ps.setInt(2, recipient.getYear());
            ps.setString(3, recipient.getCity());
            ps.setString(4, recipient.getCategory());
            ps.executeUpdate();
        }
        catch(SQLException e){
        }
        finally{
            try{ if(ps != null){ ps.close(); }}
            catch(SQLException ex){System.out.println(ex.getMessage());}
            try{ if(conn != null){ conn.close(); }}
            catch(SQLException ex){System.out.println(ex.getMessage());}
        }
    }

    /**
     * update a recipient entry in the database
     * @param recipient the recipient to be updated selected by awardID
     */
    @Override
    public void update(RecipientsDTO recipient) {
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            DataSource ds = new DataSource();
            conn = ds.createConnection();
            ps = conn.prepareStatement(
                        "UPDATE Recipients SET Name = ?, " + 
                        "Year = ?, City = ?, Category = ? WHERE AwardID = ?");
            ps.setString(1, recipient.getName());
            ps.setInt(2, recipient.getYear());	
            ps.setString(3, recipient.getCity());
            ps.setString(4, recipient.getCategory());
            ps.setInt(5, recipient.getAwardID());
            ps.executeUpdate();
        }
        catch(SQLException e){
        }
        finally{
            try{ if(ps != null){ ps.close(); }}
            catch(SQLException ex){System.out.println(ex.getMessage());}
            try{ if(conn != null){ conn.close(); }}
            catch(SQLException ex){System.out.println(ex.getMessage());}
        }
    }

    /**
     * delete a recipient from the database
     * @param recipient the recipient to be deleted based on awardID
     */
    @Override
    public void delete(RecipientsDTO recipient) {
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            DataSource ds = new DataSource();
            conn = ds.createConnection();
            ps = conn.prepareStatement(
                            "DELETE FROM Recipients WHERE AwardID = ?");	
            ps.setInt(1, recipient.getAwardID());
            ps.executeUpdate();
        }
        catch(SQLException e){
        }
        finally{
            try{ if(ps != null){ ps.close(); }}
            catch(SQLException ex){System.out.println(ex.getMessage());}
            try{ if(conn != null){ conn.close(); }}
            catch(SQLException ex){System.out.println(ex.getMessage());}
        }
    }
    
    /**
     * method to print the metadata of the database table
     */
    public void printMetaData() {
        
        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            DataSource ds = new DataSource();
            conn = ds.createConnection();
            ps = conn.prepareStatement(
                "SELECT * FROM recipients");
            rs = ps.executeQuery();
           java.sql.ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                String columnType = metaData.getColumnTypeName(i);
                String columnJavaClass = metaData.getColumnClassName(i);

                System.out.printf("Column " + i + ": %s Datatype: %s  Java Class: %s%n",
                        columnName, columnType, columnJavaClass);
                System.out.println();
            } 
        }
        catch(SQLException e){}
        
    }
    
}
