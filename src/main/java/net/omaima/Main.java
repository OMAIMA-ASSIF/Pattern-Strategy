package net.omaima;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        Map<String, Strategy> strategyMap = new HashMap<>();
        Strategy strategy;
        while(true){
            System.out.println("Type your strategy's number  :");
            String str=scanner.nextLine();

            strategy = strategyMap.get(str);
            if(strategy==null){
                System.out.println("Creating new strategy ...");
                strategy =(Strategy) Class.forName("net.omaima.StrategyImpl"+str).getConstructor().newInstance();
                strategyMap.put(str, strategy);
            }

            context.setStrategy(strategy);
            context.effectuerOperation();
        }

    }
}