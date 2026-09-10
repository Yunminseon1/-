import java.util.Scanner; // 데이터를 입력받는 Scanner 클래스 가져옴 

public class Solution {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // 키보드 입력을 읽어오는 sc 객체 생성 
    int a = sc.nextInt(); // 첫번째로 입력된 정수를 읽어 변수 a 에저장 
    int b = sc.nextInt(); // 두 번째로 입력된 정수를 읽어 변수 b에 저장 
        
    System.out.println("a = " + a); // 텍스트 "a=" 뒤에 변수 a 값을 붙여 출력 
    System.out.println("b = " + b);
    }
}