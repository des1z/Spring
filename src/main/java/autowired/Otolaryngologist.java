package autowired;

import org.springframework.stereotype.Component;

/*@Component("otolaryngologist")*/
public class Otolaryngologist implements Doctor {

    @Override
    public void doSomeThing() {
        System.out.println("Отоларинголог ожидает Вас в своём кабените №23");
    }
}
