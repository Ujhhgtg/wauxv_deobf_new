package p000;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᲁᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2544 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8086;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2546 f8087;

    public /* synthetic */ C2544(AbstractC2546 abstractC2546, int i) {
        this.f8086 = i;
        this.f8087 = abstractC2546;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m4470(View view) {
        int iM4480;
        int i;
        switch (this.f8086) {
            case 0:
                C2547 c2547 = (C2547) view.getLayoutParams();
                iM4480 = AbstractC2546.m4480(view);
                i = ((ViewGroup.MarginLayoutParams) c2547).rightMargin;
                break;
            default:
                C2547 c2548 = (C2547) view.getLayoutParams();
                iM4480 = AbstractC2546.m4476(view);
                i = ((ViewGroup.MarginLayoutParams) c2548).bottomMargin;
                break;
        }
        return iM4480 + i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m4471(View view) {
        int iM4477;
        int i;
        switch (this.f8086) {
            case 0:
                C2547 c2547 = (C2547) view.getLayoutParams();
                iM4477 = AbstractC2546.m4477(view);
                i = ((ViewGroup.MarginLayoutParams) c2547).leftMargin;
                break;
            default:
                C2547 c2548 = (C2547) view.getLayoutParams();
                iM4477 = AbstractC2546.m4481(view);
                i = ((ViewGroup.MarginLayoutParams) c2548).topMargin;
                break;
        }
        return iM4477 - i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m4472() {
        int i;
        int iM4493;
        switch (this.f8086) {
            case 0:
                AbstractC2546 abstractC2546 = this.f8087;
                i = abstractC2546.f8105;
                iM4493 = abstractC2546.m4493();
                break;
            default:
                AbstractC2546 abstractC2547 = this.f8087;
                i = abstractC2547.f8106;
                iM4493 = abstractC2547.m4491();
                break;
        }
        return i - iM4493;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int m4473() {
        switch (this.f8086) {
            case 0:
                return this.f8087.m4492();
            default:
                return this.f8087.m4494();
        }
    }
}
