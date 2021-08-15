package graphs;

import org.eolang.*;
import org.eolang.core.*;
import java.util.function.Supplier;

/** Package-scope object 'main'. */
public class EOmain extends EOObject {

  /** Field for storing the 'args' variable-length free attribute. */
  private final EOarray EOargs;

  /**
   * Constructs (via one-time-full application) the package-scope object 'main'.
   *
   * @param EOargs the object to bind to the 'args' variable-length free attribute.
   */
  public EOmain(EOObject... EOargs) {
    this.EOargs = new EOarray(EOargs);
  }

  /** Field for caching the '@' attribute. */
  private EOObject _cachedDecoratee = null;
  /** Declares the decoratee of this object. */
  @Override
  protected EOObject _decoratee() {
    /** Anonymous objects used in the scope of this method */
    /** Anonymous object with an assigned pseudo-name 'anonymous$1'. */
    class anonymous$1 extends EOObject {

      /**
       * Constructs (via one-time-full application) the anonymous object with the pseudo-name
       * 'anonymous$1'.
       */
      public anonymous$1() {}

      /** Declares the parent object 'main' of this object. */
      @Override
      protected EOObject _parent() {
        return EOmain.this;
      }

      /** Abstraction-based bound attribute object 'reduce' */
      public EOObject EOreduce(EOObject EOaccum, EOObject EOcurrent) {
        return new EOreduce(EOaccum, EOcurrent);
      }

      /**
       * Attribute object 'reduce' of the anonymous object with an assigned pseudo-name
       * 'anonymous$1'.
       */
      class EOreduce extends EOObject {

        /** Field for storing the 'accum' free attribute. */
        private final EOObject EOaccum;
        /** Field for storing the 'current' free attribute. */
        private final EOObject EOcurrent;

        /**
         * Constructs (via one-time-full application) the attribute object 'reduce' of the anonymous
         * object with an assigned pseudo-name 'anonymous$1'.
         *
         * @param EOaccum the object to bind to the 'accum' free attribute.
         * @param EOcurrent the object to bind to the 'current' free attribute.
         */
        public EOreduce(EOObject EOaccum, EOObject EOcurrent) {
          this.EOaccum = EOaccum;
          this.EOcurrent = EOcurrent;
        }

        /** Declares the parent object 'anonymous$1' of this object. */
        @Override
        protected EOObject _parent() {
          return anonymous$1.this;
        }

        /** Field for caching the '@' attribute. */
        private EOObject _cachedDecoratee = null;
        /** Declares the decoratee of this object. */
        @Override
        protected EOObject _decoratee() {
          if (_cachedDecoratee == null) {
            _cachedDecoratee =
                new org.eolang.txt.EOsprintf(
                    new EOThunk(() -> (new EOstring("%s\n%d"))),
                    new EOThunk(() -> (this.EOaccum())),
                    new EOThunk(() -> (this.EOcurrent())));
          }
          return _cachedDecoratee;
        }

        /** Returns the object bound to the 'accum' input attribute. */
        public EOObject EOaccum() {
          return this.EOaccum;
        }

        /** Returns the object bound to the 'current' input attribute. */
        public EOObject EOcurrent() {
          return this.EOcurrent;
        }
      }
    }

    if (_cachedDecoratee == null) {
      _cachedDecoratee =
          (this.EOdijk())
              ._getAttribute(
                  "EOreduce",
                  new EOThunk(() -> (new EOstring("hello"))),
                  new EOThunk(() -> (new anonymous$1())));
    }
    return _cachedDecoratee;
  }

  /** Returns the object bound to the 'args' input attribute. */
  public EOarray EOargs() {
    return this.EOargs;
  }

  /** Field for caching the 'dijk' attribute. */
  private EOObject _cachedEOdijk = null;
  /** Application-based bound attribute object 'dijk' */
  public EOObject EOdijk() {
    if (_cachedEOdijk == null) {
      _cachedEOdijk =
          new graphs.EOdijkstra(
              new EOThunk(() -> (new graphs.EOtestGraph())), new EOThunk(() -> (new EOint(1L))));
    }
    return _cachedEOdijk;
  }
}
