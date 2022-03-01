import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UseOfStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> list1 = /*Arrays.asList(6,7);*/ new ArrayList<Integer>();

		List<String> listStr = Arrays.asList("One", "Two", "Three", "Four", "Five");

		List<Integer> l = list.stream().map(i -> i * 5).collect(Collectors.toList());
		
		
		//System.out.println(l);
		
		// map, filter, sorted - intremediate ops
		// collect, foreach, reduce - terminate ops
		
		//list.forEach(list1::add);
		
		list.forEach(i->System.out.println(1*5));
		
		System.out.println("list "+ list);

		System.out.println("list1 "+ list1);
	}
}