package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000.C0243;
import p000.InterfaceC1943;
import p000.InterfaceC1957;
import p000.MenuItemC1946;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC1943, InterfaceC1957, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final int[] f12 = {16842964, 16843049};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0243 c0243M1307 = C0243.m1307(context, attributeSet, f12, 16842868);
        TypedArray typedArray = (TypedArray) c0243M1307.f1404;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0243M1307.m1320(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0243M1307.m1320(1));
        }
        c0243M1307.m1329();
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

    @Override // p000.InterfaceC1943
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean mo6(MenuItemC1946 menuItemC1946) {
        throw null;
    }
}
