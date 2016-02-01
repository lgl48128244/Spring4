package interview.thread;

/**
 * 多线程相关：程序：（指令集）静态的概念     program 
 * 		       进程：（调用程序）动态的概念  process 分配资源
 * 		       线程： 在进程内不同的执行路径  thread （并行concurrent） 调度和执行
 * 			       并发：问题A线程影响了B线程的资源
 * 
 * 版权所有：2016年1月28日-视频业务部
 * 项目名称：Spring4   
 *
 * 类描述：
 * 类名称：interview.thread.Demo01     
 * 创建人：liguoliang 
 * 创建时间：2016年1月28日 下午2:26:16   
 * 修改人：
 * 修改时间：2016年1月28日 下午2:26:16   
 * 修改备注：   
 * @version   V1.0
 */
public class Demo01 extends Thread {

	@Override
	public void run() {//线程体
		// TODO Auto-generated method stub
		for (int i = 10; i < 20 + 1; i++) {
			System.out.println("Demo01.run()" + i);
		}
	}

	public static void main(String[] args) {
		Demo01 demo01 = new Demo01();
		Demo001 demo02 = new Demo001();
		//	Thread t = new Thread();
		//t.start();
		demo01.start();//启动线程
		demo02.start();
	}
}

class Demo001 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			System.out.println("Demo02.run()" + i);
		}
	}
}
