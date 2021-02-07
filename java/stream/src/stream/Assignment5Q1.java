package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Fruit{
	
	private String name;
	private int calories;
	private int price;
	private String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString()
	{
		return "fruits[ name: "+name+ "caolories: "+calories+" price : "+price+" color: "+color+"]";
	}
	
}

public class Assignment5Q1 {

	public static void main(String[] args) {
	Fruit F1=new Fruit("apple",65,200,"red");
	Fruit F2=new Fruit("orange",55,230,"orange");
	Fruit F3=new Fruit("custerd apple",30,100,"green");
	Fruit F4=new Fruit("papaya",265,200,"orange");
	Fruit F5=new Fruit("promogranate",165,200,"red");
	Fruit F6=new Fruit("gua",65,200,"red");
		
		List<Fruit> obj=new ArrayList<>();
		obj.add(F6);
		obj.add(F5);
		obj.add(F4);
		obj.add(F3);
		obj.add(F2);
		obj.add(F1);
		
		reversesort(obj);
		ascSort(obj);
		filterred(obj);
		
		
	}
	public static void reversesort(List<Fruit> obj)
	{
		Collections.sort(obj ,(o1,o2)->o1.getColor().compareTo(o2.getColor()));
		obj.forEach(System.out::println);
	}
	public static void ascSort(List<Fruit> obj)

	{
		Collections.sort(obj ,(o1,o2)->o1.getPrice() < o2.getPrice()?1:-1);
		obj.forEach(System.out::println);
	}
	public static void filterred(List<Fruit> list)
	{
		List red=new ArrayList<>();
		for(Fruit x:list)
		{
			if(x.getColor().equals(red))
			{
				red.add(x);
			}
			red.forEach(System.out::println);
		}
	}
}
