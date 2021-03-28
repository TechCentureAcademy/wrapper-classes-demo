package session1;

public class WrapperDemo {

	public static void main(String[] args) {
		
		
		//8 primitive data types in java
		/*
		 * byte, short, int, long -> whole numbers
		 * float, double -> floating numbers
		 * char -> characters 'a'
		 * boolean -> true/false
		 * 
		 */
		
		int age = 9;
		age = 10;
	
		
		boolean isRight = true;
		
		
		//What do we mean by wrapper types?
		//It means all 8 primitive variables in Java have their corresponding Wrapper classes
		
//		Byte byteValue;
//		Short shortValue;
//		Integer ineIntegerValue;
//		Long longValue;
//		Float floatValue;
//		Double doubleValue;
//		Character charValue; //char
//		Boolean b;
//		
//		
//		Integer num = 12;  
//		String numStr = num.toString();
//		int numPrimitive = num.intValue();
//		
//		
//		System.out.println(numStr);
		
		
		int myPrimValue = 127;   //-128 to +127
		byte byteVal = (byte)myPrimValue;
		System.out.println(byteVal);
		
		
		
		Integer myWrapValue = 12;
		byte byteVal2 = myWrapValue.byteValue();
		
		
		//intValue(), shortValue(), byteValue(), longValue()  -> they all return primitive types
		
		
		//autoboxing or boxing: when Java converts a primitive value to its corresponding wrapper type.
		
		int num = 100;
		Integer numWrap = num; //we autoboxed primitive 100 to Wrapper type 100
	
		
		//unboxing, : When Java converts a wrapper to its corresponding primitive type;
		
		Character charWrapper = 'A';
		char charPrimValue = charWrapper;
		
		
	
		boolean primBoolean = 12 < 20;
		
		//autoboxing primitive boolean to Wrapper Boolean
		Boolean wrapBooelean = primBoolean;
		//auto-unboxing wrapper type to primitive boolean
		boolean unboxedBoolean = wrapBooelean;
		
	
	}
}
