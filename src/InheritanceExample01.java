class Account {
    String accountNo;
    String ownerName;
    int balance;
    void deposit(int amount) {
        balance += amount;
    }
    int withdraw(int amount) throws Exception {
        if (balance < amount)
            throw new Exception("잔액이 부족합니다.");
        balance -= amount;
        return amount;
    }
}

class CheckingAccount  extends Account  {
    String cardNo;
    int pay(String cardNo, int amount) throws Exception {
        if (!cardNo.equals(this.cardNo) || (balance < amount))
            throw new Exception("지불이 불가능합니다.");
        return withdraw(amount);
    }
}

public class InheritanceExample01 {
    public static void main(String args[]) {
        CheckingAccount obj = new CheckingAccount();
        obj.accountNo = "111-22-33333333";
        obj.ownerName = "홍길동";
        obj.cardNo = "5555-6666-7777-8888";
        obj.deposit(100000);
        try {
            int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
            System.out.println("지불액: " + paidAmount);
            System.out.println("잔액: " + obj.balance);
        }
        catch (Exception e) {
            String msg = e.getMessage();
            System.out.println(msg);
        }
    }
}
