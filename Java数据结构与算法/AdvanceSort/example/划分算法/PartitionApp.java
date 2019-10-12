package cn.algorithm.advance.sort.simple;

public class PartitionApp {

	public static void main(String[] args) {
		int maxSize = 18;
		ArrayPar arr;
		arr = new ArrayPar(maxSize);
		for(int j = 0;j<maxSize;j++) {
			long n = (int)(java.lang.Math.random()*199);
			arr.insert(n);
		}
		
		arr.display();
		
		long pivot = 99;
		
		System.out.print("Pivot is "+pivot);
		
		int size = arr.size();
		
		int partDex = arr.partitionIt(0, size-1, pivot);
		
		System.out.println(",Partition is at index "+partDex);
		
		arr.display();
	}

}
