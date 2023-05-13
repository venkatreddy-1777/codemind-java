import java.util.*;
public class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c,avg;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=a+b;
        avg=c/2;
        System.out.format("%.4f",avg);
    }
}

