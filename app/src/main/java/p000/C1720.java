package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1720 extends AbstractC1730 {

    public final boolean f5814;

    public final String f5815;

    public C1720(String str, boolean z) {
        this.f5814 = z;
        this.f5815 = str.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1720.class != obj.getClass()) {
            return false;
        }
        C1720 c1720 = (C1720) obj;
        return this.f5814 == c1720.f5814 && AbstractC2207.m4087(this.f5815, c1720.f5815);
    }

    public final int hashCode() {
        return this.f5815.hashCode() + (Boolean.hashCode(this.f5814) * 31);
    }

    @Override // p000.AbstractC1730
    public final String toString() {
        boolean z = this.f5814;
        String str = this.f5815;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC2838.m4824(sb, str);
        return sb.toString();
    }

    @Override // p000.AbstractC1730
    public final String mo3479() {
        return this.f5815;
    }
}
