package gang_of_four.behavioral.visitor;

public class MyConcreteVisitor implements MyVisitor {
    @Override
    public void visit(MyElement myElement) {
        if (myElement instanceof MyConcreteElement) {// cas special
            System.out.println("Cas general : " + myElement);
        } else if (myElement instanceof MyConcreteElementB) {
            System.out.println("Cas special B : " + myElement);
        }
    }
}
