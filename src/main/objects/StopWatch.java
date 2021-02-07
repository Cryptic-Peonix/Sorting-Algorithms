package main.objects;

/*
 * Created by Connor Clark
 * Done Honestly
 */
public class StopWatch {

	// Create Variables
	private long elapsedTime;
	private long startTime;
	private boolean isRunning;

	// Constructor
	public StopWatch() {
		reset();
	}

	/**
	 * Start the timer
	 */
	public void start() {
		if (isRunning) {
			return;
		}
		isRunning = true;
		startTime = System.currentTimeMillis();
	}

	/**
	 * Stop the timer
	 */
	public void stop() {
		if (!isRunning) {
			return;
		}
		isRunning = false;
		long endTime = System.currentTimeMillis();
		elapsedTime = elapsedTime + endTime - startTime;
	}

	/**
	 * get the current elapsed time
	 * 
	 * @return the current elapsed time
	 */
	public long getElapsedTime() {
		if (isRunning) {
			long endTime = System.currentTimeMillis();
			return elapsedTime + endTime - startTime;
		} else {
			return elapsedTime;
		}
	}

	/**
	 * reset the timer
	 */
	public void reset() {
		elapsedTime = 0;
		isRunning = false;
	}
}
