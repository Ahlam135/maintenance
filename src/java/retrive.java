public class retrive {
     private String name;
  private String id;
  private String model;
  private String city;
  private String Streetno;
  private String specificloc;
  private String plateno;
   private String sta;
  private String main;
  private String owner;

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
        return Streetno;
    }

    public String getSpecificloc() {
        return specificloc;
    }

    public String getPlateno() {
        return plateno;
    }

    public String getSta() {
        return sta;
    }

    public String getMain() {
        return main;
    }

    public String getOwner() {
        return owner;
    }

    public retrive(String name, String id, String model, String city, String Streetno, String specificloc, String plateno, String sta, String main, String owner) {
        this.name = name;
        this.id = id;
        this.model = model;
        this.city = city;
        this.Streetno = Streetno;
        this.specificloc = specificloc;
        this.plateno = plateno;
        this.sta = sta;
        this.main = main;
        this.owner = owner;
        
    }

    
}
