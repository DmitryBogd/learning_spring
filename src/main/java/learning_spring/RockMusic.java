package learning_spring;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "We will rock you!";
    }
}
