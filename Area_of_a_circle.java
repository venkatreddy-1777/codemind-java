import java.util.Scanner;
public class AreaOfCircle
{
    public static void main(String[]args)
    {
        int r;
        double pi=3.14,area;
        Scanner sc= new Scanner(System.in);
        r=sc.nextInt();
        area=pi*r*r;
        System.out.format("%.2f
", area);
    }
}