package com.lyt.service;

import com.lyt.pojo.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @version 1.0
 * @Date 2022/6/7
 */
@Transactional
public interface BookService {

    /**
     * 添加
     * @param book
     * @return
     */
    boolean addBook(Book book);

    /**
     * 更新
     * @param book
     * @return
     */
    boolean updateBook(Book book);

    /**
     * 删除
     * @param id
     * @return
     */
    boolean deleteBook(Integer id);

    /**
     * 根据id查询一条数据
     * @param id
     * @return
     */
    Book getBookById(Integer id);

    /**
     * 查询所有数据
     * @return
     */
    List<Book> getAllBook();

}
