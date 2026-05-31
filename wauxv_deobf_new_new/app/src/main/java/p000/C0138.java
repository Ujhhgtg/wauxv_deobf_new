package p000;

import android.content.Context;
import android.view.View;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲁᤞᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0138 extends C1980 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1164 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0144 f1165;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138(C0144 c0144, Context context, MenuC1975 menuC1975, View view) {
        super(context, menuC1975, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f1165 = c0144;
        this.f6567 = 8388613;
        C0102 c0102 = c0144.f1194;
        this.f6569 = c0102;
        AbstractC1978 abstractC1978 = this.f6570;
        if (abstractC1978 != null) {
            abstractC1978.mo1290(c0102);
        }
    }

    @Override // p000.C1980
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo1281() {
        switch (this.f1164) {
            case 0:
                C0144 c0144 = this.f1165;
                c0144.f1191 = null;
                c0144.f1195 = 0;
                super.mo1281();
                break;
            default:
                C0144 c0145 = this.f1165;
                MenuC1975 menuC1975 = c0145.f1175;
                if (menuC1975 != null) {
                    menuC1975.m3950(true);
                }
                c0145.f1190 = null;
                super.mo1281();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138(C0144 c0144, Context context, SubMenuC2913 subMenuC2913, View view) {
        super(context, subMenuC2913, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f1165 = c0144;
        if ((subMenuC2913.f9285.f6555 & 32) != 32) {
            View view2 = c0144.f1180;
            this.f6566 = view2 == null ? c0144.f1179 : view2;
        }
        C0102 c0102 = c0144.f1194;
        this.f6569 = c0102;
        AbstractC1978 abstractC1978 = this.f6570;
        if (abstractC1978 != null) {
            abstractC1978.mo1290(c0102);
        }
    }
}
