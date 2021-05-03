package ru.job4j.chess.firuges.black;


import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

        @Test
    public void testPosition() {
        BishopBlack bishop = new BishopBlack(Cell.E4);
        assertThat(bishop.position(),
                is(Cell.E4));
    }

    @Test
    public void testCopy() {
         BishopBlack bishop = new BishopBlack(Cell.C2);
         assertThat(bishop.copy(E3).position(), is(E3));
    }

    @Test
    public void testWay() {
            BishopBlack bishop = new BishopBlack(Cell.C1);
            Cell[] way = bishop.way(Cell.G5);
            Cell[] expected = { D2, E3, F4, G5};
             assertThat(way, is(expected));
    }
}