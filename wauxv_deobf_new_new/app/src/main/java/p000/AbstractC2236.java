package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.alibaba.fastjson2.JSONB;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤝᲈᲇᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2236 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C1105 f7290 = new C1105(3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final byte[] f7291 = {JSONB.Constants.BC_INT32_BYTE_MIN, 49, 53, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final byte[] f7292 = {JSONB.Constants.BC_INT32_BYTE_MIN, 49, JSONB.Constants.BC_INT32_BYTE_MIN, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final byte[] f7293 = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 57, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final byte[] f7294 = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 53, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final byte[] f7295 = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 49, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final byte[] f7296 = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 49, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final byte[] f7297 = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 50, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7298 = 11;

    /* JADX WARN: Code duplicated, block: B:183:0x0286  */
    /* JADX WARN: Code duplicated, block: B:200:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:202:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:204:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:227:0x036a  */
    /* JADX WARN: Code duplicated, block: B:229:0x0386  */
    /* JADX WARN: Code duplicated, block: B:231:0x038b  */
    /* JADX WARN: Code duplicated, block: B:235:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:246:0x041f  */
    /* JADX WARN: Code duplicated, block: B:399:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:400:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:403:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:404:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:406:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:408:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:411:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:413:0x06d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:423:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m4223(C0793 c0793, C1814 c1814, ArrayList arrayList, int i) {
        int i2;
        C0562[] c0562Arr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        C0792 c0792;
        C1814 c1815;
        C2845 c2845;
        C0778 c0778;
        C2845 c2846;
        C0792 c0794;
        int i6;
        C0778 c0779;
        C2845 c2847;
        C2845 c2848;
        C0792 c0795;
        int i7;
        C0778[] c0778Arr;
        int i8;
        C0778 c07710;
        C0778 c07711;
        C2845 c2849;
        C0778 c07712;
        C2845 c28410;
        int size;
        ArrayList arrayList2;
        int i9;
        float f;
        C2845 c28411;
        C2845 c28412;
        C2845 c28413;
        C2845 c28414;
        C0276 c0276M3713;
        float f2;
        C0778 c07713;
        C0792 c0796;
        int i10;
        int i11;
        C0792 c0797;
        C0793 c0798 = c0793;
        if (i == 0) {
            i2 = c0798.f3150;
            c0562Arr = c0798.f3153;
            i3 = 0;
        } else {
            i2 = c0798.f3151;
            c0562Arr = c0798.f3152;
            i3 = 2;
        }
        int i12 = i2;
        C0562[] c0562Arr2 = c0562Arr;
        int i13 = 0;
        while (i13 < i12) {
            C0562 c0562 = c0562Arr2[i13];
            boolean z4 = c0562.f2336;
            C0792 c0799 = c0562.f2320;
            C0778[] c0778Arr2 = c0799.f3116;
            int i14 = 3;
            int i15 = 8;
            float f3 = 0.0f;
            if (z4) {
                i4 = i13;
            } else {
                int i16 = c0562.f2331;
                int i17 = i16 * 2;
                C0792 c07910 = c0799;
                C0792 c07911 = c07910;
                boolean z5 = false;
                while (!z5) {
                    c0562.f2328++;
                    C0792[] c0792Arr = c07910.f3138;
                    C0778[] c0778Arr3 = c07910.f3116;
                    c0792Arr[i16] = null;
                    c07910.f3137[i16] = null;
                    if (c07910.f3132 != i15) {
                        c07910.m2427(i16);
                        c0778Arr3[i17].m2389();
                        int i18 = i17 + 1;
                        c0778Arr3[i18].m2389();
                        c0778Arr3[i17].m2389();
                        c0778Arr3[i18].m2389();
                        if (c0562.f2321 == null) {
                            c0562.f2321 = c07910;
                        }
                        c0562.f2323 = c07910;
                        int i19 = c07910.f3141[i16];
                        if (i19 == i14) {
                            int i20 = c07910.f3093[i16];
                            if (i20 == 0 || i20 == i14 || i20 == 2) {
                                c0562.f2329++;
                                float f4 = c07910.f3136[i16];
                                if (f4 > 0.0f) {
                                    c0562.f2330 += f4;
                                }
                                i11 = i16;
                                if (c07910.f3132 != 8 && i19 == 3 && (i20 == 0 || i20 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0562.f2333 = true;
                                    } else {
                                        c0562.f2334 = true;
                                    }
                                    if (c0562.f2327 == null) {
                                        c0562.f2327 = new ArrayList();
                                    }
                                    c0562.f2327.add(c07910);
                                }
                                if (c0562.f2325 == null) {
                                    c0562.f2325 = c07910;
                                }
                                C0792 c07912 = c0562.f2326;
                                if (c07912 != null) {
                                    c07912.f3137[i11] = c07910;
                                }
                                c0562.f2326 = c07910;
                            } else {
                                i13 = i13;
                                i11 = i16;
                            }
                            if (i11 == 0) {
                                if (c07910.f3091 == 0 && c07910.f3094 == 0) {
                                    int i21 = c07910.f3095;
                                }
                            } else if (c07910.f3092 == 0 && c07910.f3097 == 0) {
                                int i22 = c07910.f3098;
                            }
                        } else {
                            i13 = i13;
                            i11 = i16;
                        }
                    } else {
                        i13 = i13;
                        i11 = i16;
                    }
                    C0792 c07913 = c07911;
                    if (c07913 != c07910) {
                        c07913.f3138[i11] = c07910;
                    }
                    C0778 c07714 = c0778Arr3[i17 + 1].f2888;
                    if (c07714 != null) {
                        c0797 = c07714.f2886;
                        C0778 c07715 = c0797.f3116[i17].f2888;
                        if (c07715 == null || c07715.f2886 != c07910) {
                            c0797 = null;
                        }
                    } else {
                        c0797 = null;
                    }
                    if (c0797 == null) {
                        c0797 = c07910;
                        z5 = true;
                    }
                    c07911 = c07910;
                    i16 = i11;
                    i14 = 3;
                    i15 = 8;
                    c07910 = c0797;
                    i13 = i13;
                }
                i4 = i13;
                int i23 = i16;
                C0792 c07914 = c0562.f2321;
                if (c07914 != null) {
                    c07914.f3116[i17].m2389();
                }
                C0792 c07915 = c0562.f2323;
                if (c07915 != null) {
                    c07915.f3116[i17 + 1].m2389();
                }
                c0562.f2322 = c07910;
                if (i23 == 0 && c0562.f2332) {
                    c0562.f2324 = c07910;
                } else {
                    c0562.f2324 = c0799;
                }
                c0562.f2335 = c0562.f2334 && c0562.f2333;
            }
            c0562.f2336 = true;
            if (arrayList == 0 || arrayList.contains(c0799)) {
                C0792 c07916 = c0562.f2322;
                C0792 c07917 = c0562.f2321;
                C0792 c07918 = c0562.f2323;
                C0792 c07919 = c0562.f2324;
                float f5 = c0562.f2330;
                int[] iArr = c0798.f3141;
                C0778[] c0778Arr4 = c0798.f3116;
                boolean z6 = iArr[i] == 2;
                if (i == 0) {
                    int i24 = c07919.f3134;
                    boolean z7 = i24 == 0;
                    boolean z8 = i24 == 1;
                    z = i24 == 2;
                    z3 = z8;
                    z2 = z7;
                } else {
                    int i25 = c07919.f3135;
                    boolean z9 = i25 == 0;
                    boolean z10 = i25 == 1;
                    z = i25 == 2;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    C0778[] c0778Arr5 = c0799.f3116;
                    int[] iArr2 = c0799.f3141;
                    C0778 c07716 = c0778Arr5[i3];
                    int i26 = z ? 1 : 4;
                    int iM2389 = c07716.m2389();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i] == 3 && c0799.f3093[i] == 0;
                    C0778 c07717 = c07716.f2888;
                    if (c07717 != null && c0799 != c0799) {
                        iM2389 = c07717.m2389() + iM2389;
                    }
                    int i27 = iM2389;
                    if (z13 && c0799 != c0799 && c0799 != c07917) {
                        i26 = 8;
                    }
                    C0792 c07920 = c0799;
                    C0778 c07718 = c07716.f2888;
                    if (c07718 != null) {
                        if (c0799 == c07917) {
                            c1814.m3707(c07716.f2891, c07718.f2891, i27, 6);
                        } else {
                            c1814.m3707(c07716.f2891, c07718.f2891, i27, 8);
                        }
                        c1814.m3706(c07716.f2891, c07716.f2888.f2891, i27, (!z14 || z13) ? i26 : 5);
                    }
                    if (z12) {
                        if (c0799.f3132 == 8 || iArr2[i] != 3) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            c1814.m3707(c0778Arr5[i3 + 1].f2891, c0778Arr5[i3].f2891, 0, 5);
                        }
                        c1814.m3707(c0778Arr5[i3].f2891, c0778Arr4[i3].f2891, i10, 8);
                    }
                    C0778 c07719 = c0778Arr5[i3 + 1].f2888;
                    if (c07719 != null) {
                        c0796 = c07719.f2886;
                        C0778 c07720 = c0796.f3116[i3].f2888;
                        if (c07720 == null || c07720.f2886 != c0799) {
                            c0796 = null;
                        }
                    } else {
                        c0796 = null;
                    }
                    if (c0796 != null) {
                        c0799 = c0796;
                    } else {
                        z11 = true;
                    }
                    c0799 = c07920;
                    z6 = z12;
                    z = z13;
                }
                boolean z15 = z6;
                boolean z16 = z;
                if (c07918 != null) {
                    int i28 = i3 + 1;
                    if (c07916.f3116[i28].f2888 != null) {
                        C0778 c07721 = c07918.f3116[i28];
                        if (c07918.f3141[i] == 3 && c07918.f3093[i] == 0 && !z16) {
                            C0778 c07722 = c07721.f2888;
                            if (c07722.f2886 == c0798) {
                                c1814.m3706(c07721.f2891, c07722.f2891, -c07721.m2389(), 5);
                            } else if (z16) {
                                c07713 = c07721.f2888;
                                if (c07713.f2886 == c0798) {
                                    c1814.m3706(c07721.f2891, c07713.f2891, -c07721.m2389(), 4);
                                }
                            }
                        } else if (z16) {
                            c07713 = c07721.f2888;
                            if (c07713.f2886 == c0798) {
                                c1814.m3706(c07721.f2891, c07713.f2891, -c07721.m2389(), 4);
                            }
                        }
                        c1814.m3708(c07721.f2891, c07916.f3116[i28].f2888.f2891, -c07721.m2389(), 6);
                    }
                }
                if (z15) {
                    int i29 = i3 + 1;
                    C2845 c28415 = c0778Arr4[i29].f2891;
                    C0778 c07723 = c07916.f3116[i29];
                    c1814.m3707(c28415, c07723.f2891, c07723.m2389(), 8);
                }
                ArrayList arrayList3 = c0562.f2327;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (c0562.f2333 && !c0562.f2335) {
                        f5 = c0562.f2329;
                    }
                    C0792 c07921 = null;
                    float f6 = 0.0f;
                    int i30 = 0;
                    while (i30 < size) {
                        C0792 c07922 = (C0792) arrayList3.get(i30);
                        float[] fArr = c07922.f3136;
                        C0778[] c0778Arr6 = c07922.f3116;
                        float f7 = fArr[i];
                        if (f7 >= f3) {
                            arrayList2 = arrayList3;
                            i9 = size;
                            if (f7 == f3) {
                                c1814.m3706(c0778Arr6[i3 + 1].f2891, c0778Arr6[i3].f2891, 0, 8);
                                i30 = i30;
                                f = f3;
                                f6 = f6;
                                i12 = i12;
                            } else {
                                float f8 = f6;
                                if (c07921 != null) {
                                    C0778[] c0778Arr7 = c07921.f3116;
                                    c28411 = c0778Arr7[i3].f2891;
                                    int i31 = i3 + 1;
                                    c28412 = c0778Arr7[i31].f2891;
                                    c28413 = c0778Arr6[i3].f2891;
                                    c28414 = c0778Arr6[i31].f2891;
                                    c0276M3713 = c1814.m3713();
                                    f2 = f3;
                                    c0276M3713.f1537 = f2;
                                    f = f2;
                                    if (f5 != f2 || f8 == f7) {
                                        c0276M3713.f1539.m1507(c28411, 1.0f);
                                        c0276M3713.f1539.m1507(c28412, -1.0f);
                                        c0276M3713.f1539.m1507(c28414, 1.0f);
                                        c0276M3713.f1539.m1507(c28413, -1.0f);
                                    } else if (f8 == f) {
                                        c0276M3713.f1539.m1507(c28411, 1.0f);
                                        c0276M3713.f1539.m1507(c28412, -1.0f);
                                    } else if (f7 == f3) {
                                        c0276M3713.f1539.m1507(c28413, 1.0f);
                                        c0276M3713.f1539.m1507(c28414, -1.0f);
                                    } else {
                                        float f9 = (f8 / f5) / (f7 / f5);
                                        c0276M3713.f1539.m1507(c28411, 1.0f);
                                        c0276M3713.f1539.m1507(c28412, -1.0f);
                                        c0276M3713.f1539.m1507(c28414, f9);
                                        c0276M3713.f1539.m1507(c28413, -f9);
                                    }
                                    c1814.m3704(c0276M3713);
                                } else {
                                    i30 = i30;
                                    f = f3;
                                    i12 = i12;
                                }
                                f6 = f7;
                                c07921 = c07922;
                            }
                        } else {
                            if (c0562.f2335) {
                                arrayList2 = arrayList3;
                                i9 = size;
                                c1814.m3706(c0778Arr6[i3 + 1].f2891, c0778Arr6[i3].f2891, 0, 4);
                            } else {
                                f7 = 1.0f;
                                arrayList2 = arrayList3;
                                i9 = size;
                                if (f7 == f3) {
                                    c1814.m3706(c0778Arr6[i3 + 1].f2891, c0778Arr6[i3].f2891, 0, 8);
                                } else {
                                    float f10 = f6;
                                    if (c07921 != null) {
                                        C0778[] c0778Arr8 = c07921.f3116;
                                        c28411 = c0778Arr8[i3].f2891;
                                        int i32 = i3 + 1;
                                        c28412 = c0778Arr8[i32].f2891;
                                        c28413 = c0778Arr6[i3].f2891;
                                        c28414 = c0778Arr6[i32].f2891;
                                        c0276M3713 = c1814.m3713();
                                        f2 = f3;
                                        c0276M3713.f1537 = f2;
                                        f = f2;
                                        if (f5 != f2) {
                                            c0276M3713.f1539.m1507(c28411, 1.0f);
                                            c0276M3713.f1539.m1507(c28412, -1.0f);
                                            c0276M3713.f1539.m1507(c28414, 1.0f);
                                            c0276M3713.f1539.m1507(c28413, -1.0f);
                                        } else {
                                            c0276M3713.f1539.m1507(c28411, 1.0f);
                                            c0276M3713.f1539.m1507(c28412, -1.0f);
                                            c0276M3713.f1539.m1507(c28414, 1.0f);
                                            c0276M3713.f1539.m1507(c28413, -1.0f);
                                        }
                                        c1814.m3704(c0276M3713);
                                    } else {
                                        i30 = i30;
                                        f = f3;
                                        i12 = i12;
                                    }
                                    f6 = f7;
                                    c07921 = c07922;
                                }
                            }
                            i30 = i30;
                            f = f3;
                            f6 = f6;
                            i12 = i12;
                        }
                        i30++;
                        i12 = i12;
                        arrayList3 = arrayList2;
                        size = i9;
                        f3 = f;
                    }
                }
                i5 = i12;
                if (c07917 == null || !(c07917 == c07918 || z16)) {
                    c0792 = c07918;
                    if (!z2 || c07917 == null) {
                        int i33 = 8;
                        if (z3 && c07917 != null) {
                            int i34 = c0562.f2329;
                            boolean z17 = i34 > 0 && c0562.f2328 == i34;
                            C0792 c07923 = c07917;
                            C0792 c07924 = c07923;
                            while (c07924 != null) {
                                C0778[] c0778Arr9 = c07924.f3116;
                                C0792 c07925 = c07924.f3138[i];
                                while (c07925 != null && c07925.f3132 == i33) {
                                    c07925 = c07925.f3138[i];
                                }
                                if (c07924 == c07917 || c07924 == c0792 || c07925 == null) {
                                    c07923 = c07923;
                                } else {
                                    if (c07925 == c0792) {
                                        c07925 = null;
                                    }
                                    C0778 c07724 = c0778Arr9[i3];
                                    C2845 c28416 = c07724.f2891;
                                    int i35 = i3 + 1;
                                    C2845 c28417 = c07923.f3116[i35].f2891;
                                    int iM23810 = c07724.m2389();
                                    int iM23811 = c0778Arr9[i35].m2389();
                                    if (c07925 != null) {
                                        c0778 = c07925.f3116[i3];
                                        c2846 = c0778.f2891;
                                        C0778 c07725 = c0778.f2888;
                                        c2845 = c07725 != null ? c07725.f2891 : null;
                                    } else {
                                        C0778 c07726 = c0792.f3116[i3];
                                        C2845 c28418 = c07726 != null ? c07726.f2891 : null;
                                        c2845 = c0778Arr9[i35].f2891;
                                        c0778 = c07726;
                                        c2846 = c28418;
                                    }
                                    if (c0778 != null) {
                                        iM23811 += c0778.m2389();
                                    }
                                    int iM23812 = iM23810 + c07923.f3116[i35].m2389();
                                    C0792 c07926 = c07925;
                                    C2845 c28419 = c2846;
                                    int i36 = z17 ? 8 : 4;
                                    if (c28416 == null || c28417 == null || c28419 == null || c2845 == null) {
                                        c0794 = c07926;
                                    } else {
                                        c0794 = c07926;
                                        c1814.m3703(c28416, c28417, iM23812, 0.5f, c28419, c2845, iM23811, i36);
                                    }
                                    c07925 = c0794;
                                }
                                if (c07924.f3132 != 8) {
                                    c07923 = c07924;
                                }
                                c07924 = c07925;
                                c07923 = c07923;
                                i33 = 8;
                            }
                            c1815 = c1814;
                            C0778 c07727 = c07917.f3116[i3];
                            C0778 c07728 = c0778Arr2[i3].f2888;
                            int i37 = i3 + 1;
                            C0778 c07729 = c0792.f3116[i37];
                            C0778 c07730 = c07916.f3116[i37].f2888;
                            if (c07728 != null) {
                                if (c07917 != c0792) {
                                    c1815.m3706(c07727.f2891, c07728.f2891, c07727.m2389(), 5);
                                } else if (c07730 != null) {
                                    c1815.m3703(c07727.f2891, c07728.f2891, c07727.m2389(), 0.5f, c07729.f2891, c07730.f2891, c07729.m2389(), 5);
                                }
                            }
                            if (c07730 != null && c07917 != c0792) {
                                c1815.m3706(c07729.f2891, c07730.f2891, -c07729.m2389(), 5);
                            }
                        }
                        if ((z2 || z3) && c07917 != null && c07917 != c0792) {
                            c0778Arr = c07917.f3116;
                            C0778 c07731 = c0778Arr[i3];
                            i8 = i3 + 1;
                            c07710 = c0792.f3116[i8];
                            c07711 = c07731.f2888;
                            if (c07711 != null) {
                                c2849 = c07711.f2891;
                            } else {
                                c2849 = null;
                            }
                            c07712 = c07710.f2888;
                            if (c07712 != null) {
                                c28410 = c07712.f2891;
                            } else {
                                c28410 = null;
                            }
                            if (c07916 != c0792) {
                                C0778 c07732 = c07916.f3116[i8].f2888;
                                c28410 = c07732 != null ? c07732.f2891 : null;
                            }
                            if (c07917 == c0792) {
                                c07710 = c0778Arr[i8];
                            }
                            if (c2849 == null && c28410 != null) {
                                c1815.m3703(c07731.f2891, c2849, c07731.m2389(), 0.5f, c28410, c07710.f2891, c0792.f3116[i8].m2389(), 5);
                            }
                        }
                    } else {
                        int i38 = c0562.f2329;
                        boolean z18 = i38 > 0 && c0562.f2328 == i38;
                        C0792 c07927 = c07917;
                        C0792 c07928 = c07927;
                        while (c07927 != null) {
                            C0778[] c0778Arr10 = c07927.f3116;
                            C0792 c07929 = c07927.f3138[i];
                            while (true) {
                                if (c07929 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (c07929.f3132 != 8) {
                                    break;
                                } else {
                                    c07929 = c07929.f3138[i];
                                }
                            }
                            if (c07929 != null || c07927 == c0792) {
                                C0778 c07733 = c0778Arr10[i3];
                                C2845 c28420 = c07733.f2891;
                                C0778 c07734 = c07733.f2888;
                                C2845 c28421 = c07734 != null ? c07734.f2891 : null;
                                if (c07928 != c07927) {
                                    c28421 = c07928.f3116[i3 + 1].f2891;
                                } else if (c07927 == c07917 && c07928 == c07927) {
                                    C0778 c07735 = c0778Arr2[i3].f2888;
                                    c28421 = c07735 != null ? c07735.f2891 : null;
                                }
                                int iM23813 = c07733.m2389();
                                int i39 = i3 + 1;
                                int iM23814 = c0778Arr10[i39].m2389();
                                if (c07929 != null) {
                                    c0779 = c07929.f3116[i3];
                                    c2847 = c0779.f2891;
                                    c2848 = c0778Arr10[i39].f2891;
                                } else {
                                    c0779 = c07916.f3116[i39].f2888;
                                    c2847 = c0779 != null ? c0779.f2891 : null;
                                    c2848 = c0778Arr10[i39].f2891;
                                }
                                if (c0779 != null) {
                                    iM23814 += c0779.m2389();
                                }
                                if (c07928 != null) {
                                    iM23813 += c07928.f3116[i39].m2389();
                                }
                                if (c28420 == null || c28421 == null || c2847 == null || c2848 == null) {
                                    c0795 = c07929;
                                    i7 = 8;
                                } else {
                                    if (c07927 == c07917) {
                                        iM23813 = c07917.f3116[i3].m2389();
                                    }
                                    if (c07927 == c0792) {
                                        iM23814 = c0792.f3116[i39].m2389();
                                    }
                                    c0795 = c07929;
                                    i7 = 8;
                                    c1814.m3703(c28420, c28421, iM23813, 0.5f, c2847, c2848, iM23814, z18 ? 8 : 5);
                                }
                            } else {
                                c0795 = c07929;
                                i7 = i6;
                            }
                            if (c07927.f3132 != i7) {
                                c07928 = c07927;
                            }
                            c07927 = c0795;
                            c07928 = c07928;
                            c0778Arr2 = c0778Arr2;
                        }
                    }
                } else {
                    C0778 c07736 = c0778Arr2[i3];
                    int i40 = i3 + 1;
                    C0778 c07737 = c07916.f3116[i40];
                    C0778 c07738 = c07736.f2888;
                    C2845 c28422 = c07738 != null ? c07738.f2891 : null;
                    C0778 c07739 = c07737.f2888;
                    C2845 c28423 = c07739 != null ? c07739.f2891 : null;
                    C0778 c07740 = c07917.f3116[i3];
                    C0778 c07741 = c07918.f3116[i40];
                    if (c28422 == null || c28423 == null) {
                        c0792 = c07918;
                    } else {
                        C2845 c28424 = c28422;
                        c0792 = c07918;
                        c1814.m3703(c07740.f2891, c28424, c07740.m2389(), i == 0 ? c07919.f3129 : c07919.f3130, c28423, c07741.f2891, c07741.m2389(), 7);
                    }
                }
                c1815 = c1814;
                if (z2) {
                    c0778Arr = c07917.f3116;
                    C0778 c077310 = c0778Arr[i3];
                    i8 = i3 + 1;
                    c07710 = c0792.f3116[i8];
                    c07711 = c077310.f2888;
                    if (c07711 != null) {
                        c2849 = c07711.f2891;
                    } else {
                        c2849 = null;
                    }
                    c07712 = c07710.f2888;
                    if (c07712 != null) {
                        c28410 = c07712.f2891;
                    } else {
                        c28410 = null;
                    }
                    if (c07916 != c0792) {
                        C0778 c077311 = c07916.f3116[i8].f2888;
                        c28410 = c077311 != null ? c077311.f2891 : null;
                    }
                    if (c07917 == c0792) {
                        c07710 = c0778Arr[i8];
                    }
                    if (c2849 == null) {
                    }
                } else {
                    c0778Arr = c07917.f3116;
                    C0778 c077312 = c0778Arr[i3];
                    i8 = i3 + 1;
                    c07710 = c0792.f3116[i8];
                    c07711 = c077312.f2888;
                    if (c07711 != null) {
                        c2849 = c07711.f2891;
                    } else {
                        c2849 = null;
                    }
                    c07712 = c07710.f2888;
                    if (c07712 != null) {
                        c28410 = c07712.f2891;
                    } else {
                        c28410 = null;
                    }
                    if (c07916 != c0792) {
                        C0778 c077313 = c07916.f3116[i8].f2888;
                        c28410 = c077313 != null ? c077313.f2891 : null;
                    }
                    if (c07917 == c0792) {
                        c07710 = c0778Arr[i8];
                    }
                    if (c2849 == null) {
                    }
                }
            } else {
                i5 = i12;
            }
            i13 = i4 + 1;
            c0798 = c0793;
            i12 = i5;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final void m4224(View view) {
        C2712 c2712 = new C2712();
        C3645 c3645 = new C3645(view, c2712);
        c3645.f11369 = c2712;
        c2712.f8721 = c3645;
        while (c2712.hasNext()) {
            View view2 = (View) c2712.next();
            C2430 c2430 = (C2430) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (c2430 == null) {
                c2430 = new C2430();
                view2.setTag(R.id.pooling_container_listener_holder_tag, c2430);
            }
            ArrayList arrayList = c2430.f7776;
            int iM2310 = AbstractC0740.m2310(arrayList);
            if (-1 < iM2310) {
                arrayList.get(iM2310).getClass();
                throw new ClassCastException();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final InterfaceC2715 m4225(InterfaceC2715 interfaceC2715, C2135 c2135) {
        if (!AbstractC1469.m3322(interfaceC2715.mo3640(), C2718.f8736)) {
            return interfaceC2715.mo3522() ? m4225(interfaceC2715.mo3644(0), c2135) : interfaceC2715;
        }
        AbstractC1468.m3306(interfaceC2715);
        return interfaceC2715;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C0400 m4226(InterfaceC0399 interfaceC0399, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = AbstractC3486.f10962;
                    lock.lock();
                    Bitmap bitmapMo1618 = interfaceC0399.mo1618(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo1618);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo1618;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
                z = true;
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            interfaceC0399 = f7290;
        }
        return C0400.m1734(interfaceC0399, bitmap);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final long m4227(long j, EnumC1128 enumC1128) {
        long j2;
        int iOrdinal = enumC1128.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                throw new IllegalStateException(("Wrong unit for millisMultiplier: " + enumC1128).toString());
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static Bitmap m4228(InputStream inputStream, BitmapFactory.Options options, C0253 c0253) throws Throwable {
        int i = Build.VERSION.SDK_INT;
        Bitmap bitmap = null;
        if (i == 34) {
            if (((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) AbstractC3528.f11115.get()).booleanValue() : false) && m4234(c0253)) {
                Bitmap.Config config = options.inPreferredConfig;
                Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                AbstractC2727.m4691("", config == config2);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    if (bitmapDecodeStream == null) {
                        if (bitmapDecodeStream != null) {
                            bitmapDecodeStream.recycle();
                        }
                        options.inPreferredConfig = config2;
                        return null;
                    }
                    try {
                        Bitmap bitmapM4236 = m4236(bitmapDecodeStream);
                        bitmapDecodeStream.recycle();
                        options.inPreferredConfig = config2;
                        return bitmapM4236;
                    } catch (Throwable th) {
                        th = th;
                        bitmap = bitmapDecodeStream;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final AbstractC2927[] m4229() {
        return new AbstractC2927[]{C0214.f1358, C0216.f1364, C0218.f1371, C0219.f1376, C0220.f1381, C0129.f1138, C0438.f2010, C0440.f2024, C0448.f2036, C0629.f2480, C0931.f3428, C0934.f3435, C2075.f6941, C2084.f6958, C2129.f7031, C2662.f8620, C0196.f1317, C0202.f1327, C0205.f1334, C0318.f1604, C0324.f1625, C0326.f1630, C0330.f1642, C0654.f2534, C1054.f3830, C1057.f3836, C1061.f3843, C1063.f3849, C2089.f6967, C2108.f6996, C2115.f7008, C2361.f7587, C2497.f7918, C2507.f7940, C2511.f7948, C2762.f8877, C2780.f8938, C1409.f5086, C1549.f5409, C1552.f5417, C1553.f5422, C1556.f5428, C1558.f5434, C1561.f5440, C2406.f7709, C0194.f1311, C0946.f3467, C0949.f3474, C1325.f4772, C3503.f11018, C0585.f2388, C0586.f2392, C2145.f7082, C2146.f7086, C0191.f1305, C2244.f7308, C1512.f5328, C1525.f5365, C1161.f4280, C1872.f6214, C3680.f11467, C2857.f9085, C2587.f8222, C2589.f8227, C2591.f8232, C2592.f8236, C2599.f8249, C1177.f4304, C2090.f6973, C2124.f7023, C3676.f11458, C3686.f11477, C2394.f7671, C2502.f7932, C0718.f2728, C2116.f7012, C2331.f7527, C2499.f7924, C2064.f6913, C2065.f6917, C2067.f6924, RunnableC0315.f1597, C0322.f1611, C0723.f2749, C1050.f3823, C2020.f6715, C2138.f7064, C2693.f8686, C2753.f8853, C2941.f9397, C2567.f8181, C2568.f8185, C0206.f1339, C0208.f1345, C0210.f1350, C2782.f8943, C2787.f8953, C2792.f8961, C2793.f8965, C2800.f8975, C2815.f9003, C2827.f9018, C2831.f9030, C0653.f2528, C1369.f4885, C0615.f2456, C2757.f8862, C2758.f8866, C2759.f8870, C3671.f11440, C3673.f11447, C1480.f5271, C1482.f5274, C2142.f7073, C3677.f11462, C0660.f2544, C2340.f7549, C0189.f1299, C1019.f3722, C1064.f3853, C0752.f2846, C3739.f11697};
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C0702 m4230(Annotation annotation) {
        return AbstractC2574.m4549(annotation.annotationType());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final Class m4231(InterfaceC1760 interfaceC1760) {
        Class clsMo2209 = ((InterfaceC0692) interfaceC1760).mo2209();
        if (clsMo2209.isPrimitive()) {
            String name = clsMo2209.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo2209;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final Class m4232(C0702 c0702) {
        Class clsMo2209 = c0702.mo2209();
        if (clsMo2209.isPrimitive()) {
            return clsMo2209;
        }
        String name = clsMo2209.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final void m4233(InterfaceC0876 interfaceC0876, Throwable th) {
        if (th instanceof C1076) {
            th = ((C1076) th).f3896;
        }
        try {
            InterfaceC0878 interfaceC0878 = (InterfaceC0878) interfaceC0876.mo1086(C1139.f4215);
            if (interfaceC0878 != null) {
                interfaceC0878.mo1339(th);
            } else {
                AbstractC2235.m4202(interfaceC0876, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC1272.m3094(runtimeException, th);
                th = runtimeException;
            }
            AbstractC2235.m4202(interfaceC0876, th);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static boolean m4234(C0253 c0253) throws Throwable {
        try {
            boolean zM1471 = c0253.m1471();
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return zM1471;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + zM1471);
            return zM1471;
        } catch (IOException e) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static boolean m4235(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static Bitmap m4236(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == config2) {
                ColorMatrixColorFilter colorMatrixColorFilter = AbstractC1466.f5210;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == config2) {
                    AbstractC2727.m4691("", gainmapContents.getConfig() == config2);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(AbstractC1466.f5210);
                    canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmapM1812 = AbstractC0450.m1812(bitmapCreateBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmapM1812.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmapM1812.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmapM1812.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmapM1812.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmapM1812.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmapM1812.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmapM1812.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmapM1812;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final EnumC3732 m4237(AbstractC1725 abstractC1725, InterfaceC2715 interfaceC2715) {
        AbstractC2236 abstractC2236Mo3640 = interfaceC2715.mo3640();
        if (abstractC2236Mo3640 instanceof AbstractC2428) {
            return EnumC3732.POLY_OBJ;
        }
        if (AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9281)) {
            return EnumC3732.LIST;
        }
        if (!AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9282)) {
            return EnumC3732.OBJ;
        }
        InterfaceC2715 interfaceC2715M4225 = m4225(interfaceC2715.mo3644(0), abstractC1725.f5843);
        AbstractC2236 abstractC2236Mo3641 = interfaceC2715M4225.mo3640();
        if ((abstractC2236Mo3641 instanceof AbstractC2451) || AbstractC1469.m3322(abstractC2236Mo3641, C2719.f8737)) {
            return EnumC3732.MAP;
        }
        throw AbstractC2234.m4156(interfaceC2715M4225);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static byte[] m4238(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((C3529) it.next()).f11117;
            i++;
        }
        return bArr;
    }

    public int hashCode() {
        switch (this.f7298) {
            case 11:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f7298) {
            case 11:
                return AbstractC2574.m4549(getClass()).m2221();
            default:
                return super.toString();
        }
    }
}
