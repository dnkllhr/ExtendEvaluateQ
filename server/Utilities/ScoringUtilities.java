package Utilities;

import GameState.Area;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Aidan on 12/6/2016.
 */
public class ScoringUtilities {

    private static List<Area> featureList = new ArrayList<Area>();

    public static void addFeature(Area area){

        featureList.add(area);
    }

    //return the score from the aggregated features
    public int scoreAreas(){
        int totalScore = 0;
        for(Area area: featureList){
            totalScore += area.getScore();
        }
        return 0;
    }

}
