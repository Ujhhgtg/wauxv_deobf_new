package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤞᤝᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0708 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f2708;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Method f2709;

    public C0708(int i, Method method) {
        this.f2708 = i;
        this.f2709 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0708)) {
            return false;
        }
        C0708 c0708 = (C0708) obj;
        return this.f2708 == c0708.f2708 && this.f2709.getName().equals(c0708.f2709.getName());
    }

    public final int hashCode() {
        return this.f2709.getName().hashCode() + (this.f2708 * 31);
    }
}
