package behavioral.gof.visitor;

public class MyConcreteElement implements MyElement{
    @Override
    public void accept(MyVisitor visitor) {
        visitor.visit(this);
    }
}
