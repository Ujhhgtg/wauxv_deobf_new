package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2308 {

    public final int f7430;

    public ArrayList f7431;

    public int f7435;

    public final int f7436;

    public int f7434 = -1;

    public boolean f7432 = false;

    public boolean f7433 = false;

    public C2308(C0580 c0580, int i, int i2, int i3) {
        this.f7430 = i2;
        this.f7431 = new ArrayList(i);
        this.f7436 = i3;
    }

    public final void m4166(AbstractC0950 abstractC0950) {
        this.f7431.add(abstractC0950);
        if (!this.f7432 && abstractC0950.f3469.f8907 >= 0) {
            this.f7432 = true;
        }
        if (!this.f7433 && (abstractC0950 instanceof AbstractC1829)) {
            throw null;
        }
    }

    public final void m4167() {
        int iM3384;
        C2525 c2525M4544;
        int size = this.f7431.size();
        int i = this.f7430 + this.f7434 + this.f7435;
        int i2 = i - this.f7436;
        C0408 c0408 = new C0408(i);
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 >= i2) {
                c0408.m1602(i3, i3 + 1, 1);
            } else {
                c0408.m1602(i3, i3, 1);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0950 abstractC0950 = (AbstractC0950) this.f7431.get(i4);
            if (!(abstractC0950 instanceof C0734)) {
                ArrayList arrayList = this.f7431;
                C2526 c2526 = abstractC0950.f3470;
                int length = c2526.f4836.length;
                C2526 c2527 = new C2526(length);
                for (int i5 = 0; i5 < length; i5++) {
                    C2525 c2525 = (C2525) c2526.m3062(i5);
                    if (false) {
                        c2525M4544 = null;
                    } else {
                        try {
                            iM3384 = ((C1660) c0408.f1922).m3384(c2525.f8055);
                        } catch (IndexOutOfBoundsException unused) {
                            iM3384 = -1;
                        }
                        if (iM3384 < 0) {
                            throw new RuntimeException("no mapping specified for register");
                        }
                        c2525M4544 = c2525.m4544(iM3384);
                    }
                    c2527.m3063(i5, c2525M4544);
                }
                c2527.f6944 = false;
                if (!c2527.equals(c2526)) {
                    c2526 = c2527;
                }
                arrayList.set(i4, abstractC0950.mo1346(c2526));
            }
        }
        this.f7435++;
    }

    public final void m4168() {
        int size = this.f7431.size();
        for (int i = 0; i < size; i++) {
            AbstractC0950 abstractC0950 = (AbstractC0950) this.f7431.get(i);
            if (!(abstractC0950 instanceof C0734)) {
                this.f7431.set(i, abstractC0950.mo2444(1));
            }
        }
        this.f7434++;
    }

    public final C1089 m4169(AbstractC0950 abstractC0950) {
        C2526 c2526 = abstractC0950.f3470;
        C1089 c1089 = abstractC0950.f3468;
        C1089 c1089M4170 = m4170(abstractC0950.mo1346(c2526.m4549(c1089.f3930, null)), c1089);
        if (c1089M4170 != null) {
            return c1089M4170;
        }
        throw new C1022("No expanded opcode for " + abstractC0950, null);
    }

    public final C1089 m4170(AbstractC0950 abstractC0950, C1089 c1089) {
        while (c1089 != null) {
            if (c1089.f3929.mo3113(abstractC0950)) {
                return c1089;
            }
            C1089[] c1089Arr = AbstractC1090.f3931;
            int i = c1089.f3928;
            if (i == -1) {
                c1089 = null;
            } else {
                try {
                    c1089 = AbstractC1090.f3931[i + 1];
                    if (c1089 == null) {
                        throw new IllegalArgumentException("bogus opcode");
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return c1089;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᤞᲀᲁᛸ, ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᤝᛸᲁᲈ] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.BitSet] */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean m4171(C1089[] c1089Arr) {
        int i = this.f7434;
        if (i < 0) {
            i = 0;
        }
        boolean z = false;
        while (true) {
            int size = this.f7431.size();
            int i2 = this.f7434;
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0950 abstractC0950 = (AbstractC0950) this.f7431.get(i3);
                C1089 c1089 = c1089Arr[i3];
                C1089 c1089M4170 = m4170(abstractC0950, c1089);
                if (c1089M4170 == null) {
                    ?? Mo3110 = m4169(abstractC0950).f3929.mo3110(abstractC0950);
                    boolean z2 = abstractC0950.f3468.f3930;
                    ?? r6 = abstractC0950.f3470;
                    int length = r6.f4836.length;
                    int iM4540 = (!z2 || Mo3110.get(0)) ? 0 : ((C2525) r6.m3062(0)).m4540();
                    int iM4541 = 0;
                    for (?? r9 = z2; r9 < length; r9++) {
                        if (!Mo3110.get(r9)) {
                            0 += ((C2525) r6.m3062(r9)).m4540();
                        }
                    }
                    int iMax = Math.max(iM4541, iM4540);
                    if (iMax > i2) {
                        i2 = iMax;
                    }
                } else {
                    if (c1089 == c1089M4170) {
                    }
                }
                c1089Arr[i3] = c1089M4170;
            }
            if (i >= i2) {
                this.f7434 = i;
                return z;
            }
            int i4 = i2 - i;
            int size2 = this.f7431.size();
            for (int i5 = 0; i5 < size2; i5++) {
                AbstractC0950 abstractC0951 = (AbstractC0950) this.f7431.get(i5);
                if (!(abstractC0951 instanceof C0734)) {
                    this.f7431.set(i5, abstractC0951.mo2444(i4));
                }
            }
            z = true;
            i = i2;
        }
    }
}
