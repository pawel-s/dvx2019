
public class Solution2
{
    public static void main(String[] args)
    {
        int count = 0;
        for (String str : args) {
            for (int i = 0; i < str.length(); i++) {
                count += str.charAt(i);
            }
        }
        System.out.println(count);
    }
}
