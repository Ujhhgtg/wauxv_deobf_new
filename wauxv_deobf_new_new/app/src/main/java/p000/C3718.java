package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲀᲁᤞᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3718 extends C3717 {
    public C3718(C3729 c3729, WindowInsets windowInsets) {
        super(c3729, windowInsets);
    }

    @Override // p000.AbstractC3716, p000.C3725
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3718)) {
            return false;
        }
        C3718 c3718 = (C3718) obj;
        return Objects.equals(this.f11582, c3718.f11582) && Objects.equals(this.f11586, c3718.f11586) && AbstractC3716.m5267(this.f11587, c3718.f11587);
    }

    @Override // p000.C3725
    public int hashCode() {
        return this.f11582.hashCode();
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C3729 mo5293() {
        return C3729.m5305(null, this.f11582.consumeDisplayCutout());
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C1082 mo5294() {
        DisplayCutout displayCutout = this.f11582.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1082(displayCutout);
    }
}
