package JavaCoding;

import java.util.HashSet;

public class SizeOfHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hSet = new HashSet();

		System.out.println("size of HashSet : "+ hSet.size());
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		
		
		System.out.println("size of HashSet after addition : "+ hSet.size());
		    
	}

}

