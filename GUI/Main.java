import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();

        // Create a voter with ID
        Voter voter = new Voter("voter123", "John Doe", "john.doe@example.com", "hashed_password");
        db.storeVoterData(voter.getId(), voter);

        // Create a candidate
        Candidate candidate = new Candidate("candidate456", "Jane Smith", "Independent", "Better Future for All", "hashed_password");
        db.storeCandidateData(candidate.getId(), candidate);

        // Create an election
        Election election = new Election("election789", "Presidential", "2024-11-01", "2024-11-08");
        db.storeElectionData(election.getId(), election);

        // Retrieve data
        Voter retrievedVoter = db.getVoterData("voter123");
        Candidate retrievedCandidate = db.getCandidateData("candidate456");
        Election retrievedElection = db.getElectionData("election789");

        // Display retrieved information
        if (retrievedVoter != null) {
            JOptionPane.showMessageDialog(null, retrievedVoter.toString(), "Retrieved Voter", JOptionPane.INFORMATION_MESSAGE);
        }
        if (retrievedCandidate != null) {
            JOptionPane.showMessageDialog(null, retrievedCandidate.toString(), "Retrieved Candidate", JOptionPane.INFORMATION_MESSAGE);
        }
        if (retrievedElection != null) {
            JOptionPane.showMessageDialog(null, retrievedElection.toString(), "Retrieved Election", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}


















// public class Main {
//     public static void main(String[] args) {
//         Database db = new Database();

//         Voter voter = new Voter("John Doe", "john.doe@example.com", "hashed_password");
//         db.storeVoterData("voter123", voter);

//         Candidate candidate = new Candidate("Jane Smith", "Independent", "Better Future for All", "hashed_password");
//         db.storeCandidateData("candidate456", candidate);

//         Election election = new Election("Presidential", "2024-11-01", "2024-11-08");
//         db.storeElectionData("election789", election);

//         Voter retrievedVoter = db.getVoterData ("voter123");
//         Candidate retrievedCandidate = db.getCandidateData("candidate456");
//         Election retrievedElection = db.getElectionData("election789");
//     }
// }