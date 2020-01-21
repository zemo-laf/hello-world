package java23种设计模式.建造者模式;

public class Buyer {
    public static void main(String[] args) {
        VegetableGarden vg = new VegetableGardenImpl();
        Seller seller = new Seller(vg);
        Vegetables vegetables = seller.xuQiu();
        vegetables.show();
    }
}
