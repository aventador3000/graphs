package graphs;

import org.eolang.*;
import org.eolang.core.*;
import java.util.function.Supplier;

/** Package-scope object 'adjacencyList'. */
public class EOadjacencyList extends EOObject {

  /** Field for storing the 'adjacencies' variable-length free attribute. */
  private final EOarray EOadjacencies;

  /**
   * Constructs (via one-time-full application) the package-scope object 'adjacencyList'.
   *
   * @param EOadjacencies the object to bind to the 'adjacencies' variable-length free attribute.
   */
  public EOadjacencyList(EOObject... EOadjacencies) {
    this.EOadjacencies = new EOarray(EOadjacencies);
  }

  /** Returns the object bound to the 'adjacencies' input attribute. */
  public EOarray EOadjacencies() {
    return this.EOadjacencies;
  }
}
