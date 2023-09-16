package mirea.jobDog;
import java.util.Arrays;
import java.util.Vector;

public class DogKennel {
    private Vector<Dog> dogs = new Vector<Dog>();

    public void setDogs(Dog[] newDogs){
        dogs.addAll(Arrays.asList(newDogs));
    }
}
