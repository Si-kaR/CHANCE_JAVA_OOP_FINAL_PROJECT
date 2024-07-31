import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Database {

    private Map<String, Voter> voterData;
    private Map<String, Candidate> candidateData;
    private Map<String, Election> electionData;

    public Database() {
        voterData = new HashMap<>();
        candidateData = new HashMap<>();
        electionData = new HashMap<>();
    }


    public Voter getVoterData(String voterId) {
        Voter voter = voterData.get(voterId);
        if (voter != null) {
            JOptionPane.showMessageDialog(null, "Voter data retrieved for ID " + voterId, "Voter Data Retrieved", JOptionPane.INFORMATION_MESSAGE);
            return voter;
        } else {
            JOptionPane.showMessageDialog(null, "Voter data not found for ID " + voterId, "Voter Data Not Found", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void storeVoterData(String voterId, Voter voter) {
        voterData.put(voterId, voter);
        JOptionPane.showMessageDialog(null, "Voter data stored for ID " + voterId, "Voter Data Stored", JOptionPane.INFORMATION_MESSAGE);
    }



    public Candidate getCandidateData(String candidateId) {
        Candidate candidate = candidateData.get(candidateId);
        if (candidate != null) {
            JOptionPane.showMessageDialog(null, "Candidate data retrieved for ID " + candidateId, "Candidate Data Retrieved", JOptionPane.INFORMATION_MESSAGE);
            return candidate;
        } else {
            JOptionPane.showMessageDialog(null, "Candidate data not found for ID " + candidateId, "Candidate Data Not Found", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }


    public void storeCandidateData(String candidateId, Candidate candidate) {
        candidateData.put(candidateId, candidate);
        JOptionPane.showMessageDialog(null, "Candidate data stored for ID " + candidateId, "Candidate Data Stored", JOptionPane.INFORMATION_MESSAGE);
    }

    public Election getElectionData(String electionId) {
        Election election = electionData.get(electionId);
        if (election != null) {
            JOptionPane.showMessageDialog(null, "Election data retrieved for ID " + electionId, "Election Data Retrieved", JOptionPane.INFORMATION_MESSAGE);
            return election;
        } else {
            JOptionPane.showMessageDialog(null, "Election data not found for ID " + electionId, "Election Data Not Found", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void storeElectionData(String electionId, Election election) {
        electionData.put(electionId, election);
        JOptionPane.showMessageDialog(null, "Election data stored for ID " + electionId, "Election Data Stored", JOptionPane.INFORMATION_MESSAGE);
    }



    // // Method to return all elections
    // public ArrayList<Election> getElections() {
    //     return new ArrayList<>(electionData.values());
    // }
    public ArrayList<Election> getElections() {
        return new ArrayList<>(electionData.values());
    }


    
}


















// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;
// import javax.swing.JOptionPane; // Java GUI Library

// public class Database {

//     private Map<String, Voter> voterData;
//     private Map<String, Candidate> candidateData;
//     private Map<String, Election> electionData;

//     public Database() {
//         voterData = new HashMap<>();
//         candidateData = new HashMap<>();
//         electionData = new HashMap<>();
//     }


//     // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =

//     // public void storeVoterData(String voterId, Voter voter) {
//     //     voterData.put(voterId, voter);
//     //     System.out.println("Voter data stored for ID " + voterId);
//     // }
//     public void storeVoterData(String voterId, Voter voter) {
//         voterData.put(voterId, voter);
//         JOptionPane.showMessageDialog(null, "Voter data stored for ID " + voterId, "Voter Data Stored", JOptionPane.INFORMATION_MESSAGE);
//     }

//     // public void storeCandidateData(String candidateId, Candidate candidate) {
//     //     candidateData.put(candidateId, candidate);
//     //     System.out.println("Candidate data stored for ID " + candidateId);
//     // }
//     public void storeCandidateData(String candidateId, Candidate candidate) {
//         candidateData.put(candidateId, candidate);
//         JOptionPane.showMessageDialog(null, "Candidate data stored for ID " + candidateId, "Candidate Data Stored", JOptionPane.INFORMATION_MESSAGE);
//     }

//     // public void storeElectionData(String electionId, Election election) {
//     //     electionData.put(electionId, election);
//     //     System.out.println("Election data stored for ID " + electionId);
//     // }

//     // public void storeElectionData(String electionId, Election election) {
//     //     electionData.put(electionId, election);
//     //     JOptionPane.showMessageDialog(null, "Election data stored for ID " + electionId, "Election data stored for ID " + JOptionPane.INFORMATION_MESSAGE);
//     // }
//     public void storeElectionData(String electionId, Election election) {
//         electionData.put(electionId, election);
//         JOptionPane.showMessageDialog(null, "Election data stored for ID " + electionId, "Election Data Stored", JOptionPane.INFORMATION_MESSAGE);
//     }


//     // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =

//     // public Voter getVoterData(String voterId) {
//     //     return voterData.get(voterId);
//     // }
//     public Voter getVoterData(String voterId) {
//         Voter voter = voterData.get(voterId);
//         if (voter != null) {
//             JOptionPane.showMessageDialog(null, "Voter data retrieved for ID " + voterId, "Voter Data Retrieved", JOptionPane.INFORMATION_MESSAGE);
//             return voter;
//         } else {
//             JOptionPane.showMessageDialog(null, "Voter data not found for ID " + voterId, "Voter Data Not Found", JOptionPane.ERROR_MESSAGE);
//             return null;
//         }
//     }

//     // public Candidate getCandidateData(String candidateId) {
//     //     return candidateData.get(candidateId);
//     // }
//     public Candidate getCandidateData(String candidateId) {
//         Candidate candidate = candidateData.get(candidateId);
//         if (candidate != null) {
//             JOptionPane.showMessageDialog(null, "Candidate data retrieved for ID " + candidateId, "Candidate Data Retrieved", JOptionPane.INFORMATION_MESSAGE);
//             return candidate;
//         } else {
//             JOptionPane.showMessageDialog(null, "Candidate data not found for ID " + candidateId, "Candidate Data Not Found", JOptionPane.ERROR_MESSAGE);
//             return null;
//         }
//     }

//     // public Election getElectionData(String electionId) {
//     //     return electionData.get(electionId);
//     // }
//     public Election getElectionData(String electionId) {
//         Election election = electionData.get(electionId);
//         if (election != null) {
//             JOptionPane.showMessageDialog(null, "Election data retrieved for ID " + electionId, "Election Data Retrieved", JOptionPane.INFORMATION_MESSAGE);
//             return election;
//         } else {
//             JOptionPane.showMessageDialog(null, "Election data not found for ID " + electionId, "Election Data Not Found", JOptionPane.ERROR_MESSAGE);
//             return null;
//         }
//     }

//     // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =


//     public static void main(String[] args) {

//         // Implementation => Creation of Database
//         Database db = new Database();

//         // Example Database Welcome Message

//         // Example voter data
//         Voter voter = new Voter("John Doe", "john.doe@example.com", "hashed_password");
//         db.storeVoterData("voter123", voter);

//         // Example candidate data
//         Candidate candidate = new Candidate("Jane Smith", "Independent", "Better Future for All", "hashed_password");
//         db.storeCandidateData("candidate456", candidate);

//         // Example election data
//         Election election = new Election("Presidential", "2024-11-01", "2024-11-08");
//         db.storeElectionData("election789", election);

        
//         // // Retrieve data
//         // System.out.println(db.getVoterData("voter123"));
//         // System.out.println(db.getCandidateData("candidate456"));
//         // System.out.println(db.getElectionData("election789"));
//         // Retrieve data
//         Voter retrievedVoter = db.getVoterData("voter123");
//         Candidate retrievedCandidate = db.getCandidateData("candidate456");
//         Election retrievedElection = db.getElectionData("election789");

        
//     }
// }







// //  - - - -  - - - -  - - - -  - - - -  - - - -  - - - -   GUI SYNTAX








