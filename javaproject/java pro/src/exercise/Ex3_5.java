package exercise;

import java.util.Scanner;

public class Ex3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("금액을 입력");
		int value = sc.nextInt();
		value = value/100;
		
		System.out.println(value +("00"));
	//value -= value%100;
	}

}
