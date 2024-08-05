import java.util.UUID;
import javax.swing.JOptionPane;

public class VoterRegistration {
    // Attributes
    private String name;
    private int age;
    private String address;
    private String id;
    private String voteID;

    // Constructor to initialize attributes and generate a unique voter ID
    public VoterRegistration(String name, int age, String address, String id) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.id = id;
        this.voteID = UUID.randomUUID().toString();
    }

    public void displayVoterRegistration() {
        JOptionPane.showMessageDialog(null, "Name: " + name);
        JOptionPane.showMessageDialog(null, "Age: " + age);
        JOptionPane.showMessageDialog(null, "Address: " + address);
        JOptionPane.showMessageDialog(null, "National ID: " + id);
        JOptionPane.showMessageDialog(null, "Voter ID: " + voteID);
    }

    public String getVoterRegistrationInfo() {
        return "\nName: " + name +
                "\nAge: " + age +
                "\nAddress: " + address +
                "\nNational ID: " + id +
                "\nVoter ID: " + voteID +
                "\n\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }
}
