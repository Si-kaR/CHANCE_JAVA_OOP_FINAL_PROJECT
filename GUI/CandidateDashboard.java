import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CandidateDashboard {
    private Candidate candidate;
    private Database database;

    public CandidateDashboard(Candidate candidate, Database database) {
        this.candidate = candidate;
        this.database = database;
    }

    public void manageCampaign() {
        String message = "Managing campaign for candidate: " + candidate.getName();
        JOptionPane.showMessageDialog(null, message, "Candidate Campaign", JOptionPane.INFORMATION_MESSAGE);
        candidate.displayManifesto();
    }

    public void viewElectionResults() {
        ArrayList<Election> elections = database.getElections();
        StringBuilder sb = new StringBuilder();
        sb.append("Election Results:\n");
        for (Election election : elections) {
            sb.append("Type: ").append(election.getElectionType())
              .append(", Start Date: ").append(election.getStartDate())
              .append(", End Date: ").append(election.getEndDate())
              .append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Election Results", JOptionPane.INFORMATION_MESSAGE);
    }
}

































































// import java.util.ArrayList;
// import javax.swing.JOptionPane; // Java Gui Library

// public class CandidateDashboard {
//     private Candidate candidate;
//     private Database database;

//     public CandidateDashboard(Candidate candidate, Database database) {
//         this.candidate = candidate;
//         this.database = database;
//     }

//     // public void manageCampaign() {
//     //     System.out.println("Managing campaign for candidate: " + candidate.getName());
//     //     candidate.displayManifesto();
//     // }

//     public void manageCampaign() {
//         String message = "Managing campaign for candidate: " + candidate.getName();
//         JOptionPane.showMessageDialog(null, message, "Candidate Campaign", JOptionPane.INFORMATION_MESSAGE);
//         candidate.displayManifesto();
//     }

//     // public void viewElectionResults() {
//     //     ArrayList<Election> elections = database.getElections();
//     //     System.out.println("Election Results:");
//     //     for (Election election : elections) {
//     //         System.out.println("Type: " + election.getElectionType() + ", Start Date: " + election.getStartDate() + ", End Date: " + election.getEndDate());
//     //         // Here you would implement code to display actual results.
//     //     }
//     // }
//     public ArrayList<Election> getElections() {
//         return new ArrayList<>(electionData.values());
//     }
//     public void viewElectionResults() {
//         ArrayList<Election> elections = database.getElections();
//         StringBuilder sb = new StringBuilder();
//         sb.append("Election Results:\n");
//         for (Election election : elections) {
//             sb.append("Type: ").append(election.getElectionType())
//               .append(", Start Date: ").append(election.getStartDate())
//               .append(", End Date: ").append(election.getEndDate())
//               .append("\n");
//         }
//         JOptionPane.showMessageDialog(null, sb.toString(), "Election Results", JOptionPane.INFORMATION_MESSAGE);
//     }
// }











// // - - - -  - - - -  - - - -  - - - -  - - - -  - - - - GUI SYNTAX