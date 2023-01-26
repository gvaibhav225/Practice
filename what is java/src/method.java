import java.lang.Math;
public class method {
	

	public static void main(String[] args) {
		
//		double t =((((24+6)/7)*8)^4)-41; it can be written as
		int t= ((((24+6)/7)*8)*(((24+6)/7)*8)*(((24+6)/7)*8)*(((24+6)/7)*8))-41;

//		double n=Math.pow(2, 6);
		System.out.println(t);
		double m=Math.pow((((24+6)/7)*8), 4)-41;
		System.out.println(m);

	}

}
