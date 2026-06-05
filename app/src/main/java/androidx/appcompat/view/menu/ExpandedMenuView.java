package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000.C2366Ujhhgtgfeyxiexzf;
import p000.InterfaceC0356Ujhhgtgfeyxiexzf;
import p000.InterfaceC0370Ujhhgtgfeyxiexzf;
import p000.MenuItemC0357Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0356Ujhhgtgfeyxiexzf, InterfaceC0370Ujhhgtgfeyxiexzf, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final int[] f13Ujhhgtgfeyxiexzf = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf = C2366Ujhhgtgfeyxiexzf.m3592Ujhhgtgfeyxiexzf(context, attributeSet, f13Ujhhgtgfeyxiexzf, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3602Ujhhgtgfeyxiexzf(1));
        }
        c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        throw null;
    }

    @Override // p000.InterfaceC0356Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean mo6Ujhhgtgfeyxiexzf(MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        throw null;
    }
}
