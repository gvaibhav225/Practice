import java.util.*;//for importing arraylist
public class arraylisttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		ArrayList<Integer> arr2=new ArrayList<>();
		arr.add(2);
		arr.add(0, 3);
		arr2.add(2);
		arr2.add(0, 3);
		arr.addAll(arr2);
		arr.remove(arr.indexOf(3));
		arr.add(0, 5);
		Collections.reverse(arr);
		Collections.replaceAll(arr, 3, 8);
		
		//wwe can add element at filled index also
		System.out.println(arr.get(1));
		System.out.println(arr);
		System.out.print(arr.size());
		System.out.print(arr.indexOf(3));
		System.out.println(arr.contains(2));
		arr.remove(1);
		ArrayList<String> str=new ArrayList<>();
		str.add("yiyi");
		str.add("yiyi");
		str.add("yiyi");
		str.add("yiyi");
		System.out.println(str);
		
		Iterator itr=str.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
