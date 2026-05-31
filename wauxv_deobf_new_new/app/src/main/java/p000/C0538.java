package p000;

import java.util.WeakHashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᤞᲈᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0538 implements Supplier, Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final ThreadLocal f2246;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final WeakHashMap f2247;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public volatile boolean f2248;

    static {
        C0538 c0538 = new C0538();
        c0538.f2248 = true;
        f2246 = ThreadLocal.withInitial(c0538);
        f2247 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static boolean m2050() {
        return ((Boolean) f2246.get()).booleanValue();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f2248 = ((Boolean) obj).booleanValue();
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Boolean.valueOf(this.f2248);
    }
}
