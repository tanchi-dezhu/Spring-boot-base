package com.base.demo.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 简单分页类
 * 
 * @author Jite Shen
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true) 
public class SimplePage extends com.base.demo.vo.BaseVo implements Paginable {
	private static final long serialVersionUID = 1L;
	public static final int DEF_COUNT = 20;

	/**
	 * 检查页码 checkPageNo
	 * 
	 * @param pageNo
	 * @return if pageNo==null or pageNo<1 then return 1 else return pageNo
	 */
	public static int cpn(Integer pageNo) {
		return (pageNo == null || pageNo < 1) ? 1 : pageNo;
	}

	public SimplePage() {
	}

	/**
	 * 构造器
	 * 
	 * @param pageNo
	 *            页码
	 * @param pageSize
	 *            每页几条数据
	 * @param totalCount
	 *            总共几条数据
	 */
	public SimplePage(int pageNo, int pageSize, int totalCount) {
		setTotalCount(totalCount);
		setPageSize(pageSize);
		setPageNo(pageNo);
		//adjustPageNo();
	}

	/**
	 * 调整页码，使不超过最大页数
	 */
	public void adjustPageNo() {
		if (pageNo == 1) {
			return;
		}
		int tp = getTotalPage();
		if (pageNo > tp) {
			pageNo = tp;
		}
	}

	/**
	 * 获得页码
	 */
	@Override
	public int getPageNo() {
		return pageNo;
	}

	/**
	 * 每页几条数据
	 */
	@Override
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * 总共几条数据
	 */
	@Override
	public long getTotalCount() {
		return totalCount;
	}

	/**
	 * 总共几页
	 */
	@Override
	public int getTotalPage() {
		int totalPage = (int) (totalCount / pageSize);
		if (totalPage == 0 || totalCount % pageSize != 0) {
			totalPage++;
		}
		return totalPage;
	}

	/**
	 * 是否第一页
	 */
	@Override
	public boolean isFirstPage() {
		return pageNo <= 1;
	}

	/**
	 * 是否最后一页
	 */
	@Override
	public boolean isLastPage() {
		return pageNo >= getTotalPage();
	}

	/**
	 * 下一页页码
	 */
	@Override
	public int getNextPage() {
		if (isLastPage()) {
			return pageNo;
		} else {
			return pageNo + 1;
		}
	}

	/**
	 * 上一页页码
	 */
	@Override
	public int getPrePage() {
		if (isFirstPage()) {
			return pageNo;
		} else {
			return pageNo - 1;
		}
	}

	protected long totalCount = 0;
	protected int pageSize = 20;
	protected int pageNo = 1;

	/**
	 * if totalCount<0 then totalCount=0
	 * 
	 * @param totalCount
	 */
	public void setTotalCount(long totalCount) {
		if (totalCount < 0) {
			this.totalCount = 0;
		} else {
			this.totalCount = totalCount;
		}
	}

	/**
	 * if pageSize< 1 then pageSize=DEF_COUNT
	 * 
	 * @param pageSize
	 */
	@Override
	public void setPageSize(int pageSize) {
		if (pageSize < 1) {
			this.pageSize = DEF_COUNT;
		} else {
			this.pageSize = pageSize;
		}
	}

	/**
	 * if pageNo < 1 then pageNo=1
	 * 
	 * @param pageNo
	 */
	@Override
	public void setPageNo(int pageNo) {
		if (pageNo < 1) {
			this.pageNo = 1;
		} else {
			this.pageNo = pageNo;
		}
	}
}
