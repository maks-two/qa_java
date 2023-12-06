import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import ru.mks.project.Feline;
import ru.mks.project.LionAlex;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    private final int noKittensLionAlex = 0;
    @Spy
    Feline feline = new Feline();

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getFriends() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        Map<String, String> expectedFriends = new HashMap<>();
        expectedFriends.put("Зебра", "Марти");
        expectedFriends.put("Бегемотиха", "Глория");
        expectedFriends.put("Жираф", "Мелман");
        assertEquals(expectedFriends, lionAlex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

    @Test
    public void getKittens() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(noKittensLionAlex, lionAlex.getKittens());
    }
}