package p000;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᲇᛸᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2636 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Resources f8335;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Resources.Theme f8336;

    public C2636(Resources resources, Resources.Theme theme) {
        this.f8335 = resources;
        this.f8336 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2636.class == obj.getClass()) {
            C2636 c2636 = (C2636) obj;
            if (this.f8335.equals(c2636.f8335) && Objects.equals(this.f8336, c2636.f8336)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8335, this.f8336);
    }
}
