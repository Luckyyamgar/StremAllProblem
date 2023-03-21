package AllBasicProgram;

public class JavaFreeMemory {
	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime(); // Runtime is inside the package java.lang; this is not need to
												// importing package

		System.out.println("Total memory:" + runtime.totalMemory());
		System.out.println("Free memory:" + runtime.freeMemory());
		System.out.println("Available Processor:" + runtime.availableProcessors());
		System.out.println(runtime.equals(runtime));
		System.out.println("Hash cod " + runtime.hashCode());
		System.out.println("maximunm memory" + runtime.maxMemory());
		System.err.println("hell");

	}

}