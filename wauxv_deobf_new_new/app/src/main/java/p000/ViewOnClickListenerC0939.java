package p000;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲀᲈᲁᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0939 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3447;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f3448;

    public /* synthetic */ ViewOnClickListenerC0939(Object obj, int i) {
        this.f3447 = i;
        this.f3448 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3447) {
            case 0:
                C0776 c0776 = (C0776) this.f3448;
                ((C0942) c0776.f2881).getClass();
                c0776.m2377(view);
                break;
            case 1:
                MenuItemC1977 itemData = ((AbstractC2157) view).getItemData();
                C0422 c0422 = (C0422) this.f3448;
                if (!c0422.f7178.m3963(itemData, c0422.f7177, 0)) {
                    itemData.setChecked(true);
                }
                break;
            case 2:
                C3472 c3472 = ((Toolbar) this.f3448).f184;
                MenuItemC1977 menuItemC1977 = c3472 == null ? null : c3472.f10918;
                if (menuItemC1977 != null) {
                    menuItemC1977.collapseActionView();
                }
                break;
            default:
                C3476 c3476 = (C3476) this.f3448;
                if (c3476.f10934 != null) {
                    c3476.getClass();
                }
                break;
        }
    }

    public ViewOnClickListenerC0939(C3476 c3476) {
        this.f3447 = 3;
        this.f3448 = c3476;
        c3476.f10924.getContext();
    }
}
