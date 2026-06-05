package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ能不能ᛱfeyxiexzfᛱ要点脸ᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0359Ujhhgtgfeyxiexzf extends BaseAdapter {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final MenuC0355Ujhhgtgfeyxiexzf f2052Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f2053Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f2054Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean f2055Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final LayoutInflater f2056Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int f2057Ujhhgtgfeyxiexzf;

    public C0359Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, LayoutInflater layoutInflater, boolean z, int i) {
        this.f2055Ujhhgtgfeyxiexzf = z;
        this.f2056Ujhhgtgfeyxiexzf = layoutInflater;
        this.f2052Ujhhgtgfeyxiexzf = menuC0355Ujhhgtgfeyxiexzf;
        this.f2057Ujhhgtgfeyxiexzf = i;
        m1569Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM1552Ujhhgtgfeyxiexzf;
        boolean z = this.f2055Ujhhgtgfeyxiexzf;
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = this.f2052Ujhhgtgfeyxiexzf;
        if (z) {
            menuC0355Ujhhgtgfeyxiexzf.m1550Ujhhgtgfeyxiexzf();
            arrayListM1552Ujhhgtgfeyxiexzf = menuC0355Ujhhgtgfeyxiexzf.f2013Ujhhgtgfeyxiexzf;
        } else {
            arrayListM1552Ujhhgtgfeyxiexzf = menuC0355Ujhhgtgfeyxiexzf.m1552Ujhhgtgfeyxiexzf();
        }
        return this.f2053Ujhhgtgfeyxiexzf < 0 ? arrayListM1552Ujhhgtgfeyxiexzf.size() : arrayListM1552Ujhhgtgfeyxiexzf.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f2056Ujhhgtgfeyxiexzf.inflate(this.f2057Ujhhgtgfeyxiexzf, viewGroup, false);
        }
        int i2 = getItem(i).f2025Ujhhgtgfeyxiexzf;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f2025Ujhhgtgfeyxiexzf : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2052Ujhhgtgfeyxiexzf.mo1553Ujhhgtgfeyxiexzf() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC0367Ujhhgtgfeyxiexzf interfaceC0367Ujhhgtgfeyxiexzf = (InterfaceC0367Ujhhgtgfeyxiexzf) view;
        if (this.f2054Ujhhgtgfeyxiexzf) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0367Ujhhgtgfeyxiexzf.mo2Ujhhgtgfeyxiexzf(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m1569Ujhhgtgfeyxiexzf();
        super.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m1569Ujhhgtgfeyxiexzf() {
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = this.f2052Ujhhgtgfeyxiexzf;
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = menuC0355Ujhhgtgfeyxiexzf.f2022Ujhhgtgfeyxiexzf;
        if (menuItemC0357Ujhhgtgfeyxiexzf != null) {
            menuC0355Ujhhgtgfeyxiexzf.m1550Ujhhgtgfeyxiexzf();
            ArrayList arrayList = menuC0355Ujhhgtgfeyxiexzf.f2013Ujhhgtgfeyxiexzf;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((MenuItemC0357Ujhhgtgfeyxiexzf) arrayList.get(i)) == menuItemC0357Ujhhgtgfeyxiexzf) {
                    this.f2053Ujhhgtgfeyxiexzf = i;
                    return;
                }
            }
        }
        this.f2053Ujhhgtgfeyxiexzf = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final MenuItemC0357Ujhhgtgfeyxiexzf getItem(int i) {
        ArrayList arrayListM1552Ujhhgtgfeyxiexzf;
        boolean z = this.f2055Ujhhgtgfeyxiexzf;
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = this.f2052Ujhhgtgfeyxiexzf;
        if (z) {
            menuC0355Ujhhgtgfeyxiexzf.m1550Ujhhgtgfeyxiexzf();
            arrayListM1552Ujhhgtgfeyxiexzf = menuC0355Ujhhgtgfeyxiexzf.f2013Ujhhgtgfeyxiexzf;
        } else {
            arrayListM1552Ujhhgtgfeyxiexzf = menuC0355Ujhhgtgfeyxiexzf.m1552Ujhhgtgfeyxiexzf();
        }
        int i2 = this.f2053Ujhhgtgfeyxiexzf;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (MenuItemC0357Ujhhgtgfeyxiexzf) arrayListM1552Ujhhgtgfeyxiexzf.get(i);
    }
}
