public class ReverseTriangle 
{

    public static void main(String[] args) 
	{
        int height = 7;

        for (int i = height; i >= 1; i--) 
		{
            // Print leading spaces
            for (int j = height; j > i; j--) 
			{
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) 
			{
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
