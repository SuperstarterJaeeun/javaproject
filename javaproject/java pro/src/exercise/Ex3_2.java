package exercise;

public class Ex3_2 {

	public static void main(String[] args) {
	/*	int score = 85;
		String result = (!(score>90))? "가":"나";// TODO Auto-generated method stub

		
		
		
		System.out.println(result);

	
	*/
	
		
int amount = 7;
int price = 5000;
double rate;
//상항 수량이 10개 이상이면 할인 10프로 미만이면 5프로
rate = ((amount>10))?price*1.1 : price*1.05;

int panme = (int)(amount*price*(1-rate))
System.out.println("판매 금액은=" +panme);

}
}