import java.util.regex.Pattern;
import java.util.regex.Matcher;

class CheckPattern {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[A-Z].*.");
		String sentence1 = new String("Ab.");
		String sentence2 = new String("ab.");
		Matcher matcher1 = pattern.matcher(sentence1);
		Matcher matcher2 = pattern.matcher(sentence2);
		if(matcher1.matches()){
			System.out.println("First sentence matches");
		} else {
			System.out.println("First sentence doesn't matches");
		}
		if(matcher2.matches()){
			System.out.println("Second sentence matches");
		} else {
			System.out.println("Second sentence doesn't matches");
		}
	}
}