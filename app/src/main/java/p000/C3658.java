package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3658 extends C3657 {
    public C3658(C3669 c3669, WindowInsets windowInsets) {
        super(c3669, windowInsets);
    }

    @Override // p000.AbstractC3656, p000.C3665
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3658)) {
            return false;
        }
        C3658 c3658 = (C3658) obj;
        return Objects.equals(this.f11433, c3658.f11433) && Objects.equals(this.f11437, c3658.f11437) && AbstractC3656.m5261(this.f11438, c3658.f11438);
    }

    @Override // p000.C3665
    public int hashCode() {
        return this.f11433.hashCode();
    }

    @Override // p000.C3665
    public C3669 mo5287() {
        return C3669.m5299(null, this.f11433.consumeDisplayCutout());
    }

    @Override // p000.C3665
    public C1077 mo5288() {
        DisplayCutout displayCutout = this.f11433.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1077(displayCutout);
    }
}
