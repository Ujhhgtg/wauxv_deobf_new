package p000;

import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᲈᛸᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1920 implements Map.Entry, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f6334;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f6335;

    public C1920(Object obj, Object obj2) {
        this.f6334 = obj;
        this.f6335 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1920)) {
            return false;
        }
        C1920 c1920 = (C1920) obj;
        return AbstractC1469.m3322(this.f6334, c1920.f6334) && AbstractC1469.m3322(this.f6335, c1920.f6335);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6334;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6335;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f6334;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f6335;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f6334 + ", value=" + this.f6335 + ')';
    }
}
