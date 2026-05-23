package p000;

import android.graphics.Typeface;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᤝᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0556 extends AbstractC2209 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Typeface f2281;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0094 f2282;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f2283;

    public C0556(C0094 c0094, Typeface typeface) {
        this.f2281 = typeface;
        this.f2282 = c0094;
    }

    @Override // p000.AbstractC2209
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void mo1936(int i) {
        if (this.f2283) {
            return;
        }
        C0738 c0738 = (C0738) this.f2282.f1049;
        if (c0738.m2167(this.f2281)) {
            c0738.m2165(false);
        }
    }

    @Override // p000.AbstractC2209
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void mo1937(Typeface typeface, boolean z) {
        if (this.f2283) {
            return;
        }
        C0738 c0738 = (C0738) this.f2282.f1049;
        if (c0738.m2167(typeface)) {
            c0738.m2165(false);
        }
    }
}
