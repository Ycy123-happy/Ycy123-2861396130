package cn.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.book.mapper.UserInFoMapper;
import cn.book.model.User;

@Service
public class UserInFoImpService implements UserInFoService{
    @Autowired
	UserInFoMapper ufm;
	public User isExit(String userName, String userPass) {
		User user=ufm.isExit(userName, userPass);
		if(ufm.isExit(userName, userPass)!=null){
			user=ufm.isExit(userName, userPass);
		}
		return user;
	}
	public int insertInFo(User user) {
		int flag=0;
		System.out.println(user.toString());
		User user1=ufm.isExit(user.getUserName(), user.getUserPass());
		if(user1!=null){
			return 2; 
		}
		int res=ufm.insertInFo(user);
		if(res>0){
			flag = 1;
		}
		return flag;
	}

}
