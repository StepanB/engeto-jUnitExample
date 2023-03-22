package animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomName {

    @Test
    public void testDog() {
        Dog dog = new Dog("Rex", "Labrador", 3);

        Assertions.assertEquals("Re", dog.getName());
        Assertions.assertEquals("Labrador", dog.getBreed());
        Assertions.assertEquals(3, dog.getAge());
    }
}
