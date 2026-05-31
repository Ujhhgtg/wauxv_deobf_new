package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᲇᲁᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2469 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f7845;

    public C2469(String str) {
        this.f7845 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2469.class != obj.getClass()) {
            return false;
        }
        return this.f7845.equals(((C2469) obj).f7845);
    }

    public final int hashCode() {
        return this.f7845.hashCode();
    }

    public final String toString() {
        return AbstractC2844.m4786(new StringBuilder("Prop{name='"), this.f7845, "'}");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m4405(C0967 c0967) {
        Object obj = c0967.f3505.get(this);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(this.f7845);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4406(C0967 c0967, Object obj) {
        HashMap map = c0967.f3505;
        if (obj == null) {
            map.remove(this);
        } else {
            map.put(this, obj);
        }
    }
}
