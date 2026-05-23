package p000;

import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤞᲇᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0394 extends AbstractC0399 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f1879;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f1880;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final View.OnClickListener f1881;

    public C0394(String str, String str2, View.OnClickListener onClickListener) {
        this.f1879 = str;
        this.f1880 = str2;
        this.f1881 = onClickListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0394)) {
            return false;
        }
        C0394 c0394 = (C0394) obj;
        return AbstractC2207.m4087(this.f1879, c0394.f1879) && AbstractC2207.m4087(this.f1880, c0394.f1880) && AbstractC2207.m4087(this.f1881, c0394.f1881);
    }

    public final int hashCode() {
        int iHashCode = this.f1879.hashCode() * 31;
        String str = this.f1880;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        View.OnClickListener onClickListener = this.f1881;
        return iHashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("Content(title=");
        sb.append(this.f1879);
        sb.append(", desc=");
        sb.append(this.f1880);
        sb.append(", onClick=");
        sb.append(this.f1881);
        sb.append(')');
        return sb.toString();
    }
}
