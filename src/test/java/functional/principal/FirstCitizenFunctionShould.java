package functional.principal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstCitizenFunctionShould {
    @BeforeEach
    void setUp() {

    }

    @Test
    void be_pass_as_method_parameter() {
        List<String> players = new LinkedList<>();
        players.add("Ronaldo");
        players.add("Carlos");
        players.sort(String::compareTo);
        assertThat(players.get(0)).isEqualTo("Carlos");
        assertThat(players.get(1)).isEqualTo("Ronaldo");

    }
}
