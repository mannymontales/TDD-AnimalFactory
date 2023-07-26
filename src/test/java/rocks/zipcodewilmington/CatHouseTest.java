package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testAdd(){
        //Given (creating instance of cat with Animal factory)
        Cat cat = AnimalFactory.createCat("Nyla", new Date());
        Integer catID = cat.getId();

        //When
        CatHouse.clear();
        CatHouse.add(cat);

        //Then (compare if the cat we created is in the cathouse)
        Assert.assertEquals(cat, CatHouse.getCatById(catID));
    }

    @Test
    public void testRemoveByID(){
        //Given
        Cat cat = AnimalFactory.createCat("Nyla", new Date());
        Integer catID = cat.getId();

        //When
        CatHouse.clear();
        CatHouse.remove(catID);

        //Then
        Assert.assertEquals(null, CatHouse.getCatById(catID));
    }

    @Test
    public void testRemoveByCat(){
        //Given
        Cat cat = AnimalFactory.createCat("Nyla", new Date());
        Integer catID = cat.getId();

        //When
        CatHouse.clear();
        CatHouse.remove(cat);

        //Then
        Assert.assertEquals(null, CatHouse.getCatById(catID));
    }

    @Test
    public void testGetCatByID(){
        //Given
        Cat cat = AnimalFactory.createCat("Nyla", new Date());
        Integer catID = cat.getId();

        //When
        CatHouse.clear();
        CatHouse.add(cat);

        //Then
        Assert.assertEquals(cat, CatHouse.getCatById(catID));
    }

    @Test
    public void testNumberOfCats(){
        //Given
        Cat cat = AnimalFactory.createCat("Nyla", new Date());
        Integer expected = 1;

        //When
        CatHouse.clear();
        CatHouse.add(cat);

        //Then
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }
}
