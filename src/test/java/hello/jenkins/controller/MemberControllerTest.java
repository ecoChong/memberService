package hello.jenkins.controller;

import hello.jenkins.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberControllerTest {

    @Test
    @DisplayName("이용자 조회 테스트")
    void getMemberTest(){

        Member member = new Member("userA","정총명");
        Assertions.assertThat(member.getName()).isEqualTo("정총밍");

    }

}