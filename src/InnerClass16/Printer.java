package InnerClass16;

import javax.xml.namespace.QName;

public class Printer implements Runnable{
    private String name;

    public Printer(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name);
    }

}
