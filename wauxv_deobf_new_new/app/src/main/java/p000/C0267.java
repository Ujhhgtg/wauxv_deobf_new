package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲈᲀᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0267 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0276 f1509;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0253 f1510;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f1508 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f1511 = 8;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int[] f1512 = new int[8];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int[] f1513 = new int[8];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public float[] f1514 = new float[8];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f1515 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f1516 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f1517 = false;

    public C0267(C0276 c0276, C0253 c0253) {
        this.f1509 = c0276;
        this.f1510 = c0253;
    }

    public final String toString() {
        int i = this.f1515;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f1508; i2++) {
            StringBuilder sbM4787 = AbstractC2844.m4787(AbstractC2844.m4782(string, " -> "));
            sbM4787.append(this.f1514[i]);
            sbM4787.append(" : ");
            StringBuilder sbM4788 = AbstractC2844.m4787(sbM4787.toString());
            sbM4788.append(((C2845[]) this.f1510.f1480)[this.f1512[i]]);
            string = sbM4788.toString();
            i = this.f1513[i];
        }
        return string;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1501(C2845 c2845, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f1515;
            C0276 c0276 = this.f1509;
            if (i == -1) {
                this.f1515 = 0;
                this.f1514[0] = f;
                this.f1512[0] = c2845.f9048;
                this.f1513[0] = -1;
                c2845.f9057++;
                c2845.m4795(c0276);
                this.f1508++;
                if (this.f1517) {
                    return;
                }
                int i2 = this.f1516 + 1;
                this.f1516 = i2;
                int[] iArr = this.f1512;
                if (i2 >= iArr.length) {
                    this.f1517 = true;
                    this.f1516 = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f1508; i4++) {
                int i5 = this.f1512[i];
                int i6 = c2845.f9048;
                if (i5 == i6) {
                    float[] fArr = this.f1514;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f1515) {
                            this.f1515 = this.f1513[i];
                        } else {
                            int[] iArr2 = this.f1513;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c2845.m4796(c0276);
                        }
                        if (this.f1517) {
                            this.f1516 = i;
                        }
                        c2845.f9057--;
                        this.f1508--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f1513[i];
            }
            int length = this.f1516;
            int i7 = length + 1;
            if (this.f1517) {
                int[] iArr3 = this.f1512;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f1512;
            if (length >= iArr4.length && this.f1508 < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f1512;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f1512;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f1511 * 2;
                this.f1511 = i9;
                this.f1517 = false;
                this.f1516 = length - 1;
                this.f1514 = Arrays.copyOf(this.f1514, i9);
                this.f1512 = Arrays.copyOf(this.f1512, this.f1511);
                this.f1513 = Arrays.copyOf(this.f1513, this.f1511);
            }
            this.f1512[length] = c2845.f9048;
            this.f1514[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f1513;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f1513[length] = this.f1515;
                this.f1515 = length;
            }
            c2845.f9057++;
            c2845.m4795(c0276);
            this.f1508++;
            if (!this.f1517) {
                this.f1516++;
            }
            int i10 = this.f1516;
            int[] iArr8 = this.f1512;
            if (i10 >= iArr8.length) {
                this.f1517 = true;
                this.f1516 = iArr8.length - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m1502() {
        int i = this.f1515;
        for (int i2 = 0; i != -1 && i2 < this.f1508; i2++) {
            C2845 c2845 = ((C2845[]) this.f1510.f1480)[this.f1512[i]];
            if (c2845 != null) {
                c2845.m4796(this.f1509);
            }
            i = this.f1513[i];
        }
        this.f1515 = -1;
        this.f1516 = -1;
        this.f1517 = false;
        this.f1508 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final float m1503(C2845 c2845) {
        int i = this.f1515;
        for (int i2 = 0; i != -1 && i2 < this.f1508; i2++) {
            if (this.f1512[i] == c2845.f9048) {
                return this.f1514[i];
            }
            i = this.f1513[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int m1504() {
        return this.f1508;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2845 m1505(int i) {
        int i2 = this.f1515;
        for (int i3 = 0; i2 != -1 && i3 < this.f1508; i3++) {
            if (i3 == i) {
                return ((C2845[]) this.f1510.f1480)[this.f1512[i2]];
            }
            i2 = this.f1513[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final float m1506(int i) {
        int i2 = this.f1515;
        for (int i3 = 0; i2 != -1 && i3 < this.f1508; i3++) {
            if (i3 == i) {
                return this.f1514[i2];
            }
            i2 = this.f1513[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m1507(C2845 c2845, float f) {
        if (f == 0.0f) {
            m1508(c2845, true);
            return;
        }
        int i = this.f1515;
        C0276 c0276 = this.f1509;
        if (i == -1) {
            this.f1515 = 0;
            this.f1514[0] = f;
            this.f1512[0] = c2845.f9048;
            this.f1513[0] = -1;
            c2845.f9057++;
            c2845.m4795(c0276);
            this.f1508++;
            if (this.f1517) {
                return;
            }
            int i2 = this.f1516 + 1;
            this.f1516 = i2;
            int[] iArr = this.f1512;
            if (i2 >= iArr.length) {
                this.f1517 = true;
                this.f1516 = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f1508; i4++) {
            int i5 = this.f1512[i];
            int i6 = c2845.f9048;
            if (i5 == i6) {
                this.f1514[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f1513[i];
        }
        int length = this.f1516;
        int i7 = length + 1;
        if (this.f1517) {
            int[] iArr2 = this.f1512;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f1512;
        if (length >= iArr3.length && this.f1508 < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f1512;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f1512;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f1511 * 2;
            this.f1511 = i9;
            this.f1517 = false;
            this.f1516 = length - 1;
            this.f1514 = Arrays.copyOf(this.f1514, i9);
            this.f1512 = Arrays.copyOf(this.f1512, this.f1511);
            this.f1513 = Arrays.copyOf(this.f1513, this.f1511);
        }
        this.f1512[length] = c2845.f9048;
        this.f1514[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f1513;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f1513[length] = this.f1515;
            this.f1515 = length;
        }
        c2845.f9057++;
        c2845.m4795(c0276);
        int i10 = this.f1508 + 1;
        this.f1508 = i10;
        if (!this.f1517) {
            this.f1516++;
        }
        int[] iArr7 = this.f1512;
        if (i10 >= iArr7.length) {
            this.f1517 = true;
        }
        if (this.f1516 >= iArr7.length) {
            this.f1517 = true;
            this.f1516 = iArr7.length - 1;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final float m1508(C2845 c2845, boolean z) {
        int i = this.f1515;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f1508) {
            if (this.f1512[i] == c2845.f9048) {
                if (i == this.f1515) {
                    this.f1515 = this.f1513[i];
                } else {
                    int[] iArr = this.f1513;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c2845.m4796(this.f1509);
                }
                c2845.f9057--;
                this.f1508--;
                this.f1512[i] = -1;
                if (this.f1517) {
                    this.f1516 = i;
                }
                return this.f1514[i];
            }
            i2++;
            i3 = i;
            i = this.f1513[i];
        }
        return 0.0f;
    }
}
