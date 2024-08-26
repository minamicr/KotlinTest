package com.minami.datatypes;

import java.io.IOException;

public class JavaTest {

    public static void main(String[] args) {
        Bus bus = new Bus("blue", "Mercedez", 2011);
        System.out.println(bus);
        // because of @JvmField, the property is not achieved by get
        System.out.println(bus.model);
        // even here, the property don't use set
        bus.model = "Volvo";
        // color does't have set because it's val
        System.out.println(bus.getColor());
        bus.setYear(2010);
        System.out.println(bus);

        // because of @JvmStatic there is no need of companion
        // Bus.Companion.busCompanion();
        Bus.busCompanion();
        // System.out.println(Bus.Companion.isAuto());
        System.out.println(Bus.isAuto);
        //Constant doesn't need annotation
        System.out.println(Bus.constant);

        // because of @JvmStatic there is no need of INSTANCE with object
        SingletonObj.doSomething();
        // SingletonObj.INSTANCE.doSomething();

        // For Java knowing the method could throw an exception,
        // it's needed to annotate the method with @Throws
        try {
            StaticBus.doIO();
        } catch(IOException e){
            System.out.println("IOException");
        }

        bus.printMe("teste");

        StaticBus.defaultArgs("The number is: ", 40 );
        StaticBus.defaultArgs("The number is: ");
    }
}
