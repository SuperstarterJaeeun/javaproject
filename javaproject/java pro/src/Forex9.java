
public class Forex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Outter: for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j>3) {
					break Outter;
				}
				System.out.println(i+" ," + j);
			}
		}

		System.out.println("프로그램 종료");
	}
}//다중 반복문일때는 반복문 전체를 탈출하고 싶을때 라벨을 줘서 탈출하고 싶은 곳에 라벨지를 만들어서 탈출하면 됨 반복문은 보통 두개까지만 쓰지 더 이상은 안씀