
public class variable {

	public static void main(String[] args) {
		int amount = 33;
		int price = 1000;
		
		String memo = "";
		
		if (amount >= 10) {
			
			price = 800;
			memo = "(���ΰ�����)";
		}
		int result = amount * price;
	
		System.out.println(result+ memo);
		//������ 10�� �̻� 
	}

}
