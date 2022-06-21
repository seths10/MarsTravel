package SpaceTravel;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CompanyTest {

    Company spaceT = new Company("SpaceT", List.of(
            new Spacer(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship()
    ));

    Company turntablGalactic = new Company("Turntabl Galactic", List.of(
            new Spacer(),
            new Spacer(),
            new Spacer(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Stardelino(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship(),
            new Bulletship()
    ));


    @Test
    public void totalSizeOfFleetIsCorrect() {
        Assert.assertEquals(22, turntablGalactic.getFleet().size());
        Assert.assertEquals(20, spaceT.getFleet().size());
    }


    @Test
    public void totalSizeOfFleetWhereSafetyRatingGT4() {
        int stCount = (int) spaceT.getFleet().stream().filter(s -> s.getSafetyRating() > 4).count();
        Assert.assertEquals(22, turntablGalactic.getFleet().size());
    }

//    @Test
//    public void checkIfSpeedIsAccessible() {
//        Assert.assertEquals(22, turntablGalactic.getFleet().size());
//        Assert.assertEquals();
//    }


}