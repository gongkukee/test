package com.springbook.biz.user;

public interface UserService {

	//로그인 체크, UserVO에 form으로부터 받은 파라미터를 담아 DB와 비교하여 user정보를 리턴
	UserVO loginCheck(UserVO vo);

}