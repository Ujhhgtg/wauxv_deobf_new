package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲇᤞᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0889 extends AbstractC0775 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0888 f3336;

    public C0889(C0888 c0888) {
        c0888.m4110();
        this.f3336 = c0888;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0889)) {
            return false;
        }
        return this.f3336.equals(((C0889) obj).f3336);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f3336.f4833);
    }

    public String toString() {
        return this.f3336.m3167("array{", "}", false);
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public String mo1360() {
        return this.f3336.m3167("{", "}", true);
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public int mo2369(AbstractC0775 abstractC0775) {
        return this.f3336.compareTo(((C0889) abstractC0775).f3336);
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public boolean mo2370() {
        return false;
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public String mo2371() {
        return "array";
    }
}
