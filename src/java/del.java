
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class del {
    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public del() {
    }
    
     public void delete(){
         try {
             dbb bb=new dbb();
                   
             Connection con=bb.connMethod();
             String sql="DELETE FROM CUSTOMER WHERE ID='" + uid + "'";
             Statement st=con.createStatement();
             st.execute(sql);
         } catch (SQLException ex) {
         }
    }
    
}
