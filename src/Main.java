import com.company.Computer;
import model.peripherial.Peripherial;
import model.peripherial.peripherals.Mouse;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Computer computer = new Computer();

        System.out.println(computer.getGeneration());

        computer.setGeneration("AAA");

        System.out.println(computer.getGeneration());

        Peripherial mouse1 = new Mouse("USB","Microsoft");

        if(mouse1 instanceof Mouse) {
            ((Mouse)mouse1).setHasScrollWhell(true);
        }
        System.out.println(mouse1.displayDetails());

    }
}
