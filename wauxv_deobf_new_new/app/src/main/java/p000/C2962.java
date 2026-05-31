package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤞᤝᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2962 extends AbstractC0738 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ Context f9494;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ TextPaint f9495;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0738 f9496;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ C2963 f9497;

    public C2962(C2963 c2963, Context context, TextPaint textPaint, AbstractC0738 abstractC0738) {
        this.f9497 = c2963;
        this.f9494 = context;
        this.f9495 = textPaint;
        this.f9496 = abstractC0738;
    }

    @Override // p000.AbstractC0738
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final void mo2031(int i) {
        this.f9496.mo2031(i);
    }

    @Override // p000.AbstractC0738
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo2032(Typeface typeface, boolean z) {
        this.f9497.m4974(this.f9494, this.f9495, typeface);
        this.f9496.mo2032(typeface, z);
    }
}
