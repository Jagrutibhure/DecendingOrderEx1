package Decending1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DecendingOrder {
public static void main(String args[]) {
	List<Integer>myList = Arrays.asList(10, 9,12,15,14,20,22);
	myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	
	
}
}
