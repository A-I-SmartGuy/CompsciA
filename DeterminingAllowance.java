public class DeterminingAllowance
{
	public static void main(String[] args)
	{
		final double ALLOWANCE = 8.75;
		int age = 16;
		boolean isOldEnough = true;

		System.out.print("Gina’s age is ");
		System.out.println(age);
		System.out.print("Eligible for allowance? ");
		System.out.println(isOldEnough);
		System.out.print("Gina’s weekly allowance is $");
		System.out.println(ALLOWANCE);
		System.out.println();
		
		System.out.print("Carl’s age is ");
		System.out.println(age - 3);
		System.out.print("Eligible for allowance? ");
		System.out.println(isOldEnough);
		System.out.print("Carl’s weekly allowance is $");
		System.out.println(ALLOWANCE);
		System.out.println();
		
		System.out.print("Carl’s age is ");
		System.out.println(age - 3 - 10);
		System.out.print("Eligible for allowance? ");
		System.out.println(!isOldEnough);
		System.out.print("Carl’s weekly allowance is $");
		System.out.println("0.00");
	}
}