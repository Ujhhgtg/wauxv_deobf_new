package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᤞᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2583 extends AbstractC2139 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2581[] f8209;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f8210;

    static {
        new C2583(0);
    }

    public C2583(int i) {
        super(i != 0);
        this.f8209 = new C2581[i];
        this.f8210 = 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2583)) {
            return false;
        }
        C2583 c2583 = (C2583) obj;
        C2581[] c2581Arr = c2583.f8209;
        C2581[] c2581Arr2 = this.f8209;
        int length = c2581Arr2.length;
        if (length != c2581Arr.length || size() != c2583.size()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            C2581 c2581 = c2581Arr2[i];
            Object obj2 = c2581Arr[i];
            if (c2581 != obj2 && (c2581 == null || !c2581.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        C2581[] c2581Arr = this.f8209;
        int length = c2581Arr.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            C2581 c2581 = c2581Arr[i];
            iHashCode = (iHashCode * 31) + (c2581 == null ? 0 : c2581.hashCode());
        }
        return iHashCode;
    }

    public final int size() {
        int i = this.f8210;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (C2581 c2581 : this.f8209) {
            if (c2581 != null) {
                i2++;
            }
        }
        this.f8210 = i2;
        return i2;
    }

    public final String toString() {
        C2581[] c2581Arr = this.f8209;
        StringBuilder sb = new StringBuilder(c2581Arr.length * 25);
        sb.append('{');
        boolean z = false;
        for (C2581 c2581 : c2581Arr) {
            if (c2581 != null) {
                if (z) {
                    sb.append(", ");
                } else {
                    z = true;
                }
                sb.append(c2581);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C2581 m4573(int i) {
        try {
            return this.f8209[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m4574(C2581 c2581) {
        int i;
        C2581 c2582;
        C2581[] c2581Arr = this.f8209;
        m4109();
        if (c2581 == null) {
            throw new NullPointerException("spec == null");
        }
        this.f8210 = -1;
        try {
            int i2 = c2581.f8205;
            c2581Arr[i2] = c2581;
            if (i2 > 0 && (c2582 = c2581Arr[(i = i2 - 1)]) != null && c2582.m4562() == 2) {
                c2581Arr[i] = null;
            }
            if (c2581.m4562() == 2) {
                c2581Arr[i2 + 1] = null;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("spec.getReg() out of range");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m4575(C2581 c2581) {
        try {
            this.f8209[c2581.f8205] = null;
            this.f8210 = -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }
}
