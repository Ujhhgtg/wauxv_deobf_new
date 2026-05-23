package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3657 extends AbstractC3656 {

    public C1646 f11443;

    public C3657(C3669 c3669, WindowInsets windowInsets) {
        super(c3669, windowInsets);
        this.f11443 = null;
    }

    @Override // p000.C3665
    public C3669 mo5282() {
        return C3669.m5299(null, this.f11433.consumeStableInsets());
    }

    @Override // p000.C3665
    public C3669 mo5283() {
        return C3669.m5299(null, this.f11433.consumeSystemWindowInsets());
    }

    @Override // p000.C3665
    public final C1646 mo5284() {
        if (this.f11443 == null) {
            WindowInsets windowInsets = this.f11433;
            this.f11443 = C1646.m3375(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f11443;
    }

    @Override // p000.C3665
    public boolean mo5285() {
        return this.f11433.isConsumed();
    }

    @Override // p000.C3665
    public void mo5286(C1646 c1646) {
        this.f11443 = c1646;
    }
}
