package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1760 {

    public final String f5882;

    public C1760(String str) {
        this.f5882 = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1760) {
            return this.f5882.equals(((C1760) obj).f5882);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5882.hashCode();
    }

    public final String toString() {
        return AbstractC2784.m4752(new StringBuilder("StringHeaderFactory{value='"), this.f5882, "'}");
    }
}
