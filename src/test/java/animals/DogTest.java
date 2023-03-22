package animals;

import org.junit.jupiter.api.*;

public class DogTest {

    @Test
    public void bark() {
        Dog dog = new Dog("Rex", "Labrador", 3);
        Assertions.assertEquals("Woof!", dog.speak());
    }

    @Test
    public void testDogsName() {
        Dog dog = new Dog("Rex", "Labrador", 3);
        Assertions.assertEquals("Rex", dog.getName());
    }
    @Test
    public void testChangeDogsName() {
        Dog dog = new Dog("Rex", "Labrador", 3);
        Assertions.assertEquals("Rex", dog.getName());
        dog.setName("Vorisek");
        Assertions.assertEquals("Vorisek", dog.getName());
    }

    @Test
    public void barkFailure() {
        Dog dog = new Dog("Rex", "Labrador", 3);
        Assertions.assertNotEquals("Meow!", dog.speak());
    }

    @Test
    public void barkWithExpectedStringValue() {
        String excepted = "Woof!";
        Dog dog = new Dog("Rex", "Labrador", 3);
        Assertions.assertEquals(excepted, dog.speak());
    }

    @Test
    public void testDogSpeed() {
        Dog dog = new Dog("Rex", "Labrador", 3);
        Assertions.assertEquals(3, dog.calculateSpeed());
    }

    @Test
    public void testDogSpeedFailure() {
        Dog dog = new Dog("Rex", "Labrador", 0);
//        Assertions.assertEquals(10, dog.calculateSpeed());
        Assertions.assertThrows(ArithmeticException.class, () -> dog.calculateSpeed());
    }
}