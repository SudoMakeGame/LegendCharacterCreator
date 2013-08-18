package com.sudomakegame.legendcharactercreator;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: micole
 * Date: 8/14/13
 * Time: 8:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class LegendClass {
    String name;
    int hpPerLvl;
    boolean BABGood;
    List<enums.Saves> goodSaves;
    enums.Saves badSave;
    enums.Ability KOM;
    enums.Ability KDM;
    int skills;
    String description;

    public String toString(){
        return(
                "Name: " + name +
                "\nHP Per Level: " + hpPerLvl +
                "\nBAB: " + (BABGood ? "Good" : "Bad") +
                "\nKOM: " + KOM + "\nKDM: " + KDM +
                "\nNumber of Skills: " + skills +
                "\nDescription: " + description
                );
    }




}
