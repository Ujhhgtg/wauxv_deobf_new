package p000;

import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᲇᤞᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC2948 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ View f9418;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C2949 f9419;

    public ViewOnLayoutChangeListenerC2948(C2949 c2949, View view) {
        this.f9419 = c2949;
        this.f9418 = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f9418;
        if (view2.getVisibility() == 0) {
            this.f9419.m4944(view2);
        }
    }
}
