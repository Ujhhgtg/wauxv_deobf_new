package p000;

import com.umeng.analytics.pro.g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᲀᲇᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1967 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6494;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1959 f6495;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1958 f6496;

    public /* synthetic */ C1967(AbstractC1959 abstractC1959, C1958 c1958, int i) {
        this.f6494 = i;
        this.f6495 = abstractC1959;
        this.f6496 = c1958;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        C1012 c1012;
        C1012 c1013;
        Object c2641;
        C1012 c1014;
        int i = this.f6494;
        int i2 = 6;
        int i3 = 17;
        C1224 c1224 = AbstractC1968.f6497;
        C1958 c1958 = this.f6496;
        AbstractC1959 abstractC1959 = this.f6495;
        switch (i) {
            case 0:
                Class cls = (Class) obj;
                C2004 c2004 = (C2004) abstractC1959;
                C0160 c0160 = c1958.f6471;
                if (c0160 != null) {
                    c1224 = c0160;
                }
                C1333 c1333M3940 = AbstractC1968.m3940(AbstractC1968.m3940(AbstractC1968.m3940(AbstractC1968.m3940(AbstractC1968.m3940(AbstractC1968.m3940(AbstractC1968.m3931(AbstractC1968.m3927(new C0281(c1224.mo1341(cls), 1), c2004, c1958), c2004, c1958), c1958, "returnType", c2004.f6648, new C1962(c1958, 0)), c1958, "returnTypeCondition", c2004.f6649, new C0192(15)), c1958, "isBridge", null, new C0192(i3)), c1958, "isBridgeNot", null, new C0192(25)), c1958, "isDefault", null, new C1964(2)), c1958, "isDefaultNot", null, new C1964(3));
                C0702 c0702M4549 = AbstractC2574.m4549(Method.class);
                if (c0702M4549.equals(AbstractC2574.m4549(Method.class))) {
                    c1012 = new C1012(c1333M3940, new C1966(c1958, 6), 2);
                } else if (c0702M4549.equals(AbstractC2574.m4549(Constructor.class))) {
                    c1012 = new C1012(c1333M3940, new C1966(c1958, 7), 2);
                } else {
                    if (!c0702M4549.equals(AbstractC2574.m4549(Field.class))) {
                        throw new IllegalStateException(("Unsupported member type: " + c1333M3940).toString());
                    }
                    c1012 = new C1012(c1333M3940, new C1966(c1958, 8), 2);
                }
                return AbstractC2713.m4689(c1012);
            case 1:
                Class cls2 = (Class) obj;
                C0795 c0795 = (C0795) abstractC1959;
                C0160 c0161 = c1958.f6471;
                if (c0161 != null) {
                    c1224 = c0161;
                }
                C1333 c1333M3931 = AbstractC1968.m3931(AbstractC1968.m3927(new C0281(c1224.mo1340(cls2), 1), c0795, c1958), c0795, c1958);
                C0702 c0702M45410 = AbstractC2574.m4549(Constructor.class);
                if (c0702M45410.equals(AbstractC2574.m4549(Method.class))) {
                    c1013 = new C1012(c1333M3931, new C1966(c1958, 0), 2);
                } else if (c0702M45410.equals(AbstractC2574.m4549(Constructor.class))) {
                    c1013 = new C1012(c1333M3931, new C1966(c1958, 1), 2);
                } else {
                    if (!c0702M45410.equals(AbstractC2574.m4549(Field.class))) {
                        throw new IllegalStateException(("Unsupported member type: " + c1333M3931).toString());
                    }
                    c1013 = new C1012(c1333M3931, new C1966(c1958, 2), 2);
                }
                return AbstractC2713.m4689(c1013);
            default:
                Class cls3 = (Class) obj;
                C1300 c1300 = (C1300) abstractC1959;
                C0160 c0162 = c1958.f6471;
                if (c0162 != null) {
                    c1224 = c0162;
                }
                try {
                    c2641 = AbstractC0280.m1535(cls3.getDeclaredFields());
                    break;
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                Throwable thM4616 = C2642.m4616(c2641);
                if (thM4616 != null) {
                    C2933 c2933 = C1770.f5907;
                    C1770.m3652("Failed to get declared fields in " + c1224 + " because got an exception.", thM4616);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                Object obj2 = (List) c2641;
                if (obj2 == null) {
                    obj2 = C1191.f4326;
                }
                C1333 c1333M3941 = AbstractC1968.m3940(AbstractC1968.m3940(AbstractC1968.m3940(AbstractC1968.m3940(AbstractC1968.m3940(AbstractC1968.m3940(AbstractC1968.m3927(new C0281(obj2, 1), c1300, c1958), c1958, "isEnumConstant", null, new C1964(4)), c1958, "isEnumConstantNot", null, new C1964(5)), c1958, g.y, c1300.f4724, new C1962(c1958, i3)), c1958, "typeCondition", c1300.f4725, new C1964(i2)), c1958, "genericType", null, new C0192(8)), c1958, "genericTypeCondition", null, new C0192(9));
                C0702 c0702M45411 = AbstractC2574.m4549(Field.class);
                if (c0702M45411.equals(AbstractC2574.m4549(Method.class))) {
                    c1014 = new C1012(c1333M3941, new C1966(c1958, 3), 2);
                } else if (c0702M45411.equals(AbstractC2574.m4549(Constructor.class))) {
                    c1014 = new C1012(c1333M3941, new C1966(c1958, 4), 2);
                } else {
                    if (!c0702M45411.equals(AbstractC2574.m4549(Field.class))) {
                        throw new IllegalStateException(("Unsupported member type: " + c1333M3941).toString());
                    }
                    c1014 = new C1012(c1333M3941, new C1966(c1958, 5), 2);
                }
                return AbstractC2713.m4689(c1014);
        }
    }
}
