package com.handpay.ibenefit.framework.util;

import javax.servlet.http.HttpServletRequest;
import com.handpay.ibenefit.framework.util.PageSearch;

/**
 * 分页初始化 当前页
 * @author zhliu
 * @date 2015年6月26日
 * @parm
 */
public class PageSearchInit {

	
	public static PageSearch initcurrentPage(PageSearch pageSearch,HttpServletRequest request){
		
		/**
		 * 设置当前页
		 */
		Integer currentPage = 1;
		String currentPageStr = request.getParameter("ec_p");
		if (currentPageStr != null
				&& !("").equals(currentPageStr)) {
			currentPage = Integer.parseInt(currentPageStr);
		}
		pageSearch.setCurrentPage(currentPage);
		
		return pageSearch;
	}
	
	
}
