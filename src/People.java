public class People{

    private String name;
    private Category category;
    private SupermarketShopping product;
    private LevelProduct typeproduct;
    public enum Category{
        ELDERY,
        DEFICIENT,
        COMMON;
    }

    public People(String name, Category category, LevelProduct typeproduct) {
        this.name = name;
        this.category = category;
        product = new SupermarketShopping(typeproduct);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public SupermarketShopping getProduct() {
        return product;
    }
    public String tellMethod(){
        return product.setTime();
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", Category=" + category +
                ",Waiting time=" + tellMethod() +
                '}';
    }
}
