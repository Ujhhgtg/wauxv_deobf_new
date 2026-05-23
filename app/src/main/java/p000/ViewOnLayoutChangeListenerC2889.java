package p000;

import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC2889 implements View.OnLayoutChangeListener {

    public final /* synthetic */ View f9251;

    public final /* synthetic */ C2890 f9252;

    public ViewOnLayoutChangeListenerC2889(C2890 c2890, View view) {
        this.f9252 = c2890;
        this.f9251 = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f9251;
        if (view2.getVisibility() == 0) {
            this.f9252.m4883(view2);
        }
    }
}
