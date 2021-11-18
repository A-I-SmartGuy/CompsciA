import java.util.Scanner;

public class Karlson
{
	public static void main(String[] args)
	{
        boolean wishlistedKarlsonOnSteam = false;
        int wishlisted = 0;
        Scanner sc = new Scanner(System.in);
        if(wishlisted == 0) {
            wishlistedKarlsonOnSteam = false;
        }else if(wishlisted == 1) {
            wishlistedKarlsonOnSteam = true;
        }
        
        if (!wishlistedKarlsonOnSteam)
        {
            System.out.println("Oh no");
            System.out.println(".");
            System.out.println(".");
            System.out.println("Did you forget to wishlist Karlson on Steam?");
            System.out.println(".");
            System.out.println(".");
            
            wishlisted = sc.nextInt();

            sc.close();
            
        }


	}
}
