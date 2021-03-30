package login;

public class LoginInfo {

    private String email = "huyduong@mailinator.com";
    private String password = "P@ssw0rd";

    //Getters
    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    //Setters
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  public LoginInfo(){}

}
