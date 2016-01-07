package treeset;

import java.util.TreeSet;

public class TreeSetMain {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("xyz");
		set.add("abc");
		set.add("Table2");
		set.add("Table");
		set.add("Table1");
		set.add("abc");
		set.add("ABC");
		set.add("Abc");
		set.add("aBC");
		System.out.println(set);
	}
}
