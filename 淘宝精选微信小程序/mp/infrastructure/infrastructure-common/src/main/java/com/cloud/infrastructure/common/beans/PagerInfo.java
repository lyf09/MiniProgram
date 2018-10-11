package com.cloud.infrastructure.common.beans;

public class PagerInfo {

    private Integer pageIndex = 1;
    private Integer pageSize = 20;
    private String orderBy;
    private String sort = "DESC";
    private String keywords;

    public void setPageIndex(Integer pageIndex) {
        if (pageIndex < 1) pageIndex = 1;
        this.pageIndex = pageIndex;
    }

    public Integer getStartIndex() {
        return (pageIndex - 1) * pageSize;
    }

    public String getSort() {
        return sort.equalsIgnoreCase("DESC") ? "DESC" : "ASC";
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", orderBy='" + orderBy + '\'' +
                ", sort='" + sort + '\'' +
                ", keywords='" + keywords + '\'' +
                '}';
    }
}
