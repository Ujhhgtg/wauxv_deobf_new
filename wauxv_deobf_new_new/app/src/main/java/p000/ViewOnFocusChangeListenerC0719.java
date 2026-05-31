package p000;

import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲁᲇᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0719 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2734;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1214 f2735;

    public /* synthetic */ ViewOnFocusChangeListenerC0719(AbstractC1214 abstractC1214, int i) {
        this.f2734 = i;
        this.f2735 = abstractC1214;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f2734) {
            case 0:
                C0722 c0722 = (C0722) this.f2735;
                c0722.m2247(c0722.m2248());
                break;
            default:
                C1124 c1124 = (C1124) this.f2735;
                c1124.f4183 = z;
                c1124.m2952();
                if (!z) {
                    c1124.m2841(false);
                    c1124.f4184 = false;
                }
                break;
        }
    }
}
