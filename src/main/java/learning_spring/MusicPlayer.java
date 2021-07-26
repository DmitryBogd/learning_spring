package learning_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    final Random random = new Random();

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    @Qualifier("rockMusic")
    private Music music;

    @Autowired
    @Qualifier("classicalMusic")
    private Music music2;
    @Autowired
    @Qualifier("popMusic")
    private Music music3;


    public String playMusic(Enum MusicType) {
        if (MusicType.equals(learning_spring.MusicType.Classical) )
        return "Playing: " + music2.getSong().get(random.nextInt(3));
        else if (MusicType.equals(learning_spring.MusicType.Rock))
            return "Playing: " + music.getSong().get(random.nextInt(3));
        else
            return "Playing: " + music3.getSong().get(random.nextInt(3));
    }
}
