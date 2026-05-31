package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000.C0253;
import p000.InterfaceC1974;
import p000.InterfaceC1988;
import p000.MenuItemC1977;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC1974, InterfaceC1988, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f12 = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0253 c0253M1453 = C0253.m1453(context, attributeSet, f12, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c0253M1453.f1478;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0253M1453.m1466(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0253M1453.m1466(1));
        }
        c0253M1453.m1475();
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

    @Override // p000.InterfaceC1974
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean mo6(MenuItemC1977 menuItemC1977) {
        throw null;
    }
}
