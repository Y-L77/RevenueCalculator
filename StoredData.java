public class StoredData {
    private static double hoursWorked = 0;
    private static double moneyEarned = 0;
    private static double gigsCompleted = 0;

    public static double getHours() {
        return hoursWorked;
    }

    public static double getRevenue() {
        return moneyEarned;
    }

    public static double getGigs() {
        return gigsCompleted;
    }

    public static void addHours(double amount) {
        hoursWorked += amount;
    }

    public static void addMoney(double amount) {
        moneyEarned += amount;
    }

    public static void addCompleted(double amount) {
        gigsCompleted += amount;
    }
}
