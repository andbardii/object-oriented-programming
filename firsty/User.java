package firsty;

public class User {
    private String name;
    private String password;
    private boolean logged = false;

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public void introduce(){
        if(this.authenticator()){
            System.out.println("Hello," + this.name);
        }else {
            System.out.println("You are not logged in");
        }
    }

    private String encodePassword(String password){
        return password + "123";
    }

    public boolean login(String password){
        if(this.password.equals(this.encodePassword(password))){
            this.logged = true;
            return true;
        }else {
            return false;
        }
    }

    private boolean authenticator(){
        return this.logged;
    }
}