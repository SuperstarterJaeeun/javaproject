
public class Literal {

	public static void main(String[] args) {
		int num1 = 20+365;
		double num2 = 5/2.0;//지수 가수부를 따로 보관하기때문에 아래소수점까지 나오게 할려면 하나를 실수로 바꿔야됨 그러면 실수연산으로 들어가 실수로 나옴
		int ch = 65;//앞에 0을 붙이면 8진수를 의미하고 8^0 * 5 + 8^1 * 1 
	//같은 예로 0x를 붙이면 16진수를 의미함
		System.out.println(num1);
		System.out.println(num2);
		System.out.printf("%c", ch);
		// TODO Auto-generated method stub
//""는 문자열''는 하나의 문자만 담을 수 있다
	}

	boolean bool = true;
	
}
