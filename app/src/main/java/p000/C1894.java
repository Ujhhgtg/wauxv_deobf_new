package p000;

import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1894 implements Map.Entry, InterfaceC1737 {

    public final Object f6260;

    public final Object f6261;

    public C1894(Object obj, Object obj2) {
        this.f6260 = obj;
        this.f6261 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1894)) {
            return false;
        }
        C1894 c1894 = (C1894) obj;
        return AbstractC2207.m4087(this.f6260, c1894.f6260) && AbstractC2207.m4087(this.f6261, c1894.f6261);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6260;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6261;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f6260;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f6261;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f6260 + ", value=" + this.f6261 + ')';
    }
}
