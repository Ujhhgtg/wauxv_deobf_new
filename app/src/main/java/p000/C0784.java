package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.bc;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᤞᲇᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0784 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ConstraintLayout f2962;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f2963;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f2964;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f2965;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f2966;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f2967;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f2968;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ ConstraintLayout f2969;

    public C0784(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f2969 = constraintLayout;
        this.f2962 = constraintLayout2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static boolean m2292(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == -2147483648 || mode == 0) && i3 == size;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0192  */
    /* JADX WARN: Code duplicated, block: B:108:0x019a  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:122:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:141:0x0201  */
    /* JADX WARN: Code duplicated, block: B:142:0x0206  */
    /* JADX WARN: Code duplicated, block: B:145:0x020b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0213  */
    /* JADX WARN: Code duplicated, block: B:150:0x021a  */
    /* JADX WARN: Code duplicated, block: B:153:0x0220  */
    /* JADX WARN: Code duplicated, block: B:156:0x022d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x023b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x0248 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x0250  */
    /* JADX WARN: Code duplicated, block: B:170:0x0254  */
    /* JADX WARN: Code duplicated, block: B:172:0x025a  */
    /* JADX WARN: Code duplicated, block: B:173:0x025f  */
    /* JADX WARN: Code duplicated, block: B:176:0x027b  */
    /* JADX WARN: Code duplicated, block: B:177:0x027d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0289  */
    /* JADX WARN: Code duplicated, block: B:187:0x0290  */
    /* JADX WARN: Code duplicated, block: B:188:0x0292  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x0182  */
    /* JADX WARN: Code duplicated, block: B:94:0x0184  */
    /* JADX WARN: Code duplicated, block: B:96:0x0187  */
    /* JADX WARN: Code duplicated, block: B:97:0x0189  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2293(C0793 c0793, C0407 c0407) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iM4759;
        int iMakeMeasureSpec3;
        C0794 c0794;
        ConstraintLayout constraintLayout;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C0783 c0783;
        int i;
        int measuredWidth;
        int measuredHeight;
        int i2;
        int iMin;
        int i3;
        int i4;
        int iMin2;
        int i5;
        int i6;
        int iMakeMeasureSpec4;
        boolean z7;
        int measuredWidth2;
        int baseline;
        int i7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i8;
        boolean z12;
        if (c0793 == null) {
            return;
        }
        C0779 c0779 = c0793.f3103;
        C0779 c07710 = c0793.f3101;
        if (c0793.f3125 == 8) {
            c0407.f1914 = 0;
            c0407.f1915 = 0;
            c0407.f1916 = 0;
            return;
        }
        if (c0793.f3112 == null) {
            return;
        }
        int i9 = c0407.f1910;
        int i10 = c0407.f1911;
        int i11 = c0407.f1912;
        int i12 = c0407.f1913;
        int i13 = this.f2963 + this.f2964;
        int i14 = this.f2965;
        View view = c0793.f3124;
        int iM47510 = AbstractC2784.m4759(i9);
        if (iM47510 == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else {
            if (iM47510 != 1) {
                if (iM47510 != 2) {
                    iMakeMeasureSpec2 = iM47510 != 3 ? 0 : ViewGroup.getChildMeasureSpec(this.f2967, c07710.f2882 + c0779.f2882 + i14, -1);
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2967, i14, -2);
                    boolean z13 = c0793.f3084 == 1;
                    int i15 = c0407.f1919;
                    if (i15 == 1 || i15 == 2) {
                        boolean z14 = view.getMeasuredHeight() == c0793.m2313();
                        if (c0407.f1919 == 2 || !z13 || ((true && z14) || c0793.mo1487())) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0793.m2316(), 1073741824);
                        }
                    }
                }
                iM4759 = AbstractC2784.m4759(i10);
                if (iM4759 != 0) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                } else if (true) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f2968, i13, -2);
                } else if (iM4759 != 2) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f2968, i13, -2);
                    if (c0793.f3085 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i8 = c0407.f1919;
                    if (i8 != 1 || i8 == 2) {
                        if (view.getMeasuredWidth() == c0793.m2316()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0407.f1919 != 2 || !z11 || ((z11 && z12) || c0793.mo1488())) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c0793.m2313(), 1073741824);
                        }
                    }
                } else if (iM4759 != 3) {
                    iMakeMeasureSpec3 = 0;
                } else {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f2968, c0793.f3102.f2882 + c0793.f3104.f2882 + i13, -1);
                }
                c0794 = (C0794) c0793.f3112;
                constraintLayout = this.f2969;
                if (c0794 == null && AbstractC2201.m3968(constraintLayout.f205, 256) && view.getMeasuredWidth() == c0793.m2316() && view.getMeasuredWidth() < c0794.m2316() && view.getMeasuredHeight() == c0793.m2313() && view.getMeasuredHeight() < c0794.m2313() && view.getBaseline() == c0793.f3119 && !c0793.m2324() && m2292(c0793.f3099, iMakeMeasureSpec2, c0793.m2316()) && m2292(c0793.f3100, iMakeMeasureSpec3, c0793.m2313())) {
                    c0407.f1914 = c0793.m2316();
                    c0407.f1915 = c0793.m2313();
                    c0407.f1916 = c0793.f3119;
                    return;
                }
                if (i9 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (i10 == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i10 != 4 || false) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i9 != 4 || false) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z || c0793.f3115 <= 0.0f) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z2 || c0793.f3115 <= 0.0f) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (view == null) {
                    return;
                }
                c0783 = (C0783) view.getLayoutParams();
                i = c0407.f1919;
                if (i == 1 && true && z && c0793.f3084 == 0 && z2 && c0793.f3085 == 0) {
                    z7 = false;
                    measuredWidth2 = 0;
                    baseline = 0;
                    i7 = -1;
                    iMin2 = 0;
                } else {
                    if ((view instanceof AbstractC3603) || !(c0793 instanceof C1367)) {
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                    } else {
                        ((AbstractC3603) view).mo52((C1367) c0793, iMakeMeasureSpec2, iMakeMeasureSpec3);
                    }
                    c0793.f3099 = iMakeMeasureSpec2;
                    c0793.f3100 = iMakeMeasureSpec3;
                    c0793.f3079 = false;
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    i2 = c0793.f3087;
                    if (i2 > 0) {
                        iMin = Math.max(i2, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i3 = c0793.f3088;
                    if (i3 > 0) {
                        iMin = Math.min(i3, iMin);
                    }
                    i4 = c0793.f3090;
                    if (i4 > 0) {
                        iMin2 = Math.max(i4, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i5 = iMakeMeasureSpec3;
                    i6 = c0793.f3091;
                    if (i6 > 0) {
                        iMin2 = Math.min(i6, iMin2);
                    }
                    if (!AbstractC2201.m3968(constraintLayout.f205, 1)) {
                        if (!z5 && z3) {
                            iMin = (int) ((iMin2 * c0793.f3115) + 0.5f);
                        } else if (z6 && z4) {
                            iMin2 = (int) ((iMin / c0793.f3115) + 0.5f);
                        }
                    }
                    if (measuredWidth == iMin || measuredHeight != iMin2) {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = i5;
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                        c0793.f3099 = iMakeMeasureSpec2;
                        c0793.f3100 = iMakeMeasureSpec4;
                        z7 = false;
                        c0793.f3079 = false;
                        measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        iMin2 = measuredHeight2;
                    } else {
                        baseline = baseline2;
                        measuredWidth2 = iMin;
                        z7 = false;
                    }
                    i7 = -1;
                }
                if (baseline != -1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (measuredWidth2 == c0407.f1912 || iMin2 != c0407.f1913) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                c0407.f1918 = z9;
                if (c0783.f2948) {
                    z10 = true;
                } else {
                    z10 = z8;
                }
                if (z10 && baseline != -1 && c0793.f3119 != baseline) {
                    c0407.f1918 = true;
                }
                c0407.f1914 = measuredWidth2;
                c0407.f1915 = iMin2;
                c0407.f1917 = z10;
                c0407.f1916 = baseline;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2967, i14, -2);
        }
        iMakeMeasureSpec2 = iMakeMeasureSpec;
        iM4759 = AbstractC2784.m4759(i10);
        if (iM4759 != 0) {
            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else if (true) {
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f2968, i13, -2);
        } else if (iM4759 != 2) {
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f2968, i13, -2);
            if (c0793.f3085 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            i8 = c0407.f1919;
            if (i8 != 1) {
                if (view.getMeasuredWidth() == c0793.m2316()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0407.f1919 != 2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c0793.m2313(), 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c0793.m2313(), 1073741824);
                }
            } else {
                if (view.getMeasuredWidth() == c0793.m2316()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0407.f1919 != 2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c0793.m2313(), 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c0793.m2313(), 1073741824);
                }
            }
        } else if (iM4759 != 3) {
            iMakeMeasureSpec3 = 0;
        } else {
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f2968, c0793.f3102.f2882 + c0793.f3104.f2882 + i13, -1);
        }
        c0794 = (C0794) c0793.f3112;
        constraintLayout = this.f2969;
        if (c0794 == null) {
        }
        if (i9 == 3) {
            z = true;
        } else {
            z = false;
        }
        if (i10 == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i10 != 4) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (i9 != 4) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (z) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (z2) {
            z6 = false;
        } else {
            z6 = false;
        }
        if (view == null) {
            return;
        }
        c0783 = (C0783) view.getLayoutParams();
        i = c0407.f1919;
        if (i == 1) {
            if (view instanceof AbstractC3603) {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            } else {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            }
            c0793.f3099 = iMakeMeasureSpec2;
            c0793.f3100 = iMakeMeasureSpec3;
            c0793.f3079 = false;
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            int baseline3 = view.getBaseline();
            i2 = c0793.f3087;
            if (i2 > 0) {
                iMin = Math.max(i2, measuredWidth);
            } else {
                iMin = measuredWidth;
            }
            i3 = c0793.f3088;
            if (i3 > 0) {
                iMin = Math.min(i3, iMin);
            }
            i4 = c0793.f3090;
            if (i4 > 0) {
                iMin2 = Math.max(i4, measuredHeight);
            } else {
                iMin2 = measuredHeight;
            }
            i5 = iMakeMeasureSpec3;
            i6 = c0793.f3091;
            if (i6 > 0) {
                iMin2 = Math.min(i6, iMin2);
            }
            if (!AbstractC2201.m3968(constraintLayout.f205, 1)) {
                if (true) {
                    if (false) {
                        iMin2 = (int) ((iMin / c0793.f3115) + 0.5f);
                    }
                } else if (z6) {
                    iMin2 = (int) ((iMin / c0793.f3115) + 0.5f);
                }
            }
            if (measuredWidth == iMin) {
                if (false) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i5;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c0793.f3099 = iMakeMeasureSpec2;
                c0793.f3100 = iMakeMeasureSpec4;
                z7 = false;
                c0793.f3079 = false;
                measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight3 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin2 = measuredHeight3;
            } else {
                if (true) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i5;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c0793.f3099 = iMakeMeasureSpec2;
                c0793.f3100 = iMakeMeasureSpec4;
                z7 = false;
                c0793.f3079 = false;
                measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight4 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin2 = measuredHeight4;
            }
            i7 = -1;
        } else {
            if (view instanceof AbstractC3603) {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            } else {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            }
            c0793.f3099 = iMakeMeasureSpec2;
            c0793.f3100 = iMakeMeasureSpec3;
            c0793.f3079 = false;
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            int baseline4 = view.getBaseline();
            i2 = c0793.f3087;
            if (i2 > 0) {
                iMin = Math.max(i2, measuredWidth);
            } else {
                iMin = measuredWidth;
            }
            i3 = c0793.f3088;
            if (i3 > 0) {
                iMin = Math.min(i3, iMin);
            }
            i4 = c0793.f3090;
            if (i4 > 0) {
                iMin2 = Math.max(i4, measuredHeight);
            } else {
                iMin2 = measuredHeight;
            }
            i5 = iMakeMeasureSpec3;
            i6 = c0793.f3091;
            if (i6 > 0) {
                iMin2 = Math.min(i6, iMin2);
            }
            if (!AbstractC2201.m3968(constraintLayout.f205, 1)) {
                if (true) {
                    if (false) {
                        iMin2 = (int) ((iMin / c0793.f3115) + 0.5f);
                    }
                } else if (z6) {
                    iMin2 = (int) ((iMin / c0793.f3115) + 0.5f);
                }
            }
            if (measuredWidth == iMin) {
                if (false) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i5;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c0793.f3099 = iMakeMeasureSpec2;
                c0793.f3100 = iMakeMeasureSpec4;
                z7 = false;
                c0793.f3079 = false;
                measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight5 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin2 = measuredHeight5;
            } else {
                if (true) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i5;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c0793.f3099 = iMakeMeasureSpec2;
                c0793.f3100 = iMakeMeasureSpec4;
                z7 = false;
                c0793.f3079 = false;
                measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight6 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin2 = measuredHeight6;
            }
            i7 = -1;
        }
        if (baseline != -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (measuredWidth2 == c0407.f1912) {
            z9 = true;
        } else {
            z9 = true;
        }
        c0407.f1918 = true;
        if (c0783.f2948) {
            z10 = true;
        } else {
            z10 = z8;
        }
        if (z10) {
            c0407.f1918 = true;
        }
        c0407.f1914 = measuredWidth2;
        c0407.f1915 = iMin2;
        c0407.f1917 = z10;
        c0407.f1916 = baseline;
    }
}
