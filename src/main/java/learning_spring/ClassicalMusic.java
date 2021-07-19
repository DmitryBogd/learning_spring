package learning_spring;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
     @Override
     public String getSong() {
        return "9 symphony";
    }
}
