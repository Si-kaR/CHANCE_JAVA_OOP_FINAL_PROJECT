import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<VoterRegistration> voters = new ArrayList<>();
        ArrayList<CandidateRegistration> candidates = new ArrayList<>();

        // Welcome message and options
        while (true) {
            String[] options = {"Register Voter", "Register Candidate", "View Registered Voters", "View Registered Candidates", "Login", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Welcome to the Online Voting System!\nPlease select an option:", 
                                                      "Welcome", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                                                      null, options, options[0]);
            switch (choice) {
                case 0: // Register Voter
                    registerVoter(voters);
                    break;
                case 1: // Register Candidate
                    registerCandidate(candidates);
                    break;
                case 2: // View Registered Voters
                    viewRegisteredVoters(voters);
                    break;
                case 3: // View Registered Candidates
                    viewRegisteredCandidates(candidates);
                    break;
                case 4: // Login
                    login(voters, candidates);
                    break;
                case 5: // Exit
                    JOptionPane.showMessageDialog(null, "Thank you for using the Online Voting System!");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    // private static void registerVoter(ArrayList<VoterRegistration> voters) {
    //     while (true) {
    //         String voterName = JOptionPane.showInputDialog("Enter your name");
    //         if (voterName == null || voterName.trim().isEmpty()) {
    //             JOptionPane.showMessageDialog(null, "Name field cannot be empty.");
    //             continue;
    //         }

    //         int voterAge;
    //         while (true) {
    //             try {
    //                 voterAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    //                 if (voterAge < 18) {
    //                     JOptionPane.showMessageDialog(null, "Sorry! You are not of the right age to vote yet.");
    //                     continue;
    //                 }
    //                 break;
    //             } catch (NumberFormatException e) {
    //                 JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer for age.");
    //             }
    //         }

    //         String voterAddress = JOptionPane.showInputDialog("Enter your address");
    //         String voterID = JOptionPane.showInputDialog("Enter your National ID");

    //         VoterRegistration voter = new VoterRegistration(voterName, voterAge, voterAddress, voterID);
    //         voters.add(voter);

    //         int choice = JOptionPane.showOptionDialog(null, "Do you want to register another voter?",
    //                 "Register Another Voter", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
    //                 new String[]{"Yes", "No"}, "Yes");

    //         if (choice != JOptionPane.YES_OPTION) {
    //             break;
    //         }
    //     }
    // }
    private static void registerVoter(ArrayList<VoterRegistration> voters) {
        while (true) {
            // Validate name: Only letters and spaces
            String voterName;
            while (true) {
                voterName = JOptionPane.showInputDialog("Enter your name");
                if (voterName == null || !voterName.matches("[a-zA-Z ]+")) {
                    JOptionPane.showMessageDialog(null, "Name must contain only letters and spaces.");
                } else {
                    break;
                }
            }

            // // Validate age: Integer and >= 18
            // int voterAge;
            // while (true) {
            //     try {
            //         voterAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
            //         if (voterAge < 18) {
            //             JOptionPane.showMessageDialog(null, "Sorry! You must be at least 18 years old to register.");
            //         } else {
            //             break;
            //         }
            //     } catch (NumberFormatException e) {
            //         JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer for age.");
            //     }
            // }

            // Validate age: Any number with more than 3 digits
             // Validate age: Must be a valid number and not exceed 3 digits
             int voterAge;
             while (true) {
                 try {
                     String ageInput = JOptionPane.showInputDialog("Enter your age");
                     if (ageInput == null || !ageInput.matches("\\d{1,3}")) {
                         JOptionPane.showMessageDialog(null, "Age must be a valid number with up to 3 digits.");
                         continue;
                     }
                     voterAge = Integer.parseInt(ageInput);
                     if (voterAge < 18) {
                         JOptionPane.showMessageDialog(null, "Sorry! You are not of the right age to vote yet.");
                         continue;
                     }
                     break;
                 } catch (NumberFormatException e) {
                     JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer for age.");
                 }
             }
 
            // Validate address: No specific restrictions here, but can add if needed
            String voterAddress = JOptionPane.showInputDialog("Enter your address");
            if (voterAddress == null || voterAddress.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Address cannot be empty.");
                continue;
            }

            // // Validate National ID: Only alphanumeric characters
            // String voterID;
            // while (true) {
            //     voterID = JOptionPane.showInputDialog("Enter your National ID");
            //     if (voterID == null || !voterID.matches("[a-zA-Z0-9]+")) {
            //         JOptionPane.showMessageDialog(null, "National ID must be alphanumeric.");
            //     } else {
            //         break;
            //     }
            // }

            // Validate National ID: Format should be up to 7 digits followed by a dash and a single letter
            String voterID;
            while (true) {
                voterID = JOptionPane.showInputDialog("Enter your National ID (e.g., 1234567-A)");
                if (voterID == null || !voterID.matches("\\d{1,7}-[A-Za-z]")) {
                    JOptionPane.showMessageDialog(null, "National ID must be in the format '1234567-A' with up to 7 digits followed by a dash and a single letter.");
                } else {
                    break;
                }
            }

            
            VoterRegistration voter = new VoterRegistration(voterName, voterAge, voterAddress, voterID);
            voters.add(voter);

            int choice = JOptionPane.showOptionDialog(null, "Do you want to register another voter?",
                    "Register Another Voter", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Yes", "No"}, "Yes");

            if (choice != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }

    // Dummy VoterRegistration class for demonstration
    static class VoterRegistration {
        private final String name;
        private final int age;
        private final String address;
        private final String nationalID;

        public VoterRegistration(String name, int age, String address, String nationalID) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.nationalID = nationalID;
        }

        public String getVoterRegistrationInfo() {
            return String.format("Name: %s, Age: %d, Address: %s, National ID: %s%n", name, age, address, nationalID);
        }
    }

    private static void registerCandidate(ArrayList<CandidateRegistration> candidates) {
        while (true) {
            String candidateName = JOptionPane.showInputDialog("Enter Your Name");
            if (candidateName == null || candidateName.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name field cannot be empty.");
                continue;
            }

            int candidateAge;
            while (true) {
                try {
                    candidateAge = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer for age.");
                }
            }

            String candidateAddress = JOptionPane.showInputDialog("Enter Your Address");
            String candidateNationalID = JOptionPane.showInputDialog("Enter Your National ID");
            String candidatePosition = JOptionPane.showInputDialog("Enter the position you are running for");

            CandidateRegistration candidate = new CandidateRegistration(candidateName, candidateAge, candidateAddress, candidateNationalID, candidatePosition);
            candidates.add(candidate);

            int choice = JOptionPane.showOptionDialog(null, "Do you want to register another candidate?",
                    "Register Another Candidate", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Yes", "No"}, "Yes");

            if (choice != JOptionPane.YES_NO_OPTION) {
                break;
            }
        }
    }

    private static void viewRegisteredVoters(ArrayList<VoterRegistration> voters) {
        StringBuilder allVotersInfo = new StringBuilder("All Registered Voters:\n\n");
        for (VoterRegistration v : voters) {
            allVotersInfo.append(v.getVoterRegistrationInfo());
        }
        JOptionPane.showMessageDialog(null, allVotersInfo.toString());
    }

    private static void viewRegisteredCandidates(ArrayList<CandidateRegistration> candidates) {
        StringBuilder allCandidatesInfo = new StringBuilder("All Registered Candidates:\n\n");
        for (CandidateRegistration c : candidates) {
            allCandidatesInfo.append(c.getCandidateInfo());
        }
        JOptionPane.showMessageDialog(null, allCandidatesInfo.toString());
    }

    private static void login(ArrayList<VoterRegistration> voters, ArrayList<CandidateRegistration> candidates) {
        String[] loginOptions = {"Voter Dashboard", "Candidate Dashboard"};
        int loginChoice = JOptionPane.showOptionDialog(null, "Already Registered? Log in to your dashboard:", 
                                                       "Login", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                                                       null, loginOptions, loginOptions[0]);

        switch (loginChoice) {
            case 0: // Voter Dashboard
                // Add your voter dashboard logic here
                JOptionPane.showMessageDialog(null, "Welcome to the Voter Dashboard!");
                break;
            case 1: // Candidate Dashboard
                // Add your candidate dashboard logic here
                JOptionPane.showMessageDialog(null, "Welcome to the Candidate Dashboard!");
                break;
            default:
                break;
        }
    }
}












































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































// import javax.swing.JOptionPane;
// import java.util.ArrayList;
// // import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         ArrayList<VoterRegistration> voters = new ArrayList<>();
//         ArrayList<CandidateRegistration> candidates = new ArrayList<>();

//         // ==========================================================    Welcome Message     ===================================================================


//         // Welcome message and options
//         while (true) {
//             String[] options = {"Register Voter", "Register Candidate", "View Registered Voters", "View Registered Candidates", "Exit"};
//             int choice = JOptionPane.showOptionDialog(null, "Welcome to the Online Voting System!\nPlease select an option:", 
//                                                       "Welcome", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
//                                                       null, options, options[0]);

//             switch (choice) {
//                 case 0: // Register Voter
//                     VoterRegistration(voters);
//                     break;
//                 case 1: // Register Candidate
//                     registerCandidate(candidates);
//                     break;
//                 case 2: // View Registered Voters
//                     viewRegisteredVoters(voters);
//                     break;
//                 case 3: // View Registered Candidates
//                     viewRegisteredCandidates(candidates);
//                     break;
//                 case 4: // Log into voter dashboard
//                     VoterDashboard(voter);
//                     break;
//                 case 5: // Log into voter dashboard
//                     candidateDashboard(candidates);
//                     break;
//                 case 6: // Exit
//                     JOptionPane.showMessageDialog(null, "Thank you for using the Online Voting System!");
//                     System.exit(0);
//                     break;
//                 default:
//                     break;
//             }
//         }
//     }

//         // ==========================================================    Voter Registration     ===================================================================
//         ArrayList<VoterRegistration> voters = new ArrayList<>();
//         // Scanner vote = new Scanner(System.in);

//         while (true) {

//             // System.out.println("Enter your name: ");
//             // String name = vote.nextLine();
//             // System.out.print("Enter your name: ");
//             String voterName = JOptionPane.showInputDialog("Enter your name");
//             if (voterName.isEmpty()) {
//                 JOptionPane.showMessageDialog(null, "Name field cannot be empty.");
//                 continue;
//             }

//             // System.out.println("Enter your age: ");
//             // int age = vote.nextInt();
//             // if (age < 18) {
//             //     System.out.println("Sorry! You are not of the right age to vote yet.");
//             //     vote.nextLine();
//             //     continue;
//             // }
//             // vote.nextLine();
//             // int voterAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//             // if (voterAge < 18) {
//             //     System.out.println("Sorry! You are not of the right age to vote yet.");
//             //     continue;
//             // }
//             // int voterAge;
//             // try {
//             //     voterAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//             //     JOptionPane.showMessageDialog(null, "Your age is: " + voterAge);
//             // } catch (NumberFormatException e) {
//             //     voterAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid input. Please enter a valid integer for age."));
//             // }
//             int voterAge;
//             while (true) {
//                 try {
//                     voterAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//                     if (voterAge < 18) {
//                         JOptionPane.showMessageDialog(null, "Sorry! You are not of the right age to vote yet.");
//                         continue;
//                     }
//                     break;
//                 } catch (NumberFormatException e) {
//                     JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer for age.");
//                 }
//             }


//             // System.out.println("Enter your address: ");
//             // String address = vote.nextLine();
//             // String voterAddress = vote.nextLine();
//             String voterAddress = JOptionPane.showInputDialog("Enter your address");

//             // System.out.println("Enter your National ID: ");
//             // String voterID = vote.nextLine();
//             String voterID = JOptionPane.showInputDialog("Enter your National ID");


//             VoterRegistration voter = new VoterRegistration(voterName, voterAge, voterAddress, voterID);
//             // voter.displayVoterRegistration();
//             voters.add(voter);



//             // System.out.println("Do you want to register another voter? (yes/no) ");
//             // String tryAgain = vote.nextLine();
//             // if (!tryAgain.equalsIgnoreCase("yes")) {
//             //     break;
//             // }
//             // String tryAgain = JOptionPane.showInputDialog("Do you want to register another voter?");
//             // if (!tryAgain.equalsIgnoreCase("yes")) {
//             //     break;
//             // }
//             //     int choice = JOptionPane.showOptionDialog(null, "Do you want to register another voter?",
//             //     JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
//             //     new String[]{"Yes", "No"}, "Yes");
        
//             //     if (choice != JOptionPane.YES_OPTION) {
//             //         break;
//             //     }
//             // }
//             int choice = JOptionPane.showOptionDialog(null, "Do you want to register another voter?",
//             "Register Another Voter", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
//             new String[]{"Yes", "No"}, "Yes");
            
//             if (choice != JOptionPane.YES_OPTION) {
//                 break;
//             }
//     }

//         // System.out.println("All Registered Voters: ");
//         //     for (VoterRegistration v : voters) {
//         //         v.displayVoterRegistration();
//         //     }

//         // vote.close();
//         // JOptionPane.showMessageDialog(null, "All Registered Voters:");
//         // for (VoterRegistration v : voters) {
//         //     JOptionPane.showMessageDialog(null, v.getVoterRegistrationInfo());
//         // }
//         // // scanner.close();
//         // Display all registered voters
//         StringBuilder allVotersInfo = new StringBuilder("All Registered Voters:\n\n");
//         for (VoterRegistration v : voters) {
//             allVotersInfo.append(v.getVoterRegistrationInfo());
//         }
//         JOptionPane.showMessageDialog(null, allVotersInfo.toString());

//         // ==========================================================    Candidate Registration     ===================================================================
       
//         ArrayList<CandidateRegistration> candidates = new ArrayList<>();
//         // Scanner scanner = new Scanner(System.in);

//         while (true) {
//             // System.out.println("Enter your name: ");
//             // String name = scanner.nextLine();
            
//             String candidateName = JOptionPane.showInputDialog("Enter Your Name");
//             if (candidateName == null || candidateName.trim().isEmpty()) {
//                 JOptionPane.showMessageDialog(null, "Name field cannot be empty.");
//                 continue;
//             }

//             // System.out.println("Enter your age: ");
//             // int age = scanner.nextInt();
//             // scanner.nextLine(); // Consume newline
//             // int candidateAge = JOptionPane.showInputDialog("Enter Your Age");
//             // int candidateAge = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));

//             // int candidateAge;
//             // try {
//             //     candidateAge = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
//             //     JOptionPane.showMessageDialog(null,"Your age is: " + candidateAge);
//             // } catch (NumberFormatException e) {
//             //     // JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer for age.");
//             //     candidateAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid input. Please enter a valid integer for age."));
//             // }

//             int candidateAge;
//             while (true) {
//                 try {
//                     candidateAge = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
//                     break;
//                 } catch (NumberFormatException e) {
//                     JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer for age.");
//                 }
//             }

//             // System.out.println("Enter your address: ");

//             // String candidateAddress = scanner.nextLine();
//             String candidateAddress = JOptionPane.showInputDialog("Enter Your Address");

//             // System.out.println("Enter your National ID: ");
//             // String nationalID = scanner.nextLine();

//             String candidateNationalID = JOptionPane.showInputDialog("Enter Your National ID");

//             // System.out.println("Enter the position you are running for: ");
//             // String position = scanner.nextLine();

//             String candidatePosition = JOptionPane.showInputDialog(null, "Enter the position you are running for");

//             CandidateRegistration candidate = new CandidateRegistration(candidateName, candidateAge, candidateAddress, candidateNationalID, candidatePosition);
//             candidates.add(candidate);

//             // String repeatRegister = JOptionPane.showInputDialog(null, "Do you want to register another candidate?");
//             //     // String tryAgain = scanner.nextLine();
//             //     if (!repeatRegister.equalsIgnoreCase("no")) {
//             //         break;
//             //     }
//             // }
//             int choice = JOptionPane.showOptionDialog(null, "Do you want to register another candidate?",
//             "Register Another Candidate", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
//             new String[]{"Yes", "No"}, "Yes");

//             if (choice != JOptionPane.YES_OPTION) {
//                 break;
//             }
//         }

//         StringBuilder allCandidatesInfo = new StringBuilder("All Registered Candidates:\n\n");
//         // System.out.println("All Registered Candidates: ");
//         for (CandidateRegistration c : candidates) {
//             // c.displayCandidateRegistration();
//             allCandidatesInfo.append(c.getCandidateInfo());
//         }
//         JOptionPane.showMessageDialog(null, allCandidatesInfo.toString());




//         // ==========================================================    Database Storage Registration     ===================================================================
//         Database db = new Database();

//         // Create a voter with ID
//         Voter voter = new Voter("voter123", "John Doe", "john.doe@example.com", "hashed_password");
//         db.storeVoterData(voter.getId(), voter);

//         // Create a candidate
//         Candidate candidate = new Candidate("candidate456", "Jane Smith", "Independent", "Better Future for All", "hashed_password");
//         db.storeCandidateData(candidate.getId(), candidate);

//         // Create an election
//         Election election = new Election("election789", "Presidential", "2024-11-01", "2024-11-08");
//         db.storeElectionData(election.getId(), election);

//         // Retrieve data
//         Voter retrievedVoter = db.getVoterData("voter123");
//         Candidate retrievedCandidate = db.getCandidateData("candidate456");
//         Election retrievedElection = db.getElectionData("election789");

//         // Display retrieved information
//         if (retrievedVoter != null) {
//             JOptionPane.showMessageDialog(null, retrievedVoter.toString(), "Retrieved Voter", JOptionPane.INFORMATION_MESSAGE);
//         }
//         if (retrievedCandidate != null) {
//             JOptionPane.showMessageDialog(null, retrievedCandidate.toString(), "Retrieved Candidate", JOptionPane.INFORMATION_MESSAGE);
//         }
//         if (retrievedElection != null) {
//             JOptionPane.showMessageDialog(null, retrievedElection.toString(), "Retrieved Election", JOptionPane.INFORMATION_MESSAGE);
//         }
//     }    
//             // scanner.close();       
// }
















// // public class Main {
// //     public static void main(String[] args) {
// //         Database db = new Database();

// //         Voter voter = new Voter("John Doe", "john.doe@example.com", "hashed_password");
// //         db.storeVoterData("voter123", voter);

// //         Candidate candidate = new Candidate("Jane Smith", "Independent", "Better Future for All", "hashed_password");
// //         db.storeCandidateData("candidate456", candidate);

// //         Election election = new Election("Presidential", "2024-11-01", "2024-11-08");
// //         db.storeElectionData("election789", election);

// //         Voter retrievedVoter = db.getVoterData ("voter123");
// //         Candidate retrievedCandidate = db.getCandidateData("candidate456");
// //         Election retrievedElection = db.getElectionData("election789");
// //     }
// // }