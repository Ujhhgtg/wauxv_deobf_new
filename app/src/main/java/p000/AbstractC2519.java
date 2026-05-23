package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2519 {

    public static final C2520 f8046;

    static {
        C2520 c2520 = null;
        try {
            c2520 = (C2520) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c2520 == null) {
            c2520 = new C2520();
        }
        f8046 = c2520;
    }

    public static C0707 classToKClass(Class cls) {
        
        return new C0707(cls);
    }

    public static C3457 m4528(Class cls) {
        C0707 c0707M4527 = classToKClass(cls);
        List list = Collections.EMPTY_LIST;
        
        return new C3457(c0707M4527, false);
    }
}
