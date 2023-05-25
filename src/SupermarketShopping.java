public class SupermarketShopping {
    private LevelProduct levelProduct;
    private int time = 0;


    public LevelProduct getLevelProduct() {
        return levelProduct;
    }

    public SupermarketShopping(LevelProduct levelProduct) {
        this.levelProduct = levelProduct;
    }

    public String setTime() {
        String temp = null;
        if(getLevelProduct() == LevelProduct.LARGE){
            temp = " O tempo máximo é de 6min";
        } else if (getLevelProduct() == LevelProduct.MEDIUM) {
            temp = " O tempo máximo é de 4 min";
        }else {
            temp = " O tempo máximo é de 2 min";
        }
        return temp;
    }
}
