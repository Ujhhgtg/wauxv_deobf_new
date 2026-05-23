package p000;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1077 {

    public final DisplayCutout f3894;

    public C1077(DisplayCutout displayCutout) {
        this.f3894 = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1077.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3894, ((C1077) obj).f3894);
    }

    public final int hashCode() {
        return this.f3894.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3894 + "}";
    }
}
