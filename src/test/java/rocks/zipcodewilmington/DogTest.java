package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void newDogTest(){
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSpeak(){
        //Given
        String expected = "bark!";
        Dog dog = new Dog(null, null, null);

        //When
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetBirthDate(){
        //Given
        Date expected = new Date(2023, 07, 23);
        Dog dog = new Dog(null, null, null);

        //When
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testEat(){
        //Given
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        Integer expected = 1;

        //When
        dog.eat(food);
        Integer actual = dog.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetID(){
        //Given
        Dog dog = new Dog(null, null, 9);
        Integer expected = 9;

        //When
        Integer actual = dog.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testAnimalInheritance(){
        //Given

        //When
        Dog dog = new Dog("nyla", new Date(), 2);

        //Then
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void testMammalInheritance(){
        //Given

        //When
        Dog dog = new Dog("nyla", new Date(), 2);

        //Then
        Assert.assertTrue(dog instanceof Mammal);
    }
}
