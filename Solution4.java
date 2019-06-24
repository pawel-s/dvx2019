public class Solution4
{
    public static void main(String[] args)
    {
        int n = Integer.valueOf(args[0]);
        
        String str = "1";
        for (int i = 1; i < n; i++) {
            str = next(str);
        }

        System.out.println(sumOfDigits(str));
    }

    private static String next(String str) {
        int c = 0;
        char ch = str.charAt(0);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length()) {
                s.append("" + c + ch);
            } else if (ch != str.charAt(i)) {
                s.append("" + c + ch);
                ch = str.charAt(i);  
                c = 1;              
            } else {
                c++;
            }
        }
        return s.toString();
    }

    private static int sumOfDigits(String str) {
        int s = 0;
        for (int i = 0; i < str.length(); i++) {
            s += str.charAt(i) - '0';
        }
        return s;
    }
}
