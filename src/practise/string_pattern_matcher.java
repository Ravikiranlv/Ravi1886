package practise;

/*
O/P:-
true
false
 
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author ravik
 *
 */
public class string_pattern_matcher {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("Ravikiran lv");
		Matcher match = pattern.matcher("Ravikiran lv");
		boolean matches = match.matches();
		System.out.println(matches);

		boolean ma = Pattern.compile("Ravilv").matcher("Ravi").matches();
		System.out.println(ma);
	}
}
