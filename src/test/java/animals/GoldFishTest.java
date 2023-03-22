package animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GoldFishTest {

    @Test
    public void test() {
        GoldFish goldFish = new GoldFish("Rex", 3);
        Assertions.assertEquals("", goldFish.speak());
    }

    @Test
    void bark() {
    }

    @Test
    void getAge() {
        GoldFish goldFish = new GoldFish("Rex", 3);
        Assertions.assertEquals(3, goldFish.getAge());
    }
}
