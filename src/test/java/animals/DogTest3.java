package animals;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DogTest3 {
    private static Dog dog;

    @BeforeAll
    public static void init() {
        dog = new Dog("Rex", "Labrador", 3);
        System.out.println("DogTest initialization");
    }

    @BeforeEach
    public void beforeEach() {
        dog.setName("Rex");
        dog.setBreed("Labrador");
        dog.setAge(3);
    }

    @Test
    public void bark() {
        Assertions.assertEquals("Woof!", dog.speak());
    }

    @Test
    @Order(1)
    public void testDogsName() {
        Assertions.assertEquals("Rex", dog.getName());
    }

    @Test
    @Order(2)
    public void testChangeDogsName() {
        Assertions.assertEquals("Rex", dog.getName());
        dog.setName("Vorisek");
        Assertions.assertEquals("Vorisek", dog.getName());
    }

    @Test
    @Order(3)
    public void testDogsName2() {
        Assertions.assertEquals("Rex", dog.getName());
    }

    @Test
    public void barkFailure() {
//        Dog dog = new Dog("Rex", "Labrador", 3);
        Assertions.assertNotEquals("Meow!", dog.speak());
    }

    @Test
    @Order(1)
    public void barkWithExpectedStringValue() {
        String excepted = "Woof!";
//        Dog dog = new Dog("Rex", "Labrador", 3);
        Assertions.assertEquals(excepted, dog.speak());
    }

    @Test
    public void testDogSpeed() {
//        Dog dog = new Dog("Rex", "Labrador", 3);
        Assertions.assertEquals(3, dog.calculateSpeed());
    }
}
