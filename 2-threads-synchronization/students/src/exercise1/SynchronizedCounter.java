package exercise1;

import common.Counter;

public class SynchronizedCounter implements Counter {

	long liczba;
    @Override
    public synchronized void increment() {
    	liczba = liczba +1;
    }

    @Override
    public long getValue() {
        return liczba;
    }
}
