package learning_spring;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class PopMusic implements Music{
    private List<String> listPopMusic = new LinkedList<>();
    @Override
    public List getSong() {
        listPopMusic.add("Hip hop");
        listPopMusic.add("Lofi hip hop");
        listPopMusic.add("Key pop");
        return listPopMusic;
    }
}
