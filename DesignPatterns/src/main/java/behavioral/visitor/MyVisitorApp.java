package behavioral.visitor;

import java.util.stream.Stream;

public class MyVisitorApp {
    public static void main(String[] args) {
        MyConcreteVisitor myConcreteVisitor = new MyConcreteVisitor();
        Stream.of(
                new MyConcreteElement(),
                new MyConcreteElementB()
        ).forEach(myConcreteVisitor::visit);
    }
}
