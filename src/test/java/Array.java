public class Array {
    public static void main(String[] args) {
        int[] Number = new int[15];
        int n = 1 , sum = 0, Average;

        for (int i = 0; i < Number.length; i++ ){
            Number[i] = n;
            n = n * 2;
            System.out.println(Number[i]);
            sum = Number[i] + sum;

        }
        System.out.println("Sum of All Input is : " + sum );
        Average = sum / 15;
        System.out.println("Average of the Sum: " + Average);

    }
}
