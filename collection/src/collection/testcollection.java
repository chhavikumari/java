package collection;

import java.util.LinkedList;
import java.util.List;

public class testcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> lst=new LinkedList<Integer>();
	lst.add(100);
	lst.add(200);
	lst.add(300);
	lst.add(400);
	lst.add(new Integer(100));
	
	System.out.println(lst);
	System.out.println(lst.get(2));
	System.out.println(lst.contains(300));
	lst.remove(1);
	System.out.println(lst);
	
	
	}

}
