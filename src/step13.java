import java.util.Scanner;

public class step13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A,B;
		A=sc.nextInt();
		B=sc.nextInt();
		System.out.println(A*(B%10));	// (B%10) 10의 자리 나눠서 남은 1의 자리를 A와 곱셈
		System.out.println(A*(B%100));	// (B%100) 100의 자리를 나눠 남은 10의 자리와 1의 자리를 A와 곱셈
		System.out.println(A*(B/100));	// (B/100) 100으로 나눠진 수만큼 A에 곱셈
		System.out.println(A*B);
	}

}
