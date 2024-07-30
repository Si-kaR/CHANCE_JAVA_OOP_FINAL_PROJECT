public class AdminDashboard {
    
    private Admin admin;

    public AdminDashboard(Admin admin) {
        this.admin = admin;
    }

    public void manageUsers() {
        admin.manageUsers();
    }

    public void setupElections() {
        admin.setupElections();
    }
}
