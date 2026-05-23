package p000;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0713 {

    public final int f2714;

    public final Method f2715;

    public C0713(int i, Method method) {
        this.f2714 = i;
        this.f2715 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0713)) {
            return false;
        }
        C0713 c0713 = (C0713) obj;
        return this.f2714 == c0713.f2714 && this.f2715.getName().equals(c0713.f2715.getName());
    }

    public final int hashCode() {
        return this.f2715.getName().hashCode() + (this.f2714 * 31);
    }
}
