package com.example.my0211.repository;

import com.example.my0211.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository  extends JpaRepository<Member , Long> {
}
