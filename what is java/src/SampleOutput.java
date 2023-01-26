
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

public class SampleOutput {

	public static String searchForJob(int age, String highestQualification){
		try{
			if(age>=200||age<=0){
				throw new NotEligibleException();
			}
		}catch(NotEligibleException e){
			 return "The age entered is not typical for a human being";
		}
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
	public static void main(String args[] )  {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	}
}