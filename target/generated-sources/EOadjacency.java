package graphs;

import org.eolang.*;
import org.eolang.core.*;
import java.util.function.Supplier;

/** Package-scope object 'adjacency'. */
public class EOadjacency extends EOObject {

  /** Field for storing the 'vertex' free attribute. */
  private final EOObject EOvertex;
  /** Field for storing the 'edges' variable-length free attribute. */
  private final EOarray EOedges;

  /**
   * Constructs (via one-time-full application) the package-scope object 'adjacency'.
   *
   * @param EOvertex the object to bind to the 'vertex' free attribute.
   * @param EOedges the object to bind to the 'edges' variable-length free attribute.
   */
  public EOadjacency(EOObject EOvertex, EOObject... EOedges) {
    this.EOvertex = EOvertex;
    this.EOedges = new EOarray(EOedges);
  }

  /** Returns the object bound to the 'vertex' input attribute. */
  public EOObject EOvertex() {
    return this.EOvertex;
  }

  /** Returns the object bound to the 'edges' input attribute. */
  public EOarray EOedges() {
    return this.EOedges;
  }
}
