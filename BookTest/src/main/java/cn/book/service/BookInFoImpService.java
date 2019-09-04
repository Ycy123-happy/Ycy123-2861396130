package cn.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.book.mapper.BookInFoMapper;
import cn.book.model.Book;

@Service
public class BookInFoImpService implements BookInFoService{
    @Autowired
    BookInFoMapper bfm;
	public boolean addBook(Book b) {
		boolean flag=false;
		if(bfm.addBook(b)>0){
			flag=true;
		}
		return flag;
	}

}
