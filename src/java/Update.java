import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class Update {
     private String uid;
   private String select;
    List<String>selec;
 String username;
FacesContext facesContext = FacesContext.getCurrentInstance();
ExternalContext externalContext = facesContext.getExternalContext();
Map<String,Object> sessionMap = externalContext.getSessionMap();
    
     public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }
    public List<String> getSelec() {
        return selec;
    }

    public void setSelec(List<String> selec) {
        this.selec = selec;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Update() {
        selec=new ArrayList<>();
        selec.add("Progress");
        selec.add("Completed");
        
        username=(String) sessionMap.get("user");
    }
     
    public void updat(){
         try {
             dbb bb=new dbb();
             Connection con=bb.connMethod();
             PreparedStatement ps=con.prepareStatement("UPDATE CUSTOMER SET STATUS=?,MAINTAINER=? WHERE ID=?");
             ps.setString(1,select);
             ps.setString(2, username);
             ps.setString(3, uid);

             ps.executeUpdate();

             
         } catch (SQLException ex) {
         }
             
    }

   
   
}
