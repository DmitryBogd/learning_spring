package learning_spring;

public class ClassicalMusic implements Music{

    public void doMyInit(){
        System.out.println("Doing my init!");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destructions!");
    }
    @Override
    public String getSong() {
        return "9 symphony";
    }
}
