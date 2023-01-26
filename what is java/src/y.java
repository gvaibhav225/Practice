import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class dish{
	String dishname;

	public dish(String dishname) {
		super();
		this.dishname = dishname;
	}

	public String getDishname() {
		return dishname;
	}

	public void setDishname(String dishname) {
		this.dishname = dishname;
	}

	@Override
	public String toString() {
		return "dish [dishname=" + dishname + "]";
	}
	
}
class dishtest{
	public List<dish> addyummytoname(List<dish> list){
		String r="yummy:";
		List<String> li=list.stream().map(x->x.dishname.replace(x.dishname, r.concat(x.dishname))).collect(Collectors.toList());
		
		List<dish> lii=new ArrayList<>();
		for(String s:li) {
			lii.add(new dish(s));
		}
		return lii;
		
		
	}
}


public class y {

	public static void main(String[] args) {
		List<dish> list=new ArrayList<dish>();
list.add(new dish("hxjxj"));
list.add(new dish("hxjxj"));
list.add(new dish("hxjxj"));

dishtest dt=new dishtest();
System.out.print(dt.addyummytoname(list));
			}
}