package praktikum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;

public class IngredientTest {
    ContainParam containParam = new ContainParam();
    Ingredient ingredient = new Ingredient(FILLING,containParam.getIngredientName(),containParam.getIngredientPrice());

    @Test
    public void checkGetIngredientName() {
        assertEquals("Некорректное название ингридиента",containParam.getIngredientName(),ingredient.getName());
    }

    @Test
    public void checkGetIngredientPrice() {
        assertEquals("Некорректная цена ингридиента",containParam.getIngredientPrice(),ingredient.getPrice(), 0);
    }

    @Test
    public void checkGetIngredientType() {
        assertEquals("Некорректный тип ингридиента",FILLING,ingredient.getType());
    }
}