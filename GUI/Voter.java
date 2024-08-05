public class Voter {

    // Attributes For Voter
    private String id;
    private String name;
    private int age;
    private String email;
    private String password;


    // Voter constructor
    public Voter(String id, String name, int age, String email, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Voter{" + "id='" + id + '\'' +", name='" + name + '\'' + ", age=" + age + ", email='" + email + '\'' + ", password='" + password + '\'' +'}';
    }
}





// // //  - - - -  - - - -  - - - -  - - - -  - - - -  - - - - NO  GUI SYNTAX needed for this class