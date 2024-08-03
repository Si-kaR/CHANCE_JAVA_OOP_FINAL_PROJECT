public class Voter {

    // Attributes For Voter
    private String id;
    private String name;
    private String email;
    private String password;

    // voter constructor
    public Voter(String id, String name, String email, String password) {
        this.id = id;
        this.name = name;
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
        return "Voter{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + ", password='" + password + '\'' + '}';
    }
}




























// //  - - - -  - - - -  - - - -  - - - -  - - - -  - - - - NO  GUI SYNTAX needed for this class