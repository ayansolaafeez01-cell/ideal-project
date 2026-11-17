public class Account {
    public boolean checkaccount() {
        return false;
    }
  private int balance = 0;

    public void deposit(int amount) {
        balance = balance + amount;
        }

        public int getBalance() {
            return balance;
        }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }
    }


