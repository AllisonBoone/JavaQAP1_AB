//Test the Account class.
//Creates 2 accounts with initial balances.
public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account(5000);
        Account account2 = new Account(4000);

    //Displays the initial balances of the 2 accounts.
        System.out.println("Initial balance of account 1: $" + account1.getBalance());

        System.out.println("Initial balance of account 2: $" + account2.getBalance());

    //Transfers $1000 from account1 to account2.
        account1.transfer(account2, 1000);

    //Displays the balances of 2 accounts after the transfer.
        System.out.println("Balance of account 1 after transfer: $" + account1.getBalance());

        System.out.println("Balance of account 2 after transfer: $" + account2.getBalance());
    }
    
}
