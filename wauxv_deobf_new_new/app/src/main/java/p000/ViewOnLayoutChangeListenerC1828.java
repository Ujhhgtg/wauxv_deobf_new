package p000;

import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᲈᲁᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1828 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6084;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1830 f6085;

    public /* synthetic */ ViewOnLayoutChangeListenerC1828(C1830 c1830, int i) {
        this.f6084 = i;
        this.f6085 = c1830;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f6084) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                this.f6085.m3729(false);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                C1830 c1830 = this.f6085;
                C1830.m3723(c1830);
                c1830.m3729(false);
                break;
        }
    }
}
