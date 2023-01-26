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
            String from;
			String to;
			public Header(String from, String to){
				this.from=from;
				this.to=to;
			}

}


class EmailOperations{
// Implemet the Three methods specified in the specified.	
	public int emailVerify(Email e){
		int count=0;
		if(e.header.from.matches("^[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]$")||e.header.from.matches("^_[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]$")) {
			count++;
		}
		if(e.header.to.matches("^[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]$")||e.header.to.matches("^_[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]$")) {
			count++;
		}
		return count;
		
	}
	public String bodyEncryption(Email e){
		
		
		return "";
		
	}

}
public class ex1{
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
    // You can Implement your main() to check your Program.
}
}