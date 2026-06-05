package p000;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛴᛱfeyxiexzfᛱ要点脸ᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2285feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f7489Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f7490Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C0709Ujhhgtgfeyxiexzf f7491Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f7492Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public InterfaceC3549feyxiexzfUjhhgtg f7493Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public InterfaceC3549feyxiexzfUjhhgtg f7494Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final LinkedHashSet f7495Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final LinkedHashSet f7496Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final /* synthetic */ C2073feyxiexzfUjhhgtg f7497Ujhhgtgfeyxiexzf;

    public C2285feyxiexzfUjhhgtg(C2073feyxiexzfUjhhgtg c2073feyxiexzfUjhhgtg, int i, int i2) {
        this.f7497Ujhhgtgfeyxiexzf = c2073feyxiexzfUjhhgtg;
        this.f7489Ujhhgtgfeyxiexzf = i;
        this.f7490Ujhhgtgfeyxiexzf = i2;
        C3382feyxiexzfUjhhgtg.m4886Ujhhgtgfeyxiexzf();
        C3382feyxiexzfUjhhgtg.m4886Ujhhgtgfeyxiexzf();
        C3382feyxiexzfUjhhgtg.m4886Ujhhgtgfeyxiexzf();
        this.f7495Ujhhgtgfeyxiexzf = new LinkedHashSet();
        this.f7496Ujhhgtgfeyxiexzf = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final void m3481Ujhhgtgfeyxiexzf(C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtg, Class cls, Class cls2) {
        if (cls == null || cls2 == null) {
            return;
        }
        Class<Object> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Object.class));
        if (cls.equals(clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : Object.class)) {
            return;
        }
        Class clsM2840Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2840Ujhhgtgfeyxiexzf(cls);
        Class<?> clsM2840Ujhhgtgfeyxiexzf2 = AbstractC1265feyxiexzfUjhhgtg.m2840Ujhhgtgfeyxiexzf(cls2);
        ConcurrentHashMap concurrentHashMap = AbstractC2842feyxiexzfUjhhgtg.f9028Ujhhgtgfeyxiexzf;
        if (clsM2840Ujhhgtgfeyxiexzf2.isAssignableFrom(clsM2840Ujhhgtgfeyxiexzf) || clsM2840Ujhhgtgfeyxiexzf.isAssignableFrom(clsM2840Ujhhgtgfeyxiexzf2)) {
            return;
        }
        throw new IllegalStateException(("Hooked method return type match failed, required [" + cls + "] but got [" + cls2 + "]").toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m3482Ujhhgtgfeyxiexzf(C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtg) {
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = c2285feyxiexzfUjhhgtg.f7491Ujhhgtgfeyxiexzf;
        if (c0709Ujhhgtgfeyxiexzf != null) {
            C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtg2 = (C2285feyxiexzfUjhhgtg) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf;
            LinkedHashSet<C2278Ujhhgtgfeyxiexzf> linkedHashSet = c2285feyxiexzfUjhhgtg2.f7495Ujhhgtgfeyxiexzf;
            if (linkedHashSet.isEmpty()) {
                linkedHashSet = null;
            }
            if (linkedHashSet != null) {
                C2073feyxiexzfUjhhgtg c2073feyxiexzfUjhhgtg = c2285feyxiexzfUjhhgtg2.f7497Ujhhgtgfeyxiexzf;
                for (C2278Ujhhgtgfeyxiexzf c2278Ujhhgtgfeyxiexzf : linkedHashSet) {
                    c2278Ujhhgtgfeyxiexzf.f7470Ujhhgtgfeyxiexzf.invoke();
                    ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                    Objects.toString(c2278Ujhhgtgfeyxiexzf.f7469Ujhhgtgfeyxiexzf.f2592Ujhhgtgfeyxiexzf.getHookedMethod());
                    C2290feyxiexzfUjhhgtg.m3496Ujhhgtgfeyxiexzf();
                }
                try {
                    if (((LinkedHashMap) c2073feyxiexzfUjhhgtg.f6811Ujhhgtgfeyxiexzf).remove(c2285feyxiexzfUjhhgtg2.toString()) != null) {
                        throw new ClassCastException();
                    }
                } catch (Throwable unused) {
                }
                linkedHashSet.clear();
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[priority] ");
        int i = this.f7489Ujhhgtgfeyxiexzf;
        if (i == 1) {
            str = "DEFAULT";
        } else if (i != 2) {
            str = i != 3 ? "null" : "HIGHEST";
        } else {
            str = "LOWEST";
        }
        sb.append(str);
        sb.append(" [members] ");
        sb.append(this.f7496Ujhhgtgfeyxiexzf);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C1866feyxiexzfUjhhgtg m3483Ujhhgtgfeyxiexzf(InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        this.f7494Ujhhgtgfeyxiexzf = interfaceC3549feyxiexzfUjhhgtg;
        m3487Ujhhgtgfeyxiexzf(false);
        return new C1866feyxiexzfUjhhgtg();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C1866feyxiexzfUjhhgtg m3484Ujhhgtgfeyxiexzf(InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        this.f7493Ujhhgtgfeyxiexzf = interfaceC3549feyxiexzfUjhhgtg;
        m3487Ujhhgtgfeyxiexzf(false);
        return new C1866feyxiexzfUjhhgtg();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m3485Ujhhgtgfeyxiexzf() {
        this.f7491Ujhhgtgfeyxiexzf = new C0709Ujhhgtgfeyxiexzf(this);
        m3487Ujhhgtgfeyxiexzf(true);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m3486Ujhhgtgfeyxiexzf(Throwable th, Member member) {
        String str;
        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
        if (member != null) {
            str = "[" + member + "]";
            if (str == null) {
                str = "nothing";
            }
        } else {
            str = "nothing";
        }
        C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(4, "Try to hook " + str + " got an exception", th);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m3487Ujhhgtgfeyxiexzf(boolean z) {
        Object c0919feyxiexzfUjhhgtg;
        boolean zBooleanValue;
        Object c0919feyxiexzfUjhhgtg2;
        int i = this.f7490Ujhhgtgfeyxiexzf;
        if ((z && i == 2) || i == 3) {
            int i2 = AbstractC1937feyxiexzfUjhhgtg.f6408Ujhhgtgfeyxiexzf[0];
            if (AbstractC0576Ujhhgtgfeyxiexzf.f2595Ujhhgtgfeyxiexzf[AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i2)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c0919feyxiexzfUjhhgtg = Boolean.TRUE;
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                Boolean bool = (Boolean) c0919feyxiexzfUjhhgtg;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
            } else {
                zBooleanValue = false;
            }
            if (!zBooleanValue) {
                i2 = 2;
            }
            if (i2 != 2) {
                C2073feyxiexzfUjhhgtg c2073feyxiexzfUjhhgtg = this.f7497Ujhhgtgfeyxiexzf;
                C1478feyxiexzfUjhhgtg c1478feyxiexzfUjhhgtg = ((C1477feyxiexzfUjhhgtg) c2073feyxiexzfUjhhgtg.f6810Ujhhgtgfeyxiexzf).f5128Ujhhgtgfeyxiexzf;
                if ((c1478feyxiexzfUjhhgtg != null ? c1478feyxiexzfUjhhgtg.f5129Ujhhgtgfeyxiexzf : 0) == 3 || this.f7492Ujhhgtgfeyxiexzf) {
                    return;
                }
                this.f7492Ujhhgtgfeyxiexzf = true;
                LinkedHashSet<Member> linkedHashSet = this.f7496Ujhhgtgfeyxiexzf;
                if (linkedHashSet.isEmpty()) {
                    linkedHashSet = null;
                }
                if (linkedHashSet == null) {
                    Throwable th2 = new Throwable("Finding Error isSetUpMember [false]");
                    if (i != 1) {
                        return;
                    }
                    C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(4, "Hooked Member cannot be null", th2);
                    return;
                }
                for (Member member : linkedHashSet) {
                    try {
                        C2276Ujhhgtgfeyxiexzf c2276UjhhgtgfeyxiexzfM1886Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1886Ujhhgtgfeyxiexzf(member, new C2284feyxiexzfUjhhgtg(c2073feyxiexzfUjhhgtg, this, member, this.f7489Ujhhgtgfeyxiexzf));
                        C2278Ujhhgtgfeyxiexzf c2278Ujhhgtgfeyxiexzf = c2276UjhhgtgfeyxiexzfM1886Ujhhgtgfeyxiexzf.f7459Ujhhgtgfeyxiexzf;
                        if ((c2278Ujhhgtgfeyxiexzf != null ? c2278Ujhhgtgfeyxiexzf.f7469Ujhhgtgfeyxiexzf.f2592Ujhhgtgfeyxiexzf.getHookedMethod() : null) == null) {
                            throw new IllegalStateException(("Hook Member [" + member + "] failed").toString());
                        }
                        this.f7495Ujhhgtgfeyxiexzf.add(c2276UjhhgtgfeyxiexzfM1886Ujhhgtgfeyxiexzf.f7459Ujhhgtgfeyxiexzf);
                        c0919feyxiexzfUjhhgtg2 = c2276UjhhgtgfeyxiexzfM1886Ujhhgtgfeyxiexzf;
                    } catch (Throwable th3) {
                        c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th3);
                    }
                    Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg2);
                    if (thM2409Ujhhgtgfeyxiexzf != null) {
                        m3486Ujhhgtgfeyxiexzf(thM2409Ujhhgtgfeyxiexzf, member);
                    }
                }
            }
        }
    }
}
