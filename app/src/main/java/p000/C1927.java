package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1927 {

    public final Class f6364;

    public final Object f6365;

    public C0152 f6366 = null;

    public boolean f6367 = false;

    public int f6368 = 1;

    public C1927(Class cls, Object obj) {
        this.f6364 = cls;
        this.f6365 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1927)) {
            return false;
        }
        C1927 c1927 = (C1927) obj;
        return AbstractC2207.m4087(this.f6364, c1927.f6364) && AbstractC2207.m4087(this.f6365, c1927.f6365) && AbstractC2207.m4087(this.f6366, c1927.f6366) && this.f6367 == c1927.f6367 && this.f6368 == c1927.f6368;
    }

    public final int hashCode() {
        int iHashCode = this.f6364.hashCode() * 31;
        Object obj = this.f6365;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C0152 c0152 = this.f6366;
        return AbstractC2784.m4759(this.f6368) + ((Boolean.hashCode(this.f6367) + ((iHashCode2 + (c0152 != null ? c0152.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        C0152 c0152 = this.f6366;
        boolean z = this.f6367;
        int i = this.f6368;
        StringBuilder sb = new StringBuilder("Configuration(declaringClass=");
        sb.append(this.f6364);
        sb.append(", memberInstance=");
        sb.append(this.f6365);
        sb.append(", processorResolver=");
        sb.append(c0152);
        sb.append(", superclass=");
        sb.append(z);
        sb.append(", optional=");
        if (i == 1) {
            str = "NO";
        } else if (i != 2) {
            str = i != 3 ? "null" : "SILENT";
        } else {
            str = "NOTICE";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
