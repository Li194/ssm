package com.lyt.controller;

import com.lyt.pojo.Book;
import com.lyt.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @Date 2022/6/7
 */

@RestController
@RequestMapping("/books")
public class BookController {
    @Resource
    private BookService bookService;

    @PostMapping
    public Result addBook(@RequestBody Book book) {
        boolean flag = bookService.addBook(book);
        return new Result(flag ? Code.ADD_OK : Code.ADD_ERR, flag);
    }

    @PutMapping
    public Result updateBook(@RequestBody Book book) {
        boolean flag = bookService.updateBook(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteBook(@PathVariable Integer id) {
        boolean flag = bookService.deleteBook(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getBookById(@PathVariable Integer id) {
        Book book = bookService.getBookById(id);
        Integer code = book != null ? Code.GTE_OK:Code.GTE_ERR;
        String msg = book != null ? "":"数据查询失败，请重试！";
        return new Result(code,book,msg);
    }

    @GetMapping
    public Result getAllBook() {
        List<Book> bookList = bookService.getAllBook();
        Integer code = bookList != null ? Code.GTE_OK:Code.GTE_ERR;
        String msg = bookList != null ? "":"数据查询失败，请重试！";
        return new Result(code,bookList,msg);
    }

}
