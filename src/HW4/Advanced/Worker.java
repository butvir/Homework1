package HW4.Advanced;

public class Worker {
    public Worker(Clock clock) {
        this.clock = clock;
    }

    public Clock getClock() {
        return clock;
    }

    private Clock clock;
}
