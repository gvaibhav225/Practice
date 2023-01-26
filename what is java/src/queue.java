import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Candidates{
	String name;
	int age;
	public Candidates(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Candidates [name=" + name + ", age=" + age + "]";
	}
	
	
}
class empcom implements Comparator<Candidates>{
	public int compare(Candidates o1, Candidates o2) {
		return o1.age-o2.age;
	}
}

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> qu=new PriorityQueue<>();
		qu.add(200);
		qu.add(2200);qu.add(1200);qu.add(200);qu.add(2400);
		
		System.out.println(qu);
		System.out.println(qu.size());
		System.out.println(qu.poll());   //priority queue  will remove in ascending order 
		System.out.println(qu.size());
		System.out.println(qu.poll());   //priority queue  will remove in ascending order 
		System.out.println(qu.size());
		System.out.println(qu.poll());   //priority queue  will remove in ascending order 
		System.out.println(qu.size());
		System.out.println(qu.poll());   //priority queue  will remove in ascending order 
		System.out.println(qu.size());
		System.out.println(qu.poll());   //priority queue  will remove in ascending order 
		System.out.println(qu.size());
		
//		we cant directly use poll as cant decide which is first to remove so used comparator and implemented comparator in a class

		
		empcom e=new empcom();
		Queue<Candidates> que=new PriorityQueue<>(e);   //remember to add e like this
		que.add(new Candidates("vaivvy",21));
		que.add(new Candidates("vaivf",22));
		que.add(new Candidates("vaiscs",25));
		que.add(new Candidates("vaieff",19));
		
		System.out.println(que);
		System.out.println(que.size());
		System.out.println(que.poll());   //priority queue  will remove in ascending order 
		System.out.println(que.size());
		System.out.println(que.poll());   //priority queue  will remove in ascending order 
		System.out.println(que.size());
		System.out.println(que.poll());   //priority queue  will remove in ascending order 
		System.out.println(que.size());
		System.out.println(que.poll());   //priority queue  will remove in ascending order 
		
	}
	

}
