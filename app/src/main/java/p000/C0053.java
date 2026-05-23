package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0053 implements InterfaceC0874 {

    public final float f987;

    public C0053(float f) {
        this.f987 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0053) && this.f987 == ((C0053) obj).f987;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f987)});
    }

    @Override // p000.InterfaceC0874
    public final float mo916(RectF rectF) {
        return this.f987;
    }
}
