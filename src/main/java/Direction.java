
public class Direction {
   String Dir_name ;

   String traffic_light_status;
   int distence;

    public Direction(String Dir_name, String traffic_light_status, int distence) {
        this.Dir_name = Dir_name;

        this.traffic_light_status = traffic_light_status;
        this.distence = distence;
    }

    public String getDir_name() {
        return Dir_name;
    }

    public void setDir_name(String Dir_name) {
        this.Dir_name = Dir_name;
    }

   

    public String getTraffic_light_status() {
        return traffic_light_status;
    }

    public void setTraffic_light_status(String traffic_light_status) {
        this.traffic_light_status = traffic_light_status;
    }

    public int getDistence() {
        return distence;
    }

    public void setDistence(int distence) {
        this.distence = distence;
    }
}
