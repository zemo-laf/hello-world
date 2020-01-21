package java23种设计模式.建造者模式;

public class Seller {
    private VegetableGarden vegetableGarden;

    public  Seller(VegetableGarden vegetableGarden) {
        this.vegetableGarden = vegetableGarden;
    }
    public Vegetables xuQiu(){
        vegetableGarden.growKongXinCai();
        vegetableGarden.growLuoBo();
        vegetableGarden.growNanGuo();
        return vegetableGarden.getVegetables();
    }
}
