package java23种设计模式.建造者模式;

public class VegetableGardenImpl extends VegetableGarden {
    @Override
    public void growKongXinCai() {
        System.out.println("种植空心菜");
        vegetables.setKongXinCai("种植空心菜");
    }

    @Override
    public void growLuoBo() {
        System.out.println("种植萝卜");
        vegetables.setKongXinCai("种植萝卜");
    }

    @Override
    public void growNanGuo() {
        System.out.println("种植南瓜");
        vegetables.setKongXinCai("种植南瓜");
    }

}
