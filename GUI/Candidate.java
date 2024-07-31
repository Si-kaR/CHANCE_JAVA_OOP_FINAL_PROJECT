import javax.swing.JOptionPane;

public class Candidate {
    private String name;
    private String partyAffiliation;
    private String manifesto;
    private String password;

    public Candidate(String name, String partyAffiliation, String manifesto, String password) {
        this.name = name;
        this.partyAffiliation = partyAffiliation;
        this.manifesto = manifesto;
        this.password = password;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartyAffiliation() {
        return partyAffiliation;
    }

    public void setPartyAffiliation(String partyAffiliation) {
        this.partyAffiliation = partyAffiliation;
    }

    // public String getManifesto() {
    //     return manifesto;
    // }
    public void displayManifesto() {
        JOptionPane.showMessageDialog(null, "Manifesto: " + manifesto, "Manifesto", JOptionPane.INFORMATION_MESSAGE);
    }

    public void setManifesto(String manifesto) {
        this.manifesto = manifesto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Candidate{" + "name='" + name + ", partyAffiliation='" + partyAffiliation + ", manifesto='" + manifesto + ", password='" + password +'}';
    }
}






//  - - - -  - - - -  - - - -  - - - -  - - - -  - - - - NO  GUI SYNTAX