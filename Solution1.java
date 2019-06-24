import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Solution1
{
    public static void main(String[] args) throws IOException
    {
       int palindrome = 0;
       for (String line : args) {
            if (isPalindrome(line)) {
                palindrome++;
            }
       }
       System.out.println(palindrome);
    }

    private static boolean isPalindrome(String line) {
        for (int i = 0; i < line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
