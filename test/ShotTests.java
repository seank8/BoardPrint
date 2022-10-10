import org.junit.Test;
import static org.junit.Assert.*;


public class ShotTests {
    @Test
    public void testMakeShot() throws Exception{
        Shot shot = new Shot("J10");

        assertEquals(9, shot.getRow());
        assertEquals(9, shot.getColumn());
        
    }

    @Test(expected = Exception.class)
    public void testBogusRow() throws Exception{
        Shot shot = new Shot("X5");
    }

    @Test(expected = Exception.class)
    public void testBogusColumn() throws Exception{
        Shot shot = new Shot("");
    }

}
