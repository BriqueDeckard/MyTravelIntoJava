package compil.heritage;

public class HeritageMain {
    public static void main(String[] args) {
        ClasseMere classeMere = new ClasseMere("private", "protected", "public");
        ClasseFille classeFille = new ClasseFille("private", "protected", "public");
        ClasseMere classeMereFille = new ClasseFille("private", "protected", "public");

        String privateString = classeFille.getPrivateString();
    }
}
