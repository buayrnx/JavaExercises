package ObjectOP;

public class Main {
    public static void main(String[] args) {
        User user = new User("Buse","Ayrancı", "ssşdksapğmasp@gmail.com", 1000);
        //Update some values
        user.setName("Buse");
        user.setSurname("Ayrancıoğlu");
        user.setEmail("dfnoıgsadossmdæ@gmail.com");
        user.setBalance(60000.5);
        System.out.println("Full name: " + user.getName() + " " + user.getSurname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Balance: " + user.getBalance());

    }
}
