package cn.algorithm.stack.simple;

public class StackApp {

	public static void main(String[] args) {
		
		StackX theStack = new StackX(10);
		
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.print(value);
			System.out.print(" ");
			
		}
		System.out.println("");
	}
	

}
