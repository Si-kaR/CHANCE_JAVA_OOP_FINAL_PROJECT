import java.util.UUID;
import javax.swing.JOptionPane;

public class CandidateRegistration {
    // Attributes for candidate registration
    private String name;
    private int age;
    private String address;
    private String nationalID;
    private String candidateID;
    private String position;

    // Constructor to initialize attributes and generate a unique candidate ID
    public CandidateRegistration(String name, int age, String address, String nationalID, String position) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationalID = nationalID;
        this.candidateID = UUID.randomUUID().toString();
        this.position = position;
    }

    public void displayCandidateRegistration() {
        JOptionPane.showMessageDialog(null, "Name: " + name);
        JOptionPane.showMessageDialog(null, "Address: " + address);
        JOptionPane.showMessageDialog(null, "Age: " + age);
        JOptionPane.showMessageDialog(null, "National ID: " + nationalID);
        JOptionPane.showMessageDialog(null, "Candidate ID: " + candidateID);
        JOptionPane.showMessageDialog(null, "Position: " + position);
    }

    public String getCandidateInfo() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nAddress: " + address +
                "\nNational ID: " + nationalID +
                "\nPosition: " + position +
                "\nCandidate ID: " + candidateID +
                "\n\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n";
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

    public String getNationalID() {
        return nationalID;
    }

    public String getPosition() {
        return position;
    }
}



