package test.ch10;

public class ExceptionEx1 {

	public static void printLength(String data) {
		
		try { //실행시킬 코드
			
			int result = data.length();//문자수
			System.out.println("문자수 : " + result);
			
			//catch(클래스 이름)
		} catch (NullPointerException e) { //에러가 났을 때 실행시킬 코드
		
			//예외 처리 정보를 얻는 세가지 방법
			System.out.println(e.getMessage()); //예외가 발생한 이유만 출력
			System.out.println(e.toString()); //예외가 발생한 이유 + 예외의 종류 출력
			e.printStackTrace(); //예외가 발생한 이유 + 예외의 종류 + 예외가 발생한 곳 출력
			
		} finally { //finally: 옵셔널하다. 마지막에 무조건 실행되는 코드
			System.out.println("마무리 실행 \n");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("프로그램 시작 \n");
		printLength("ThisIsJAVA");
		printLength(null);
		System.out.println("프로그램 종료 \n");
		
	}

}
