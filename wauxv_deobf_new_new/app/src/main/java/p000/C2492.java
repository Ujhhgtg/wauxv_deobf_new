package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲇᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2492 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final ConcurrentHashMap f7897 = new ConcurrentHashMap(10000, 0.75f);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f7898;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C3505 f7899;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2879 f7900;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C2879 f7901;

    public C2492(String str, C3505 c3505, C2879 c2879) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (c3505 == null) {
            throw new NullPointerException("returnType == null");
        }
        this.f7898 = str;
        this.f7899 = c3505;
        this.f7900 = c2879;
        this.f7901 = null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C2492 m4440(String str) {
        int i;
        C2492 c2492 = (C2492) f7897.get(str);
        if (c2492 != null) {
            return c2492;
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
        C3505[] c3505Arr = new C3505[i2];
        int i4 = 0;
        int i5 = 1;
        while (true) {
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 == ')') {
                String strSubstring = str.substring(i5 + 1);
                ConcurrentHashMap concurrentHashMap = C3505.f11025;
                try {
                    C3505 c3505M5023 = strSubstring.equals("V") ? C3505.f11034 : C3505.m5023(strSubstring);
                    C2879 c2879 = new C2879(i4);
                    for (int i6 = 0; i6 < i4; i6++) {
                        c2879.m3166(i6, c3505Arr[i6]);
                    }
                    return new C2492(str, c3505M5023, c2879);
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
            c3505Arr[i4] = C3505.m5023(str.substring(i5, i));
            i4++;
            i5 = i;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C2492 m4441(String str) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        ConcurrentHashMap concurrentHashMap = f7897;
        C2492 c2492 = (C2492) concurrentHashMap.get(str);
        if (c2492 != null) {
            return c2492;
        }
        C2492 c2492M4440 = m4440(str);
        C2492 c2493 = (C2492) concurrentHashMap.putIfAbsent(c2492M4440.f7898, c2492M4440);
        return c2493 != null ? c2493 : c2492M4440;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2492)) {
            return false;
        }
        return this.f7898.equals(((C2492) obj).f7898);
    }

    public final int hashCode() {
        return this.f7898.hashCode();
    }

    public final String toString() {
        return this.f7898;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C2492 c2492) {
        if (this != c2492) {
            C3505 c3505 = c2492.f7899;
            C2879 c2879 = c2492.f7900;
            int iCompareTo = this.f7899.f11064.compareTo(c3505.f11064);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            C2879 c28710 = this.f7900;
            int length = c28710.f4833.length;
            int length2 = c2879.f4833.length;
            int iMin = Math.min(length, length2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo2 = ((C3505) c28710.m3165(i)).f11064.compareTo(((C3505) c2879.m3165(i)).f11064);
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
    public final C2879 m4443() {
        if (this.f7901 == null) {
            C2879 c2879 = this.f7900;
            int length = c2879.f4833.length;
            C2879 c28710 = new C2879(length);
            boolean z = false;
            for (int i = 0; i < length; i++) {
                C3505 c3505 = (C3505) c2879.m3165(i);
                if (c3505.m5035()) {
                    c3505 = C3505.f11031;
                    z = true;
                }
                c28710.m3166(i, c3505);
            }
            if (z) {
                c2879 = c28710;
            }
            this.f7901 = c2879;
        }
        return this.f7901;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2492 m4444(C3505 c3505) {
        String str = "(" + c3505.f11064 + this.f7898.substring(1);
        C2879 c2879 = this.f7900;
        int length = c2879.f4833.length;
        C2879 c28710 = new C2879(length + 1);
        c28710.m3166(0, c3505);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            c28710.m3166(i2, c2879.f4833[i]);
            i = i2;
        }
        c28710.f7068 = false;
        C2492 c2492 = new C2492(str, this.f7899, c28710);
        C2492 c2493 = (C2492) f7897.putIfAbsent(str, c2492);
        return c2493 != null ? c2493 : c2492;
    }
}
