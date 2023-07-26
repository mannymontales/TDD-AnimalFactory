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
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName(){
        //Given
        String expected = "nyla";
        Cat cat = new Cat(null, null, null);

        //When
        cat.setName("nyla");

        //Then
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak(){
        //Given
        String expected = "meow!";
        Cat cat = new Cat(null, null, null);

        //When
        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetBirthDate(){
        //Given
        Date expected = new Date(2023, 07, 23);
        Cat cat = new Cat(null, null, null);

        //When
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testEat(){
        //Given
        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        Integer expected = 1;

        //When
        cat.eat(food);
        Integer actual = cat.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetID(){
        //Given
        Cat cat = new Cat(null, null, 9);
        Integer expected = 9;

        //When
        Integer actual = cat.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testAnimalInheritance(){
        //Given

        //When
        Cat cat = new Cat("nyla", new Date(), 2);

        //Then
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void testMammalInheritance(){
        //Given

        //When
        Cat cat = new Cat("nyla", new Date(), 2);

        //Then
        Assert.assertTrue(cat instanceof Mammal);
    }

}
