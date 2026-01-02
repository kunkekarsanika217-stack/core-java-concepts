class AccessModifierDemo {

    private int privateValue = 10;
    int defaultValue = 20;
    protected int protectedValue = 30;
    public int publicValue = 40;

    private void privateMethod() {
        System.out.println(privateValue);
    }

    void defaultMethod() {
        System.out.println(defaultValue);
    }

    protected void protectedMethod() {
        System.out.println(protectedValue);
    }

    public void publicMethod() {
        System.out.println(publicValue);
    }

    public void showAll() {
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}

class ChildClass extends AccessModifierDemo {

    public void accessProtected() {
        System.out.println(protectedValue);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {

        AccessModifierDemo obj = new AccessModifierDemo();
        obj.publicMethod();
        obj.defaultMethod();
        obj.protectedMethod();
        obj.showAll();

        ChildClass child = new ChildClass();
        child.accessProtected();
    }
}