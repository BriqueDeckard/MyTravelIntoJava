package compil.heritage;

public class ClasseSurcharge extends ClasseMere{
    public ClasseSurcharge(String privateString, String protectedString, String publicString) {
        super(privateString, protectedString, publicString);
    }

    @Override
    public String getPublicString() {
        return super.getPublicString() + " SUPER";
    }
}
