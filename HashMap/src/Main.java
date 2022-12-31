import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<Integer,String> names=new HashMap<>();
		names.put(1,"Sudip");
		names.put(2,"Ram");
		names.put(3,"Amit");
		names.put(2,"weffada");
		System.out.println(names);
		System.out.println("===========================================");
		Map<String,Integer> name=new HashMap<>();
		name.put("Sudip",1);
		name.put("Ram",2);
		name.put("Amit",3);
		name.put("Amit",2);
		System.out.println(name);
		System.out.println("===========================================");
		Employee e1=new Employee(1,"Dipa",1000);
		Employee e2=new Employee(2,"Priya",2000);
		Employee e3=new Employee(1,"Dipa",1000);
		Employee e4=new Employee(2,"Priya",2000);
		
		Map<Employee, Integer> emp=new HashMap<>();
		emp.put(e1,1);
		emp.put(e2,2);
		emp.put(e3,3);
		emp.put(e4,4);
		System.out.println(emp);
		System.out.println("===========================================");
	}

}
