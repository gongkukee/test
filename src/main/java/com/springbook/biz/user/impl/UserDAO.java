package com.springbook.biz.user.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserVO;
@Repository
public class UserDAO {
	@Autowired
	public SqlSessionTemplate mybatis;
	
	//로그인 체크, UserVO에 form으로부터 받은 파라미터를 담아 DB와 비교하여 user정보를 리턴
	public UserVO loginCheck(UserVO vo){
		System.out.println("Mybatis를 이용한 loginCheck() 함수 처리");
		UserVO login =(UserVO) mybatis.selectOne("UserDAO.getUser", vo);
		if(login==null){	System.out.println("로그인 실패");}
		else{System.out.println("로그인 성공");}
		return login;
	}
	
}
