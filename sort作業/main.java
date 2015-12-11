package hw;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dog> list = new ArrayList<Dog>();
		Dog d1 =new Dog("Affenpinscher","Brown",3);
		Dog d2 =new Dog("Basenji","Black",1);
		Dog d3 =new Dog("Canaan Dog","White",2);
		Dog d4 =new Dog("Dalmatian","White",2);
		Dog d5 =new Dog("Otterhound","Brown",1);
		
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		Collections.sort(list, new DogComparator());
		
		for(Dog d : list)
		{
		System.out.println(d.getAge()
		+"\t"+d.getColor()+"\t"+d.getBreed());
		}

	}

}
