package cn.book.service;

import cn.book.model.User;

public interface UserInFoService {
    //登录
	public User isExit(String userName,String userPass);
	//注册
	public int insertInFo(User user);

}
