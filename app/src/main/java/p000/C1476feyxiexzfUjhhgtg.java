package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸能不能ᛴᛱUjhhgtgᛱᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1476feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f5121Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public ArrayList f5122Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f5126Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int f5127Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f5125Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f5123Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f5124Ujhhgtgfeyxiexzf = false;

    public C1476feyxiexzfUjhhgtg(C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf, int i, int i2, int i3) {
        this.f5121Ujhhgtgfeyxiexzf = i2;
        this.f5122Ujhhgtgfeyxiexzf = new ArrayList(i);
        this.f5127Ujhhgtgfeyxiexzf = i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2988Ujhhgtgfeyxiexzf(AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf) {
        this.f5122Ujhhgtgfeyxiexzf.add(abstractC3068Ujhhgtgfeyxiexzf);
        if (!this.f5123Ujhhgtgfeyxiexzf && abstractC3068Ujhhgtgfeyxiexzf.f9499Ujhhgtgfeyxiexzf.f4564Ujhhgtgfeyxiexzf >= 0) {
            this.f5123Ujhhgtgfeyxiexzf = true;
        }
        if (!this.f5124Ujhhgtgfeyxiexzf && (abstractC3068Ujhhgtgfeyxiexzf instanceof AbstractC0236Ujhhgtgfeyxiexzf)) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2989Ujhhgtgfeyxiexzf() {
        int iM1944Ujhhgtgfeyxiexzf;
        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf;
        int size = this.f5122Ujhhgtgfeyxiexzf.size();
        int i = this.f5121Ujhhgtgfeyxiexzf + this.f5125Ujhhgtgfeyxiexzf + this.f5126Ujhhgtgfeyxiexzf;
        int i2 = i - this.f5127Ujhhgtgfeyxiexzf;
        C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg = new C2501feyxiexzfUjhhgtg(i);
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 >= i2) {
                c2501feyxiexzfUjhhgtg.m3780Ujhhgtgfeyxiexzf(i3, i3 + 1, 1);
            } else {
                c2501feyxiexzfUjhhgtg.m3780Ujhhgtgfeyxiexzf(i3, i3, 1);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf = (AbstractC3068Ujhhgtgfeyxiexzf) this.f5122Ujhhgtgfeyxiexzf.get(i4);
            if (!(abstractC3068Ujhhgtgfeyxiexzf instanceof C2866feyxiexzfUjhhgtg)) {
                ArrayList arrayList = this.f5122Ujhhgtgfeyxiexzf;
                C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg = abstractC3068Ujhhgtgfeyxiexzf.f9500Ujhhgtgfeyxiexzf;
                int length = c0960feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
                C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg2 = new C0960feyxiexzfUjhhgtg(length);
                for (int i5 = 0; i5 < length; i5++) {
                    C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg = (C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i5);
                    if (c0961feyxiexzfUjhhgtg == null) {
                        c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf = null;
                    } else {
                        try {
                            iM1944Ujhhgtgfeyxiexzf = ((C0684Ujhhgtgfeyxiexzf) c2501feyxiexzfUjhhgtg.f8171Ujhhgtgfeyxiexzf).m1944Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtg.f3830Ujhhgtgfeyxiexzf);
                        } catch (IndexOutOfBoundsException unused) {
                            iM1944Ujhhgtgfeyxiexzf = -1;
                        }
                        if (iM1944Ujhhgtgfeyxiexzf < 0) {
                            throw new RuntimeException("no mapping specified for register");
                        }
                        c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf = c0961feyxiexzfUjhhgtg.m2459Ujhhgtgfeyxiexzf(iM1944Ujhhgtgfeyxiexzf);
                    }
                    c0960feyxiexzfUjhhgtg2.m4970Ujhhgtgfeyxiexzf(i5, c0961feyxiexzfUjhhgtgM2459Ujhhgtgfeyxiexzf);
                }
                c0960feyxiexzfUjhhgtg2.f2247Ujhhgtgfeyxiexzf = false;
                if (!c0960feyxiexzfUjhhgtg2.equals(c0960feyxiexzfUjhhgtg)) {
                    c0960feyxiexzfUjhhgtg = c0960feyxiexzfUjhhgtg2;
                }
                arrayList.set(i4, abstractC3068Ujhhgtgfeyxiexzf.mo1806Ujhhgtgfeyxiexzf(c0960feyxiexzfUjhhgtg));
            }
        }
        this.f5126Ujhhgtgfeyxiexzf++;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m2990Ujhhgtgfeyxiexzf() {
        int size = this.f5122Ujhhgtgfeyxiexzf.size();
        for (int i = 0; i < size; i++) {
            AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf = (AbstractC3068Ujhhgtgfeyxiexzf) this.f5122Ujhhgtgfeyxiexzf.get(i);
            if (!(abstractC3068Ujhhgtgfeyxiexzf instanceof C2866feyxiexzfUjhhgtg)) {
                this.f5122Ujhhgtgfeyxiexzf.set(i, abstractC3068Ujhhgtgfeyxiexzf.mo3477Ujhhgtgfeyxiexzf(1));
            }
        }
        this.f5125Ujhhgtgfeyxiexzf++;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3216feyxiexzfUjhhgtg m2991Ujhhgtgfeyxiexzf(AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf) {
        C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg = abstractC3068Ujhhgtgfeyxiexzf.f9500Ujhhgtgfeyxiexzf;
        C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg = abstractC3068Ujhhgtgfeyxiexzf.f9498Ujhhgtgfeyxiexzf;
        C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtgM2992Ujhhgtgfeyxiexzf = m2992Ujhhgtgfeyxiexzf(abstractC3068Ujhhgtgfeyxiexzf.mo1806Ujhhgtgfeyxiexzf(c0960feyxiexzfUjhhgtg.m2449Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtg.f10103Ujhhgtgfeyxiexzf, null)), c3216feyxiexzfUjhhgtg);
        if (c3216feyxiexzfUjhhgtgM2992Ujhhgtgfeyxiexzf != null) {
            return c3216feyxiexzfUjhhgtgM2992Ujhhgtgfeyxiexzf;
        }
        throw new C3267feyxiexzfUjhhgtg("No expanded opcode for " + abstractC3068Ujhhgtgfeyxiexzf, null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C3216feyxiexzfUjhhgtg m2992Ujhhgtgfeyxiexzf(AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf, C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg) {
        while (c3216feyxiexzfUjhhgtg != null) {
            if (c3216feyxiexzfUjhhgtg.f10102Ujhhgtgfeyxiexzf.mo3166Ujhhgtgfeyxiexzf(abstractC3068Ujhhgtgfeyxiexzf)) {
                return c3216feyxiexzfUjhhgtg;
            }
            C3216feyxiexzfUjhhgtg[] c3216feyxiexzfUjhhgtgArr = AbstractC3212feyxiexzfUjhhgtg.f9959Ujhhgtgfeyxiexzf;
            int i = c3216feyxiexzfUjhhgtg.f10101Ujhhgtgfeyxiexzf;
            if (i == -1) {
                c3216feyxiexzfUjhhgtg = null;
            } else {
                try {
                    c3216feyxiexzfUjhhgtg = AbstractC3212feyxiexzfUjhhgtg.f9959Ujhhgtgfeyxiexzf[i + 1];
                    if (c3216feyxiexzfUjhhgtg == null) {
                        throw new IllegalArgumentException("bogus opcode");
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return c3216feyxiexzfUjhhgtg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ能不能ᛳᛱUjhhgtgᛱᛴ要点脸, 上海高中ᛱ谢子非ᛱ要点脸ᛳᛴᛱUjhhgtgᛱ能不能ᛲᛱfeyxiexzfᛱ] */
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m2993Ujhhgtgfeyxiexzf(C3216feyxiexzfUjhhgtg[] c3216feyxiexzfUjhhgtgArr) {
        int i = this.f5125Ujhhgtgfeyxiexzf;
        if (i < 0) {
            i = 0;
        }
        boolean z = false;
        while (true) {
            int size = this.f5122Ujhhgtgfeyxiexzf.size();
            int i2 = this.f5125Ujhhgtgfeyxiexzf;
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf = (AbstractC3068Ujhhgtgfeyxiexzf) this.f5122Ujhhgtgfeyxiexzf.get(i3);
                C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg = c3216feyxiexzfUjhhgtgArr[i3];
                C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtgM2992Ujhhgtgfeyxiexzf = m2992Ujhhgtgfeyxiexzf(abstractC3068Ujhhgtgfeyxiexzf, c3216feyxiexzfUjhhgtg);
                if (c3216feyxiexzfUjhhgtgM2992Ujhhgtgfeyxiexzf == null) {
                    ?? Mo3163Ujhhgtgfeyxiexzf = m2991Ujhhgtgfeyxiexzf(abstractC3068Ujhhgtgfeyxiexzf).f10102Ujhhgtgfeyxiexzf.mo3163Ujhhgtgfeyxiexzf(abstractC3068Ujhhgtgfeyxiexzf);
                    boolean z2 = abstractC3068Ujhhgtgfeyxiexzf.f9498Ujhhgtgfeyxiexzf.f10103Ujhhgtgfeyxiexzf;
                    ?? r6 = abstractC3068Ujhhgtgfeyxiexzf.f9500Ujhhgtgfeyxiexzf;
                    int length = r6.f10801Ujhhgtgfeyxiexzf.length;
                    int iM2455Ujhhgtgfeyxiexzf = (!z2 || Mo3163Ujhhgtgfeyxiexzf.get(0)) ? 0 : ((C0961feyxiexzfUjhhgtg) r6.m4969Ujhhgtgfeyxiexzf(0)).m2455Ujhhgtgfeyxiexzf();
                    int iM2455Ujhhgtgfeyxiexzf2 = 0;
                    for (?? r9 = z2; r9 < length; r9++) {
                        if (!Mo3163Ujhhgtgfeyxiexzf.get(r9)) {
                            iM2455Ujhhgtgfeyxiexzf2 += ((C0961feyxiexzfUjhhgtg) r6.m4969Ujhhgtgfeyxiexzf(r9)).m2455Ujhhgtgfeyxiexzf();
                        }
                    }
                    int iMax = Math.max(iM2455Ujhhgtgfeyxiexzf2, iM2455Ujhhgtgfeyxiexzf);
                    if (iMax > i2) {
                        i2 = iMax;
                    }
                } else {
                    if (c3216feyxiexzfUjhhgtg == c3216feyxiexzfUjhhgtgM2992Ujhhgtgfeyxiexzf) {
                    }
                }
                c3216feyxiexzfUjhhgtgArr[i3] = c3216feyxiexzfUjhhgtgM2992Ujhhgtgfeyxiexzf;
            }
            if (i >= i2) {
                this.f5125Ujhhgtgfeyxiexzf = i;
                return z;
            }
            int i4 = i2 - i;
            int size2 = this.f5122Ujhhgtgfeyxiexzf.size();
            for (int i5 = 0; i5 < size2; i5++) {
                AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf2 = (AbstractC3068Ujhhgtgfeyxiexzf) this.f5122Ujhhgtgfeyxiexzf.get(i5);
                if (!(abstractC3068Ujhhgtgfeyxiexzf2 instanceof C2866feyxiexzfUjhhgtg)) {
                    this.f5122Ujhhgtgfeyxiexzf.set(i5, abstractC3068Ujhhgtgfeyxiexzf2.mo3477Ujhhgtgfeyxiexzf(i4));
                }
            }
            z = true;
            i = i2;
        }
    }
}
