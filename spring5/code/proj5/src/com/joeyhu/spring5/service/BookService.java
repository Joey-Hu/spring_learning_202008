package com.joeyhu.spring5.service;

import com.joeyhu.spring5.dao.BookDao;
import com.joeyhu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: huhao
 * @time: 2020/8/12 16:17
 * @desc:
 */
@Service
public class BookService {

    /**
     * 注入Dao
     */
    @Autowired
    private BookDao bookDao;

    /**
     * 添加
     * @param book
     */
    public void addBook(Book book){
        bookDao.addBook(book);
    }

    /**
     * 修改
     * @param book
     */
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    /**
     * 删除
     * @param id
     */
    public void deleteBook(String id){
        bookDao.deleteBook(id);
    }

    /**
     * 查询表的记录数
     * @return
     */
    public int selectCount(){
        return bookDao.selectCount();
    }

    /**
     * 查询单个记录
     * @param id
     * @return
     */
    public Book selectSingleBook(String id) {
        return bookDao.selectSingleBook(id);
    }

    /**
     * 查询所有记录
     * @return
     */
    public List<Book> selectAllBooks() {
        return bookDao.selectAllBooks();
    }

    /**
     * 批量添加
     * @param batchArgs
     */
    public void batchAddBooks(List<Object[]> batchArgs) {
        bookDao.batchAddBooks(batchArgs);
    }

    /**
     * 批量修改
     * @param batchArgs
     */
    public void batchUpdateBooks(List<Object[]> batchArgs) {
        bookDao.batchUpdateBooks(batchArgs);
    }

    public void batchDeleteBooks(List<Object[]> batchArgs) {
        bookDao.batchDeleteBooks(batchArgs);
    }
}
