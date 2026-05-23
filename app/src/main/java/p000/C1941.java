package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1941 extends BaseAdapter {

    public final MenuC1944 f6400;

    public int f6401 = -1;

    public boolean f6402;

    public final boolean f6403;

    public final LayoutInflater f6404;

    public final int f6405;

    public C1941(MenuC1944 menuC1944, LayoutInflater layoutInflater, boolean z, int i) {
        this.f6403 = z;
        this.f6404 = layoutInflater;
        this.f6400 = menuC1944;
        this.f6405 = i;
        m3752();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM3764;
        boolean z = this.f6403;
        MenuC1944 menuC1944 = this.f6400;
        if (z) {
            menuC1944.m3762();
            arrayListM3764 = menuC1944.f6416;
        } else {
            arrayListM3764 = menuC1944.m3764();
        }
        return this.f6401 < 0 ? arrayListM3764.size() : arrayListM3764.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f6404.inflate(this.f6405, viewGroup, false);
        }
        int i2 = getItem(i).f6428;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f6428 : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f6400.mo3765() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC1956 interfaceC1956 = (InterfaceC1956) view;
        if (this.f6402) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1956.mo2(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m3752();
        super.notifyDataSetChanged();
    }

    public final void m3752() {
        MenuC1944 menuC1944 = this.f6400;
        MenuItemC1946 menuItemC1946 = menuC1944.f6425;
        if (menuItemC1946 != null) {
            menuC1944.m3762();
            ArrayList arrayList = menuC1944.f6416;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((MenuItemC1946) arrayList.get(i)) == menuItemC1946) {
                    this.f6401 = i;
                    return;
                }
            }
        }
        this.f6401 = -1;
    }

    @Override // android.widget.Adapter
    public final MenuItemC1946 getItem(int i) {
        ArrayList arrayListM3764;
        boolean z = this.f6403;
        MenuC1944 menuC1944 = this.f6400;
        if (z) {
            menuC1944.m3762();
            arrayListM3764 = menuC1944.f6416;
        } else {
            arrayListM3764 = menuC1944.m3764();
        }
        int i2 = this.f6401;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (MenuItemC1946) arrayListM3764.get(i);
    }
}
