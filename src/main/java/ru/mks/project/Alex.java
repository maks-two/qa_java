package ru.mks.project;

import java.util.Arrays;
import java.util.List;

public class LionAlex extends Lion {
    List<String> friends;

    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List getFriends() {
        return friends = Arrays.asList("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
    @Override
    public int getKittens() {
        return 0;
    }
}
