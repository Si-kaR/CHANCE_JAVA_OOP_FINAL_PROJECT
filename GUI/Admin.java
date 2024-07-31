import javax.swing.JOptionPane; // Ensure you have imported the necessary library

public class Admin {
    private String name;
    private String email;

    public Admin(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void manageUsers() {
        // Implementation for managing users
        JOptionPane.showMessageDialog(null, "Managing users...", "Admin Action", JOptionPane.INFORMATION_MESSAGE);
        // Add specific user management logic here
    }

    public void setupElections() {
        // Implementation for setting up elections
        JOptionPane.showMessageDialog(null, "Setting up elections...", "Admin Action", JOptionPane.INFORMATION_MESSAGE);
        // Add specific election setup logic here
    }
}













































// import javax.swing.JOptionPane; // Ensure you have imported the necessary library

// public class Admin {
//     private String name;
//     private String email;

//     public Admin(String name, String email) {
//         this.name = name;
//         this.email = email;
//     }

//     public void manageUsers() {
//         // Implementation for managing users
//         JOptionPane.showMessageDialog(null, "Managing users...", "Admin Action", JOptionPane.INFORMATION_MESSAGE);
//     }

//     public void setupElections() {
//         // Implementation for setting up elections
//         JOptionPane.showMessageDialog(null, "Setting up elections...", "Admin Action", JOptionPane.INFORMATION_MESSAGE);
//     }
// }
