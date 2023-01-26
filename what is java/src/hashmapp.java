import java.math.*;
import java.util.*;
public class hashmapp {

	public static void main(String[] args) {
		int t=2;
//		BigInteger [] b=new BigInteger[t];
//		Scanner sc=new Scanner(System.in);
//		b[0]=sc.nextBigInteger();
		Set<Integer> s=new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(1);
		System.out.println(s);
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Map<Integer, String> m =new HashMap<>();
		m.put(1, "ra");
		m.put(2, "dd");
		System.out.println(m);
		
		for(Map.Entry<Integer, String> entry: m.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}
}

