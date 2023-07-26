package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog(){
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 2;

        //When (a dog is constructed)
        Dog dog = AnimalFactory.createDog(givenName, givenBirthDate);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        //Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        //Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testCreateCat(){
        //Given
        String givenName = "Benji";
        Date givenBirthDate = new Date();

        //When
        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);

        // When (we retrieve data from the dog)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();

        //Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }
}
