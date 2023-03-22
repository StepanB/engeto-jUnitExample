package animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class CatTest {

    @Test
    public void testCat() {
        Cat cat = new Cat("Micka", "Persian", 3);

        Assertions.assertEquals("Micka", cat.getName());
        Assertions.assertEquals("Persian", cat.getBreed());
        Assertions.assertEquals(3, cat.getAge());
    }

    @Test
    public void testCat2() {
        Cat cat = new Cat("Micka", "Persian", 3);

        Assertions.assertAll(
                () -> Assertions.assertEquals("Micka", cat.getName()),
                () -> Assertions.assertEquals("Persian", cat.getBreed()),
                () -> Assertions.assertEquals(3, cat.getAge())
        );
    }

    @Test
    public void testCatSetters() {
        Cat cat = new Cat();
        cat.setName("Micka");
        cat.setBreed("Persian");
        cat.setAge(3);

        Assertions.assertAll(
                () -> Assertions.assertEquals("Micka", cat.getName()),
                () -> Assertions.assertEquals("Persian", cat.getBreed()),
                () -> Assertions.assertEquals(3, cat.getAge())
        );
    }
    @Test
    public void testCollectionSize() {
        List<Cat> cats = asList(
                new Cat("Micka", "Persian", 3),
                new Cat("Micka2", "Persian2", 4),
                new Cat("Micka3", "Persian3", 5)
        );

        Assertions.assertEquals(3, cats.size());
    }
}
