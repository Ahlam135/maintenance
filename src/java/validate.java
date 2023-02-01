import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
@ManagedBean
@SessionScoped
public class validate  {
  private String usern;
    private String pass;
  
  
    public String getUsern() {
        return usern;
    }

    public void setUsern(String usern) {
        this.usern = usern;
    }
   


     public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String vall() throws SQLException, ClassNotFoundException {
        boolean num = val(usern, pass);
        if (num) {
               dbb d=new dbb();
            Connection connection=d.connMethod();
            PreparedStatement ps =connection.prepareStatement("select USERTYPE,USERNAME from SIGNIN where USERNAME=?");
            ps.setString(1, usern);       
            ResultSet rs = ps.executeQuery();
            rs.next();
 FacesContext facesContext = FacesContext.getCurrentInstance();
 ExternalContext externalContext = facesContext.getExternalContext();
 Map<String, Object> sessionMap = externalContext.getSessionMap();
 sessionMap.put("user", rs.getString(2));
            String userType =rs.getString(1);
            if ("garager".equals(userType)) {
                return "GarHome";
            } else {
                return "customer";
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            ""));
            return "index";
        }
    }


 public static boolean val(String name, String password) {
        boolean status = false;
        try {
             dbb d=new dbb();
            Connection connection=d.connMethod();
            PreparedStatement ps = connection.prepareStatement("select * from SIGNIN where USERNAME=? and PASSWORD=?");
            ps.setString(1, name);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
            
        } catch (SQLException e) {
            System.out.println(e);
         
        }
        return status;
    }
}