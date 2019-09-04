package cn.book.mapper;

import org.apache.ibatis.annotations.Param;


import cn.book.model.User;

public interface UserInFoMapper {
  //判断是否存在，存在则登录
	public User isExit(@Param("userName") String userName,@Param("userPass") String userPass);
  //注册
	public int insertInFo(User user);
	
}
