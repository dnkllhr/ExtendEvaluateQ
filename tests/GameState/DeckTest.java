package GameState;

import cucumber.annotation.hu.De;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Aidan on 12/3/2016.
 */
public class DeckTest {

    Engine engine;
    Deck deck;

    @Before
    public void setUp() throws Exception {
        engine = new Engine();
        deck = new Deck(engine,1);
    }

    @Test
    public void drawTile() throws Exception {
        boolean cardFound = false;
        while(deck.hasTileToDraw()){
            Tile tile = deck.drawTile2();
            if(tile.getName() == "LTLT-"){
                cardFound = true;
            }
        }
        assertTrue(cardFound);
    }

}