import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //String x = s.replaceAll("[?,. _'@;]", ";");
        String x = s.replaceAll("[?!,. _'@;]", " ");
        String[] y = x.split("\\s+");
        /*
        /TIP We use the regular expression \\s+ to split the string.
        \\s matches any whitespace character (space, tab, newline, etc.),
        and the + means "one or more." This ensures that consecutive
        spaces are treated as a single delimiter
        */
        System.out.println(y.length);
        for (String string : y) {
            System.out.println(string);
        }

        scan.close();
    }
}
