package com.cmh.middleware.server.controller;

import com.cmh.middleware.server.entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hmc
 * @Date: 2020/8/19 上午11:33
 */
@RestController
@RequestMapping("/book")
public class BookController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);

    /**
     * 获取图书详情
     */
    @RequestMapping(value = "info", method = RequestMethod.GET)
    public Book info(Integer bookNo, String bookName) {
        Book book = new Book();
        book.setBookNo(bookNo);
        book.setName(bookName);
        LOGGER.info("对象已创建:%s", book.toString());
        return book;
    }
}
