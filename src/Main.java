// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        People p1 = new People("abc", People.Category.COMMON, LevelProduct.LARGE);
        People p2 = new People("def", People.Category.ELDERY, LevelProduct.SMALL);
        People p3 = new People("ghi", People.Category.DEFICIENT, LevelProduct.LARGE);
        People p4 = new People("jkl", People.Category.COMMON, LevelProduct.MEDIUM);
        People p5 = new People("mno", People.Category.COMMON, LevelProduct.SMALL);
        People p6 = new People("pqr", People.Category.COMMON, LevelProduct.MEDIUM);
        People p7 = new People("stu", People.Category.DEFICIENT, LevelProduct.SMALL);
        People p8 = new People("vwx", People.Category.ELDERY, LevelProduct.LARGE);
        People p9 = new People("yz1", People.Category.ELDERY, LevelProduct.SMALL);
        People p10 = new People("yz2", People.Category.ELDERY, LevelProduct.MEDIUM);
        Teller fila = new Teller();
        fila.pushPeople(p1);
        p1.tellMethod();
        fila.pushPeople(p2);
        fila.pushPeople(p3);
        fila.pushPeople(p4);
        fila.pushPeople(p5);
        fila.pushPeople(p6);
        fila.pushPeople(p7);
        fila.pushPeople(p8);
        fila.pushPeople(p9);
        fila.pushPeople(p10);

        System.out.println(fila);
        fila.removePeople();
        System.out.println(fila);
    }
}