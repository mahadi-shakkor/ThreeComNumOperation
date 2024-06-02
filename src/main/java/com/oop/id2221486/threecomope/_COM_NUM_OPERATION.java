package com.oop.id2221486.threecomope;

public class _COM_NUM_OPERATION {
    int real,img;

    public _COM_NUM_OPERATION() {
        real=0;
        img=0;
    }

    @Override
    public String toString() {
        return
                "real=" + real +
                ", img=" + img +
                "i  ";
    }

    public _COM_NUM_OPERATION(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public _COM_NUM_OPERATION add(_COM_NUM_OPERATION c){
        _COM_NUM_OPERATION cc=new _COM_NUM_OPERATION();
        cc.real=this.real+c.real;
        cc.img=this.img+c.img;
        return cc;


    }

    public _COM_NUM_OPERATION sub(_COM_NUM_OPERATION c){
        _COM_NUM_OPERATION cc=new _COM_NUM_OPERATION();
        cc.real=this.real-c.real;
        cc.img=this.img-c.img;
        return cc;


    }

}
