import java.util.Random;
import java.util.Scanner;

public class MainMenu {

    private Answer answer = new Answer();
    private Scanner sc = new Scanner(System.in);


    public void mainMenu() {


        System.out.println("직장인 무사히 퇴근하기 게임을 시작합니다.");
        try {
            Thread.sleep(1000); //
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("==========게임룰========== \n 올바른 선택지를 선택해서 무사히 퇴근하면 됩니다." + "\n");

        while (true) {
            System.out.print("출근하시겠습니까? (y/n) : ");
            String anwser = sc.nextLine();

            if (anwser.equalsIgnoreCase("n")) {

                System.out.println("연차를 다 소진해서 반드시 출근해야합니다.");

            } else if(anwser.equalsIgnoreCase("y")) {
                System.out.println("출근합니다. 김신입은 회사로 향합니다.");
                System.out.println();
                break;
            } else {
                System.out.println("옳바른 키를 입력해주세요.");

            }
        }
        /* 멘탈 설정 */
        Mentality player = new Mentality(100);
        System.out.println("Player Mental : " + player.getMental() + "\n");

        try {
            Thread.sleep(1000); // 1.5초(1500밀리초) 지연
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("출근할때 이용할 교통수단을 선택해주세요.\n 1. 버스 \n 2. 지하철 \n 3. 자차");
        int anwser1 = sc.nextInt();
        Transport bus = new Transport();
        Transport subway = new Transport();
        Transport myCar = new Transport();

        if (anwser1 == 1) {
            player.takeDamage(30);
            bus.condition3();
        } else if (anwser1 == 2) {
            subway.condition1();
        } else if (anwser1 == 3) {
            myCar.condition2();
            player.takeDamage(20);
        } else {

        }

        try {
            Thread.sleep(1000); // 1.5초(1500밀리초) 지연
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("다음 선택지로 넘어갑니다. 현재 정신력 : " + player.getMental() + "\n");


        try {
            Thread.sleep(1500); // 1.5초(1500밀리초) 지연
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("오전에 열심히 일하고 있는 당신, 갑자기 화장실 신호가 오는데!!....");
        System.out.println("\n 1. 화장실을 뛰어간다. \n 2. 화장실 안가고 참는다. \n 3. 지린다.");
        int anwser2 = sc.nextInt();

        Toilet go = new Toilet();
        Toilet dontGo = new Toilet();
        Ending ending = new Ending();

        if (anwser2 == 1) {
            go.condition1();

        } else if (anwser2 == 2) {
            dontGo.condition2();
            player.takeDamage(30);

        } else if (anwser2 == 3) {
            ending.badEnding1();
            return;

        } else {

        }
        System.out.println();
        System.out.println("다음 선택지로 넘어갑니다. 현재 정신력 : " + player.getMental() + "\n");

        System.out.println("부장님이 갑자기 나한테 점심메뉴를 고르라고하는데..!");
        System.out.println("\n 1. 제육 \n 2. 돈까스 \n 3. 떡볶이 \n 4. 순두부찌개");
        int anwser3 = sc.nextInt();

        Food chiliBulgogi = new Food();
        Food porkCutlet = new Food();
        Food softTofuStew = new Food();
        Food tteokbokki = new Food();

        if (anwser3 == 1) {
            chiliBulgogi.condition1();
            player.takeDamage(20);

        } else if (anwser3 == 2) {
            porkCutlet.condition3();
            player.takeDamage(20);

        } else if (anwser3 == 3) {
            tteokbokki.condition2();

        } else if (anwser3 == 4) {
            softTofuStew.condition4();
            player.takeDamage(30);

        } else {

        }
        System.out.println();
        System.out.println("다음 선택지로 넘어갑니다. 현재 정신력 : " + player.getMental() + "\n");

        /* 미니게임 자리*/
        /* 커피 믹스 */
        System.out.println("\n..지쳤다.\n 탕비실에서 소확횡을 하자!");
        System.out.println("=================== 탕비실 ===================");
        System.out.println("\n 1. 커피믹스 \n 2. 스낵 ");
        int anwser9 = sc.nextInt();


        if (anwser9 == 1) {
            System.out.println("커피믹스 몇개 정돈 훔쳐도 모르겠지.. \n한 웅큼 움켜쥐어본다.");
            System.out.println("탕비실에 상주하는 과장님 몰래 손을 움직입니다.");
            System.out.println("가위 바위 보!");
            String[] rps = {"가위", "바위", "보 \n"};

            int num = (int) (Math.random() * 3);
            System.out.print("가위, 바위, 보 중 하나를 입력하세요: ");
            sc.nextLine();
            String user = sc.nextLine();
            if (user.equals(rps[num])) {
                System.out.println("비겼습니다.. 아쉽지만 횡령은 실패하고 그냥 눈치 본 사람만 됐습니다.");
            } else if ((user.equals("가위") && rps[num].equals("바위")) ||
                    (user.equals("바위") && rps[num].equals("보")) ||
                    (user.equals("보") && rps[num].equals("가위"))) {
                System.out.println("횡령 실패! 갑자기 탕비실에 들이닥친 부장님이 노닥거린다며 잔소리를 시전합니다.");
            } else {
                System.out.println("\n김신입이 이겼습니다. 소확횡을 성공했습니다!!!");
                System.out.println("\n커피믹스로 정신력을 회복합니다.");
                player.heal(20);
            }
        } else {

            /* 스낵 */
            Random random = new Random();
            System.out.println("\n휴 부장님 눈치 보느라 밥도 제대로 못먹었네.. 과자라도 횡령해야겠다. 뭘 먹지?\n");
            System.out.println("1.피넛칩쿠키\n2.먹태깡");
            int userChoice = sc.nextInt();

            if (userChoice == 2) {
                System.out.println("소확횡 성공! 부장님이 눈치채기 전에 횡령을 성공했습니다.");
                player.heal(20);
            } else if(userChoice == 1) {
                System.out.println("부시럭거리다 횡령 실패.. 부장님이 탕비실에서 산다며 구박합니다.");
                player.takeDamage(20);
            }
        }System.out.println("다음 선택지로 넘어갑니다. 현재 정신력 : " + player.getMental() + "\n");



        System.out.println("\n 회의중 부장님이 갑자기 아재개그를 날렸다? 어떻게 반응 할까?");
        System.out.println("\n 1. 하하 \n 2. 호호 \n 3. 꺄하하하항 \n 4. 정색 \n 5. 한마디 거든다.");
        int anwser4 = sc.nextInt();
        Reaction haha = new Reaction();
        Reaction hoho = new Reaction();
        Reaction hahahahahahoho = new Reaction();
        Reaction serious = new Reaction();

        if (anwser4 == 1) {
            haha.condition2();
            player.takeDamage(10);

        } else if (anwser4 == 2) {
            hoho.condition3();
            player.takeDamage(20);

        } else if (anwser4 == 3) {
            hahahahahahoho.condition4();
            player.takeDamage(20);

        } else if (anwser4 == 4) {
            serious.condition1();
            player.heal(20);

        } else if (anwser4 == 5) {
            ending.badEnding2();
            return;
        }
        System.out.println();
        System.out.println("다음 선택지로 넘어갑니다. 현재 정신력 : " + player.getMental() + "\n");

        System.out.println();
        System.out.println("당신의 엔딩은 .......\n");

        if (player.getMental() == 100) {
            ending.hiddenEnding();
        } else if (player.getMental() >= 50) {
            ending.happyEnding();
        } else if (player.getMental() >= 0) {
            ending.badEnding3();
        }
    }
}
