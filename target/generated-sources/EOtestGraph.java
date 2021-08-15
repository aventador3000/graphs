package graphs;

import org.eolang.*;
import org.eolang.core.*;
import java.util.function.Supplier;

/** Package-scope object 'testGraph'. */
public class EOtestGraph extends EOObject {

  /** Constructs (via one-time-full application) the package-scope object 'testGraph'. */
  public EOtestGraph() {}

  /** Field for caching the '@' attribute. */
  private EOObject _cachedDecoratee = null;
  /** Declares the decoratee of this object. */
  @Override
  protected EOObject _decoratee() {
    if (_cachedDecoratee == null) {
      _cachedDecoratee =
          new graphs.EOadjacencyList(
              new EOThunk(
                  () ->
                      (new graphs.EOadjacency(
                          new EOThunk(
                              () ->
                                  (new graphs.EOvertex(
                                      new EOThunk(() -> (new EOint(0L))),
                                      new EOThunk(() -> (new EOstring("A")))))),
                          new EOThunk(
                              () ->
                                  (new graphs.EOedge(
                                      new EOThunk(() -> (new EOint(1L))),
                                      new EOThunk(() -> (new EOfloat(3.0D)))))),
                          new EOThunk(
                              () ->
                                  (new graphs.EOedge(
                                      new EOThunk(() -> (new EOint(5L))),
                                      new EOThunk(() -> (new EOfloat(1.0D))))))))),
              new EOThunk(
                  () ->
                      (new graphs.EOadjacency(
                          new EOThunk(
                              () ->
                                  (new graphs.EOvertex(
                                      new EOThunk(() -> (new EOint(1L))),
                                      new EOThunk(() -> (new EOstring("B")))))),
                          new EOThunk(
                              () ->
                                  (new graphs.EOedge(
                                      new EOThunk(() -> (new EOint(2L))),
                                      new EOThunk(() -> (new EOfloat(1.0D)))))),
                          new EOThunk(
                              () ->
                                  (new graphs.EOedge(
                                      new EOThunk(() -> (new EOint(3L))),
                                      new EOThunk(() -> (new EOfloat(7.0D))))))))),
              new EOThunk(
                  () ->
                      (new graphs.EOadjacency(
                          new EOThunk(
                              () ->
                                  (new graphs.EOvertex(
                                      new EOThunk(() -> (new EOint(2L))),
                                      new EOThunk(() -> (new EOstring("C")))))),
                          new EOThunk(
                              () ->
                                  (new graphs.EOedge(
                                      new EOThunk(() -> (new EOint(0L))),
                                      new EOThunk(() -> (new EOfloat(2.0D)))))),
                          new EOThunk(
                              () ->
                                  (new graphs.EOedge(
                                      new EOThunk(() -> (new EOint(4L))),
                                      new EOThunk(() -> (new EOfloat(1.0D)))))),
                          new EOThunk(
                              () ->
                                  (new graphs.EOedge(
                                      new EOThunk(() -> (new EOint(3L))),
                                      new EOThunk(() -> (new EOfloat(9.0D))))))))),
              new EOThunk(
                  () ->
                      (new graphs.EOadjacency(
                          new EOThunk(
                              () ->
                                  (new graphs.EOvertex(
                                      new EOThunk(() -> (new EOint(3L))),
                                      new EOThunk(() -> (new EOstring("D"))))))))),
              new EOThunk(
                  () ->
                      (new graphs.EOadjacency(
                          new EOThunk(
                              () ->
                                  (new graphs.EOvertex(
                                      new EOThunk(() -> (new EOint(4L))),
                                      new EOThunk(() -> (new EOstring("E")))))),
                          new EOThunk(
                              () ->
                                  (new graphs.EOedge(
                                      new EOThunk(() -> (new EOint(3L))),
                                      new EOThunk(() -> (new EOfloat(7.0D)))))),
                          new EOThunk(
                              () ->
                                  (new graphs.EOedge(
                                      new EOThunk(() -> (new EOint(5L))),
                                      new EOThunk(() -> (new EOfloat(6.0D))))))))),
              new EOThunk(
                  () ->
                      (new graphs.EOadjacency(
                          new EOThunk(
                              () ->
                                  (new graphs.EOvertex(
                                      new EOThunk(() -> (new EOint(5L))),
                                      new EOThunk(() -> (new EOstring("F")))))),
                          new EOThunk(
                              () ->
                                  (new graphs.EOedge(
                                      new EOThunk(() -> (new EOint(3L))),
                                      new EOThunk(() -> (new EOfloat(2.0D)))))),
                          new EOThunk(
                              () ->
                                  (new graphs.EOedge(
                                      new EOThunk(() -> (new EOint(0L))),
                                      new EOThunk(() -> (new EOfloat(1.0D))))))))));
    }
    return _cachedDecoratee;
  }
}
