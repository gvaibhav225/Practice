class negativeexception extends Exception{
	public String toString() {
		return "Exception occured";
	}
	public String getMessage() {
		return "exception";
	}
	
	
}
public class throwandthrows {
	public static double area(int r) throws negativeexception{//throws is for warning
		if(r<0) {
			throw new negativeexception();
		}
		double result=Math.PI*r*r;
		return result;
		
	}
	public static void main(String[] args) {
		//double v=area(2);//if we use only this then exception is not handelled theefore need to use try catch
		try {
			double v=area(-2);
			System.out.println(v);
			
		}catch(Exception e){
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		
	}

}
