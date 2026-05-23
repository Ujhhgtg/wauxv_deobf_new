package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3564 {

    public int f11174;

    public int f11175;

    public int f11176;

    public int f11177;

    public int f11178;

    public final boolean m5147() {
        int i;
        int i2;
        int i3;
        int i4 = this.f11174;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.f11177;
            int i7 = this.f11175;
            if (i6 > i7) {
                i3 = 1;
            } else {
                i3 = i6 == i7 ? 2 : 4;
            }
            if ((i3 & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.f11177;
            int i9 = this.f11176;
            if (i8 > i9) {
                i2 = 1;
            } else {
                i2 = i8 == i9 ? 2 : 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.f11178;
            int i11 = this.f11175;
            if (i10 > i11) {
                i = 1;
            } else {
                i = i10 == i11 ? 2 : 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.f11178;
            int i13 = this.f11176;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if ((i4 & (i5 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
