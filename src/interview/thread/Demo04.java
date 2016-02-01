package interview.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * Callable
 * 版权所有：2016年1月28日-视频业务部
 * 项目名称：Spring4   
 *
 * 类描述：
 * 类名称：interview.thread.Demo04     
 * 创建人：liguoliang 
 * 创建时间：2016年1月28日 下午3:52:44   
 * 修改人：
 * 修改时间：2016年1月28日 下午3:52:44   
 * 修改备注：   
 * @version   V1.0
 */
public class Demo04 implements Callable<Integer> {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(3);
		Future<Integer> future = service.submit(new Demo04());
		int result = future.get();
		System.out.println(result);
		service.shutdown();
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub

		return 10;
	}

}
