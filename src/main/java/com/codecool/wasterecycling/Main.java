package com.codecool.wasterecycling;

public class Main {

    public static void main(String[] args) {
            Garbage test = new PaperGarbage("Failed exam", false);
            ((PaperGarbage) test).squeeze();
            Garbage test2 = new PlasticGarbage("Plastic bag",true);
            Garbage test7 = new PlasticGarbage("Plastic bag",false);
            Garbage test4 = new PlasticGarbage("Empty plastic bottle",true);
            Garbage test5 = new PlasticGarbage("Wrapper foil",true);
            Garbage test3 = new Garbage("Rotten tomato");
            Garbage test6 = new Garbage("Half-eaten lettuce");

            Dustbin dustbin= new Dustbin("Green");
            dustbin.throwOutGarbage(test);
            dustbin.throwOutGarbage(test2);
            dustbin.throwOutGarbage(test3);
            dustbin.throwOutGarbage(test4);
            dustbin.throwOutGarbage(test5);
            dustbin.throwOutGarbage(test6);
            dustbin.throwOutGarbage(test7);
            dustbin.displayContents(dustbin);

            dustbin.emptyContents();
            dustbin.displayContents(dustbin);
    }
}
