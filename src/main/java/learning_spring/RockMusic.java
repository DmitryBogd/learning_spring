package learning_spring;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> listRockMusic = new LinkedList<>();
    @Override
    public List getSong() {
        listRockMusic.add("We will rock you!");
        listRockMusic.add("I'm free!");
        listRockMusic.add("High way to hell!");
        return  listRockMusic;
    }
}
