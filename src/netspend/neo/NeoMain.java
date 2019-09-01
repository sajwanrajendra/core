package netspend.neo;

import java.util.ArrayList;
import java.util.List;

public class NeoMain {
	public static void main(String ...strings) {
	
		List<String> list= new ArrayList<>();
		list.add("First");
		list.add("Second");
		list.add("Three");
		String st;
		Integer it;
		System.out.println("List Before "+list);
		if(list!=null && list.size()>1) {
			List<String> subList=list.subList(1, list.size());
			//list.add("Four");
			System.out.println(list+"SubList "+subList);
			subList.add("SubList");
			System.out.println(list+"SubList "+subList);
			
		}
	}

}
