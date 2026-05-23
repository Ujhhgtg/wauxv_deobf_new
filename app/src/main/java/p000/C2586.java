package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2586 implements Serializable {

    public final Object f8192;

    public static final Throwable m4594(Object obj) {
        if (obj instanceof C2585) {
            return ((C2585) obj).f8191;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2586) {
            return AbstractC2207.m4087(this.f8192, ((C2586) obj).f8192);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f8192;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f8192;
        if (obj instanceof C2585) {
            return ((C2585) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
