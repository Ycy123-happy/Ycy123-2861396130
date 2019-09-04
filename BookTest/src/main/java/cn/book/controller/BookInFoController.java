package cn.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.book.common.AjaxResponseNum;
import cn.book.common.ApiResponseObject;
import cn.book.model.Book;
import cn.book.service.BookInFoService;
@RestController
@RequestMapping("/api/v1")
public class BookInFoController extends AbstractApiCotriller{
	 @Autowired
	 BookInFoService bfs; 
	@RequestMapping(value="/myhome/addbook",method=RequestMethod.POST,headers="Accept=application/json")
    public ApiResponseObject addBook(String bookNumber,String bookName,double bookPrice){
    	if(bookNumber==null || bookName==null || bookPrice <0.0){
    		return reponseJSON(AjaxResponseNum.FAIL.getCode(), AjaxResponseNum.FAIL.getName(), false);
    	}
    	Book b=new Book();
    	b.setBookName(bookName);
    	b.setBookNumber(bookNumber);
    	b.setBookPrice(bookPrice);
    	boolean res=bfs.addBook(b);
    	if(res){
    		return reponseJSON(AjaxResponseNum.SUCCESS.getCode(), AjaxResponseNum.SUCCESS.getName(), true);
    	}
    	return reponseJSON(AjaxResponseNum.FAIL.getCode(), AjaxResponseNum.FAIL.getName(), false);
    }
}
