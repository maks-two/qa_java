import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import ru.mks.project.Feline;
import ru.mks.project.Lion;

@RunWith(Parameterized.class)
public class LionParametersTest {
    private String sex;
    private boolean hasMane;
    Feline feline = Mockito.mock(Feline.class);

    public LionParametersTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "Проверка возвращаемого значения в зависимости от пола. Тестовые данные: {0} {1}")
    public static Object[][] lionSexParameters() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void returnActualHasMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }
}
