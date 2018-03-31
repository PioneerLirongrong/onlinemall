package com.onlinemall.param.response;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class PageInfo<T> implements Serializable {

	private Integer pageSize = 20;
	private Integer pageNumber = 1;
	private Long count = new Long(0);
	private List<T> rows;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PageInfo [pageSize=" + pageSize + ", pageNumber=" + pageNumber
				+ ", count=" + count + ", rows=" + rows + "]";
	}
	
	
}
