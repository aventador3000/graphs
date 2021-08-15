package graphs;

import org.eolang.*;
import org.eolang.core.*;
import java.util.function.Supplier;

/** Package-scope object 'vertex'. */
public class EOvertex extends EOObject {

  /** Field for storing the 'i' free attribute. */
  private final EOObject EOi;
  /** Field for storing the 'name' free attribute. */
  private final EOObject EOname;

  /**
   * Constructs (via one-time-full application) the package-scope object 'vertex'.
   *
   * @param EOi the object to bind to the 'i' free attribute.
   * @param EOname the object to bind to the 'name' free attribute.
   */
  public EOvertex(EOObject EOi, EOObject EOname) {
    this.EOi = EOi;
    this.EOname = EOname;
  }

  /** Returns the object bound to the 'i' input attribute. */
  public EOObject EOi() {
    return this.EOi;
  }

  /** Returns the object bound to the 'name' input attribute. */
  public EOObject EOname() {
    return this.EOname;
  }
}
