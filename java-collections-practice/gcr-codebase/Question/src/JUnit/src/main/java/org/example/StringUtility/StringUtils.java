package JUnit.src.main.java.org.example.StringUtility;

public class StringUtils {
    public String reverse(String s){
        StringBuilder str = new StringBuilder(s);

        return str.reverse().toString();
    }

    public boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public String toUpperCase(String s){
        if (s == null) return null;

        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                c = (char)(c - 32);
            }
            str.append(c);
        }
        return str.toString();
    }
}
