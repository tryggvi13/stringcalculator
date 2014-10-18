package is.ru.stringcalculator;

import java.util.regex.Pattern;
public class NegativeNumberException;
public class Calculator {

	public static int add(String text){
		/*String testString = "/";
		testString += "/..*";*/
		if(text.equals("")){
			return 0;
		}
		/*else if(Pattern.matches(testString, text)){
                        return sum(splitNumbers(text, text.charAt(2)));
                }*/
		else if(text.contains(",") | text.contains("\n")){
			return sum(splitNumbers(text));
		}
		else return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",|\n");
	}
	private static String[] splitNumbers(String numbers, char del){
		return numbers.split(Character.toString(del));
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		if(toInt(number) < 1000)
		    total += toInt(number);
		}
		return total;
    }
}
