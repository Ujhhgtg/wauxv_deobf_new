package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᲁᲇᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2440 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final ConcurrentHashMap f7753 = new ConcurrentHashMap(10000, 0.75f);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f7754;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C3448 f7755;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2819 f7756;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C2819 f7757;

    public C2440(String str, C3448 c3448, C2819 c2819) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (c3448 == null) {
            throw new NullPointerException("returnType == null");
        }
        this.f7754 = str;
        this.f7755 = c3448;
        this.f7756 = c2819;
        this.f7757 = null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C2440 m4419(String str) {
        int i;
        C2440 c2440 = (C2440) f7753.get(str);
        if (c2440 != null) {
            return c2440;
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
        C3448[] c3448Arr = new C3448[i2];
        int i4 = 0;
        int i5 = 1;
        while (true) {
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 == ')') {
                String strSubstring = str.substring(i5 + 1);
                ConcurrentHashMap concurrentHashMap = C3448.f10865;
                try {
                    C3448 c3448M4961 = strSubstring.equals("V") ? C3448.f10874 : C3448.m4961(strSubstring);
                    C2819 c2819 = new C2819(i4);
                    for (int i6 = 0; i6 < i4; i6++) {
                        c2819.m3063(i6, c3448Arr[i6]);
                    }
                    return new C2440(str, c3448M4961, c2819);
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
            c3448Arr[i4] = C3448.m4961(str.substring(i5, i));
            i4++;
            i5 = i;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C2440 m4420(String str) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        ConcurrentHashMap concurrentHashMap = f7753;
        C2440 c2440 = (C2440) concurrentHashMap.get(str);
        if (c2440 != null) {
            return c2440;
        }
        C2440 c2440M4419 = m4419(str);
        C2440 c2441 = (C2440) concurrentHashMap.putIfAbsent(c2440M4419.f7754, c2440M4419);
        return c2441 != null ? c2441 : c2440M4419;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2440)) {
            return false;
        }
        return this.f7754.equals(((C2440) obj).f7754);
    }

    public final int hashCode() {
        return this.f7754.hashCode();
    }

    public final String toString() {
        return this.f7754;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C2440 c2440) {
        if (this != c2440) {
            C3448 c3448 = c2440.f7755;
            C2819 c2819 = c2440.f7756;
            int iCompareTo = this.f7755.f10904.compareTo(c3448.f10904);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            C2819 c28110 = this.f7756;
            int length = c28110.f4836.length;
            int length2 = c2819.f4836.length;
            int iMin = Math.min(length, length2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo2 = ((C3448) c28110.m3062(i)).f10904.compareTo(((C3448) c2819.m3062(i)).f10904);
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2819 m4422() {
        if (this.f7757 == null) {
            C2819 c2819 = this.f7756;
            int length = c2819.f4836.length;
            C2819 c28110 = new C2819(length);
            boolean z = false;
            for (int i = 0; i < length; i++) {
                C3448 c3448 = (C3448) c2819.m3062(i);
                if (c3448.m4973()) {
                    c3448 = C3448.f10871;
                    z = true;
                }
                c28110.m3063(i, c3448);
            }
            if (z) {
                c2819 = c28110;
            }
            this.f7757 = c2819;
        }
        return this.f7757;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2440 m4423(C3448 c3448) {
        String str = "(" + c3448.f10904 + this.f7754.substring(1);
        C2819 c2819 = this.f7756;
        int length = c2819.f4836.length;
        C2819 c28110 = new C2819(length + 1);
        c28110.m3063(0, c3448);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            c28110.m3063(i2, c2819.f4836[i]);
            i = i2;
        }
        c28110.f6944 = false;
        C2440 c2440 = new C2440(str, this.f7755, c28110);
        C2440 c2441 = (C2440) f7753.putIfAbsent(str, c2440);
        return c2441 != null ? c2441 : c2440;
    }
}
