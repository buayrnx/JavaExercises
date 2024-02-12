package ObjectOP;

public class User extends Person{
    private String email;
    private double balance;

    public User(String name, String surname, String email, double balance) {
        super();
        this.setName(name);
        this.setSurname(surname);
        this.setEmail(email);
        this.setBalance(balance);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
