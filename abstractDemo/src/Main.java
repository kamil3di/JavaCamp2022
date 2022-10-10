public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new SqlDatabaseManager();
        customerManager.getCustomers();

        CustomerManager customerManager1 = new CustomerManager();
        customerManager1.databaseManager = new OracleDatabaseManager();
        customerManager1.getCustomers();
    }
}