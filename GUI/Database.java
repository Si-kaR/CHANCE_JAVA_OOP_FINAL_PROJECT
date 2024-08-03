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


    // Getting voter data from the database
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

    // Storing voter data in the database
    public void storeVoterData(String voterId, Voter voter) {
        voterData.put(voterId, voter);
        JOptionPane.showMessageDialog(null, "Voter data stored for ID " + voterId, "Voter Data Stored", JOptionPane.INFORMATION_MESSAGE);
    }



    // getting candidate data from the database
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


    // storing the candidate data
    public void storeCandidateData(String candidateId, Candidate candidate) {
        candidateData.put(candidateId, candidate);
        JOptionPane.showMessageDialog(null, "Candidate data stored for ID " + candidateId, "Candidate Data Stored", JOptionPane.INFORMATION_MESSAGE);
    }

    // getting the election data
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

    // sotring the election data
    public void storeElectionData(String electionId, Election election) {
        electionData.put(electionId, election);
        JOptionPane.showMessageDialog(null, "Election data stored for ID " + electionId, "Election Data Stored", JOptionPane.INFORMATION_MESSAGE);
    }

    public ArrayList<Election> getElections() {
        return new ArrayList<>(electionData.values());
    }


    
}