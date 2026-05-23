package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p000.AbstractC2461;
import p000.AbstractC3603;
import p000.C0407;
import p000.C0779;
import p000.C0784;
import p000.C0793;
import p000.C0794;
import p000.C1366;
import p000.C1367;
import p000.C1506;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC3603 {

    public final C1367 f196;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2891 = new int[32];
        this.f2897 = new HashMap();
        this.f2893 = context;
        super.mo2289(attributeSet);
        C1367 c1367 = new C1367();
        c1367.f4893 = 0;
        c1367.f4894 = 0;
        c1367.f4895 = 0;
        c1367.f4896 = 0;
        c1367.f4897 = 0;
        c1367.f4898 = 0;
        c1367.f4899 = false;
        c1367.f4900 = 0;
        c1367.f4901 = 0;
        c1367.f4902 = new C0407();
        c1367.f4903 = null;
        c1367.f4904 = -1;
        c1367.f4905 = -1;
        c1367.f4906 = -1;
        c1367.f4907 = -1;
        c1367.f4908 = -1;
        c1367.f4909 = -1;
        c1367.f4910 = 0.5f;
        c1367.f4911 = 0.5f;
        c1367.f4912 = 0.5f;
        c1367.f4913 = 0.5f;
        c1367.f4914 = 0.5f;
        c1367.f4915 = 0.5f;
        c1367.f4916 = 0;
        c1367.f4917 = 0;
        c1367.f4918 = 2;
        c1367.f4919 = 2;
        c1367.f4920 = 0;
        c1367.f4921 = -1;
        c1367.f4922 = 0;
        c1367.f4923 = new ArrayList();
        c1367.f4924 = null;
        c1367.f4925 = null;
        c1367.f4926 = null;
        c1367.f4928 = 0;
        this.f196 = c1367;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2461.f7810);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f196.f4922 = typedArrayObtainStyledAttributes.getInt(0, 0);
                } else if (index == 1) {
                    C1367 c1368 = this.f196;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
                    c1368.f4893 = dimensionPixelSize;
                    c1368.f4894 = dimensionPixelSize;
                    c1368.f4895 = dimensionPixelSize;
                    c1368.f4896 = dimensionPixelSize;
                } else if (index == 11) {
                    C1367 c1369 = this.f196;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
                    c1369.f4895 = dimensionPixelSize2;
                    c1369.f4897 = dimensionPixelSize2;
                    c1369.f4898 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f196.f4896 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
                } else if (index == 2) {
                    this.f196.f4897 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
                } else if (index == 3) {
                    this.f196.f4893 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
                } else if (index == 4) {
                    this.f196.f4898 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                } else if (index == 5) {
                    this.f196.f4894 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
                } else if (index == 38) {
                    this.f196.f4920 = typedArrayObtainStyledAttributes.getInt(38, 0);
                } else if (index == 28) {
                    this.f196.f4904 = typedArrayObtainStyledAttributes.getInt(28, 0);
                } else if (index == 37) {
                    this.f196.f4905 = typedArrayObtainStyledAttributes.getInt(37, 0);
                } else if (index == 22) {
                    this.f196.f4906 = typedArrayObtainStyledAttributes.getInt(22, 0);
                } else if (index == 30) {
                    this.f196.f4908 = typedArrayObtainStyledAttributes.getInt(30, 0);
                } else if (index == 24) {
                    this.f196.f4907 = typedArrayObtainStyledAttributes.getInt(24, 0);
                } else if (index == 32) {
                    this.f196.f4909 = typedArrayObtainStyledAttributes.getInt(32, 0);
                } else if (index == 26) {
                    this.f196.f4910 = typedArrayObtainStyledAttributes.getFloat(26, 0.5f);
                } else if (index == 21) {
                    this.f196.f4912 = typedArrayObtainStyledAttributes.getFloat(21, 0.5f);
                } else if (index == 29) {
                    this.f196.f4914 = typedArrayObtainStyledAttributes.getFloat(29, 0.5f);
                } else if (index == 23) {
                    this.f196.f4913 = typedArrayObtainStyledAttributes.getFloat(23, 0.5f);
                } else if (index == 31) {
                    this.f196.f4915 = typedArrayObtainStyledAttributes.getFloat(31, 0.5f);
                } else if (index == 35) {
                    this.f196.f4911 = typedArrayObtainStyledAttributes.getFloat(35, 0.5f);
                } else if (index == 25) {
                    this.f196.f4918 = typedArrayObtainStyledAttributes.getInt(25, 2);
                } else if (index == 34) {
                    this.f196.f4919 = typedArrayObtainStyledAttributes.getInt(34, 2);
                } else if (index == 27) {
                    this.f196.f4916 = typedArrayObtainStyledAttributes.getDimensionPixelSize(27, 0);
                } else if (index == 36) {
                    this.f196.f4917 = typedArrayObtainStyledAttributes.getDimensionPixelSize(36, 0);
                } else if (index == 33) {
                    this.f196.f4921 = typedArrayObtainStyledAttributes.getInt(33, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2894 = this.f196;
        m2290();
    }

    @Override // p000.AbstractC0781, android.view.View
    public final void onMeasure(int i, int i2) {
        mo52(this.f196, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f196.f4912 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f196.f4906 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f196.f4913 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f196.f4907 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f196.f4918 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f196.f4910 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f196.f4916 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f196.f4904 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f196.f4921 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f196.f4922 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C1367 c1367 = this.f196;
        c1367.f4893 = i;
        c1367.f4894 = i;
        c1367.f4895 = i;
        c1367.f4896 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f196.f4894 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f196.f4897 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f196.f4898 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f196.f4893 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f196.f4919 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f196.f4911 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f196.f4917 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f196.f4905 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f196.f4920 = i;
        requestLayout();
    }

    @Override // p000.AbstractC0781
    public final void mo51(C0793 c0793, boolean z) {
        C1367 c1367 = this.f196;
        int i = c1367.f4895;
        if (i > 0 || c1367.f4896 > 0) {
            if (z) {
                c1367.f4897 = c1367.f4896;
                c1367.f4898 = i;
            } else {
                c1367.f4897 = i;
                c1367.f4898 = c1367.f4896;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x018b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0193  */
    /* JADX WARN: Code duplicated, block: B:109:0x019b  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:147:0x0207  */
    /* JADX WARN: Code duplicated, block: B:150:0x0212  */
    /* JADX WARN: Code duplicated, block: B:158:0x022c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0240  */
    /* JADX WARN: Code duplicated, block: B:168:0x025e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0264 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x0266  */
    /* JADX WARN: Code duplicated, block: B:176:0x0276  */
    /* JADX WARN: Code duplicated, block: B:178:0x027e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x0280  */
    /* JADX WARN: Code duplicated, block: B:184:0x0295  */
    /* JADX WARN: Code duplicated, block: B:188:0x029e  */
    /* JADX WARN: Code duplicated, block: B:189:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:195:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:197:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:198:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:200:0x030e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0316  */
    /* JADX WARN: Code duplicated, block: B:204:0x0329  */
    /* JADX WARN: Code duplicated, block: B:220:0x034c  */
    /* JADX WARN: Code duplicated, block: B:222:0x035f  */
    /* JADX WARN: Code duplicated, block: B:224:0x0365  */
    /* JADX WARN: Code duplicated, block: B:225:0x0370  */
    /* JADX WARN: Code duplicated, block: B:228:0x0381  */
    /* JADX WARN: Code duplicated, block: B:230:0x0388  */
    /* JADX WARN: Code duplicated, block: B:232:0x039b  */
    /* JADX WARN: Code duplicated, block: B:233:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:249:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:251:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:253:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:262:0x040f  */
    /* JADX WARN: Code duplicated, block: B:267:0x0418  */
    /* JADX WARN: Code duplicated, block: B:269:0x0420  */
    /* JADX WARN: Code duplicated, block: B:270:0x042a  */
    /* JADX WARN: Code duplicated, block: B:274:0x044b  */
    /* JADX WARN: Code duplicated, block: B:276:0x0453  */
    /* JADX WARN: Code duplicated, block: B:278:0x0457  */
    /* JADX WARN: Code duplicated, block: B:279:0x0468  */
    /* JADX WARN: Code duplicated, block: B:282:0x0488  */
    /* JADX WARN: Code duplicated, block: B:284:0x0491  */
    /* JADX WARN: Code duplicated, block: B:286:0x0495  */
    /* JADX WARN: Code duplicated, block: B:287:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:290:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:294:0x04d9 A[PHI: r16 r37 r38 r39 r40 r41 r42 r43
      0x04d9: PHI (r16v3 int) = (r16v1 int), (r16v4 int), (r16v5 int) binds: [B:296:0x04f9, B:293:0x04d3, B:197:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x04d9: PHI (r37v1 char) = (r37v0 char), (r37v4 char), (r37v5 char) binds: [B:296:0x04f9, B:293:0x04d3, B:197:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x04d9: PHI (r38v1 int) = (r38v0 int), (r38v4 int), (r38v5 int) binds: [B:296:0x04f9, B:293:0x04d3, B:197:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x04d9: PHI (r39v1 int) = (r39v0 int), (r39v4 int), (r39v5 int) binds: [B:296:0x04f9, B:293:0x04d3, B:197:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x04d9: PHI (r40v1 int) = (r40v0 int), (r40v4 int), (r40v5 int) binds: [B:296:0x04f9, B:293:0x04d3, B:197:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x04d9: PHI (r41v1 int[]) = (r41v0 int[]), (r41v4 int[]), (r41v5 int[]) binds: [B:296:0x04f9, B:293:0x04d3, B:197:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x04d9: PHI (r42v1 int) = (r42v0 int), (r42v5 int), (r42v6 int) binds: [B:296:0x04f9, B:293:0x04d3, B:197:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x04d9: PHI (r43v1 int) = (r43v0 int), (r43v5 int), (r43v6 int) binds: [B:296:0x04f9, B:293:0x04d3, B:197:0x02d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:295:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:298:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:300:0x0502  */
    /* JADX WARN: Code duplicated, block: B:301:0x050e  */
    /* JADX WARN: Code duplicated, block: B:304:0x0548 A[LOOP:14: B:303:0x0546->B:304:0x0548, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:308:0x056f A[PHI: r10
      0x056f: PHI (r10v5 int) = (r10v0 int), (r10v2 int), (r10v3 int) binds: [B:307:0x056d, B:312:0x057b, B:310:0x0574] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:309:0x0572 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:310:0x0574  */
    /* JADX WARN: Code duplicated, block: B:311:0x0579 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:312:0x057b  */
    /* JADX WARN: Code duplicated, block: B:313:0x057d  */
    /* JADX WARN: Code duplicated, block: B:315:0x0582  */
    /* JADX WARN: Code duplicated, block: B:316:0x0585 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:317:0x0587  */
    /* JADX WARN: Code duplicated, block: B:318:0x058e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:319:0x0590  */
    /* JADX WARN: Code duplicated, block: B:320:0x0592  */
    /* JADX WARN: Code duplicated, block: B:323:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:324:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:334:0x0107 A[EDGE_INSN: B:334:0x0107->B:62:0x0107 BREAK  A[LOOP:1: B:56:0x00f0->B:61:0x0102], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x0178 A[EDGE_INSN: B:340:0x0178->B:95:0x0178 BREAK  A[LOOP:3: B:83:0x015a->B:94:0x0173], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0178 A[EDGE_INSN: B:341:0x0178->B:95:0x0178 BREAK  A[LOOP:3: B:83:0x015a->B:94:0x0173], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x01a1 A[EDGE_INSN: B:360:0x01a1->B:111:0x01a1 BREAK  A[LOOP:9: B:100:0x0187->B:110:0x019e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x0100  */
    /* JADX WARN: Code duplicated, block: B:63:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x0112  */
    /* JADX WARN: Code duplicated, block: B:68:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x0136  */
    /* JADX WARN: Code duplicated, block: B:75:0x0139  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    /* JADX WARN: Code duplicated, block: B:78:0x014f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0153  */
    /* JADX WARN: Code duplicated, block: B:82:0x0157  */
    /* JADX WARN: Code duplicated, block: B:85:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0160  */
    /* JADX WARN: Code duplicated, block: B:90:0x0168  */
    /* JADX WARN: Code duplicated, block: B:93:0x0170  */
    /* JADX WARN: Code duplicated, block: B:96:0x017a  */
    /* JADX WARN: Code duplicated, block: B:97:0x017e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC3603
    public final void mo52(C1367 c1367, int i, int i2) {
        C0779 c0779;
        C0779 c07710;
        C0779 c07711;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        C0793[] c0793Arr;
        int i10;
        int i11;
        int i12;
        int i13;
        C0793[] c0793Arr2;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int i20;
        char c;
        int i21;
        int i22;
        int i23;
        C1366 c1366;
        int i24;
        char c2;
        int i25;
        int i26;
        int iMin;
        boolean z;
        int i27;
        int i28;
        C1366 c1368;
        C0779 c07712;
        int i29;
        C0779 c07713;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        C0793 c0793;
        int iM3087;
        int i35;
        int i36;
        boolean z2;
        int i37;
        int i38;
        int i39;
        int size;
        int[] iArr3;
        boolean z3;
        C0779 c07714;
        C0779 c07715;
        C0779 c07716;
        C0779 c07717;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int iMax;
        int i45;
        C1366 c1369;
        int iM3083;
        int iM3082;
        int i46;
        C1366 c13610;
        int i47;
        int i48;
        C0793 c0794;
        int iM3088;
        C0779 c07718;
        C0779 c07719;
        boolean z4;
        int i49;
        int i50;
        int i51;
        int iCeil;
        int iCeil2;
        int i52;
        int i53;
        int i54;
        C0793 c0795;
        int iM3089;
        boolean z5;
        C0793[] c0793Arr3;
        C0793[] c0793Arr4;
        int i55;
        int i56;
        int i57;
        int iM30810;
        int i58;
        int iM30811;
        C0793 c0796;
        C0793 c0797;
        int i59;
        int i60;
        int i61;
        C0793 c0798;
        int i62;
        C0793 c0799;
        C0793 c07910;
        int i63;
        int i64;
        int i65;
        C0793 c07911;
        int iM30812;
        C0793[] c0793Arr5;
        int i66;
        int i67;
        C0793 c07912;
        C0793[] c0793Arr6;
        int i68;
        int i69;
        C0779 c07720;
        C0779 c07721;
        C0779 c07722;
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        if (c1367 == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        C0779 c07723 = c1367.f3102;
        C0779 c07724 = c1367.f3101;
        C0779 c07725 = c1367.f3103;
        C0779 c07726 = c1367.f3104;
        ArrayList arrayList = c1367.f4923;
        if (c1367.f5368 > 0) {
            C0407 c0407 = c1367.f4902;
            C0793 c07913 = c1367.f3112;
            C0784 c0784 = c07913 != null ? ((C0794) c07913).f3138 : null;
            if (c0784 == null) {
                c1367.f4900 = 0;
                c1367.f4901 = 0;
                c1367.f4899 = false;
            } else {
                int i70 = 0;
                while (i70 < c1367.f5368) {
                    C0793 c07914 = c1367.f5367[i70];
                    if (c07914 == null || (c07914 instanceof C1506)) {
                        i69 = i70;
                        c07720 = c07724;
                        c07721 = c07723;
                        c07722 = c07725;
                    } else {
                        i69 = i70;
                        int iM2312 = c07914.m2312(0);
                        c07720 = c07724;
                        int iM2313 = c07914.m2312(1);
                        c07721 = c07723;
                        if (iM2312 == 3) {
                            c07722 = c07725;
                            if (c07914.f3084 == 1 || iM2313 != 3 || c07914.f3085 == 1) {
                            }
                        } else {
                            c07722 = c07725;
                        }
                        if (iM2312 == 3) {
                            iM2312 = 2;
                        }
                        if (iM2313 == 3) {
                            iM2313 = 2;
                        }
                        c0407.f1910 = iM2312;
                        c0407.f1911 = iM2313;
                        c0407.f1912 = c07914.m2316();
                        c0407.f1913 = c07914.m2313();
                        c0784.m2293(c07914, c0407);
                        c07914.m2334(c0407.f1914);
                        c07914.m2331(c0407.f1915);
                        c07914.m2328(c0407.f1916);
                    }
                    i70 = i69 + 1;
                    c07723 = c07721;
                    c07724 = c07720;
                    c07725 = c07722;
                }
                c0779 = c07724;
                c07710 = c07723;
                c07711 = c07725;
                i3 = c1367.f4897;
                i4 = c1367.f4898;
                i5 = c1367.f4893;
                i6 = c1367.f4894;
                iArr = new int[2];
                i7 = (size2 - i3) - i4;
                i8 = c1367.f4922;
                if (i8 == 1) {
                    i7 = (size3 - i5) - i6;
                }
                if (i8 == 0) {
                    if (c1367.f4904 == -1) {
                        i68 = 0;
                        c1367.f4904 = 0;
                    } else {
                        i68 = 0;
                    }
                    i9 = i4;
                    if (c1367.f4905 == -1) {
                        c1367.f4905 = 0;
                    }
                } else {
                    i9 = i4;
                    if (c1367.f4904 == -1) {
                        c1367.f4904 = 0;
                    }
                    if (c1367.f4905 == -1) {
                        c1367.f4905 = 0;
                    }
                }
                c0793Arr = c1367.f5367;
                i10 = 0;
                i11 = 0;
                while (true) {
                    i12 = c1367.f5368;
                    i13 = i5;
                    if (i10 < i12) {
                        break;
                    }
                    if (c1367.f5367[i10].f3125 == 8) {
                        i11++;
                    }
                    i10++;
                    i5 = i13;
                }
                if (i11 > 0) {
                    c0793Arr5 = new C0793[i12 - i11];
                    i66 = 0;
                    i67 = 0;
                    while (false) {
                        c07912 = c1367.f5367[i66];
                        c0793Arr6 = c0793Arr5;
                        if (c07912.f3125 != 8) {
                            c0793Arr6[i67] = c07912;
                            i67++;
                        }
                        i66++;
                        c0793Arr5 = c0793Arr6;
                    }
                    c0793Arr = c0793Arr5;
                    i12 = 0;
                }
                c0793Arr2 = c0793Arr;
                c1367.f4927 = c0793Arr2;
                c1367.f4928 = i12;
                i14 = c1367.f4920;
                if (i14 != 0) {
                    i15 = i6;
                    i16 = i7;
                    iArr2 = iArr;
                    i17 = mode2;
                    i18 = size3;
                    i19 = i9;
                    i20 = i13;
                    c = 1;
                    i21 = i12;
                    i22 = i3;
                    i23 = c1367.f4922;
                    if (i21 == 0) {
                        i22 = i22;
                        c2 = 0;
                    } else {
                        if (arrayList.size() == 0) {
                            c1366 = new C1366(c1367, i23, c0779, c07710, c07711, c07726, i16);
                            arrayList.add(c1366);
                        } else {
                            C1366 c13611 = (C1366) arrayList.get(0);
                            c13611.f4877 = 0;
                            c13611.f4876 = null;
                            c13611.f4886 = 0;
                            c13611.f4887 = 0;
                            c13611.f4888 = 0;
                            c13611.f4889 = 0;
                            c13611.f4890 = 0;
                            c13611.m3085(i23, c0779, c07710, c07711, c07726, c1367.f4897, c1367.f4893, c1367.f4898, c1367.f4894, i16);
                            c1366 = c13611;
                        }
                        for (i24 = 0; i24 < i21; i24++) {
                            c1366.m3080(c0793Arr2[i24]);
                        }
                        c2 = 0;
                        iArr2[0] = c1366.m3083();
                        iArr2[1] = c1366.m3082();
                    }
                } else if (true) {
                    i27 = i12;
                    i28 = c1367.f4922;
                    if (i27 == 0) {
                        c = 1;
                        iArr2 = iArr;
                        i17 = mode2;
                        i18 = size3;
                        i22 = i3;
                        i19 = i9;
                        i15 = i6;
                        i20 = i13;
                    } else {
                        arrayList.clear();
                        iArr2 = iArr;
                        c = 1;
                        c07712 = c0779;
                        i19 = i9;
                        i15 = i6;
                        i20 = i13;
                        i29 = i7;
                        c07713 = c07710;
                        i22 = i3;
                        c1368 = new C1366(c1367, i28, c07712, c07713, c07711, c07726, i29);
                        arrayList.add(c1368);
                        if (i28 == 0) {
                            i30 = 0;
                            i47 = 0;
                            i34 = 0;
                            for (i48 = 0; i48 < i27; i48++) {
                                c0794 = c0793Arr2[i48];
                                iM3088 = c1367.m3088(c0794, i29);
                                c07718 = c07712;
                                c07719 = c07713;
                                if (c0794.f3134[0] == 3) {
                                    i34++;
                                }
                                z4 = (i47 != i29 || (c1367.f4916 + i47) + iM3088 > i29) && c1368.f4876 != null;
                                if (!z4 && i48 > 0 && (i49 = c1367.f4921) > 0 && i48 % i49 == 0) {
                                    z4 = true;
                                }
                                if (z4) {
                                    c07712 = c07718;
                                    c07713 = c07719;
                                    c1368 = new C1366(c1367, 0, c07712, c07713, c07711, c07726, i29);
                                    c1368.f4888 = i48;
                                    arrayList.add(c1368);
                                } else {
                                    c07712 = c07718;
                                    c07713 = c07719;
                                    if (i48 > 0) {
                                        i47 = c1367.f4916 + iM3088 + i47;
                                        c1368 = c1368;
                                    }
                                    c1368.m3080(c0794);
                                }
                                i47 = iM3088;
                                c1368.m3080(c0794);
                            }
                        } else {
                            i30 = i28;
                            i31 = 0;
                            i32 = 0;
                            i33 = 0;
                            while (i31 < i27) {
                                int i71 = size3;
                                c0793 = c0793Arr2[i31];
                                iM3087 = c1367.m3087(c0793, i29);
                                i35 = i32;
                                int i72 = mode2;
                                if (c0793.f3134[1] == 3) {
                                    i36 = i35 + 1;
                                } else {
                                    i36 = i35;
                                }
                                z2 = (i33 != i29 || (c1367.f4917 + i33) + iM3087 > i29) && c1368.f4876 != null;
                                if (!z2 && i31 > 0 && (i38 = c1367.f4921) > 0 && i31 % i38 == 0) {
                                    z2 = true;
                                }
                                if (z2) {
                                    i37 = i30;
                                    c1368 = new C1366(c1367, i37, c07712, c07713, c07711, c07726, i29);
                                    c1368.f4888 = i31;
                                    arrayList.add(c1368);
                                } else {
                                    i37 = i30;
                                    if (i31 > 0) {
                                        i33 = c1367.f4917 + iM3087 + i33;
                                    }
                                    c1368.m3080(c0793);
                                    i31++;
                                    i30 = i37;
                                    i32 = i36;
                                    size3 = i71;
                                    mode2 = i72;
                                }
                                i33 = iM3087;
                                c1368.m3080(c0793);
                                i31++;
                                i30 = i37;
                                i32 = i36;
                                size3 = i71;
                                mode2 = i72;
                            }
                            i34 = i32;
                        }
                        i17 = mode2;
                        i18 = size3;
                        i39 = i30;
                        size = arrayList.size();
                        int i73 = c1367.f4897;
                        int i74 = c1367.f4893;
                        int i75 = c1367.f4898;
                        int i76 = c1367.f4894;
                        iArr3 = c1367.f3134;
                        if (iArr3[0] != 2 || iArr3[1] == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i34 > 0 && z3) {
                            for (i46 = 0; i46 < size; i46++) {
                                c13610 = (C1366) arrayList.get(i46);
                                if (i39 == 0) {
                                    c13610.m3084(i29 - c13610.m3083());
                                } else {
                                    c13610.m3084(i29 - c13610.m3082());
                                }
                            }
                        }
                        c07714 = c07712;
                        c07715 = c07713;
                        c07716 = c07711;
                        c07717 = c07726;
                        i40 = i74;
                        i41 = i75;
                        i42 = i76;
                        i43 = i73;
                        iMax = 0;
                        i45 = 0;
                        for (i44 = 0; i44 < size; i44++) {
                            c1369 = (C1366) arrayList.get(i44);
                            if (i39 == 0) {
                                if (i44 < size - 1) {
                                    c07717 = ((C1366) arrayList.get(i44 + 1)).f4876.f3102;
                                    i42 = 0;
                                } else {
                                    c07717 = c07726;
                                    i42 = c1367.f4894;
                                }
                                C0779 c07727 = c1369.f4876.f3104;
                                c1369.m3085(0, c07714, c07715, c07716, c07717, i43, i40, i41, i42, i29);
                                iMax = Math.max(iMax, c1369.m3083());
                                iM3082 = c1369.m3082() + i45;
                                if (i44 > 0) {
                                    iM3082 += c1367.f4917;
                                }
                                i45 = iM3082;
                                c07715 = c07727;
                                i40 = 0;
                            } else {
                                if (i44 < size - 1) {
                                    c07716 = ((C1366) arrayList.get(i44 + 1)).f4876.f3101;
                                    i41 = 0;
                                } else {
                                    c07716 = c07711;
                                    i41 = c1367.f4898;
                                }
                                C0779 c07728 = c1369.f4876.f3103;
                                c1369.m3085(i39, c07714, c07715, c07716, c07717, i43, i40, i41, i42, i29);
                                iM3083 = c1369.m3083() + iMax;
                                int iMax2 = Math.max(i45, c1369.m3082());
                                if (i44 > 0) {
                                    iM3083 += c1367.f4916;
                                }
                                i45 = iMax2;
                                iMax = iM3083;
                                c07714 = c07728;
                                i43 = 0;
                            }
                        }
                        iArr2[0] = iMax;
                        iArr2[1] = i45;
                    }
                    i22 = i22;
                    c2 = 0;
                } else if (i14 != 2) {
                    i15 = i6;
                    iArr2 = iArr;
                    i17 = mode2;
                    i18 = size3;
                    i22 = i3;
                    i19 = i9;
                    i20 = i13;
                    c2 = 0;
                    c = 1;
                } else {
                    i50 = c1367.f4922;
                    if (i50 == 0) {
                        i63 = c1367.f4921;
                        if (i63 <= 0) {
                            i64 = 0;
                            i65 = 0;
                            iCeil2 = 0;
                            while (true) {
                                i51 = i6;
                                if (i64 >= i12) {
                                    break;
                                }
                                if (i64 > 0) {
                                    i65 += c1367.f4916;
                                }
                                c07911 = c0793Arr2[i64];
                                if (c07911 != null) {
                                    iM30812 = c1367.m3088(c07911, i7) + i65;
                                    if (iM30812 > i7) {
                                        break;
                                    }
                                    iCeil2++;
                                    i65 = iM30812;
                                }
                                i64++;
                                i6 = i51;
                            }
                        } else {
                            i51 = i6;
                            iCeil2 = i63;
                        }
                        iCeil = 0;
                    } else {
                        i51 = i6;
                        iCeil = c1367.f4921;
                        if (iCeil <= 0) {
                            i53 = 0;
                            i54 = 0;
                            for (i52 = 0; i52 < i12; i52++) {
                                if (i52 > 0) {
                                    i53 += c1367.f4917;
                                }
                                c0795 = c0793Arr2[i52];
                                if (c0795 != null) {
                                    iM3089 = c1367.m3087(c0795, i7) + i53;
                                    if (iM3089 > i7) {
                                        break;
                                    }
                                    i54++;
                                    i53 = iM3089;
                                }
                            }
                            iCeil = i54;
                        }
                        iCeil2 = 0;
                    }
                    if (c1367.f4926 == null) {
                        c1367.f4926 = new int[2];
                    }
                    z5 = (iCeil != 0 && i50 == 1) || (iCeil2 == 0 && i50 == 0);
                    while (!z5) {
                        if (i50 == 0) {
                            iCeil = (int) Math.ceil(i12 / iCeil2);
                        } else {
                            iCeil2 = (int) Math.ceil(i12 / iCeil);
                        }
                        c0793Arr3 = c1367.f4925;
                        if (c0793Arr3 != null || c0793Arr3.length < iCeil2) {
                            c1367.f4925 = new C0793[iCeil2];
                        } else {
                            Arrays.fill(c0793Arr3, (Object) null);
                        }
                        c0793Arr4 = c1367.f4924;
                        if (c0793Arr4 != null || c0793Arr4.length < iCeil) {
                            c1367.f4924 = new C0793[iCeil];
                        } else {
                            Arrays.fill(c0793Arr4, (Object) null);
                        }
                        i55 = 0;
                        while (i55 < iCeil2) {
                            i59 = 0;
                            while (i59 < iCeil) {
                                i60 = (i59 * iCeil2) + i55;
                                int i77 = i12;
                                if (i50 == 1) {
                                    i60 = (i55 * iCeil) + i59;
                                }
                                i61 = i60;
                                int i78 = i50;
                                if (i61 >= c0793Arr2.length && (c0798 = c0793Arr2[i61]) != null) {
                                    int iM30813 = c1367.m3088(c0798, i7);
                                    i62 = i55;
                                    c0799 = c1367.f4925[i62];
                                    if (c0799 != null || c0799.m2316() < iM30813) {
                                        c1367.f4925[i62] = c0798;
                                    }
                                    int iM30814 = c1367.m3087(c0798, i7);
                                    c07910 = c1367.f4924[i59];
                                    if (c07910 != null || c07910.m2313() < iM30814) {
                                        c1367.f4924[i59] = c0798;
                                    }
                                } else {
                                    i62 = i55;
                                }
                                i59++;
                                i50 = i78;
                                i55 = i62;
                                i12 = i77;
                            }
                            i55++;
                        }
                        int i79 = i12;
                        i56 = i50;
                        iM30810 = 0;
                        for (i57 = 0; i57 < iCeil2; i57++) {
                            c0797 = c1367.f4925[i57];
                            if (c0797 == null) {
                                if (i57 > 0) {
                                    iM30810 += c1367.f4916;
                                }
                                iM30810 = c1367.m3088(c0797, i7) + iM30810;
                            }
                        }
                        i58 = 0;
                        iM30811 = 0;
                        while (i58 < iCeil) {
                            c0796 = c1367.f4924[i58];
                            int i80 = i58;
                            if (c0796 == null) {
                                if (i58 > 0) {
                                    iM30811 += c1367.f4917;
                                }
                                iM30811 = c1367.m3087(c0796, i7) + iM30811;
                            }
                            i58 = i80 + 1;
                        }
                        iArr[0] = iM30810;
                        iArr[1] = iM30811;
                        if (i56 == 0) {
                            if (iM30810 > i7 || iCeil2 <= 1) {
                                z5 = true;
                            } else {
                                iCeil2--;
                                z5 = z5;
                            }
                        } else if (iM30811 > i7 || iCeil <= 1) {
                            z5 = true;
                        } else {
                            iCeil--;
                            z5 = z5;
                        }
                        iArr = iArr;
                        i50 = i56;
                        i12 = i79;
                    }
                    int[] iArr4 = c1367.f4926;
                    iArr4[0] = iCeil2;
                    iArr4[1] = iCeil;
                    c = 1;
                    iArr2 = iArr;
                    i17 = mode2;
                    i18 = size3;
                    i22 = i3;
                    i19 = i9;
                    i15 = i51;
                    i20 = i13;
                    c2 = 0;
                }
                i25 = iArr2[0] + i22 + i19;
                i26 = iArr2[1] + i20 + i15;
                if (mode != 1073741824) {
                    if (mode == -2147483648) {
                        size2 = Math.min(i25, size2);
                    } else if (mode == 0) {
                        size2 = i25;
                    } else {
                        size2 = 0;
                    }
                }
                if (i17 == 1073741824) {
                    iMin = i18;
                } else if (i17 == -2147483648) {
                    iMin = Math.min(i26, i18);
                } else if (i17 == 0) {
                    iMin = i26;
                } else {
                    iMin = 0;
                }
                c1367.f4900 = size2;
                c1367.f4901 = iMin;
                c1367.m2334(size2);
                c1367.m2331(iMin);
                if (c1367.f5368 > 0) {
                    z = 1;
                } else {
                    z = 0;
                }
                c1367.f4899 = z;
            }
        } else {
            c0779 = c07724;
            c07710 = c07723;
            c07711 = c07725;
            i3 = c1367.f4897;
            i4 = c1367.f4898;
            i5 = c1367.f4893;
            i6 = c1367.f4894;
            iArr = new int[2];
            i7 = (size2 - i3) - i4;
            i8 = c1367.f4922;
            if (i8 == 1) {
                i7 = (size3 - i5) - i6;
            }
            if (i8 == 0) {
                if (c1367.f4904 == -1) {
                    i68 = 0;
                    c1367.f4904 = 0;
                } else {
                    i68 = 0;
                }
                i9 = i4;
                if (c1367.f4905 == -1) {
                    c1367.f4905 = 0;
                }
            } else {
                i9 = i4;
                if (c1367.f4904 == -1) {
                    c1367.f4904 = 0;
                }
                if (c1367.f4905 == -1) {
                    c1367.f4905 = 0;
                }
            }
            c0793Arr = c1367.f5367;
            i10 = 0;
            i11 = 0;
            while (true) {
                i12 = c1367.f5368;
                i13 = i5;
                if (i10 < i12) {
                    break;
                    break;
                }
                if (c1367.f5367[i10].f3125 == 8) {
                    i11++;
                }
                i10++;
                i5 = i13;
            }
            if (i11 > 0) {
                c0793Arr5 = new C0793[i12 - i11];
                i66 = 0;
                i67 = 0;
                while (false) {
                    c07912 = c1367.f5367[i66];
                    c0793Arr6 = c0793Arr5;
                    if (c07912.f3125 != 8) {
                        c0793Arr6[i67] = c07912;
                        i67++;
                    }
                    i66++;
                    c0793Arr5 = c0793Arr6;
                }
                c0793Arr = c0793Arr5;
                i12 = 0;
            }
            c0793Arr2 = c0793Arr;
            c1367.f4927 = c0793Arr2;
            c1367.f4928 = i12;
            i14 = c1367.f4920;
            if (i14 != 0) {
                i15 = i6;
                i16 = i7;
                iArr2 = iArr;
                i17 = mode2;
                i18 = size3;
                i19 = i9;
                i20 = i13;
                c = 1;
                i21 = i12;
                i22 = i3;
                i23 = c1367.f4922;
                if (i21 == 0) {
                    i22 = i22;
                    c2 = 0;
                } else {
                    if (arrayList.size() == 0) {
                        c1366 = new C1366(c1367, i23, c0779, c07710, c07711, c07726, i16);
                        arrayList.add(c1366);
                    } else {
                        C1366 c13612 = (C1366) arrayList.get(0);
                        c13612.f4877 = 0;
                        c13612.f4876 = null;
                        c13612.f4886 = 0;
                        c13612.f4887 = 0;
                        c13612.f4888 = 0;
                        c13612.f4889 = 0;
                        c13612.f4890 = 0;
                        c13612.m3085(i23, c0779, c07710, c07711, c07726, c1367.f4897, c1367.f4893, c1367.f4898, c1367.f4894, i16);
                        c1366 = c13612;
                    }
                    while (i24 < i21) {
                        c1366.m3080(c0793Arr2[i24]);
                    }
                    c2 = 0;
                    iArr2[0] = c1366.m3083();
                    iArr2[1] = c1366.m3082();
                }
            } else if (true) {
                i27 = i12;
                i28 = c1367.f4922;
                if (i27 == 0) {
                    c = 1;
                    iArr2 = iArr;
                    i17 = mode2;
                    i18 = size3;
                    i22 = i3;
                    i19 = i9;
                    i15 = i6;
                    i20 = i13;
                } else {
                    arrayList.clear();
                    iArr2 = iArr;
                    c = 1;
                    c07712 = c0779;
                    i19 = i9;
                    i15 = i6;
                    i20 = i13;
                    i29 = i7;
                    c07713 = c07710;
                    i22 = i3;
                    c1368 = new C1366(c1367, i28, c07712, c07713, c07711, c07726, i29);
                    arrayList.add(c1368);
                    if (i28 == 0) {
                        i30 = 0;
                        i47 = 0;
                        i34 = 0;
                        while (i48 < i27) {
                            c0794 = c0793Arr2[i48];
                            iM3088 = c1367.m3088(c0794, i29);
                            c07718 = c07712;
                            c07719 = c07713;
                            if (c0794.f3134[0] == 3) {
                                i34++;
                            }
                            if (i47 != i29) {
                            }
                            if (!z4) {
                                z4 = true;
                            }
                            if (z4) {
                                c07712 = c07718;
                                c07713 = c07719;
                                c1368 = new C1366(c1367, i30, c07712, c07713, c07711, c07726, i29);
                                c1368.f4888 = i48;
                                arrayList.add(c1368);
                            } else {
                                c07712 = c07718;
                                c07713 = c07719;
                                if (i48 > 0) {
                                    i47 = c1367.f4916 + iM3088 + i47;
                                    c1368 = c1368;
                                }
                                c1368.m3080(c0794);
                            }
                            i47 = iM3088;
                            c1368.m3080(c0794);
                        }
                    } else {
                        i30 = i28;
                        i31 = 0;
                        i32 = 0;
                        i33 = 0;
                        while (false) {
                            int i710 = size3;
                            c0793 = c0793Arr2[i31];
                            iM3087 = c1367.m3087(c0793, i29);
                            i35 = i32;
                            int i711 = mode2;
                            if (c0793.f3134[1] == 3) {
                                i36 = i35 + 1;
                            } else {
                                i36 = i35;
                            }
                            if (i33 != i29) {
                            }
                            if (!z2) {
                                z2 = true;
                            }
                            if (z2) {
                                i37 = i30;
                                c1368 = new C1366(c1367, i37, c07712, c07713, c07711, c07726, i29);
                                c1368.f4888 = i31;
                                arrayList.add(c1368);
                            } else {
                                i37 = i30;
                                if (i31 > 0) {
                                    i33 = c1367.f4917 + iM3087 + i33;
                                }
                                c1368.m3080(c0793);
                                i31++;
                                i30 = i37;
                                i32 = i36;
                                size3 = i710;
                                mode2 = i711;
                            }
                            i33 = iM3087;
                            c1368.m3080(c0793);
                            i31++;
                            i30 = i37;
                            i32 = i36;
                            size3 = i710;
                            mode2 = i711;
                        }
                        i34 = 0;
                    }
                    i17 = mode2;
                    i18 = size3;
                    i39 = i30;
                    size = arrayList.size();
                    int i712 = c1367.f4897;
                    int i713 = c1367.f4893;
                    int i714 = c1367.f4898;
                    int i715 = c1367.f4894;
                    iArr3 = c1367.f3134;
                    if (iArr3[0] != 2) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (false) {
                        while (i46 < size) {
                            c13610 = (C1366) arrayList.get(i46);
                            if (i39 == 0) {
                                c13610.m3084(i29 - c13610.m3083());
                            } else {
                                c13610.m3084(i29 - c13610.m3082());
                            }
                        }
                    }
                    c07714 = c07712;
                    c07715 = c07713;
                    c07716 = c07711;
                    c07717 = c07726;
                    i40 = i713;
                    i41 = i714;
                    i42 = i715;
                    i43 = i712;
                    iMax = 0;
                    i45 = 0;
                    while (i44 < size) {
                        c1369 = (C1366) arrayList.get(i44);
                        if (i39 == 0) {
                            if (i44 < size - 1) {
                                c07717 = ((C1366) arrayList.get(i44 + 1)).f4876.f3102;
                                i42 = 0;
                            } else {
                                c07717 = c07726;
                                i42 = c1367.f4894;
                            }
                            C0779 c07729 = c1369.f4876.f3104;
                            c1369.m3085(0, c07714, c07715, c07716, c07717, i43, i40, i41, i42, i29);
                            iMax = Math.max(iMax, c1369.m3083());
                            iM3082 = c1369.m3082() + i45;
                            if (false) {
                                iM3082 += c1367.f4917;
                            }
                            i45 = iM3082;
                            c07715 = c07729;
                            i40 = 0;
                        } else {
                            if (i44 < size - 1) {
                                c07716 = ((C1366) arrayList.get(i44 + 1)).f4876.f3101;
                                i41 = 0;
                            } else {
                                c07716 = c07711;
                                i41 = c1367.f4898;
                            }
                            C0779 c077210 = c1369.f4876.f3103;
                            c1369.m3085(i39, c07714, c07715, c07716, c07717, i43, i40, i41, i42, i29);
                            iM3083 = c1369.m3083() + iMax;
                            int iMax3 = Math.max(i45, c1369.m3082());
                            if (false) {
                                iM3083 += c1367.f4916;
                            }
                            i45 = iMax3;
                            iMax = iM3083;
                            c07714 = c077210;
                            i43 = 0;
                        }
                    }
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
                i22 = i22;
                c2 = 0;
            } else if (i14 != 2) {
                i15 = i6;
                iArr2 = iArr;
                i17 = mode2;
                i18 = size3;
                i22 = i3;
                i19 = i9;
                i20 = i13;
                c2 = 0;
                c = 1;
            } else {
                i50 = c1367.f4922;
                if (i50 == 0) {
                    i63 = c1367.f4921;
                    if (i63 <= 0) {
                        i64 = 0;
                        i65 = 0;
                        iCeil2 = 0;
                        while (true) {
                            i51 = i6;
                            if (i64 >= i12) {
                                break;
                                break;
                            }
                            if (i64 > 0) {
                                i65 += c1367.f4916;
                            }
                            c07911 = c0793Arr2[i64];
                            if (c07911 != null) {
                                iM30812 = c1367.m3088(c07911, i7) + i65;
                                if (iM30812 > i7) {
                                    break;
                                    break;
                                } else {
                                    iCeil2++;
                                    i65 = iM30812;
                                }
                            }
                            i64++;
                            i6 = i51;
                        }
                    } else {
                        i51 = i6;
                        iCeil2 = i63;
                    }
                    iCeil = 0;
                } else {
                    i51 = i6;
                    iCeil = c1367.f4921;
                    if (iCeil <= 0) {
                        i53 = 0;
                        i54 = 0;
                        while (i52 < i12) {
                            if (i52 > 0) {
                                i53 += c1367.f4917;
                            }
                            c0795 = c0793Arr2[i52];
                            if (c0795 != null) {
                                iM3089 = c1367.m3087(c0795, i7) + i53;
                                if (iM3089 > i7) {
                                    break;
                                    break;
                                } else {
                                    i54++;
                                    i53 = iM3089;
                                }
                            }
                        }
                        iCeil = i54;
                    }
                    iCeil2 = 0;
                }
                if (c1367.f4926 == null) {
                    c1367.f4926 = new int[2];
                }
                if (iCeil != 0) {
                }
                while (!z5) {
                    if (i50 == 0) {
                        iCeil = (int) Math.ceil(i12 / iCeil2);
                    } else {
                        iCeil2 = (int) Math.ceil(i12 / iCeil);
                    }
                    c0793Arr3 = c1367.f4925;
                    if (c0793Arr3 != null) {
                        c1367.f4925 = new C0793[iCeil2];
                    } else {
                        c1367.f4925 = new C0793[iCeil2];
                    }
                    c0793Arr4 = c1367.f4924;
                    if (c0793Arr4 != null) {
                        c1367.f4924 = new C0793[iCeil];
                    } else {
                        c1367.f4924 = new C0793[iCeil];
                    }
                    i55 = 0;
                    while (i55 < iCeil2) {
                        i59 = 0;
                        while (i59 < iCeil) {
                            i60 = (i59 * iCeil2) + i55;
                            int i716 = i12;
                            if (i50 == 1) {
                                i60 = (i55 * iCeil) + i59;
                            }
                            i61 = i60;
                            int i717 = i50;
                            if (i61 >= c0793Arr2.length) {
                                i62 = i55;
                            } else {
                                int iM30815 = c1367.m3088(c0798, i7);
                                i62 = i55;
                                c0799 = c1367.f4925[i62];
                                if (c0799 != null) {
                                    c1367.f4925[i62] = c0798;
                                } else {
                                    c1367.f4925[i62] = c0798;
                                }
                                int iM30816 = c1367.m3087(c0798, i7);
                                c07910 = c1367.f4924[i59];
                                if (c07910 != null) {
                                    c1367.f4924[i59] = c0798;
                                } else {
                                    c1367.f4924[i59] = c0798;
                                }
                            }
                            i59++;
                            i50 = i717;
                            i55 = i62;
                            i12 = i716;
                        }
                        i55++;
                    }
                    int i718 = i12;
                    i56 = i50;
                    iM30810 = 0;
                    while (i57 < iCeil2) {
                        c0797 = c1367.f4925[i57];
                        if (c0797 == null) {
                            if (i57 > 0) {
                                iM30810 += c1367.f4916;
                            }
                            iM30810 = c1367.m3088(c0797, i7) + iM30810;
                        }
                    }
                    i58 = 0;
                    iM30811 = 0;
                    while (i58 < iCeil) {
                        c0796 = c1367.f4924[i58];
                        int i81 = i58;
                        if (c0796 == null) {
                            if (i58 > 0) {
                                iM30811 += c1367.f4917;
                            }
                            iM30811 = c1367.m3087(c0796, i7) + iM30811;
                        }
                        i58 = i81 + 1;
                    }
                    iArr[0] = iM30810;
                    iArr[1] = iM30811;
                    if (i56 == 0) {
                        if (iM30810 > i7) {
                        }
                        z5 = true;
                    } else {
                        if (iM30811 > i7) {
                        }
                        z5 = true;
                    }
                    iArr = iArr;
                    i50 = i56;
                    i12 = i718;
                }
                int[] iArr5 = c1367.f4926;
                iArr5[0] = iCeil2;
                iArr5[1] = iCeil;
                c = 1;
                iArr2 = iArr;
                i17 = mode2;
                i18 = size3;
                i22 = i3;
                i19 = i9;
                i15 = i51;
                i20 = i13;
                c2 = 0;
            }
            i25 = iArr2[0] + i22 + i19;
            i26 = iArr2[1] + i20 + i15;
            if (mode != 1073741824) {
                if (mode == -2147483648) {
                    size2 = Math.min(i25, size2);
                } else if (mode == 0) {
                    size2 = i25;
                } else {
                    size2 = 0;
                }
            }
            if (i17 == 1073741824) {
                iMin = i18;
            } else if (i17 == -2147483648) {
                iMin = Math.min(i26, i18);
            } else if (i17 == 0) {
                iMin = i26;
            } else {
                iMin = 0;
            }
            c1367.f4900 = size2;
            c1367.f4901 = iMin;
            c1367.m2334(size2);
            c1367.m2331(iMin);
            if (c1367.f5368 > 0) {
                z = 1;
            } else {
                z = 0;
            }
            c1367.f4899 = z;
        }
        setMeasuredDimension(c1367.f4900, c1367.f4901);
    }
}
