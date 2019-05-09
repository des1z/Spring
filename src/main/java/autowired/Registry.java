package autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("registry")
public class Registry {
    @Autowired()
    @Qualifier("doctor")
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
