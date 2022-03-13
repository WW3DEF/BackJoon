import java.util.Scanner; // Scanner를 사용하기 위해 패키지 import 하기

public class step5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	// Scanner 객체를 통해 입력받기
		
		int A = sc.nextInt();	// int = 정수형태로만 입력받음
		int B = sc.nextInt();
		
		System.out.println(A+B);	// A+B 결과값을 출력
		
		sc.close();
	}

}
