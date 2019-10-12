## 编程作业

向HighArray类添加一个getMax()方法，它返回数组中最大的关键字的值，当数组为空时返回-1.向main()中添加一些代码来使用这个方法。可以假定所有关键字都是正数。

实现代码如下:
```
package cn.algorithm.array.simple;

import java.util.Arrays;

public class HighArray {

	private long[] a;
	private int nElems;

	public HighArray(int max) {
		a = new long[max];

		nElems = 0;
	}
    //方法说明
	public long getMax() {

		//数组排序(从小到大)
		Arrays.sort(a);
        
        
        //如果数组中有值，最后返回的一定是最大的，至于之所以a.length-1，是因为数组默认是从0开始，如果没有值，通常是返回为0，但是由于三目运算符判断，如果为0的话直接返回-1
		return a[a.length - 1] != 0 ? a[a.length - 1] : -1;

	}

	public boolean find(long searchKey) {
		int j;

		for (j = 0; j < nElems; j++)
			if (a[j] == searchKey)
				break;
		if (j == nElems)
			return false;
		else
			return true;

	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public boolean delete(long value) {
		int j;
		for (j = 0; j < nElems; j++)
			if (value == a[j])
				break;
		if (j == nElems)
			return false;
		else {

			for (int k = j; k < nElems; k++)
				a[k] = a[k + 1];
			nElems--;

			return true;

		}
	}

	public void display() {

		for (int j = 0; j < nElems; j++)
			System.out.print(a[j] + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		int maxSize = 100;

		HighArray arr;

		arr = new HighArray(maxSize);

		arr.insert(77);
		arr.insert(100);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);

		System.out.println(arr.getMax());

	}
}



```