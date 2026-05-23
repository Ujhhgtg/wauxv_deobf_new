package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0148 implements InterfaceC0874 {

    public final InterfaceC0874 f1156;

    public final float f1157;

    public C0148(float f, InterfaceC0874 interfaceC0874) {
        while (interfaceC0874 instanceof C0148) {
            interfaceC0874 = ((C0148) interfaceC0874).f1156;
            f += ((C0148) interfaceC0874).f1157;
        }
        this.f1156 = interfaceC0874;
        this.f1157 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0148)) {
            return false;
        }
        C0148 c0148 = (C0148) obj;
        return this.f1156.equals(c0148.f1156) && this.f1157 == c0148.f1157;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1156, Float.valueOf(this.f1157)});
    }

    @Override // p000.InterfaceC0874
    public final float mo916(RectF rectF) {
        return Math.max(0.0f, this.f1156.mo916(rectF) + this.f1157);
    }
}
