class CompanyJobRepository {
public static String getJobPrediction(int age, String highestQualification) throws NotEligibleException{
		if(age<19){
			throw new NotEligibleException();
		}
		else if(age>=21&&highestQualification=="B.E"){
			return "We have openings for junior developer";
		}
		else if(age>=26&&highestQualification=="M.s"||age>=26&&highestQualification=="PhD"){
			return "We have openings for senior developer";
		}
		else if(highestQualification!=("M.s")||highestQualification!="B.E"||highestQualification!="Phd" ){
			throw new NotEligibleException();
		}
		else{
			return "Sorry we have no openings for now";
		}

	}

}

public class ex2 {
	public static void main(String args[] )  {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	}
}
class NotEligibleException extends Exception {
	public String toString() {
		return "You are underage for any job";
	}
	public String getMessage() {
		return "We do not have any job that matches your qualifications";
	}
}
