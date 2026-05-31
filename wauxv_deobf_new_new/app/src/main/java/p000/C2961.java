package p000;

import android.graphics.Typeface;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤞᤝᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2961 extends AbstractC1469 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0738 f9492;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2963 f9493;

    public C2961(C2963 c2963, AbstractC0738 abstractC0738) {
        this.f9493 = c2963;
        this.f9492 = abstractC0738;
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ */
    public final void mo1426(int i) {
        this.f9493.f9510 = true;
        this.f9492.mo2031(i);
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public final void mo1427(Typeface typeface) {
        C2963 c2963 = this.f9493;
        c2963.f9511 = Typeface.create(typeface, c2963.f9500);
        c2963.f9510 = true;
        this.f9492.mo2032(c2963.f9511, false);
    }
}
