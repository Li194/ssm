package com.lyt.service.impl;

import com.lyt.dao.BookDao;
import com.lyt.pojo.Book;
import com.lyt.service.BookService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @Date 2022/6/7
 */

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao;

    @Override
    public boolean addBook(Book book) {
       return bookDao.addBook(book) > 0;
    }

    @Override
    public boolean updateBook(Book book) {
      return bookDao.updateBook(book) > 0;
    }

    @Override
    public boolean deleteBook(Integer id) {
       return bookDao.deleteBook(id) > 0;
    }

    @Override
    public Book getBookById(Integer id) {
        return bookDao.getBookById(id);
    }

    @Override
    public List<Book> getAllBook() {
        return bookDao.getAllBook();
    }
}
