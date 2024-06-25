package quiz15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQuiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("정수 1>");
				int a = Integer.parseInt(scan.nextLine());
				System.out.println("정수 2>");
				int b = Integer.parseInt(scan.nextLine());
				int x = divide(a, b);
				System.out.println("값은 : " + x + " 입니다.");
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
//			}catch(InputMismatchException e) {
//				System.out.println("정수만 입력 가능합니다.");
//			}
			}catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			} catch (Exception e) {
				System.out.println("다시 입력하세요.");
			}
		}
	}


	public static int divide(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		return a/b;
	}
}




/*
 * 1.main에서 Scanner를 사용해서 2개의 정수 값을 입력 받음
 * 2.divide(정수 2개)를 입력받는 메서드에 전달을 해주세요.
 *  -> 0으로 나눈 경우에
 *  3. divide 메서드에서는 a/b를 진행하는데 b가 0인 경우 예외를 강제 생성해서 new throw Exception 
 *  종료하는 구문을 작성해보세요.
 *  4.main에서 입력받을때는 , 문자인 경우 예외처리를 진행하고 , 다시 입력받으세요
 */
