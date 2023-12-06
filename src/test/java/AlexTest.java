import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AlexTest {

    @Test
    public void checkThatAlexIsMalePositiveTest() throws Exception {
        Alex alex = new Alex(new Feline());
        Assert.assertTrue(alex.doesHaveMane());
    }

    @Test
    public void checkThatAlexIsPredatorPositiveTest() throws Exception {
        Alex alex = new Alex(new Feline());

        List<String> actualFood = alex.getFood();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");

        for(int i = 0; i < actualFood.size(); i++) {
            Assert.assertEquals(expectedFood.get(i), actualFood.get(i));
        }
    }

    @Test
    public void getFriendsReturnListFriendsAndCheckedListPositiveTest() throws Exception {
        Alex alex = new Alex(new Feline());
        List<String> actualFriendsAlex = alex.getFriends();
        List<String> expectedFriendsAlex = Arrays.asList("Марти", "Глория", "Мелман");

        for(int i = 0; i < actualFriendsAlex.size(); i++) {
            Assert.assertEquals(expectedFriendsAlex.get(i), actualFriendsAlex.get(i));
        }
    }

    @Test
    public void getPlaceOfLivingReturnStringPositiveTest() throws Exception {
        Alex alex = new Alex(new Feline());
        String actualGetPlaceOfLiving = alex.getPlaceOfLiving();
        String expectedGetPlaceOfLiving = "Нью-Йоркский зоопарк";
        Assert.assertEquals(expectedGetPlaceOfLiving, actualGetPlaceOfLiving);
    }

    @Test
    public void getKittensReturnIntPositiveTest() throws Exception {
        Alex alex = new Alex(new Feline());
        int actualGetKittens = alex.getKittens();
        int expectedGetKittens = 0;
        Assert.assertEquals(expectedGetKittens, actualGetKittens);
    }

}

