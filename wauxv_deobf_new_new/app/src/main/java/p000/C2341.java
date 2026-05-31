package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᲁᤞᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2341 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f7552;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public ArrayList f7553;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f7557;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int f7558;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f7556 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f7554 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f7555 = false;

    public C2341(C0561 c0561, int i, int i2, int i3) {
        this.f7552 = i2;
        this.f7553 = new ArrayList(i);
        this.f7558 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4295(AbstractC0953 abstractC0953) {
        this.f7553.add(abstractC0953);
        if (!this.f7554 && abstractC0953.f3484.f9069 >= 0) {
            this.f7554 = true;
        }
        if (!this.f7555 && (abstractC0953 instanceof AbstractC1856)) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4296() {
        int iM3548;
        C2581 c2581M4566;
        int size = this.f7553.size();
        int i = this.f7552 + this.f7556 + this.f7557;
        int i2 = i - this.f7558;
        C0383 c0383 = new C0383(i);
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 >= i2) {
                c0383.m1708(i3, i3 + 1, 1);
            } else {
                c0383.m1708(i3, i3, 1);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0953 abstractC0953 = (AbstractC0953) this.f7553.get(i4);
            if (!(abstractC0953 instanceof C0729)) {
                ArrayList arrayList = this.f7553;
                C2582 c2582 = abstractC0953.f3485;
                int length = c2582.f4833.length;
                C2582 c2583 = new C2582(length);
                for (int i5 = 0; i5 < length; i5++) {
                    C2581 c2581 = (C2581) c2582.m3165(i5);
                    if (c2581 == null) {
                        c2581M4566 = null;
                    } else {
                        try {
                            iM3548 = ((C1676) c0383.f1894).m3548(c2581.f8205);
                        } catch (IndexOutOfBoundsException unused) {
                            iM3548 = -1;
                        }
                        if (iM3548 < 0) {
                            throw new RuntimeException("no mapping specified for register");
                        }
                        c2581M4566 = c2581.m4566(iM3548);
                    }
                    c2583.m3166(i5, c2581M4566);
                }
                c2583.f7068 = false;
                if (!c2583.equals(c2582)) {
                    c2582 = c2583;
                }
                arrayList.set(i4, abstractC0953.mo1492(c2582));
            }
        }
        this.f7557++;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4297() {
        int size = this.f7553.size();
        for (int i = 0; i < size; i++) {
            AbstractC0953 abstractC0953 = (AbstractC0953) this.f7553.get(i);
            if (!(abstractC0953 instanceof C0729)) {
                this.f7553.set(i, abstractC0953.mo2563(1));
            }
        }
        this.f7556++;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1094 m4298(AbstractC0953 abstractC0953) {
        C2582 c2582 = abstractC0953.f3485;
        C1094 c1094 = abstractC0953.f3483;
        C1094 c1094M4299 = m4299(abstractC0953.mo1492(c2582.m4571(c1094.f3941, null)), c1094);
        if (c1094M4299 != null) {
            return c1094M4299;
        }
        throw new C1025("No expanded opcode for " + abstractC0953, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1094 m4299(AbstractC0953 abstractC0953, C1094 c1094) {
        while (c1094 != null) {
            if (c1094.f3940.mo3221(abstractC0953)) {
                return c1094;
            }
            C1094[] c1094Arr = AbstractC1096.f3942;
            int i = c1094.f3939;
            if (i == -1) {
                c1094 = null;
            } else {
                try {
                    c1094 = AbstractC1096.f3942[i + 1];
                    if (c1094 == null) {
                        throw new IllegalArgumentException("bogus opcode");
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return c1094;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᛸᲀᤞᲁ, ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᤞᤝᲈᲇ] */
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m4300(C1094[] c1094Arr) {
        int i = this.f7556;
        if (i < 0) {
            i = 0;
        }
        boolean z = false;
        while (true) {
            int size = this.f7553.size();
            int i2 = this.f7556;
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0953 abstractC0953 = (AbstractC0953) this.f7553.get(i3);
                C1094 c1094 = c1094Arr[i3];
                C1094 c1094M4299 = m4299(abstractC0953, c1094);
                if (c1094M4299 == null) {
                    ?? Mo3218 = m4298(abstractC0953).f3940.mo3218(abstractC0953);
                    boolean z2 = abstractC0953.f3483.f3941;
                    ?? r6 = abstractC0953.f3485;
                    int length = r6.f4833.length;
                    int iM4562 = (!z2 || Mo3218.get(0)) ? 0 : ((C2581) r6.m3165(0)).m4562();
                    int iM4563 = 0;
                    for (?? r9 = z2; r9 < length; r9++) {
                        if (!Mo3218.get(r9)) {
                            iM4563 += ((C2581) r6.m3165(r9)).m4562();
                        }
                    }
                    int iMax = Math.max(iM4563, iM4562);
                    if (iMax > i2) {
                        i2 = iMax;
                    }
                } else {
                    if (c1094 == c1094M4299) {
                    }
                }
                c1094Arr[i3] = c1094M4299;
            }
            if (i >= i2) {
                this.f7556 = i;
                return z;
            }
            int i4 = i2 - i;
            int size2 = this.f7553.size();
            for (int i5 = 0; i5 < size2; i5++) {
                AbstractC0953 abstractC0954 = (AbstractC0953) this.f7553.get(i5);
                if (!(abstractC0954 instanceof C0729)) {
                    this.f7553.set(i5, abstractC0954.mo2563(i4));
                }
            }
            z = true;
            i = i2;
        }
    }
}
