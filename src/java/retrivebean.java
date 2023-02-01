
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;  
import java.util.ArrayList;  
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped;  
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
  
@ManagedBean
@RequestScoped  
public class retrivebean {  
     String username;
FacesContext facesContext = FacesContext.getCurrentInstance();
ExternalContext externalContext = facesContext.getExternalContext();
Map<String,Object> sessionMap = externalContext.getSessionMap();

    public retrivebean() {
                username=(String) sessionMap.get("user");

    }


public List<retrive> productslist;  
public  List<retrive> getProductlist() throws SQLException { 
 productslist = new ArrayList<>();    
      
        
     try {
          dbb bb=new dbb();
         Connection con=bb.connMethod();

        PreparedStatement ps=con.prepareStatement("SELECT * FROM  CUSTOMER WHERE OWNERID = ?");
          ps.setString(1,username);
        
                   ResultSet re=ps.executeQuery();

        while (re.next()) {
            String name = re.getString("Name");
            String id = re.getString("id");
            String model = re.getString("model");
            String city = re.getString("city");
            String streetno = re.getString("streetno");
            String specificloc = re.getString("specificloc");
            String plateno = re.getString("plateno");
            String sta = re.getString("STATUS");
           String main= re.getString("MAINTAINER");
          String owner= re.getString("OWNERID");



            
            productslist.add(new retrive(name,id,model,city,streetno,specificloc,plateno,sta,main,owner ));
            
        }

    } catch (SQLException ex) {
        Logger.getLogger(DataTable.class.getName()).log(Level.SEVERE, null, ex);
    }
                        
                     
return productslist;  
}       
   
}
