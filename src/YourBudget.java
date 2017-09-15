import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class YourBudget
{

    public static void main(String[] args)
    {
        new GUI();
    }

}

class Function
{

    File file;
    double balance, monthlyPayments, weeklyPayments;


    public Function()

    {
        generateFile("configFile");
        generateFile("expenses");
        generateFile("bills");
    }

    boolean login(String userName, String password)
    {
        return true;
    }

    void generateFile(String fileName)
    {
        try
        {

            file = new File(fileName + ".txt");
            if(file.createNewFile())
            {
                System.out.println(fileName + " created!");
            }
            else
            {
                System.out.println(fileName + " already made!");
            }
        }
        catch(IOException e)
        {


        }
    }

    void removeFile(String fileName)
    {
        file = new File(fileName + ".txt");
        file.delete();
    }

    void deposit(double depositedAmount)
    {
        balance = balance + depositedAmount;
    }

    double withdraw(double withdrawedAmount)
    {

        balance = balance - withdrawedAmount;
        return balance;
    }


    double getBalance()
    {
        return balance;
    }

    void readConfig(String fileName)
    {

    }
}

class GUI
{
    private Boolean exit = false;

    public GUI()
    {
        final Function function = new Function();
        while(exit == false)
        {
            File config = new File("configFile.txt");
            File expense = new File("expenses.txt");
            File bills = new File("bills");
            System.out.println("Close Application? Type 'true'");
            Scanner scan = new Scanner(System.in);
            exit = Boolean.valueOf(scan.next());

        }
    }

}





