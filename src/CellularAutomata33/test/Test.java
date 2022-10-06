package CellularAutomata33.test;

import CellularAutomata33.controller.Rule;

public class Test {
    public static void main(String[] args) {
        Rule rule = new Rule(90);
        System.out.println(rule);

        for (int i = 7; i >= 0; i--) {
            System.out.print(rule.get(i));
        }
    }
}
