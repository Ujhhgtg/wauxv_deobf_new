package p000;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2580 {

    public final Resources f8182;

    public final Resources.Theme f8183;

    public C2580(Resources resources, Resources.Theme theme) {
        this.f8182 = resources;
        this.f8183 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2580.class == obj.getClass()) {
            C2580 c2580 = (C2580) obj;
            if (this.f8182.equals(c2580.f8182) && Objects.equals(this.f8183, c2580.f8183)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8182, this.f8183);
    }
}
