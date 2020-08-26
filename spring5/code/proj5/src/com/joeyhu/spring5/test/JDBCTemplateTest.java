package com.joeyhu.spring5.test;

import com.joeyhu.spring5.entity.Book;
import com.joeyhu.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huhao
 * @time: 2020/8/12 16:42
 * @desc:
 */
public class JDBCTemplateTest {

    @Test
    public void testAdd() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setbNo("2");
        book.setbName("人类简史 - 从动物到上帝");
        book.setbAuthor("尤瓦尔.赫拉利");
        bookService.addBook(book);
    }

    @Test
    public void testUpdate() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setbNo("2");
        book.setbName("人类简史 - 从动物到上帝");
        book.setbAuthor("以色列作家");
        bookService.updateBook(book);
    }
    @Test
    public void testDelete() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        String bNo = "2";
        bookService.deleteBook(bNo);
    }
    @Test
    public void testSelectCount() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.selectCount());
    }

    @Test
    public void testSelectSingleBook() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.selectSingleBook("2"));
    }

    @Test
    public void testSelectAllBooks() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.selectAllBooks());
    }

    @Test
    public void testBatchAddBooks() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3","神雕侠侣","金庸"};
        Object[] o2 = {"4","射雕英雄传","金庸"};
        Object[] o3 = {"5","雪山飞狐","金庸"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAddBooks(batchArgs);
    }

    @Test
    public void testBatchUpdateBooks() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"神雕侠侣", "金老", "3"};
        Object[] o2 = {"射雕英雄传", "金老", "4"};
        Object[] o3 = {"雪山飞狐","金老", "5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchUpdateBooks(batchArgs);
    }

    @Test
    public void testBatchDeleteBooks() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        Object[] o3 = {"5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDeleteBooks(batchArgs);
    }
}
