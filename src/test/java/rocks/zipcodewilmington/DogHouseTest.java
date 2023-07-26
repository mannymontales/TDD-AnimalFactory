package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAdd() {
        // Given
        String name = "Benji";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        Integer createdDog = animal.getId();

        // When
        DogHouse.clear();
        DogHouse.add(animal);


        // Then
        Assert.assertEquals(animal, DogHouse.getDogById(createdDog));
    }

    @Test
    public void testRemoveDog(){
        // Given
        String name = "Benji";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        Integer benjiID = animal.getId();

        // When
        DogHouse.clear();
        DogHouse.remove(animal);

        // Then
        Assert.assertEquals(null, DogHouse.getDogById(benjiID));
    }

    @Test
    public void testRemoveDogByID(){
        //Given
        Dog dog = AnimalFactory.createDog("Benji", new Date());
        Integer benjiID = dog.getId();

        //When
        DogHouse.clear();
        DogHouse.remove(benjiID);

        //Then
        Assert.assertEquals(null, DogHouse.getDogById(benjiID));
    }

    @Test
    public void testGetDogByID(){
        //Given
        Dog dog = AnimalFactory.createDog("Benji", new Date());
        Integer benjiID = dog.getId();

        //When
        DogHouse.clear();
        DogHouse.add(dog);

        //Then
        Assert.assertEquals(dog, DogHouse.getDogById(benjiID));

    }




}
