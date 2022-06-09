package com.lyt.dao;

import com.lyt.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @version 1.0
 * @Date 2022/6/7
 */


public interface BookDao {

    @Insert("insert into tb_book values(null,#{type},#{name},#{description})")
    int addBook(Book book);

    @Update("update tb_book set type=#{type},name=#{name},description=#{description} where id=#{id}")
    int updateBook(Book book);

    @Delete("delete from tb_book where id=#{id}")
    int deleteBook(Integer id);

    @Select("select * from tb_book where id=#{id}")
    Book getBookById(Integer id);

    @Select("select * from tb_book")
    List<Book> getAllBook();
}
