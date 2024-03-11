package com.cydeo;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {
//    @Autowired
//    OfficeHours officeHours;  Field  injection is not recommended by Spring. PLease check link to know more: https://stackoverflow.com/questions/39890849/what-exactly-is-field-injection-and-how-to-avoid-it

    /*
    Field injection drawbacks

The reasons why field injection is frowned upon are as follows:

You cannot create immutable objects, as you can with constructor injection
Your classes have tight coupling with your DI container and cannot be used outside of it
Your classes cannot be instantiated (for example in unit tests) without reflection. You need the DI container to instantiate them, which makes your tests more like integration tests
Your real dependencies are hidden from the outside and are not reflected in your interface (either constructors or methods)
It is really easy to have like ten dependencies. If you were using constructor injection, you would have a constructor with ten arguments,
which would signal that something is fishy.
But you can add injected fields using field injection indefinitely.
Having too many dependencies is a red flag that the class usually does more than one thing, and that it may violate the Single Responsibility Principle.
     */

//    public Java() {
//        this.officeHours = new OfficeHours();
//    }

    private final OfficeHours officeHours;

    // below is DI via Constructor which is mostly recommended

//    public Java() {
//    }
    @Autowired
    public Java( @NonNull OfficeHours officeHours) {
        this.officeHours = officeHours;
    }




    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: "+(20+officeHours.getHours()));
    }
   /*
   if we do below autoWiring getTeachingHours method, then Constructor of Java class would be generated Calling getTeachingHours method.
   So in AppRunner class, when call getTeachingHours via Bean of Java class, getTeachingHours will be called twice.(One from Constructor another one from method itself )

    @Autowired
    public void getTeachingHours(OfficeHours officeHours){
        System.out.println("Weekly teaching hours: "+(20+officeHours.getHours()));
    }

     public Java() {
        this.getTeachingHours(new OfficeHours());
    }
    */



}
