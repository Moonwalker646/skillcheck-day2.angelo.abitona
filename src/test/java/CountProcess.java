import java.util.Scanner;

public class CountProcess
{
    public static void main(String[] args)
    {
        Scanner N = new Scanner(System.in);
        System.out.print("Enter a Word : ");
        String Words = N.nextLine();
        Words = Words.toLowerCase();

            System.out.println("Count of Words: " + countWords(Words));
            System.out.println("Count of Vowels : " + CountVowelConsonant(Words));
            System.out.println("Count of Specified Letter [a] : " + Specifiedletters(Words));
            System.out.println("Count of Numbers : " + CNumber(Words));

    }


    public static int CountVowelConsonant(String Words)
    {

        int vCount = 0, cCount = 0;


        String str = Words;


        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++)
        {
                //count of consonant
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {

                vCount++;
            }
            //coumt of vowel
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {

                cCount++;
            }

        }

        System.out.println("Count of Consonants: " + cCount);

        return vCount;


    }
    //count of specifiedletters
    public static int Specifiedletters(String words)
    {
        {
            char search = 'a';
            int count = 0;
            for (int i = 0; i < words.length() ; i++)
            {
                if (words.charAt(i) == search) count++;
            }
            return count;
        }
    }

        //count of numbers
        public static int CNumber(String Words)
        {
            int numCount = 0;
            for (int i = 0; i < Words.length(); i++) {
                char ch = Words.charAt(i);
                if (ch == '0' || ch == '1' || ch == '2' || ch == '3'
                        || ch == '4' || ch == '5' || ch == '6'
                        || ch == '7' || ch == '8' || ch == '9') {
                    numCount++;
                }
            }
            return numCount;
        }

        //count of words
    public static int countWords(String Words)
    {
        int count = 1;
        if (!(" ".equals(Words.substring(0, 1))) || !(" ".equals(Words.substring(Words.length() - 1))))
        {
            for (int i = 1; i < Words.length(); i++)
            {
                if (Words.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 0;
        }
        return count; // returns 0 if string starts or ends with space " ".
    }
}
