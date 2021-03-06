package randoop.main;

/**
 * Indicates a user error in invoking Randoop. Randoop prints the message and also prints how to get
 * help.
 */
public class RandoopUsageError extends RuntimeException {

  private static final long serialVersionUID = 1L;

  /**
   * Creates a {@link RandoopUsageError} with the given message.
   *
   * @param message the exception message
   */
  public RandoopUsageError(String message) {
    super(message);
  }

  /**
   * Creates a {@link RandoopUsageError} with the given message and causing exception.
   *
   * @param message the exception message
   * @param cause the causing exception
   */
  RandoopUsageError(String message, Throwable cause) {
    super(message, cause);
  }
}
