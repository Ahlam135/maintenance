
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class Garager {
    
  private String name;
  private String garagerid;
  private String phone;
  private String city;
  private String streetno;
 

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGaragerid() {
        return garagerid;
    }

    public void setGaragerid(String garagerid) {
        this.garagerid = garagerid;
    }

  

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetno() {
        return streetno;
    }

    public void setStreetno(String Streetno) {
        this.streetno = Streetno;
    }
    public void gar() {
        try{
            
            dbb d=new dbb();
            Connection connection=d.connMethod();
            PreparedStatement stmt=connection.prepareStatement("Insert into GARAGE(name,garid,phone,city,streetno) VALUES(?,?,?,?,?)");
            stmt.setString(1,name);
            stmt.setString(2,garagerid);
            stmt.setString(3,phone);
            stmt.setString(4,city);
            stmt.setString(5,streetno);
             stmt.executeUpdate();
        }
        catch (SQLException e){
            
        }
    } 
}
