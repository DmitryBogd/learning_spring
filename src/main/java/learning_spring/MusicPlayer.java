package learning_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    final Random random = new Random();

    @Autowired
    @Qualifier("rockMusic")
    private Music music;

    @Autowired
    @Qualifier("classicalMusic")
    private Music music2;
    @Autowired
    @Qualifier("popMusic")
    private Music music3;


    public void playMusic(Enum MusicType) {
        if (MusicType.equals(learning_spring.MusicType.Classical) )
            System.out.println(music2.getSong().get(random.nextInt(3)));
        else if (MusicType.equals(learning_spring.MusicType.Rock))
            System.out.println(music.getSong().get(random.nextInt(3)));
        else
            System.out.println(music3.getSong().get(random.nextInt(3)));
    }
}
