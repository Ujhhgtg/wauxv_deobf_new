package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewParent;
import android.widget.Toast;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import me.hd.wauxv.R;
import okhttp3.HttpUrl;
import okhttp3.Request;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᲀᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3471 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1227 f10961 = new C1227(3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final int[] f10962 = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f10963 = {R.attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static Toast f10964;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final String m5062(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        C1009 c1009 = new C1009(new C0637(2, type), C3470.f10960, 1);
        StringBuilder sb = new StringBuilder();
        Iterator it = c1009.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        sb.append(((Class) next).getName());
        sb.append(AbstractC2849.m4856(AbstractC2652.m4653(c1009), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final void m5063(InterfaceC1206 interfaceC1206) {
        if ((interfaceC1206 instanceof C2829 ? (C2829) interfaceC1206 : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + AbstractC2519.m4527(interfaceC1206.getClass()));
    }

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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m5064(C0794 c0794, C1791 c1791, ArrayList arrayList, int i) {
        int i2;
        C0581[] c0581Arr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        C0793 c0793;
        C1791 c1792;
        C2785 c2785;
        C0779 c0779;
        C2785 c2786;
        C0793 c0795;
        int i6;
        C0779 c07710;
        C2785 c2787;
        C2785 c2788;
        C0793 c0796;
        int i7;
        C0779[] c0779Arr;
        int i8;
        C0779 c07711;
        C0779 c07712;
        C2785 c2789;
        C0779 c07713;
        C2785 c27810;
        int size;
        ArrayList arrayList2;
        int i9;
        float f;
        C2785 c27811;
        C2785 c27812;
        C2785 c27813;
        C2785 c27814;
        C0266 c0266M3541;
        float f2;
        C0779 c07714;
        C0793 c0797;
        int i10;
        int i11;
        C0793 c0798;
        C0794 c0799 = c0794;
        if (i == 0) {
            i2 = c0799.f3143;
            c0581Arr = c0799.f3146;
            i3 = 0;
        } else {
            i2 = c0799.f3144;
            c0581Arr = c0799.f3145;
            i3 = 2;
        }
        int i12 = i2;
        C0581[] c0581Arr2 = c0581Arr;
        int i13 = 0;
        while (i13 < i12) {
            C0581 c0581 = c0581Arr2[i13];
            boolean z4 = c0581.f2370;
            C0793 c07910 = c0581.f2354;
            C0779[] c0779Arr2 = c07910.f3109;
            int i14 = 3;
            int i15 = 8;
            float f3 = 0.0f;
            if (z4) {
                i4 = i13;
            } else {
                int i16 = c0581.f2365;
                int i17 = i16 * 2;
                C0793 c07911 = c07910;
                C0793 c07912 = c07911;
                boolean z5 = false;
                while (!z5) {
                    c0581.f2362++;
                    C0793[] c0793Arr = c07911.f3131;
                    C0779[] c0779Arr3 = c07911.f3109;
                    c0793Arr[i16] = null;
                    c07911.f3130[i16] = null;
                    if (c07911.f3125 != i15) {
                        c07911.m2312(i16);
                        c0779Arr3[i17].m2274();
                        int i18 = i17 + 1;
                        c0779Arr3[i18].m2274();
                        c0779Arr3[i17].m2274();
                        c0779Arr3[i18].m2274();
                        if (c0581.f2355 == null) {
                            c0581.f2355 = c07911;
                        }
                        c0581.f2357 = c07911;
                        int i19 = c07911.f3134[i16];
                        if (i19 == i14) {
                            int i20 = c07911.f3086[i16];
                            if (i20 == 0 || i20 == i14 || i20 == 2) {
                                c0581.f2363++;
                                float f4 = c07911.f3129[i16];
                                if (f4 > 0.0f) {
                                    c0581.f2364 += f4;
                                }
                                i11 = i16;
                                if (c07911.f3125 != 8 && i19 == 3 && (i20 == 0 || i20 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0581.f2367 = true;
                                    } else {
                                        c0581.f2368 = true;
                                    }
                                    if (c0581.f2361 == null) {
                                        c0581.f2361 = new ArrayList();
                                    }
                                    c0581.f2361.add(c07911);
                                }
                                if (c0581.f2359 == null) {
                                    c0581.f2359 = c07911;
                                }
                                C0793 c07913 = c0581.f2360;
                                if (c07913 != null) {
                                    c07913.f3130[i11] = c07911;
                                }
                                c0581.f2360 = c07911;
                            } else {
                                i13 = i13;
                                i11 = i16;
                            }
                            if (i11 == 0) {
                                if (c07911.f3084 == 0 && c07911.f3087 == 0) {
                                    int i21 = c07911.f3088;
                                }
                            } else if (c07911.f3085 == 0 && c07911.f3090 == 0) {
                                int i22 = c07911.f3091;
                            }
                        } else {
                            i13 = i13;
                            i11 = i16;
                        }
                    } else {
                        i13 = i13;
                        i11 = i16;
                    }
                    C0793 c07914 = c07912;
                    if (c07914 != c07911) {
                        c07914.f3131[i11] = c07911;
                    }
                    C0779 c07715 = c0779Arr3[i17 + 1].f2881;
                    if (c07715 != null) {
                        c0798 = c07715.f2879;
                        C0779 c07716 = c0798.f3109[i17].f2881;
                        if (c07716 == null || c07716.f2879 != c07911) {
                            c0798 = null;
                        }
                    } else {
                        c0798 = null;
                    }
                    if (c0798 == null) {
                        c0798 = c07911;
                        z5 = true;
                    }
                    c07912 = c07911;
                    i16 = i11;
                    i14 = 3;
                    i15 = 8;
                    c07911 = c0798;
                    i13 = i13;
                }
                i4 = i13;
                int i23 = i16;
                C0793 c07915 = c0581.f2355;
                if (c07915 != null) {
                    c07915.f3109[i17].m2274();
                }
                C0793 c07916 = c0581.f2357;
                if (c07916 != null) {
                    c07916.f3109[i17 + 1].m2274();
                }
                c0581.f2356 = c07911;
                if (i23 == 0 && c0581.f2366) {
                    c0581.f2358 = c07911;
                } else {
                    c0581.f2358 = c07910;
                }
                c0581.f2369 = c0581.f2368 && c0581.f2367;
            }
            c0581.f2370 = true;
            if (arrayList == 0 || arrayList.contains(c07910)) {
                C0793 c07917 = c0581.f2356;
                C0793 c07918 = c0581.f2355;
                C0793 c07919 = c0581.f2357;
                C0793 c07920 = c0581.f2358;
                float f5 = c0581.f2364;
                int[] iArr = c0799.f3134;
                C0779[] c0779Arr4 = c0799.f3109;
                boolean z6 = iArr[i] == 2;
                if (i == 0) {
                    int i24 = c07920.f3127;
                    boolean z7 = i24 == 0;
                    boolean z8 = i24 == 1;
                    z = i24 == 2;
                    z3 = z8;
                    z2 = z7;
                } else {
                    int i25 = c07920.f3128;
                    boolean z9 = i25 == 0;
                    boolean z10 = i25 == 1;
                    z = i25 == 2;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    C0779[] c0779Arr5 = c07910.f3109;
                    int[] iArr2 = c07910.f3134;
                    C0779 c07717 = c0779Arr5[i3];
                    int i26 = z ? 1 : 4;
                    int iM2274 = c07717.m2274();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i] == 3 && c07910.f3086[i] == 0;
                    C0779 c07718 = c07717.f2881;
                    if (c07718 != null && c07910 != c07910) {
                        iM2274 = c07718.m2274() + iM2274;
                    }
                    int i27 = iM2274;
                    if (z13 && c07910 != c07910 && c07910 != c07918) {
                        i26 = 8;
                    }
                    C0793 c07921 = c07910;
                    C0779 c07719 = c07717.f2881;
                    if (c07719 != null) {
                        if (c07910 == c07918) {
                            c1791.m3535(c07717.f2884, c07719.f2884, i27, 6);
                        } else {
                            c1791.m3535(c07717.f2884, c07719.f2884, i27, 8);
                        }
                        c1791.m3534(c07717.f2884, c07717.f2881.f2884, i27, (!z14 || z13) ? i26 : 5);
                    }
                    if (z12) {
                        if (c07910.f3125 == 8 || iArr2[i] != 3) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            c1791.m3535(c0779Arr5[i3 + 1].f2884, c0779Arr5[i3].f2884, 0, 5);
                        }
                        c1791.m3535(c0779Arr5[i3].f2884, c0779Arr4[i3].f2884, i10, 8);
                    }
                    C0779 c07720 = c0779Arr5[i3 + 1].f2881;
                    if (c07720 != null) {
                        c0797 = c07720.f2879;
                        C0779 c07721 = c0797.f3109[i3].f2881;
                        if (c07721 == null || c07721.f2879 != c07910) {
                            c0797 = null;
                        }
                    } else {
                        c0797 = null;
                    }
                    if (c0797 != null) {
                        c07910 = c0797;
                    } else {
                        z11 = true;
                    }
                    c07910 = c07921;
                    z6 = z12;
                    z = z13;
                }
                boolean z15 = z6;
                boolean z16 = z;
                if (c07919 != null) {
                    int i28 = i3 + 1;
                    if (c07917.f3109[i28].f2881 != null) {
                        C0779 c07722 = c07919.f3109[i28];
                        if (c07919.f3134[i] == 3 && c07919.f3086[i] == 0 && !z16) {
                            C0779 c07723 = c07722.f2881;
                            if (c07723.f2879 == c0799) {
                                c1791.m3534(c07722.f2884, c07723.f2884, -c07722.m2274(), 5);
                            } else if (z16) {
                                c07714 = c07722.f2881;
                                if (c07714.f2879 == c0799) {
                                    c1791.m3534(c07722.f2884, c07714.f2884, -c07722.m2274(), 4);
                                }
                            }
                        } else if (z16) {
                            c07714 = c07722.f2881;
                            if (c07714.f2879 == c0799) {
                                c1791.m3534(c07722.f2884, c07714.f2884, -c07722.m2274(), 4);
                            }
                        }
                        c1791.m3536(c07722.f2884, c07917.f3109[i28].f2881.f2884, -c07722.m2274(), 6);
                    }
                }
                if (z15) {
                    int i29 = i3 + 1;
                    C2785 c27815 = c0779Arr4[i29].f2884;
                    C0779 c07724 = c07917.f3109[i29];
                    c1791.m3535(c27815, c07724.f2884, c07724.m2274(), 8);
                }
                ArrayList arrayList3 = c0581.f2361;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (c0581.f2367 && !c0581.f2369) {
                        f5 = c0581.f2363;
                    }
                    C0793 c07922 = null;
                    float f6 = 0.0f;
                    int i30 = 0;
                    while (i30 < size) {
                        C0793 c07923 = (C0793) arrayList3.get(i30);
                        float[] fArr = c07923.f3129;
                        C0779[] c0779Arr6 = c07923.f3109;
                        float f7 = fArr[i];
                        if (f7 >= f3) {
                            arrayList2 = arrayList3;
                            i9 = size;
                            if (f7 == f3) {
                                c1791.m3534(c0779Arr6[i3 + 1].f2884, c0779Arr6[i3].f2884, 0, 8);
                                i30 = i30;
                                f = f3;
                                f6 = f6;
                                i12 = i12;
                            } else {
                                float f8 = f6;
                                if (c07922 != null) {
                                    C0779[] c0779Arr7 = c07922.f3109;
                                    c27811 = c0779Arr7[i3].f2884;
                                    int i31 = i3 + 1;
                                    c27812 = c0779Arr7[i31].f2884;
                                    c27813 = c0779Arr6[i3].f2884;
                                    c27814 = c0779Arr6[i31].f2884;
                                    c0266M3541 = c1791.m3541();
                                    f2 = f3;
                                    c0266M3541.f1463 = f2;
                                    f = f2;
                                    if (f5 != f2 || f8 == f7) {
                                        c0266M3541.f1465.m1361(c27811, 1.0f);
                                        c0266M3541.f1465.m1361(c27812, -1.0f);
                                        c0266M3541.f1465.m1361(c27814, 1.0f);
                                        c0266M3541.f1465.m1361(c27813, -1.0f);
                                    } else if (f8 == f) {
                                        c0266M3541.f1465.m1361(c27811, 1.0f);
                                        c0266M3541.f1465.m1361(c27812, -1.0f);
                                    } else if (f7 == f3) {
                                        c0266M3541.f1465.m1361(c27813, 1.0f);
                                        c0266M3541.f1465.m1361(c27814, -1.0f);
                                    } else {
                                        float f9 = (f8 / f5) / (f7 / f5);
                                        c0266M3541.f1465.m1361(c27811, 1.0f);
                                        c0266M3541.f1465.m1361(c27812, -1.0f);
                                        c0266M3541.f1465.m1361(c27814, f9);
                                        c0266M3541.f1465.m1361(c27813, -f9);
                                    }
                                    c1791.m3532(c0266M3541);
                                } else {
                                    i30 = i30;
                                    f = f3;
                                    i12 = i12;
                                }
                                f6 = f7;
                                c07922 = c07923;
                            }
                        } else {
                            if (c0581.f2369) {
                                arrayList2 = arrayList3;
                                i9 = size;
                                c1791.m3534(c0779Arr6[i3 + 1].f2884, c0779Arr6[i3].f2884, 0, 4);
                            } else {
                                f7 = 1.0f;
                                arrayList2 = arrayList3;
                                i9 = size;
                                if (f7 == f3) {
                                    c1791.m3534(c0779Arr6[i3 + 1].f2884, c0779Arr6[i3].f2884, 0, 8);
                                } else {
                                    float f10 = f6;
                                    if (c07922 != null) {
                                        C0779[] c0779Arr8 = c07922.f3109;
                                        c27811 = c0779Arr8[i3].f2884;
                                        int i32 = i3 + 1;
                                        c27812 = c0779Arr8[i32].f2884;
                                        c27813 = c0779Arr6[i3].f2884;
                                        c27814 = c0779Arr6[i32].f2884;
                                        c0266M3541 = c1791.m3541();
                                        f2 = f3;
                                        c0266M3541.f1463 = f2;
                                        f = f2;
                                        if (f5 != f2) {
                                            c0266M3541.f1465.m1361(c27811, 1.0f);
                                            c0266M3541.f1465.m1361(c27812, -1.0f);
                                            c0266M3541.f1465.m1361(c27814, 1.0f);
                                            c0266M3541.f1465.m1361(c27813, -1.0f);
                                        } else {
                                            c0266M3541.f1465.m1361(c27811, 1.0f);
                                            c0266M3541.f1465.m1361(c27812, -1.0f);
                                            c0266M3541.f1465.m1361(c27814, 1.0f);
                                            c0266M3541.f1465.m1361(c27813, -1.0f);
                                        }
                                        c1791.m3532(c0266M3541);
                                    } else {
                                        i30 = i30;
                                        f = f3;
                                        i12 = i12;
                                    }
                                    f6 = f7;
                                    c07922 = c07923;
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
                if (c07918 == null || !(c07918 == c07919 || z16)) {
                    c0793 = c07919;
                    if (!z2 || c07918 == null) {
                        int i33 = 8;
                        if (z3 && c07918 != null) {
                            int i34 = c0581.f2363;
                            boolean z17 = i34 > 0 && c0581.f2362 == i34;
                            C0793 c07924 = c07918;
                            C0793 c07925 = c07924;
                            while (c07925 != null) {
                                C0779[] c0779Arr9 = c07925.f3109;
                                C0793 c07926 = c07925.f3131[i];
                                while (c07926 != null && c07926.f3125 == i33) {
                                    c07926 = c07926.f3131[i];
                                }
                                if (c07925 == c07918 || c07925 == c0793 || c07926 == null) {
                                    c07924 = c07924;
                                } else {
                                    if (c07926 == c0793) {
                                        c07926 = null;
                                    }
                                    C0779 c07725 = c0779Arr9[i3];
                                    C2785 c27816 = c07725.f2884;
                                    int i35 = i3 + 1;
                                    C2785 c27817 = c07924.f3109[i35].f2884;
                                    int iM2275 = c07725.m2274();
                                    int iM2276 = c0779Arr9[i35].m2274();
                                    if (c07926 != null) {
                                        c0779 = c07926.f3109[i3];
                                        c2786 = c0779.f2884;
                                        C0779 c07726 = c0779.f2881;
                                        c2785 = c07726 != null ? c07726.f2884 : null;
                                    } else {
                                        C0779 c07727 = c0793.f3109[i3];
                                        C2785 c27818 = c07727 != null ? c07727.f2884 : null;
                                        c2785 = c0779Arr9[i35].f2884;
                                        c0779 = c07727;
                                        c2786 = c27818;
                                    }
                                    if (c0779 != null) {
                                        iM2276 += c0779.m2274();
                                    }
                                    int iM2277 = iM2275 + c07924.f3109[i35].m2274();
                                    C0793 c07927 = c07926;
                                    C2785 c27819 = c2786;
                                    int i36 = z17 ? 8 : 4;
                                    if (c27816 == null || c27817 == null || c27819 == null || c2785 == null) {
                                        c0795 = c07927;
                                    } else {
                                        c0795 = c07927;
                                        c1791.m3531(c27816, c27817, iM2277, 0.5f, c27819, c2785, iM2276, i36);
                                    }
                                    c07926 = c0795;
                                }
                                if (c07925.f3125 != 8) {
                                    c07924 = c07925;
                                }
                                c07925 = c07926;
                                c07924 = c07924;
                                i33 = 8;
                            }
                            c1792 = c1791;
                            C0779 c07728 = c07918.f3109[i3];
                            C0779 c07729 = c0779Arr2[i3].f2881;
                            int i37 = i3 + 1;
                            C0779 c07730 = c0793.f3109[i37];
                            C0779 c07731 = c07917.f3109[i37].f2881;
                            if (c07729 != null) {
                                if (c07918 != c0793) {
                                    c1792.m3534(c07728.f2884, c07729.f2884, c07728.m2274(), 5);
                                } else if (c07731 != null) {
                                    c1792.m3531(c07728.f2884, c07729.f2884, c07728.m2274(), 0.5f, c07730.f2884, c07731.f2884, c07730.m2274(), 5);
                                }
                            }
                            if (c07731 != null && c07918 != c0793) {
                                c1792.m3534(c07730.f2884, c07731.f2884, -c07730.m2274(), 5);
                            }
                        }
                        if ((z2 || z3) && c07918 != null && c07918 != c0793) {
                            c0779Arr = c07918.f3109;
                            C0779 c07732 = c0779Arr[i3];
                            i8 = i3 + 1;
                            c07711 = c0793.f3109[i8];
                            c07712 = c07732.f2881;
                            if (c07712 != null) {
                                c2789 = c07712.f2884;
                            } else {
                                c2789 = null;
                            }
                            c07713 = c07711.f2881;
                            if (c07713 != null) {
                                c27810 = c07713.f2884;
                            } else {
                                c27810 = null;
                            }
                            if (c07917 != c0793) {
                                C0779 c07733 = c07917.f3109[i8].f2881;
                                c27810 = c07733 != null ? c07733.f2884 : null;
                            }
                            if (c07918 == c0793) {
                                c07711 = c0779Arr[i8];
                            }
                            if (c2789 == null && c27810 != null) {
                                c1792.m3531(c07732.f2884, c2789, c07732.m2274(), 0.5f, c27810, c07711.f2884, c0793.f3109[i8].m2274(), 5);
                            }
                        }
                    } else {
                        int i38 = c0581.f2363;
                        boolean z18 = i38 > 0 && c0581.f2362 == i38;
                        C0793 c07928 = c07918;
                        C0793 c07929 = c07928;
                        while (c07928 != null) {
                            C0779[] c0779Arr10 = c07928.f3109;
                            C0793 c07930 = c07928.f3131[i];
                            while (true) {
                                if (c07930 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (c07930.f3125 != 8) {
                                    break;
                                } else {
                                    c07930 = c07930.f3131[i];
                                }
                            }
                            if (c07930 != null || c07928 == c0793) {
                                C0779 c07734 = c0779Arr10[i3];
                                C2785 c27820 = c07734.f2884;
                                C0779 c07735 = c07734.f2881;
                                C2785 c27821 = c07735 != null ? c07735.f2884 : null;
                                if (c07929 != c07928) {
                                    c27821 = c07929.f3109[i3 + 1].f2884;
                                } else if (c07928 == c07918 && c07929 == c07928) {
                                    C0779 c07736 = c0779Arr2[i3].f2881;
                                    c27821 = c07736 != null ? c07736.f2884 : null;
                                }
                                int iM2278 = c07734.m2274();
                                int i39 = i3 + 1;
                                int iM2279 = c0779Arr10[i39].m2274();
                                if (c07930 != null) {
                                    c07710 = c07930.f3109[i3];
                                    c2787 = c07710.f2884;
                                    c2788 = c0779Arr10[i39].f2884;
                                } else {
                                    c07710 = c07917.f3109[i39].f2881;
                                    c2787 = c07710 != null ? c07710.f2884 : null;
                                    c2788 = c0779Arr10[i39].f2884;
                                }
                                if (c07710 != null) {
                                    iM2279 += c07710.m2274();
                                }
                                if (c07929 != null) {
                                    iM2278 += c07929.f3109[i39].m2274();
                                }
                                if (c27820 == null || c27821 == null || c2787 == null || c2788 == null) {
                                    c0796 = c07930;
                                    i7 = 8;
                                } else {
                                    if (c07928 == c07918) {
                                        iM2278 = c07918.f3109[i3].m2274();
                                    }
                                    if (c07928 == c0793) {
                                        iM2279 = c0793.f3109[i39].m2274();
                                    }
                                    c0796 = c07930;
                                    i7 = 8;
                                    c1791.m3531(c27820, c27821, iM2278, 0.5f, c2787, c2788, iM2279, z18 ? 8 : 5);
                                }
                            } else {
                                c0796 = c07930;
                                i7 = i6;
                            }
                            if (c07928.f3125 != i7) {
                                c07929 = c07928;
                            }
                            c07928 = c0796;
                            c07929 = c07929;
                            c0779Arr2 = c0779Arr2;
                        }
                    }
                } else {
                    C0779 c07737 = c0779Arr2[i3];
                    int i40 = i3 + 1;
                    C0779 c07738 = c07917.f3109[i40];
                    C0779 c07739 = c07737.f2881;
                    C2785 c27822 = c07739 != null ? c07739.f2884 : null;
                    C0779 c07740 = c07738.f2881;
                    C2785 c27823 = c07740 != null ? c07740.f2884 : null;
                    C0779 c07741 = c07918.f3109[i3];
                    C0779 c07742 = c07919.f3109[i40];
                    if (c27822 == null || c27823 == null) {
                        c0793 = c07919;
                    } else {
                        C2785 c27824 = c27822;
                        c0793 = c07919;
                        c1791.m3531(c07741.f2884, c27824, c07741.m2274(), i == 0 ? c07920.f3122 : c07920.f3123, c27823, c07742.f2884, c07742.m2274(), 7);
                    }
                }
                c1792 = c1791;
                if (z2) {
                    c0779Arr = c07918.f3109;
                    C0779 c077310 = c0779Arr[i3];
                    i8 = i3 + 1;
                    c07711 = c0793.f3109[i8];
                    c07712 = c077310.f2881;
                    if (c07712 != null) {
                        c2789 = c07712.f2884;
                    } else {
                        c2789 = null;
                    }
                    c07713 = c07711.f2881;
                    if (c07713 != null) {
                        c27810 = c07713.f2884;
                    } else {
                        c27810 = null;
                    }
                    if (c07917 != c0793) {
                        C0779 c077311 = c07917.f3109[i8].f2881;
                        c27810 = c077311 != null ? c077311.f2884 : null;
                    }
                    if (c07918 == c0793) {
                        c07711 = c0779Arr[i8];
                    }
                    if (c2789 == null) {
                    }
                } else {
                    c0779Arr = c07918.f3109;
                    C0779 c077312 = c0779Arr[i3];
                    i8 = i3 + 1;
                    c07711 = c0793.f3109[i8];
                    c07712 = c077312.f2881;
                    if (c07712 != null) {
                        c2789 = c07712.f2884;
                    } else {
                        c2789 = null;
                    }
                    c07713 = c07711.f2881;
                    if (c07713 != null) {
                        c27810 = c07713.f2884;
                    } else {
                        c27810 = null;
                    }
                    if (c07917 != c0793) {
                        C0779 c077313 = c07917.f3109[i8].f2881;
                        c27810 = c077313 != null ? c077313.f2884 : null;
                    }
                    if (c07918 == c0793) {
                        c07711 = c0779Arr[i8];
                    }
                    if (c2789 == null) {
                    }
                }
            } else {
                i5 = i12;
            }
            i13 = i4 + 1;
            c0799 = c0794;
            i12 = i5;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C2828 m5065(InterfaceC0974 interfaceC0974) {
        C2828 c2828 = interfaceC0974 instanceof C2828 ? (C2828) interfaceC0974 : null;
        if (c2828 != null) {
            return c2828;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + AbstractC2519.m4527(interfaceC0974.getClass()));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m5066(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2467.f7872, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m5068(context, f10963, "Theme.MaterialComponents");
            }
        }
        m5068(context, f10962, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m5067(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2467.f7872, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m5068(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(AbstractC1194.m2785("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static Drawable m5069(Drawable drawable, Drawable drawable2, int i, int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i == -1 && (i = drawable2.getIntrinsicWidth()) == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == -1 && (i2 = drawable2.getIntrinsicHeight()) == -1) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2141 m5070(Request request) {
        C2141 c2141 = (C2141) request.tag(C2141.class);
        return c2141 == null ? AbstractC2140.f7084 : c2141;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static AbstractC2207 m5071(int i) {
        if (i != 0) {
            return i != 1 ? new C2605() : new C0947();
        }
        return new C2605();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C2327 m5072(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw AbstractC1194.m2777(it);
            }
            return new C2327(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(list, 10));
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw AbstractC1194.m2777(it2);
            }
            return new C2327(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        C2327 c2327M5072 = m5072(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC0746.m2214(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        if (it3.hasNext()) {
            throw AbstractC1194.m2777(it3);
        }
        return new C2327(cls, c2327M5072, arrayList3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static Drawable m5073(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static int[] m5074(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static ColorStateList m5075(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC0081.m1020(drawable)) {
            return null;
        }
        return AbstractC0081.m1002(drawable).getColorStateList();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static Drawable m5076(Context context, int i) {
        return C2577.m4585().m4588(context, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final Type m5077(C3457 c3457) {
        Class clsMo2114 = c3457.f10931.mo2114();
        List list = Collections.EMPTY_LIST;
        if (list.isEmpty()) {
            return clsMo2114;
        }
        if (!clsMo2114.isArray()) {
            return m5072(clsMo2114, list);
        }
        if (clsMo2114.getComponentType().isPrimitive()) {
            return clsMo2114;
        }
        if (AbstractC0744.m2200(list) != null) {
            throw new ClassCastException();
        }
        throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + c3457);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final void m5078(InterfaceC0877 interfaceC0877, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC0880.f3304.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0879) it.next()).mo1193(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC2202.m3992(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC2202.m3992(th, new C1029(interfaceC0877));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final boolean m5079(EnumC3677 enumC3677) {
        C1565.f5440.getClass();
        return C1565.m3278() >= enumC3677.f11548 && !C1565.m3280();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final boolean m5080(EnumC3674 enumC3674) {
        C1565.f5440.getClass();
        return C1565.m3278() >= enumC3674.f11513 && C1565.m3280();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static boolean m5081(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i);
        switch (cCharAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case Opcodes.IALOAD /* 46 */:
            case '/':
                return true;
            default:
                switch (cCharAt) {
                    case Opcodes.ASTORE /* 58 */:
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (cCharAt) {
                            case '[':
                            case Opcodes.DUP2 /* 92 */:
                            case ']':
                            case '^':
                            case Opcodes.SWAP /* 95 */:
                            case Opcodes.IADD /* 96 */:
                                return true;
                            default:
                                switch (cCharAt) {
                                    case Opcodes.LSHR /* 123 */:
                                    case Opcodes.IUSHR /* 124 */:
                                    case Opcodes.LUSHR /* 125 */:
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static TypedArray m5082(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m5066(context, attributeSet, i, i2);
        m5067(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static C0243 m5083(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m5066(context, attributeSet, i, i2);
        m5067(context, attributeSet, iArr, i, i2, iArr2);
        return new C0243(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011b A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x011f A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x014c A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0150 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static InterfaceC1379 m5084(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i;
        int i2;
        ?? r3;
        long j;
        Throwable th;
        ?? r4;
        ExecutorService executorService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m5088(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2463.f7821);
        int i3 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i4 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2463.f7822);
                        int i5 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i6 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i7 = typedArrayObtainAttributes2.getInt(i6, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i8, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i8);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m5088(xmlResourceParser);
                        }
                        arrayList.add(new C1381(string7, i5, z, string6, i7, resourceId2));
                    } else {
                        m5088(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C1380((C1381[]) arrayList.toArray(new C1381[0]));
        }
        List listM5085 = m5085(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i4) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2463.f7823);
                    int i9 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i3);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            r3 = typedArrayObtainAttributes3;
                            j = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                m5088(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r4 = typedArrayObtainAttributes3;
                                j = 1;
                            }
                        }
                        try {
                            r3 = typedArrayObtainAttributes3;
                            i2 = i9;
                            j = 1;
                            try {
                                C1372 c1372 = new C1372(string, string2, string8, listM5085, string9, string10);
                                if (r3 instanceof AutoCloseable) {
                                    ((AutoCloseable) r3).close();
                                } else if (r3 instanceof ExecutorService) {
                                    ExecutorService executorService2 = (ExecutorService) r3;
                                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                                        executorService2.shutdown();
                                        boolean z2 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService2.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r3.recycle();
                                }
                                arrayList2.add(c1372);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r3 = typedArrayObtainAttributes3;
                            j = 1;
                            th = th;
                            r4 = r3;
                            if (r4 != 0) {
                                throw th;
                            }
                            try {
                                if (!(r4 instanceof AutoCloseable)) {
                                    ((AutoCloseable) r4).close();
                                    throw th;
                                }
                                if (r4 instanceof ExecutorService) {
                                    r4.recycle();
                                    throw th;
                                }
                                executorService = (ExecutorService) r4;
                                if (executorService != ForkJoinPool.commonPool()) {
                                    throw th;
                                }
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                        th = th3;
                    } catch (Throwable th6) {
                        th = th6;
                        r3 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r4 = r3;
                    if (r4 != 0) {
                        throw th;
                    }
                    if (!(r4 instanceof AutoCloseable)) {
                        ((AutoCloseable) r4).close();
                        throw th;
                    }
                    if (r4 instanceof ExecutorService) {
                        r4.recycle();
                        throw th;
                    }
                    executorService = (ExecutorService) r4;
                    if (executorService != ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        throw th;
                    }
                    executorService.shutdown();
                    boolean z3 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(j, TimeUnit.DAYS);
                        } catch (InterruptedException unused2) {
                            if (!z3) {
                                executorService.shutdownNow();
                                z3 = true;
                            }
                        }
                    }
                    if (!z3) {
                        throw th;
                    }
                    Thread.currentThread().interrupt();
                    throw th;
                }
                i2 = integer;
                m5088(xmlResourceParser);
                integer = i2;
                string3 = string3;
                string4 = string4;
                i = 2;
                i3 = 0;
                i4 = 3;
            }
        }
        int i10 = integer;
        String str = string3;
        String str2 = string4;
        if (!arrayList2.isEmpty()) {
            return new C1382(arrayList2, i10, integer2, string5);
        }
        if (str == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new C1372(string, string2, str, listM5085, null, null));
        if (str2 != null) {
            arrayList2.add(new C1372(string, string2, str2, listM5085, null, null));
        }
        return new C1382(arrayList2, i10, integer2, string5);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static List m5085(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static void m5086(View view, C1917 c1917) {
        C1136 c1136 = c1917.f6332.f6315;
        if (c1136 == null || !c1136.f4226) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            Field field = AbstractC3578.f11184;
            elevation += ((View) parent).getElevation();
        }
        C1916 c1916 = c1917.f6332;
        if (c1916.f6325 != elevation) {
            c1916.f6325 = elevation;
            c1917.m3721();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static int m5087(char c, int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static void m5088(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static int m5089(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static C0243 m5090(int i, InterfaceC1261 interfaceC1261) {
        return new C0243(new C2380(i), interfaceC1261, f10961);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static AbstractC0909 m5091(C3448 c3448) {
        switch (c3448.f10905) {
            case 1:
                return C0892.f3332;
            case 2:
                return C0893.f3334;
            case 3:
                return C0896.f3337;
            case 4:
                return C0897.f3338;
            case 5:
                return C0900.f3341;
            case 6:
                return C0903.f3350;
            case 7:
                return C0910.f3366;
            case 8:
                return C0916.f3377;
            case 9:
                return C0906.f3363;
            default:
                throw new UnsupportedOperationException("no zero for type: " + c3448.mo1214());
        }
    }
}
