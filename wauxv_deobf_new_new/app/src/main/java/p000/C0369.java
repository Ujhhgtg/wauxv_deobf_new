package p000;

import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᤝᲁᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0369 extends AbstractC0374 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f1850;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f1851;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final View.OnClickListener f1852;

    public C0369(String str, String str2, View.OnClickListener onClickListener) {
        this.f1850 = str;
        this.f1851 = str2;
        this.f1852 = onClickListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0369)) {
            return false;
        }
        C0369 c0369 = (C0369) obj;
        return AbstractC1469.m3322(this.f1850, c0369.f1850) && AbstractC1469.m3322(this.f1851, c0369.f1851) && AbstractC1469.m3322(this.f1852, c0369.f1852);
    }

    public final int hashCode() {
        int iHashCode = this.f1850.hashCode() * 31;
        String str = this.f1851;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        View.OnClickListener onClickListener = this.f1852;
        return iHashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("Content(title=");
        sb.append(this.f1850);
        sb.append(", desc=");
        sb.append(this.f1851);
        sb.append(", onClick=");
        sb.append(this.f1852);
        sb.append(')');
        return sb.toString();
    }
}
