package p000;

import com.umeng.analytics.pro.g;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0918 extends AbstractC3458 {

    public static final ConcurrentHashMap f3380 = new ConcurrentHashMap(1000, 0.75f);

    public static final C0918 f3381;

    public static final C0918 f3382;

    public static final C0918 f3383;

    public static final C0918 f3384;

    public static final C0918 f3385;

    public static final C0918 f3386;

    public static final C0918 f3387;

    public static final C0918 f3388;

    public static final C0918 f3389;

    public static final C0918 f3390;

    public static final C0918 f3391;

    public static final C0918 f3392;

    public static final C0918 f3393;

    public static final C0918 f3394;

    public static final C0918 f3395;

    public static final C0918 f3396;

    public static final C0918 f3397;

    public static final C0918 f3398;

    public static final C0918 f3399;

    public static final C0918 f3400;

    public final C3448 f3401;

    public C0917 f3402;

    static {
        C0918 c0918 = new C0918(C3448.f10882);
        f3381 = c0918;
        C0918 c0919 = new C0918(C3448.f10886);
        f3382 = c0919;
        C0918 c09110 = new C0918(C3448.f10887);
        f3383 = c09110;
        C0918 c09111 = new C0918(C3448.f10888);
        f3384 = c09111;
        C0918 c09112 = new C0918(C3448.f10889);
        f3385 = c09112;
        C0918 c09113 = new C0918(C3448.f10890);
        f3386 = c09113;
        C0918 c09114 = new C0918(C3448.f10892);
        f3387 = c09114;
        C0918 c09115 = new C0918(C3448.f10891);
        f3388 = c09115;
        C0918 c09116 = new C0918(C3448.f10893);
        f3389 = c09116;
        C0918 c09117 = new C0918(C3448.f10894);
        f3390 = c09117;
        C0918 c09118 = new C0918(C3448.f10895);
        f3391 = c09118;
        C0918 c09119 = new C0918(C3448.f10896);
        f3392 = c09119;
        C0918 c09120 = new C0918(C3448.f10897);
        f3393 = c09120;
        C0918 c09121 = new C0918(C3448.f10898);
        f3394 = c09121;
        C0918 c09122 = new C0918(C3448.f10899);
        f3395 = c09122;
        C0918 c09123 = new C0918(C3448.f10901);
        f3396 = c09123;
        C0918 c09124 = new C0918(C3448.f10900);
        f3397 = c09124;
        C0918 c09125 = new C0918(C3448.f10903);
        f3398 = c09125;
        C0918 c09126 = new C0918(C3448.f10879);
        f3399 = c09126;
        f3400 = new C0918(C3448.f10881);
        m2432(c0918);
        m2432(c0919);
        m2432(c09110);
        m2432(c09111);
        m2432(c09112);
        m2432(c09113);
        m2432(c09114);
        m2432(c09115);
        m2432(c09116);
        m2432(c09117);
        m2432(c09118);
        m2432(c09119);
        m2432(c09120);
        m2432(c09121);
        m2432(c09122);
        m2432(c09123);
        m2432(c09124);
        m2432(c09125);
        m2432(c09126);
    }

    public C0918(C3448 c3448) {
        if (c3448 == null) {
            throw new NullPointerException("type == null");
        }
        if (c3448 == C3448.f10875) {
            throw new UnsupportedOperationException("KNOWN_NULL is not representable");
        }
        this.f3401 = c3448;
        this.f3402 = null;
    }

    public static C0918 m2431(C3448 c3448) {
        C0918 c0918 = new C0918(c3448);
        C0918 c0919 = (C0918) f3380.putIfAbsent(c3448, c0918);
        return c0919 != null ? c0919 : c0918;
    }

    public static void m2432(C0918 c0918) {
        if (f3380.putIfAbsent(c0918.f3401, c0918) == null) {
            return;
        }
        throw new IllegalStateException("Attempted re-init of " + c0918);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0918) {
            return this.f3401 == ((C0918) obj).f3401;
        }
        return false;
    }

    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return C3448.f10877;
    }

    public final int hashCode() {
        return this.f3401.f10904.hashCode();
    }

    public final String toString() {
        return "type{" + this.f3401.mo1214() + '}';
    }

    @Override // p000.InterfaceC3407
    public final String mo1214() {
        return this.f3401.mo1214();
    }

    @Override // p000.AbstractC0777
    public final int mo2267(AbstractC0777 abstractC0777) {
        return this.f3401.f10904.compareTo(((C0918) abstractC0777).f3401.f10904);
    }

    @Override // p000.AbstractC0777
    public final boolean mo2268() {
        return false;
    }

    @Override // p000.AbstractC0777
    public final String mo2269() {
        return "type";
    }

    public final C0917 m2433() {
        if (this.f3402 == null) {
            this.f3402 = new C0917(this.f3401.f10904);
        }
        return this.f3402;
    }
}
