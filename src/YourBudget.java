import java.util.Scanner;

public class YourBudget
{

    public static void main(String[] args)
    {
        new GUI();
    }

}

class Function
{
    public Function()
    {

    }

    void generateFile(String fileName)
    {

    }

    void removeFile(String fileName)
    {

    }

    void deposit(double depositedAmount)
    {

    }

    void withdraw(double withdrawedAmount)
    {

    }

    void generateReport()
    {

    }
}

class GUI
{
    private Boolean exit = false;
    public GUI()
    {
        while(exit == false)
        {
            System.out.println("Close Application? Type 'true'");
            Scanner scan = new Scanner(System.in);
            exit = Boolean.valueOf(scan.next());
        }
    }

}





