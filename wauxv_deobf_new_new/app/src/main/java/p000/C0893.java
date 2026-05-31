package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲇᲁᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0893 extends C0889 {
    @Override // p000.C0889
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0893)) {
            return false;
        }
        return this.f3336.equals(((C0893) obj).f3336);
    }

    @Override // p000.C0889
    public final int hashCode() {
        return Arrays.hashCode(this.f3336.f4833);
    }

    @Override // p000.C0889
    public final String toString() {
        return this.f3336.m3167("call site{", "}", false);
    }

    @Override // p000.C0889, p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return this.f3336.m3167("{", "}", true);
    }

    @Override // p000.C0889, p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo2369(AbstractC0775 abstractC0775) {
        return this.f3336.compareTo(((C0893) abstractC0775).f3336);
    }

    @Override // p000.C0889, p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2371() {
        return "call site";
    }
}
