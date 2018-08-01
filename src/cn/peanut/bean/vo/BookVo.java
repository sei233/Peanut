package cn.peanut.bean.vo;

import cn.peanut.bean.po.Book;
import cn.peanut.bean.po.SubCtgy;
import cn.peanut.bean.po.TopCtgy;

public class BookVo {
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public TopCtgy getTopCtgy() {
        return topCtgy;
    }

    public void setTopCtgy(TopCtgy topCtgy) {
        this.topCtgy = topCtgy;
    }

    public SubCtgy getSubCtgy() {
        return subCtgy;
    }

    public void setSubCtgy(SubCtgy subCtgy) {
        this.subCtgy = subCtgy;
    }

    Book book;
    TopCtgy topCtgy;
    SubCtgy subCtgy;


}
