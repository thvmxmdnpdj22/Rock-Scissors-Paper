import java.util.Scanner;

public class lyk20211238_java_mid1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"가위", "바위", "보"};
       
        System.out.println("가위바위보 게임을 시작합니다!");
        System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
        System.out.print("나의 선택: ");
        String myChoice = scanner.nextLine();
       
        // 상대방의 선택을 무작위로 생성
        int randomIndex = (int)(Math.random() * 3);
        String opponentChoice = choices[randomIndex];
       
        System.out.println("상대방의 선택: " + opponentChoice);
       
        // 가위바위보 승부 결정
        if (myChoice.equals(opponentChoice)) {
            System.out.println("무승부입니다!");
        } else if ((myChoice.equals("가위") && opponentChoice.equals("보")) ||
                   (myChoice.equals("바위") && opponentChoice.equals("가위")) ||
                   (myChoice.equals("보") && opponentChoice.equals("바위"))) {
            System.out.println("당신이 이겼습니다!");
        } else {
            System.out.println("당신이 졌습니다!");
        }
    }
}