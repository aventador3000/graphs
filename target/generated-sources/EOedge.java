package graphs;

import org.eolang.*;
import org.eolang.core.*;
import java.util.function.Supplier;

/** Package-scope object 'edge'. */
public class EOedge extends EOObject {

  /** Field for storing the 'ivertex' free attribute. */
  private final EOObject EOivertex;
  /** Field for storing the 'weight' free attribute. */
  private final EOObject EOweight;

  /**
   * Constructs (via one-time-full application) the package-scope object 'edge'.
   *
   * @param EOivertex the object to bind to the 'ivertex' free attribute.
   * @param EOweight the object to bind to the 'weight' free attribute.
   */
  public EOedge(EOObject EOivertex, EOObject EOweight) {
    this.EOivertex = EOivertex;
    this.EOweight = EOweight;
  }

  /** Returns the object bound to the 'ivertex' input attribute. */
  public EOObject EOivertex() {
    return this.EOivertex;
  }

  /** Returns the object bound to the 'weight' input attribute. */
  public EOObject EOweight() {
    return this.EOweight;
  }
}
