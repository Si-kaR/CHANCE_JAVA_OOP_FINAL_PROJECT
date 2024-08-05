import java.util.ArrayList;
import javax.swing.JOptionPane; // Java GUI Library

public class VoterDashboard {
    private Voter voter;
    private Database database;

    public VoterDashboard(Voter voter, Database database) {
        this.voter = voter;
        this.database = database;
    }

    public void viewRegistrationStatus() {
        if (database.getVoterData(voter.getId()) != null) {
            JOptionPane.showMessageDialog(null, "You are registered to vote.", "Registration Status", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "You are not registered to vote.", "Registration Status", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void viewUpcomingElections() {
        ArrayList<Election> elections = database.getElections();
        StringBuilder message = new StringBuilder("Upcoming Elections:\n");
        for (Election election : elections) {
            message.append("Type: ").append(election.getElectionType())
                   .append(", Start Date: ").append(election.getStartDate())
                   .append(", End Date: ").append(election.getEndDate())
                   .append("\n");
        }
        JOptionPane.showMessageDialog(null, message.toString(), "Upcoming Elections", JOptionPane.INFORMATION_MESSAGE);
    }
}





// //  - - - -  - - - -  - - - -  - - - -  - - - -  - - - - GUI SYNTAX