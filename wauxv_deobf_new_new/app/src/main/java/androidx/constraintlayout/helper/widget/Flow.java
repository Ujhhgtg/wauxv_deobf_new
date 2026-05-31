package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p000.AbstractC2515;
import p000.AbstractC3663;
import p000.C0382;
import p000.C0778;
import p000.C0783;
import p000.C0792;
import p000.C0793;
import p000.C1373;
import p000.C1374;
import p000.C1518;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC3663 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C1374 f196;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2898 = new int[32];
        this.f2904 = new HashMap();
        this.f2900 = context;
        super.mo2404(attributeSet);
        C1374 c1374 = new C1374();
        c1374.f4918 = 0;
        c1374.f4919 = 0;
        c1374.f4920 = 0;
        c1374.f4921 = 0;
        c1374.f4922 = 0;
        c1374.f4923 = 0;
        c1374.f4924 = false;
        c1374.f4925 = 0;
        c1374.f4926 = 0;
        c1374.f4927 = new C0382();
        c1374.f4928 = null;
        c1374.f4929 = -1;
        c1374.f4930 = -1;
        c1374.f4931 = -1;
        c1374.f4932 = -1;
        c1374.f4933 = -1;
        c1374.f4934 = -1;
        c1374.f4935 = 0.5f;
        c1374.f4936 = 0.5f;
        c1374.f4937 = 0.5f;
        c1374.f4938 = 0.5f;
        c1374.f4939 = 0.5f;
        c1374.f4940 = 0.5f;
        c1374.f4941 = 0;
        c1374.f4942 = 0;
        c1374.f4943 = 2;
        c1374.f4944 = 2;
        c1374.f4945 = 0;
        c1374.f4946 = -1;
        c1374.f4947 = 0;
        c1374.f4948 = new ArrayList();
        c1374.f4949 = null;
        c1374.f4950 = null;
        c1374.f4951 = null;
        c1374.f4953 = 0;
        this.f196 = c1374;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2515.f7956);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f196.f4947 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C1374 c1375 = this.f196;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1375.f4918 = dimensionPixelSize;
                    c1375.f4919 = dimensionPixelSize;
                    c1375.f4920 = dimensionPixelSize;
                    c1375.f4921 = dimensionPixelSize;
                } else if (index == 11) {
                    C1374 c1376 = this.f196;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1376.f4920 = dimensionPixelSize2;
                    c1376.f4922 = dimensionPixelSize2;
                    c1376.f4923 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f196.f4921 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f196.f4922 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f196.f4918 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f196.f4923 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f196.f4919 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 38) {
                    this.f196.f4945 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 28) {
                    this.f196.f4929 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 37) {
                    this.f196.f4930 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 22) {
                    this.f196.f4931 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 30) {
                    this.f196.f4933 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 24) {
                    this.f196.f4932 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 32) {
                    this.f196.f4934 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 26) {
                    this.f196.f4935 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 21) {
                    this.f196.f4937 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 29) {
                    this.f196.f4939 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 23) {
                    this.f196.f4938 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 31) {
                    this.f196.f4940 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 35) {
                    this.f196.f4936 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 25) {
                    this.f196.f4943 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 34) {
                    this.f196.f4944 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 27) {
                    this.f196.f4941 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 36) {
                    this.f196.f4942 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 33) {
                    this.f196.f4946 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2901 = this.f196;
        m2405();
    }

    @Override // p000.AbstractC0780, android.view.View
    public final void onMeasure(int i, int i2) {
        mo52(this.f196, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f196.f4937 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f196.f4931 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f196.f4938 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f196.f4932 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f196.f4943 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f196.f4935 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f196.f4941 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f196.f4929 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f196.f4946 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f196.f4947 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C1374 c1374 = this.f196;
        c1374.f4918 = i;
        c1374.f4919 = i;
        c1374.f4920 = i;
        c1374.f4921 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f196.f4919 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f196.f4922 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f196.f4923 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f196.f4918 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f196.f4944 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f196.f4936 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f196.f4942 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f196.f4930 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f196.f4945 = i;
        requestLayout();
    }

    @Override // p000.AbstractC0780
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void mo51(C0792 c0792, boolean z) {
        C1374 c1374 = this.f196;
        int i = c1374.f4920;
        if (i > 0 || c1374.f4921 > 0) {
            if (z) {
                c1374.f4922 = c1374.f4921;
                c1374.f4923 = i;
            } else {
                c1374.f4922 = i;
                c1374.f4923 = c1374.f4921;
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
    @Override // p000.AbstractC3663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void mo52(C1374 c1374, int i, int i2) {
        C0778 c0778;
        C0778 c0779;
        C0778 c07710;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        C0792[] c0792Arr;
        int i10;
        int i11;
        int i12;
        int i13;
        C0792[] c0792Arr2;
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
        C1373 c1373;
        int i24;
        char c2;
        int i25;
        int i26;
        int iMin;
        boolean z;
        int i27;
        int i28;
        C1373 c1375;
        C0778 c07711;
        int i29;
        C0778 c07712;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        C0792 c0792;
        int iM3195;
        int i35;
        int i36;
        boolean z2;
        int i37;
        int i38;
        int i39;
        int size;
        int[] iArr3;
        boolean z3;
        C0778 c07713;
        C0778 c07714;
        C0778 c07715;
        C0778 c07716;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int iMax;
        int i45;
        C1373 c1376;
        int iM3191;
        int iM3190;
        int i46;
        C1373 c1377;
        int i47;
        int i48;
        C0792 c0793;
        int iM3196;
        C0778 c07717;
        C0778 c07718;
        boolean z4;
        int i49;
        int i50;
        int i51;
        int iCeil;
        int iCeil2;
        int i52;
        int i53;
        int i54;
        C0792 c0794;
        int iM3197;
        boolean z5;
        C0792[] c0792Arr3;
        C0792[] c0792Arr4;
        int i55;
        int i56;
        int i57;
        int iM3198;
        int i58;
        int iM3199;
        C0792 c0795;
        C0792 c0796;
        int i59;
        int i60;
        int i61;
        C0792 c0797;
        int i62;
        C0792 c0798;
        C0792 c0799;
        int i63;
        int i64;
        int i65;
        C0792 c07910;
        int iM31910;
        C0792[] c0792Arr5;
        int i66;
        int i67;
        C0792 c07911;
        C0792[] c0792Arr6;
        int i68;
        int i69;
        C0778 c07719;
        C0778 c07720;
        C0778 c07721;
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        if (c1374 == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        C0778 c07722 = c1374.f3109;
        C0778 c07723 = c1374.f3108;
        C0778 c07724 = c1374.f3110;
        C0778 c07725 = c1374.f3111;
        ArrayList arrayList = c1374.f4948;
        if (c1374.f5399 > 0) {
            C0382 c0382 = c1374.f4927;
            C0792 c07912 = c1374.f3119;
            C0783 c0783 = c07912 != null ? ((C0793) c07912).f3145 : null;
            if (c0783 == null) {
                c1374.f4925 = 0;
                c1374.f4926 = 0;
                c1374.f4924 = false;
            } else {
                int i70 = 0;
                while (i70 < c1374.f5399) {
                    C0792 c07913 = c1374.f5398[i70];
                    if (c07913 == null || (c07913 instanceof C1518)) {
                        i69 = i70;
                        c07719 = c07723;
                        c07720 = c07722;
                        c07721 = c07724;
                    } else {
                        i69 = i70;
                        int iM2427 = c07913.m2427(0);
                        c07719 = c07723;
                        int iM2428 = c07913.m2427(1);
                        c07720 = c07722;
                        if (iM2427 == 3) {
                            c07721 = c07724;
                            if (c07913.f3091 == 1 || iM2428 != 3 || c07913.f3092 == 1) {
                            }
                        } else {
                            c07721 = c07724;
                        }
                        if (iM2427 == 3) {
                            iM2427 = 2;
                        }
                        if (iM2428 == 3) {
                            iM2428 = 2;
                        }
                        c0382.f1882 = iM2427;
                        c0382.f1883 = iM2428;
                        c0382.f1884 = c07913.m2431();
                        c0382.f1885 = c07913.m2428();
                        c0783.m2408(c07913, c0382);
                        c07913.m2449(c0382.f1886);
                        c07913.m2446(c0382.f1887);
                        c07913.m2443(c0382.f1888);
                    }
                    i70 = i69 + 1;
                    c07722 = c07720;
                    c07723 = c07719;
                    c07724 = c07721;
                }
                c0778 = c07723;
                c0779 = c07722;
                c07710 = c07724;
                i3 = c1374.f4922;
                i4 = c1374.f4923;
                i5 = c1374.f4918;
                i6 = c1374.f4919;
                iArr = new int[2];
                i7 = (size2 - i3) - i4;
                i8 = c1374.f4947;
                if (i8 == 1) {
                    i7 = (size3 - i5) - i6;
                }
                if (i8 == 0) {
                    if (c1374.f4929 == -1) {
                        i68 = 0;
                        c1374.f4929 = 0;
                    } else {
                        i68 = 0;
                    }
                    i9 = i4;
                    if (c1374.f4930 == -1) {
                        c1374.f4930 = i68;
                    }
                } else {
                    i9 = i4;
                    if (c1374.f4929 == -1) {
                        c1374.f4929 = 0;
                    }
                    if (c1374.f4930 == -1) {
                        c1374.f4930 = 0;
                    }
                }
                c0792Arr = c1374.f5398;
                i10 = 0;
                i11 = 0;
                while (true) {
                    i12 = c1374.f5399;
                    i13 = i5;
                    if (i10 < i12) {
                        break;
                    }
                    if (c1374.f5398[i10].f3132 == 8) {
                        i11++;
                    }
                    i10++;
                    i5 = i13;
                }
                if (i11 > 0) {
                    c0792Arr5 = new C0792[i12 - i11];
                    i66 = 0;
                    i67 = 0;
                    while (i66 < c1374.f5399) {
                        c07911 = c1374.f5398[i66];
                        c0792Arr6 = c0792Arr5;
                        if (c07911.f3132 != 8) {
                            c0792Arr6[i67] = c07911;
                            i67++;
                        }
                        i66++;
                        c0792Arr5 = c0792Arr6;
                    }
                    c0792Arr = c0792Arr5;
                    i12 = i67;
                }
                c0792Arr2 = c0792Arr;
                c1374.f4952 = c0792Arr2;
                c1374.f4953 = i12;
                i14 = c1374.f4945;
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
                    i23 = c1374.f4947;
                    if (i21 == 0) {
                        i22 = i22;
                        c2 = 0;
                    } else {
                        if (arrayList.size() == 0) {
                            c1373 = new C1373(c1374, i23, c0778, c0779, c07710, c07725, i16);
                            arrayList.add(c1373);
                        } else {
                            C1373 c1378 = (C1373) arrayList.get(0);
                            c1378.f4902 = 0;
                            c1378.f4901 = null;
                            c1378.f4911 = 0;
                            c1378.f4912 = 0;
                            c1378.f4913 = 0;
                            c1378.f4914 = 0;
                            c1378.f4915 = 0;
                            c1378.m3193(i23, c0778, c0779, c07710, c07725, c1374.f4922, c1374.f4918, c1374.f4923, c1374.f4919, i16);
                            c1373 = c1378;
                        }
                        for (i24 = 0; i24 < i21; i24++) {
                            c1373.m3188(c0792Arr2[i24]);
                        }
                        c2 = 0;
                        iArr2[0] = c1373.m3191();
                        iArr2[1] = c1373.m3190();
                    }
                } else if (i14 != 1) {
                    i27 = i12;
                    i28 = c1374.f4947;
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
                        c07711 = c0778;
                        i19 = i9;
                        i15 = i6;
                        i20 = i13;
                        i29 = i7;
                        c07712 = c0779;
                        i22 = i3;
                        c1375 = new C1373(c1374, i28, c07711, c07712, c07710, c07725, i29);
                        arrayList.add(c1375);
                        if (i28 == 0) {
                            i30 = i28;
                            i47 = 0;
                            i34 = 0;
                            for (i48 = 0; i48 < i27; i48++) {
                                c0793 = c0792Arr2[i48];
                                iM3196 = c1374.m3196(c0793, i29);
                                c07717 = c07711;
                                c07718 = c07712;
                                if (c0793.f3141[0] == 3) {
                                    i34++;
                                }
                                z4 = (i47 != i29 || (c1374.f4941 + i47) + iM3196 > i29) && c1375.f4901 != null;
                                if (!z4 && i48 > 0 && (i49 = c1374.f4946) > 0 && i48 % i49 == 0) {
                                    z4 = true;
                                }
                                if (z4) {
                                    c07711 = c07717;
                                    c07712 = c07718;
                                    c1375 = new C1373(c1374, i30, c07711, c07712, c07710, c07725, i29);
                                    c1375.f4913 = i48;
                                    arrayList.add(c1375);
                                } else {
                                    c07711 = c07717;
                                    c07712 = c07718;
                                    if (i48 > 0) {
                                        i47 = c1374.f4941 + iM3196 + i47;
                                        c1375 = c1375;
                                    }
                                    c1375.m3188(c0793);
                                }
                                i47 = iM3196;
                                c1375.m3188(c0793);
                            }
                        } else {
                            i30 = i28;
                            i31 = 0;
                            i32 = 0;
                            i33 = 0;
                            while (i31 < i27) {
                                int i71 = size3;
                                c0792 = c0792Arr2[i31];
                                iM3195 = c1374.m3195(c0792, i29);
                                i35 = i32;
                                int i72 = mode2;
                                if (c0792.f3141[1] == 3) {
                                    i36 = i35 + 1;
                                } else {
                                    i36 = i35;
                                }
                                z2 = (i33 != i29 || (c1374.f4942 + i33) + iM3195 > i29) && c1375.f4901 != null;
                                if (!z2 && i31 > 0 && (i38 = c1374.f4946) > 0 && i31 % i38 == 0) {
                                    z2 = true;
                                }
                                if (z2) {
                                    i37 = i30;
                                    c1375 = new C1373(c1374, i37, c07711, c07712, c07710, c07725, i29);
                                    c1375.f4913 = i31;
                                    arrayList.add(c1375);
                                } else {
                                    i37 = i30;
                                    if (i31 > 0) {
                                        i33 = c1374.f4942 + iM3195 + i33;
                                    }
                                    c1375.m3188(c0792);
                                    i31++;
                                    i30 = i37;
                                    i32 = i36;
                                    size3 = i71;
                                    mode2 = i72;
                                }
                                i33 = iM3195;
                                c1375.m3188(c0792);
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
                        int i73 = c1374.f4922;
                        int i74 = c1374.f4918;
                        int i75 = c1374.f4923;
                        int i76 = c1374.f4919;
                        iArr3 = c1374.f3141;
                        if (iArr3[0] != 2 || iArr3[1] == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i34 > 0 && z3) {
                            for (i46 = 0; i46 < size; i46++) {
                                c1377 = (C1373) arrayList.get(i46);
                                if (i39 == 0) {
                                    c1377.m3192(i29 - c1377.m3191());
                                } else {
                                    c1377.m3192(i29 - c1377.m3190());
                                }
                            }
                        }
                        c07713 = c07711;
                        c07714 = c07712;
                        c07715 = c07710;
                        c07716 = c07725;
                        i40 = i74;
                        i41 = i75;
                        i42 = i76;
                        i43 = i73;
                        iMax = 0;
                        i45 = 0;
                        for (i44 = 0; i44 < size; i44++) {
                            c1376 = (C1373) arrayList.get(i44);
                            if (i39 == 0) {
                                if (i44 < size - 1) {
                                    c07716 = ((C1373) arrayList.get(i44 + 1)).f4901.f3109;
                                    i42 = 0;
                                } else {
                                    c07716 = c07725;
                                    i42 = c1374.f4919;
                                }
                                C0778 c07726 = c1376.f4901.f3111;
                                c1376.m3193(i39, c07713, c07714, c07715, c07716, i43, i40, i41, i42, i29);
                                iMax = Math.max(iMax, c1376.m3191());
                                iM3190 = c1376.m3190() + i45;
                                if (i44 > 0) {
                                    iM3190 += c1374.f4942;
                                }
                                i45 = iM3190;
                                c07714 = c07726;
                                i40 = 0;
                            } else {
                                if (i44 < size - 1) {
                                    c07715 = ((C1373) arrayList.get(i44 + 1)).f4901.f3108;
                                    i41 = 0;
                                } else {
                                    c07715 = c07710;
                                    i41 = c1374.f4923;
                                }
                                C0778 c07727 = c1376.f4901.f3110;
                                c1376.m3193(i39, c07713, c07714, c07715, c07716, i43, i40, i41, i42, i29);
                                iM3191 = c1376.m3191() + iMax;
                                int iMax2 = Math.max(i45, c1376.m3190());
                                if (i44 > 0) {
                                    iM3191 += c1374.f4941;
                                }
                                i45 = iMax2;
                                iMax = iM3191;
                                c07713 = c07727;
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
                    i50 = c1374.f4947;
                    if (i50 == 0) {
                        i63 = c1374.f4946;
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
                                    i65 += c1374.f4941;
                                }
                                c07910 = c0792Arr2[i64];
                                if (c07910 != null) {
                                    iM31910 = c1374.m3196(c07910, i7) + i65;
                                    if (iM31910 > i7) {
                                        break;
                                    }
                                    iCeil2++;
                                    i65 = iM31910;
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
                        iCeil = c1374.f4946;
                        if (iCeil <= 0) {
                            i53 = 0;
                            i54 = 0;
                            for (i52 = 0; i52 < i12; i52++) {
                                if (i52 > 0) {
                                    i53 += c1374.f4942;
                                }
                                c0794 = c0792Arr2[i52];
                                if (c0794 != null) {
                                    iM3197 = c1374.m3195(c0794, i7) + i53;
                                    if (iM3197 > i7) {
                                        break;
                                    }
                                    i54++;
                                    i53 = iM3197;
                                }
                            }
                            iCeil = i54;
                        }
                        iCeil2 = 0;
                    }
                    if (c1374.f4951 == null) {
                        c1374.f4951 = new int[2];
                    }
                    z5 = (iCeil != 0 && i50 == 1) || (iCeil2 == 0 && i50 == 0);
                    while (!z5) {
                        if (i50 == 0) {
                            iCeil = (int) Math.ceil(i12 / iCeil2);
                        } else {
                            iCeil2 = (int) Math.ceil(i12 / iCeil);
                        }
                        c0792Arr3 = c1374.f4950;
                        if (c0792Arr3 != null || c0792Arr3.length < iCeil2) {
                            c1374.f4950 = new C0792[iCeil2];
                        } else {
                            Arrays.fill(c0792Arr3, (Object) null);
                        }
                        c0792Arr4 = c1374.f4949;
                        if (c0792Arr4 != null || c0792Arr4.length < iCeil) {
                            c1374.f4949 = new C0792[iCeil];
                        } else {
                            Arrays.fill(c0792Arr4, (Object) null);
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
                                if (i61 >= c0792Arr2.length && (c0797 = c0792Arr2[i61]) != null) {
                                    int iM31911 = c1374.m3196(c0797, i7);
                                    i62 = i55;
                                    c0798 = c1374.f4950[i62];
                                    if (c0798 != null || c0798.m2431() < iM31911) {
                                        c1374.f4950[i62] = c0797;
                                    }
                                    int iM31912 = c1374.m3195(c0797, i7);
                                    c0799 = c1374.f4949[i59];
                                    if (c0799 != null || c0799.m2428() < iM31912) {
                                        c1374.f4949[i59] = c0797;
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
                        iM3198 = 0;
                        for (i57 = 0; i57 < iCeil2; i57++) {
                            c0796 = c1374.f4950[i57];
                            if (c0796 == null) {
                                if (i57 > 0) {
                                    iM3198 += c1374.f4941;
                                }
                                iM3198 = c1374.m3196(c0796, i7) + iM3198;
                            }
                        }
                        i58 = 0;
                        iM3199 = 0;
                        while (i58 < iCeil) {
                            c0795 = c1374.f4949[i58];
                            int i80 = i58;
                            if (c0795 == null) {
                                if (i58 > 0) {
                                    iM3199 += c1374.f4942;
                                }
                                iM3199 = c1374.m3195(c0795, i7) + iM3199;
                            }
                            i58 = i80 + 1;
                        }
                        iArr[0] = iM3198;
                        iArr[1] = iM3199;
                        if (i56 == 0) {
                            if (iM3198 > i7 || iCeil2 <= 1) {
                                z5 = true;
                            } else {
                                iCeil2--;
                                z5 = z5;
                            }
                        } else if (iM3199 > i7 || iCeil <= 1) {
                            z5 = true;
                        } else {
                            iCeil--;
                            z5 = z5;
                        }
                        iArr = iArr;
                        i50 = i56;
                        i12 = i79;
                    }
                    int[] iArr4 = c1374.f4951;
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
                i25 = iArr2[c2] + i22 + i19;
                i26 = iArr2[c] + i20 + i15;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
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
                c1374.f4925 = size2;
                c1374.f4926 = iMin;
                c1374.m2449(size2);
                c1374.m2446(iMin);
                if (c1374.f5399 > 0) {
                    z = c;
                } else {
                    z = 0;
                }
                c1374.f4924 = z;
            }
        } else {
            c0778 = c07723;
            c0779 = c07722;
            c07710 = c07724;
            i3 = c1374.f4922;
            i4 = c1374.f4923;
            i5 = c1374.f4918;
            i6 = c1374.f4919;
            iArr = new int[2];
            i7 = (size2 - i3) - i4;
            i8 = c1374.f4947;
            if (i8 == 1) {
                i7 = (size3 - i5) - i6;
            }
            if (i8 == 0) {
                if (c1374.f4929 == -1) {
                    i68 = 0;
                    c1374.f4929 = 0;
                } else {
                    i68 = 0;
                }
                i9 = i4;
                if (c1374.f4930 == -1) {
                    c1374.f4930 = i68;
                }
            } else {
                i9 = i4;
                if (c1374.f4929 == -1) {
                    c1374.f4929 = 0;
                }
                if (c1374.f4930 == -1) {
                    c1374.f4930 = 0;
                }
            }
            c0792Arr = c1374.f5398;
            i10 = 0;
            i11 = 0;
            while (true) {
                i12 = c1374.f5399;
                i13 = i5;
                if (i10 < i12) {
                    break;
                    break;
                }
                if (c1374.f5398[i10].f3132 == 8) {
                    i11++;
                }
                i10++;
                i5 = i13;
            }
            if (i11 > 0) {
                c0792Arr5 = new C0792[i12 - i11];
                i66 = 0;
                i67 = 0;
                while (i66 < c1374.f5399) {
                    c07911 = c1374.f5398[i66];
                    c0792Arr6 = c0792Arr5;
                    if (c07911.f3132 != 8) {
                        c0792Arr6[i67] = c07911;
                        i67++;
                    }
                    i66++;
                    c0792Arr5 = c0792Arr6;
                }
                c0792Arr = c0792Arr5;
                i12 = i67;
            }
            c0792Arr2 = c0792Arr;
            c1374.f4952 = c0792Arr2;
            c1374.f4953 = i12;
            i14 = c1374.f4945;
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
                i23 = c1374.f4947;
                if (i21 == 0) {
                    i22 = i22;
                    c2 = 0;
                } else {
                    if (arrayList.size() == 0) {
                        c1373 = new C1373(c1374, i23, c0778, c0779, c07710, c07725, i16);
                        arrayList.add(c1373);
                    } else {
                        C1373 c1379 = (C1373) arrayList.get(0);
                        c1379.f4902 = 0;
                        c1379.f4901 = null;
                        c1379.f4911 = 0;
                        c1379.f4912 = 0;
                        c1379.f4913 = 0;
                        c1379.f4914 = 0;
                        c1379.f4915 = 0;
                        c1379.m3193(i23, c0778, c0779, c07710, c07725, c1374.f4922, c1374.f4918, c1374.f4923, c1374.f4919, i16);
                        c1373 = c1379;
                    }
                    while (i24 < i21) {
                        c1373.m3188(c0792Arr2[i24]);
                    }
                    c2 = 0;
                    iArr2[0] = c1373.m3191();
                    iArr2[1] = c1373.m3190();
                }
            } else if (i14 != 1) {
                i27 = i12;
                i28 = c1374.f4947;
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
                    c07711 = c0778;
                    i19 = i9;
                    i15 = i6;
                    i20 = i13;
                    i29 = i7;
                    c07712 = c0779;
                    i22 = i3;
                    c1375 = new C1373(c1374, i28, c07711, c07712, c07710, c07725, i29);
                    arrayList.add(c1375);
                    if (i28 == 0) {
                        i30 = i28;
                        i47 = 0;
                        i34 = 0;
                        while (i48 < i27) {
                            c0793 = c0792Arr2[i48];
                            iM3196 = c1374.m3196(c0793, i29);
                            c07717 = c07711;
                            c07718 = c07712;
                            if (c0793.f3141[0] == 3) {
                                i34++;
                            }
                            if (i47 != i29) {
                            }
                            if (!z4) {
                                z4 = true;
                            }
                            if (z4) {
                                c07711 = c07717;
                                c07712 = c07718;
                                c1375 = new C1373(c1374, i30, c07711, c07712, c07710, c07725, i29);
                                c1375.f4913 = i48;
                                arrayList.add(c1375);
                            } else {
                                c07711 = c07717;
                                c07712 = c07718;
                                if (i48 > 0) {
                                    i47 = c1374.f4941 + iM3196 + i47;
                                    c1375 = c1375;
                                }
                                c1375.m3188(c0793);
                            }
                            i47 = iM3196;
                            c1375.m3188(c0793);
                        }
                    } else {
                        i30 = i28;
                        i31 = 0;
                        i32 = 0;
                        i33 = 0;
                        while (i31 < i27) {
                            int i710 = size3;
                            c0792 = c0792Arr2[i31];
                            iM3195 = c1374.m3195(c0792, i29);
                            i35 = i32;
                            int i711 = mode2;
                            if (c0792.f3141[1] == 3) {
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
                                c1375 = new C1373(c1374, i37, c07711, c07712, c07710, c07725, i29);
                                c1375.f4913 = i31;
                                arrayList.add(c1375);
                            } else {
                                i37 = i30;
                                if (i31 > 0) {
                                    i33 = c1374.f4942 + iM3195 + i33;
                                }
                                c1375.m3188(c0792);
                                i31++;
                                i30 = i37;
                                i32 = i36;
                                size3 = i710;
                                mode2 = i711;
                            }
                            i33 = iM3195;
                            c1375.m3188(c0792);
                            i31++;
                            i30 = i37;
                            i32 = i36;
                            size3 = i710;
                            mode2 = i711;
                        }
                        i34 = i32;
                    }
                    i17 = mode2;
                    i18 = size3;
                    i39 = i30;
                    size = arrayList.size();
                    int i712 = c1374.f4922;
                    int i713 = c1374.f4918;
                    int i714 = c1374.f4923;
                    int i715 = c1374.f4919;
                    iArr3 = c1374.f3141;
                    if (iArr3[0] != 2) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (i34 > 0) {
                        while (i46 < size) {
                            c1377 = (C1373) arrayList.get(i46);
                            if (i39 == 0) {
                                c1377.m3192(i29 - c1377.m3191());
                            } else {
                                c1377.m3192(i29 - c1377.m3190());
                            }
                        }
                    }
                    c07713 = c07711;
                    c07714 = c07712;
                    c07715 = c07710;
                    c07716 = c07725;
                    i40 = i713;
                    i41 = i714;
                    i42 = i715;
                    i43 = i712;
                    iMax = 0;
                    i45 = 0;
                    while (i44 < size) {
                        c1376 = (C1373) arrayList.get(i44);
                        if (i39 == 0) {
                            if (i44 < size - 1) {
                                c07716 = ((C1373) arrayList.get(i44 + 1)).f4901.f3109;
                                i42 = 0;
                            } else {
                                c07716 = c07725;
                                i42 = c1374.f4919;
                            }
                            C0778 c07728 = c1376.f4901.f3111;
                            c1376.m3193(i39, c07713, c07714, c07715, c07716, i43, i40, i41, i42, i29);
                            iMax = Math.max(iMax, c1376.m3191());
                            iM3190 = c1376.m3190() + i45;
                            if (i44 > 0) {
                                iM3190 += c1374.f4942;
                            }
                            i45 = iM3190;
                            c07714 = c07728;
                            i40 = 0;
                        } else {
                            if (i44 < size - 1) {
                                c07715 = ((C1373) arrayList.get(i44 + 1)).f4901.f3108;
                                i41 = 0;
                            } else {
                                c07715 = c07710;
                                i41 = c1374.f4923;
                            }
                            C0778 c07729 = c1376.f4901.f3110;
                            c1376.m3193(i39, c07713, c07714, c07715, c07716, i43, i40, i41, i42, i29);
                            iM3191 = c1376.m3191() + iMax;
                            int iMax3 = Math.max(i45, c1376.m3190());
                            if (i44 > 0) {
                                iM3191 += c1374.f4941;
                            }
                            i45 = iMax3;
                            iMax = iM3191;
                            c07713 = c07729;
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
                i50 = c1374.f4947;
                if (i50 == 0) {
                    i63 = c1374.f4946;
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
                                i65 += c1374.f4941;
                            }
                            c07910 = c0792Arr2[i64];
                            if (c07910 != null) {
                                iM31910 = c1374.m3196(c07910, i7) + i65;
                                if (iM31910 > i7) {
                                    break;
                                    break;
                                } else {
                                    iCeil2++;
                                    i65 = iM31910;
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
                    iCeil = c1374.f4946;
                    if (iCeil <= 0) {
                        i53 = 0;
                        i54 = 0;
                        while (i52 < i12) {
                            if (i52 > 0) {
                                i53 += c1374.f4942;
                            }
                            c0794 = c0792Arr2[i52];
                            if (c0794 != null) {
                                iM3197 = c1374.m3195(c0794, i7) + i53;
                                if (iM3197 > i7) {
                                    break;
                                    break;
                                } else {
                                    i54++;
                                    i53 = iM3197;
                                }
                            }
                        }
                        iCeil = i54;
                    }
                    iCeil2 = 0;
                }
                if (c1374.f4951 == null) {
                    c1374.f4951 = new int[2];
                }
                if (iCeil != 0) {
                }
                while (!z5) {
                    if (i50 == 0) {
                        iCeil = (int) Math.ceil(i12 / iCeil2);
                    } else {
                        iCeil2 = (int) Math.ceil(i12 / iCeil);
                    }
                    c0792Arr3 = c1374.f4950;
                    if (c0792Arr3 != null) {
                        c1374.f4950 = new C0792[iCeil2];
                    } else {
                        c1374.f4950 = new C0792[iCeil2];
                    }
                    c0792Arr4 = c1374.f4949;
                    if (c0792Arr4 != null) {
                        c1374.f4949 = new C0792[iCeil];
                    } else {
                        c1374.f4949 = new C0792[iCeil];
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
                            if (i61 >= c0792Arr2.length) {
                                i62 = i55;
                            } else {
                                int iM31913 = c1374.m3196(c0797, i7);
                                i62 = i55;
                                c0798 = c1374.f4950[i62];
                                if (c0798 != null) {
                                    c1374.f4950[i62] = c0797;
                                } else {
                                    c1374.f4950[i62] = c0797;
                                }
                                int iM31914 = c1374.m3195(c0797, i7);
                                c0799 = c1374.f4949[i59];
                                if (c0799 != null) {
                                    c1374.f4949[i59] = c0797;
                                } else {
                                    c1374.f4949[i59] = c0797;
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
                    iM3198 = 0;
                    while (i57 < iCeil2) {
                        c0796 = c1374.f4950[i57];
                        if (c0796 == null) {
                            if (i57 > 0) {
                                iM3198 += c1374.f4941;
                            }
                            iM3198 = c1374.m3196(c0796, i7) + iM3198;
                        }
                    }
                    i58 = 0;
                    iM3199 = 0;
                    while (i58 < iCeil) {
                        c0795 = c1374.f4949[i58];
                        int i81 = i58;
                        if (c0795 == null) {
                            if (i58 > 0) {
                                iM3199 += c1374.f4942;
                            }
                            iM3199 = c1374.m3195(c0795, i7) + iM3199;
                        }
                        i58 = i81 + 1;
                    }
                    iArr[0] = iM3198;
                    iArr[1] = iM3199;
                    if (i56 == 0) {
                        if (iM3198 > i7) {
                        }
                        z5 = true;
                    } else {
                        if (iM3199 > i7) {
                        }
                        z5 = true;
                    }
                    iArr = iArr;
                    i50 = i56;
                    i12 = i718;
                }
                int[] iArr5 = c1374.f4951;
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
            i25 = iArr2[c2] + i22 + i19;
            i26 = iArr2[c] + i20 + i15;
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
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
            c1374.f4925 = size2;
            c1374.f4926 = iMin;
            c1374.m2449(size2);
            c1374.m2446(iMin);
            if (c1374.f5399 > 0) {
                z = c;
            } else {
                z = 0;
            }
            c1374.f4924 = z;
        }
        setMeasuredDimension(c1374.f4925, c1374.f4926);
    }
}
