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

	//�α��� üũ, �����̸� ���� ���� â����(�������), �����ϸ� �ٽ� �α��� â����...
	@RequestMapping("/login.ku")
	public String loginCheck(UserVO vo){
		//�̹� �α��� ���¸� �Խ��� ������� ����
		
		//�α��� ���°� �ƴϸ�, login_form.jsp�� ������
				
		return null;
	}
	

	
}
