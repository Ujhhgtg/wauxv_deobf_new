package p000;

import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3448 implements InterfaceC3450, Comparable {

    public static final ConcurrentHashMap f10865 = new ConcurrentHashMap(10000, 0.75f);

    public static final C3448 f10866;

    public static final C3448 f10867;

    public static final C3448 f10868;

    public static final C3448 f10869;

    public static final C3448 f10870;

    public static final C3448 f10871;

    public static final C3448 f10872;

    public static final C3448 f10873;

    public static final C3448 f10874;

    public static final C3448 f10875;

    public static final C3448 f10876;

    public static final C3448 f10877;

    public static final C3448 f10878;

    public static final C3448 f10879;

    public static final C3448 f10880;

    public static final C3448 f10881;

    public static final C3448 f10882;

    public static final C3448 f10883;

    public static final C3448 f10884;

    public static final C3448 f10885;

    public static final C3448 f10886;

    public static final C3448 f10887;

    public static final C3448 f10888;

    public static final C3448 f10889;

    public static final C3448 f10890;

    public static final C3448 f10891;

    public static final C3448 f10892;

    public static final C3448 f10893;

    public static final C3448 f10894;

    public static final C3448 f10895;

    public static final C3448 f10896;

    public static final C3448 f10897;

    public static final C3448 f10898;

    public static final C3448 f10899;

    public static final C3448 f10900;

    public static final C3448 f10901;

    public static final C3448 f10902;

    public static final C3448 f10903;

    public final String f10904;

    public final int f10905;

    public final int f10906;

    public String f10907;

    public C3448 f10908;

    public C3448 f10909;

    public C3448 f10910;

    static {
        C3448 c3448 = new C3448("Z", 1, -1);
        f10866 = c3448;
        C3448 c3449 = new C3448("B", 2, -1);
        f10867 = c3449;
        C3448 c34410 = new C3448("C", 3, -1);
        f10868 = c34410;
        C3448 c34411 = new C3448("D", 4, -1);
        f10869 = c34411;
        C3448 c34412 = new C3448("F", 5, -1);
        f10870 = c34412;
        C3448 c34413 = new C3448("I", 6, -1);
        f10871 = c34413;
        C3448 c34414 = new C3448("J", 7, -1);
        f10872 = c34414;
        C3448 c34415 = new C3448("S", 8, -1);
        f10873 = c34415;
        f10874 = new C3448("V", 0, -1);
        f10875 = new C3448("<null>", 9, -1);
        f10876 = new C3448("<addr>", 10, -1);
        C3448 c34416 = new C3448("Ljava/lang/annotation/Annotation;", 9, -1);
        C3448 c34417 = new C3448("Ljava/lang/Class;", 9, -1);
        f10877 = c34417;
        C3448 c34418 = new C3448("Ljava/lang/Cloneable;", 9, -1);
        f10878 = c34418;
        C3448 c34419 = new C3448("Ljava/lang/invoke/MethodHandle;", 9, -1);
        f10879 = c34419;
        f10880 = new C3448("Ljava/lang/invoke/MethodType;", 9, -1);
        C3448 c34420 = new C3448("Ljava/lang/invoke/VarHandle;", 9, -1);
        f10881 = c34420;
        C3448 c34421 = new C3448("Ljava/lang/Object;", 9, -1);
        f10882 = c34421;
        C3448 c34422 = new C3448("Ljava/io/Serializable;", 9, -1);
        f10883 = c34422;
        C3448 c34423 = new C3448("Ljava/lang/String;", 9, -1);
        f10884 = c34423;
        C3448 c34424 = new C3448("Ljava/lang/Throwable;", 9, -1);
        f10885 = c34424;
        C3448 c34425 = new C3448("Ljava/lang/Boolean;", 9, -1);
        f10886 = c34425;
        C3448 c34426 = new C3448("Ljava/lang/Byte;", 9, -1);
        f10887 = c34426;
        C3448 c34427 = new C3448("Ljava/lang/Character;", 9, -1);
        f10888 = c34427;
        C3448 c34428 = new C3448("Ljava/lang/Double;", 9, -1);
        f10889 = c34428;
        C3448 c34429 = new C3448("Ljava/lang/Float;", 9, -1);
        f10890 = c34429;
        C3448 c34430 = new C3448("Ljava/lang/Integer;", 9, -1);
        f10891 = c34430;
        C3448 c34431 = new C3448("Ljava/lang/Long;", 9, -1);
        f10892 = c34431;
        C3448 c34432 = new C3448("Ljava/lang/Short;", 9, -1);
        f10893 = c34432;
        C3448 c34433 = new C3448("Ljava/lang/Void;", 9, -1);
        f10894 = c34433;
        C3448 c34434 = new C3448("[Z", 9, -1);
        f10895 = c34434;
        C3448 c34435 = new C3448("[B", 9, -1);
        f10896 = c34435;
        C3448 c34436 = new C3448("[C", 9, -1);
        f10897 = c34436;
        C3448 c34437 = new C3448("[D", 9, -1);
        f10898 = c34437;
        C3448 c34438 = new C3448("[F", 9, -1);
        f10899 = c34438;
        C3448 c34439 = new C3448("[I", 9, -1);
        f10900 = c34439;
        C3448 c34440 = new C3448("[J", 9, -1);
        f10901 = c34440;
        C3448 c34441 = new C3448("[Ljava/lang/Object;", 9, -1);
        f10902 = c34441;
        C3448 c34442 = new C3448("[S", 9, -1);
        f10903 = c34442;
        m4963(c3448);
        m4963(c3449);
        m4963(c34410);
        m4963(c34411);
        m4963(c34412);
        m4963(c34413);
        m4963(c34414);
        m4963(c34415);
        m4963(c34416);
        m4963(c34417);
        m4963(c34418);
        m4963(c34419);
        m4963(c34420);
        m4963(c34421);
        m4963(c34422);
        m4963(c34423);
        m4963(c34424);
        m4963(c34425);
        m4963(c34426);
        m4963(c34427);
        m4963(c34428);
        m4963(c34429);
        m4963(c34430);
        m4963(c34431);
        m4963(c34432);
        m4963(c34433);
        m4963(c34434);
        m4963(c34435);
        m4963(c34436);
        m4963(c34437);
        m4963(c34438);
        m4963(c34439);
        m4963(c34440);
        m4963(c34441);
        m4963(c34442);
    }

    public C3448(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (i < 0 || i >= 11) {
            throw new IllegalArgumentException("bad basicType");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("newAt < -1");
        }
        this.f10904 = str;
        this.f10905 = i;
        this.f10906 = i2;
        this.f10908 = null;
        this.f10909 = null;
        this.f10910 = null;
    }

    public static C3448 m4961(String str) {
        C3448 c3448 = (C3448) f10865.get(str);
        if (c3448 != null) {
            return c3448;
        }
        try {
            char cCharAt = str.charAt(0);
            if (cCharAt == '[') {
                return m4961(str.substring(1)).m4965();
            }
            int length = str.length();
            if (cCharAt == 'L') {
                int i = length - 1;
                if (str.charAt(i) == ';') {
                    for (int i2 = 1; 1 < i; i2++) {
                        char cCharAt2 = str.charAt(1);
                        if (cCharAt2 != '(' && cCharAt2 != ')' && cCharAt2 != '.') {
                            if (cCharAt2 == '/') {
                                if (true) {
                                    throw new IllegalArgumentException("bad descriptor: ".concat(str));
                                }
                            } else if (cCharAt2 == ';' || cCharAt2 == '[') {
                            }
                        }
                        throw new IllegalArgumentException("bad descriptor: ".concat(str));
                    }
                    return m4963(new C3448(str, 9, -1));
                }
            }
            throw new IllegalArgumentException("bad descriptor: ".concat(str));
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("descriptor is empty");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("descriptor == null");
        }
    }

    public static C3448 m4962(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.startsWith("[")) {
            return m4961(str);
        }
        return m4961("L" + str + ';');
    }

    public static C3448 m4963(C3448 c3448) {
        C3448 c3449 = (C3448) f10865.putIfAbsent(c3448.f10904, c3448);
        return c3449 != null ? c3449 : c3448;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f10904.compareTo(((C3448) obj).f10904);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3448)) {
            return false;
        }
        return this.f10904.equals(((C3448) obj).f10904);
    }

    public final int hashCode() {
        return this.f10904.hashCode();
    }

    public final String toString() {
        return this.f10904;
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        switch (this.f10905) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "byte";
            case 3:
                return "char";
            case 4:
                return "double";
            case 5:
                return "float";
            case 6:
                return "int";
            case 7:
                return "long";
            case 8:
                return "short";
            case 9:
                if (!m4970()) {
                    return m4967().replace("/", ".");
                }
                return m4968().mo1214() + "[]";
            default:
                return this.f10904;
        }
    }

    @Override // p000.InterfaceC3450
    public final int mo4533() {
        return this.f10905;
    }

    @Override // p000.InterfaceC3450
    public final boolean mo4534() {
        return false;
    }

    public final C3448 m4964(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newAt < 0");
        }
        boolean zM4974 = m4974();
        String str = this.f10904;
        if (!zM4974) {
            throw new IllegalArgumentException(AbstractC2784.m4757("not a reference type: ", str));
        }
        if (this.f10906 >= 0) {
            throw new IllegalArgumentException(AbstractC2784.m4757("already uninitialized: ", str));
        }
        C3448 c3448 = new C3448("N" + AbstractC1460.m3223(i) + str, 9, i);
        c3448.f10910 = this;
        return m4963(c3448);
    }

    @Override // p000.InterfaceC3450
    public final int mo4536() {
        int i = this.f10905;
        if (i == 1 || i == 2 || i == 3 || i == 6 || i == 8) {
            return 6;
        }
        return i;
    }

    public final C3448 m4965() {
        if (this.f10908 == null) {
            this.f10908 = m4963(new C3448("[" + this.f10904, 9, -1));
        }
        return this.f10908;
    }

    @Override // p000.InterfaceC3450
    public final InterfaceC3450 mo4538() {
        int i = this.f10905;
        return (i == 1 || i == 2 || i == 3 || i == 6 || i == 8) ? f10871 : this;
    }

    public final int m4966() {
        int i = this.f10905;
        return (i == 4 || i == 7) ? 2 : 1;
    }

    public final String m4967() {
        if (this.f10907 == null) {
            boolean zM4974 = m4974();
            String str = this.f10904;
            if (!zM4974) {
                throw new IllegalArgumentException(AbstractC2784.m4757("not an object type: ", str));
            }
            if (str.charAt(0) == '[') {
                this.f10907 = str;
            } else {
                this.f10907 = AbstractC2784.m4744(1, 1, str);
            }
        }
        return this.f10907;
    }

    public final C3448 m4968() {
        if (this.f10909 == null) {
            String str = this.f10904;
            if (str.charAt(0) != '[') {
                throw new IllegalArgumentException("not an array type: " + str);
            }
            this.f10909 = m4961(str.substring(1));
        }
        return this.f10909;
    }

    public final C3448 m4969() {
        C3448 c3448 = this.f10910;
        if (c3448 != null) {
            return c3448;
        }
        throw new IllegalArgumentException("initialized type: " + this.f10904);
    }

    public final boolean m4970() {
        return this.f10904.charAt(0) == '[';
    }

    public final boolean m4971() {
        int i = this.f10905;
        return (i == 4 || i == 7) ? false : true;
    }

    public final boolean m4972() {
        int i = this.f10905;
        return i == 4 || i == 7;
    }

    public final boolean m4973() {
        int i = this.f10905;
        return i == 1 || i == 2 || i == 3 || i == 6 || i == 8;
    }

    public final boolean m4974() {
        return this.f10905 == 9;
    }

    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return this;
    }
}
