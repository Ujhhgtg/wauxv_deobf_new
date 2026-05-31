package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲀᲁᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1983 extends AbstractC1117 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final int f6573;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final int f6574;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public InterfaceC1976 f6575;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public MenuItemC1977 f6576;

    public C1983(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f6573 = 21;
            this.f6574 = 22;
        } else {
            this.f6573 = 22;
            this.f6574 = 21;
        }
    }

    @Override // p000.AbstractC1117, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1972 c1972;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f6575 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c1972 = (C1972) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1972 = (C1972) adapter;
                headersCount = 0;
            }
            MenuItemC1977 menuItemC1977M3947 = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c1972.getCount()) ? null : c1972.getItem(i);
            MenuItemC1977 menuItemC1977 = this.f6576;
            if (menuItemC1977 != menuItemC1977M3947) {
                MenuC1975 menuC1975 = c1972.f6505;
                if (menuItemC1977 != null) {
                    this.f6575.mo1245(menuC1975, menuItemC1977);
                }
                this.f6576 = menuItemC1977M3947;
                if (menuItemC1977M3947 != null) {
                    this.f6575.mo1253(menuC1975, menuItemC1977M3947);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f6573) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f6574) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C1972) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C1972) adapter).f6505.m3950(false);
        return true;
    }

    public void setHoverListener(InterfaceC1976 interfaceC1976) {
        this.f6575 = interfaceC1976;
    }

    @Override // p000.AbstractC1117, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
