package edu.deq4.spring_core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    MyComponent myComponent;

    public MyService(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    public void doSomething(){
        myComponent.doSomething();
    }

}
