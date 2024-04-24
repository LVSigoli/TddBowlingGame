package leanr.test.game;
import org.example.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class GameTest {


private Game game;
@BeforeEach
void setup(){
    game = new Game();
}

@Test
@DisplayName("Should score zero in gutter game")
    void shouldScoreZeroInGutterGame() {
        rollMany(0);
        assertThat(game.score()).isEqualTo(0);
    }

    @Test
    @DisplayName("Should score 40 if scores always 2 ")
    void shouldScore40IfScoresAlways2(){
        rollMany(2);
        assertThat(game.score()).isEqualTo(40);
    }



    private void rollMany(int pins){
    for(int i =0; i<20; i++){
        game.roll(pins);
    }
    }
}
