package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2903 extends AbstractC2209 {

    public final /* synthetic */ Context f9327;

    public final /* synthetic */ TextPaint f9328;

    public final /* synthetic */ AbstractC2209 f9329;

    public final /* synthetic */ C2904 f9330;

    public C2903(C2904 c2904, Context context, TextPaint textPaint, AbstractC2209 abstractC2209) {
        this.f9330 = c2904;
        this.f9327 = context;
        this.f9328 = textPaint;
        this.f9329 = abstractC2209;
    }

    @Override // p000.AbstractC2209
    public final void mo1936(int i) {
        this.f9329.mo1936(i);
    }

    @Override // p000.AbstractC2209
    public final void mo1937(Typeface typeface, boolean z) {
        this.f9330.m4912(this.f9327, this.f9328, typeface);
        this.f9329.mo1937(typeface, z);
    }
}
