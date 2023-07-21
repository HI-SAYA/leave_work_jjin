package src;

public class Food extends Answer {
    @Override
    public void condition1() {
        System.out.println("하필 어제 먹은걸 에이 쯧! 김신입 그렇게 안봤는데 센스가 없구먼");
        System.out.println("김신입의 정신력이 20 감소했다.");

    }
    @Override
    public void condition2(){
        System.out.println("오 떡볶이? 김신입 간만에 센스 있네~ 안 그래도 마라엽떡이 먹고 싶었는데 말이야. 하하!!");

    }
    @Override
    public void condition3(){
        System.out.println("에이 무슨 점심부터 튀김이야.. 속도 부대끼는데.. 에휴.. 저기 가서 김치나 더 떠오게");
        System.out.println("김신입의 정신력이 20 감소했다.");
    }


    public void condition4(){
        System.out.println("날도 더운데 무슨 뜨거운 국물이야!!");
        System.out.println("곽부장이 대노했다....");
        System.out.println("김신입의 정신력이 30 감소했다.");

    }
}
