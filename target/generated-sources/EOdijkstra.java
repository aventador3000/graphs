package graphs;

import org.eolang.*;
import org.eolang.core.*;
import java.util.function.Supplier;

/** Package-scope object 'dijkstra'. */
public class EOdijkstra extends EOObject {

  /** Field for storing the 'graphAdjList' free attribute. */
  private final EOObject EOgraphAdjList;
  /** Field for storing the 'iStartVertex' free attribute. */
  private final EOObject EOiStartVertex;

  /**
   * Constructs (via one-time-full application) the package-scope object 'dijkstra'.
   *
   * @param EOgraphAdjList the object to bind to the 'graphAdjList' free attribute.
   * @param EOiStartVertex the object to bind to the 'iStartVertex' free attribute.
   */
  public EOdijkstra(EOObject EOgraphAdjList, EOObject EOiStartVertex) {
    this.EOgraphAdjList = EOgraphAdjList;
    this.EOiStartVertex = EOiStartVertex;
  }

  /** Field for caching the '@' attribute. */
  private EOObject _cachedDecoratee = null;
  /** Declares the decoratee of this object. */
  @Override
  protected EOObject _decoratee() {
    if (_cachedDecoratee == null) {
      _cachedDecoratee =
          this.EOprocessVertex(
              new EOThunk(() -> (this.EOinitialQ())),
              new EOThunk(() -> (this.EOinitialS())),
              new EOThunk(() -> (this.EOinitialD())),
              new EOThunk(() -> (this.EOinitialP())));
    }
    return _cachedDecoratee;
  }

  /** Returns the object bound to the 'graphAdjList' input attribute. */
  public EOObject EOgraphAdjList() {
    return this.EOgraphAdjList;
  }

  /** Returns the object bound to the 'iStartVertex' input attribute. */
  public EOObject EOiStartVertex() {
    return this.EOiStartVertex;
  }

  /** Field for caching the 'initialQ' attribute. */
  private EOObject _cachedEOinitialQ = null;
  /** Abstraction-based bound attribute object 'initialQ' */
  public EOObject EOinitialQ() {
    if (_cachedEOinitialQ == null) {
      _cachedEOinitialQ = new EOinitialQ();
    }
    return _cachedEOinitialQ;
  }

  /** Field for caching the 'initialS' attribute. */
  private EOObject _cachedEOinitialS = null;
  /** Abstraction-based bound attribute object 'initialS' */
  public EOObject EOinitialS() {
    if (_cachedEOinitialS == null) {
      _cachedEOinitialS = new EOinitialS();
    }
    return _cachedEOinitialS;
  }

  /** Field for caching the 'initialD' attribute. */
  private EOObject _cachedEOinitialD = null;
  /** Abstraction-based bound attribute object 'initialD' */
  public EOObject EOinitialD() {
    if (_cachedEOinitialD == null) {
      _cachedEOinitialD = new EOinitialD();
    }
    return _cachedEOinitialD;
  }

  /** Field for caching the 'initialP' attribute. */
  private EOObject _cachedEOinitialP = null;
  /** Abstraction-based bound attribute object 'initialP' */
  public EOObject EOinitialP() {
    if (_cachedEOinitialP == null) {
      _cachedEOinitialP = new EOinitialP();
    }
    return _cachedEOinitialP;
  }

  /** Abstraction-based bound attribute object 'processVertex' */
  public EOObject EOprocessVertex(
      EOObject EOcurrentQ, EOObject EOcurrentS, EOObject EOcurrentD, EOObject EOcurrentP) {
    return new EOprocessVertex(EOcurrentQ, EOcurrentS, EOcurrentD, EOcurrentP);
  }

  /** Attribute object 'initialQ' of the package-scope object 'dijkstra'. */
  private class EOinitialQ extends EOObject {

    /**
     * Constructs (via one-time-full application) the attribute object 'initialQ' of the
     * package-scope object 'dijkstra'.
     */
    public EOinitialQ() {}

    /** Declares the parent object 'dijkstra' of this object. */
    @Override
    protected EOObject _parent() {
      return EOdijkstra.this;
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

        /** Declares the parent object 'initialQ' of this object. */
        @Override
        protected EOObject _parent() {
          return EOinitialQ.this;
        }

        /** Abstraction-based bound attribute object 'map' */
        public EOObject EOmap(EOObject EOcurrentAdjacency) {
          return new EOmap(EOcurrentAdjacency);
        }

        /**
         * Attribute object 'map' of the anonymous object with an assigned pseudo-name
         * 'anonymous$1'.
         */
        class EOmap extends EOObject {

          /** Field for storing the 'currentAdjacency' free attribute. */
          private final EOObject EOcurrentAdjacency;

          /**
           * Constructs (via one-time-full application) the attribute object 'map' of the anonymous
           * object with an assigned pseudo-name 'anonymous$1'.
           *
           * @param EOcurrentAdjacency the object to bind to the 'currentAdjacency' free attribute.
           */
          public EOmap(EOObject EOcurrentAdjacency) {
            this.EOcurrentAdjacency = EOcurrentAdjacency;
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
                  ((this.EOcurrentAdjacency())._getAttribute("EOvertex"))._getAttribute("EOi");
            }
            return _cachedDecoratee;
          }

          /** Returns the object bound to the 'currentAdjacency' input attribute. */
          public EOObject EOcurrentAdjacency() {
            return this.EOcurrentAdjacency;
          }
        }
      }

      if (_cachedDecoratee == null) {
        _cachedDecoratee =
            (((_getParentObject())._getAttribute("EOgraphAdjList"))._getAttribute("EOadjacencies"))
                ._getAttribute("EOmap", new EOThunk(() -> (new anonymous$1())));
      }
      return _cachedDecoratee;
    }
  }

  /** Attribute object 'initialS' of the package-scope object 'dijkstra'. */
  private class EOinitialS extends EOObject {

    /**
     * Constructs (via one-time-full application) the attribute object 'initialS' of the
     * package-scope object 'dijkstra'.
     */
    public EOinitialS() {}

    /** Declares the parent object 'dijkstra' of this object. */
    @Override
    protected EOObject _parent() {
      return EOdijkstra.this;
    }

    /** Field for caching the '@' attribute. */
    private EOObject _cachedDecoratee = null;
    /** Declares the decoratee of this object. */
    @Override
    protected EOObject _decoratee() {
      if (_cachedDecoratee == null) {
        _cachedDecoratee = new EOarray();
      }
      return _cachedDecoratee;
    }
  }

  /** Attribute object 'initialD' of the package-scope object 'dijkstra'. */
  private class EOinitialD extends EOObject {

    /**
     * Constructs (via one-time-full application) the attribute object 'initialD' of the
     * package-scope object 'dijkstra'.
     */
    public EOinitialD() {}

    /** Declares the parent object 'dijkstra' of this object. */
    @Override
    protected EOObject _parent() {
      return EOdijkstra.this;
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

        /** Declares the parent object 'initialD' of this object. */
        @Override
        protected EOObject _parent() {
          return EOinitialD.this;
        }

        /** Abstraction-based bound attribute object 'map' */
        public EOObject EOmap(EOObject EOcurrentAdjacency) {
          return new EOmap(EOcurrentAdjacency);
        }

        /**
         * Attribute object 'map' of the anonymous object with an assigned pseudo-name
         * 'anonymous$1'.
         */
        class EOmap extends EOObject {

          /** Field for storing the 'currentAdjacency' free attribute. */
          private final EOObject EOcurrentAdjacency;

          /**
           * Constructs (via one-time-full application) the attribute object 'map' of the anonymous
           * object with an assigned pseudo-name 'anonymous$1'.
           *
           * @param EOcurrentAdjacency the object to bind to the 'currentAdjacency' free attribute.
           */
          public EOmap(EOObject EOcurrentAdjacency) {
            this.EOcurrentAdjacency = EOcurrentAdjacency;
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
                  ((((this.EOcurrentAdjacency())._getAttribute("EOvertex"))._getAttribute("EOi"))
                          ._getAttribute(
                              "EOeq",
                              new EOThunk(
                                  () ->
                                      ((((_getParentObject())._getParentObject())
                                              ._getParentObject())
                                          ._getAttribute("EOiStartVertex")))))
                      ._getAttribute(
                          "EOif",
                          new EOThunk(() -> (new EOfloat(0.0D))),
                          new EOThunk(() -> (new org.eolang.util.ieee754.EOinfinity())));
            }
            return _cachedDecoratee;
          }

          /** Returns the object bound to the 'currentAdjacency' input attribute. */
          public EOObject EOcurrentAdjacency() {
            return this.EOcurrentAdjacency;
          }
        }
      }

      if (_cachedDecoratee == null) {
        _cachedDecoratee =
            (((_getParentObject())._getAttribute("EOgraphAdjList"))._getAttribute("EOadjacencies"))
                ._getAttribute("EOmap", new EOThunk(() -> (new anonymous$1())));
      }
      return _cachedDecoratee;
    }
  }

  /** Attribute object 'initialP' of the package-scope object 'dijkstra'. */
  private class EOinitialP extends EOObject {

    /**
     * Constructs (via one-time-full application) the attribute object 'initialP' of the
     * package-scope object 'dijkstra'.
     */
    public EOinitialP() {}

    /** Declares the parent object 'dijkstra' of this object. */
    @Override
    protected EOObject _parent() {
      return EOdijkstra.this;
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

        /** Declares the parent object 'initialP' of this object. */
        @Override
        protected EOObject _parent() {
          return EOinitialP.this;
        }

        /** Abstraction-based bound attribute object 'map' */
        public EOObject EOmap(EOObject EOcurrentAdjacency) {
          return new EOmap(EOcurrentAdjacency);
        }

        /**
         * Attribute object 'map' of the anonymous object with an assigned pseudo-name
         * 'anonymous$1'.
         */
        class EOmap extends EOObject {

          /** Field for storing the 'currentAdjacency' free attribute. */
          private final EOObject EOcurrentAdjacency;

          /**
           * Constructs (via one-time-full application) the attribute object 'map' of the anonymous
           * object with an assigned pseudo-name 'anonymous$1'.
           *
           * @param EOcurrentAdjacency the object to bind to the 'currentAdjacency' free attribute.
           */
          public EOmap(EOObject EOcurrentAdjacency) {
            this.EOcurrentAdjacency = EOcurrentAdjacency;
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
                  ((((this.EOcurrentAdjacency())._getAttribute("EOvertex"))._getAttribute("EOi"))
                          ._getAttribute(
                              "EOeq",
                              new EOThunk(
                                  () ->
                                      ((((_getParentObject())._getParentObject())
                                              ._getParentObject())
                                          ._getAttribute("EOiStartVertex")))))
                      ._getAttribute(
                          "EOif",
                          new EOThunk(
                              () ->
                                  ((((_getParentObject())._getParentObject())._getParentObject())
                                      ._getAttribute("EOiStartVertex"))),
                          new EOThunk(() -> (new EOint(-1L))));
            }
            return _cachedDecoratee;
          }

          /** Returns the object bound to the 'currentAdjacency' input attribute. */
          public EOObject EOcurrentAdjacency() {
            return this.EOcurrentAdjacency;
          }
        }
      }

      if (_cachedDecoratee == null) {
        _cachedDecoratee =
            (((_getParentObject())._getAttribute("EOgraphAdjList"))._getAttribute("EOadjacencies"))
                ._getAttribute("EOmap", new EOThunk(() -> (new anonymous$1())));
      }
      return _cachedDecoratee;
    }
  }

  /** Attribute object 'processVertex' of the package-scope object 'dijkstra'. */
  private class EOprocessVertex extends EOObject {

    /** Field for storing the 'currentQ' free attribute. */
    private final EOObject EOcurrentQ;
    /** Field for storing the 'currentS' free attribute. */
    private final EOObject EOcurrentS;
    /** Field for storing the 'currentD' free attribute. */
    private final EOObject EOcurrentD;
    /** Field for storing the 'currentP' free attribute. */
    private final EOObject EOcurrentP;

    /**
     * Constructs (via one-time-full application) the attribute object 'processVertex' of the
     * package-scope object 'dijkstra'.
     *
     * @param EOcurrentQ the object to bind to the 'currentQ' free attribute.
     * @param EOcurrentS the object to bind to the 'currentS' free attribute.
     * @param EOcurrentD the object to bind to the 'currentD' free attribute.
     * @param EOcurrentP the object to bind to the 'currentP' free attribute.
     */
    public EOprocessVertex(
        EOObject EOcurrentQ, EOObject EOcurrentS, EOObject EOcurrentD, EOObject EOcurrentP) {
      this.EOcurrentQ = EOcurrentQ;
      this.EOcurrentS = EOcurrentS;
      this.EOcurrentD = EOcurrentD;
      this.EOcurrentP = EOcurrentP;
    }

    /** Declares the parent object 'dijkstra' of this object. */
    @Override
    protected EOObject _parent() {
      return EOdijkstra.this;
    }

    /** Field for caching the '@' attribute. */
    private EOObject _cachedDecoratee = null;
    /** Declares the decoratee of this object. */
    @Override
    protected EOObject _decoratee() {
      if (_cachedDecoratee == null) {
        _cachedDecoratee =
            (((this.EOcurrentQ())._getAttribute("EOlength"))
                    ._getAttribute("EOeq", new EOThunk(() -> (new EOint(0L)))))
                ._getAttribute(
                    "EOif",
                    new EOThunk(() -> (this.EOcurrentP())),
                    new EOThunk(
                        () ->
                            (new EOprocessVertex(
                                new EOThunk(() -> ((this.EOnewQandMin())._getAttribute("EOnewQ"))),
                                new EOThunk(
                                    () ->
                                        ((this.EOcurrentS())
                                            ._getAttribute(
                                                "EOappend",
                                                new EOThunk(
                                                    () ->
                                                        ((this.EOnewQandMin())
                                                            ._getAttribute("EOmin")))))),
                                new EOThunk(() -> ((this.EOrelaxed())._getAttribute("EOrelaxedD"))),
                                new EOThunk(
                                    () -> ((this.EOrelaxed())._getAttribute("EOrelaxedP")))))));
      }
      return _cachedDecoratee;
    }

    /** Returns the object bound to the 'currentQ' input attribute. */
    public EOObject EOcurrentQ() {
      return this.EOcurrentQ;
    }

    /** Returns the object bound to the 'currentS' input attribute. */
    public EOObject EOcurrentS() {
      return this.EOcurrentS;
    }

    /** Returns the object bound to the 'currentD' input attribute. */
    public EOObject EOcurrentD() {
      return this.EOcurrentD;
    }

    /** Returns the object bound to the 'currentP' input attribute. */
    public EOObject EOcurrentP() {
      return this.EOcurrentP;
    }

    /** Field for caching the 'newQandMin' attribute. */
    private EOObject _cachedEOnewQandMin = null;
    /** Application-based bound attribute object 'newQandMin' */
    public EOObject EOnewQandMin() {
      if (_cachedEOnewQandMin == null) {
        _cachedEOnewQandMin =
            this.EOfindDeleteMinWeight(
                new EOThunk(() -> (this.EOcurrentQ())), new EOThunk(() -> (this.EOcurrentD())));
      }
      return _cachedEOnewQandMin;
    }

    /** Field for caching the 'relaxed' attribute. */
    private EOObject _cachedEOrelaxed = null;
    /** Application-based bound attribute object 'relaxed' */
    public EOObject EOrelaxed() {
      if (_cachedEOrelaxed == null) {
        _cachedEOrelaxed =
            this.EOrelax(
                new EOThunk(() -> ((this.EOnewQandMin())._getAttribute("EOmin"))),
                new EOThunk(() -> (this.EOcurrentD())),
                new EOThunk(() -> (this.EOcurrentP())),
                new EOThunk(() -> ((_getParentObject())._getAttribute("EOgraphAdjList"))));
      }
      return _cachedEOrelaxed;
    }

    /** Abstraction-based bound attribute object 'relax' */
    public EOObject EOrelax(
        EOObject EOcurrV, EOObject EOcurrentD, EOObject EOcurrentP, EOObject EOgraph) {
      return new EOrelax(EOcurrV, EOcurrentD, EOcurrentP, EOgraph);
    }

    /** Abstraction-based bound attribute object 'findDeleteMinWeight' */
    public EOObject EOfindDeleteMinWeight(EOObject EOoldQ, EOObject EOcurrentD) {
      return new EOfindDeleteMinWeight(EOoldQ, EOcurrentD);
    }

    /**
     * Attribute object 'relax' of the attribute object 'processVertex' of the package-scope object
     * 'dijkstra'.
     */
    private class EOrelax extends EOObject {

      /** Field for storing the 'currV' free attribute. */
      private final EOObject EOcurrV;
      /** Field for storing the 'currentD' free attribute. */
      private final EOObject EOcurrentD;
      /** Field for storing the 'currentP' free attribute. */
      private final EOObject EOcurrentP;
      /** Field for storing the 'graph' free attribute. */
      private final EOObject EOgraph;

      /**
       * Constructs (via one-time-full application) the attribute object 'relax' of the attribute
       * object 'processVertex' of the package-scope object 'dijkstra'.
       *
       * @param EOcurrV the object to bind to the 'currV' free attribute.
       * @param EOcurrentD the object to bind to the 'currentD' free attribute.
       * @param EOcurrentP the object to bind to the 'currentP' free attribute.
       * @param EOgraph the object to bind to the 'graph' free attribute.
       */
      public EOrelax(EOObject EOcurrV, EOObject EOcurrentD, EOObject EOcurrentP, EOObject EOgraph) {
        this.EOcurrV = EOcurrV;
        this.EOcurrentD = EOcurrentD;
        this.EOcurrentP = EOcurrentP;
        this.EOgraph = EOgraph;
      }

      /** Declares the parent object 'processVertex' of this object. */
      @Override
      protected EOObject _parent() {
        return EOprocessVertex.this;
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

          /** Declares the parent object 'relax' of this object. */
          @Override
          protected EOObject _parent() {
            return EOrelax.this;
          }

          /** Abstraction-based bound attribute object 'reduce' */
          public EOObject EOreduce(EOObject EOupdatedDP, EOObject EOcurrentEdge) {
            return new EOreduce(EOupdatedDP, EOcurrentEdge);
          }

          /**
           * Attribute object 'reduce' of the anonymous object with an assigned pseudo-name
           * 'anonymous$1'.
           */
          class EOreduce extends EOObject {

            /** Field for storing the 'updatedDP' free attribute. */
            private final EOObject EOupdatedDP;
            /** Field for storing the 'currentEdge' free attribute. */
            private final EOObject EOcurrentEdge;

            /**
             * Constructs (via one-time-full application) the attribute object 'reduce' of the
             * anonymous object with an assigned pseudo-name 'anonymous$1'.
             *
             * @param EOupdatedDP the object to bind to the 'updatedDP' free attribute.
             * @param EOcurrentEdge the object to bind to the 'currentEdge' free attribute.
             */
            public EOreduce(EOObject EOupdatedDP, EOObject EOcurrentEdge) {
              this.EOupdatedDP = EOupdatedDP;
              this.EOcurrentEdge = EOcurrentEdge;
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
                    ((((this.EOupdatedDP())._getAttribute("EOrelaxedD"))
                                ._getAttribute(
                                    "EOget",
                                    new EOThunk(
                                        () -> ((this.EOcurrentEdge())._getAttribute("EOivertex")))))
                            ._getAttribute(
                                "EOgreater",
                                new EOThunk(
                                    () ->
                                        ((((this.EOupdatedDP())._getAttribute("EOrelaxedD"))
                                                ._getAttribute(
                                                    "EOget",
                                                    new EOThunk(
                                                        () ->
                                                            (((_getParentObject())
                                                                    ._getParentObject())
                                                                ._getAttribute("EOcurrV")))))
                                            ._getAttribute(
                                                "EOadd",
                                                new EOThunk(
                                                    () ->
                                                        ((this.EOcurrentEdge())
                                                            ._getAttribute("EOweight"))))))))
                        ._getAttribute(
                            "EOif",
                            new EOThunk(
                                () ->
                                    (((_getParentObject())._getParentObject())
                                        ._getAttribute(
                                            "EOresultStructure",
                                            new EOThunk(
                                                () ->
                                                    (((this.EOupdatedDP())
                                                            ._getAttribute("EOrelaxedD"))
                                                        ._getAttribute(
                                                            "EOreplace",
                                                            new EOThunk(
                                                                () ->
                                                                    ((this.EOcurrentEdge())
                                                                        ._getAttribute(
                                                                            "EOivertex"))),
                                                            new EOThunk(
                                                                () ->
                                                                    ((((this.EOupdatedDP())
                                                                                ._getAttribute(
                                                                                    "EOrelaxedD"))
                                                                            ._getAttribute(
                                                                                "EOget",
                                                                                new EOThunk(
                                                                                    () ->
                                                                                        (((_getParentObject())
                                                                                                ._getParentObject())
                                                                                            ._getAttribute(
                                                                                                "EOcurrV")))))
                                                                        ._getAttribute(
                                                                            "EOadd",
                                                                            new EOThunk(
                                                                                () ->
                                                                                    ((this
                                                                                            .EOcurrentEdge())
                                                                                        ._getAttribute(
                                                                                            "EOweight"))))))))),
                                            new EOThunk(
                                                () ->
                                                    (((this.EOupdatedDP())
                                                            ._getAttribute("EOrelaxedP"))
                                                        ._getAttribute(
                                                            "EOreplace",
                                                            new EOThunk(
                                                                () ->
                                                                    ((this.EOcurrentEdge())
                                                                        ._getAttribute(
                                                                            "EOivertex"))),
                                                            new EOThunk(
                                                                () ->
                                                                    (((_getParentObject())
                                                                            ._getParentObject())
                                                                        ._getAttribute(
                                                                            "EOcurrV"))))))))),
                            new EOThunk(() -> (this.EOupdatedDP())));
              }
              return _cachedDecoratee;
            }

            /** Returns the object bound to the 'updatedDP' input attribute. */
            public EOObject EOupdatedDP() {
              return this.EOupdatedDP;
            }

            /** Returns the object bound to the 'currentEdge' input attribute. */
            public EOObject EOcurrentEdge() {
              return this.EOcurrentEdge;
            }
          }
        }

        if (_cachedDecoratee == null) {
          _cachedDecoratee =
              ((((this.EOgraph())._getAttribute("EOadjacencies"))
                          ._getAttribute("EOget", new EOThunk(() -> (this.EOcurrV()))))
                      ._getAttribute("EOedges"))
                  ._getAttribute(
                      "EOreduce",
                      new EOThunk(
                          () ->
                              (this.EOresultStructure(
                                  new EOThunk(() -> (this.EOcurrentD())),
                                  new EOThunk(() -> (this.EOcurrentP()))))),
                      new EOThunk(() -> (new anonymous$1())));
        }
        return _cachedDecoratee;
      }

      /** Returns the object bound to the 'currV' input attribute. */
      public EOObject EOcurrV() {
        return this.EOcurrV;
      }

      /** Returns the object bound to the 'currentD' input attribute. */
      public EOObject EOcurrentD() {
        return this.EOcurrentD;
      }

      /** Returns the object bound to the 'currentP' input attribute. */
      public EOObject EOcurrentP() {
        return this.EOcurrentP;
      }

      /** Returns the object bound to the 'graph' input attribute. */
      public EOObject EOgraph() {
        return this.EOgraph;
      }

      /** Abstraction-based bound attribute object 'resultStructure' */
      public EOObject EOresultStructure(EOObject EOrelaxedD, EOObject EOrelaxedP) {
        return new EOresultStructure(EOrelaxedD, EOrelaxedP);
      }

      /**
       * Attribute object 'resultStructure' of the attribute object 'relax' of the attribute object
       * 'processVertex' of the package-scope object 'dijkstra'.
       */
      private class EOresultStructure extends EOObject {

        /** Field for storing the 'relaxedD' free attribute. */
        private final EOObject EOrelaxedD;
        /** Field for storing the 'relaxedP' free attribute. */
        private final EOObject EOrelaxedP;

        /**
         * Constructs (via one-time-full application) the attribute object 'resultStructure' of the
         * attribute object 'relax' of the attribute object 'processVertex' of the package-scope
         * object 'dijkstra'.
         *
         * @param EOrelaxedD the object to bind to the 'relaxedD' free attribute.
         * @param EOrelaxedP the object to bind to the 'relaxedP' free attribute.
         */
        public EOresultStructure(EOObject EOrelaxedD, EOObject EOrelaxedP) {
          this.EOrelaxedD = EOrelaxedD;
          this.EOrelaxedP = EOrelaxedP;
        }

        /** Declares the parent object 'relax' of this object. */
        @Override
        protected EOObject _parent() {
          return EOrelax.this;
        }

        /** Returns the object bound to the 'relaxedD' input attribute. */
        public EOObject EOrelaxedD() {
          return this.EOrelaxedD;
        }

        /** Returns the object bound to the 'relaxedP' input attribute. */
        public EOObject EOrelaxedP() {
          return this.EOrelaxedP;
        }
      }
    }

    /**
     * Attribute object 'findDeleteMinWeight' of the attribute object 'processVertex' of the
     * package-scope object 'dijkstra'.
     */
    private class EOfindDeleteMinWeight extends EOObject {

      /** Field for storing the 'oldQ' free attribute. */
      private final EOObject EOoldQ;
      /** Field for storing the 'currentD' free attribute. */
      private final EOObject EOcurrentD;

      /**
       * Constructs (via one-time-full application) the attribute object 'findDeleteMinWeight' of
       * the attribute object 'processVertex' of the package-scope object 'dijkstra'.
       *
       * @param EOoldQ the object to bind to the 'oldQ' free attribute.
       * @param EOcurrentD the object to bind to the 'currentD' free attribute.
       */
      public EOfindDeleteMinWeight(EOObject EOoldQ, EOObject EOcurrentD) {
        this.EOoldQ = EOoldQ;
        this.EOcurrentD = EOcurrentD;
      }

      /** Declares the parent object 'processVertex' of this object. */
      @Override
      protected EOObject _parent() {
        return EOprocessVertex.this;
      }

      /** Field for caching the '@' attribute. */
      private EOObject _cachedDecoratee = null;
      /** Declares the decoratee of this object. */
      @Override
      protected EOObject _decoratee() {
        if (_cachedDecoratee == null) {
          _cachedDecoratee =
              this.EOresultStructure(
                  new EOThunk(
                      () ->
                          ((this.EOoldQ())
                              ._getAttribute("EOremove", new EOThunk(() -> (this.EOminIndex()))))),
                  new EOThunk(
                      () ->
                          ((this.EOoldQ())
                              ._getAttribute("EOget", new EOThunk(() -> (this.EOminIndex()))))));
        }
        return _cachedDecoratee;
      }

      /** Returns the object bound to the 'oldQ' input attribute. */
      public EOObject EOoldQ() {
        return this.EOoldQ;
      }

      /** Returns the object bound to the 'currentD' input attribute. */
      public EOObject EOcurrentD() {
        return this.EOcurrentD;
      }

      /** Abstraction-based bound attribute object 'resultStructure' */
      public EOObject EOresultStructure(EOObject EOnewQ, EOObject EOmin) {
        return new EOresultStructure(EOnewQ, EOmin);
      }

      /** Field for caching the 'minVertex' attribute. */
      private EOObject _cachedEOminVertex = null;
      /** Application-based bound attribute object 'minVertex' */
      public EOObject EOminVertex() {
        /** Anonymous objects used in the scope of this method */
        /** Anonymous object with an assigned pseudo-name 'anonymous$1'. */
        class anonymous$1 extends EOObject {

          /**
           * Constructs (via one-time-full application) the anonymous object with the pseudo-name
           * 'anonymous$1'.
           */
          public anonymous$1() {}

          /** Declares the parent object 'findDeleteMinWeight' of this object. */
          @Override
          protected EOObject _parent() {
            return EOfindDeleteMinWeight.this;
          }

          /** Abstraction-based bound attribute object 'comparator' */
          public EOObject EOcomparator(
              EOObject EOelemA, EOObject EOindexA, EOObject EOelemB, EOObject EOindexB) {
            return new EOcomparator(EOelemA, EOindexA, EOelemB, EOindexB);
          }

          /**
           * Attribute object 'comparator' of the anonymous object with an assigned pseudo-name
           * 'anonymous$1'.
           */
          class EOcomparator extends EOObject {

            /** Field for storing the 'elemA' free attribute. */
            private final EOObject EOelemA;
            /** Field for storing the 'indexA' free attribute. */
            private final EOObject EOindexA;
            /** Field for storing the 'elemB' free attribute. */
            private final EOObject EOelemB;
            /** Field for storing the 'indexB' free attribute. */
            private final EOObject EOindexB;

            /**
             * Constructs (via one-time-full application) the attribute object 'comparator' of the
             * anonymous object with an assigned pseudo-name 'anonymous$1'.
             *
             * @param EOelemA the object to bind to the 'elemA' free attribute.
             * @param EOindexA the object to bind to the 'indexA' free attribute.
             * @param EOelemB the object to bind to the 'elemB' free attribute.
             * @param EOindexB the object to bind to the 'indexB' free attribute.
             */
            public EOcomparator(
                EOObject EOelemA, EOObject EOindexA, EOObject EOelemB, EOObject EOindexB) {
              this.EOelemA = EOelemA;
              this.EOindexA = EOindexA;
              this.EOelemB = EOelemB;
              this.EOindexB = EOindexB;
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
                    ((this.EOdA())._getAttribute("EOless", new EOThunk(() -> (this.EOdB()))))
                        ._getAttribute(
                            "EOif",
                            new EOThunk(() -> (new EOint(-1L))),
                            new EOThunk(
                                () ->
                                    (((this.EOdA())
                                            ._getAttribute(
                                                "EOgreater", new EOThunk(() -> (this.EOdB()))))
                                        ._getAttribute(
                                            "EOif",
                                            new EOThunk(() -> (new EOint(1L))),
                                            new EOThunk(() -> (new EOint(0L)))))));
              }
              return _cachedDecoratee;
            }

            /** Returns the object bound to the 'elemA' input attribute. */
            public EOObject EOelemA() {
              return this.EOelemA;
            }

            /** Returns the object bound to the 'indexA' input attribute. */
            public EOObject EOindexA() {
              return this.EOindexA;
            }

            /** Returns the object bound to the 'elemB' input attribute. */
            public EOObject EOelemB() {
              return this.EOelemB;
            }

            /** Returns the object bound to the 'indexB' input attribute. */
            public EOObject EOindexB() {
              return this.EOindexB;
            }

            /** Field for caching the 'dA' attribute. */
            private EOObject _cachedEOdA = null;
            /** Application-based bound attribute object 'dA' */
            public EOObject EOdA() {
              if (_cachedEOdA == null) {
                _cachedEOdA =
                    (((_getParentObject())._getParentObject())._getAttribute("EOcurrentD"))
                        ._getAttribute("EOget", new EOThunk(() -> (this.EOelemA())));
              }
              return _cachedEOdA;
            }

            /** Field for caching the 'dB' attribute. */
            private EOObject _cachedEOdB = null;
            /** Application-based bound attribute object 'dB' */
            public EOObject EOdB() {
              if (_cachedEOdB == null) {
                _cachedEOdB =
                    (((_getParentObject())._getParentObject())._getAttribute("EOcurrentD"))
                        ._getAttribute("EOget", new EOThunk(() -> (this.EOelemB())));
              }
              return _cachedEOdB;
            }
          }
        }

        if (_cachedEOminVertex == null) {
          _cachedEOminVertex =
              (this.EOoldQ())._getAttribute("EOmin", new EOThunk(() -> (new anonymous$1())));
        }
        return _cachedEOminVertex;
      }

      /** Field for caching the 'minIndex' attribute. */
      private EOObject _cachedEOminIndex = null;
      /** Application-based bound attribute object 'minIndex' */
      public EOObject EOminIndex() {
        if (_cachedEOminIndex == null) {
          _cachedEOminIndex =
              ((this.EOminVertex())._getAttribute("EOeq", new EOThunk(() -> (new EOint(-1L)))))
                  ._getAttribute(
                      "EOif",
                      new EOThunk(
                          () ->
                              ((((this.EOoldQ())._getAttribute("EOlength"))
                                      ._getAttribute("EOeq", new EOThunk(() -> (new EOint(0L)))))
                                  ._getAttribute(
                                      "EOif",
                                      new EOThunk(() -> (new EOint(-1L))),
                                      new EOThunk(() -> (new EOint(0L)))))),
                      new EOThunk(() -> (this.EOminVertex())));
        }
        return _cachedEOminIndex;
      }

      /**
       * Attribute object 'resultStructure' of the attribute object 'findDeleteMinWeight' of the
       * attribute object 'processVertex' of the package-scope object 'dijkstra'.
       */
      private class EOresultStructure extends EOObject {

        /** Field for storing the 'newQ' free attribute. */
        private final EOObject EOnewQ;
        /** Field for storing the 'min' free attribute. */
        private final EOObject EOmin;

        /**
         * Constructs (via one-time-full application) the attribute object 'resultStructure' of the
         * attribute object 'findDeleteMinWeight' of the attribute object 'processVertex' of the
         * package-scope object 'dijkstra'.
         *
         * @param EOnewQ the object to bind to the 'newQ' free attribute.
         * @param EOmin the object to bind to the 'min' free attribute.
         */
        public EOresultStructure(EOObject EOnewQ, EOObject EOmin) {
          this.EOnewQ = EOnewQ;
          this.EOmin = EOmin;
        }

        /** Declares the parent object 'findDeleteMinWeight' of this object. */
        @Override
        protected EOObject _parent() {
          return EOfindDeleteMinWeight.this;
        }

        /** Returns the object bound to the 'newQ' input attribute. */
        public EOObject EOnewQ() {
          return this.EOnewQ;
        }

        /** Returns the object bound to the 'min' input attribute. */
        public EOObject EOmin() {
          return this.EOmin;
        }
      }
    }
  }
}
