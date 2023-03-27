package praktikum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BunTest {
    ContainParam containParam = new ContainParam();
    Bun bun = new Bun(containParam.getBunName(), containParam.getBunPrice());

    @Test
    public void checkGetBunName() {
        assertEquals("Некорректное название булочки",containParam.getBunName(),bun.getName());
    }

    @Test
    public void checkBunPrice() {
        assertEquals("Некорректная цена булочки", containParam.getBunPrice(),bun.getPrice(),0);
    }
}