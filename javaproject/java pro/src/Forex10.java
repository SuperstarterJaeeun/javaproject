
public class Forex10 {

	public static void main(String[] args) {
	/*
		for (int i =1; i<=10;i++) {
			if(i%2 != 0) {
				continue;//컨티뉴를 만나면 포문 안에있는 나머지 명령어를 수행 안한다는 의미, 짝수만 출력을 이런식으로 표현 배우는 이유 고객들의 정보만큼 for문을 돌때 일치할때는 컨티뉴 불일치는 나감
			}
			System.out.println(i);
		}
*/		int i ;
int sum = 0;
	for(i=0; i<=100; i++) {
	if(i%5==0) {
		continue;
	}
		sum+=i ;														//1부터 100까지 합을 구하는 프로그램을 완성하시오 단 5의 배수는 제외

	}
	System.out.println("1부터 100까지의 합=" + sum);
	}
	
	
	}
	

