package net.omaima;

public class Context {
    private Strategy strategy = new DefaultStrategyImpl();

    public void effectuerOperation(){
        System.out.println("**************************");
        strategy.operationStrategy();
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
}
