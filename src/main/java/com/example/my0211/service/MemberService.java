package com.example.my0211.service;

import com.example.my0211.entity.Member;
import com.example.my0211.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;


    public Member join(Member member) {
        return memberRepository.save(member);
    }


    public List<Member> findMemberList() {
        return memberRepository.findAll();
    }

    public Member findOne(Long id) {
        return memberRepository.findById(id).orElse(null);
    }




}
