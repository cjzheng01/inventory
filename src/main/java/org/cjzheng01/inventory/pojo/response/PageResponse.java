package org.cjzheng01.inventory.pojo.response;

import org.cjzheng01.inventory.pojo.PageInfo;


public class PageResponse<T> extends ListResponse<T> {

    private static final long serialVersionUID = -7094281310895883629L;

    private PageInfo pageInfo;

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public PageResponse<T> setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
}
