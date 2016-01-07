package final_test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FinalTest {
	private static final Map<String, Map<String, String>> root = new HashMap<String, Map<String, String>>();
	private static final Map<String, String> map1 = new HashMap<String, String>();
	private static final Map<String, String> map2 = new HashMap<String, String>();

	static{
		map1.put("aa", "aa");
		map2.put("bb", "bb");
		root.put("map1", map1);
		root.put("map2", map2);
		System.out.println(".........");
		Collections.unmodifiableMap(map1);
		Collections.unmodifiableMap(map2);
		Collections.unmodifiableMap(root);
		
	}

	public static void main(String[] args) {
		System.out.println("main......");
		map2.put("fff", "fff");
		System.out.println(root);
	}
}
