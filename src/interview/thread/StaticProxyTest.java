package interview.thread;

/**
 * 静态代理：真实角色
 * 		   代理角色：持有真实角色的引用
 * 		   二者共同实现一个接口
 * 版权所有：2016年1月28日-视频业务部
 * 项目名称：Spring4   
 *
 * 类描述：
 * 类名称：interview.thread.StaticProxy     
 * 创建人：liguoliang 
 * 创建时间：2016年1月28日 下午3:13:25   
 * 修改人：
 * 修改时间：2016年1月28日 下午3:13:25   
 * 修改备注：   
 * @version   V1.0
 */
public class StaticProxyTest {

	public static void main(String[] args) {
		//创建真实角色
		Maly maly = new Maly();
		MalyProxy proxy = new MalyProxy();
		proxy.setMaly(maly);
		proxy.before();
		proxy.Marry();
		proxy.after();
	}
}


