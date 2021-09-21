/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

/**
 *
 * @author crist
 */
@Named(value = "indexBean")
@ApplicationScoped
public class IndexBean {

    /**
     * Creates a new instance of IndexBean
     */
    String helloWorld = "";
    
    @PostConstruct
    public void init() {
        helloWorld = "Hello World";
    }

    public String getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(String helloWorld) {
        this.helloWorld = helloWorld;
    }    
}
