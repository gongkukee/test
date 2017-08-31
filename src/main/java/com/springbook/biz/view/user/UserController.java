package com.springbook.biz.view.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Controller
@SessionAttributes("user")
public class UserController {
	@Autowired
	private UserService userService;

	//로그인 체크, 성공이면 유저 정보 창으로(목록으로), 실패하면 다시 로그인 창으로...
	@RequestMapping("/login.ku")
	public String loginCheck(UserVO vo){
		//이미 로그인 상태면 게시판 목록으로 가기
		
		//로그인 상태가 아니면, login_form.jsp로 보내기
				
		return null;
	}
	

	
}
