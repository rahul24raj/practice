package JavaCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckParticularKeyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> idToName = new HashMap<Integer, String>() 
		{ 
			{
				put(1, "Johnny"); put(12, "Root"); put(3, "Shane"); 
	}
		};
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println(idToName); 
		System.out.println("Please enter a key to check in Map?"); 
		int key = scanner.nextInt(); 
		// checking if key exists in HashMap 
		if (idToName.containsKey(key)) 
		{ 
			System.out.println("given key exits in Map"); 
		} 
		else { 
			System.out.println("given key doesn't exists in Map"); 
			} 
		
	}

}
