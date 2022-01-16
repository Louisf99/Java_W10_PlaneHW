import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Louis", RankType.FIRST_OFFICER);
    }

    @Test
    public void getName() {
        assertEquals("Louis", cabinCrewMember.getName());
    }

    @Test
    public void setName() {
        cabinCrewMember.setName("Susan");
        assertEquals("Susan", cabinCrewMember.getName());
    }

    @Test
    public void getRankType() {
        assertEquals(RankType.FIRST_OFFICER, cabinCrewMember.getRankType());
    }

    @Test
    public void setRankType() {
        cabinCrewMember.setRankType(RankType.FLIGHT_ATTENDANT);
        assertEquals(RankType.FLIGHT_ATTENDANT, cabinCrewMember.getRankType());

    }
}
