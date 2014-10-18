package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else{
		
		return splitta(text);
	}
	}
	private static int splitta(String text){
		String[] input;
		String a = text;
		if(a.contains("//")){
			String breyta = Character.toString(a.charAt(2));
			a = a.replace(breyta , ",").trim();
			a = a.replace("/", ",").trim();
                        a = a.replace(",", " ").trim();
                        a = a.replace(" ", ",").trim();
	} 
	a = a.replace("\n",",");
	input = a.split(",");

	int sum = 0;
	for(int i = 0; i < input.length; i++){
		sum += Integer.parseInt(input[i].trim());
	}
	return sum;
		
	}
	} 
