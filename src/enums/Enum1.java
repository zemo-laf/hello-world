package enums;

public enum Enum1 {
    one(1,"张三"),two(2,"李四"),three(3,"王五"),five(4,"赵六");
    private int id;
    private String name;

    Enum1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Enum1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
