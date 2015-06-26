import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Person {
	public void eat();
}

public class ss {
	public static void main(String[] args) {
		Person p = () -> System.out.println("eat");
		p.eat();
		
//		Stream<Integer> integerStream = Stream.of(1, 2, 3, null, 4,5,1);
//		//	从1开始
//		Stream.iterate(1,item -> item*2).limit(10).forEach(System.out::println);
//		
//		List<Integer> nums = Arrays.asList(1, 2, 3, 4,null ,5,2);
//	    System.out.println("sum is:"+integerStream.filter(num -> num != null).
//	      			distinct().mapToInt(num -> num * 2).
//	                  peek(System.out::println).skip(2).limit(4).sum());
//		//
//    	List<Integer> numsWithoutNull = nums.stream().filter(num -> num != null)
//	    			                .collect(Collectors.toList());
//	    
//	    
//	    List<Integer> numss = Arrays.asList(1, 2, 3, 4 ,5,2,null);
//	    System.out.println("ints sum is:" + numss.stream().filter(num-> num != null).
//	    						reduce(0, (sum, item) -> sum + item));
//	    
//	    System.out.println("intsFirst:" + numss.stream().findFirst());
		
		List<String> names = new ArrayList<>();
		names.add("JacK");
		names.add("Rose");
		List<Character> s  = names.stream().map(name->name.charAt(0)).collect(Collectors.toList());
		System.out.println("names" + s);
		s.forEach(System.out::println);
	
	}
}
