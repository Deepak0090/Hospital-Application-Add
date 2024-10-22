package com.example.Hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;

	}
	@Override
	public int compareTo(Student o){
		return this.marks - o.marks;
	}
	@Override
	public String toString(){
		return name+" "+marks;
	}
}
class Box<T>{
	private T item;
	public Box(T item){
		this.item=item;
	}
	public T getItem(){
		return item;
	}
	public void setItem(T item){
		this.item=item;
	}
	@Override
	public String toString(){
		return item.toString();
	}
}
class Pair<T,V>{
	private T first;
	private V second;
	public Pair(T first,V second){
		this.first=first;
		this.second=second;
	}
	public T getFirst(){
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}
	public V getSecond(){
		return second;
	}
	public void setSecond(V second){
		this.second=second;
	}
	@Override
	public String toString(){
		return first.toString()+" "+second.toString();
	}
}

@SpringBootApplication
public class HospitalApplication{

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("orange");
		fruits.add("apple");
//		System.out.println(fruits.get(1));
////		fruits.sort(String::compareTo);
//		Collections.sort(fruits);
//		for (String list : fruits){
//			System.out.println(list);
//		}
//		Iterator<String> iterator = fruits.iterator();
//		while (iterator.hasNext()){
//			String fruit = iterator.next();
//			System.out.println(fruit);
//		}
//
//		ArrayList<Student> students = new ArrayList<>();
//		students.add(new Student("aadi",43));
//		students.add(new Student("deepak",32));
//		students.add(new Student("naveen",21));
//		students.add(new Student("harsh", 16));
//
//		Collections.sort(students);
//
//		for (Student st : students){
//			System.out.println(st);

//		Box<Integer> integerBox = new Box<>(12345);
//		System.out.println(integerBox.getItem());
//		Box<String> stringBox = new Box<>("Hello Deepak");
//		System.out.println(stringBox.getItem());

		Pair<String,Integer> pair = new Pair<>("Deepak",12);
		System.out.println(pair);
		Pair<String,Double> pair1 = new Pair<>("Deepak choudhary", 4.0);
		System.out.println(pair1);
		Pair<String,Boolean> pair2 = new Pair<>("aditya",true);
		System.out.println(pair2);


      	SpringApplication.run(HospitalApplication.class, args);
	}


}
