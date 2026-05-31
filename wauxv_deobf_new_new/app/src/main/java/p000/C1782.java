package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᛸᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1782 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f5935;

    public C1782(String str) {
        this.f5935 = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1782) {
            return this.f5935.equals(((C1782) obj).f5935);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5935.hashCode();
    }

    public final String toString() {
        return AbstractC2844.m4786(new StringBuilder("StringHeaderFactory{value='"), this.f5935, "'}");
    }
}
