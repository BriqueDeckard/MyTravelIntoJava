package creational.gof.prototype.example.second;

public class MyCircle implements MyShape {
    String name;

    public MyCircle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public MyShape clone() {
        MyCircle myCircle = new MyCircle(this.name);
        return myCircle;
    }
}
