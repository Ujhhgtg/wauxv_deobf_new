package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛴᛲᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0870feyxiexzfUjhhgtg implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final ConcurrentHashMap f3379Ujhhgtgfeyxiexzf = new ConcurrentHashMap(10000, 0.75f);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f3380Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C1784feyxiexzfUjhhgtg f3381Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C1163feyxiexzfUjhhgtg f3382Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C1163feyxiexzfUjhhgtg f3383Ujhhgtgfeyxiexzf;

    public C0870feyxiexzfUjhhgtg(String str, C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg, C1163feyxiexzfUjhhgtg c1163feyxiexzfUjhhgtg) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (c1784feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("returnType == null");
        }
        this.f3380Ujhhgtgfeyxiexzf = str;
        this.f3381Ujhhgtgfeyxiexzf = c1784feyxiexzfUjhhgtg;
        this.f3382Ujhhgtgfeyxiexzf = c1163feyxiexzfUjhhgtg;
        this.f3383Ujhhgtgfeyxiexzf = null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C0870feyxiexzfUjhhgtg m2299Ujhhgtgfeyxiexzf(String str) {
        int i;
        C0870feyxiexzfUjhhgtg c0870feyxiexzfUjhhgtg = (C0870feyxiexzfUjhhgtg) f3379Ujhhgtgfeyxiexzf.get(str);
        if (c0870feyxiexzfUjhhgtg != null) {
            return c0870feyxiexzfUjhhgtg;
        }
        int length = str.length();
        if (str.charAt(0) != '(') {
            throw new IllegalArgumentException("bad descriptor");
        }
        int i2 = 0;
        int i3 = 1;
        while (true) {
            if (i3 >= length) {
                i3 = 0;
                break;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt == ')') {
                break;
            }
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                i2++;
            }
            i3++;
        }
        if (i3 == 0 || i3 == length - 1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        if (str.indexOf(41, i3 + 1) != -1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        C1784feyxiexzfUjhhgtg[] c1784feyxiexzfUjhhgtgArr = new C1784feyxiexzfUjhhgtg[i2];
        int i4 = 0;
        int i5 = 1;
        while (true) {
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 == ')') {
                String strSubstring = str.substring(i5 + 1);
                ConcurrentHashMap concurrentHashMap = C1784feyxiexzfUjhhgtg.f5978Ujhhgtgfeyxiexzf;
                try {
                    C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtgM3114Ujhhgtgfeyxiexzf = strSubstring.equals("V") ? C1784feyxiexzfUjhhgtg.f5987Ujhhgtgfeyxiexzf : C1784feyxiexzfUjhhgtg.m3114Ujhhgtgfeyxiexzf(strSubstring);
                    C1163feyxiexzfUjhhgtg c1163feyxiexzfUjhhgtg = new C1163feyxiexzfUjhhgtg(i4);
                    for (int i6 = 0; i6 < i4; i6++) {
                        c1163feyxiexzfUjhhgtg.m4970Ujhhgtgfeyxiexzf(i6, c1784feyxiexzfUjhhgtgArr[i6]);
                    }
                    return new C0870feyxiexzfUjhhgtg(str, c1784feyxiexzfUjhhgtgM3114Ujhhgtgfeyxiexzf, c1163feyxiexzfUjhhgtg);
                } catch (NullPointerException unused) {
                    throw new NullPointerException("descriptor == null");
                }
            }
            int i7 = i5;
            while (cCharAt2 == '[') {
                i7++;
                cCharAt2 = str.charAt(i7);
            }
            if (cCharAt2 == 'L') {
                int iIndexOf = str.indexOf(59, i7);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("bad descriptor");
                }
                i = iIndexOf + 1;
            } else {
                i = i7 + 1;
            }
            c1784feyxiexzfUjhhgtgArr[i4] = C1784feyxiexzfUjhhgtg.m3114Ujhhgtgfeyxiexzf(str.substring(i5, i));
            i4++;
            i5 = i;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static C0870feyxiexzfUjhhgtg m2300Ujhhgtgfeyxiexzf(String str) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        ConcurrentHashMap concurrentHashMap = f3379Ujhhgtgfeyxiexzf;
        C0870feyxiexzfUjhhgtg c0870feyxiexzfUjhhgtg = (C0870feyxiexzfUjhhgtg) concurrentHashMap.get(str);
        if (c0870feyxiexzfUjhhgtg != null) {
            return c0870feyxiexzfUjhhgtg;
        }
        C0870feyxiexzfUjhhgtg c0870feyxiexzfUjhhgtgM2299Ujhhgtgfeyxiexzf = m2299Ujhhgtgfeyxiexzf(str);
        C0870feyxiexzfUjhhgtg c0870feyxiexzfUjhhgtg2 = (C0870feyxiexzfUjhhgtg) concurrentHashMap.putIfAbsent(c0870feyxiexzfUjhhgtgM2299Ujhhgtgfeyxiexzf.f3380Ujhhgtgfeyxiexzf, c0870feyxiexzfUjhhgtgM2299Ujhhgtgfeyxiexzf);
        return c0870feyxiexzfUjhhgtg2 != null ? c0870feyxiexzfUjhhgtg2 : c0870feyxiexzfUjhhgtgM2299Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0870feyxiexzfUjhhgtg)) {
            return false;
        }
        return this.f3380Ujhhgtgfeyxiexzf.equals(((C0870feyxiexzfUjhhgtg) obj).f3380Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f3380Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        return this.f3380Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C0870feyxiexzfUjhhgtg c0870feyxiexzfUjhhgtg) {
        if (this != c0870feyxiexzfUjhhgtg) {
            C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg = c0870feyxiexzfUjhhgtg.f3381Ujhhgtgfeyxiexzf;
            C1163feyxiexzfUjhhgtg c1163feyxiexzfUjhhgtg = c0870feyxiexzfUjhhgtg.f3382Ujhhgtgfeyxiexzf;
            int iCompareTo = this.f3381Ujhhgtgfeyxiexzf.f6017Ujhhgtgfeyxiexzf.compareTo(c1784feyxiexzfUjhhgtg.f6017Ujhhgtgfeyxiexzf);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            C1163feyxiexzfUjhhgtg c1163feyxiexzfUjhhgtg2 = this.f3382Ujhhgtgfeyxiexzf;
            int length = c1163feyxiexzfUjhhgtg2.f10801Ujhhgtgfeyxiexzf.length;
            int length2 = c1163feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
            int iMin = Math.min(length, length2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo2 = ((C1784feyxiexzfUjhhgtg) c1163feyxiexzfUjhhgtg2.m4969Ujhhgtgfeyxiexzf(i)).f6017Ujhhgtgfeyxiexzf.compareTo(((C1784feyxiexzfUjhhgtg) c1163feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i)).f6017Ujhhgtgfeyxiexzf);
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            if (length < length2) {
                return -1;
            }
            if (length > length2) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C1163feyxiexzfUjhhgtg m2302Ujhhgtgfeyxiexzf() {
        if (this.f3383Ujhhgtgfeyxiexzf == null) {
            C1163feyxiexzfUjhhgtg c1163feyxiexzfUjhhgtg = this.f3382Ujhhgtgfeyxiexzf;
            int length = c1163feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
            C1163feyxiexzfUjhhgtg c1163feyxiexzfUjhhgtg2 = new C1163feyxiexzfUjhhgtg(length);
            boolean z = false;
            for (int i = 0; i < length; i++) {
                C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg = (C1784feyxiexzfUjhhgtg) c1163feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i);
                if (c1784feyxiexzfUjhhgtg.m3126Ujhhgtgfeyxiexzf()) {
                    c1784feyxiexzfUjhhgtg = C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf;
                    z = true;
                }
                c1163feyxiexzfUjhhgtg2.m4970Ujhhgtgfeyxiexzf(i, c1784feyxiexzfUjhhgtg);
            }
            if (z) {
                c1163feyxiexzfUjhhgtg = c1163feyxiexzfUjhhgtg2;
            }
            this.f3383Ujhhgtgfeyxiexzf = c1163feyxiexzfUjhhgtg;
        }
        return this.f3383Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0870feyxiexzfUjhhgtg m2303Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg) {
        String str = "(" + c1784feyxiexzfUjhhgtg.f6017Ujhhgtgfeyxiexzf + this.f3380Ujhhgtgfeyxiexzf.substring(1);
        C1163feyxiexzfUjhhgtg c1163feyxiexzfUjhhgtg = this.f3382Ujhhgtgfeyxiexzf;
        int length = c1163feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        C1163feyxiexzfUjhhgtg c1163feyxiexzfUjhhgtg2 = new C1163feyxiexzfUjhhgtg(length + 1);
        c1163feyxiexzfUjhhgtg2.m4970Ujhhgtgfeyxiexzf(0, c1784feyxiexzfUjhhgtg);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            c1163feyxiexzfUjhhgtg2.m4970Ujhhgtgfeyxiexzf(i2, c1163feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf[i]);
            i = i2;
        }
        c1163feyxiexzfUjhhgtg2.f2247Ujhhgtgfeyxiexzf = false;
        C0870feyxiexzfUjhhgtg c0870feyxiexzfUjhhgtg = new C0870feyxiexzfUjhhgtg(str, this.f3381Ujhhgtgfeyxiexzf, c1163feyxiexzfUjhhgtg2);
        C0870feyxiexzfUjhhgtg c0870feyxiexzfUjhhgtg2 = (C0870feyxiexzfUjhhgtg) f3379Ujhhgtgfeyxiexzf.putIfAbsent(str, c0870feyxiexzfUjhhgtg);
        return c0870feyxiexzfUjhhgtg2 != null ? c0870feyxiexzfUjhhgtg2 : c0870feyxiexzfUjhhgtg;
    }
}
