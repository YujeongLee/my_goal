package com.test.goal.dao;

public interface MemberDAO {
	public void join();	//����
	public void login();	//�α���
	public void logout();	//�α׾ƿ�
	public void memberList();	//��� ���
	public void idCheck();	//���̵� �ߺ� Ȯ��
	public void find();	//ID, ��й�ȣ ã��
	public void updateMember();	//ȸ������ ����
}