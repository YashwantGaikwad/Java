import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Hello", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hello Yash");
        boolean matchFound = matcher.find();

        if(matchFound){
            System.out.println("Match Found.");
        }else{
            System.out.println("Match Not Found.");
        }
    }
}
