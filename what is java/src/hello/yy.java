package hello;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

interface base{
	void fema(List<Person> createPeoples);
}

 enum Gender {
	MALE,FEMALE
	}
 class Person { 
		private String name; 
		private int age; 
		private Gender gender;
	public Person(String name, int age, Gender gender) { 
		super(); 
		this.name = name; 
		this.age = age; 
		this.gender = gender;
	}
	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;} 
	public int getAge() {
		return age;} 
	public void setAge(int age) {
		this.age = age;} 
	public Gender getGender() {
		return gender;} 
	public void setGender(Gender gender) {
		this.gender = gender;}

	@Override

	public String toString() {
	return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]"; }
	}
public class yy{

	 public static void females( List<Person> createPeople){
	    	List<String> namess=createPeople.stream().filter(x->x.getAge()>6&&x.getGender()==Gender.FEMALE).map(r->r.getName().toUpperCase()).collect(Collectors.toList());
	    	System.out.println(namess);
	    	
	    }

    public static void main( String[] args ) throws IOException {
     List<Person> createPeople=new ArrayList<>();
     createPeople.add(new Person("pankaj", 38, Gender.MALE));
     createPeople.add(new Person("Manvi", 6, Gender.FEMALE));
     createPeople.add(new Person("Aman", 34, Gender.MALE));
     createPeople.add(new Person("Bindu", 23, Gender.FEMALE));
     createPeople.add(new Person("Monika", 35, Gender.FEMALE));
     createPeople.add(new Person("Monika", 45, Gender.FEMALE));
     createPeople.add(new Person("Kabir", 45, Gender.MALE));
     createPeople.add(new Person("Vijay", 34, Gender.MALE));
     createPeople.add(new Person("Priyanka", 35, Gender.FEMALE));
     
    females(createPeople);
    
    base b=(List<Person> createPeoples)->{
    	List<String> namess=createPeoples.stream().filter(x->x.getAge()>6&&x.getGender()==Gender.FEMALE).map(r->r.getName().toUpperCase()).collect(Collectors.toList());
    	System.out.println(namess);
    };
    b.fema(createPeople);
  
    File f1=new File("C:\\Users\\gvaib\\Downloads\\Docs\\New folder");
    
    FilenameFilter ff=new FilenameFilter() {
    	public boolean accept(File f1, String name) {
    		String lcn=name.toLowerCase();
    		if(lcn.endsWith(".pdf")) {
    			return true;
    		}
    		else
    			return false;
    	}
    };
    String pdfFiles[]=f1.list(ff);
    System.out.println("pdf files in specified directory");
    for(String r: pdfFiles) {
        System.out.println(r);
    }
    } 
   
  
}
