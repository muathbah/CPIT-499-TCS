public class Account {
    String Account_ID;
    String First_name;
    String Last_name;
    String Password;
    String Phone_number;
    String Priv;

    public Account(String Account_ID, String First_name, String Last_name, String Password, String Phone_number, String Priv) {
        this.Account_ID = Account_ID;
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.Password = Password;
        this.Phone_number = Phone_number;
        this.Priv = Priv;
    }

    Account() {

    }

    public String getAccount_ID() {
        return Account_ID;
    }

    public void setAccount_ID(String Account_ID) {
        this.Account_ID = Account_ID;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String Phone_number) {
        this.Phone_number = Phone_number;
    }

    public String getPriv() {
        return Priv;
    }

    public void setPriv(String Priv) {
        this.Priv = Priv;
    }
    
    
    
}
