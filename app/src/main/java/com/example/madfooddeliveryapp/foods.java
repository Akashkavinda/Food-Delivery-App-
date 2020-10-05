package com.example.madfooddeliveryapp;

public class foods {

     String fn;
     Float Fp;

    public foods() {
    }

    public foods(String fn, Float fp) {
        this.fn = fn;
        Fp = fp;
    }

    public Float getFood_price() {
        return Fp;
    }

    public void setFood_price(Float fp){
    Fp = fp;
    }

    public String getFood_name(){
        return fn;
    }

    public void setFood_name(String Fn){
        fn = Fn;
    }


}
