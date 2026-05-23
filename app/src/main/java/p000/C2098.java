package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2098 {

    public Class f6914;

    public Class f6915;

    public Class f6916;

    public C2098(Class cls, Class cls2, Class cls3) {
        this.f6914 = cls;
        this.f6915 = cls2;
        this.f6916 = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2098.class != obj.getClass()) {
            return false;
        }
        C2098 c2098 = (C2098) obj;
        return this.f6914.equals(c2098.f6914) && this.f6915.equals(c2098.f6915) && AbstractC3522.m5105(this.f6916, c2098.f6916);
    }

    public final int hashCode() {
        int iHashCode = (this.f6915.hashCode() + (this.f6914.hashCode() * 31)) * 31;
        Class cls = this.f6916;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f6914 + ", second=" + this.f6915 + '}';
    }
}
