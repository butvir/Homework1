package HW4.Advanced;

public class Clock {
    private Boolean IsBroke;

    public Clock(Boolean isBroke) {
        IsBroke = isBroke;
    }

    public void tick() throws ClockBrokenException {
        if (IsBroke) {
        System.out.println("Часы тикают");}
        else {
            throw new ClockBrokenException();
        }
    }
}
