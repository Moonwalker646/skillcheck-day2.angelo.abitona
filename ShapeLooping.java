public class ShapeLooping {

    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++)
        {
            System.out.print(i);

            for (int j = 5; j >= i; j--)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <=6; i++)
        {
            for (int j = 6; j >=i; j-- )
            {
                System.out.print("*");
            }
                System.out.println();

        }

        System.out.println();

        for (int i = 1; i <= 6; i++ )
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
                System.out.println();

        int n = 6;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (j > i ) System.out.print("*");
                else System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        int a = 6;
        for (int i = 5; i >= 0; i--)
        {
            for(int j = 1; j <= a; j++)
            {
                if(j > i)System.out.print("&");
                else System.out.print(j);

            }
            System.out.println();
        }




    }
}

