public class Diamond 
{
    public static void main(String[] args) 
	{
        int height = 7;

        for (int i = 1; i <= height; i++) 
		{
            for (int j = i; j < height; j++) 
			{
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) 
			{
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = height - 1; i >= 1; i--) 
		{
            for (int j = height; j > i; j--) 
			{
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) 
			{
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
