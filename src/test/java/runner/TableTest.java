package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.Table;

public class TableTest extends Hooks {
    ThreadLocal<Table>  table = ThreadLocal.withInitial(Table::new);

    @Test
    public void selectnumbers(){
        table.get().listTable();
    }
}
