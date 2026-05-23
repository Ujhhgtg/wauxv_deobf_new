package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1952 extends AbstractC1111 {

    public final int f6468;

    public final int f6469;

    public InterfaceC1945 f6470;

    public MenuItemC1946 f6471;

    public C1952(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f6468 = 21;
            this.f6469 = 22;
        } else {
            this.f6468 = 22;
            this.f6469 = 21;
        }
    }

    @Override // p000.AbstractC1111, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1941 c1941;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f6470 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c1941 = (C1941) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1941 = (C1941) adapter;
                headersCount = 0;
            }
            MenuItemC1946 menuItemC1946M3753 = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c1941.getCount()) ? null : c1941.getItem(i);
            MenuItemC1946 menuItemC1946 = this.f6471;
            if (menuItemC1946 != menuItemC1946M3753) {
                MenuC1944 menuC1944 = c1941.f6400;
                if (menuItemC1946 != null) {
                    this.f6470.mo1099(menuC1944, menuItemC1946);
                }
                this.f6471 = menuItemC1946M3753;
                if (menuItemC1946M3753 != null) {
                    this.f6470.mo1107(menuC1944, menuItemC1946M3753);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f6468) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f6469) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C1941) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C1941) adapter).f6400.m3756(false);
        return true;
    }

    public void setHoverListener(InterfaceC1945 interfaceC1945) {
        this.f6470 = interfaceC1945;
    }

    @Override // p000.AbstractC1111, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
