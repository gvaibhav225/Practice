import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Candidate{
	int sr,age,year,salary;
	String name,dept,gender;
	public Candidate(int sr, int age, int year, int salary, String name, String dept, String gender) {
		super();
		this.sr = sr;
		this.age = age;
		this.year = year;
		this.salary = salary;
		this.name = name;
		this.dept = dept;
		this.gender = gender;	
	}
	public int getSr() {
		return sr;
	}
	public void setSr(int sr) {
		this.sr = sr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
public String toString() {
	return "[name="+name+"sr="+sr+"Salary="+salary;
}
	
}

public class streamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(2,4,5,6);
		for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				System.out.print(list.get(i)+" ");
			}
		}
		System.out.println("");
//		the above can be done using stream api 
		List<Integer> newlist= list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.print(newlist +" ");
		
//		in above thing, stream calls api , filter to filter out what we need to do, collect collect it in a list
		
		System.out.println("");
		
//		the above can also be done in below way using for each 
		list.stream().filter(n->n%2==0).forEach(System.out::print);

		System.out.println("");
		
//		for counting the numbers use this
		long a=list.stream().filter(n->n%2==0).count();
		System.out.println(a);
		
		
		System.out.println("");
		
		
//		now iterate with limit
		Stream.iterate(10, elements->elements+1).filter(e->e%5==0).limit(5).forEach(System.out::print);
//		10 means where you want to start , then how you want to iterate, then filter, how many elements 
		
		System.out.println("");
//		now reduce is something like for comparison, it gives only one value, optional is for to avoid null exception
		List<String> names=Arrays.asList("ggg","gggggg","hhhhhhhhh","hh");
		
//		now we want to find string of highest length
		
		Optional <String> output=names.stream().reduce((name1,name2)->name1.length()>name2.length()?name1:name2);
		
		if(output.isPresent()) {
			System.out.println(output.get());	
		}
		
		System.out.println("");
		
//		map in stream
		
		List<String> fruits=Arrays.asList("apple","mango","pinapple","guavava");
		
//		fruits.stream().filter(n->n.length()).forEach(System.out::print); not possible so:
		fruits.stream().map(s->s.length()).forEach(System.out::print);
		System.out.println("");
		fruits.stream().map(s->s.charAt(1)).forEach(System.out::print);
		
		
		System.out.println("");
		// another method with flatmap
		
		List<Integer> l1=Arrays.asList(1,2,3);
		List<Integer> l2=Arrays.asList(3,4,5);
		List<Integer> l3=Arrays.asList(6,7,8);
		
		List<List<Integer>> newlist1=Arrays.asList(l1,l2,l3);
		System.out.print(newlist1);
		
		System.out.println("");
//		now above can be witten as
		
		List<Integer> mainlist=newlist1.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.print(mainlist);
		
		
		//1) write a program to have an array of numbers. Find the max in it. Handle all the edge scenarios.
		//2) write a program to have an array of numbers. Output should be no's multiple by 5 for the elements which are greater than 7
		//3) Given an list of numbers, find out all the numbers starting with 1 in an array of numbers.
		//4) write a program to add duplicate numbers in a list and print it.
		//5) Given the list of integers, find the first element of the list. handle all edge cases.(findfirst())
		//6) Given a list of integers, find the total number of elements present in the list (count)
		//7) Given a list of integers, find the maximum value element present in it. use stream.
		//8) Given a String="hey, how are you doing?", find the first non-repeated character in it. use Stream.
		//9) Given a String="Gary, how're you doin?", find the first repeated character in it. use Stream.
		//10) Given a list of integers, sort all the values present in it. (sorted())
//		11) Given a list of integers, sort all the values present in it in descending order using Stream functions?
//				12) Given a list of integers(10), the output should return only 6 elements. (use limit function)
//				13) Given a list of integers(10), the output should skip first 5 elements and print after that. (use skip function)
//				14) Given a list of numbers, find out all the non-repeatative numbers and print it.(use distinct method)
//				15) Given list of strings, convert them to uppercase and then lowercase. (map)
//				16) Give list of numbers, multiply each element with 6 and print them.(map)
//				17) Have a complex list of strings. And then transform it into a list and perform different operations on them. (like print the element which is at index 3)
//				18) create a employee class(id,name,age,salary). create few employees. Filter employees whose salary is greater than 100000.
//				19)create a employee class(id,name,age,salary). create few employees. Filter employees whose age is less than 30.
		System.out.println("");
		
		//1
		List<Integer> l11=Arrays.asList(1,2,4,5,64,56,33,77,56);
		Optional<Integer> os=l11.stream().reduce((num1,num2)->num1>num2?num1:num2);
		System.out.print(os.get());
		
		System.out.println("");
		//2
		List<Integer> l12=Arrays.asList(0,5,40,50,66,77,80,30);
		l12.stream().filter(n->n%5==0&&n>7).forEach(System.out::print);
		
		System.out.println("");
		
		//3
		List<Integer> l13=Arrays.asList(1,2,14,15,64,156,33,177,56);

		l13.stream().filter(x->String.valueOf(x).startsWith("1")).forEach(System.out::print);
		
		System.out.println("");
		
		//4
//		its like above l1,l2,l3 wala
		
		//5&6
		
		List<Integer> l15=Arrays.asList(10,5,40,50,66,2,177,80,30);
		Optional<Integer> nos=l15.stream().sorted().findFirst();
		long nos6=l15.stream().count();
		System.out.println(nos.get());
		System.out.print(nos6);
		
		
		System.out.println("");
		//8
		
		String s="hey, how are you doing?";
		
		//remember linkedhashmap hai hashmap only nhi dega correct ans
		Map<Character,Integer> counts=new LinkedHashMap<>(s.length());
		for(char c: s.toCharArray()) {
			counts.put(c, counts.containsKey(c)? counts.get(c)+1:1);
		}
		
		for(Map.Entry<Character, Integer> entry:counts.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
			
		}
		//11
		List<Integer> l111=Arrays.asList(1,3,5,6,77,44,33,66,22,88,42,11);
		l111.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
		
		
		System.out.println("");
		//12
		l111.stream().limit(6).forEach(System.out::print);
		System.out.println("");
		
		//13
		l111.stream().skip(5).forEach(System.out::print);
		System.out.println("");
		
		//14
		List<Integer> l112=Arrays.asList(1,1,2,3,3,44,55,22,56,44,77,78,55,99);
		Map<Integer,Integer> nonrep=new LinkedHashMap<>();
		for(int e:l112) {
			nonrep.put(e, nonrep.containsKey(e)?nonrep.get(e)+1:1);
		}
		for(Map.Entry<Integer,Integer> ent:nonrep.entrySet()) {
			if(ent.getValue()==1) {
				System.out.print(ent.getKey()+" ");
			}
		}
		System.out.println("");
		
		//15
		List<String> name=Arrays.asList("ggg","gggggg","hhhhhhhhh","hh");
		
		Map<String, String> ul=new HashMap<>();
		for(String sk:name) {
			ul.put(sk.toUpperCase(), sk.toLowerCase());
		}
		System.out.println(ul);
		
		//18 is at end
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 //NEW Method
		List<Candidate> listt=new ArrayList<>();
		listt.add(new Candidate(1,32,2011,55000,"Jiya","hr","F"));
		listt.add(new Candidate(2,30,2012,55000,"Aman","Product","M"));
		listt.add(new Candidate(3,29,2011,25000,"Riya","hr","F"));
		
		
		streamapi j=new streamapi();  //here making object and then will call functions
		System.out.println(listt.toString());
		System.out.println(j.getcount(listt));
		System.out.println(j.getcount(listt));

		System.out.println(j.getavgage(listt));
		System.out.println(j.getavgageall(listt));
		System.out.println(j.getdept(listt));
		System.out.println(j.getyoungestmale(listt));
		System.out.println(j.getsalary(listt));
	}
	
	//below one will give gender based grouping
	public Map<String,Long> getcount(List<Candidate> listt){
		Map<String, Long> countt=listt.stream().collect(Collectors.groupingBy(Candidate::getGender,Collectors.counting())) ;
		return countt;
	}
	
	// below will give avg age pergender
	
	public Map<String,Double> getavgage(List<Candidate> listt){
		Map<String, Double> agee=listt.stream().collect(Collectors.groupingBy(Candidate::getGender,Collectors.averagingLong(Candidate::getAge)));
		return agee;
	}
	
	//below will display ageavg
	public double getavgageall(List<Candidate> listt){
		Double avgagee=listt.stream().collect( Collectors.averagingInt(Candidate::getAge));
		
		return avgagee;
	}
	
	//get no. dept wise
	
	public Map<String,Long> getdept(List<Candidate> listt){
		Map<String, Long> deptwise=listt.stream().collect(Collectors.groupingBy(Candidate::getDept, Collectors.counting()));
		return deptwise;
	}
	
	//to get youngeest male in product dept
	
	public Optional<Candidate> getyoungestmale(List<Candidate> listt){
		Optional<Candidate> youn=listt.stream().filter(e->e.getGender()=="M"&& e.getDept()=="Product").min(Comparator.comparingInt(Candidate::getAge));
		return youn;
	}
	
	//18
	public List<Candidate> getsalary(List<Candidate> listt){
		List<Candidate> sal=listt.stream().filter(c->c.getSalary()>50000).collect(Collectors.toList());
		return sal; //to get correct everything override tostring method above
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
