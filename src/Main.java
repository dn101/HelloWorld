import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("이 게임은 홀/짝 게임입니다. 게임을 시작하시겠습니까? Yes / No");
        String gameAnswer = "";
        gameAnswer = sc.next();
        //System.out.println(gameAnswer);
        if(gameAnswer.equals("Yes")) {
            System.out.println("게임시작");

            int min = 1;
            int max = 10;
            int chooseNum = (int) (Math.random()*(max-min)) + min;
            /*System.out.println(chooseNum);*/

            String gameResult = "";
            if(chooseNum % 2 == 1) {
                gameResult = "홀";
            } else {
                gameResult = "짝";
            }
            //홀짝
            System.out.println("홀/짝 선택해주세요");

            String oddEven = "";
            oddEven = sc.next();

            if ( oddEven.equals(gameResult) ) {
                System.out.println("당신은 지니어스! 정답입니다. 랜덤숫자는 " + chooseNum + "이고 " + gameResult + "입니다.");
            } else {
                System.out.println("스튜피드! 더 공부하세요. 랜덤숫자는 " + chooseNum + "이고 " + gameResult + "입니다.");
            }
        } else {
            System.out.println("게임종료");
        }




    }
}
