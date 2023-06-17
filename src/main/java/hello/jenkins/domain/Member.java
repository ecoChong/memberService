package hello.jenkins.domain;

import lombok.Data;

@Data
public class Member {

    private String userId;
    private String name;

    public Member(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }
}
