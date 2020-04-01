public class Roundabout {
   String Roundabout_ID;
   String Roundabout_name;
   String North_street;
   String East_street;
   String South_street;
   String West_street;

    public Roundabout() {
    }

    public Roundabout(String Roundabout_ID, String Roundabout_name, String North_street, String East_street, String South_street, String West_street) {
        this.Roundabout_ID = Roundabout_ID;
        this.Roundabout_name = Roundabout_name;
        this.North_street = North_street;
        this.East_street = East_street;
        this.South_street = South_street;
        this.West_street = West_street;
    }

    public String getNorth_street() {
        return North_street;
    }

    public void setNorth_street(String North_street) {
        this.North_street = North_street;
    }

    public String getEast_street() {
        return East_street;
    }

    public void setEast_street(String East_street) {
        this.East_street = East_street;
    }

    public String getSouth_street() {
        return South_street;
    }

    public void setSouth_street(String South_street) {
        this.South_street = South_street;
    }

    public String getWest_street() {
        return West_street;
    }

    public void setWest_street(String West_street) {
        this.West_street = West_street;
    }

    public String getRoundabout_ID() {
        return Roundabout_ID;
    }

    public void setRoundabout_ID(String Roundabout_ID) {
        this.Roundabout_ID = Roundabout_ID;
    }

    public String getRoundabout_name() {
        return Roundabout_name;
    }

    public void setRoundabout_name(String Roundabout_name) {
        this.Roundabout_name = Roundabout_name;
    }

    
}
