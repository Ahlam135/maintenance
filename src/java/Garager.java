
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahlam
 */
public class Garager {
    
  private String name;
  private String Garagerid;
  private String phone;
  private String city;
  private String Streetno;
 

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGaragerid() {
        return Garagerid;
    }

    public void setGaragerid(String Garagerid) {
        this.Garagerid = Garagerid;
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
        return Streetno;
    }

    public void setStreetno(String Streetno) {
        this.Streetno = Streetno;
    }
    public void gar() {
        try{
            
            dbb d=new dbb();
            Connection connection=d.connMethod();
            PreparedStatement stmt=connection.prepareStatement("Insert into GARAGE (name,garid,phone,city,streetno) values(?,?,?,?,?)");
            stmt.setString(1,name);
            stmt.setString(2,Garagerid);
            stmt.setString(3,phone);
            stmt.setString(4,city);
            stmt.setString(5,Streetno);
             stmt.executeUpdate();
        }
        catch (SQLException e){
            
        }
    } 
}
