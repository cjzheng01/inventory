package org.cjzheng01.inventory.pojo;

import java.io.Serializable;


public class PageInfo implements Serializable {

    private static final long serialVersionUID = -680612627627267987L;


    private int pageSize ;

    private int totalPage;

    private int totalResult;

    private int currentPage;

    public int getPageSize() {
        return pageSize;
    }

    public PageInfo setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public PageInfo setTotalPage(int totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public PageInfo setTotalResult(int totalResult) {
        this.totalResult = totalResult;
        return this;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public PageInfo setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "pageSize=" + pageSize +
                ", totalPage=" + totalPage +
                ", totalResult=" + totalResult +
                ", currentPage=" + currentPage +
                '}';
    }
}
