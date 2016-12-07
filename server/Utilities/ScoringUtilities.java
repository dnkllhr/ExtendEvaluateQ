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
    private static int player1score = 0;
    private static int player2score = 0;


    public static void addFeature(Area area){

        featureList.add(area);
    }

    //return the score from the aggregated features
    public void scoreAreas(){
        int totalScore = 0;
        for(Area area: featureList){
            totalScore += area.getScore();
        }
    }

    public void reset(){
        player1score = 0;
        player2score = 0;
    }

    public static int getPlayer1score(){
        return player1score;
    }

    public static int getPlayer2score(){
        return player2score;
    }

}
