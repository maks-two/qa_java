import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;


@RunWith(Parameterized.class )
public class AnimalTest {
    private final String kindAnimal;
    private final String expectedFirst;
    private final String expectedSecond;
    private final String expectedThird;
    private final String expectedFiledForMethodGetFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";


    public AnimalTest(String kindAnimal, String expectedFirst, String expectedSecond, String expectedThird) {
        this.kindAnimal = kindAnimal;
        this.expectedFirst = expectedFirst;
        this.expectedSecond = expectedSecond;
        this.expectedThird = expectedThird;
    }

    @Parameterized.Parameters
    public static Object[][] getNameAnimal() {
        return new Object[][] {
                {"Травоядное", "Трава", "Различные растения", ""},
                {"Хищник", "Животные", "Птицы", "Рыба"},
        };
    }


    @Test
    public void gerListFoodAndCheckExpectedAndActualDate() throws Exception {
        Animal animal = new Animal();
        List<String> food = animal.getFood(kindAnimal);
        List<String> expected = Arrays.asList(expectedFirst, expectedSecond, expectedThird);

        for(int i = 0; i < food.size(); i++) {
            Assert.assertEquals(food.get(i), expected.get(i));
        }

    }

    @Test(expected = Exception.class)
    public void returnException() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Неизвестно");
    }

    @Test
    public void checkMethodGetFamilyReturnStringAndAssertEquals() {
        Animal animal = new Animal();
        String actual = animal.getFamily();
        Assert.assertEquals(expectedFiledForMethodGetFamily, actual);
    }


}
