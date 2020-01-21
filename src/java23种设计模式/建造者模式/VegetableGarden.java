package java23种设计模式.建造者模式;

abstract class VegetableGarden {
    protected Vegetables vegetables = new Vegetables();

    public abstract void  growKongXinCai();
    public abstract void  growLuoBo();
    public abstract void  growNanGuo();

    public Vegetables getVegetables(){
        return vegetables;
    }
}
