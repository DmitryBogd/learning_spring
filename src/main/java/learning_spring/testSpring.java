package learning_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );




        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(MusicType.Pop);
        musicPlayer.playMusic(MusicType.Rock);
        musicPlayer.playMusic(MusicType.Classical);


        context.close();
    }
}
