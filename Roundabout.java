public class Roundabout {
   int Roundabout_ID;
   String Roundabout_name;
   int number_of_entries;

    public Roundabout(int Roundabout_ID, String Roundabout_name, int number_of_entries) {
        this.Roundabout_ID = Roundabout_ID;
        this.Roundabout_name = Roundabout_name;
        this.number_of_entries = number_of_entries;
    }

    public int getRoundabout_ID() {
        return Roundabout_ID;
    }

    public void setRoundabout_ID(int Roundabout_ID) {
        this.Roundabout_ID = Roundabout_ID;
    }

    public String getRoundabout_name() {
        return Roundabout_name;
    }

    public void setRoundabout_name(String Roundabout_name) {
        this.Roundabout_name = Roundabout_name;
    }

    public int getNumber_of_entries() {
        return number_of_entries;
    }

    public void setNumber_of_entries(int number_of_entries) {
        this.number_of_entries = number_of_entries;
    }
}
