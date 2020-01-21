package java23种设计模式.建造者模式;

import lombok.*;

@Data
public class Vegetables {
    private String kongXinCai;
    private String luoBo;
    private String nanGua;


    public void show()
    {
        System.out.println("空心菜炒着吃，萝卜炖汤，南瓜做甜点");

    }

}
