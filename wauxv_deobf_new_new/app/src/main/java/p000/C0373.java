package p000;

import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᤞᤝᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0373 extends AbstractC0374 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f1864;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f1865;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final AbstractC2927 f1866;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final View.OnClickListener f1867;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final View.OnLongClickListener f1868;

    public C0373(String str, String str2, AbstractC2927 abstractC2927, View.OnClickListener onClickListener, ViewOnLongClickListenerC0962 viewOnLongClickListenerC0962) {
        this.f1864 = str;
        this.f1865 = str2;
        this.f1866 = abstractC2927;
        this.f1867 = onClickListener;
        this.f1868 = viewOnLongClickListenerC0962;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0373)) {
            return false;
        }
        C0373 c0373 = (C0373) obj;
        return AbstractC1469.m3322(this.f1864, c0373.f1864) && AbstractC1469.m3322(this.f1865, c0373.f1865) && this.f1866.equals(c0373.f1866) && AbstractC1469.m3322(this.f1867, c0373.f1867) && AbstractC1469.m3322(this.f1868, c0373.f1868);
    }

    public final int hashCode() {
        int iHashCode = this.f1864.hashCode() * 31;
        String str = this.f1865;
        int iHashCode2 = (this.f1866.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        View.OnClickListener onClickListener = this.f1867;
        int iHashCode3 = (iHashCode2 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        View.OnLongClickListener onLongClickListener = this.f1868;
        return iHashCode3 + (onLongClickListener != null ? onLongClickListener.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("Switch(title=");
        sb.append(this.f1864);
        sb.append(", desc=");
        sb.append(this.f1865);
        sb.append(", hook=");
        sb.append(this.f1866);
        sb.append(", onClick=");
        sb.append(this.f1867);
        sb.append(", onLongClick=");
        sb.append(this.f1868);
        sb.append(')');
        return sb.toString();
    }
}
