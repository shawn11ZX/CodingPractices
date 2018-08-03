package Q3;

import org.junit.Assert;
import org.junit.Test;

import static Q3.Q3_6.*;
public class Q3_6Test {
    @Test
    public void test1() {
        AnimalShelter shelter = new AnimalShelter();
        Assert.assertNull(shelter.dequeueAny());
    }

    @Test
    public void test12() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue(new Cat(1));
        Assert.assertEquals(new Cat(1), shelter.dequeueAny());
    }


    @Test
    public void test13() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue(new Cat(1));
        shelter.enqueue(new Dog(1));
        Assert.assertEquals(new Cat(1), shelter.dequeueAny());
        Assert.assertEquals(new Dog(1), shelter.dequeueAny());
    }

    @Test
    public void test14() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue(new Cat(1));
        shelter.enqueue(new Dog(1));
        Assert.assertEquals(new Dog(1), shelter.dequeueType(Dog.class));
        Assert.assertEquals(null, shelter.dequeueType(Dog.class));
        Assert.assertEquals(new Cat(1), shelter.dequeueType(Cat.class));
    }
}