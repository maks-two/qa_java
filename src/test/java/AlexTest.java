import ru.mks.project.Alex;
import ru.mks.project.Feline;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {
    @Mock
    Feline feline;
    @Test
    public void getFriendsIsCorrect() throws Exception {
        List<String> expectedList = List.of(
                "Марти",
                "Глория",
                "Мелман"
        );
        MatcherAssert.assertThat("Неправильный список друзей",
                new Alex(feline).getFriends(),
                equalTo(expectedList)
        );
    }
    @Test
    public void getPlaceOfLivingIsCorrect() throws Exception {
        MatcherAssert.assertThat("Лев Алекс живёт не там",
                new Alex(feline).getPlaceOfLiving(),
                equalTo("Нью-Йоркский зоопарк")
        );
    }
    @Test
    public void getKittensIsAlwaysZero() throws Exception{
        MatcherAssert.assertThat("У льва Алекса не может быть котят",
                new Alex(feline).getKittens(),
                equalTo(0)
        );
    }
}

