package XML;

public class Therapist implements Doctor {

    @Override
    public void doSomeThing() {
        System.out.println("Терапевт ожидает Вас в своём кабените №11");
    }
}
