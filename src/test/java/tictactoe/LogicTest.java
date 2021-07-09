package tictactoe;

// Тестирование игры

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class LogicTest {

    @Test
    public void whenHasXWinner() {
        Figure[][] table = {
                {new Figure(true, false), new Figure(), new Figure()},
                {new Figure(), new Figure(true, false), new Figure()},
                {new Figure(), new Figure(), new Figure(true, false)},
        };
        Logic login = new Logic(table);
        assertThat(login.isWinner(Figure::hasMarkX), is(true));
    }


    @Test
    public void whenNotFill() {
        Figure[][] table = {
                {new Figure(true, false), new Figure(), new Figure()},
                {new Figure(), new Figure(), new Figure()},
                {new Figure(), new Figure(), new Figure()},
        };
        Logic login = new Logic(table);
        assertThat(login.isWinner(Figure::hasMarkX), is(false));
        assertThat(login.isWinner(Figure::hasMarkX), is(false));
    }

    @Test
    public void whenHasXHorizontalWinner() {
        Figure[][] table = {
                {new Figure(), new Figure(), new Figure()},
                {new Figure(true, false), new Figure(true, false), new Figure(true, false)},
                {new Figure(), new Figure(), new Figure()},
        };
        Logic login = new Logic(table);
        assertThat(login.isWinner(Figure::hasMarkX), is(true));
    }

    @Test
    public void whenHasXVerticalWinner() {
        Figure[][] table = {
                {new Figure(), new Figure(true, false), new Figure()},
                {new Figure(), new Figure(true, false), new Figure()},
                {new Figure(), new Figure(true, false), new Figure()},
        };
        Logic login = new Logic(table);
        assertThat(login.isWinner(Figure::hasMarkX), is(true));
    }

    @Test
    public void whenHasXBackDiagonalWinner() {
        Figure[][] table = {
                {new Figure(), new Figure(), new Figure(true, false)},
                {new Figure(), new Figure(true, false), new Figure()},
                {new Figure(true, false), new Figure(), new Figure()},
        };
        Logic login = new Logic(table);
        assertThat(login.isWinner(Figure::hasMarkX), is(true));
    }

    @Test
    public void whenHasOWinner() {
        Figure[][] table = {
                {new Figure(true, false), new Figure(), new Figure()},
                {new Figure(true, false), new Figure(true, false), new Figure()},
                {new Figure(true, false), new Figure(), new Figure(true, false)},
        };
        Logic login = new Logic(table);
        assertThat(login.isWinner(Figure::hasMarkX), is(true));
    }

    @Test
    public void whenHasGas() {
        Figure[][] table = {
                {new Figure(true, false), new Figure(), new Figure()},
                {new Figure(), new Figure(true, false), new Figure()},
                {new Figure(), new Figure(), new Figure(true, false)},
        };
        Logic login = new Logic(table);
        assertThat(login.hasGap(), is(true));
    }
}
