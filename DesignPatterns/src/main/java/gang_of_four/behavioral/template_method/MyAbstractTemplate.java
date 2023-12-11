package gang_of_four.behavioral.template_method;

public abstract class MyAbstractTemplate {
    public final void finalMethod(){
        childMethodA();
        childMethodB();
        childMethodC();
    }

    protected abstract void childMethodC();

    protected abstract void childMethodB();

    protected abstract void childMethodA();
}
