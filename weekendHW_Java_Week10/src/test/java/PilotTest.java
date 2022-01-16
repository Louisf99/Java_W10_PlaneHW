import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Ben", RankType.CAPTAIN, "LN12345678");
    }

    @Test
    public void getRankType() {
        assertEquals(RankType.CAPTAIN, pilot.getRankType());
    }

    @Test
    public void setRankType() {
        pilot.setRankType(RankType.FIRST_OFFICER);
        assertEquals(RankType.FIRST_OFFICER, pilot.getRankType());
    }

    @Test
    public void getLicenseNumber() {
        assertEquals("LN12345678", pilot.getLicenseNumber());
    }

    @Test
    public void setLicenseNumber() {
        pilot.setLicenseNumber("LN87654321");
        assertEquals("LN87654321", pilot.getLicenseNumber());
    }

    @Test
    public void canFlyPlane(){
        pilot.flyPlane();
        assertEquals("Soaring Flyinggg!!!", pilot.flyPlane());
    }
}
