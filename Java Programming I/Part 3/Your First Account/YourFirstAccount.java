public class YourFirstAccount {
    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account user = new Account("Arto's account", 100.0);
        user.deposit(20.0);
        System.out.println(user);
        user = null;
    }
}