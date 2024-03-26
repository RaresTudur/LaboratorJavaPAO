import java.util.regex.*;

public class Regex_String
{
    public static void main(String[] args)
    {
        System.out.println("[abc]: " + Pattern.matches("[abc]", "a"));
        System.out.println("[^abc]: " + Pattern.matches("[^abc]", "d"));
        System.out.println("[a-z]: " + Pattern.matches("[a-z]", "x"));
        System.out.println("[a-zA-Z]: " + Pattern.matches("[a-zA-Z]", "Q"));
        System.out.println("[a-z][A-Z]: " + Pattern.matches("[a-z][A-Z]", "aB"));
        System.out.println("[abc]+: " + Pattern.matches("[abc]+", "abacaba"));
        System.out.println("[abc]*: " + Pattern.matches("[abc]*", "abc"));
        System.out.println("[abc]{5}: " + Pattern.matches("[abc]{5}", "aabbc"));
        System.out.println("[abc]{5,}: " + Pattern.matches("[abc]{5,}", "aaabbbccc")); // true
        System.out.println("[abc]{5,10}: " + Pattern.matches("[abc]{5,10}", "ababacabab")); // true
    }
}
