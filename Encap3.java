class Bank{
    private int acc_no;
    private String name;
    private String email;
    private float amount;
    public int getAcc_no() {
        return acc_no;
    }
    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
}

public class Encap3 {
    public static void main(String[] args) {
        Bank obj = new Bank();
        
        obj.setAcc_no(252423654);
        obj.setName("Yash");
        obj.setEmail("yash@gmail.com");
        obj.setAmount(50000);

        System.out.println("Account no :" + obj.getAcc_no());
        System.out.println("Name:" + obj.getName());
        System.out.println("Email:" + obj.getEmail());
        System.out.println("Amount:"+ obj.getAmount());
    }
}
