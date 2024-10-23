import javax.swing.tree.ExpandVetoException;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }
    public static <T extends Exception> void doWork(T t)
    {
        try
        {

        }
        catch(T e)
        {
            System.out.println(e.getMessage());
        }
    }
}