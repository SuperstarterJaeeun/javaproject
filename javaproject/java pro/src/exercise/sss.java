package exercise;

public class sss {

	public static void main(String[] args) {
		int amount = 7;
		int price = 5000;
		double rate;
		//���� ������ 10�� �̻��̸� ���� 10���� �̸��̸� 5����
		rate = ((amount>10))?0.1 : 0.05;

		int panme = (int)(amount*price*(1-rate));
		System.out.println("�Ǹ� �ݾ���=" +panme);

		}

	}

