# Compil java

Le fichier *.java est le code source.
```java
public class MainMethod {
    public static void main(String[] args) {

    }
}
```
On le compile, pour obtenir du bytecode.
- `javac {{nomDuFichier.java}}`
- `javac *.java`
- `javac **/*.java`
- `javac -d . compil/mainwithsomecode/mainWithSomeCode.java` // L'option -d . indique au compilateur de placer les fichiers .class dans le répertoire correspondant à leur package

```
Compiled from "MainMethod.java"
public class compil.main.MainMethod {
  public compil.main.MainMethod();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: return
}
```

Le bytecode est ensuite interprêté par la JVM en "Just In Time" compilation.
C'est compiler le bytecode en code machine natif, c'est-à-dire en instructions directement exécutables par le processeur de l'ordinateur. Cette compilation a lieu au moment de l'exécution du programme, d'où le terme "juste à temps"

```
; aload_0 (this)
mov rax, rdi  ; rdi contient 'this' dans la convention d'appel x86-64

; invokespecial #1 (appel du constructeur de la superclasse)
call java_lang_Object_init ; Appel d'une fonction (représentation simplifiée)

; bipush 10
mov rbx, 10   ; Charge la constante 10 dans le registre rbx

; putfield #7 (simpleInt)
mov [rax + offset_de_simpleInt], rbx ; Stocke rbx dans le champ simpleInt

; ... (les autres instructions seraient traduites de manière similaire)
```

- Pour obtenir un JAR: 
`jar cfe mainWithSomeCode.jar compil.mainwithsomecode.mainWithSomeCode -C compil/mainwithsomecode mainWithSomeCode.class`

- Pour vérifier le JAR:
`jar tf .\MainWithSomeCode.jar `

- Pour executer le JAR en loggant le GC: 
`java -Xlog:gc*:file=compil/mainwithsomecode/gc.log:time,uptime -jar compil/mainwithsomecode/mainWithSomeCode.jar `