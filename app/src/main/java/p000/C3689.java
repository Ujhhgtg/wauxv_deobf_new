package p000;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3689 {

    public final int f11588;

    public final int f11589;

    public C1744 f11590;

    public boolean f11591;

    public InterfaceC1425 f11592;

    public InterfaceC1425 f11593;

    public final LinkedHashSet f11594;

    public final LinkedHashSet f11595;

    public final /* synthetic */ C2825 f11596;

    public C3689(C2825 c2825, int i, int i2) {
        this.f11596 = c2825;
        this.f11588 = i;
        this.f11589 = i2;
        C1133.m2705();
        C1133.m2705();
        C1133.m2705();
        this.f11594 = new LinkedHashSet();
        this.f11595 = new LinkedHashSet();
    }

    public static final void m5348(C3689 c3689, Class cls, Class cls2) {
        if (cls == null || cls2 == null) {
            return;
        }
        Class<Object> clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(Object.class));
        if (cls.equals(clsM2183 != null ? clsM2183 : Object.class)) {
            return;
        }
        Class clsM4078 = AbstractC2205.m4078(cls);
        Class<?> clsM4079 = AbstractC2205.m4078(cls2);
        ConcurrentHashMap concurrentHashMap = AbstractC0710.f2698;
        if (clsM4079.isAssignableFrom(clsM4078) || clsM4078.isAssignableFrom(clsM4079)) {
            return;
        }
        throw new IllegalStateException(("Hooked method return type match failed, required [" + cls + "] but got [" + cls2 + "]").toString());
    }

    public static void m5349(C3689 c3689) {
        C1744 c1744 = c3689.f11590;
        if (c1744 != null) {
            C3689 c36810 = (C3689) c1744.f5843;
            LinkedHashSet<C3682> linkedHashSet = c36810.f11594;
            if (linkedHashSet.isEmpty()) {
                linkedHashSet = null;
            }
            if (linkedHashSet != null) {
                C2825 c2825 = c36810.f11596;
                for (C3682 c3682 : linkedHashSet) {
                    c3682.f11567.invoke();
                    ArrayList arrayList = C3678.f11549;
                    Objects.toString(c3682.f11566.f5428.getHookedMethod());
                    C3678.m5307();
                }
                try {
                    if (((LinkedHashMap) c2825.f9073).remove(c36810.toString()) != null) {
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
        int i = this.f11588;
        if (i == 1) {
            str = "DEFAULT";
        } else if (i != 2) {
            str = i != 3 ? "null" : "HIGHEST";
        } else {
            str = "LOWEST";
        }
        sb.append(str);
        sb.append(" [members] ");
        sb.append(this.f11595);
        return sb.toString();
    }

    public final C3552 m5350(InterfaceC1425 interfaceC1425) {
        this.f11593 = interfaceC1425;
        m5354(false);
        return new C3552();
    }

    public final C3552 m5351(InterfaceC1425 interfaceC1425) {
        this.f11592 = interfaceC1425;
        m5354(false);
        return new C3552();
    }

    public final void applyHook() {
        this.f11590 = new C1744(this);
        m5354(true);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    public final void m5353(Throwable th, Member member) {
        String str;
        ArrayList arrayList = C3678.f11549;
        if (member != null) {
            str = "[" + member + "]";
            if (false) {
                str = "nothing";
            }
        } else {
            str = "nothing";
        }
        C3678.m5308(4, "Try to hook " + str + " got an exception", th);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    public final void m5354(boolean z) {
        Object c2585;
        boolean zBooleanValue;
        Object c2586;
        int i = this.f11589;
        if ((z && i == 2) || i == 3) {
            int i2 = AbstractC0743.f2838[0];
            if (AbstractC1555.f5422[AbstractC2784.m4759(i2)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c2585 = Boolean.TRUE;
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                if (c2585 instanceof C2585) {
                    c2585 = null;
                }
                Boolean bool = (Boolean) c2585;
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
                C2825 c2825 = this.f11596;
                C2310 c2310 = ((C2309) c2825.f9072).f7437;
                if ((c2310 != null ? c2310.f7438 : 0) == 3 || this.f11591) {
                    return;
                }
                this.f11591 = true;
                LinkedHashSet<Member> linkedHashSet = this.f11595;
                if (linkedHashSet.isEmpty()) {
                    linkedHashSet = null;
                }
                if (linkedHashSet == null) {
                    Throwable th2 = new Throwable("Finding Error isSetUpMember [false]");
                    if (true) {
                        return;
                    }
                    C3678.m5308(4, "Hooked Member cannot be null", th2);
                    return;
                }
                for (Member member : linkedHashSet) {
                    try {
                        C3687 c3687M4134 = AbstractC2209.m4134(member, new C3688(c2825, this, member, this.f11588));
                        C3682 c3682 = c3687M4134.f11585;
                        if ((c3682 != null ? c3682.f11566.f5428.getHookedMethod() : null) == null) {
                            throw new IllegalStateException(("Hook Member [" + member + "] failed").toString());
                        }
                        this.f11594.add(c3687M4134.f11585);
                        c2586 = c3687M4134;
                    } catch (Throwable th3) {
                        c2586 = new C2585(th3);
                    }
                    Throwable thM4594 = C2586.m4594(c2586);
                    if (thM4594 != null) {
                        m5353(thM4594, member);
                    }
                }
            }
        }
    }
}
