package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲀᤞᛸᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3501 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final View f11015;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final HashMap f11014 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ArrayList f11016 = new ArrayList();

    public C3501(View view) {
        this.f11015 = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3501)) {
            return false;
        }
        C3501 c3501 = (C3501) obj;
        return this.f11015 == c3501.f11015 && this.f11014.equals(c3501.f11014);
    }

    public final int hashCode() {
        return this.f11014.hashCode() + (this.f11015.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM2803 = AbstractC1095.m2803("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM2803.append(this.f11015);
        sbM2803.append("\n");
        String strM4782 = AbstractC2844.m4782(sbM2803.toString(), "    values:");
        HashMap map = this.f11014;
        for (String str : map.keySet()) {
            strM4782 = strM4782 + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM4782;
    }
}
