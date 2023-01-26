import java.util.ArrayList;
import java.util.Collections;

public class doselect {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
class ArrayListOps {
	public  ArrayList<Integer> makeArrayListInt(int n){
		   ArrayList<Integer> arr=new ArrayList<Integer>();
		   for(int i=0;i<n;i++){
			   arr.add(0);
		   }
		   return arr;
	   }
	   public ArrayList<Integer> reverseList(ArrayList<Integer> list){
		   Collections.reverse(list);
		   return list;
	   }
	   public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
		   Collections.replaceAll(list,m,n);
		   return list;
	   }
	}











class TransactionParty {
String seller, buyer;
public TransactionParty(String seller, String buyer){
  this.seller=seller;
  this.buyer=buyer;
}
}

class Receipt{
TransactionParty transactionParty;
String productsQR;
public Receipt(TransactionParty transactionParty, String productsQR){

  this.transactionParty=transactionParty;
  this.productsQR=productsQR;

}
}


class GenerateReceipt{
public int  verifyParty(Receipt r){
int k=0,l=0;
    if(r.transactionParty.buyer.matches("^[A-Z a-z]+[-']?[A-Z a-z]+"))
{
  l++;
}
 if(r.transactionParty.seller.matches("[A-Z a-z]+[-']?[A-Z a-z]+$"))
{
  k++;
}
return k+l;

}
public String  calcGST(Receipt r){
int[] rate=new int[3];
int[] quantity=new int[3];
int v=r.productsQR.indexOf(",");
rate[0]=Integer.parseInt(r.productsQR.substring(0,v));
int x=r.productsQR.indexOf("@");
quantity[0]=Integer.parseInt(r.productsQR.substring(v+1,x));
int z=r.productsQR.indexOf(",",v+1);
rate[1]=Integer.parseInt(r.productsQR.substring(x+1,z));
int t=r.productsQR.indexOf("@",x+1);
quantity[1]=Integer.parseInt(r.productsQR.substring(z+1,t));
int m=r.productsQR.lastIndexOf(",");
rate[2]=Integer.parseInt(r.productsQR.substring(t+1,m));
quantity[2]=Integer.parseInt(r.productsQR.substring(m+1));

int GST=(int)((rate[0] * quantity[0] + rate[1]*quantity[1] + rate[2] * quantity[2]) * (12)/100);
String h=String.valueOf(GST);
return h;


}























import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

	class NotEligibleException extends Exception {
	public String toString() {
		return "You are underage for any job";
	}
	public String getMessage() {
		return "We do not have any job that matches your qualifications";
	}
}

class CompanyJobRepository {
public static String getJobPrediction(int age, String highestQualification) throws NotEligibleException{
		if(age<19){
			throw new NotEligibleException();
		}
		else if(age>=21&&highestQualification=="B.E"){
			return "We have openings for junior developer";
		}
		else if(age>=26 && highestQualification=="M.S"||age>=26 && highestQualification=="PhD"){
			return "We have openings for senior developer";
		}
		else if(highestQualification!="M.S"||highestQualification!="B.E"||highestQualification!="Phd" ){
			throw new NotEligibleException();
		}
		else{
			return "Sorry we have no openings for now";
		}
}

}

public class Source {

	public static String searchForJob(int age, String highestQualification){
		if(age>=200||age<=0){
         return "The age entered is not typical for a human being";
			
		}
		else {
			try{
				CompanyJobRepository o=new CompanyJobRepository();
				return o.getJobPrediction(age,highestQualification );
			}catch(NotEligibleException e){
				if(age<19){
					return e.toString();

				}
				else{
					return e.getMessage();
				}
				
			}
		}
		

	}
	public static void main(String args[] )  {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	}
}









import java.util.ArrayList;
import java.util.HashMap;

class Mobile{
    // Write your code here..
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
	public String addMobile(String company, String model){
		if(mobiles.containsKey(company)) {
		ArrayList<String> li=mobiles.get(company);
		li.add(model);
		mobiles.put(company, li);
		}
		else {
			ArrayList<String> li=new ArrayList<>();
			li.add(model);
			mobiles.put(company, li);
		}
		return "model successfully added";
	}
	public ArrayList<String> getModels(String company){
		return mobiles.get(company);
	}
	public String  buyMobile(String company, String model){
     if(mobiles.containsKey(company)) {
    	 ArrayList<String> li=mobiles.get(company);
    	 if(li.contains(model)) {
    		 li.remove(model);
    		 mobiles.put(company, li);
    		 return "mobile sold successfully";
    	 }
    	 else {
    		 return "item not available";
    	 }
     }
     else {
     
return "item not available";
	}

}
}

public class ex1 {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		
	}
}

















import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

class Candidate{
  //Write Your Code Here..
  String name,gender,department;
  int id,age,yearOfJoining;
  double salary;
     @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
                + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
    }
    public Candidate(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.age = age;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.name = name;
		this.department = department;
		this.gender = gender;	
	}
    	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

class Implementation{
  //Write Your Code Here..
  public Map<String, Long> getCount(List<Candidate> list){
 Map<String, Long> mapp= list.stream().collect(Collectors.groupingBy(Candidate::getGender, Collectors.counting()));
		 return mapp;
  }
  public Map<String, Double> getAverageAge(List<Candidate> list){
Map<String, Double> mapp= list.stream().collect(Collectors.groupingBy(Candidate::getGender, Collectors.averagingDouble(Candidate::getAge)));
				 return mapp;
  }
  public Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list){
 Map<String, Long> mapp= list.stream().collect(Collectors.groupingBy(Candidate::getDepartment, Collectors.counting()));
				 return mapp;
  }
   public Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list){
	Optional<Candidate> can=list.stream().filter(x-> x.getGender()=="Male" && x.getDepartment()=="Product Development").min(Comparator.comparing((Candidate::getAge)));
		    	return can;
   }

}

public class Source {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	}
}


































import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Employee {
    String name;
    int salary;
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
    
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
    
}

class namecomp implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
		
	}
}
class salarycomp implements Comparator<Employee>{

	public int compare(Employee s1, Employee s2) {
		// TODO Auto-generated method stub
		if(s1.getSalary()==s2.getSalary()) {
			return s1.getName().compareTo(s2.getName());
		}
		else if(s1.getSalary()>s2.getSalary()) {
			return 1;
		}
		else
			return -1;
		
	}
}

class EmployeeInfo{
    enum SortMethod {
    	BYNAME, BYSALARY;
    };
        public List<Employee> sort(List<Employee> emps, final SortMethod method){
            
        	if(method==SortMethod.BYNAME) {
        		Collections.sort(emps, new namecomp());
        	}
        	else {
        		Collections.sort(emps, new salarycomp());
        	}
        	return emps;
        }
    
        public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character){
    		
        	List<Boolean> b=new ArrayList<>();
        	int k=0;
        	for(Employee o:entities) {
        		if(o.name.contains(character)) {
        			b.add(true);
        		}
        		else
        			b.add(false);
        	}
        	if(b.contains(false)) {
        		return false;
        	}
        	else
            return true;
        }

    
    
    
    
    
    
    
    
    
}













































class Email{
	// Implement Email Class according to the specifiaction.
		Header header;
		String body;
		String greetings;
		public Email(Header header, String body, String greetings) {
			super();
			this.header = header;
			this.body = body;
			this.greetings = greetings;
		}
	}
	class Header{
	// Implemet the Header Class according to the specifiaction.
		String from,to;

	public Header(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}
	}


	class EmailOperations{
	// Implemet the Three methods specified in the specified.
		
		public int emailVerify(Email e){
			int count =0;
			if(e.header.from.matches("^[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]+|^_[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]")) {
				count++;
			}
			if(e.header.to.matches("^[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]+|^_[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]")) {
				count++;
			}
			return count;
		}
		
		public String bodyEncryption(Email e){
			char [] c=e.body.toCharArray();
			String s="";
			for(char a:c) {
				if(a==' '){
					a=' ';
				}
				else {
				int k=Integer.valueOf(a);
				k+=3;
				if(k==91) {
					a='A';
				}
				else if(k==92) {
					a='B';
				}
				else if(k==93) {
					a='C';
				}
				else if(k==123) {
					a='a';
				}
				else if(k==124) {
					a='b';
				}
				else if(k==125) {
					a='c';
				}
				else {
				
				a=(char)k;
				}
				}
				s=s+a;
			}
			
			
			return s;
		}
		
		
	public String greetingMessage(Email e){
			int l=e.header.from.indexOf('@');
			return e.greetings+" "+e.header.from.substring(0,l);
		}
		
	}


	public class SampleOutput {
		public static void main(String args[] ) throws Exception {
			/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	    // You can Implemen
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




