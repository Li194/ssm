package com.lyt;

import com.lyt.config.springConfig;
import com.lyt.pojo.Book;
import com.lyt.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @Date 2022/6/7
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = springConfig.class)
public class BookServiceTest {

    @Resource
    private BookService bookService;

    @Test
    public void testGetById(){
        Book bookById = bookService.getBookById(1);
        System.out.println("bookById = " + bookById);
    }

    @Test
    public void testGetAllBook(){
        List<Book> Book = bookService.getAllBook();
        System.out.println("Book = " + Book);
    }
}
