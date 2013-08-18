package com.sudomakegame.legendcharactercreator;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: micole
 * Date: 8/14/13
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Character {
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

    int level;
    int experience;

    LegendClass legendClass;
    Race race;

    boolean goodBAB;

    int hitPoints;

    ArrayList<Skills> skillList = new ArrayList<Skills>();

    /*
    Still needed:
    Size
    Weapons/items
     */


}
