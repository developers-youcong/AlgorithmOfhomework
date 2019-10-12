## 问题列表如下

### 1.计算机排序算法与人类排序相比较，它的局限性是(d):
a.人类擅长发明新算法;
b.计算机只能处理数量固定的数据;
c.人类知道什么需要排序，而计算机不知道;
d.计算机一次只能比较两件东西

### 2.简单排序算法中的两个基本操作是什么数据项和什么数据项或什么?
比较和交互

### 3.冒泡排序算法总是在所有数据项两两比较完成后停止。
错误。
冒泡排序遵循的规则:
a.比较两个数据项
b.如果左边的数据项大，则两数据项交互位置
c.向右移动一个位置，比较下面两个队员

### 4.冒泡排序算法在哪两者之间交替进行(a)

a.比较和交换
b.移动和复制
c.移动和比较
d.复制和比较

### 5.有N个数据项，冒泡排序算法精确操作了N*N次比较
错误。应该是o(n的次方)

### 6.选择排序中(b)

a.最大的关键字聚集在左边(较小的下标);
b.最小的关键字被重复的发现;
c.为了将每个数据项插入到正确排序的位置，很多数据项被移动;
d.有序的数据项聚集在右边;

### 7.在某个特定的排序情况中，如果交换与比较相比费时得多，那么选择排序将比冒泡排序快大约一倍
错误。
选择排序改进了冒泡排序，将必要的交换次数从O（N2）减少到O（N）不幸的是比较次数仍保持为O（N2）。

### 8.复制是交换的多少倍?
复制是交换的3倍

### 9.选择排序中不变性是什么?

以selectSort.java程序中，下标小于或等于out的位置的数据项总是有序的。


### 10.插入排序中，文中描述的“被标记的队员"对应于insertSort.java中的哪个变量?（c）
a.in
b.out
c.temp
d.a[out]

### 11.插入排序中，“局部有序”是指:(d)
a.一些数据项已经排好序了，但它们可能需要被移动;
b.大部分数据项已在它们最终排序的位置，但仍有一些需要排序;
c.只有一些数据项有序：
d.组内的数据项已经排好序，而组外面的数据项需要插入到组中来;

### 12.向左或向右移动一组数据项需要重复地?
需要重复复制

### 13.在插入排序中，一个数据项被插入到局部有序的组合后，它将:(b)
a.永远不会再移动;
b.永远不会向左边移动：
c.经常被移出这个组;
d.发现这组的数据项不断减少

### 14.插入排序中的不变性是什么?
在每趟结束时，在将temp位置的项插入后，比outer变量下标号小的数据项都是局部有序的。

### 15.稳定性是指:(b)
a.在排序中排除有次关键字的项
b.在对州进行排序时，每个州的城市还要求按人口递增有序;
c.让相同的名配相同的性;
d.数据项按照主关键字有序，不考虑次关键字;

## 实验
待定

## 编程作业
3.2 在insertSort.java中给ArrayIns类加一个median()方法。这个方法将返回数组的中间值。（回忆一下，数据中的一半项比中间值大，一半项比中间值小)

代码答案如下:

ArrayIns.java
```
package cn.algorithm.simplesort.simple;

import java.util.Arrays;

public class ArrayIns {

	private long[] a;
	private int nElems;
	
	public ArrayIns(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	public void display() {
		for(int j = 0;j<nElems;j++)
			System.out.print(a[j]+" ");
		System.out.println();
	}
	
	public void insertionSort() {
		int in,out;
		
		for(out =1;out<nElems;out++) {
			long temp = a[out];
			
			in = out;
			
			while(in>0&& a[in-1]>=temp) {
				a[in] = a[in - 1];
				
				--in;
			}
			
			a[in] = temp;
		}
	}
    
	//返回数组中间值,索引除2即可返回数组中间值
	public long median() {

		return a[nElems/2];
	}

}


```


InsertSortApp.java
```
package cn.algorithm.simplesort.simple;

public class InsertSortApp {

	public static void main(String[] args) {
		int maxSize = 100;
		ArrayIns arr;
		arr = new ArrayIns(maxSize);
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		
		arr.display();
		arr.insertionSort();
		arr.display();
		
		System.out.println("中间值:"+arr.median());
	}

}


```