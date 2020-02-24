
public class privilage {

    public String get_privilage(boolean Create_account, boolean Modify_map, boolean Control_traffic, boolean Print_report) {

        String privilage = "";
        if (Create_account) {
            privilage = privilage + "1";
        } else {
            privilage = privilage + "0";
        }
        if (Modify_map) {
            privilage = privilage + "1";
        } else {
            privilage = privilage + "0";
        }
        if (Control_traffic) {
            privilage = privilage + "1";
        } else {
            privilage = privilage + "0";
        }
        if (Print_report) {
            privilage = privilage + "1";
        } else {
            privilage = privilage + "0";
        }
        return privilage;
    }
}
