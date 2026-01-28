import com.bank.*;

/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Program
{
    public static void main(String[] args)
    {
        SavingsAccount savingAccount0 = new SavingsAccount();
        SavingsAccount savingAccount1 = new SavingsAccount();

        CurrentAccount currentAccount0 = new CurrentAccount("B", "B", 0, 0, 0, 0, 0);
        CurrentAccount currentAccount1 = new CurrentAccount("C", "C", 0, 0, 0, 0, 0);


        currentAccount0.deposit(1000);
        currentAccount1.deposit(1000);

        System.out.println("First current account:");
        System.out.print(currentAccount0);
        System.out.println("\nSecond current account:");
        System.out.print(currentAccount1);
        System.out.print("\n------------------------------------\n\n");


        Account.transfer(currentAccount0, savingAccount0, 1000);
        
        System.out.println("First current account:");
        System.out.print(currentAccount0);
        System.out.println("\nSecond current account:");
        System.out.print(currentAccount1);
        System.out.println("\nFirst saving account:");
        System.out.print(savingAccount0);
        System.out.println("\nSecond saving account:");
        System.out.print(savingAccount1);
        System.out.print("\n------------------------------------\n\n");

    }
}