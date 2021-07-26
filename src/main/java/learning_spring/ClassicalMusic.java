package learning_spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music{
    private List<String> listClassicalMusic = new LinkedList<>();

     @Override
     public List getSong() {
         listClassicalMusic.add("9 symphony");
         listClassicalMusic.add("8 symphony");
         listClassicalMusic.add("7 symphony");
         return listClassicalMusic;
    }

}
