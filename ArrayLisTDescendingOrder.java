package JavaCoding;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLisTDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String>  arraylist = new ArrayList<String>();
    arraylist.add("Rahul");
    arraylist.add("vidhya");
    arraylist.add("sishti");
    arraylist.add("Harish");
    System.out.println("Before Sorting:");
    
    for(String str: arraylist){
		System.out.println(str);
	}
    Collections.sort(arraylist, Collections.reverseOrder());
    
    System.out.println("After Sorting:");
    for(String str: arraylist){
		System.out.println(str);
	}
    
	}

}
