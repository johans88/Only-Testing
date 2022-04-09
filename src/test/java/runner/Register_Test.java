package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.Register;

public class Register_Test extends Hooks {
    ThreadLocal<Register> login = ThreadLocal.withInitial(Register::new);

    @Test
    public void testRegister(){
        login.get().registerTest();
    }

}
