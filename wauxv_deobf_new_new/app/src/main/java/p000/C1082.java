package p000;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᲈᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1082 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final DisplayCutout f3905;

    public C1082(DisplayCutout displayCutout) {
        this.f3905 = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1082.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3905, ((C1082) obj).f3905);
    }

    public final int hashCode() {
        return this.f3905.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3905 + "}";
    }
}
