package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void testAgedUserCanPlay(){
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.canPlayGame(19), "Aged user should be able to play game");
    }

    @Test
    public void testThatTooYoungUserCanNotPlay(){
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertFalse(ageChecker.canPlayGame(16),"Too young user should not be able to play game");
    }
}
