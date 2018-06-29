package chapter1;

public class TeamTest {
    public static void main(String[] args) {

        Member member = new Member("Veera", "light", 10, 1);
        Team team = new Team(member);

        System.out.println(team.getMember().getName());
        System.out.println(team.getMember().getType());
        System.out.println(team.getMember().getLevel());
        System.out.println(team.getMember().getRank());

    }
}
