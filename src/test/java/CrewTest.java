import Crew.CabinCrewMember;
import Crew.CrewRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrewTest {
    private CabinCrewMember crew1, crew2;


    @Before
    public void before(){
        crew1 = new CabinCrewMember("Robert", CrewRank.CABINCREW);
        crew2 = new CabinCrewMember("Sarah", CrewRank.PURSER);
    }

    @Test
    public void doesCrewHaveName(){
        assertEquals("Robert", crew1.getName());
    }

    @Test
    public void doesCrewHaveRank(){
        assertEquals(CrewRank.CABINCREW, crew1.getRank());
        assertEquals(CrewRank.PURSER, crew2.getRank());
    }
}
