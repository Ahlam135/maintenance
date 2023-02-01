
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class sign {
  private String name;
  private String id;
  private String model;
  private String city;
  private String Streetno;
  private String specificloc;
  private String plateno;
  
  
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

public void luck() throws SQLException{
    try{
     dbb d=new dbb();
     Connection connection=d.connMethod();
     PreparedStatement stmt=connection.prepareStatement("Insert into CUSTOMER(name,id,model,city,streetno,specificloc,plateno,status) values(?,?,?,?,?,?,?,?)");
     stmt.setString(1,name);
     stmt.setString(2,id);
     stmt.setString(3,model);
     stmt.setString(4,city);
     stmt.setString(5,Streetno);
     stmt.setString(6,specificloc);
     stmt.setString(7,"pending");
     stmt.executeUpdate();
     
}
  catch (SQLException e){
            
        }

    
}}

