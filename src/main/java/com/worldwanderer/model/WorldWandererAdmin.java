package com.worldwanderer.model;

//Devmini Sheronie Perera Attapttuge S4183290 implemented this class
public class WorldWandererAdmin {
    private int adminId;
    private String username;
    private String role;

    public WorldWandererAdmin(int adminId, String username, String role) {
        this.adminId = adminId;
        this.username = username;
        this.role = role;
    }

    public String manageServiceProvider(ServiceProvider provider, String action) {
        return "Admin " + username + " performed action '" + action + "' on provider " + provider.getName();
    }

    public String setServiceFee(String serviceType, double feeAmount) {
        return "Admin " + username + " set service fee for " + serviceType + " to $" + feeAmount;
    }

    public String viewReports() {
        return "Admin " + username + " viewed platform reports.";
    }

    @Override
    public String toString() {
        return "WorldWandererAdmin{" +
                "id=" + adminId +
                ", username='" + username + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
