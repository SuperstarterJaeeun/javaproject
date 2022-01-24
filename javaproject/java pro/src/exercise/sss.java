package exercise;

public class sss {

	public static void main(String[] args) {
		int amount = 7;
		int price = 5000;
		double rate;
		//상항 수량이 10개 이상이면 할인 10프로 미만이면 5프로
		rate = ((amount>10))?0.1 : 0.05;

		int panme = (int)(amount*price*(1-rate));
		System.out.println("판매 금액은=" +panme);

		}

	}

