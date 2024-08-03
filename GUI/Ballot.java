import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ballot {

    // storing candidates and votes in array
    private String[] candidates;
    private int[] votes;
    private boolean isAuthenticated;

    // constructor is supposed to initialize the candidates array and set votes array to 0s
    public Ballot(String[] candidates) {
        this.candidates = candidates;
        this.votes = new int[candidates.length];
        this.isAuthenticated = false;
    }

    // method to authenticate password.
    // if the password matches what has been stored then the Authentication will be successful
    // else it will be false and authentication will not be allowed
    public void authenticate(String password) {
        if ("secretPassword".equals(password)) {
            isAuthenticated = true;
            JOptionPane.showMessageDialog(null, "Authentication successful.");
        } else {
            JOptionPane.showMessageDialog(null, "Authentication failed.");
        }
    }

    
    public void castVote(int candidateIndex) {

        if (!isAuthenticated) {
            JOptionPane.showMessageDialog(null, "Error: Not authenticated. Please authenticate before casting a vote.");
            return;
        }


        if (candidateIndex >= 0 && candidateIndex < candidates.length) {
            votes[candidateIndex]++;
            JOptionPane.showMessageDialog(null, "Vote cast successfully for " + candidates[candidateIndex]);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Invalid candidate index.");
        }
    }

    public void displayResults() {

        if (!isAuthenticated) {
            JOptionPane.showMessageDialog(null, "Error: Not authenticated. Please authenticate to view results.");
            return;
        }

        StringBuilder message = new StringBuilder("Election Results:\n");
        for (int i = 0; i < candidates.length; i++) {
            message.append(candidates[i]).append(": ").append(votes[i]).append(" votes\n");
        }
        JOptionPane.showMessageDialog(null, message.toString());
    }

    public int getTotalVotes() {
        return Arrays.stream(votes).sum();
    }
}