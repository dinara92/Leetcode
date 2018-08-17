//from Rosettacode

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
 
 
public final class FlattenUtil {
 
	public static List<Object> flatten(List<?> list) {
		List<Object> retVal = new LinkedList<Object>();
		flatten(list, retVal); //call overriding f-n
		return retVal;
	}
 
	public static void flatten(List<?> fromTreeList, List<Object> toFlatList) {
		for (Object item : fromTreeList) {
			if (item instanceof List<?>) {
				flatten((List<?>) item, toFlatList); //overriding
			} else {
				toFlatList.add(item);
			}
		}
	}
	
	
	 
	public static void main(String[] args) {
		List<Object> treeList = a(a(1), 2, a(a(3, 4), 5), a(a(a())), a(a(a(6))), 7, 8, a());
		List<Object> flatList = FlattenUtil.flatten(treeList);
		System.out.println(treeList);
		System.out.println("flatten: " + flatList);
	}

	//this is object a(...)
	private static List<Object> a(Object... a) {
		return Arrays.asList(a);
	}
}


