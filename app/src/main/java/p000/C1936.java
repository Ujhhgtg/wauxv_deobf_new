package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᲀᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1936 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6389;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1928 f6390;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1927 f6391;

    public /* synthetic */ C1936(AbstractC1928 abstractC1928, C1927 c1927, int i) {
        this.f6389 = i;
        this.f6390 = abstractC1928;
        this.f6391 = c1927;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        C1009 c1009;
        C1009 c10010;
        Object c2585;
        C1009 c10011;
        int i = this.f6389;
        int i2 = 6;
        int i3 = 17;
        C1227 c1227 = AbstractC1937.f6392;
        C1927 c1927 = this.f6391;
        AbstractC1928 abstractC1928 = this.f6390;
        switch (i) {
            case 0:
                Class cls = (Class) obj;
                MethodResolver c1973 = (MethodResolver) abstractC1928;
                C0152 c0152 = c1927.f6366;
                if (c0152 != null) {
                    c1227 = c0152;
                }
                C1331 c1331M3746 = AbstractC1937.m3746(AbstractC1937.m3746(AbstractC1937.m3746(AbstractC1937.m3746(AbstractC1937.m3746(AbstractC1937.m3746(AbstractC1937.m3737(AbstractC1937.m3733(new C0271(1, c1227.mo1195(cls)), c1973, c1927), c1973, c1927), c1927, "returnType", c1973.returnType, new C1931(c1927, 0)), c1927, "returnTypeCondition", c1973.f6544, new C0184(15)), c1927, "isBridge", null, new C0184(17)), c1927, "isBridgeNot", null, new C0184(25)), c1927, "isDefault", null, new C1933(2)), c1927, "isDefaultNot", null, new C1933(3));
                C0707 c0707M4527 = AbstractC2519.classToKClass(Method.class);
                if (c0707M4527.equals(AbstractC2519.classToKClass(Method.class))) {
                    c1009 = new C1009(c1331M3746, new C1935(c1927, 6), 2);
                } else if (c0707M4527.equals(AbstractC2519.classToKClass(Constructor.class))) {
                    c1009 = new C1009(c1331M3746, new C1935(c1927, 7), 2);
                } else {
                    if (!c0707M4527.equals(AbstractC2519.classToKClass(Field.class))) {
                        throw new IllegalStateException(("Unsupported member type: " + c1331M3746).toString());
                    }
                    c1009 = new C1009(c1331M3746, new C1935(c1927, 8), 2);
                }
                return AbstractC2652.m4655(c1009);
            case 1:
                Class cls2 = (Class) obj;
                C0796 c0796 = (C0796) abstractC1928;
                C0152 c0153 = c1927.f6366;
                if (c0153 != null) {
                    c1227 = c0153;
                }
                C1331 c1331M3737 = AbstractC1937.m3737(AbstractC1937.m3733(new C0271(1, c1227.mo1194(cls2)), c0796, c1927), c0796, c1927);
                C0707 c0707M4528 = AbstractC2519.classToKClass(Constructor.class);
                if (c0707M4528.equals(AbstractC2519.classToKClass(Method.class))) {
                    c10010 = new C1009(c1331M3737, new C1935(c1927, 0), 2);
                } else if (c0707M4528.equals(AbstractC2519.classToKClass(Constructor.class))) {
                    c10010 = new C1009(c1331M3737, new C1935(c1927, 1), 2);
                } else {
                    if (!c0707M4528.equals(AbstractC2519.classToKClass(Field.class))) {
                        throw new IllegalStateException(("Unsupported member type: " + c1331M3737).toString());
                    }
                    c10010 = new C1009(c1331M3737, new C1935(c1927, 2), 2);
                }
                return AbstractC2652.m4655(c10010);
            default:
                Class cls3 = (Class) obj;
                C1299 c1299 = (C1299) abstractC1928;
                C0152 c0154 = c1927.f6366;
                if (c0154 != null) {
                    c1227 = c0154;
                }
                try {
                    c2585 = AbstractC0270.m1389(cls3.getDeclaredFields());
                    break;
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                Throwable thM4594 = C2586.m4594(c2585);
                if (thM4594 != null) {
                    C2873 c2873 = C1747.f5845;
                    C1747.m3496("Failed to get declared fields in " + c1227 + " because got an exception.", thM4594);
                }
                if (true) {
                    c2585 = null;
                }
                Object obj2 = (List) c2585;
                if (true) {
                    obj2 = C1189.f4329;
                }
                C1331 c1331M3747 = AbstractC1937.m3746(AbstractC1937.m3746(AbstractC1937.m3746(AbstractC1937.m3746(AbstractC1937.m3746(AbstractC1937.m3746(AbstractC1937.m3733(new C0271(1, obj2), c1299, c1927), c1927, "isEnumConstant", null, new C1933(4)), c1927, "isEnumConstantNot", null, new C1933(5)), c1927, "type", c1299.fieldType, new C1931(c1927, 17)), c1927, "typeCondition", c1299.f4726, new C1933(6)), c1927, "genericType", null, new C0184(8)), c1927, "genericTypeCondition", null, new C0184(9));
                C0707 c0707M4529 = AbstractC2519.classToKClass(Field.class);
                if (c0707M4529.equals(AbstractC2519.classToKClass(Method.class))) {
                    c10011 = new C1009(c1331M3747, new C1935(c1927, 3), 2);
                } else if (c0707M4529.equals(AbstractC2519.classToKClass(Constructor.class))) {
                    c10011 = new C1009(c1331M3747, new C1935(c1927, 4), 2);
                } else {
                    if (!c0707M4529.equals(AbstractC2519.classToKClass(Field.class))) {
                        throw new IllegalStateException(("Unsupported member type: " + c1331M3747).toString());
                    }
                    c10011 = new C1009(c1331M3747, new C1935(c1927, 5), 2);
                }
                return AbstractC2652.m4655(c10011);
        }
    }
}
