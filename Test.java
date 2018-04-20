import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ArrayList list = new ArrayList<String>();
		list.add("cat");
		list.add("cats");
		list.add("dog");
		list.add("dogs");
		*/
		LinkedList list = new LinkedList<String>();
		list.add("cat");
		list.add("cats");
		list.add("dog");
		list.add("dogs");
		
		System.out.println(list);
		
		removeEvenLength(list);
		System.out.println();
		System.out.println(list);
		// sysout ctrl space == System.out.println();
	}
	//remove all strings of even length from a list
	/*
	public static void removeEvenLength(ArrayList<String> list){
		int i = 0;
		while(i < list.size()){
			String element = list.get(i);
			if(element.length() % 2 == 0){
				list.remove(i);
			}
			else{
				i++;// advance the pointer
			}
		}
	}*/
	// linked list 
	public static void removeEvenLength(LinkedList<String> list){
		/*
		int i = 0;
		while(i < list.size()){
			String element = list.get(i);
			if(element.length() % 2 == 0){
				list.remove(i);
			}
			else{
				i++;// advance the pointer
			}
		}
	*/
		
		
		//efficient linkedlist iterator interface
		Iterator<String> i = list.iterator();// call iterator
				while(i.hasNext()){
					String element = i.next();
					if (element.length() %2 == 0){
						i.remove();
						
					}
				}
				
	}

}
