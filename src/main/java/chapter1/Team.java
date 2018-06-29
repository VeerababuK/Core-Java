package chapter1;

public class Team {
    private Member member;

    Team(Member member) {
        this.member = member;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public static void main(String[] args) {
        Member member = new Member("Veera", "light", 10, 1);
        Team team = new Team(member);
        System.out.println(team.member.getName());
        System.out.println(team.member.getType());
        System.out.println(team.member.getLevel());
        System.out.println(team.member.getRank());
    }
}

class Member {
    private String name;
    private String type;
    private int level;
    private int rank;

    public Member(String name, String type, int level, int rank) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getRank() {
        return rank;
    }
}

