package dk.navicon.binpack.logging;

public class LoggerFactory {
	public static <T> Logger getLogger(T type) {
		return new Logger(type);
	}
}
