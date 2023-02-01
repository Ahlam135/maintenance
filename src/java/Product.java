public class Product {     
 private String name;
  private String id;
  private String model;
  private String city;
  private String streetno;
  private String specificloc;
  private String plateno; 
  private String status ;

  
public Product(String name, String id, String model, String city, String streetno, String specificloc, String pno,String st ) {    
this.name = name;    
this.id = id;    
this.model =model;  
this.city =city; 
this.streetno =streetno; 
this.specificloc =specificloc; 
this.plateno =pno;
this.status = st;
}  

  public String getStatus() {
        return status;
    }
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getCity() {
        return city;
    }

    public String getStreetno() {
        return streetno;
    }

    public String getSpecificloc() {
        return specificloc;
    }

    public String getPlateno() {
        return plateno;
    }

   

 
}