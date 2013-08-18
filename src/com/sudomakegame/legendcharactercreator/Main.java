package com.sudomakegame.legendcharactercreator;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("TESTING############");
        List<LegendClass> legendClasses = Helpers.getLegendClasses();
        for(LegendClass l : legendClasses){
            System.out.println(l);
        }

    }
}
