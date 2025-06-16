import java.util.Scanner;

public class StringLab
{
    public static void main(String [] args)
    {
        String str = " Welcome to the Java String Lab! ";

        System.out.println(str.length());
        System.out.println(str.charAt(7));
        System.out.println(str.substring(str.indexOf("Java"), str.indexOf("Java") + 4));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("Java"));
        System.out.println(str.contains("Lab"));
        System.out.println(str.replace("Java", "Java Programming"));
        String[] words = str.split(" ");
        for (String word : words) 
        {
            if (!word.isEmpty()) 
            {
         System.out.println(word);
            }
        }
        System.out.println(str.trim());
        String compareStr = "java string lab!";
        System.out.println(str.trim().equals(compareStr));
        System.out.println(str.trim().equalsIgnoreCase(compareStr));

        int vowelCount = 0;
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) 
        {
            if (vowels.indexOf(str.charAt(i)) != -1)
            {
                vowelCount++;
            }
        }
        System.out.println(vowelCount);

        String word = "racecar";
        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = true;
        while (left < right) 
        {
            if (word.charAt(left) != word.charAt(right)) 
            {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is " + word + " a palindrome? " + isPalindrome);

        Scanner scanner = new Scanner(System.in);
        String input;
        do 
        {
            System.out.print("Enter a sentence that contains the word 'Java': ");
            input = scanner.nextLine();
        }
         while (!input.contains("Java"));
        System.out.println("Thank you!");

        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        sb.delete(sb.indexOf("Learning"), sb.indexOf("Learning") + "Learning".length());
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        StringBuffer sbf = new StringBuffer("Multithreading Lab");
        sbf.append(" - Learning Java");
        sbf.insert(sbf.indexOf("Lab") + 3, " is fun");
        sbf.delete(sbf.indexOf("Learning"), sbf.indexOf("Learning") + "Learning".length());
        System.out.println(sbf);
        sbf.reverse();
        System.out.println(sbf);
    }
}