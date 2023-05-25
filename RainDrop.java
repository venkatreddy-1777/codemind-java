import java.util.Scanner;
public class RaindropSound 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String raindropSound = convertToRaindropSound(number);
        System.out.println(raindropSound);
    }
    public static String convertToRaindropSound(int number)
    {
        StringBuilder soundBuilder = new StringBuilder();
        if (number % 3 == 0) 
        {
            soundBuilder.append("Pling");
        }
        if (number % 5 == 0) 
        {
            soundBuilder.append("Plang");
        }
        if (number % 7 == 0) 
        {
            soundBuilder.append("Plong");
        }
        if (soundBuilder.length() == 0)
        {
            soundBuilder.append(Integer.toString(number));
        }
        return soundBuilder.toString();
    }
}