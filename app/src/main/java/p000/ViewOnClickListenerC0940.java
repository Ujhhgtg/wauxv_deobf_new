package p000;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᛸᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0940 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3440;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f3441;

    public /* synthetic */ ViewOnClickListenerC0940(int i, Object obj) {
        this.f3440 = i;
        this.f3441 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3440) {
            case 0:
                C0662 c0662 = (C0662) this.f3441;
                ((C0943) c0662.f2532).getClass();
                c0662.m2052(view);
                break;
            case 1:
                MenuItemC1946 itemData = ((AbstractC2123) view).getItemData();
                C0447 c0447 = (C0447) this.f3441;
                if (!c0447.f7054.m3769(itemData, c0447.f7053, 0)) {
                    itemData.setChecked(true);
                }
                break;
            case 2:
                C3414 c3414 = ((Toolbar) this.f3441).f184;
                MenuItemC1946 menuItemC1946 = c3414 == null ? null : c3414.f10757;
                if (menuItemC1946 != null) {
                    menuItemC1946.collapseActionView();
                }
                break;
            default:
                C3418 c3418 = (C3418) this.f3441;
                if (c3418.f10773 != null) {
                    c3418.getClass();
                }
                break;
        }
    }

    public ViewOnClickListenerC0940(C3418 c3418) {
        this.f3440 = 3;
        this.f3441 = c3418;
        c3418.f10763.getContext();
    }
}
