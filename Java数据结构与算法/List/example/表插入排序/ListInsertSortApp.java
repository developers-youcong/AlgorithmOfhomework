package cn.algorithm.insert.sort.list.simple;

public class ListInsertSortApp {

	public static void main(String[] args) {
		int size = 0;
		
		Link[] linkArray = new Link[size];
		for(int j = 0;j<size;j++) {
			int n = (int)(Math.random()*99);
			Link newLink = new Link(n);
			linkArray[j] = newLink;
			
		}
		
		System.out.println("Unsorted array:");
	
		for(int j = 0;j<size;j++)
			System.out.println(linkArray[j].dData+" ");
		System.out.println();
		
		SortedList theSortedList = new SortedList(linkArray);
		
		for(int j = 0;j<size;j++)
			linkArray[j] = theSortedList.remove();
		
		System.out.print("Sorted Array:");
		for(int j = 0;j<size;j++)
			System.out.println(linkArray[j].dData+" ");
		System.out.println("");
	}

}
