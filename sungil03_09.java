package sungil2023_03;
import java.util.Scanner;
public class sungil03_09_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n단 피라미드 출력 프로그램

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 단의 피라미드를 출력하시겠습니까");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n-i; j++) {
				System.out.print(" "); // 공백 출력
			}
			for(int k=0; k < i*2+1; k++) {
				System.out.print("*"); // 별 출력
			}
			System.out.println(); // 줄 바꿈
		}

	}
}
