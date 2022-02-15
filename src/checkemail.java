import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkemail {
    public static void main(String[] args) {
        int counter = 0;
        String email = "roma92@gmail.com";
        Pattern pattern = Pattern.compile("^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$");
        Matcher matcher = pattern.matcher(email);
        while (matcher.find()){
            counter++;
            System.out.println("Match found " +email.substring(matcher.start(), matcher.end())+
                    "Starting at index"+ matcher.start() + " and ending at index" +matcher.end());

        }
        System.out.println("Matches found:" + counter);
    }
}
