package p000;

import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᤝᛸᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2678 implements Map.Entry {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f8661;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f8662;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C2678 f8663;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C2678 f8664;

    public C2678(Object obj, Object obj2) {
        this.f8661 = obj;
        this.f8662 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2678)) {
            return false;
        }
        C2678 c2678 = (C2678) obj;
        return this.f8661.equals(c2678.f8661) && this.f8662.equals(c2678.f8662);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8661;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8662;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f8661.hashCode() ^ this.f8662.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f8661 + "=" + this.f8662;
    }
}
