//让temp具有线程的权限        Runnable：线程一个名字，国家工程师提供的。
public class Temp implements Runnable{//Alt+/
	//程序的主入口
	public static void main(String[] args) {//Alt+/
		//创建类名对象
		Temp t = new Temp();//根据同学们自己写的来。
		//创建线程Thread 的对象
		Thread tt = new Thread(t);//此时，需要在（）写t，让两个有关系。
		tt.start();//启动线程
	}

	@Override
	public void run() {
		//删除一行快捷键：Ctrl+D
		//打印1-100之间的值
		for (int i = 1; i <= 100; i++) {//1-100
			//打印
			System.out.println(i);//syso  Alt+/
			//try{}catch(){}用来 预处理问题。
			try {
				//隔一秒打印一次   单位：毫秒     //1秒=1000毫秒
				Thread.sleep(1000);//处理报错：快捷键处理
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
