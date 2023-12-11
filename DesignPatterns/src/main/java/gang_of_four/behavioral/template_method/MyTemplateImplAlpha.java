package gang_of_four.behavioral.template_method;

public class MyTemplateImplAlpha extends MyAbstractTemplate {
    @Override
    protected void childMethodC() {
        System.out.println("Child method C says Alpha");
    }

    @Override
    protected void childMethodB() {
        System.out.println("Child method B says Alpha");
    }

    @Override
    protected void childMethodA() {
        System.out.println("Child method A says Alpha");
    }
}
