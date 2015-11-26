/**
 * @Title: RandomUtil.java
 * @Package ren.backstage.util
 * @Description: TODO
 * Copyright: Copyright (c) 2011 
 * 
 * @author Comsys-Mac.Yoon
 * @date 2015-4-14 下午9:08:04
 * @version V1.0
 */

package com.handpay.ibenefit.framework.util;


/**
 * @ClassName: RandomStringUtil
 * @Description: TODO
 * @author Comsys-Mac.Yoon
 * @date 2015-5-30 下午9:08:04
 * 
 */

public class RandomStringUtil {

	/**
	  * createRandom(这里用一句话描述这个方法的作用)
	  *
	  * @Title: createRandom
	  * @Description: TODO
	  * @param @param numberFlag 是否数字
	  * @param @param length 长度
	  * @param @return    设定文件
	  * @return String    返回类型
	  * @throws
	 */
	public static String createRandom(boolean numberFlag, int length) {
		String retStr = "";
		String strTable = numberFlag ? "1234567890":"1234567890abcdefghijkmnpqrstuvwxyz!@#$&_";
		int len = strTable.length();
		boolean bDone = true;
		do {
			retStr = "";
			int count = 0;
			for (int i = 0; i < length; i++) {
				double dblR = Math.random() * len;
				int intR = (int) Math.floor(dblR);
				char c = strTable.charAt(intR);
				if (('0' <= c) && (c <= '9')) {
					count++;
				}
				retStr += strTable.charAt(intR);
			}
			if (count >= 2) {
				bDone = false;
			}
		} while (bDone);

		return retStr;
	}
	
	public static void main(String args[]) {
		System.out.println(createRandom(true, 6));

	}
}