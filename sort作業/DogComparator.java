package hw;
import java.util.*;

public class DogComparator implements Comparator<Dog>{
public int compare(Dog dog1, Dog dog2) {
	

if(dog1.getAge() < dog2.getAge()){
return  -1;
}
else if(dog1.getAge() > dog2.getAge()){
	return  1;
	}
else{
	int colorComparedResult=dog1.getColor().compareTo(dog2.getColor());
			if(colorComparedResult !=0){
				return colorComparedResult;
			}
			else{
				int breedComparedResult = dog1.getBreed().compareTo(dog2.getBreed());
				return breedComparedResult;
			}
}

}}