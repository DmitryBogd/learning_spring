package learning_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


        Computer computer = context.getBean("computer", Computer.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicType.Pop);
        musicPlayer.playMusic(MusicType.Rock);
        musicPlayer.playMusic(MusicType.Classical);
        System.out.println(computer);

        context.close();
    }
}
