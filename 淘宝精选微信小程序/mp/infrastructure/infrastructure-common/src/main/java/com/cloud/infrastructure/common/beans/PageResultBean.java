package com.cloud.infrastructure.common.beans;


import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.List;

public class PageResultBean<T> implements Serializable {
    private String msg;
    private Integer code;
    private Integer pageIndex;
    private Integer pageSize;
    private Long totalCount;
    private Integer totalPage;
    private List<T> results;

    public PageResultBean() {
        this.msg = "success";
        this.code = 200;
        this.pageIndex = 1;
        this.pageSize = 10;
    }

    public PageResultBean(PageInfo pageInfo) {
        this.msg = "success";
        this.code = 200;
        this.pageIndex = pageInfo.getPageNum();
        this.pageSize = pageInfo.getPageSize();
        this.totalCount = pageInfo.getTotal();
        this.totalPage =  pageInfo.getPages();
        this.results = pageInfo.getList();
    }

    public PageResultBean(Integer pageIndex, Integer pageSize, Long totalCount, List<T> results) {
        this.msg = "success";
        this.code = 200;
        this.pageIndex = 1;
        this.pageSize = 10;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPage = (totalCount.intValue() + pageSize - 1) / pageSize;
        this.results = results;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", results=" + results +
                '}';
    }
}