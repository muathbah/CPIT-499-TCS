public class Roundabout {
   String Roundabout_ID;
   String Roundabout_name;
   Direction North_street;
   Direction East_street;
   Direction South_street;
   Direction West_street;
   boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Roundabout() {
    }

    public Roundabout(String Roundabout_ID, String Roundabout_name, Direction North_street, Direction East_street, Direction South_street, Direction West_street) {
        this.Roundabout_ID = Roundabout_ID;
        this.Roundabout_name = Roundabout_name;
        this.North_street = North_street;
        this.East_street = East_street;
        this.South_street = South_street;
        this.West_street = West_street;
    }

    public Direction getNorth_street() {
        return North_street;
    }

    public void setNorth_street(Direction North_street) {
        this.North_street = North_street;
    }

    public Direction getEast_street() {
        return East_street;
    }

    public void setEast_street(Direction East_street) {
        this.East_street = East_street;
    }

    public Direction getSouth_street() {
        return South_street;
    }

    public void setSouth_street(Direction South_street) {
        this.South_street = South_street;
    }

    public Direction getWest_street() {
        return West_street;
    }

    public void setWest_street(Direction West_street) {
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
