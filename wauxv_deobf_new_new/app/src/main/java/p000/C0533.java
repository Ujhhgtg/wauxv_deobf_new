package p000;

import android.graphics.Typeface;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᲇᲀᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0533 extends AbstractC0738 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Typeface f2237;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0102 f2238;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f2239;

    public C0533(C0102 c0102, Typeface typeface) {
        this.f2237 = typeface;
        this.f2238 = c0102;
    }

    @Override // p000.AbstractC0738
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void mo2031(int i) {
        if (this.f2239) {
            return;
        }
        C0733 c0733 = (C0733) this.f2238.f1117;
        if (c0733.m2259(this.f2237)) {
            c0733.m2257(false);
        }
    }

    @Override // p000.AbstractC0738
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void mo2032(Typeface typeface, boolean z) {
        if (this.f2239) {
            return;
        }
        C0733 c0733 = (C0733) this.f2238.f1117;
        if (c0733.m2259(typeface)) {
            c0733.m2257(false);
        }
    }
}
