package p000;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᛸᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0942 extends AbstractC0034 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public AbstractC1915 f3453;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public C0942 f3454;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public C0776 f3455;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public int f3456;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public int f3457;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public int f3458;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public int f3459;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public boolean f3460;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public C0941 f3461;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public int f3462;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public int f3463;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static C0942 m2555() {
        C0942 c0942 = new C0942();
        c0942.f3454 = c0942;
        c0942.f3456 = R.anim.anim_dialogx_default_enter;
        c0942.f3457 = R.anim.anim_dialogx_default_exit;
        c0942.f3458 = 1;
        c0942.f3459 = 0;
        c0942.f3460 = true;
        c0942.f3462 = -1;
        c0942.f3463 = -1;
        return c0942;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0034
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final String mo895() {
        return C0942.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0034
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final void mo904() {
        MaxRelativeLayout maxRelativeLayout;
        if (m897() != null) {
            AbstractC0034.m877(m897());
            this.f982 = false;
        }
        C0776 c0776 = this.f3455;
        if (c0776 != null && (maxRelativeLayout = (MaxRelativeLayout) c0776.f2880) != null) {
            maxRelativeLayout.removeAllViews();
        }
        this.f985 = 0L;
        View viewM893 = m893(m896(m903()) != 0 ? m896(m903()) : R.layout.layout_dialogx_custom);
        this.f3455 = new C0776(this, viewM893);
        if (viewM893 != null) {
            viewM893.setTag(this.f3454);
        }
        AbstractC0034.m890(viewM893);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final void m2556() {
        m892();
        if (m897() != null) {
            AbstractC0034.m890(m897());
            return;
        }
        View viewM893 = m893(m896(m903()) != 0 ? m896(m903()) : R.layout.layout_dialogx_custom);
        this.f3455 = new C0776(this, viewM893);
        if (viewM893 != null) {
            viewM893.setTag(this.f3454);
        }
        AbstractC0034.m890(viewM893);
    }
}
