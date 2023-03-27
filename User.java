public class User {
    private String name;

    private String surname;
    private String email;


    public User(String name,String surname ,String email) {
        this.name = name;
        this.surname=surname;
        this.email = email;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void printUserInfo(){
        System.out.println("************UserInfo****************");
        System.out.println("User name is : " + name);
        System.out.println("User surname is: " + surname);
        System.out.println("User is email: " + email);
        System.out.println();
    }
}
