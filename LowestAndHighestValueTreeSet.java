package JavaCoding;

import java.util.TreeSet;

public class LowestAndHighestValueTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // To get the highest value currently stored in Java TreeSet use,
	      //Object last() method of TreeSet class.
		//To get the lowest value currently stored in Java TreeSet use,
	     // Object first() method of TreeSet class.
		 TreeSet tSet=new TreeSet();
		 tSet.add("1");
		 tSet.add("4");
		 tSet.add("2");
		 tSet.add("9");
		 tSet.add("3");
		 tSet.add("5");
		
	    System.out.println("Lowest value Stored in Java TreeSet is : " + tSet.first());
	    System.out.println("Highest value Stored in Java TreeSet is : " + tSet.last());
	 
	}

}
