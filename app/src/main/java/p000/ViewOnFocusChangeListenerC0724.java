package p000;

import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0724 implements View.OnFocusChangeListener {

    public final /* synthetic */ int f2740;

    public final /* synthetic */ AbstractC1213 f2741;

    public /* synthetic */ ViewOnFocusChangeListenerC0724(AbstractC1213 abstractC1213, int i) {
        this.f2740 = i;
        this.f2741 = abstractC1213;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f2740) {
            case 0:
                C0727 c0727 = (C0727) this.f2741;
                c0727.m2155(c0727.m2156());
                break;
            default:
                C1118 c1118 = (C1118) this.f2741;
                c1118.f4172 = z;
                c1118.m2830();
                if (!z) {
                    c1118.m2692(false);
                    c1118.f4173 = false;
                }
                break;
        }
    }
}
