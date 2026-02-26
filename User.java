package DigitalCom;

public class User implements IValidate {
    private String userid;
    private String password;


    //GETTER
    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    //ADD USER
    void addUser(String userid, String password) {
        this.userid = userid;
        this.password = password;
    }

    //AUTHENTICATE
    @Override
    public boolean IsAuthenticated(String userid, String password) {
        return this.getUserid().equals(userid) && this.getPassword().equals(password);
    }
}