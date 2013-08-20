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
    List<Integer> possibleHpPerLvl;
    List<Boolean> possibleBABGood;
    List<enums.Saves> possibleGoodSave1;
    List<enums.Saves> possibleGoodSave2;
    List<enums.Saves> possibleBadSave;
    List<enums.Ability> possibleKOM;
    List<enums.Ability> possibleKDM;
    List<Integer> possibleSkills;
    String description;

    public String toString(){
        return(
                "Name: " + name +
                "\nHP Per Level: " + possibleHpPerLvl.get(0) +
                "\nBAB: " + (possibleBABGood.get(0) ? "Good" : "Bad") +
                "\nKOM: " + possibleKOM.get(0) + "\nKDM: " + possibleKDM.get(0) +
                "\nNumber of Skills: " + possibleSkills.get(0) +
                "\nDescription: " + description
                );
    }




}
