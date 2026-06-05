package p000;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛲ能不能ᛱfeyxiexzfᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3079Ujhhgtgfeyxiexzf implements View.OnClickListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9519Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f9520Ujhhgtgfeyxiexzf;

    public /* synthetic */ ViewOnClickListenerC3079Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f9519Ujhhgtgfeyxiexzf = i;
        this.f9520Ujhhgtgfeyxiexzf = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9519Ujhhgtgfeyxiexzf) {
            case 0:
                C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf = (C3639Ujhhgtgfeyxiexzf) this.f9520Ujhhgtgfeyxiexzf;
                ((C3082Ujhhgtgfeyxiexzf) c3639Ujhhgtgfeyxiexzf.f11371Ujhhgtgfeyxiexzf).getClass();
                c3639Ujhhgtgfeyxiexzf.m5277Ujhhgtgfeyxiexzf(view);
                break;
            case 1:
                MenuItemC0357Ujhhgtgfeyxiexzf itemData = ((AbstractC0410Ujhhgtgfeyxiexzf) view).getItemData();
                C2662feyxiexzfUjhhgtg c2662feyxiexzfUjhhgtg = (C2662feyxiexzfUjhhgtg) this.f9520Ujhhgtgfeyxiexzf;
                if (!c2662feyxiexzfUjhhgtg.f2342feyxiexzfUjhhgtg.m1557Ujhhgtgfeyxiexzf(itemData, c2662feyxiexzfUjhhgtg.f2341feyxiexzfUjhhgtg, 0)) {
                    itemData.setChecked(true);
                }
                break;
            case 2:
                C1733Ujhhgtgfeyxiexzf c1733Ujhhgtgfeyxiexzf = ((Toolbar) this.f9520Ujhhgtgfeyxiexzf).f185feyxiexzfUjhhgtg;
                MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = c1733Ujhhgtgfeyxiexzf == null ? null : c1733Ujhhgtgfeyxiexzf.f5808Ujhhgtgfeyxiexzf;
                if (menuItemC0357Ujhhgtgfeyxiexzf != null) {
                    menuItemC0357Ujhhgtgfeyxiexzf.collapseActionView();
                }
                break;
            default:
                C1762feyxiexzfUjhhgtg c1762feyxiexzfUjhhgtg = (C1762feyxiexzfUjhhgtg) this.f9520Ujhhgtgfeyxiexzf;
                if (c1762feyxiexzfUjhhgtg.f5934Ujhhgtgfeyxiexzf != null) {
                    c1762feyxiexzfUjhhgtg.getClass();
                }
                break;
        }
    }

    public ViewOnClickListenerC3079Ujhhgtgfeyxiexzf(C1762feyxiexzfUjhhgtg c1762feyxiexzfUjhhgtg) {
        this.f9519Ujhhgtgfeyxiexzf = 3;
        this.f9520Ujhhgtgfeyxiexzf = c1762feyxiexzfUjhhgtg;
        c1762feyxiexzfUjhhgtg.f5924Ujhhgtgfeyxiexzf.getContext();
    }
}
