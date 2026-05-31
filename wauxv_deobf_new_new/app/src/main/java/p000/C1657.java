package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲈᛸᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1657 extends C1993 {
    @Override // p000.C1993, com.kongzue.dialogx.interfaces.AbstractC0034
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final String mo895() {
        return C1657.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // p000.C1993, com.kongzue.dialogx.interfaces.AbstractC0034
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final void mo904() {
        EditText editText;
        if (m897() != null) {
            AbstractC0034.m877(m897());
            this.f982 = false;
        }
        RelativeLayout relativeLayout = this.f6616.f6592;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        int iM896 = m896(m903()) != 0 ? m896(m903()) : this.f983.mo3359(m903());
        if (iM896 == 0) {
            iM896 = m903() ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
        }
        C1992 c1992 = this.f6616;
        String string = (c1992 == null || (editText = c1992.f6593) == null) ? this.f6611 : editText.getText().toString();
        this.f985 = 0L;
        View viewM893 = m893(iM896);
        this.f6616 = new C1992(this, viewM893);
        if (viewM893 != null) {
            viewM893.setTag(this.f6603);
        }
        AbstractC0034.m890(viewM893);
        this.f6611 = string;
        m3984();
    }

    @Override // p000.C1993
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final boolean mo3532() {
        return this.f981;
    }

    @Override // p000.C1993
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final C1993 mo3533(C0441 c0441) {
        this.f978 = c0441;
        if (this.f982) {
            c0441.m1800(this);
        }
        return this;
    }
}
