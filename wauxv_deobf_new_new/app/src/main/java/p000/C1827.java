package p000;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᲈᤝᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1827 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final LinearLayout f6079;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ImageView f6080;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final TextView f6081;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f6082;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f6083;

    public C1827(LinearLayout linearLayout, ImageView imageView, TextView textView, int i, int i2) {
        this.f6079 = linearLayout;
        this.f6080 = imageView;
        this.f6081 = textView;
        this.f6082 = i;
        this.f6083 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1827)) {
            return false;
        }
        C1827 c1827 = (C1827) obj;
        return AbstractC1469.m3322(this.f6079, c1827.f6079) && AbstractC1469.m3322(this.f6080, c1827.f6080) && AbstractC1469.m3322(this.f6081, c1827.f6081) && this.f6082 == c1827.f6082 && this.f6083 == c1827.f6083;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6083) + ((Integer.hashCode(this.f6082) + ((this.f6081.hashCode() + ((this.f6080.hashCode() + (this.f6079.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("TabHolder(root=");
        sb.append(this.f6079);
        sb.append(", icon=");
        sb.append(this.f6080);
        sb.append(", label=");
        sb.append(this.f6081);
        sb.append(", activeIconRes=");
        sb.append(this.f6082);
        sb.append(", inactiveIconRes=");
        return AbstractC2844.m4784(sb, this.f6083, ')');
    }
}
