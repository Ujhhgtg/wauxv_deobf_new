package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᤞᲈᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3444 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final View f10855;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final HashMap f10854 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ArrayList f10856 = new ArrayList();

    public C3444(View view) {
        this.f10855 = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3444)) {
            return false;
        }
        C3444 c3444 = (C3444) obj;
        return this.f10855 == c3444.f10855 && this.f10854.equals(c3444.f10854);
    }

    public final int hashCode() {
        return this.f10854.hashCode() + (this.f10855.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM2788 = AbstractC1194.m2788("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM2788.append(this.f10855);
        sbM2788.append("\n");
        String strM4748 = AbstractC2784.m4748(sbM2788.toString(), "    values:");
        HashMap map = this.f10854;
        for (String str : map.keySet()) {
            strM4748 = strM4748 + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM4748;
    }
}
