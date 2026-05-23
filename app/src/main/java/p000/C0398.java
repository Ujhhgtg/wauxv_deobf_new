package p000;

import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᲁᤞᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0398 extends AbstractC0399 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f1893;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f1894;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final AbstractC2867 f1895;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final View.OnClickListener f1896;

    public C0398(String str, String str2, AbstractC2867 abstractC2867, View.OnClickListener onClickListener) {
        this.f1893 = str;
        this.f1894 = str2;
        this.f1895 = abstractC2867;
        this.f1896 = onClickListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0398)) {
            return false;
        }
        C0398 c0398 = (C0398) obj;
        return AbstractC2207.m4087(this.f1893, c0398.f1893) && AbstractC2207.m4087(this.f1894, c0398.f1894) && this.f1895.equals(c0398.f1895) && AbstractC2207.m4087(this.f1896, c0398.f1896);
    }

    public final int hashCode() {
        int iHashCode = this.f1893.hashCode() * 31;
        String str = this.f1894;
        int iHashCode2 = (this.f1895.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        View.OnClickListener onClickListener = this.f1896;
        return iHashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("Switch(title=");
        sb.append(this.f1893);
        sb.append(", desc=");
        sb.append(this.f1894);
        sb.append(", hook=");
        sb.append(this.f1895);
        sb.append(", onClick=");
        sb.append(this.f1896);
        sb.append(')');
        return sb.toString();
    }
}
