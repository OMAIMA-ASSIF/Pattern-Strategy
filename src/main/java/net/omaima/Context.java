package net.omaima;

public class Context {
    public void effectuerOperation(int type){
        if(type==1){
            System.out.println("******************************");
            System.out.println("Strategy 1");
            System.out.println("******************************");
        }else if(type==2){
            System.out.println("******************************");
            System.out.println("Strategy 2");
            System.out.println("******************************");
        } else if (type==3){
            System.out.println("******************************");
            System.out.println("Strategy 3");
            System.out.println("******************************");
        } else{
            System.out.println("******************************");
            System.out.println("Strategy par defaut");
            System.out.println("******************************");
        }

    }
}
