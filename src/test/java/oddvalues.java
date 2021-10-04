import java.util.Arrays;
import java.util.Scanner;

public class oddvalues {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 5;
        int numbers[] = new int[n];

        System.out.println("Please input 5 integer values: ");
        for(int i = 0; i < n; ++i)
        {
            numbers[i] = scan.nextInt();
        }
        displayOdd(numbers);
        getOddValues(numbers);
        scan.close();

    }
    public static void getOddValues(int[] numbers)
    {
        for(int i=0;i<numbers.length;i++){

            if(numbers[i]%2!=0){
                System.out.println(numbers[i]);
            }
        }

    }
        public static void displayOdd(int[] numbers)
        {
            System.out.println("Odd Values : ");



        }
    }


