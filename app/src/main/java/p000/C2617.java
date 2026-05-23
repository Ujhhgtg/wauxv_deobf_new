package p000;

import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2617 implements Map.Entry {

    public final Object f8496;

    public final Object f8497;

    public C2617 f8498;

    public C2617 f8499;

    public C2617(Object obj, Object obj2) {
        this.f8496 = obj;
        this.f8497 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2617)) {
            return false;
        }
        C2617 c2617 = (C2617) obj;
        return this.f8496.equals(c2617.f8496) && this.f8497.equals(c2617.f8497);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8496;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8497;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f8496.hashCode() ^ this.f8497.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f8496 + "=" + this.f8497;
    }
}
