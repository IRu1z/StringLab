import java.util.Scanner; // The scanner is imported for inputs by the user

public class StringLab // This establishes the class access and name of the class
{
    public static void main(String [] args)
    {
        String str = " Welcome to the Java String Lab! "; // This is the given string that will be manipulated

        System.out.println(str.length());  // This will print out the # of characters in the string
        System.out.println(str.charAt(7)); // This will print the character at the 7th index
        System.out.println(str.substring(str.indexOf("Java"), str.indexOf("Java") + 4)); // This searches for "java" and then prints it out
        System.out.println(str.toUpperCase()); // This makes the string all uppercase
        System.out.println(str.toLowerCase()); // This makes the string all lowercase
        System.out.println(str.indexOf("Java")); // This finds the index where "java" starts
        System.out.println(str.contains("Lab")); // This checks for the word "lab"
        System.out.println(str.replace("Java", "Java Programming")); // This finds the word "java" and replaces it with "java programming"
        String[] words = str.split(" "); // This splits the string 
        for (String word : words) 
        {
            if (!word.isEmpty()) // This ignores the empty strings
            {
         System.out.println(word); 
            }
        }
        System.out.println(str.trim()); // This takes away or "trims" the leading and trailing spaces in the print
        String compareStr = "java string lab!"; // This is what the other strings are being compared to
        System.out.println(str.trim().equals(compareStr)); // This checks if the trimmed string matches the original
        System.out.println(str.trim().equalsIgnoreCase(compareStr)); // This checks if the trimmed string matches the original but is not case sensitve

        int vowelCount = 0; 
        String vowels = "aeiou"; // This checks for vowels in the string
        for (int i = 0; i < str.length(); i++) 
        {
            if (vowels.indexOf(str.charAt(i)) != -1)
            {
                vowelCount++;
            }
        }
        System.out.println(vowelCount); // This prints the amount of vowels found

        String word = "racecar"; // This is the word being tested to see if it is a palindrome
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
            right--; // These lines check if the word is the same forwards and backwards
        }
        System.out.println("Is " + word + " a palindrome? " + isPalindrome); // This prints out if the tested word is a palindrome or not

        Scanner scanner = new Scanner(System.in); // Scanner for input
        String input;
        do 
        {
            System.out.print("Enter a sentence that contains the word 'Java' "); // This prints what the program is asking the user to do
            input = scanner.nextLine(); // This reads the input
        }
         while (!input.contains("Java")); // This says that while Java is inputted then the program can print "thank you"
        System.out.println("Thank you!");

        StringBuilder sb = new StringBuilder("StringBuilder Lab"); // This makes the stringbuilder project
        sb.append(" - Learning Java"); // This appends the text to the string above 
        sb.insert(sb.indexOf("Lab") + 3, " is fun"); // This searches for the word lab and then adds "is fun" to it
        sb.delete(sb.indexOf("Learning"), sb.indexOf("Learning") + "Learning".length()); // This looks for and deletes "learning" 
        System.out.println(sb); // This prints out the new string
        sb.reverse(); // This reverses the new string 
        System.out.println(sb); // This prints out the reversed string

        StringBuffer sbf = new StringBuffer("Multithreading Lab"); // These lines have essentially the same process
        sbf.append(" - Learning Java");
        sbf.insert(sbf.indexOf("Lab") + 3, " is fun");
        sbf.delete(sbf.indexOf("Learning"), sbf.indexOf("Learning") + "Learning".length());
        System.out.println(sbf);
        sbf.reverse();
        System.out.println(sbf); 
    }
}