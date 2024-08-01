import javax.swing.JOptionPane;
import java.util.ArrayList;
// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // ==========================================================    Voter Registration     ===================================================================
        ArrayList<VoterRegistration> voters = new ArrayList<>();
        // Scanner vote = new Scanner(System.in);

        while (true) {

            // System.out.println("Enter your name: ");
            // String name = vote.nextLine();
            // System.out.print("Enter your name: ");
            String voterName = JOptionPane.showInputDialog("Enter your name");
            if (voterName.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name field cannot be empty.");
                continue;
            }

            // System.out.println("Enter your age: ");
            // int age = vote.nextInt();
            // if (age < 18) {
            //     System.out.println("Sorry! You are not of the right age to vote yet.");
            //     vote.nextLine();
            //     continue;
            // }
            // vote.nextLine();
            // int voterAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
            // if (voterAge < 18) {
            //     System.out.println("Sorry! You are not of the right age to vote yet.");
            //     continue;
            // }
            // int voterAge;
            // try {
            //     voterAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
            //     JOptionPane.showMessageDialog(null, "Your age is: " + voterAge);
            // } catch (NumberFormatException e) {
            //     voterAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid input. Please enter a valid integer for age."));
            // }
            int voterAge;
            while (true) {
                try {
                    voterAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
                    if (voterAge < 18) {
                        JOptionPane.showMessageDialog(null, "Sorry! You are not of the right age to vote yet.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer for age.");
                }
            }


            // System.out.println("Enter your address: ");
            // String address = vote.nextLine();
            // String voterAddress = vote.nextLine();
            String voterAddress = JOptionPane.showInputDialog("Enter your address");

            // System.out.println("Enter your National ID: ");
            // String voterID = vote.nextLine();
            String voterID = JOptionPane.showInputDialog("Enter your National ID");


            VoterRegistration voter = new VoterRegistration(voterName, voterAge, voterAddress, voterID);
            // voter.displayVoterRegistration();
            voters.add(voter);



            // System.out.println("Do you want to register another voter? (yes/no) ");
            // String tryAgain = vote.nextLine();
            // if (!tryAgain.equalsIgnoreCase("yes")) {
            //     break;
            // }
            // String tryAgain = JOptionPane.showInputDialog("Do you want to register another voter?");
            // if (!tryAgain.equalsIgnoreCase("yes")) {
            //     break;
            // }
            //     int choice = JOptionPane.showOptionDialog(null, "Do you want to register another voter?",
            //     JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
            //     new String[]{"Yes", "No"}, "Yes");
        
            //     if (choice != JOptionPane.YES_OPTION) {
            //         break;
            //     }
            // }
            int choice = JOptionPane.showOptionDialog(null, "Do you want to register another voter?",
            "Register Another Voter", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
            new String[]{"Yes", "No"}, "Yes");
            
            if (choice != JOptionPane.YES_OPTION) {
                break;
            }
    }

        // System.out.println("All Registered Voters: ");
        //     for (VoterRegistration v : voters) {
        //         v.displayVoterRegistration();
        //     }

        // vote.close();
        // JOptionPane.showMessageDialog(null, "All Registered Voters:");
        // for (VoterRegistration v : voters) {
        //     JOptionPane.showMessageDialog(null, v.getVoterRegistrationInfo());
        // }
        // // scanner.close();
        // Display all registered voters
        StringBuilder allVotersInfo = new StringBuilder("All Registered Voters:\n\n");
        for (VoterRegistration v : voters) {
            allVotersInfo.append(v.getVoterRegistrationInfo());
        }
        JOptionPane.showMessageDialog(null, allVotersInfo.toString());

        // ==========================================================    Candidate Registration     ===================================================================
       
        ArrayList<CandidateRegistration> candidates = new ArrayList<>();
        // Scanner scanner = new Scanner(System.in);

        while (true) {
            // System.out.println("Enter your name: ");
            // String name = scanner.nextLine();
            
            String candidateName = JOptionPane.showInputDialog("Enter Your Name");
            if (candidateName == null || candidateName.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name field cannot be empty.");
                continue;
            }

            // System.out.println("Enter your age: ");
            // int age = scanner.nextInt();
            // scanner.nextLine(); // Consume newline
            // int candidateAge = JOptionPane.showInputDialog("Enter Your Age");
            // int candidateAge = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));

            // int candidateAge;
            // try {
            //     candidateAge = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
            //     JOptionPane.showMessageDialog(null,"Your age is: " + candidateAge);
            // } catch (NumberFormatException e) {
            //     // JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer for age.");
            //     candidateAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid input. Please enter a valid integer for age."));
            // }

            int candidateAge;
            while (true) {
                try {
                    candidateAge = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer for age.");
                }
            }

            // System.out.println("Enter your address: ");

            // String candidateAddress = scanner.nextLine();
            String candidateAddress = JOptionPane.showInputDialog("Enter Your Address");

            // System.out.println("Enter your National ID: ");
            // String nationalID = scanner.nextLine();

            String candidateNationalID = JOptionPane.showInputDialog("Enter Your National ID");

            // System.out.println("Enter the position you are running for: ");
            // String position = scanner.nextLine();

            String candidatePosition = JOptionPane.showInputDialog(null, "Enter the position you are running for");

            CandidateRegistration candidate = new CandidateRegistration(candidateName, candidateAge, candidateAddress, candidateNationalID, candidatePosition);
            candidates.add(candidate);

            // String repeatRegister = JOptionPane.showInputDialog(null, "Do you want to register another candidate?");
            //     // String tryAgain = scanner.nextLine();
            //     if (!repeatRegister.equalsIgnoreCase("no")) {
            //         break;
            //     }
            // }
            int choice = JOptionPane.showOptionDialog(null, "Do you want to register another candidate?",
            "Register Another Candidate", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
            new String[]{"Yes", "No"}, "Yes");

            if (choice != JOptionPane.YES_OPTION) {
                break;
            }
        }

        StringBuilder allCandidatesInfo = new StringBuilder("All Registered Candidates:\n\n");
        // System.out.println("All Registered Candidates: ");
        for (CandidateRegistration c : candidates) {
            // c.displayCandidateRegistration();
            allCandidatesInfo.append(c.getCandidateInfo());
        }
        JOptionPane.showMessageDialog(null, allCandidatesInfo.toString());




        // ==========================================================    Database Storage Registration     ===================================================================
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
            // scanner.close();       
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