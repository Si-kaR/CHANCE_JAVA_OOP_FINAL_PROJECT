import java.util.ArrayList;
import javax.swing.JOptionPane; // Java GUI Library


public class VoterDashboard {
    private Voter voter;
    private Database database;

    public VoterDashboard(Voter voter, Database database) {
        this.voter = voter;
        this.database = database;
    }

    // public void viewRegistrationStatus() {
    //     if (database.getVoter(voter.getId()) != null) {
    //         System.out.println("You are registered to vote.");
    //     } else {
    //         System.out.println("You are not registered to vote.");
    //     }
    // }
    public void viewRegistrationStatus() {
        if (database.getVoter(voter.getId()) != null) {
            JOptionPane.showMessageDialog(null, "You are registered to vote.");
        } else {
            JOptionPane.showMessageDialog(null, "You are not registered to vote.");
        }
    }

    // public void viewUpcomingElections() {
    //     ArrayList<Election> elections = database.getElections();
    //     System.out.println("Upcoming Elections:");
    //     for (Election election : elections) {
    //         System.out.println("Type: " + election.getElectionType() + ", Start Date: " + election.getStartDate() + ", End Date: " + election.getEndDate());
    //     }
    // }
    public void viewUpcomingElections() {
        ArrayList<Election> elections = database.getElections();
        StringBuilder message = new StringBuilder("Upcoming Elections:\n");
        for (Election election : elections) {
            message.append("Type: ").append(election.getElectionType()).append(", Start Date: ").append(election.getStartDate()).append(", End Date: ").append(election.getEndDate()).append("\n");
        }
        JOptionPane.showMessageDialog(null, message.toString());
    }
}





//  - - - -  - - - -  - - - -  - - - -  - - - -  - - - - GUI SYNTAX