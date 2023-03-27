package praktikum;

public class ContainParam {
    private String bunName = "black bun"; //Наименование булочки
    private float bunPrice = 100; //Цена булочки

    private String ingredientName = "dinosaur"; //Название ингридиента
    private float ingredientPrice = 200; //Цена ингридиента
    private float expectedBurgerPrice = 300; //Ожидаемая цена бургера

    public float getExpectedBurgerPrice() {
        return expectedBurgerPrice;
    }

    public void setExpectedBurgerPrice(float expectedBurgerPrice) {
        this.expectedBurgerPrice = expectedBurgerPrice;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public float getIngredientPrice() {
        return ingredientPrice;
    }

    public void setIngredientPrice(float priceIngredient) {
        this.ingredientPrice = priceIngredient;
    }


    public String getBunName() {
        return bunName;
    }

    public void setBunName(String bunName) {
        this.bunName = bunName;
    }

    public float getBunPrice() {
        return bunPrice;
    }

    public void setBunPrice(float bunPrice) {
        this.bunPrice = bunPrice;
    }
}