package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲈᤝᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1993 extends AbstractC0034 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public C2036 f6602;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public C0941 f6604;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public C0441 f6605;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public CharSequence f6606;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public String f6607;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public CharSequence f6608;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public CharSequence f6609;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public CharSequence f6610;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public String f6611;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public InterfaceC0352 f6613;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public C2035 f6614;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public C2035 f6615;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public C1992 f6616;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final boolean f6601 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final C1993 f6603 = this;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final float f6612 = AbstractC1037.f3787;

    @Override // com.kongzue.dialogx.interfaces.AbstractC0034
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public String mo895() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0034
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public void mo904() {
        if (m897() != null) {
            AbstractC0034.m877(m897());
            this.f982 = false;
        }
        RelativeLayout relativeLayout = this.f6616.f6592;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        ViewGroup viewGroup = this.f6616.f6591;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        int iM896 = m896(m903()) != 0 ? m896(m903()) : this.f983.mo3359(m903());
        if (iM896 == 0) {
            iM896 = m903() ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
        }
        this.f985 = 0L;
        View viewM893 = m893(iM896);
        this.f6616 = new C1992(this, viewM893);
        if (viewM893 != null) {
            viewM893.setTag(this.f6603);
        }
        AbstractC0034.m890(viewM893);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final void m3983() {
        AbstractC0034.m889(new RunnableC1989(this, 1));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public boolean mo3532() {
        return this.f981;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public C1993 mo3533(C0441 c0441) {
        this.f978 = c0441;
        if (this.f982) {
            c0441.m1800(this);
        }
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final void m3984() {
        if (this.f6616 == null) {
            return;
        }
        AbstractC0034.m889(new RunnableC1989(this, 0));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final void m3985() {
        m892();
        if (m897() != null) {
            AbstractC0034.m890(m897());
            return;
        }
        int iM896 = m896(m903()) != 0 ? m896(m903()) : this.f983.mo3359(m903());
        if (iM896 == 0) {
            iM896 = m903() ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
        }
        View viewM893 = m893(iM896);
        this.f6616 = new C1992(this, viewM893);
        if (viewM893 != null) {
            viewM893.setTag(this.f6603);
        }
        AbstractC0034.m890(viewM893);
    }
}
