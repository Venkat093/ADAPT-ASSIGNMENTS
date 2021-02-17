package Assignment1Q8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class student implements InitializingBean,DisposableBean {
	private int roll;
	private String name;
	private int clas;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClas() {
		return clas;
	}
	public void setClas(int clas) {
		this.clas = clas;
	}
	public void display()
	{
		System.out.println("student detailes :" +roll+"   "+name+"  "+clas+"  " );
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("disposable bean");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
	 System.out.println("initializing bean");
	}
	public void init()
	{
		System.out.println("init method");
	}
	public void cleanup()
	{
		System.out.println("destroy method");
	}

}
