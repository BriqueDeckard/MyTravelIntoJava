package gang_of_four.behavioral.template_method;

public class MyTemplateImplBeta extends MyAbstractTemplate {
    @Override
    protected void childMethodC() {
        System.out.println("Child method C says Beta");
    }

    @Override
    protected void childMethodB() {
        System.out.println("Child method B says Beta");
    }

    @Override
    protected void childMethodA() {
        System.out.println("Child method A says Beta");
    }
}
