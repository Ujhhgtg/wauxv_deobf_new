package p000;

import bsh.AbstractC0008;
import bsh.AbstractC0010;
import bsh.Primitive;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᲈᲁᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0332 extends AbstractC2707 implements InterfaceC2335 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f1589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static boolean m1443(Object obj) {
        return (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character);
    }

    @Override // p000.AbstractC2707
    public final String toString() {
        return super.toString() + ": " + InterfaceC2335.f7500[this.f1589];
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if ((bsh.Primitive.castWrapper(r5, r2) instanceof java.lang.Boolean) != false) goto L80;
     */
    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        int i;
        Object objMo306;
        int i2;
        Object objM1444;
        Object objM1445;
        int i3;
        Object objMo307 = this.f8721[0].mo306(c0550, runnableC1668);
        int i4 = this.f1589;
        if (i4 == 36 || i4 == 37) {
            if (objMo307 == Primitive.NULL) {
                return Primitive.FALSE;
            }
            Class clsM1467 = ((C0356) this.f8721[1]).m1467(c0550, runnableC1668);
            if (objMo307 instanceof Primitive) {
                if (clsM1467 == Primitive.class) {
                    return Primitive.TRUE;
                }
                objMo307 = Primitive.unwrap(objMo307);
            }
            return AbstractC0010.m428(clsM1467, objMo307.getClass()) ? Primitive.TRUE : Primitive.FALSE;
        }
        if (i4 == 38) {
            try {
                return AbstractC0010.m414(0, ((C0356) this.f8721[1]).m1467(c0550, runnableC1668), objMo307);
            } catch (C3523 e) {
                throw e.mo4643(this, c0550);
            }
        }
        Class cls = Boolean.TYPE;
        if (i4 == 102 || i4 == 103) {
            runnableC1668.getClass();
            if (!Primitive.FALSE.equals(Primitive.castWrapper(cls, objMo307))) {
                i = this.f1589;
                if (i == 100 && i != 101 && i != 150) {
                    if (this.f1589 == 149) {
                    }
                    objMo306 = this.f8721[1].mo306(c0550, runnableC1668);
                    i2 = this.f1589;
                    if (i2 != 149) {
                        runnableC1668.getClass();
                        switch (i2) {
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            default:
                                objM1444 = m1444(objMo307, objMo306, 0, c0550);
                                objM1445 = m1444(objMo306, objM1444, 1, c0550);
                                i3 = this.f1589;
                                if (i3 == 94) {
                                    break;
                                } else {
                                    break;
                                }
                                return AbstractC0008.m370(objM1444, this.f1589, objM1445);
                        }
                    }
                    return objMo306;
                }
                runnableC1668.getClass();
                if (!Primitive.TRUE.equals(Primitive.castWrapper(cls, objMo307))) {
                    if (this.f1589 == 149 || Primitive.NULL == objMo307) {
                        objMo306 = this.f8721[1].mo306(c0550, runnableC1668);
                        i2 = this.f1589;
                        if (i2 != 149 && i2 != 150) {
                            runnableC1668.getClass();
                            switch (i2) {
                                case 100:
                                case 101:
                                case 102:
                                case 103:
                                default:
                                    objM1444 = m1444(objMo307, objMo306, 0, c0550);
                                    objM1445 = m1444(objMo306, objM1444, 1, c0550);
                                    i3 = this.f1589;
                                    if (((i3 == 94 || i3 == 99) && m1443(objM1444) && m1443(objM1445)) || ((!m1443(objM1444) && (!(objM1444 instanceof Primitive) || objM1444 == Primitive.NULL || objM1444 == Primitive.VOID)) || (!m1443(objM1445) && (!(objM1445 instanceof Primitive) || objM1445 == Primitive.NULL || objM1445 == Primitive.VOID)))) {
                                        try {
                                            return AbstractC0008.m370(objM1444, this.f1589, objM1445);
                                        } catch (C3523 e2) {
                                            throw e2.mo4643(this, c0550);
                                        }
                                    }
                                    try {
                                        return AbstractC0008.m373(objM1444, this.f1589, objM1445);
                                    } catch (C3523 e3) {
                                        throw e3.mo4644("Failed operation: " + objM1444 + " " + InterfaceC2335.f7500[this.f1589] + " " + objM1445, this, c0550);
                                    }
                            }
                        }
                        return objMo306;
                    }
                }
            }
        } else {
            i = this.f1589;
            if (i == 100) {
                runnableC1668.getClass();
                if (!Primitive.TRUE.equals(Primitive.castWrapper(cls, objMo307))) {
                    if (this.f1589 == 149) {
                    }
                    objMo306 = this.f8721[1].mo306(c0550, runnableC1668);
                    i2 = this.f1589;
                    if (i2 != 149) {
                        runnableC1668.getClass();
                        switch (i2) {
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            default:
                                objM1444 = m1444(objMo307, objMo306, 0, c0550);
                                objM1445 = m1444(objMo306, objM1444, 1, c0550);
                                i3 = this.f1589;
                                if (i3 == 94) {
                                    break;
                                } else {
                                    break;
                                }
                                return AbstractC0008.m370(objM1444, this.f1589, objM1445);
                        }
                    }
                    return objMo306;
                }
            } else {
                runnableC1668.getClass();
                if (!Primitive.TRUE.equals(Primitive.castWrapper(cls, objMo307))) {
                    if (this.f1589 == 149) {
                    }
                    objMo306 = this.f8721[1].mo306(c0550, runnableC1668);
                    i2 = this.f1589;
                    if (i2 != 149) {
                        runnableC1668.getClass();
                        switch (i2) {
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            default:
                                objM1444 = m1444(objMo307, objMo306, 0, c0550);
                                objM1445 = m1444(objMo306, objM1444, 1, c0550);
                                i3 = this.f1589;
                                if (i3 == 94) {
                                    break;
                                } else {
                                    break;
                                }
                                return AbstractC0008.m370(objM1444, this.f1589, objM1445);
                        }
                    }
                    return objMo306;
                }
            }
        }
        return objMo307;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object m1444(Object obj, Object obj2, int i, C0550 c0550) throws C1230, C2895 {
        Class<?> cls;
        Primitive primitive = Primitive.NULL;
        if (primitive == obj && Primitive.VOID != obj2) {
            try {
                boolean z = obj2 instanceof String;
                if (primitive == obj2) {
                    C3532 c3532M1445 = m1445(i ^ 1, c0550);
                    if (c3532M1445 != null) {
                        cls = c3532M1445.f11061;
                        z = cls == String.class;
                    } else {
                        cls = null;
                    }
                } else {
                    cls = Primitive.unwrap(obj2).getClass();
                }
                C3532 c3532M1446 = m1445(i, c0550);
                if (c3532M1446 != null) {
                    int i2 = this.f1589;
                    if (i2 != 94 && i2 != 99) {
                        if (i2 == 106 && (z || c3532M1446.f11061 == String.class)) {
                            return "null";
                        }
                        boolean zM1447 = m1447(c3532M1446.f11061);
                        String[] strArr = InterfaceC2335.f7500;
                        if (zM1447) {
                            throw new NullPointerException("null value with binary operator " + strArr[this.f1589]);
                        }
                        throw new C1230("bad operand types for binary operator " + strArr[this.f1589], this, c0550);
                    }
                    m1446(c3532M1446.f11061, cls, c0550);
                    return obj;
                }
            } catch (NullPointerException e) {
                throw new C2895(e, this, c0550);
            } catch (C3523 e2) {
                e2.mo4643(this, c0550);
                return obj;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C3532 m1445(int i, C0550 c0550) {
        if (((AbstractC2707) this.f8721[i]).m4710().length <= 0) {
            return null;
        }
        InterfaceC2225 interfaceC2225 = ((AbstractC2707) this.f8721[i]).f8721[0];
        if (interfaceC2225 instanceof C0326) {
            return c0550.m1929().m357(((C0326) interfaceC2225).f1577, true);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m1446(Class cls, Class cls2, C0550 c0550) throws C1230 {
        if (cls2 == cls || cls2 == null || cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls)) {
            return;
        }
        throw new C1230("incomparable types: " + AbstractC2202.m4018(cls) + " and " + AbstractC2202.m4018(cls2), this, c0550);
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean m1447(java.lang.Class r4) {
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
            int r4 = r3.f1589
            r1 = 94
            if (r4 == r1) goto L2b
            switch(r4) {
                case 99: goto L2b;
                case 100: goto L2b;
                case 101: goto L2b;
                case 102: goto L2b;
                case 103: goto L2b;
                default: goto L27;
            }
        L27:
            switch(r4) {
                case 110: goto L2b;
                case 111: goto L2b;
                case 112: goto L2b;
                case 113: goto L2b;
                case 114: goto L2b;
                case 115: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L2c
        L2b:
            return r2
        L2c:
            return r0
        L2d:
            int r4 = r3.f1589
            switch(r4) {
                case 100: goto L33;
                case 101: goto L33;
                case 102: goto L33;
                case 103: goto L33;
                default: goto L32;
            }
        L32:
            return r2
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0332.m1447(java.lang.Class):boolean");
    }
}
