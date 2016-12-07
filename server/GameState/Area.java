package GameState;

import java.awt.*;
import java.util.Set;

/**
 * Created by Aidan on 12/7/2016.
 */
public class Area {

    private Set<Point> featureExtent;
    private Feature feature;

    public Area(Feature feature, Set<Point> featureExtent){
        this.feature = feature;
        this.featureExtent = featureExtent;
    }

    public Set<Point> getFeatureExtent(){
        return this.featureExtent;
    }

    public Feature getFeature(){
        return this.feature;
    }

    public int getScore(){
       //get the scores somehow from the set of points and return that score?
        return 0;
    }

}
