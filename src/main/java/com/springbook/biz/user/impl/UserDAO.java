package com.springbook.biz.user.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserVO;
@Repository
public class UserDAO {
	@Autowired
	public SqlSessionTemplate mybatis;
	
	//�α��� üũ, UserVO�� form���κ��� ���� �Ķ���͸� ��� DB�� ���Ͽ� user������ ����
	public UserVO loginCheck(UserVO vo){
		System.out.println("Mybatis�� �̿��� loginCheck() �Լ� ó��");
		UserVO login =(UserVO) mybatis.selectOne("UserDAO.getUser", vo);
		if(login==null){	System.out.println("�α��� ����");}
		else{System.out.println("�α��� ����");}
		return login;
	}
	
}
