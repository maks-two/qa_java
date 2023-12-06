import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class FelineTest {
    private final String animals;
    private final String birds;
    private final String fish;

    public FelineTest(String animals, String birds, String fish) {
        this.animals = animals;
        this.birds = birds;
        this.fish = fish;
    }

    @Parameterized.Parameters
    public static Object[][] getCheckedDate() {
        return new Object[][] {
                {"Животные", "Птицы", "Рыба"},
        };
    }

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void returnListFoodForFelineAndChecked() throws Exception {
        Feline feline = new Feline();
        List<String> actualListFood = feline.eatMeat();
        List<String> expectedlListFood = Arrays.asList(animals, birds, fish);

        for(int i = 0; i < actualListFood.size(); i++) {
            Assert.assertEquals(expectedlListFood.get(i), actualListFood.get(i));
        }
    }

    @Test
    public void getFamilyTestReturnStringPositive() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals("Неверно указано семейство животного", expected, actual);
    }

    @Test
    public void getKittenParameterOneMockTest() {
        Feline feline = Mockito.mock(Feline.class);
        feline.getKittens(1);
        Mockito.verify(feline).getKittens(1);
    }

    @Test
    public void getKittenNotParametersNotMockTestReturnInt() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int Expected = 1;
        Assert.assertEquals(Expected, actual);
    }
}
