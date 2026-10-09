package net.omaima;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.effectuerOperation();

        context.setStrategy(new StrategyImpl1());
        context.effectuerOperation();

        context.setStrategy(new StrategyImpl2());
        context.effectuerOperation();

    }
}