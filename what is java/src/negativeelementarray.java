import java.util.Arrays;

class negativeexception extends Exception{
	public String toString() {
		return "Exception occured";
	}
	public String getMessage() {
		return "exception";
	}
	
}
public class negativeelementarray {
	public static int vvvv(int [] arr) throws negativeexception {
		for(int element: arr) {
	    	if(element<0) {
	    		throw new negativeexception();
			
		}
	}
		return -1;
	}
	public static void main(String[] args) {
		int[]arr=new int[5];
		arr[0]=-5;
		arr[1]=4;
		arr[2]=4;
		arr[3]=4;
		arr[4]=4;
	
		try {
			int v=vvvv(arr);
			
			
		}catch(Exception e) {
			System.out.print(e.toString());
		}
	    
		}
		
		
	}



