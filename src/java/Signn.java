
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped
public class Signn {
    
  private String name;
  private String id;
  private String model;
  private String city;
  private String Streetno;
  private String specificloc;
  private String plateno;


String username;
FacesContext facesContext = FacesContext.getCurrentInstance();
ExternalContext externalContext = facesContext.getExternalContext();
Map<String,Object> sessionMap = externalContext.getSessionMap();
    
    public Signn() {
          username=(String) sessionMap.get("user");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetno() {
        return Streetno;
    }

    public void setStreetno(String Streetno) {
        this.Streetno = Streetno;
    }

    public String getSpecificloc() {
        return specificloc;
    }

    public void setSpecificloc(String specificloc) {
        this.specificloc = specificloc;
    }

    public String getPlateno() {
        return plateno;
    }

    public void setPlateno(String plateno) {
        this.plateno = plateno;
    }

   

  
  
    public void lag() throws SQLException {
     
            
            dbb d=new dbb();
            Connection connection=d.connMethod();
            PreparedStatement stmt=connection.prepareStatement("Insert into CUSTOMER(name,id,model,city,streetno,specificloc,plateno,status,ownerid) values (?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,name);
            stmt.setString(2,id);
            stmt.setString(3,model);
            stmt.setString(4,city);
            stmt.setString(5,Streetno);
            stmt.setString(6,specificloc);
            stmt.setString(7,plateno);
           stmt.setString(8,"pending");
           stmt.setString(9,username);

           
             stmt.executeUpdate();
        
    }

}
