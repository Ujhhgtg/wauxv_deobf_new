package p000;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᤝᲈᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1563 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ int f5437 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C1676 f5438;

    static {
        new LinkedHashMap();
    }

    public final String toString() {
        return "HookParam(" + super.toString() + ") by " + this.f5438;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m3266() {
        Object c2585;
        Object[] objArrM3267 = m3267();
        Object[] objArrCopyOf = Arrays.copyOf(objArrM3267, objArrM3267.length);
        C1676 c1676 = this.f5438;
        Member member = ((C1559) c1676.f5658).f5430.method;
        if (member == null) {
            throw new IllegalStateException("Current hooked Member is null");
        }
        try {
            c2585 = C1133.m2711(member, ((C1559) c1676.f5661).f5430.thisObject, objArrCopyOf);
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        Throwable thM4594 = C2586.m4594(c2585);
        if (thM4594 != null) {
            String message = thM4594.getMessage();
            if (message != null && AbstractC2841.m4828(message.toLowerCase(Locale.ROOT), "wrong number of arguments", false)) {
                String message2 = thM4594.getMessage();
                if (message2 == null) {
                    message2 = thM4594.toString();
                }
                throw new IllegalStateException(message2.toString());
            }
            ArrayList arrayList = C3678.f11549;
            C3678.m5308(4, "Invoke original Member [" + member + "] failed", thM4594);
        }
        if (c2585 instanceof C2585) {
            return null;
        }
        return c2585;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object[] m3267() {
        Object[] objArrM3406 = this.f5438.m3406();
        if (objArrM3406 != null) {
            return objArrM3406;
        }
        throw new IllegalStateException("Current hooked Member args is null");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object m3268() {
        Object obj = ((C1559) this.f5438.f5661).f5430.thisObject;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("HookParam instance got null! Is this a static member?");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object m3269() {
        return ((C1560) this.f5438.f5659).mo1196(null, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3270() {
        m3272(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3271() {
        m3272(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3272(Object obj) {
        ((C1560) this.f5438.f5659).mo1196(obj, Boolean.TRUE);
    }
}
