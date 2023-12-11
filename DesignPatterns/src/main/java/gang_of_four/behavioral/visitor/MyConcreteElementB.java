package gang_of_four.behavioral.visitor;

public class MyConcreteElementB implements MyElement{
    @Override
    public void accept(MyVisitor visitor) {
        visitor.visit(this);
    }
}
