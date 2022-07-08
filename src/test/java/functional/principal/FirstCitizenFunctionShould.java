package functional.principal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstCitizenFunctionShould {
    @BeforeEach
    void setUp() {

    }

    @Test
    void be_pass_as_method_parameter() {
        List<String> players = getPlayers(new LinkedList<>());
        players.sort(getCompareTo());
        assrtComper(players);
    }


    @Test
    void be_pass_as_value_toVariable() {
        List<String> players = getStrings();
        Comparator<String> comparator = getCompareTo();
        players.sort(comparator);
        assrtComper(players);
    }

    private Comparator<String> getCompareTo() {
        return String::compareTo;
    }

    private List<String> getStrings() {
        List<String> players = getPlayers(new LinkedList<>());
        return players;
    }

    private void assrtComper(List<String> players) {
        assertThat(players.get(0)).isEqualTo("Carlos");
        assertThat(players.get(1)).isEqualTo("Ronaldo");
    }

    private List<String> getPlayers(LinkedList<String> players) {
        players.add("Ronaldo");
        players.add("Carlos");
        return players;
    }
}
