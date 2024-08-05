import javax.swing.JOptionPane;


public class Ballot {
    private String[] candidates;
    private int[] votes;
    private boolean authenticated = false;

    public Ballot(String[] candidates) {
        this.candidates = candidates;
        this.votes = new int[candidates.length];
    }

    public void authenticate(String password) {
        // Simple password check for demonstration
        if ("secretPassword".equals(password)) {
            authenticated = true;
        } else {
            JOptionPane.showMessageDialog(null, "Authentication failed.");
        }
    }

    public void castVote(int candidateIndex) {
        if (authenticated) {
            votes[candidateIndex]++;
            JOptionPane.showMessageDialog(null, "Vote cast successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "You are not authenticated to cast a vote.");
        }
    }

    public void displayResults() {
        if (authenticated) {
            StringBuilder results = new StringBuilder("Election Results:\n");
            for (int i = 0; i < candidates.length; i++) {
                results.append(candidates[i]).append(": ").append(votes[i]).append(" votes\n");
            }
            JOptionPane.showMessageDialog(null, results.toString());
        } else {
            JOptionPane.showMessageDialog(null, "You are not authenticated to view the results.");
        }
    }
}
