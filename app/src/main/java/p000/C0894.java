package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲁᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0894 extends C0890 {
    @Override // p000.C0890
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0894)) {
            return false;
        }
        return this.f3329.equals(((C0894) obj).f3329);
    }

    @Override // p000.C0890
    public final int hashCode() {
        return Arrays.hashCode(this.f3329.f4836);
    }

    @Override // p000.C0890
    public final String toString() {
        return this.f3329.m3064("call site{", "}", false);
    }

    @Override // p000.C0890, p000.InterfaceC3407
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1214() {
        return this.f3329.m3064("{", "}", true);
    }

    @Override // p000.C0890, p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo2267(AbstractC0777 abstractC0777) {
        return this.f3329.compareTo(((C0894) abstractC0777).f3329);
    }

    @Override // p000.C0890, p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2269() {
        return "call site";
    }
}
