package hw;

public class Dog {
private String breed;
private String color;
private int age;
public Dog(String breed, String color, int age) {
	super();
	this.breed = breed;
	this.color = color;
	this.age = age;
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
