import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundReturnStringPositiveTest() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getFoodReturnListEmptyMockPositiveTest() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
    }

    @Test
    public void getFoodReturnListAndCheckedPositiveTest() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> actualList = cat.getFood();
        List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");

        for(int i = 0; i < actualList.size(); i++) {
            Assert.assertEquals(actualList.get(i), expectedList.get(i));
        }

    }



}
