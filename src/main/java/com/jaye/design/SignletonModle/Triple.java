package com.jaye.design.SignletonModle;

public class Triple {
    private Triple(){}
    private static Triple instance ;
    public static Triple getInstance(){
        if (instance == null){
            instance = new Triple();
            return instance;
        }
        return instance;
    }
}
