package leanr.test.game;
import org.example.Game;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class GameTest {
    @Test
    @DisplayName("Should score zero in gutter game")
    void shouldScoreZeroInGutterGame() {
        Game game = new Game();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertThat(game.score()).isEqualTo(0);
    }
}
