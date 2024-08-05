import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<VoterRegistration> voters = new ArrayList<>();
        ArrayList<CandidateRegistration> candidates = new ArrayList<>();
        ArrayList<VoterRegistration> voterRegistrations = new ArrayList<>();
        ArrayList<CandidateRegistration> candidateRegistrations = new ArrayList<>();

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

    private static void registerVoter(ArrayList<VoterRegistration> voters) {
        while (true) {
            String voterName;
            while (true) {
                voterName = JOptionPane.showInputDialog("Enter your name");
                if (voterName == null || !voterName.matches("[a-zA-Z ]+")) {
                    JOptionPane.showMessageDialog(null, "Name must contain only letters and spaces.");
                } else {
                    break;
                }
            }

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

            String voterAddress = JOptionPane.showInputDialog("Enter your address");
            if (voterAddress == null || voterAddress.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Address cannot be empty.");
                continue;
            }

            String voterID;
            while (true) {
                voterID = JOptionPane.showInputDialog("Enter your National ID (e.g., 1234567-A)");
                if (voterID == null || !voterID.matches("\\d{1,7}-[A-Za-z]")) {
                    JOptionPane.showMessageDialog(null, "National ID must follow format '1234567-A'");
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


    private static void registerCandidate(ArrayList<CandidateRegistration> candidates) {
        while (true) {
            // Validate name: Only letters and spaces
            String candidateName;
            while (true) {
                candidateName = JOptionPane.showInputDialog("Enter your name");
                if (candidateName == null || !candidateName.matches("[a-zA-Z ]+")) {
                    JOptionPane.showMessageDialog(null, "Name must contain only letters and spaces.");
                } else {
                    break;
                }
            }

            int candidateAge;
            while (true) {
                try { // ensuring max numbers is 3 digits
                    String ageInput = JOptionPane.showInputDialog("Enter your age");
                    if (ageInput == null || !ageInput.matches("\\d{1,3}")) {
                        JOptionPane.showMessageDialog(null, "Age must be a valid number with up to 3 digits.");
                        continue;
                    } // checking age limit
                    candidateAge = Integer.parseInt(ageInput);
                    if (candidateAge < 18) {
                        JOptionPane.showMessageDialog(null, "Candidates must be at least 18 years old to register.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer for age.");
                }
            }

            // Validate address: Cannot be empty
            String candidateAddress;
            while (true) {
                candidateAddress = JOptionPane.showInputDialog("Enter your address");
                if (candidateAddress == null || candidateAddress.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Address cannot be empty.");
                } else {
                    break;
                }
            }

            // Validate National ID: Format should be up to 7 digits followed by a dash and a single letter
            String candidateNationalID;
            while (true) { // setting rule for national ID
                candidateNationalID = JOptionPane.showInputDialog("Enter your National ID (e.g., 1234567-A)");
                if (candidateNationalID == null || !candidateNationalID.matches("\\d{1,7}-[A-Za-z]")) {
                    JOptionPane.showMessageDialog(null, "National ID must be in the format '1234567-A'");
                } else {
                    break;
                }
            }

            // Validate position: Only letters and spaces
            String candidatePosition;
            while (true) {
                candidatePosition = JOptionPane.showInputDialog("Enter the position you are running for");
                if (candidatePosition == null || !candidatePosition.matches("[a-zA-Z ]+")) {
                    JOptionPane.showMessageDialog(null, "Position must contain only letters and spaces.");
                } else {
                    break;
                }
            }

            CandidateRegistration candidate = new CandidateRegistration(candidateName, candidateAge, candidateAddress, candidateNationalID, candidatePosition);
            candidates.add(candidate);

            int choice = JOptionPane.showOptionDialog(null, "Do you want to register another candidate?",
                    "Register Another Candidate", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Yes", "No"}, "Yes");

            if (choice != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }

    private static void viewRegisteredVoters(ArrayList<VoterRegistration> voters) {
        StringBuilder allVotersInfo = new StringBuilder("ALL REGISTERED VOTERS\n\n");
        for (VoterRegistration v : voters) { // adding all voters info to the list for display using the method
            allVotersInfo.append(v.getVoterRegistrationInfo());
        }
        JOptionPane.showMessageDialog(null, allVotersInfo.toString());
    }

    private static void viewRegisteredCandidates(ArrayList<CandidateRegistration> candidates) {
        StringBuilder allCandidatesInfo = new StringBuilder("ALL REGISTERED CANDIDATES\n\n");
        for (CandidateRegistration c : candidates) { // showing all the candidates with the help of the method. 
            allCandidatesInfo.append(c.getCandidateInfo());
        }
        JOptionPane.showMessageDialog(null, allCandidatesInfo.toString());
    }


    private static ArrayList<Voter> convertVoters(ArrayList<VoterRegistration> voterRegistrations) {
        ArrayList<Voter> voters = new ArrayList<>();
        for (VoterRegistration voterRegistration : voterRegistrations) {
            voters.add(new Voter(voterRegistration.getName(), voterRegistration.getId(), voterRegistration.getAge(), voterRegistration.getAddress(), "defaultPassword"));
        }
        return voters;
    }


    private static ArrayList<Candidate> convertCandidates(ArrayList<CandidateRegistration> candidateRegistrations) {
        ArrayList<Candidate> candidates = new ArrayList<>();
        for (CandidateRegistration candidateRegistration : candidateRegistrations) {
            candidates.add(new Candidate(candidateRegistration.getName(), candidateRegistration.getNationalID(), candidateRegistration.getPosition(), "defaultManifesto", "defaultPassword"));
        }
        return candidates;
    }

    private static void login(ArrayList<VoterRegistration> voterRegistrations, ArrayList<CandidateRegistration> candidateRegistrations) {
        ArrayList<Voter> voters = convertVoters(voterRegistrations);
        ArrayList<Candidate> candidates = convertCandidates(candidateRegistrations);

        String[] loginOptions = {"Voter Dashboard", "Candidate Dashboard"};
        int loginChoice = JOptionPane.showOptionDialog(null, "Already Registered? Log in to your dashboard:",
                "Login", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, loginOptions, loginOptions[0]);
        switch (loginChoice) {
            case 0:
                voterDashboard(voters, voterRegistrations, candidates);
                break;
            case 1:
                candidateDashboard(candidates, candidateRegistrations);
                break;
            default:
                break;
        }
    }
        

    private static void voterDashboard(ArrayList<Voter> voters, ArrayList<VoterRegistration> voterRegistrations, ArrayList<Candidate> candidates) {
        while (true) {
            String voterID;
            while (true) {
                voterID = JOptionPane.showInputDialog("Enter your National ID (e.g., 1234567-A) to authenticate:");
                if (voterID == null || !voterID.matches("\\d{1,7}-[A-Za-z]")) {
                    JOptionPane.showMessageDialog(null, "National ID must be in the format '1234567-A'");
                } else {
                    break;
                }
            }

            String password = JOptionPane.showInputDialog("Enter your password");
            boolean authenticated = true;
            

            if (!authenticated) {
                JOptionPane.showMessageDialog(null, "Authentication failed. Please try again.");
                continue;
            }

            int choice = JOptionPane.showOptionDialog(null, "Do you want to logout?",
                    "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Yes", "No"}, "Yes");

            if (choice == JOptionPane.YES_OPTION) {
                break;
            } else if (choice == JOptionPane.NO_OPTION) {
                for (Voter voter : voters) {
                    if (voter.getId().equals(voterID) && voter.getPassword().equals(password)) {
                        JOptionPane.showMessageDialog(null, "Welcome to your voter dashboard, " + voter.getName());
                        authenticated = true;
                        // Proceed with voter-specific functionalities
                        String[] candidateNames = candidates.stream().map(Candidate::getName).toArray(String[]::new);
                        int candidateIndex = JOptionPane.showOptionDialog(null, "Select a candidate to vote for:", "Vote",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, candidateNames, candidateNames[0]);
    
                        if (candidateIndex >= 0 && candidateIndex < candidateNames.length) {
                            // Cast vote
                            Ballot ballot = new Ballot(candidateNames);
                            ballot.authenticate("secretPassword"); // Assuming the voter knows the password
                            ballot.castVote(candidateIndex);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: Invalid candidate selection.");
                        }
                        return;
                        // break;
                    }
                }
            }
        }
    }


    private static void candidateDashboard(ArrayList<Candidate> candidates, ArrayList<CandidateRegistration> candidateRegistrations) {
        while (true) {
            String candidateID;
            while (true) {
                candidateID = JOptionPane.showInputDialog("Enter your National ID (e.g., 1234567-A) to authenticate:");
                if (candidateID == null || !candidateID.matches("\\d{1,7}-[A-Za-z]")) {
                    JOptionPane.showMessageDialog(null, "National ID must be in the format '1234567-A'");
                } else {
                    break;
                }
            }

            String password = JOptionPane.showInputDialog("Enter your password");
            boolean authenticated = false;
            for (Candidate candidate : candidates) {
                if (candidate.getId().equals(candidateID) && candidate.getPassword().equals(password)) {
                    JOptionPane.showMessageDialog(null, "Welcome to your candidate dashboard, " + candidate.getName());
                    authenticated = true;

                    // Proceed with candidate-specific functionalities
                    // Show results
                    String[] candidateNames = candidates.stream().map(Candidate::getName).toArray(String[]::new);
                    Ballot ballot = new Ballot(candidateNames);
                    ballot.authenticate("secretPassword"); // Assuming the candidate knows the password
                    ballot.displayResults();
                    return;
                    // break;
                }
            }

            if (!authenticated) {
                JOptionPane.showMessageDialog(null, "Authentication failed. Please try again.");
                continue;
            }

            int choice = JOptionPane.showOptionDialog(null, "Do you want to logout?",
                    "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Yes", "No"}, "Yes");

            if (choice == JOptionPane.YES_OPTION) {
                break;
            }
        }
    }
}
// // - - - -  - - - -  - - - -  - - - -  - - - -  - - - - GUI SYNTAX











