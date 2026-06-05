package bsh;

import p000.AbstractC3594Ujhhgtgfeyxiexzf;
import p000.C1853Ujhhgtgfeyxiexzf;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C1985Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;
import p000.InterfaceC1407feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHBinaryExpression extends SimpleNode implements InterfaceC1407feyxiexzfUjhhgtg {
    private static final long serialVersionUID = 1;
    public int kind;

    public BSHBinaryExpression(int i) {
        super(i);
    }

    private Object checkNullValues(Object obj, Object obj2, int i, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) throws C3354Ujhhgtgfeyxiexzf, C1985Ujhhgtgfeyxiexzf {
        Class<?> cls;
        int i2;
        Primitive primitive = Primitive.NULL;
        if (primitive == obj && Primitive.VOID != obj2) {
            try {
                boolean z = obj2 instanceof String;
                if (primitive == obj2) {
                    C1853Ujhhgtgfeyxiexzf variableAtNode = getVariableAtNode(i ^ 1, c2637feyxiexzfUjhhgtg);
                    if (variableAtNode != null) {
                        cls = variableAtNode.f6221Ujhhgtgfeyxiexzf;
                        z = cls == String.class;
                    } else {
                        cls = null;
                    }
                } else {
                    cls = Primitive.unwrap(obj2).getClass();
                }
                C1853Ujhhgtgfeyxiexzf variableAtNode2 = getVariableAtNode(i, c2637feyxiexzfUjhhgtg);
                if (variableAtNode2 != null && (((i2 = this.kind) != 92 && i2 != 97) || !isComparableTypes(variableAtNode2.f6221Ujhhgtgfeyxiexzf, cls, c2637feyxiexzfUjhhgtg))) {
                    if (this.kind == 104 && (z || variableAtNode2.f6221Ujhhgtgfeyxiexzf == String.class)) {
                        return "null";
                    }
                    boolean zIsWrapper = isWrapper(variableAtNode2.f6221Ujhhgtgfeyxiexzf);
                    String[] strArr = InterfaceC1407feyxiexzfUjhhgtg.f4926Ujhhgtgfeyxiexzf;
                    if (zIsWrapper) {
                        throw new NullPointerException("null value with binary operator " + strArr[this.kind]);
                    }
                    throw new C3354Ujhhgtgfeyxiexzf("bad operand types for binary operator " + strArr[this.kind], this, c2637feyxiexzfUjhhgtg);
                }
            } catch (NullPointerException e) {
                throw new C1985Ujhhgtgfeyxiexzf(e, this, c2637feyxiexzfUjhhgtg);
            } catch (C1863Ujhhgtgfeyxiexzf e2) {
                e2.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
                return obj;
            }
        }
        return obj;
    }

    private C1853Ujhhgtgfeyxiexzf getVariableAtNode(int i, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) {
        if (jjtGetChild(i).jjtGetNumChildren() <= 0) {
            return null;
        }
        Node nodeJjtGetChild = jjtGetChild(i).jjtGetChild(0);
        if (nodeJjtGetChild instanceof BSHAmbiguousName) {
            return c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf().m376Ujhhgtgfeyxiexzf(((BSHAmbiguousName) nodeJjtGetChild).text, true);
        }
        return null;
    }

    private boolean isComparableTypes(Class<?> cls, Class<?> cls2, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) throws C3354Ujhhgtgfeyxiexzf {
        if (cls2 == cls || isSimilarTypes(cls, cls2)) {
            return true;
        }
        throw new C3354Ujhhgtgfeyxiexzf("incomparable types: " + AbstractC3594Ujhhgtgfeyxiexzf.m5196feyxiexzfUjhhgtg(cls) + " and " + AbstractC3594Ujhhgtgfeyxiexzf.m5196feyxiexzfUjhhgtg(cls2), this, c2637feyxiexzfUjhhgtg);
    }

    private boolean isPrimitiveValue(Object obj) {
        return (!(obj instanceof Primitive) || obj == Primitive.NULL || obj == Primitive.VOID) ? false : true;
    }

    private boolean isSimilarTypes(Class<?> cls, Class<?> cls2) {
        return cls2 == null || cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    private boolean isWrapper(Object obj) {
        return (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
    
        if ((bsh.Primitive.castWrapper(r5, r2) instanceof java.lang.Boolean) != false) goto L78;
     */
    @Override // bsh.SimpleNode, bsh.Node
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        int i;
        Object objEval;
        int i2;
        Object objCheckNullValues;
        Object objCheckNullValues2;
        int i3;
        Object objEval2 = jjtGetChild(0).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        int i4 = this.kind;
        if (i4 == 36) {
            if (objEval2 == Primitive.NULL) {
                return Primitive.FALSE;
            }
            Class<?> type = ((BSHType) jjtGetChild(1)).getType(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            if (objEval2 instanceof Primitive) {
                if (type == Primitive.class) {
                    return Primitive.TRUE;
                }
                objEval2 = Primitive.unwrap(objEval2);
            }
            return AbstractC0034Ujhhgtgfeyxiexzf.m571Ujhhgtgfeyxiexzf(type, objEval2.getClass()) ? Primitive.TRUE : Primitive.FALSE;
        }
        Class cls = Boolean.TYPE;
        if (i4 == 100 || i4 == 101) {
            runnableC0026Ujhhgtgfeyxiexzf.getClass();
            if (!Primitive.FALSE.equals(Primitive.castWrapper(cls, objEval2))) {
                i = this.kind;
                if (i == 98 && i != 99 && i != 148) {
                    if (this.kind == 147) {
                    }
                    objEval = jjtGetChild(1).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                    i2 = this.kind;
                    if (i2 != 147) {
                        runnableC0026Ujhhgtgfeyxiexzf.getClass();
                        switch (i2) {
                            case 98:
                            case 99:
                            case 100:
                            case 101:
                            default:
                                objCheckNullValues = checkNullValues(objEval2, objEval, 0, c2637feyxiexzfUjhhgtg);
                                objCheckNullValues2 = checkNullValues(objEval, objCheckNullValues, 1, c2637feyxiexzfUjhhgtg);
                                i3 = this.kind;
                                if (i3 == 92) {
                                    break;
                                } else {
                                    break;
                                }
                                return AbstractC0031Ujhhgtgfeyxiexzf.m388Ujhhgtgfeyxiexzf(objCheckNullValues, this.kind, objCheckNullValues2);
                        }
                    }
                    return objEval;
                }
                runnableC0026Ujhhgtgfeyxiexzf.getClass();
                if (!Primitive.TRUE.equals(Primitive.castWrapper(cls, objEval2))) {
                    if (this.kind == 147 || Primitive.NULL == objEval2) {
                        objEval = jjtGetChild(1).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                        i2 = this.kind;
                        if (i2 != 147 && i2 != 148) {
                            runnableC0026Ujhhgtgfeyxiexzf.getClass();
                            switch (i2) {
                                case 98:
                                case 99:
                                case 100:
                                case 101:
                                default:
                                    objCheckNullValues = checkNullValues(objEval2, objEval, 0, c2637feyxiexzfUjhhgtg);
                                    objCheckNullValues2 = checkNullValues(objEval, objCheckNullValues, 1, c2637feyxiexzfUjhhgtg);
                                    i3 = this.kind;
                                    if (((i3 == 92 || i3 == 97) && isWrapper(objCheckNullValues) && isWrapper(objCheckNullValues2)) || !((isWrapper(objCheckNullValues) || isPrimitiveValue(objCheckNullValues)) && (isWrapper(objCheckNullValues2) || isPrimitiveValue(objCheckNullValues2)))) {
                                        try {
                                            return AbstractC0031Ujhhgtgfeyxiexzf.m388Ujhhgtgfeyxiexzf(objCheckNullValues, this.kind, objCheckNullValues2);
                                        } catch (C1863Ujhhgtgfeyxiexzf e) {
                                            throw e.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
                                        }
                                    }
                                    try {
                                        return AbstractC0031Ujhhgtgfeyxiexzf.m391Ujhhgtgfeyxiexzf(objCheckNullValues, this.kind, objCheckNullValues2);
                                    } catch (C1863Ujhhgtgfeyxiexzf e2) {
                                        throw e2.mo2570Ujhhgtgfeyxiexzf("Failed operation: " + objCheckNullValues + " " + InterfaceC1407feyxiexzfUjhhgtg.f4926Ujhhgtgfeyxiexzf[this.kind] + " " + objCheckNullValues2, this, c2637feyxiexzfUjhhgtg);
                                    }
                            }
                        }
                        return objEval;
                    }
                }
            }
        } else {
            i = this.kind;
            if (i == 98) {
                runnableC0026Ujhhgtgfeyxiexzf.getClass();
                if (!Primitive.TRUE.equals(Primitive.castWrapper(cls, objEval2))) {
                    if (this.kind == 147) {
                    }
                    objEval = jjtGetChild(1).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                    i2 = this.kind;
                    if (i2 != 147) {
                        runnableC0026Ujhhgtgfeyxiexzf.getClass();
                        switch (i2) {
                            case 98:
                            case 99:
                            case 100:
                            case 101:
                            default:
                                objCheckNullValues = checkNullValues(objEval2, objEval, 0, c2637feyxiexzfUjhhgtg);
                                objCheckNullValues2 = checkNullValues(objEval, objCheckNullValues, 1, c2637feyxiexzfUjhhgtg);
                                i3 = this.kind;
                                if (i3 == 92) {
                                    break;
                                } else {
                                    break;
                                }
                                return AbstractC0031Ujhhgtgfeyxiexzf.m388Ujhhgtgfeyxiexzf(objCheckNullValues, this.kind, objCheckNullValues2);
                        }
                    }
                    return objEval;
                }
            } else {
                runnableC0026Ujhhgtgfeyxiexzf.getClass();
                if (!Primitive.TRUE.equals(Primitive.castWrapper(cls, objEval2))) {
                    if (this.kind == 147) {
                    }
                    objEval = jjtGetChild(1).eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                    i2 = this.kind;
                    if (i2 != 147) {
                        runnableC0026Ujhhgtgfeyxiexzf.getClass();
                        switch (i2) {
                            case 98:
                            case 99:
                            case 100:
                            case 101:
                            default:
                                objCheckNullValues = checkNullValues(objEval2, objEval, 0, c2637feyxiexzfUjhhgtg);
                                objCheckNullValues2 = checkNullValues(objEval, objCheckNullValues, 1, c2637feyxiexzfUjhhgtg);
                                i3 = this.kind;
                                if (i3 == 92) {
                                    break;
                                } else {
                                    break;
                                }
                                return AbstractC0031Ujhhgtgfeyxiexzf.m388Ujhhgtgfeyxiexzf(objCheckNullValues, this.kind, objCheckNullValues2);
                        }
                    }
                    return objEval;
                }
            }
        }
        return objEval2;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + InterfaceC1407feyxiexzfUjhhgtg.f4926Ujhhgtgfeyxiexzf[this.kind];
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private boolean isWrapper(java.lang.Class<?> r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            boolean r1 = r1.isAssignableFrom(r4)
            r2 = 1
            if (r1 != 0) goto L2d
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L16
            goto L2d
        L16:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r4 = r1.isAssignableFrom(r4)
            if (r4 == 0) goto L2c
            int r4 = r3.kind
            r1 = 92
            if (r4 == r1) goto L2b
            switch(r4) {
                case 97: goto L2b;
                case 98: goto L2b;
                case 99: goto L2b;
                case 100: goto L2b;
                case 101: goto L2b;
                default: goto L27;
            }
        L27:
            switch(r4) {
                case 108: goto L2b;
                case 109: goto L2b;
                case 110: goto L2b;
                case 111: goto L2b;
                case 112: goto L2b;
                case 113: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L2c
        L2b:
            return r2
        L2c:
            return r0
        L2d:
            int r4 = r3.kind
            switch(r4) {
                case 98: goto L33;
                case 99: goto L33;
                case 100: goto L33;
                case 101: goto L33;
                default: goto L32;
            }
        L32:
            return r2
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.BSHBinaryExpression.isWrapper(java.lang.Class):boolean");
    }
}
