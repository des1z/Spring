package autowired;

import org.springframework.stereotype.Component;

@Component("doctor")
public class Therapist implements Doctor {

    @Override
        public void doSomeThing() {
        System.out.println("Терапевт ожидает Вас в своём кабените №11");
    }
}
