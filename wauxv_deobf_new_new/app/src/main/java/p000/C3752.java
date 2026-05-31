package p000;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲈᤝᤞᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3752 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f11745;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f11746;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C1681 f11747;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f11748;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public InterfaceC1433 f11749;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public InterfaceC1433 f11750;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final LinkedHashSet f11751;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final LinkedHashSet f11752;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2885 f11753;

    public C3752(C2885 c2885, int i, int i2) {
        this.f11753 = c2885;
        this.f11745 = i;
        this.f11746 = i2;
        C1139.m2855();
        C1139.m2855();
        C1139.m2855();
        this.f11751 = new LinkedHashSet();
        this.f11752 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final void m5356(C3752 c3752, Class cls, Class cls2) {
        if (cls == null || cls2 == null) {
            return;
        }
        Class<Object> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(Object.class));
        if (cls.equals(clsM4232 != null ? clsM4232 : Object.class)) {
            return;
        }
        Class clsM2281 = AbstractC0738.m2281(cls);
        Class<?> clsM2282 = AbstractC0738.m2281(cls2);
        ConcurrentHashMap concurrentHashMap = AbstractC0705.f2692;
        if (clsM2282.isAssignableFrom(clsM2281) || clsM2281.isAssignableFrom(clsM2282)) {
            return;
        }
        throw new IllegalStateException(("Hooked method return type match failed, required [" + cls + "] but got [" + cls2 + "]").toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m5357(C3752 c3752) {
        C1681 c1681 = c3752.f11747;
        if (c1681 != null) {
            C3752 c3753 = (C3752) c1681.f5660;
            LinkedHashSet<C3745> linkedHashSet = c3753.f11751;
            if (linkedHashSet.isEmpty()) {
                linkedHashSet = null;
            }
            if (linkedHashSet != null) {
                C2885 c2885 = c3753.f11753;
                for (C3745 c3745 : linkedHashSet) {
                    c3745.f11724.invoke();
                    ArrayList arrayList = C3741.f11709;
                    Objects.toString(c3745.f11723.f5459.getHookedMethod());
                    C3741.m5316();
                }
                try {
                    if (((LinkedHashMap) c2885.f9235).remove(c3753.toString()) != null) {
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
        int i = this.f11745;
        if (i == 1) {
            str = "DEFAULT";
        } else if (i != 2) {
            str = i != 3 ? "null" : "HIGHEST";
        } else {
            str = "LOWEST";
        }
        sb.append(str);
        sb.append(" [members] ");
        sb.append(this.f11752);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3610 m5358(InterfaceC1433 interfaceC1433) {
        this.f11750 = interfaceC1433;
        m5362(false);
        return new C3610();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3610 m5359(InterfaceC1433 interfaceC1433) {
        this.f11749 = interfaceC1433;
        m5362(false);
        return new C3610();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m5360() {
        this.f11747 = new C1681(this);
        m5362(true);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m5361(Throwable th, Member member) {
        String str;
        ArrayList arrayList = C3741.f11709;
        if (member != null) {
            str = "[" + member + "]";
            if (str == null) {
                str = "nothing";
            }
        } else {
            str = "nothing";
        }
        C3741.m5317(4, "Try to hook " + str + " got an exception", th);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m5362(boolean z) {
        Object c2641;
        boolean zBooleanValue;
        Object c2642;
        int i = this.f11746;
        if ((z && i == 2) || i == 3) {
            int i2 = AbstractC3744.f11721[0];
            if (AbstractC1567.f5453[AbstractC2844.m4792(i2)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c2641 = Boolean.TRUE;
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                Boolean bool = (Boolean) c2641;
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
                C2885 c2885 = this.f11753;
                C2343 c2343 = ((C2342) c2885.f9234).f7559;
                if ((c2343 != null ? c2343.f7560 : 0) == 3 || this.f11748) {
                    return;
                }
                this.f11748 = true;
                LinkedHashSet<Member> linkedHashSet = this.f11752;
                if (linkedHashSet.isEmpty()) {
                    linkedHashSet = null;
                }
                if (linkedHashSet == null) {
                    Throwable th2 = new Throwable("Finding Error isSetUpMember [false]");
                    if (i != 1) {
                        return;
                    }
                    C3741.m5317(4, "Hooked Member cannot be null", th2);
                    return;
                }
                for (Member member : linkedHashSet) {
                    try {
                        C3750 c3750M5100 = AbstractC3528.m5100(member, new C3751(c2885, this, member, this.f11745));
                        C3745 c3745 = c3750M5100.f11742;
                        if ((c3745 != null ? c3745.f11723.f5459.getHookedMethod() : null) == null) {
                            throw new IllegalStateException(("Hook Member [" + member + "] failed").toString());
                        }
                        this.f11751.add(c3750M5100.f11742);
                        c2642 = c3750M5100;
                    } catch (Throwable th3) {
                        c2642 = new C2641(th3);
                    }
                    Throwable thM4616 = C2642.m4616(c2642);
                    if (thM4616 != null) {
                        m5361(thM4616, member);
                    }
                }
            }
        }
    }
}
