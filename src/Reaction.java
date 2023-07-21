public class Reaction extends Answer{
    @Override
    public void condition1() {
        System.out.println("자네는 웃음이 별로 없구만. 젊은이가 아주 진중해. 좋아.");
        System.out.println("김신입의 정신력이 20 감소했다.");

    }
    @Override
    public void condition2(){
        System.out.println("곽부장이 또 다시 아재개그를 남발한다.");
        System.out.println("김신입의 정신력이 10 감소했다.");

    }
    @Override
    public void condition3(){
        System.out.println("자네 지금 눈이 동태같은데...?");
        System.out.println("김신입의 정신력이 20 감소했다.");

    }

    public void condition4(){
        System.out.println("그치? 웃기지? 하하하하 김신입 정말 나랑 잘 맞다니까! 기분이다. 오늘 회식이라도 해야겠어~~ 다들 집 갈 생각하지 말아!");
        System.out.println("김신입의 정신력이 20 감소했다.");

    }
}
