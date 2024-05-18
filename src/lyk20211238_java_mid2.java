import java.util.Scanner;

public class lyk20211238_java_mid2 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        String[] choices = {"가위", "바위", "보"};
        
        System.out.println("가위바위보 숫자게임을 시작합니다!");
        
        // 플레이어의 선택
        System.out.println("가위, 바위, 보 중 하나를 선택하세요.");
        System.out.print("나의 선택: ");
        String myChoice = scanner.nextLine();
        
        // 플레이어의 숫자 선택
        System.out.println("1부터 10까지의 숫자 중 하나를 선택하세요.");
        System.out.print("숫자 선택: ");
        int myNumber = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기
        
        // 컴퓨터의 선택
        int computerChoiceIndex = (int)(Math.random() * 3);
        String computerChoice = choices[computerChoiceIndex];
        
        // 컴퓨터의 숫자 선택
        int computerNumber = (int)(Math.random() * 10) + 1;
        
        // 결과 출력
        System.out.println("플레이어의 선택: " + myChoice + " (" + myNumber + ")");
        System.out.println("컴퓨터의 선택: " + computerChoice + " (" + computerNumber + ")");
        
        // 승부 결정
        if (myChoice.equals(computerChoice) && myNumber == computerNumber) {
            System.out.println("무승부입니다!");
        } else if ((myChoice.equals("가위") && computerChoice.equals("보")) ||
                   (myChoice.equals("바위") && computerChoice.equals("가위")) ||
                   (myChoice.equals("보") && computerChoice.equals("바위"))) {
            System.out.println("당신이 이겼습니다!");
        } else if (myNumber > computerNumber) {
            System.out.println("당신이 이겼습니다!");
        } else {
            System.out.println("당신이 졌습니다!");
        }
        
        scanner.close();
    }
}
