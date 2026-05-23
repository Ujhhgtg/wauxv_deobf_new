package p000;

import android.content.Context;
import android.view.View;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲈᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0130 extends C1949 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1096 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0136 f1097;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0130(C0136 c0136, Context context, MenuC1944 menuC1944, View view) {
        super(context, menuC1944, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f1097 = c0136;
        this.f6462 = 8388613;
        C0094 c0094 = c0136.f1126;
        this.f6464 = c0094;
        AbstractC1947 abstractC1947 = this.f6465;
        if (abstractC1947 != null) {
            abstractC1947.mo1144(c0094);
        }
    }

    @Override // p000.C1949
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo1135() {
        switch (1) {
            case 0:
                C0136 c0136 = this.f1097;
                c0136.f1123 = null;
                c0136.f1127 = 0;
                super.mo1135();
                break;
            default:
                C0136 c0137 = this.f1097;
                MenuC1944 menuC1944 = c0137.f1107;
                if (menuC1944 != null) {
                    menuC1944.m3756(true);
                }
                c0137.f1122 = null;
                super.mo1135();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0130(C0136 c0136, Context context, SubMenuC2853 subMenuC2853, View view) {
        super(context, subMenuC2853, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f1097 = c0136;
        if ((subMenuC2853.f9116.f6450 & 32) != 32) {
            View view2 = c0136.f1112;
            this.f6461 = view2 == null ? c0136.f1111 : view2;
        }
        C0094 c0094 = c0136.f1126;
        this.f6464 = c0094;
        AbstractC1947 abstractC1947 = this.f6465;
        if (abstractC1947 != null) {
            abstractC1947.mo1144(c0094);
        }
    }
}
