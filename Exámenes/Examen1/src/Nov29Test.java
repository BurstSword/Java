import org.junit.Test;
import org.junit.Assert;

public class Nov29Test {
    @Test
    public void test(){
    Assert.assertEquals("7 ",Examen29Nov.searchCousins(6,9));
    Assert.assertEquals("23 ",Examen29Nov.searchCousins(20,25));
    }
}
