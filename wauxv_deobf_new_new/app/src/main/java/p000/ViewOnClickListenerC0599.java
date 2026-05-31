package p000;

import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᲁᲈᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0599 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2432 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0601 f2433;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1496 f2434;

    public /* synthetic */ ViewOnClickListenerC0599(C0601 c0601, C1496 c1496) {
        this.f2433 = c0601;
        this.f2434 = c1496;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2432) {
            case 0:
                C1496 c1496 = this.f2434;
                if (c1496.m3421() == EnumC1497.f5303) {
                    this.f2433.f2436.invoke(c1496);
                }
                break;
            default:
                this.f2433.f2437.invoke(this.f2434);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0599(C1496 c1496, C0601 c0601) {
        this.f2434 = c1496;
        this.f2433 = c0601;
    }
}
