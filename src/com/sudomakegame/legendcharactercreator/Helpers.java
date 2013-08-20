package com.sudomakegame.legendcharactercreator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: micole
 * Date: 8/14/13
 * Time: 8:26 PM
 * To change this template use File | Settings | File Templates.
 */

// http://www.mkyong.com/java/how-to-read-xml-file-in-java-dom-parser
public class Helpers {

    public static List<LegendClass> getLegendClasses(){
        ArrayList<LegendClass> classes = new ArrayList<LegendClass>();
        try{
            //System.out.println(new File("testing").getAbsolutePath());
            File fXmlFile = new File("resources/classes.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("Class");

            for(int i = 0; i < nList.getLength(); i++){
                Node nNode = nList.item(i);

                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    LegendClass x = new LegendClass();
                    //TODO: Goodsaves/badsaves
                    //TODO: Varies, and Any One
                    /*
                    Refactor to have it that if the element has more than one item, put it into a list
                     */

                    x.name = eElement.getElementsByTagName("Name").item(0).getTextContent();

                    x.possibleHpPerLvl = new ArrayList<Integer>();
                    NodeList nl = eElement.getElementsByTagName("HP");
                    for(int j = 0; j < nl.getLength(); j++){
                        x.possibleHpPerLvl.add(Integer.valueOf(nl.item(j).getTextContent()));
                    }

                    x.possibleBABGood = new ArrayList<Boolean>();
                    nl = eElement.getElementsByTagName("BAB");
                    for(int j = 0; j < nl.getLength(); j++){
                        x.possibleBABGood.add(nl.item(j).getTextContent().startsWith("Good"));
                    }

                    x.possibleGoodSave1 = new ArrayList<enums.Saves>();
                    nl = eElement.getElementsByTagName("GoodSave1");
                    for(int j = 0; j < nl.getLength(); j++){
                        x.possibleGoodSave1.add(enums.Saves.valueOf(nl.item(j).getTextContent().toUpperCase()));
                    }

                    x.possibleGoodSave2 = new ArrayList<enums.Saves>();
                    nl = eElement.getElementsByTagName("GoodSave2");
                    for(int j = 0; j < nl.getLength(); j++){
                        x.possibleGoodSave2.add(enums.Saves.valueOf(nl.item(j).getTextContent().toUpperCase()));
                    }

                    x.possibleBadSave = new ArrayList<enums.Saves>();
                    nl = eElement.getElementsByTagName("BadSave");
                    for(int j = 0; j < nl.getLength(); j++){
                        x.possibleBadSave.add(enums.Saves.valueOf(nl.item(j).getTextContent().toUpperCase()));
                    }

                    x.possibleKOM = new ArrayList<enums.Ability>();
                    nl = eElement.getElementsByTagName("KOM");
                    for(int j = 0; j < nl.getLength(); j++){
                        x.possibleKOM.add(enums.Ability.valueOf(nl.item(j).getTextContent().toUpperCase()));
                    }

                    x.possibleKDM = new ArrayList<enums.Ability>();
                    nl = eElement.getElementsByTagName("KDM");
                    for(int j = 0; j < nl.getLength(); j++){
                        x.possibleKDM.add(enums.Ability.valueOf(nl.item(j).getTextContent().toUpperCase()));
                    }

                    x.possibleSkills = new ArrayList<Integer>();
                    nl = eElement.getElementsByTagName("Skills");
                    for(int j = 0; j < nl.getLength(); j++){
                        x.possibleSkills.add(Integer.valueOf(nl.item(j).getTextContent()));
                    }

                    x.description = eElement.getElementsByTagName("Description").item(0).getTextContent();
                    classes.add(x);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return classes.subList(0,classes.size());
    }


}
