package secdemo;

public class SalesClass {
	public void display() {
		int[] arr= {23,45,56,78,6};
		int sum=0;
		for(int num:arr) {
			sum+=num;
			System.out.println(num);
		}
		System.out.println("Summation:" + sum);
	}
	public void print() {
		System.out.println("Print all array number: ");
		for(int i=0;i<100;i++){
			System.out.println("Print i"+ i);
		}
		display();
	}

}
