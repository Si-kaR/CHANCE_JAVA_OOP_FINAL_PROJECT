import java.util.ArrayList;

public class VoterDashboard {
    private Voter voter;
    private Database database;

    public VoterDashboard(Voter voter, Database database) {
        this.voter = voter;
        this.database = database;
    }

    public void viewRegistrationStatus() {
        if (database.getVoter(voter.getId()) != null) {
            System.out.println("You are registered to vote.");
        } else {
            System.out.println("You are not registered to vote.");
        }
    }

    public void viewUpcomingElections() {
        ArrayList<Election> elections = database.getElections();
        System.out.println("Upcoming Elections:");
        for (Election election : elections) {
            System.out.println("Type: " + election.getElectionType() + ", Start Date: " + election.getStartDate() + ", End Date: " + election.getEndDate());
        }
    }
}
