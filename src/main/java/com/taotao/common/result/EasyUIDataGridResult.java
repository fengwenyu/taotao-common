package com.taotao.common.result;

import java.util.List;

/**
 * EasyUIDataGrid控件通用返回结果
 * <p>Title: EasyUIDataGridResult</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2015年10月19日上午10:32:16
 * @version 1.0
 */
public class EasyUIDataGridResult {

	private long total;
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
}
