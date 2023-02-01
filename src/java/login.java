import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class login {
     private String uname;
     private String utype;
      private String pass;

    public login() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
        public void lag() {
        try{
            
            dbb d=new dbb();
            Connection connection=d.connMethod();
            PreparedStatement stmt=connection.prepareStatement("Insert into SIGNIN(USERNAME,USERTYPE,PASSWORD) values(?,?,?)");
            stmt.setString(1,uname);
            stmt.setString(2,utype);
            stmt.setString(3,pass);
          
             stmt.executeUpdate();
        }
        catch (SQLException e){
            
        }
    }
      
}