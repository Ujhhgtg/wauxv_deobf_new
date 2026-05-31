package p000;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᲈᛸᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1824 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6068;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6069;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ FrameLayout f6070;

    public /* synthetic */ ViewOnClickListenerC1824(FrameLayout frameLayout, int i, int i2) {
        this.f6068 = i2;
        this.f6070 = frameLayout;
        this.f6069 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6068) {
            case 0:
                ((C1830) this.f6070).setSelectedTabIndex(this.f6069);
                break;
            default:
                InterfaceC1433 interfaceC1433 = ((AbstractC1997) this.f6070).f6632;
                if (interfaceC1433 != null) {
                    interfaceC1433.invoke(Integer.valueOf(this.f6069));
                }
                break;
        }
    }
}
