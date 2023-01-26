
public class javamethoddoc {
	/**
	 * 
	 * @param args yo
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 * @param i yu
	 * @param j are
	 * @return dumb
	 * @throws Exception if i=0
	 * @deprecated this method is depricated
	 */
	public int add(int i, int j) throws Exception{
		if(i==0) {
			throw new Exception();
		}
		int c=i+j;
		return c;
	}

}
