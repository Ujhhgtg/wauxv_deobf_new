package p000;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲀᲁᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1574 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ int f5467 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C1927 f5468;

    static {
        new LinkedHashMap();
    }

    public final String toString() {
        return "HookParam(" + super.toString() + ") by " + this.f5468;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object[] m3447() {
        Object[] objArrM3881 = this.f5468.m3881();
        if (objArrM3881 != null) {
            return objArrM3881;
        }
        throw new IllegalStateException("Current hooked Member args is null");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object m3448() {
        Object obj = ((C1571) this.f5468.f6345).f5461.thisObject;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("HookParam instance got null! Is this a static member?");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object m3449() {
        return ((C1572) this.f5468.f6347).mo1342(null, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3450() {
        m3452(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3451() {
        m3452(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3452(Object obj) {
        ((C1572) this.f5468.f6347).mo1342(obj, Boolean.TRUE);
    }
}
