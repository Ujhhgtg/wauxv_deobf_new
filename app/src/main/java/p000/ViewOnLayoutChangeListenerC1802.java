package p000;

import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᛸᲁᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1802 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6016;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1803 f6017;

    public /* synthetic */ ViewOnLayoutChangeListenerC1802(C1803 c1803, int i) {
        this.f6016 = i;
        this.f6017 = c1803;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f6016) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                this.f6017.m3553(false);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                C1803 c1803 = this.f6017;
                C1803.m3550(c1803);
                c1803.m3553(false);
                break;
        }
    }
}
