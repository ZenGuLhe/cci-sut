package skeleton;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

public class BellyTest {
    @Test
    public void eat() throws Exception {
        Belly belly = new Belly();
        belly.eat(55);

        assertThat(belly.cukes, is(equalTo(55)));
    }


    @Test
    public void waitShouldElminiate50CukesPerhour() throws Exception {
        Belly belly = new Belly();
        belly.eat(55);

        belly.nap(1);
        assertThat(belly.flush(), is(equalTo(5)));
    }

}