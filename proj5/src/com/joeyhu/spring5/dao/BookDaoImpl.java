package com.joeyhu.spring5.dao;

import com.joeyhu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: huhao
 * @time: 2020/8/12 16:18
 * @desc:
 */
@Repository
public class BookDaoImpl implements BookDao {

    /**
     * 注入JDBCTemplate
     */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 添加
     * @param book
     */
    @Override
    public void addBook(Book book) {

        String sql = "INSERT INTO book values (?, ?, ?);";

        // 调用 update 方法
        Object[] args = {book.getbNo(), book.getbName(), book.getbAuthor()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    /**
     * 修改
     * @param book
     */
    @Override
    public void updateBook(Book book) {
        String sql = "UPDATE book set bName=?, bAuthor=? WHERE bNo=?;";
        Object[] args =  {book.getbName(), book.getbAuthor(), book.getbNo()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void deleteBook(String id) {
        String sql = "DELETE FROM book WHERE bNo=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    /**
     * 查询表的记录数
     */
    @Override
    public int selectCount() {
        String sql = "SELECT COUNT(bNO) FROM book;";
        Integer query = jdbcTemplate.queryForObject(sql, Integer.class);
        return query;
    }

    /**
     * 查询单个记录
     * @param id
     * @return
     */
    @Override
    public Book selectSingleBook(String id) {
        String sql = "SELECT * FROM book WHERE bNo=?;";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    /**
     * 查询所有记录
     * @return
     */
    @Override
    public List<Book> selectAllBooks() {
        String sql = "SELECT * FROM book;";
        List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
        return query;
    }

    /**
     * 批量添加
     * @param batchArgs
     */
    @Override
    public void batchAddBooks(List<Object[]> batchArgs) {
        String sql = "INSERT INTO book VALUES(?, ?, ?);";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 批量修改
     * @param batchArgs
     */
    @Override
    public void batchUpdateBooks(List<Object[]> batchArgs) {
        String sql = "UPDATE book SET bName=?, bAuthor=? WHERE bNo=?;";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(ints);
    }

    /**
     * 批量删除
     * @param batchArgs
     */
    @Override
    public void batchDeleteBooks(List<Object[]> batchArgs) {
        String sql = "DELETE FROM book WHERE bNo=?;";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(ints);
    }


}
