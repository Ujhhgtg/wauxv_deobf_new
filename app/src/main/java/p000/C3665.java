package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3665 {

    public static final C3669 f11449;

    public final C3669 f11450;

    static {
        AbstractC3655 c3649;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            c3649 = new C3654();
        } else if (i >= 35) {
            c3649 = new C3653();
        } else if (i >= 34) {
            c3649 = new C3652();
        } else if (i >= 31) {
            c3649 = new C3651();
        } else if (i >= 30) {
            c3649 = new C3650();
        } else {
            c3649 = i >= 29 ? new C3649() : new C3648();
        }
        f11449 = c3649.mo5245().f11452.mo5287().f11452.mo5282().f11452.mo5283();
    }

    public C3665(C3669 c3669) {
        this.f11450 = c3669;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3665)) {
            return false;
        }
        C3665 c3665 = (C3665) obj;
        return mo5270() == c3665.mo5270() && mo5285() == c3665.mo5285() && Objects.equals(mo5266(), c3665.mo5266()) && Objects.equals(mo5284(), c3665.mo5284()) && Objects.equals(mo5288(), c3665.mo5288());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo5270()), Boolean.valueOf(mo5285()), mo5266(), mo5284(), mo5288());
    }

    public C3669 mo5287() {
        return this.f11450;
    }

    public C3669 mo5282() {
        return this.f11450;
    }

    public C3669 mo5283() {
        return this.f11450;
    }

    public List<Rect> mo5263(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> mo5264(int i) {
        return Collections.EMPTY_LIST;
    }

    public C1077 mo5288() {
        return null;
    }

    public C1646 mo5265(int i) {
        return C1646.f5579;
    }

    public C1646 mo5289() {
        return mo5266();
    }

    public C1646 mo5284() {
        return C1646.f5579;
    }

    public C1646 mo5290() {
        return mo5266();
    }

    public C1646 mo5266() {
        return C1646.f5579;
    }

    public C1646 mo5291() {
        return mo5266();
    }

    public C3669 mo5269(int i, int i2, int i3, int i4) {
        return f11449;
    }

    public boolean mo5285() {
        return false;
    }

    public boolean mo5270() {
        return false;
    }

    public boolean mo5271(int i) {
        return true;
    }

    public void mo5268() {
    }

    public void mo5262(View view) {
    }

    public void mo5267(View view) {
    }

    public void mo5272(C1079 c1079) {
    }

    public void mo5273(C1646[] c1646Arr) {
    }

    public void mo5274(C3669 c3669) {
    }

    public void mo5286(C1646 c1646) {
    }

    public void mo5275(int i) {
    }

    public void mo5276(Rect[][] rectArr) {
    }

    public void mo5277(Rect[][] rectArr) {
    }
}
