package p000;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛱUjhhgtgᛱᛴ要点脸能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1733Ujhhgtgfeyxiexzf implements InterfaceC0368Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public MenuC0355Ujhhgtgfeyxiexzf f5807Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public MenuItemC0357Ujhhgtgfeyxiexzf f5808Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f5809Ujhhgtgfeyxiexzf;

    public C1733Ujhhgtgfeyxiexzf(Toolbar toolbar) {
        this.f5809Ujhhgtgfeyxiexzf = toolbar;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    public final int getId() {
        return 0;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1593Ujhhgtgfeyxiexzf(boolean z) {
        if (this.f5808Ujhhgtgfeyxiexzf != null) {
            MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf = this.f5807Ujhhgtgfeyxiexzf;
            if (menuC0355Ujhhgtgfeyxiexzf != null) {
                int size = menuC0355Ujhhgtgfeyxiexzf.f2009Ujhhgtgfeyxiexzf.size();
                for (int i = 0; i < size; i++) {
                    if (this.f5807Ujhhgtgfeyxiexzf.getItem(i) == this.f5808Ujhhgtgfeyxiexzf) {
                        return;
                    }
                }
            }
            mo1581Ujhhgtgfeyxiexzf(this.f5808Ujhhgtgfeyxiexzf);
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
        Toolbar toolbar = this.f5809Ujhhgtgfeyxiexzf;
        toolbar.removeView(toolbar.f157Ujhhgtgfeyxiexzf);
        toolbar.removeView(toolbar.f156Ujhhgtgfeyxiexzf);
        toolbar.f157Ujhhgtgfeyxiexzf = null;
        ArrayList arrayList = toolbar.f179feyxiexzfUjhhgtg;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f5808Ujhhgtgfeyxiexzf = null;
        toolbar.requestLayout();
        menuItemC0357Ujhhgtgfeyxiexzf.f2051feyxiexzfUjhhgtg = false;
        menuItemC0357Ujhhgtgfeyxiexzf.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        toolbar.m50Ujhhgtgfeyxiexzf();
        return true;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final boolean mo1582Ujhhgtgfeyxiexzf(MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        Toolbar toolbar = this.f5809Ujhhgtgfeyxiexzf;
        toolbar.m37Ujhhgtgfeyxiexzf();
        ViewParent parent = toolbar.f156Ujhhgtgfeyxiexzf.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f156Ujhhgtgfeyxiexzf);
            }
            toolbar.addView(toolbar.f156Ujhhgtgfeyxiexzf);
        }
        View view = menuItemC0357Ujhhgtgfeyxiexzf.f2049feyxiexzfUjhhgtg;
        if (view == null) {
            view = null;
        }
        toolbar.f157Ujhhgtgfeyxiexzf = view;
        this.f5808Ujhhgtgfeyxiexzf = menuItemC0357Ujhhgtgfeyxiexzf;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f157Ujhhgtgfeyxiexzf);
            }
            C1732Ujhhgtgfeyxiexzf c1732UjhhgtgfeyxiexzfM31Ujhhgtgfeyxiexzf = Toolbar.m31Ujhhgtgfeyxiexzf();
            c1732UjhhgtgfeyxiexzfM31Ujhhgtgfeyxiexzf.f5805Ujhhgtgfeyxiexzf = (toolbar.f162Ujhhgtgfeyxiexzf & 112) | 8388611;
            c1732UjhhgtgfeyxiexzfM31Ujhhgtgfeyxiexzf.f5806Ujhhgtgfeyxiexzf = 2;
            toolbar.f157Ujhhgtgfeyxiexzf.setLayoutParams(c1732UjhhgtgfeyxiexzfM31Ujhhgtgfeyxiexzf);
            toolbar.addView(toolbar.f157Ujhhgtgfeyxiexzf);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1732Ujhhgtgfeyxiexzf) childAt.getLayoutParams()).f5806Ujhhgtgfeyxiexzf != 2 && childAt != toolbar.f149Ujhhgtgfeyxiexzf) {
                toolbar.removeViewAt(childCount);
                toolbar.f179feyxiexzfUjhhgtg.add(childAt);
            }
        }
        toolbar.requestLayout();
        menuItemC0357Ujhhgtgfeyxiexzf.f2051feyxiexzfUjhhgtg = true;
        menuItemC0357Ujhhgtgfeyxiexzf.f2037Ujhhgtgfeyxiexzf.m1556Ujhhgtgfeyxiexzf(false);
        toolbar.m50Ujhhgtgfeyxiexzf();
        return true;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final void mo1583Ujhhgtgfeyxiexzf(Context context, MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf) {
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf;
        MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf2 = this.f5807Ujhhgtgfeyxiexzf;
        if (menuC0355Ujhhgtgfeyxiexzf2 != null && (menuItemC0357Ujhhgtgfeyxiexzf = this.f5808Ujhhgtgfeyxiexzf) != null) {
            menuC0355Ujhhgtgfeyxiexzf2.mo1545Ujhhgtgfeyxiexzf(menuItemC0357Ujhhgtgfeyxiexzf);
        }
        this.f5807Ujhhgtgfeyxiexzf = menuC0355Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final Parcelable mo1598Ujhhgtgfeyxiexzf() {
        return null;
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final void mo1596Ujhhgtgfeyxiexzf(Parcelable parcelable) {
    }

    @Override // p000.InterfaceC0368Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1592Ujhhgtgfeyxiexzf(MenuC0355Ujhhgtgfeyxiexzf menuC0355Ujhhgtgfeyxiexzf, boolean z) {
    }
}
