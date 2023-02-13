package defaultSorting;

import java.util.TreeSet;

public class Solution {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(20);
		t.add(30);
		t.add(20);
		t.add(10);
		for(int i:t) {
			System.out.println(i);
		}
		System.out.println("---------------------");
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("B");
		ts.add("C");
		ts.add("A");
		for(String s:ts) {
			System.out.println(s);
		}
	}
}


// Rules : 
// 1. When you add an object into TreeSetm internaly compareTo() gets called.
// 2. Return type of compareTo() is int, +1 >
// 								         -1 <
// 									      0 ==
// 3. Underlines DS of TreeSet -> Binary Tree.
// 4. Traversing order of TreeSet is leftnode parentnode rightnode
// 5. compareTo() is present in all the wrapper classes and String class.
// 6. if you add Integer object, compareTo() of Integer class gets called 
//    likewise if you add String object -> compareTo() -> String class....


// compareTo() is abstracted in Comparable interface and
// compareTo() is present in all wrapper classes.