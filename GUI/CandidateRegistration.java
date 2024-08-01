import java.util.UUID;
import javax.swing.JOptionPane;

public class CandidateRegistration {
    private String name;
    private int age;
    private String address;
    private String nationalID;
    private String candidateID;
    private String position;


    public CandidateRegistration(String name, int age, String address, String nationalID, String position) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationalID = nationalID;
        this.candidateID = UUID.randomUUID().toString();
        this.position = position;
    }


    // public void displayCandidateRegistration() {
    //     System.out.println("Name: " + name);
    //     System.out.println("Age: " + age);
    //     System.out.println("Address: " + address);
    //     System.out.println("National ID: " + nationalID);
    //     System.out.println("Candidate ID: " + candidateID);
    //     System.out.println("Position: " + position);
    //     System.out.println(" ");
    // }
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
               "\n\n- - - - - - - - - - -  - - - - -  - - - - - - - - - - - - - ";

    }

   
}
