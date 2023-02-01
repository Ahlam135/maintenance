import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;  
import java.util.ArrayList;  
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped;  
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
  
@ManagedBean(name = "product")  
@RequestScoped  
public class DataTable {    
public List<Product> productsList;  
public  List<Product> getProductList() throws SQLException { 
 productsList = new ArrayList<>();    
  String sql="SELECT * FROM CUSTOMER";
       dbb bb=new dbb();
        Statement stm;
     try {
        stm= bb.connMethod().createStatement();
        ResultSet re = stm.executeQuery(sql);
   
        while (re.next()) {
            String name = re.getString("Name");
            String id = re.getString("id");
            String model = re.getString("model");
            String city = re.getString("city");
            String streetno = re.getString("streetno");
            String specificloc = re.getString("specificloc");
            String plateno = re.getString("plateno");
            String status = re.getString("status");

            
            productsList.add(new Product(name,id,model,city,streetno,specificloc,plateno,status ));
            
        }
    } catch (SQLException ex) {
        Logger.getLogger(DataTable.class.getName()).log(Level.SEVERE, null, ex);
    }
                        
                      
           
        
   
 
 
return productsList;  
}       
   
}