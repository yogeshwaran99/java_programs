class LoginClass{
  public static void main(String [] args){
    Login l = new Login();
    l.setUsername("user");
    l.setPassword("1234");
    System.out.println("username "+l.getUsername());
  }
}
class Login{
  private String username;
  private String password;

  public void setUsername(String username){
    this.username = username;
  }
  public void setPassword (String password){
    this.password = password;
  }
  public String getUsername(){
    return username;
  }
}
