import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class YourBudget
{

    public static void main(String[] args)
    {
        new Function();
        new GUI();
    }

}

class Function
{

    File file;
    public Function()
    {
        generateFile("configFile");
    }

    void generateFile(String fileName)
    {
        try
        {

            file = new File(fileName);
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

    }

    void deposit(double depositedAmount)
    {

    }

    void withdraw(double withdrawedAmount)
    {

    }

    void generateReport(String fileName)
    {

    }

    void createFile(String fileName)
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





