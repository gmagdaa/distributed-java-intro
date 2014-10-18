package exercise3;

import java.util.concurrent.atomic.AtomicLong;
import common.Counter;
import common.CountingRunner;

public class AtomicCounter implements Counter {

	private AtomicLong at = new AtomicLong();

    @Override
    public void increment() {
    	System.out.println(System.currentTimeMillis());
    	at.incrementAndGet();
    	System.out.println(System.currentTimeMillis());
    	System.exit(0);

    	
    }

    @Override
    public long getValue() {
    	
        return at.longValue();
    }
}
