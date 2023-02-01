
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
//import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;


@ManagedBean(name = "bean4")
@RequestScoped
public class accept1 {
 
      
    public void  accept(String id) {
        System.out.println("====================");
        System.out.println("gygh");
           System.out.println("=======================");
          Logger.getLogger(DataTable.class.getName()).log(Level.SEVERE, null, "something fromthe accept page");
//     try {
//         dbb bb=new dbb();
//         connection=bb.connMethod();
//         
//         PreparedStatement ps = connection.prepareStatement("UPDATE CUSTOMER SET STATUS=?, WHERE ID=?" );
//         ps.setString(8, "progress");
//         ps.executeUpdate();
//         
//         
//     } catch (SQLException ex) {
//         Logger.getLogger(accept1.class.getName()).log(Level.SEVERE, null, ex);
//     }
    }
    //Trying to update the status but accept1 function is not working although i tryied to test it by only display statment but it isn't replaying
    //i get that the method itself isn't working but can't get the error
  
    
}
