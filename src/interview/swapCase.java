package interview;

import org.apache.commons.lang3.StringUtils;

/*
 * 大小写转换
 * 版权所有：2016年1月25日-视频业务部
 * 项目名称：Spring4   
 *
 * 类描述：
 * 类名称：interview.swapCase     
 * 创建人：liguoliang 
 * 创建时间：2016年1月25日 下午6:23:10   
 * 修改人：
 * 修改时间：2016年1月25日 下午6:23:10   
 * 修改备注：   
 * @version   V1.0
 */
public class swapCase {

	/**
	 * 思路一：利用java toLowerCase() toUperCase()处理
	 */
	public static String changeCase(String str) {

		if (StringUtils.isEmpty(str)) {
			return str;
		}
		char[] buffer = str.toCharArray();
		for (int i = 0; i < buffer.length; i++) {
			char ch = buffer[i];
			if (Character.isUpperCase(ch)) {
				buffer[i] = Character.toLowerCase(ch);
			} else if (Character.isTitleCase(ch)) {
				buffer[i] = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				buffer[i] = Character.toUpperCase(ch);
			}
		}
		return new String(buffer);
	}

	/**
	 * 思路二：commons.lang3 提供工具类StringUtils.swapCase(str);
	 */

	public static void main(String[] args) {
		String msg1 = "wwetrt$%^^352SSSSSDFGGqqqq";
		String msg2 = "WWETRT$%^^352sssssdfggQQQQ";
		System.out.println(changeCase(msg1));
		System.out.println(changeCase(msg2));
		System.out.println("==========================");
		System.out.println(StringUtils.swapCase(msg1));
		System.out.println(StringUtils.swapCase(msg2));
	}
}
