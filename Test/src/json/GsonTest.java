package json;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class GsonTest {
	public static void main(String[] args) {
		Person p = new Person("zs",22,new Date());
		Map<String, Person> map = new HashMap<String, Person>();
		map.put("p", p);
		System.out.println(new Gson().toJson(map));
	}
}
