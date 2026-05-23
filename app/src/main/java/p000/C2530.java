package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2530 implements InterfaceC0874 {

    public final float f8071;

    public C2530(float f) {
        this.f8071 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2530) && this.f8071 == ((C2530) obj).f8071;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8071)});
    }

    @Override // p000.InterfaceC0874
    public final float mo916(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f8071;
    }
}
