package p000;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛲ能不能ᛱfeyxiexzfᛱᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0439Ujhhgtgfeyxiexzf implements InterfaceC0368Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C2662feyxiexzfUjhhgtg f2303Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f2304Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f2305Ujhhgtgfeyxiexzf;

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    public final int getId() {
        return this.f2305Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1593Ujhhgtgfeyxiexzf(boolean z) {
        C2440feyxiexzfUjhhgtg c2440feyxiexzfUjhhgtg;
        if (this.f2304Ujhhgtgfeyxiexzf) {
            return;
        }
        if (z) {
            this.f2303Ujhhgtgfeyxiexzf.m1771Ujhhgtgfeyxiexzf();
            return;
        }
        C2662feyxiexzfUjhhgtg c2662feyxiexzfUjhhgtg = this.f2303Ujhhgtgfeyxiexzf;
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = c2662feyxiexzfUjhhgtg.f2342feyxiexzfUjhhgtg;
        if (menuC0355Ujhhgtgfeyxiexzf == null || c2662feyxiexzfUjhhgtg.f2317Ujhhgtgfeyxiexzf == null) {
            return;
        }
        int size = menuC0355Ujhhgtgfeyxiexzf.f2009Ujhhgtgfeyxiexzf.size();
        if (size != c2662feyxiexzfUjhhgtg.f2317Ujhhgtgfeyxiexzf.length) {
            c2662feyxiexzfUjhhgtg.m1771Ujhhgtgfeyxiexzf();
            return;
        }
        int i = c2662feyxiexzfUjhhgtg.f2318Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = c2662feyxiexzfUjhhgtg.f2342feyxiexzfUjhhgtg.getItem(i2);
            if (item.isChecked()) {
                c2662feyxiexzfUjhhgtg.f2318Ujhhgtgfeyxiexzf = item.getItemId();
                c2662feyxiexzfUjhhgtg.f2319Ujhhgtgfeyxiexzf = i2;
            }
        }
        if (i != c2662feyxiexzfUjhhgtg.f2318Ujhhgtgfeyxiexzf && (c2440feyxiexzfUjhhgtg = c2662feyxiexzfUjhhgtg.f2312Ujhhgtgfeyxiexzf) != null) {
            AbstractC1756feyxiexzfUjhhgtg.m3050Ujhhgtgfeyxiexzf(c2662feyxiexzfUjhhgtg, c2440feyxiexzfUjhhgtg);
        }
        int i3 = c2662feyxiexzfUjhhgtg.f2316Ujhhgtgfeyxiexzf;
        boolean z2 = i3 != -1 ? i3 == 0 : c2662feyxiexzfUjhhgtg.f2342feyxiexzfUjhhgtg.m1552Ujhhgtgfeyxiexzf().size() > 3;
        for (int i4 = 0; i4 < size; i4++) {
            c2662feyxiexzfUjhhgtg.f2341feyxiexzfUjhhgtg.f2304Ujhhgtgfeyxiexzf = true;
            c2662feyxiexzfUjhhgtg.f2317Ujhhgtgfeyxiexzf[i4].setLabelVisibilityMode(c2662feyxiexzfUjhhgtg.f2316Ujhhgtgfeyxiexzf);
            c2662feyxiexzfUjhhgtg.f2317Ujhhgtgfeyxiexzf[i4].setShifting(z2);
            c2662feyxiexzfUjhhgtg.f2317Ujhhgtgfeyxiexzf[i4].mo2Ujhhgtgfeyxiexzf((MenuItemC0357Ujhhgtgfeyxiexzf) c2662feyxiexzfUjhhgtg.f2342feyxiexzfUjhhgtg.getItem(i4));
            c2662feyxiexzfUjhhgtg.f2341feyxiexzfUjhhgtg.f2304Ujhhgtgfeyxiexzf = false;
        }
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final boolean mo1594Ujhhgtgfeyxiexzf(SubMenuC1191feyxiexzfUjhhgtg subMenuC1191feyxiexzfUjhhgtg) {
        return false;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final boolean mo1595Ujhhgtgfeyxiexzf() {
        return false;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final boolean mo1581Ujhhgtgfeyxiexzf(MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        return false;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final void mo1596Ujhhgtgfeyxiexzf(Parcelable parcelable) {
        if (parcelable instanceof C0440Ujhhgtgfeyxiexzf) {
            C2662feyxiexzfUjhhgtg c2662feyxiexzfUjhhgtg = this.f2303Ujhhgtgfeyxiexzf;
            C0440Ujhhgtgfeyxiexzf c0440Ujhhgtgfeyxiexzf = (C0440Ujhhgtgfeyxiexzf) parcelable;
            int i = c0440Ujhhgtgfeyxiexzf.f2306Ujhhgtgfeyxiexzf;
            int size = c2662feyxiexzfUjhhgtg.f2342feyxiexzfUjhhgtg.f2009Ujhhgtgfeyxiexzf.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = c2662feyxiexzfUjhhgtg.f2342feyxiexzfUjhhgtg.getItem(i2);
                if (i == item.getItemId()) {
                    c2662feyxiexzfUjhhgtg.f2318Ujhhgtgfeyxiexzf = i;
                    c2662feyxiexzfUjhhgtg.f2319Ujhhgtgfeyxiexzf = i2;
                    item.setChecked(true);
                    break;
                }
            }
            Context context = this.f2303Ujhhgtgfeyxiexzf.getContext();
            C1377feyxiexzfUjhhgtg c1377feyxiexzfUjhhgtg = c0440Ujhhgtgfeyxiexzf.f2307Ujhhgtgfeyxiexzf;
            SparseArray sparseArray = new SparseArray(c1377feyxiexzfUjhhgtg.size());
            for (int i3 = 0; i3 < c1377feyxiexzfUjhhgtg.size(); i3++) {
                int iKeyAt = c1377feyxiexzfUjhhgtg.keyAt(i3);
                C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg = (C2452feyxiexzfUjhhgtg) c1377feyxiexzfUjhhgtg.valueAt(i3);
                sparseArray.put(iKeyAt, c2452feyxiexzfUjhhgtg != null ? new C2449feyxiexzfUjhhgtg(context, c2452feyxiexzfUjhhgtg) : null);
            }
            C2662feyxiexzfUjhhgtg c2662feyxiexzfUjhhgtg2 = this.f2303Ujhhgtgfeyxiexzf;
            SparseArray sparseArray2 = c2662feyxiexzfUjhhgtg2.f2330Ujhhgtgfeyxiexzf;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int iKeyAt2 = sparseArray.keyAt(i4);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (C2449feyxiexzfUjhhgtg) sparseArray.get(iKeyAt2));
                }
            }
            AbstractC0410Ujhhgtgfeyxiexzf[] abstractC0410UjhhgtgfeyxiexzfArr = c2662feyxiexzfUjhhgtg2.f2317Ujhhgtgfeyxiexzf;
            if (abstractC0410UjhhgtgfeyxiexzfArr != null) {
                for (AbstractC0410Ujhhgtgfeyxiexzf abstractC0410Ujhhgtgfeyxiexzf : abstractC0410UjhhgtgfeyxiexzfArr) {
                    C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg = (C2449feyxiexzfUjhhgtg) sparseArray2.get(abstractC0410Ujhhgtgfeyxiexzf.getId());
                    if (c2449feyxiexzfUjhhgtg != null) {
                        abstractC0410Ujhhgtgfeyxiexzf.setBadge(c2449feyxiexzfUjhhgtg);
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final boolean mo1582Ujhhgtgfeyxiexzf(MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        return false;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final void mo1583Ujhhgtgfeyxiexzf(Context context, MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf) {
        this.f2303Ujhhgtgfeyxiexzf.f2342feyxiexzfUjhhgtg = menuC0355Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final Parcelable mo1598Ujhhgtgfeyxiexzf() {
        C0440Ujhhgtgfeyxiexzf c0440Ujhhgtgfeyxiexzf = new C0440Ujhhgtgfeyxiexzf();
        c0440Ujhhgtgfeyxiexzf.f2306Ujhhgtgfeyxiexzf = this.f2303Ujhhgtgfeyxiexzf.getSelectedItemId();
        SparseArray<C2449feyxiexzfUjhhgtg> badgeDrawables = this.f2303Ujhhgtgfeyxiexzf.getBadgeDrawables();
        C1377feyxiexzfUjhhgtg c1377feyxiexzfUjhhgtg = new C1377feyxiexzfUjhhgtg();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtgValueAt = badgeDrawables.valueAt(i);
            c1377feyxiexzfUjhhgtg.put(iKeyAt, c2449feyxiexzfUjhhgtgValueAt != null ? c2449feyxiexzfUjhhgtgValueAt.f7921Ujhhgtgfeyxiexzf.f7935Ujhhgtgfeyxiexzf : null);
        }
        c0440Ujhhgtgfeyxiexzf.f2307Ujhhgtgfeyxiexzf = c1377feyxiexzfUjhhgtg;
        return c0440Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1592Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, boolean z) {
    }
}
