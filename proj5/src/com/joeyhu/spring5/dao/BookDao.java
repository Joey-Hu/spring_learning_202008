package com.joeyhu.spring5.dao;

import com.joeyhu.spring5.entity.Book;

import java.util.List;

/**
 * @author: huhao
 * @time: 2020/8/12 16:17
 * @desc:
 */
public interface BookDao {
    /**
     * 添加
     * @param book
     */
    public void addBook(Book book);

    /**
     * 修改
     * @param book
     */
    public void updateBook(Book book);

    /**
     * 删除
     * @param id
     */
    public void deleteBook(String id);

    /**
     * 查询表的记录数
     */
    public int selectCount();

    /**
     * 查询单个记录
     * @param id
     * @return
     */
    public Book selectSingleBook(String id);

    /**
     * 查询所有记录
     * @return
     */
    public List<Book> selectAllBooks();

    /**
     * 批量添加方法
     * @param batchArgs
     */
    public void batchAddBooks (List<Object[]> batchArgs);

    /**
     * 批量修改
     * @param batchArgs
     */
    public void batchUpdateBooks(List<Object[]> batchArgs);

    /**
     * 批量删除
     * @param batchArgs
     */
    public void batchDeleteBooks(List<Object[]> batchArgs);

}
