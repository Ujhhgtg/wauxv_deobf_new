package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲀᲇᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0890 extends AbstractC0777 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0889 f3329;

    public C0890(C0889 c0889) {
        c0889.m3926();
        this.f3329 = c0889;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0890)) {
            return false;
        }
        return this.f3329.equals(((C0890) obj).f3329);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f3329.f4836);
    }

    public String toString() {
        return this.f3329.m3064("array{", "}", false);
    }

    @Override // p000.InterfaceC3407
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public String mo1214() {
        return this.f3329.m3064("{", "}", true);
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public int mo2267(AbstractC0777 abstractC0777) {
        return this.f3329.compareTo(((C0890) abstractC0777).f3329);
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public boolean mo2268() {
        return false;
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public String mo2269() {
        return "array";
    }
}
