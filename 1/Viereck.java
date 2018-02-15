
public class Viereck
{
    public static void main(String args[])
    {
        if (args.length < 2)
        {
            System.out.println("Usage:\n\tViereck <breite> <hoehe>");
            System.exit(1);
        }

        char viereck[][] = new char[40][40];
        int breite = Integer.parseInt(args[0]);
        int hoehe = Integer.parseInt(args[1]);

        for (int i = 1; i <= 40; i++)
        {
            for (int j = 1; j <= 40; j++)
            {

            }
        }
    }
}
