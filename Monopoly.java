import java.util.Scanner;
public class Main 
{
    public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for (int i=0;i<T;i++)
        {
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();
            int R3 = sc.nextInt();
            String result = monopoly(R1, R2, R3);
            System.out.println(result);
        }
    }
    public static String monopoly(int R1, int R2, int R3) 
    {
        if (R1 + R2 < R3 || R1 + R3 < R2 || R2 + R3 < R1)
        {
            return "YES";
        }
        else 
        {
            
            return "NO";
        }
    }
}
