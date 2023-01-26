
public class regularexpression {
	public static int validate(String name) {
//		if(name.matches("[a-zA-z0-9]*{6}")) {
//			return 1;
//		}
//		if(name.matches("...s")) {
//			return 2;
//		}
//		* is for zero or more times, + is for once or more time, ? is for atmost one time
		
//		if(name.matches("[a-zA-z0-9]+{6}")) {
//			return 3;
//		}
//		if(name.matches("[a-zA-z0-9]?{6}")) {
//			return 4;
//		}
//		if(name.matches("......")) { 
////			it represents no. of letters in name
//			return 5;
//		}
//		if(name.matches("^(.+)(@.)(.+)$")) { 
////for email
//			
//			return 5;
//		}
		if(name.matches("^[A-Za-z]+[A-Za-z0-9]+(.?[A-Za-z0-9]+)*@[A-Za-z]+.[A-Za-z]+$")) { 
			//for email
//					^ means starts with and $ means ends with	
//			the above means gvaibhav225 @ gmail . com
						return 6;
					}
		else
		return 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(validate("bnds.t.55b@gmail.com"));
		
	}

}
