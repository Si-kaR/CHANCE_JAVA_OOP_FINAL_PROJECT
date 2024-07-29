import java.util.HashMap;
import java.util.Map;

public class Database {

    private Map<String, Voter> voterData;
    private Map<String, Candidate> candidateData;
    private Map<String, Election> electionData;

    public Database() {
        voterData = new HashMap<>();
        candidateData = new HashMap<>();
        electionData = new HashMap<>();
    }


    // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =

    public void storeVoterData(String voterId, Voter voter) {
        voterData.put(voterId, voter);
        System.out.println("Voter data stored for ID " + voterId);
    }

    public void storeCandidateData(String candidateId, Candidate candidate) {
        candidateData.put(candidateId, candidate);
        System.out.println("Candidate data stored for ID " + candidateId);
    }

    public void storeElectionData(String electionId, Election election) {
        electionData.put(electionId, election);
        System.out.println("Election data stored for ID " + electionId);
    }

    // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =

    public Voter getVoterData(String voterId) {
        return voterData.get(voterId);
    }

    public Candidate getCandidateData(String candidateId) {
        return candidateData.get(candidateId);
    }

    public Election getElectionData(String electionId) {
        return electionData.get(electionId);
    }

    // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =


    public static void main(String[] args) {

        // Implementation => Creation of Database
        Database db = new Database();

        // Example Database Welcome Message

        // Example voter data
        Voter voter = new Voter("John Doe", "john.doe@example.com", "hashed_password");
        db.storeVoterData("voter123", voter);

        // Example candidate data
        Candidate candidate = new Candidate("Jane Smith", "Independent", "Better Future for All", "hashed_password");
        db.storeCandidateData("candidate456", candidate);

        // Example election data
        Election election = new Election("Presidential", "2024-11-01", "2024-11-08");
        db.storeElectionData("election789", election);

        // Retrieve data
        System.out.println(db.getVoterData("voter123"));
        System.out.println(db.getCandidateData("candidate456"));
        System.out.println(db.getElectionData("election789"));
    }
}