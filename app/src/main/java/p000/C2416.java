package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᲁᲈᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2416 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f7701;

    public C2416(String str) {
        this.f7701 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2416.class != obj.getClass()) {
            return false;
        }
        return this.f7701.equals(((C2416) obj).f7701);
    }

    public final int hashCode() {
        return this.f7701.hashCode();
    }

    public final String toString() {
        return AbstractC2784.m4752(new StringBuilder("Prop{name='"), this.f7701, "'}");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m4384(C0963 c0963) {
        Object obj = c0963.f3488.get(this);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(this.f7701);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4385(C0963 c0963, Object obj) {
        HashMap map = c0963.f3488;
        if (obj == null) {
            map.remove(this);
        } else {
            map.put(this, obj);
        }
    }
}
