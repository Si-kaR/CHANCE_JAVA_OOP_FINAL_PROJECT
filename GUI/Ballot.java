import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ballot {
    private String[] candidates;
    private int[] votes;
    private boolean isAuthenticated;

    public Ballot(String[] candidates) {
        this.candidates = candidates;
        this.votes = new int[candidates.length];
        this.isAuthenticated = false;
    }

    // public void authenticate(String password) {
    //     // Simple authentication mechanism (not secure for real-world use)
    //     if ("secretPassword".equals(password)) {
    //         isAuthenticated = true;
    //         System.out.println("Authentication successful.");
    //     } else {
    //         System.out.println("Authentication failed.");
    //     }
    // }
    //  public void authenticate(String password) {
    //     // Simple authentication mechanism (not secure for real-world use)
    //     if ("secretPassword".equals(password)) {
    //         isAuthenticated = true;
    //         JOptionPane.showMessageDialog(null, "Authentication successful.", "Authentication", JOptionPane.INFORMATION_MESSAGE);
    //     } else {
    //         JOptionPane.showMessageDialog(null, "Authentication failed.", "Authentication", JOptionPane.ERROR_MESSAGE);
    //     }
    // }
    public void authenticate(String password) {
        // Simple authentication mechanism (not secure for real-world use)
        if ("secretPassword".equals(password)) {
            isAuthenticated = true;
            JOptionPane.showMessageDialog(null, "Authentication successful.");
        } else {
            JOptionPane.showMessageDialog(null, "Authentication failed.");
        }
    }

    
    public void castVote(int candidateIndex) {
        // if (!isAuthenticated) {
        //     System.out.println("Error: Not authenticated. Please authenticate before casting a vote.");
        //     return;
        // }
        if (!isAuthenticated) {
            JOptionPane.showMessageDialog(null, "Error: Not authenticated. Please authenticate before casting a vote.");
            return;
        }

        // if (candidateIndex >= 0 && candidateIndex < candidates.length) {
        //     votes[candidateIndex]++;
        //     System.out.println("Vote cast successfully for " + candidates[candidateIndex]);
        // } else {
        //     System.out.println("Error: Invalid candidate index.");
        // }
        if (candidateIndex >= 0 && candidateIndex < candidates.length) {
            votes[candidateIndex]++;
            JOptionPane.showMessageDialog(null, "Vote cast successfully for " + candidates[candidateIndex]);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Invalid candidate index.");
        }
    }

    public void displayResults() {
        // if (!isAuthenticated) {
        //     System.out.println("Error: Not authenticated. Please authenticate to view results.");
        //     return;
        // }
        if (!isAuthenticated) {
            JOptionPane.showMessageDialog(null, "Error: Not authenticated. Please authenticate to view results.");
            return;
        }

        // System.out.println("Election Results:");
        // for (int i = 0; i < candidates.length; i++) {
        //     System.out.println(candidates[i] + ": " + votes[i] + " votes");
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