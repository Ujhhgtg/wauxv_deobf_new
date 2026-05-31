package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᲇᲁᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2574 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2575 f8194;

    static {
        C2575 c2575 = null;
        try {
            c2575 = (C2575) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c2575 == null) {
            c2575 = new C2575();
        }
        f8194 = c2575;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C0702 m4549(Class cls) {
        f8194.getClass();
        return new C0702(cls);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C3513 m4550(Class cls) {
        C0702 c0702M4549 = m4549(cls);
        List list = Collections.EMPTY_LIST;
        f8194.getClass();
        return new C3513(c0702M4549, false);
    }
}
