package p000;

import android.graphics.Typeface;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2902 extends AbstractC3681 {

    public final /* synthetic */ AbstractC2209 f9325;

    public final /* synthetic */ C2904 f9326;

    public C2902(C2904 c2904, AbstractC2209 abstractC2209) {
        this.f9326 = c2904;
        this.f9325 = abstractC2209;
    }

    @Override // p000.AbstractC3681
    public final void mo1280(int i) {
        this.f9326.f9343 = true;
        this.f9325.mo1936(i);
    }

    @Override // p000.AbstractC3681
    public final void mo1281(Typeface typeface) {
        C2904 c2904 = this.f9326;
        c2904.f9344 = Typeface.create(typeface, c2904.f9333);
        c2904.f9343 = true;
        this.f9325.mo1937(c2904.f9344, false);
    }
}
