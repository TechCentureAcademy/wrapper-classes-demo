package session1;

import java.util.Scanner;

public class ParsingWithWrappers {

	
	public static void main(String[] args) {
		
//		//lets say these prices are coming from the UI
//		String[] prices = {"$5,678.00   "," $67,923.00","$23,123.000","$100,555.000"};
//		
//		
//		//the expected prices are coming from excel sheet and they are in numbers
//		double[] expectedPrices = {5678.0, 67922.0, 23123.0,100555.0};
//		
//		
//		for(int i = 0; i < prices.length; i++) {
//			//                 $5,678.00         5,678.00       5678.00 
//			String cleanPrice = prices[i].replace("$", "").replace(",", "").trim(); //5678.00
//			double parsedPrice = Double.parseDouble(cleanPrice); //5678.0
//			
//			if (parsedPrice == expectedPrices[i]) {
//				System.out.println("Price is correct");
//			}else {
//				System.out.println("Expected: " + expectedPrices[i] + " actual: " + parsedPrice);
//			}
//		}
		
		
//		String strPrice = "12345dds";  // "12345" -> 12345
//		int intPrice = Integer.parseInt(strPrice.replaceAll("[a-zA-Z]", ""));
//		
//		System.out.println(intPrice);
//		
		
//		
//		System.out.println("Please enter a number as a String and I will convert it to a primitive int ");
//		
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
//		
//		String cleanInput = input.replaceAll("[a-zA-Z]", "").replaceAll("[$&+,:;=?@#|'<>._^*()%!-]", "");
//		
//		int parsedInput = Integer.parseInt(cleanInput, 4);
//		
//		System.out.println("Parsed:  \"" + input +  "\"   to " + parsedInput    );
		
	
		System.out.println(  Long.parseLong("128856565798")   );
		
		
		long number = 3242345436L;
		
		String strNumber1 = Long.valueOf(number).toString();
		
		String strNumber2 = String.valueOf(number);
		
		String strNumber3 = number+"";
		
	}
}
