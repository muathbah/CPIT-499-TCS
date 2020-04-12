
public class Traffic_magement {
    int Distnce_of_traffic;
    String Direction_name;
    int time_for_green;

    public int getDistnce_of_traffic() {
        return Distnce_of_traffic;
    }

    public void setDistnce_of_traffic(int Distnce_of_traffic) {
        this.Distnce_of_traffic = Distnce_of_traffic;
    }

    public String getDirection_name() {
        return Direction_name;
    }

    public void setDirection_name(String Direction_name) {
        this.Direction_name = Direction_name;
    }

    public int getTime_for_green() {
        return time_for_green;
    }

    public void setTime_for_green(int time_for_green) {
        this.time_for_green = time_for_green;
    }

    public Traffic_magement(int Distnce_of_traffic, String Direction_name, int time_for_green) {
        this.Distnce_of_traffic = Distnce_of_traffic;
        this.Direction_name = Direction_name;
        this.time_for_green = time_for_green;
    }
}
