package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0257 {

    public final C0266 f1435;

    public final C0243 f1436;

    public int f1434 = 0;

    public int f1437 = 8;

    public int[] f1438 = new int[8];

    public int[] f1439 = new int[8];

    public float[] f1440 = new float[8];

    public int f1441 = -1;

    public int f1442 = -1;

    public boolean f1443 = false;

    public C0257(C0266 c0266, C0243 c0243) {
        this.f1435 = c0266;
        this.f1436 = c0243;
    }

    public final String toString() {
        int i = this.f1441;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f1434; i2++) {
            StringBuilder sbM4753 = AbstractC2784.m4753(AbstractC2784.m4748(string, " -> "));
            sbM4753.append(this.f1440[i]);
            sbM4753.append(" : ");
            StringBuilder sbM4754 = AbstractC2784.m4753(sbM4753.toString());
            sbM4754.append(((C2785[]) this.f1436.f1406)[this.f1438[i]]);
            string = sbM4754.toString();
            i = this.f1439[i];
        }
        return string;
    }

    public final void m1355(C2785 c2785, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f1441;
            C0266 c0266 = this.f1435;
            if (i == -1) {
                this.f1441 = 0;
                this.f1440[0] = f;
                this.f1438[0] = c2785.f8886;
                this.f1439[0] = -1;
                c2785.f8895++;
                c2785.m4762(c0266);
                this.f1434++;
                if (this.f1443) {
                    return;
                }
                int i2 = this.f1442 + 1;
                this.f1442 = i2;
                int[] iArr = this.f1438;
                if (i2 >= iArr.length) {
                    this.f1443 = true;
                    this.f1442 = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f1434; i4++) {
                int i5 = this.f1438[i];
                int i6 = c2785.f8886;
                if (i5 == i6) {
                    float[] fArr = this.f1440;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f1441) {
                            this.f1441 = this.f1439[i];
                        } else {
                            int[] iArr2 = this.f1439;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c2785.m4763(c0266);
                        }
                        if (this.f1443) {
                            this.f1442 = i;
                        }
                        c2785.f8895--;
                        this.f1434--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f1439[i];
            }
            int length = this.f1442;
            int i7 = length + 1;
            if (this.f1443) {
                int[] iArr3 = this.f1438;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f1438;
            if (length >= iArr4.length && this.f1434 < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f1438;
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
            int[] iArr6 = this.f1438;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f1437 * 2;
                this.f1437 = i9;
                this.f1443 = false;
                this.f1442 = length - 1;
                this.f1440 = Arrays.copyOf(this.f1440, i9);
                this.f1438 = Arrays.copyOf(this.f1438, this.f1437);
                this.f1439 = Arrays.copyOf(this.f1439, this.f1437);
            }
            this.f1438[length] = c2785.f8886;
            this.f1440[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f1439;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f1439[length] = this.f1441;
                this.f1441 = length;
            }
            c2785.f8895++;
            c2785.m4762(c0266);
            this.f1434++;
            if (!this.f1443) {
                this.f1442++;
            }
            int i10 = this.f1442;
            int[] iArr8 = this.f1438;
            if (i10 >= iArr8.length) {
                this.f1443 = true;
                this.f1442 = iArr8.length - 1;
            }
        }
    }

    public final void m1356() {
        int i = this.f1441;
        for (int i2 = 0; i != -1 && i2 < this.f1434; i2++) {
            C2785 c2785 = ((C2785[]) this.f1436.f1406)[this.f1438[i]];
            if (c2785 != null) {
                c2785.m4763(this.f1435);
            }
            i = this.f1439[i];
        }
        this.f1441 = -1;
        this.f1442 = -1;
        this.f1443 = false;
        this.f1434 = 0;
    }

    public final float m1357(C2785 c2785) {
        int i = this.f1441;
        for (int i2 = 0; i != -1 && i2 < this.f1434; i2++) {
            if (this.f1438[i] == c2785.f8886) {
                return this.f1440[i];
            }
            i = this.f1439[i];
        }
        return 0.0f;
    }

    public final int m1358() {
        return this.f1434;
    }

    public final C2785 m1359(int i) {
        int i2 = this.f1441;
        for (int i3 = 0; i2 != -1 && i3 < this.f1434; i3++) {
            if (i3 == i) {
                return ((C2785[]) this.f1436.f1406)[this.f1438[i2]];
            }
            i2 = this.f1439[i2];
        }
        return null;
    }

    public final float m1360(int i) {
        int i2 = this.f1441;
        for (int i3 = 0; i2 != -1 && i3 < this.f1434; i3++) {
            if (i3 == i) {
                return this.f1440[i2];
            }
            i2 = this.f1439[i2];
        }
        return 0.0f;
    }

    public final void m1361(C2785 c2785, float f) {
        if (f == 0.0f) {
            m1362(c2785, true);
            return;
        }
        int i = this.f1441;
        C0266 c0266 = this.f1435;
        if (i == -1) {
            this.f1441 = 0;
            this.f1440[0] = f;
            this.f1438[0] = c2785.f8886;
            this.f1439[0] = -1;
            c2785.f8895++;
            c2785.m4762(c0266);
            this.f1434++;
            if (this.f1443) {
                return;
            }
            int i2 = this.f1442 + 1;
            this.f1442 = i2;
            int[] iArr = this.f1438;
            if (i2 >= iArr.length) {
                this.f1443 = true;
                this.f1442 = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f1434; i4++) {
            int i5 = this.f1438[i];
            int i6 = c2785.f8886;
            if (i5 == i6) {
                this.f1440[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f1439[i];
        }
        int length = this.f1442;
        int i7 = length + 1;
        if (this.f1443) {
            int[] iArr2 = this.f1438;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f1438;
        if (length >= iArr3.length && this.f1434 < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f1438;
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
        int[] iArr5 = this.f1438;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f1437 * 2;
            this.f1437 = i9;
            this.f1443 = false;
            this.f1442 = length - 1;
            this.f1440 = Arrays.copyOf(this.f1440, i9);
            this.f1438 = Arrays.copyOf(this.f1438, this.f1437);
            this.f1439 = Arrays.copyOf(this.f1439, this.f1437);
        }
        this.f1438[length] = c2785.f8886;
        this.f1440[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f1439;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f1439[length] = this.f1441;
            this.f1441 = length;
        }
        c2785.f8895++;
        c2785.m4762(c0266);
        int i10 = this.f1434 + 1;
        this.f1434 = i10;
        if (!this.f1443) {
            this.f1442++;
        }
        int[] iArr7 = this.f1438;
        if (i10 >= iArr7.length) {
            this.f1443 = true;
        }
        if (this.f1442 >= iArr7.length) {
            this.f1443 = true;
            this.f1442 = iArr7.length - 1;
        }
    }

    public final float m1362(C2785 c2785, boolean z) {
        int i = this.f1441;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f1434) {
            if (this.f1438[i] == c2785.f8886) {
                if (i == this.f1441) {
                    this.f1441 = this.f1439[i];
                } else {
                    int[] iArr = this.f1439;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c2785.m4763(this.f1435);
                }
                c2785.f8895--;
                this.f1434--;
                this.f1438[i] = -1;
                if (this.f1443) {
                    this.f1442 = i;
                }
                return this.f1440[i];
            }
            i2++;
            i3 = i;
            i = this.f1439[i];
        }
        return 0.0f;
    }
}
