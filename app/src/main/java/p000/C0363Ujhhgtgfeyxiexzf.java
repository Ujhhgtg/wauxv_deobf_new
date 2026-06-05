package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ能不能ᛲᛴᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0363Ujhhgtgfeyxiexzf extends AbstractC3231feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int f2069Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f2070Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public InterfaceC0358Ujhhgtgfeyxiexzf f2071Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public MenuItemC0357Ujhhgtgfeyxiexzf f2072Ujhhgtgfeyxiexzf;

    public C0363Ujhhgtgfeyxiexzf(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2069Ujhhgtgfeyxiexzf = 21;
            this.f2070Ujhhgtgfeyxiexzf = 22;
        } else {
            this.f2069Ujhhgtgfeyxiexzf = 22;
            this.f2070Ujhhgtgfeyxiexzf = 21;
        }
    }

    @Override // p000.AbstractC3231feyxiexzfUjhhgtg, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0359Ujhhgtgfeyxiexzf c0359Ujhhgtgfeyxiexzf;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f2071Ujhhgtgfeyxiexzf != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c0359Ujhhgtgfeyxiexzf = (C0359Ujhhgtgfeyxiexzf) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0359Ujhhgtgfeyxiexzf = (C0359Ujhhgtgfeyxiexzf) adapter;
                headersCount = 0;
            }
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357UjhhgtgfeyxiexzfM1570Ujhhgtgfeyxiexzf = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c0359Ujhhgtgfeyxiexzf.getCount()) ? null : c0359Ujhhgtgfeyxiexzf.getItem(i);
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = this.f2072Ujhhgtgfeyxiexzf;
            if (menuItemC0357Ujhhgtgfeyxiexzf != menuItemC0357UjhhgtgfeyxiexzfM1570Ujhhgtgfeyxiexzf) {
                MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = c0359Ujhhgtgfeyxiexzf.f2052Ujhhgtgfeyxiexzf;
                if (menuItemC0357Ujhhgtgfeyxiexzf != null) {
                    this.f2071Ujhhgtgfeyxiexzf.mo1567Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf, menuItemC0357Ujhhgtgfeyxiexzf);
                }
                this.f2072Ujhhgtgfeyxiexzf = menuItemC0357UjhhgtgfeyxiexzfM1570Ujhhgtgfeyxiexzf;
                if (menuItemC0357UjhhgtgfeyxiexzfM1570Ujhhgtgfeyxiexzf != null) {
                    this.f2071Ujhhgtgfeyxiexzf.mo1568Ujhhgtgfeyxiexzf(menuC0355Ujhhgtgfeyxiexzf, menuItemC0357UjhhgtgfeyxiexzfM1570Ujhhgtgfeyxiexzf);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2069Ujhhgtgfeyxiexzf) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2070Ujhhgtgfeyxiexzf) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0359Ujhhgtgfeyxiexzf) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0359Ujhhgtgfeyxiexzf) adapter).f2052Ujhhgtgfeyxiexzf.m1544Ujhhgtgfeyxiexzf(false);
        return true;
    }

    public void setHoverListener(InterfaceC0358Ujhhgtgfeyxiexzf interfaceC0358Ujhhgtgfeyxiexzf) {
        this.f2071Ujhhgtgfeyxiexzf = interfaceC0358Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3231feyxiexzfUjhhgtg, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
