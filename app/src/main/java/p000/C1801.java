package p000;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1801 {

    public final LinearLayout f6013;

    public final ImageView f6014;

    public final TextView f6015;

    public C1801(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f6013 = linearLayout;
        this.f6014 = imageView;
        this.f6015 = textView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1801)) {
            return false;
        }
        C1801 c1801 = (C1801) obj;
        return AbstractC2207.m4087(this.f6013, c1801.f6013) && AbstractC2207.m4087(this.f6014, c1801.f6014) && AbstractC2207.m4087(this.f6015, c1801.f6015);
    }

    public final int hashCode() {
        return this.f6015.hashCode() + ((this.f6014.hashCode() + (this.f6013.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("TabHolder(root=");
        sb.append(this.f6013);
        sb.append(", icon=");
        sb.append(this.f6014);
        sb.append(", label=");
        sb.append(this.f6015);
        sb.append(')');
        return sb.toString();
    }
}
