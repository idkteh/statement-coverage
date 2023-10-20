import static org.junit.jupiter.api.Assertions.*;

class StatementCoverageTest {

    @org.junit.jupiter.api.Test
    void testCold() {
        StatementCoverage t = new StatementCoverage();
        assertEquals("cold",t.tempIndicator(5));
    }
    @org.junit.jupiter.api.Test
    void testHot() {
        StatementCoverage t = new StatementCoverage();
        assertEquals("hot",t.tempIndicator(25));
    }
    @org.junit.jupiter.api.Test
    void testWarm() {
        StatementCoverage t = new StatementCoverage();
        assertEquals("warm",t.tempIndicator(15));
    }
}