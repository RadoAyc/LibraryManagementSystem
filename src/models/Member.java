package models;

public class Member {
    private String memberId;
    private String name;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Getters and setters
    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Member [memberId=" + memberId + ", name=" + name + "]";
    }
}
