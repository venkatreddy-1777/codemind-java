import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,cap;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        cap=2*a*b*c*512;
        System.out.println(cap);
    }
}