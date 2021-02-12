package com.example.my0211.service;

import com.example.my0211.entity.Member;
import com.example.my0211.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRepository memberRepository;


    @Test
    void join() {
        //데이터
        Member member =  new Member();
        member.setUsername("hongppark");

        //동작
       Member saved = memberService.join(member);

        //검증
        assertEquals(saved , memberRepository.findById(saved.getId()).orElse(null));//optional을 배껴준단ㄴ
    }
}