package cn.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.book.common.AjaxResponseNum;
import cn.book.common.ApiResponseObject;
import cn.book.model.Book;
import cn.book.model.User;
import cn.book.service.BookInFoService;
import cn.book.service.UserInFoService;

@RestController
@RequestMapping("/api/v1")
public class UserInFoController extends AbstractApiCotriller{
    @Autowired
	UserInFoService ufs;
   
    @RequestMapping(value="/login",method=RequestMethod.POST,headers = "Accept=application/json")
    public ApiResponseObject isExit(String userName,String userPass){
    	if(userName==null || userPass==null){
    		return reponseJSON(AjaxResponseNum.FAIL.getCode(), AjaxResponseNum.FAIL.getName(), false);
    	}
    	User user=ufs.isExit(userName, userPass);
    	if(user==null){
    		return reponseJSON(AjaxResponseNum.FAIL.getCode(),AjaxResponseNum.FAIL.getName(),false);
    	}
    	return reponseJSON(AjaxResponseNum.SUCCESS.getCode(), AjaxResponseNum.SUCCESS.getCode(), user);
    }
    @RequestMapping(value="/register",method=RequestMethod.POST,headers="Accept=application/json")
    public ApiResponseObject insertInFo(String userName,String userPass){
    	if(userName==null || userPass==null){
    		return reponseJSON(AjaxResponseNum.FAIL.getCode(), AjaxResponseNum.FAIL.getName(), false);
    	}
    	User user =new User();
    	user.setUserName(userName);
    	user.setUserPass(userPass);
    	int res=ufs.insertInFo(user);
    	if(res==1){
    		return reponseJSON(AjaxResponseNum.SUCCESS.getCode(), AjaxResponseNum.SUCCESS.getName(),1);
    	}else if(res==2){
    		return reponseJSON(AjaxResponseNum.FAIL.getCode(), AjaxResponseNum.FAIL.getName(), 2);
    	}
    	return reponseJSON(AjaxResponseNum.FAIL.getCode(), AjaxResponseNum.FAIL.getName(), 0);
    }
    
}
