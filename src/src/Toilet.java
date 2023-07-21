package src;

public class Toilet extends Answer {
    @Override
    public void condition1() {
        System.out.println("살았다..!");
        System.out.println("부장님의 잔소리가 있었지만 행복한 김신입에게 큰 타격은 아니다.");
    }
    @Override
    public void condition2() {
        System.out.println("하... 터질거 같다");
        System.out.println("강대리가 어디 아프냐며 안쓰럽게 쳐다본다.\n김신입은 정신적 타격을 받았다.");
        System.out.println("김신입의 정신력이 30 감소했다.");

    }


}

