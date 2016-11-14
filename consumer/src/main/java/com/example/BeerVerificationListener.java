package com.example;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * @author Marcin Grzejszczak
 */
@Component
class BeerVerificationListener {

	private static final Log log = LogFactory.getLog(BeerVerificationListener.class);

	AtomicInteger eligibleCounter = new AtomicInteger();
	AtomicInteger notEligibleCounter = new AtomicInteger();

}

/*






	@StreamListener(Sink.INPUT)
	public void listen(Verification verification) {

	}

	public static class Verification {
		public boolean eligible;
	}

		log.info("Received new verification");
		if (verification.eligible) {
			eligibleCounter.incrementAndGet();
		} else {
			notEligibleCounter.incrementAndGet();
		}
 */