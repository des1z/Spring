package javaConfig;

import org.springframework.stereotype.Component;

@Component("registry")
public class Registry {
    private Doctor doctor;

    public void findCard() {
        System.out.println("Ваша карта больного");
        doctor.doSomeThing();
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
