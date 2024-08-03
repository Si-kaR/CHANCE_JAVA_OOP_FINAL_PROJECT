import java.util.UUID;

import javax.swing.JOptionPane;

public class VoterRegistration {

    // attributes
    private String name;
    private int age;
    private String address;
    private String nationalID;
    private String voteID;


    // constructor to initialize attributes and generate a unique voter ID
    public VoterRegistration(String name, int age, String address, String nationalID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationalID = nationalID;
        this.voteID = UUID.randomUUID().toString();

    }

    public void displayVoterRegistration() {
        JOptionPane.showMessageDialog(null, "\nName: " + name);
        JOptionPane.showMessageDialog(null, "Age: " + age);
        JOptionPane.showMessageDialog(null, "Address: " + address);
        JOptionPane.showMessageDialog(null, "National ID: " + nationalID);
        JOptionPane.showMessageDialog(null, "Candidate ID: " + voteID);
    }

    public String getVoterRegistrationInfo() {
        return "\nName: " + name + "\nAge: " + age + "\nAddress: " + address + 
        "\nNational ID: " + nationalID + 
        "\nVoters ID: " + voteID + "\n\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ";
    }

}



