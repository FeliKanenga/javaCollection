import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CollectionTest {

    @Test
    public void queue() {
        Assert.assertEquals(Collection.queue(3),3);
    }
}