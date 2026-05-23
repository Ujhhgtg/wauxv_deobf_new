package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3472 implements Comparable {

    public final byte f10965;

    public /* synthetic */ C3472(byte b) {
        this.f10965 = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC2207.m4089(this.f10965 & 255, ((C3472) obj).f10965 & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3472) {
            return this.f10965 == ((C3472) obj).f10965;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f10965);
    }

    public final String toString() {
        return String.valueOf(this.f10965 & 255);
    }
}
