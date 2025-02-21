public class Triangle
{

    public static void main(String[] args) 
	{

        int height = 7;

        for (int i = 1; i <= height; i++) 
		{
            // Print leading spaces
            for (int j = i; j < height; j++) 
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
