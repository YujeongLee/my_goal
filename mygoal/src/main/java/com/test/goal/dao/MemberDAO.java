package com.test.goal.dao;

public interface MemberDAO {
	public void join();	//가입
	public void login();	//로그인
	public void logout();	//로그아웃
	public void memberList();	//멤버 목록
	public void idCheck();	//아이디 중복 확인
	public void find();	//ID, 비밀번호 찾기
	public void updateMember();	//회원정보 수정
}