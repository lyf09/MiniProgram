package com.cloud.infrastructure.common.utils.pagination;

import com.cloud.infrastructure.common.utils.json.JsonUtils;

import java.util.List;

public class PageParam {

    private Integer pageIndex = 1;
    private Integer pageSize = 5;
    private String orderBy;
    private String sort = "DESC";
    private String keywords;
    private Integer startIndex;

    private String conditions;


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

    public List<Condition> getConditions() {
        if (conditions != null && !conditions.trim().equals("")) {
            return (List<Condition>) JsonUtils.parse(conditions, List.class);
        }
        return null;
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

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return "PageParam{" +
                "pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", orderBy='" + orderBy + '\'' +
                ", sort='" + sort + '\'' +
                ", keywords='" + keywords + '\'' +
                ", startIndex=" + startIndex +
                ", conditions='" + conditions + '\'' +
                '}';
    }
}
