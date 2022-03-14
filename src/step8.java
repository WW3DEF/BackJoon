import java.util.Scanner;

public class step8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println((double)A/B); // 소숫점 출력을 위해 Double로 형변환
		
		sc.close();
	}

}
