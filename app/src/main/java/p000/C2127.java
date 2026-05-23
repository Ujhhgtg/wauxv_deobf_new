package p000;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2127 implements InterfaceC1955 {

    public C0447 f7057;

    public boolean f7058;

    public int f7059;

    @Override // p000.InterfaceC1955
    public final int getId() {
        return this.f7059;
    }

    @Override // p000.InterfaceC1955
    public final void mo1137(boolean z) {
        C0315 c0315;
        if (this.f7058) {
            return;
        }
        if (z) {
            this.f7057.m3939();
            return;
        }
        C0447 c0447 = this.f7057;
        MenuC1944 menuC1944 = c0447.f7054;
        if (menuC1944 == null || c0447.f7029 == null) {
            return;
        }
        int size = menuC1944.f6412.size();
        if (size != c0447.f7029.length) {
            c0447.m3939();
            return;
        }
        int i = c0447.f7030;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = c0447.f7054.getItem(i2);
            if (item.isChecked()) {
                c0447.f7030 = item.getItemId();
                c0447.f7031 = i2;
            }
        }
        if (i != c0447.f7030 && (c0315 = c0447.f7024) != null) {
            AbstractC3440.m4958(c0447, c0315);
        }
        int i3 = c0447.f7028;
        boolean z2 = i3 != -1 ? i3 == 0 : c0447.f7054.m3764().size() > 3;
        for (int i4 = 0; i4 < size; i4++) {
            c0447.f7053.f7058 = true;
            c0447.f7029[i4].setLabelVisibilityMode(c0447.f7028);
            c0447.f7029[i4].setShifting(z2);
            c0447.f7029[i4].mo2((MenuItemC1946) c0447.f7054.getItem(i4));
            c0447.f7053.f7058 = false;
        }
    }

    @Override // p000.InterfaceC1955
    public final boolean mo1138(SubMenuC2853 subMenuC2853) {
        return false;
    }

    @Override // p000.InterfaceC1955
    public final boolean mo1139() {
        return false;
    }

    @Override // p000.InterfaceC1955
    public final boolean mo1142(MenuItemC1946 menuItemC1946) {
        return false;
    }

    @Override // p000.InterfaceC1955
    public final void mo1143(Parcelable parcelable) {
        if (parcelable instanceof C2126) {
            C0447 c0447 = this.f7057;
            C2126 c2126 = (C2126) parcelable;
            int i = c2126.f7055;
            int size = c0447.f7054.f6412.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = c0447.f7054.getItem(i2);
                if (i == item.getItemId()) {
                    c0447.f7030 = i;
                    c0447.f7031 = i2;
                    item.setChecked(true);
                    break;
                }
            }
            Context context = this.f7057.getContext();
            C2329 c2329 = c2126.f7056;
            SparseArray sparseArray = new SparseArray(c2329.size());
            for (int i3 = 0; i3 < c2329.size(); i3++) {
                int iKeyAt = c2329.keyAt(i3);
                C0364 c0364 = (C0364) c2329.valueAt(i3);
                sparseArray.put(iKeyAt, c0364 != null ? new C0363(context, c0364) : null);
            }
            C0447 c0448 = this.f7057;
            SparseArray sparseArray2 = c0448.f7042;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int iKeyAt2 = sparseArray.keyAt(i4);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (C0363) sparseArray.get(iKeyAt2));
                }
            }
            AbstractC2123[] abstractC2123Arr = c0448.f7029;
            if (abstractC2123Arr != null) {
                for (AbstractC2123 abstractC2123 : abstractC2123Arr) {
                    C0363 c0363 = (C0363) sparseArray2.get(abstractC2123.getId());
                    if (c0363 != null) {
                        abstractC2123.setBadge(c0363);
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC1955
    public final boolean mo1145(MenuItemC1946 menuItemC1946) {
        return false;
    }

    @Override // p000.InterfaceC1955
    public final void mo1147(Context context, MenuC1944 menuC1944) {
        this.f7057.f7054 = menuC1944;
    }

    @Override // p000.InterfaceC1955
    public final Parcelable mo1148() {
        C2126 c2126 = new C2126();
        c2126.f7055 = this.f7057.getSelectedItemId();
        SparseArray<C0363> badgeDrawables = this.f7057.getBadgeDrawables();
        C2329 c2329 = new C2329();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            C0363 c0363ValueAt = badgeDrawables.valueAt(i);
            c2329.put(iKeyAt, c0363ValueAt != null ? c0363ValueAt.f1690.f1729 : null);
        }
        c2126.f7056 = c2329;
        return c2126;
    }

    @Override // p000.InterfaceC1955
    public final void mo1136(MenuC1944 menuC1944, boolean z) {
    }
}
