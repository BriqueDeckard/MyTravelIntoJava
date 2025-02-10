package compil.heritage;

public class ClasseMere {
    private String privateString;
    protected String protectedString;
    public String publicString;

    public ClasseMere(String privateString, String protectedString, String publicString) {
        this.privateString = privateString;
        this.protectedString = protectedString;
        this.publicString = publicString;
    }

    public String getPrivateString() {
        return privateString;
    }

    public void setPrivateString(String privateString) {
        this.privateString = privateString;
    }

    public String getProtectedString() {
        return protectedString;
    }

    public void setProtectedString(String protectedString) {
        this.protectedString = protectedString;
    }

    public String getPublicString() {
        return publicString;
    }

    public void setPublicString(String publicString) {
        this.publicString = publicString;
    }
}
