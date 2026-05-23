package p000;

import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤝᲁᲀᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0662 implements InterfaceC0541 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final InterpolatorC1680 f2526 = new InterpolatorC1680(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final InterpolatorC1680 f2527 = new InterpolatorC1680(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2528;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f2529;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f2530;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f2531;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f2532;

    public C0662(C1227 c1227) {
        this.f2528 = 3;
        this.f2530 = c1227;
        this.f2531 = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f2532 = iArr;
        this.f2529 = -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static void m2043(AbstractC2508 abstractC2508) {
        View view = abstractC2508.f8006;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            Field field = AbstractC3578.f11184;
            view.setElevation(fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static int m2044(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static int m2045(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static C2525 m2046(C2525 c2525) {
        return (c2525 == null || c2525.f8056.getType() != C3448.f10875) ? c2525 : c2525.m4545(C3448.f10882);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static void m2047(RecyclerView recyclerView, AbstractC2508 abstractC2508, float f, float f2, boolean z) {
        View view = abstractC2508.f8006;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Field field = AbstractC3578.f11184;
            Float fValueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    Field field2 = AbstractC3578.f11184;
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public String toString() {
        switch (this.f2528) {
            case 3:
                return m2054();
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo1577(int i, int i2, C0918 c0918, ArrayList arrayList) {
        C2597 c2597 = (C2597) this.f2530;
        c2597.m5119((C0243) this.f2531, C3448.f10871);
        c2597.f11051 = arrayList;
        if (c0918 == null) {
            throw new NullPointerException("cst == null");
        }
        c2597.f11048 = c0918;
        c2597.m4619((C0243) this.f2531, i, Opcodes.NEWARRAY);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public void mo1578(int i, int i2, int i3, int i4, C3448 c3448, int i5) {
        C3448 c3448M4961;
        C2597 c2597 = (C2597) this.f2530;
        C1832 c1832M3586 = ((C1833) ((C1676) this.f2532).f5659).m3586(i == 54 ? i3 + i2 : i2, i4);
        C1826 c1826 = null;
        if (c1832M3586 != null) {
            c3448M4961 = C3448.m4961(c1832M3586.f6122.f3378);
            if (c3448M4961.mo4536() != c3448.mo4536()) {
                c3448M4961 = c3448;
                c1832M3586 = null;
            }
        } else {
            c3448M4961 = c3448;
        }
        if (i == 21) {
            C0243 c0243 = (C0243) this.f2531;
            c2597.m5115();
            c2597.f11044[0] = ((AbstractC1834) c0243.f1404).mo3589(i4);
            c2597.f11045 = 1;
            c2597.f11052 = i4;
            c2597.f11053 = c1832M3586 != null;
            c2597.f11046 = c3448;
        } else if (i == 54) {
            if (c1832M3586 != null) {
                C0917 c0917 = c1832M3586.f6121;
                C0917 c0918 = c1832M3586.f6123;
                if (c0917 != null || c0918 != null) {
                    c1826 = new C1826(c0917, c0918);
                }
            }
            c2597.m5119((C0243) this.f2531, c3448);
            c2597.f11046 = c3448;
            c2597.f11054 = C2525.m4532(i4, c3448M4961, c1826);
        } else if (i != 132) {
            if (i != 169) {
                mo1585(i, i2);
                throw null;
            }
            C0243 c0244 = (C0243) this.f2531;
            c2597.m5115();
            c2597.f11044[0] = ((AbstractC1834) c0244.f1404).mo3589(i4);
            c2597.f11045 = 1;
            c2597.f11052 = i4;
            c2597.f11053 = c1832M3586 != null;
            c2597.f11046 = c3448;
        } else {
            if (c1832M3586 != null) {
                C0917 c0919 = c1832M3586.f6121;
                C0917 c09110 = c1832M3586.f6123;
                if (c0919 != null || c09110 != null) {
                    c1826 = new C1826(c0919, c09110);
                }
            }
            C0243 c0245 = (C0243) this.f2531;
            c2597.m5115();
            c2597.f11044[0] = ((AbstractC1834) c0245.f1404).mo3589(i4);
            c2597.f11045 = 1;
            c2597.f11052 = i4;
            c2597.f11054 = C2525.m4532(i4, c3448M4961, c1826);
            c2597.f11046 = c3448;
            c2597.f11047 = i5;
            c2597.f11048 = C0903.m2420(i5);
        }
        c2597.m4619((C0243) this.f2531, i2, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m2048(int i, int i2) {
        int[] iArr = (int[]) this.f2532;
        boolean z = iArr == null;
        if (i != 0 || z) {
            if (i < 0) {
                throw new RuntimeException("shouldn't happen");
            }
            if (z || i2 >= iArr.length) {
                int i3 = i2 + 1;
                C2527 c2527 = new C2527(i3);
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, -1);
                if (!z) {
                    C2527 c2528 = (C2527) this.f2531;
                    int length = c2528.f8059.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        C2525 c2525M4551 = c2528.m4551(i4);
                        if (c2525M4551 != null) {
                            c2527.m4552(c2525M4551);
                        }
                    }
                    int[] iArr3 = (int[]) this.f2532;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                }
                this.f2531 = c2527;
                this.f2532 = iArr2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0130  */
    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public void mo1580(int i, int i2, int i3, AbstractC0777 abstractC0777, int i4) {
        AbstractC0777 abstractC0778;
        C0913 c0913M2422;
        boolean zM2002 = C0580.m2002(26);
        C1676 c1676 = (C1676) this.f2532;
        C2597 c2597 = (C2597) this.f2530;
        if (i == 18 || i == 19) {
            if (((abstractC0777 instanceof C0912) || (abstractC0777 instanceof C0915)) && !C0580.m2002(28)) {
                c1676.m3405(String.format("invalid constant type %s requires --min-sdk-version >= %d (currently %d)", abstractC0777.mo2269(), 28, 13));
                throw null;
            }
            c2597.m5115();
            abstractC0778 = abstractC0777;
        } else if (i != 189) {
            if (i == 197) {
                C3448 c3448 = C3448.f10874;
                ConcurrentHashMap concurrentHashMap = C2440.f7753;
                StringBuilder sb = new StringBuilder(100);
                sb.append('(');
                for (int i5 = 0; i5 < i4; i5++) {
                    sb.append('I');
                }
                sb.append(')');
                sb.append(c3448.f10904);
                c2597.m5118((C0243) this.f2531, C2440.m4420(sb.toString()));
                abstractC0778 = abstractC0777;
            } else if (i != 192 && i != 193) {
                switch (i) {
                    case Opcodes.PUTSTATIC /* 179 */:
                        c2597.m5119((C0243) this.f2531, ((C0899) abstractC0777).f3369.m2428());
                        abstractC0778 = abstractC0777;
                        break;
                    case Opcodes.GETFIELD /* 180 */:
                        c2597.m5119((C0243) this.f2531, C3448.f10882);
                        abstractC0778 = abstractC0777;
                        break;
                    case Opcodes.PUTFIELD /* 181 */:
                        c2597.m5120((C0243) this.f2531, C3448.f10882, ((C0899) abstractC0777).f3369.m2428());
                        abstractC0778 = abstractC0777;
                        break;
                    case Opcodes.INVOKEVIRTUAL /* 182 */:
                    case Opcodes.INVOKESPECIAL /* 183 */:
                    case Opcodes.INVOKESTATIC /* 184 */:
                    case Opcodes.INVOKEINTERFACE /* 185 */:
                        boolean z = abstractC0777 instanceof C0904;
                        AbstractC0777 abstractC0779 = abstractC0777;
                        if (z) {
                            c0913M2422 = ((C0904) abstractC0777).m2422();
                            if (i != 185 && !C0580.m2002(24)) {
                                c1676.m3405(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)", i == 184 ? "static" : "default", c0913M2422.f3368.f3401.mo1214(), c0913M2422.f3369.mo1214(), 24, 13));
                                throw null;
                            }
                        }
                        abstractC0779 = c0913M2422;
                        abstractC0779 = c0913M2422;
                        abstractC0779 = c0913M2422;
                        if ((abstractC0779 instanceof C0913) && ((C0913) abstractC0779).m2410()) {
                            if (!zM2002) {
                                c1676.m3405(String.format("invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)", 26, 13));
                                throw null;
                            }
                            if (i != 182) {
                                c1676.m3405("Unsupported signature polymorphic invocation (" + AbstractC0537.m1867(i) + ")");
                                throw null;
                            }
                        }
                        i5 = i == 184 ? 1 : 0;
                        C0913 c0913 = (C0913) abstractC0779;
                        C2440 c2440 = c0913.f3330;
                        if (i5 == 0) {
                            if (c0913.f3331 == null) {
                                c0913.f3331 = c2440.m4423(c0913.f3368.f3401);
                            }
                            c2440 = c0913.f3331;
                        }
                        c2597.m5118((C0243) this.f2531, c2440);
                        abstractC0778 = abstractC0779;
                        break;
                    case 186:
                        if (!zM2002) {
                            c1676.m3405(String.format("invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)", Integer.valueOf(i), 26, 13));
                            throw null;
                        }
                        C0905 c0905 = (C0905) abstractC0777;
                        c2597.m5118((C0243) this.f2531, c0905.f3359);
                        ArrayList arrayList = c0905.f3362;
                        C0895 c0895 = new C0895(c0905, arrayList.size());
                        arrayList.add(c0895);
                        abstractC0778 = c0895;
                        break;
                        break;
                    default:
                        c2597.m5115();
                        abstractC0778 = abstractC0777;
                        break;
                }
            } else {
                c2597.m5119((C0243) this.f2531, C3448.f10882);
                abstractC0778 = abstractC0777;
            }
        } else {
            c2597.m5119((C0243) this.f2531, C3448.f10871);
            abstractC0778 = abstractC0777;
        }
        c2597.f11047 = i4;
        if (abstractC0778 == null) {
            throw new NullPointerException("cst == null");
        }
        c2597.f11048 = abstractC0778;
        c2597.m4619((C0243) this.f2531, i2, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public void m2049(int i, int i2, C2525 c2525) {
        int i3 = c2525.f8055;
        ArrayList arrayList = (ArrayList) this.f2530;
        arrayList.add(new C1827(i, i2, c2525));
        if (i2 == 1) {
            ((C2527) this.f2531).m4552(c2525);
            ((int[]) this.f2532)[i3] = -1;
        } else {
            ((C2527) this.f2531).m4553(c2525);
            ((int[]) this.f2532)[i3] = arrayList.size() - 1;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public void m2050(int i, int i2, C2525 c2525) {
        ArrayList arrayList = (ArrayList) this.f2530;
        if (i2 == 1) {
            throw new RuntimeException("shouldn't happen");
        }
        int i3 = ((int[]) this.f2532)[c2525.f8055];
        if (i3 >= 0) {
            C1827 c1827 = (C1827) arrayList.get(i3);
            int i4 = c1827.f6110;
            C2525 c2526 = c1827.f6112;
            if (i4 == i && c2526.equals(c2525)) {
                if (i2 != c1827.f6111) {
                    c1827 = new C1827(c1827.f6110, i2, c2526);
                }
                arrayList.set(i3, c1827);
                ((C2527) this.f2531).m4553(c2525);
                return;
            }
        }
        int i5 = c2525.f8055;
        C2525 c2525M2046 = m2046(c2525);
        m2048(i, i5);
        if (((int[]) this.f2532)[i5] >= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f2530;
        boolean z = true;
        int size = arrayList2.size() - 1;
        while (size >= 0) {
            C1827 c1828 = (C1827) arrayList2.get(size);
            if (c1828 != null) {
                if (c1828.f6110 != i) {
                    m2049(i, i2, c2525M2046);
                    return;
                } else if (c1828.f6112.m4539(c2525M2046)) {
                    break;
                }
            }
            size--;
        }
        ((C2527) this.f2531).m4553(c2525M2046);
        C1827 c1829 = null;
        arrayList2.set(size, null);
        this.f2529++;
        int i6 = c2525M2046.f8055;
        while (true) {
            size--;
            if (size < 0) {
                z = false;
                break;
            }
            c1829 = (C1827) arrayList2.get(size);
            if (c1829 != null && c1829.f6112.f8055 == i6) {
                break;
            }
        }
        if (z) {
            ((int[]) this.f2532)[i6] = size;
            int i7 = c1829.f6110;
            if (i7 == i) {
                if (2 != c1829.f6111) {
                    c1829 = new C1827(i7, 2, c1829.f6112);
                }
                arrayList2.set(size, c1829);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public void m2051(C3448 c3448) {
        C3448 c3449 = ((C2597) this.f2530).f11043.f7755;
        if (AbstractC1270.m2984(c3449, c3448)) {
            return;
        }
        ((C1676) this.f2532).m3405("return type mismatch: prototype indicates " + c3449.mo1214() + ", but encountered type " + c3448.mo1214());
        throw null;
    }

    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public void mo1585(int i, int i2) {
        throw new C2704("invalid opcode ".concat(AbstractC1460.m3222(i)), null);
    }

    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public void mo1586(int i, int i2, C1242 c1242, int i3) {
        C2597 c2597 = (C2597) this.f2530;
        c2597.m5119((C0243) this.f2531, C3448.f10871);
        c2597.f11047 = i3;
        c2597.f11050 = c1242;
        c2597.m4619((C0243) this.f2531, i, Opcodes.LOOKUPSWITCH);
    }

    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public int mo1587() {
        return this.f2529;
    }

    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public void mo1590(int i, int i2, int i3, int i4) {
        C2597 c2597 = (C2597) this.f2530;
        switch (i) {
            case Opcodes.IFEQ /* 153 */:
            case Opcodes.IFNE /* 154 */:
            case Opcodes.IFLT /* 155 */:
            case Opcodes.IFGE /* 156 */:
            case Opcodes.IFGT /* 157 */:
            case Opcodes.IFLE /* 158 */:
                c2597.m5119((C0243) this.f2531, C3448.f10871);
                c2597.f11049 = i4;
                c2597.m4619((C0243) this.f2531, i2, i);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
            case Opcodes.IF_ICMPNE /* 160 */:
            case Opcodes.IF_ICMPLT /* 161 */:
            case Opcodes.IF_ICMPGE /* 162 */:
            case Opcodes.IF_ICMPGT /* 163 */:
            case Opcodes.IF_ICMPLE /* 164 */:
                C0243 c0243 = (C0243) this.f2531;
                C3448 c3448 = C3448.f10871;
                c2597.m5120(c0243, c3448, c3448);
                c2597.f11049 = i4;
                c2597.m4619((C0243) this.f2531, i2, i);
                return;
            case Opcodes.IF_ACMPEQ /* 165 */:
            case Opcodes.IF_ACMPNE /* 166 */:
                C0243 c0244 = (C0243) this.f2531;
                C3448 c3449 = C3448.f10882;
                c2597.m5120(c0244, c3449, c3449);
                c2597.f11049 = i4;
                c2597.m4619((C0243) this.f2531, i2, i);
                return;
            default:
                switch (i) {
                    case Opcodes.IFNULL /* 198 */:
                    case Opcodes.IFNONNULL /* 199 */:
                        c2597.m5119((C0243) this.f2531, C3448.f10882);
                        break;
                    case 200:
                    case 201:
                        break;
                    default:
                        mo1585(i, i2);
                        throw null;
                }
                c2597.f11049 = i4;
                c2597.m4619((C0243) this.f2531, i2, i);
                return;
            case Opcodes.GOTO /* 167 */:
            case Opcodes.JSR /* 168 */:
                c2597.m5115();
                c2597.f11049 = i4;
                c2597.m4619((C0243) this.f2531, i2, i);
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:117:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:159:0x03fc  */
    @Override // p000.InterfaceC0541
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public void mo1591(int i, int i2, C3448 c3448) {
        C2597 c2597 = (C2597) this.f2530;
        if (i == 0) {
            c2597.m5115();
        } else if (i == 190) {
            C3448 c3448M2899 = ((C1242) ((C0243) this.f2531).f1405).m2899(0);
            if (!c3448M2899.m4970() && !c3448M2899.equals(C3448.f10875)) {
                ((C1676) this.f2532).m3405("type mismatch: expected array type but encountered " + c3448M2899.mo1214());
                throw null;
            }
            c2597.m5119((C0243) this.f2531, C3448.f10882);
        } else if (i != 191 && i != 194 && i != 195) {
            switch (i) {
                case 0:
                    c2597.m5115();
                    break;
                case Opcodes.IALOAD /* 46 */:
                    C3448 c3448M3404 = C1676.m3404(c3448, ((C1242) ((C0243) this.f2531).f1405).m2899(1));
                    C3448 c3448M4968 = C3448.f10875;
                    if (c3448M3404 != c3448M4968) {
                        c3448M4968 = c3448M3404.m4968();
                    }
                    c2597.m5120((C0243) this.f2531, c3448M3404, C3448.f10871);
                    c3448 = c3448M4968;
                    break;
                case Opcodes.IASTORE /* 79 */:
                    C1242 c1242 = (C1242) ((C0243) this.f2531).f1405;
                    int i3 = c3448.m4971() ? 2 : 3;
                    C3448 c3448M28910 = c1242.m2899(i3);
                    int i4 = c1242.f4507;
                    if (i3 >= i4) {
                        throw new C2704("stack: underflow", null);
                    }
                    boolean z = ((boolean[]) c1242.f4509)[(i4 - i3) - 1];
                    C3448 c3448M3405 = C1676.m3404(c3448, c3448M28910);
                    if (z && c3448M3405 != (c3448 = C3448.f10875)) {
                        c3448 = c3448M3405.m4968();
                    }
                    C0243 c0243 = (C0243) this.f2531;
                    C3448 c3449 = C3448.f10871;
                    c2597.m5117(c0243, 3);
                    if (!AbstractC1270.m2984(c3448M3405, c2597.f11044[0])) {
                        throw new C2704("expected type " + c3448M3405.mo1214() + " but found " + c2597.f11044[0].getType().mo1214(), null);
                    }
                    if (!AbstractC1270.m2984(c3449, c2597.f11044[1])) {
                        throw new C2704("expected type " + c3449.mo1214() + " but found " + c2597.f11044[1].getType().mo1214(), null);
                    }
                    if (!AbstractC1270.m2984(c3448, c2597.f11044[2])) {
                        throw new C2704("expected type " + c3448.mo1214() + " but found " + c2597.f11044[2].getType().mo1214(), null);
                    }
                    break;
                case 100:
                case 104:
                case Opcodes.IDIV /* 108 */:
                case 112:
                case 126:
                case 128:
                case Opcodes.IXOR /* 130 */:
                    c2597.m5120((C0243) this.f2531, c3448, c3448);
                    break;
                case Opcodes.INEG /* 116 */:
                    c2597.m5119((C0243) this.f2531, c3448);
                    break;
                case 120:
                case 122:
                case Opcodes.IUSHR /* 124 */:
                    c2597.m5120((C0243) this.f2531, c3448, C3448.f10871);
                    break;
                case Opcodes.IRETURN /* 172 */:
                    C3448 c3448M28911 = c3448 == C3448.f10882 ? ((C1242) ((C0243) this.f2531).f1405).m2899(0) : c3448;
                    c2597.m5119((C0243) this.f2531, c3448);
                    m2051(c3448M28911);
                    break;
                case Opcodes.RETURN /* 177 */:
                    c2597.m5115();
                    m2051(C3448.f10874);
                    break;
                default:
                    int i5 = 17;
                    switch (i) {
                        case Opcodes.POP /* 87 */:
                            if (((C1242) ((C0243) this.f2531).f1405).m2899(0).m4972()) {
                                throw C1676.m3403();
                            }
                            c2597.m5117((C0243) this.f2531, 1);
                            break;
                        case Opcodes.POP2 /* 88 */:
                        case Opcodes.DUP2 /* 92 */:
                            C1242 c1243 = (C1242) ((C0243) this.f2531).f1405;
                            if (c1243.m2899(0).m4972()) {
                                c2597.m5117((C0243) this.f2531, 1);
                            } else {
                                if (!c1243.m2899(1).m4971()) {
                                    throw C1676.m3403();
                                }
                                c2597.m5117((C0243) this.f2531, 2);
                                i5 = 8481;
                            }
                            if (i == 92) {
                                c2597.f11047 = i5;
                            }
                            break;
                        case Opcodes.DUP /* 89 */:
                            if (((C1242) ((C0243) this.f2531).f1405).m2899(0).m4972()) {
                                throw C1676.m3403();
                            }
                            c2597.m5117((C0243) this.f2531, 1);
                            c2597.f11047 = 17;
                            break;
                        case 90:
                            C1242 c1244 = (C1242) ((C0243) this.f2531).f1405;
                            if (!c1244.m2899(0).m4971() || !c1244.m2899(1).m4971()) {
                                throw C1676.m3403();
                            }
                            c2597.m5117((C0243) this.f2531, 2);
                            c2597.f11047 = 530;
                            break;
                            break;
                        case 91:
                            C1242 c1245 = (C1242) ((C0243) this.f2531).f1405;
                            if (c1245.m2899(0).m4972()) {
                                throw C1676.m3403();
                            }
                            if (c1245.m2899(1).m4972()) {
                                c2597.m5117((C0243) this.f2531, 2);
                                c2597.f11047 = 530;
                            } else {
                                if (!c1245.m2899(2).m4971()) {
                                    throw C1676.m3403();
                                }
                                c2597.m5117((C0243) this.f2531, 3);
                                c2597.f11047 = 12819;
                            }
                            break;
                            break;
                        case 93:
                            C1242 c1246 = (C1242) ((C0243) this.f2531).f1405;
                            if (!c1246.m2899(0).m4972()) {
                                if (c1246.m2899(1).m4972() || c1246.m2899(2).m4972()) {
                                    throw C1676.m3403();
                                }
                                c2597.m5117((C0243) this.f2531, 3);
                                c2597.f11047 = 205106;
                            } else {
                                if (c1246.m2899(2).m4972()) {
                                    throw C1676.m3403();
                                }
                                c2597.m5117((C0243) this.f2531, 2);
                                c2597.f11047 = 530;
                            }
                            break;
                        case 94:
                            C1242 c1247 = (C1242) ((C0243) this.f2531).f1405;
                            if (!c1247.m2899(0).m4972()) {
                                if (!c1247.m2899(1).m4971()) {
                                    throw C1676.m3403();
                                }
                                if (c1247.m2899(2).m4972()) {
                                    c2597.m5117((C0243) this.f2531, 3);
                                    c2597.f11047 = 205106;
                                } else {
                                    if (!c1247.m2899(3).m4971()) {
                                        throw C1676.m3403();
                                    }
                                    c2597.m5117((C0243) this.f2531, 4);
                                    c2597.f11047 = 4399427;
                                }
                            } else if (c1247.m2899(2).m4972()) {
                                c2597.m5117((C0243) this.f2531, 2);
                                c2597.f11047 = 530;
                            } else {
                                if (!c1247.m2899(3).m4971()) {
                                    throw C1676.m3403();
                                }
                                c2597.m5117((C0243) this.f2531, 3);
                                c2597.f11047 = 12819;
                            }
                            break;
                        case Opcodes.SWAP /* 95 */:
                            C1242 c1248 = (C1242) ((C0243) this.f2531).f1405;
                            if (!c1248.m2899(0).m4971() || !c1248.m2899(1).m4971()) {
                                throw C1676.m3403();
                            }
                            c2597.m5117((C0243) this.f2531, 2);
                            c2597.f11047 = 18;
                            break;
                            break;
                        case Opcodes.IADD /* 96 */:
                            c2597.m5120((C0243) this.f2531, c3448, c3448);
                            break;
                        default:
                            switch (i) {
                                case Opcodes.I2L /* 133 */:
                                case Opcodes.I2F /* 134 */:
                                case Opcodes.I2D /* 135 */:
                                case Opcodes.I2B /* 145 */:
                                case Opcodes.I2C /* 146 */:
                                case Opcodes.I2S /* 147 */:
                                    c2597.m5119((C0243) this.f2531, C3448.f10871);
                                    break;
                                case Opcodes.L2I /* 136 */:
                                case 137:
                                case 138:
                                    c2597.m5119((C0243) this.f2531, C3448.f10872);
                                    break;
                                case Opcodes.F2I /* 139 */:
                                case Opcodes.F2L /* 140 */:
                                case 141:
                                    c2597.m5119((C0243) this.f2531, C3448.f10870);
                                    break;
                                case Opcodes.D2I /* 142 */:
                                case Opcodes.D2L /* 143 */:
                                case 144:
                                    c2597.m5119((C0243) this.f2531, C3448.f10869);
                                    break;
                                case Opcodes.LCMP /* 148 */:
                                    C0243 c0244 = (C0243) this.f2531;
                                    C3448 c34410 = C3448.f10872;
                                    c2597.m5120(c0244, c34410, c34410);
                                    break;
                                case Opcodes.FCMPL /* 149 */:
                                case Opcodes.FCMPG /* 150 */:
                                    C0243 c0245 = (C0243) this.f2531;
                                    C3448 c34411 = C3448.f10870;
                                    c2597.m5120(c0245, c34411, c34411);
                                    break;
                                case Opcodes.DCMPL /* 151 */:
                                case Opcodes.DCMPG /* 152 */:
                                    C0243 c0246 = (C0243) this.f2531;
                                    C3448 c34412 = C3448.f10869;
                                    c2597.m5120(c0246, c34412, c34412);
                                    break;
                                default:
                                    mo1585(i, i2);
                                    throw null;
                            }
                            break;
                    }
                    break;
            }
        } else {
            c2597.m5119((C0243) this.f2531, C3448.f10882);
        }
        c2597.f11046 = c3448;
        c2597.m4619((C0243) this.f2531, i2, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public void m2052(View view) {
        MaxRelativeLayout maxRelativeLayout;
        C0943 c0943 = (C0943) this.f2532;
        if (view != null) {
            view.setEnabled(false);
        }
        if (c0943.f923 || (maxRelativeLayout = (MaxRelativeLayout) this.f2531) == null) {
            return;
        }
        c0943.f923 = true;
        maxRelativeLayout.post(new RunnableC0939(this, 1));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public long m2053(Animation animation) {
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) this.f2531;
        if (animation == null && maxRelativeLayout.getAnimation() != null) {
            animation = maxRelativeLayout.getAnimation();
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = ((C0943) this.f2532).f920;
        return j != -1 ? j : duration;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public String m2054() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f2529 + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f2531)[i2];
            if (obj instanceof InterfaceC2654) {
                InterfaceC2654 interfaceC2654 = (InterfaceC2654) obj;
                if (!AbstractC2207.m4087(interfaceC2654.mo3472(), C2851.f9112)) {
                    int i3 = ((int[]) this.f2532)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC2654.mo3474(i3));
                    }
                } else if (((int[]) this.f2532)[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f2532)[i2]);
                    sb.append("]");
                }
            } else if (obj == C1133.f4208) {
                sb.append("[<debug info disabled>]");
            } else if (obj != C1133.f4209) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int m2055(RecyclerView recyclerView, int i, int i2, long j) {
        if (this.f2529 == -1) {
            this.f2529 = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (f2526.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (f2527.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.f2529)));
        if (interpolation == 0) {
            return i2 > 0 ? 1 : -1;
        }
        return interpolation;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x0201  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public AbstractC0777 m2056(BitSet bitSet, int i) {
        AbstractC0777 c0910;
        AbstractC0777 abstractC0777M2420;
        AbstractC0777 abstractC0777M2056;
        int i2;
        boolean z;
        int i3;
        AbstractC0777 abstractC0777;
        C0516 c0516 = (C0516) this.f2530;
        C2815 c2815 = (C2815) this.f2531;
        c2815.getClass();
        AbstractC0777[] abstractC0777Arr = c2815.f9024;
        try {
            AbstractC0777 abstractC0778 = abstractC0777Arr[i];
            if (abstractC0778 != null) {
                return abstractC0778;
            }
            int i4 = ((int[]) this.f2532)[i];
            try {
                int iM1815 = c0516.m1815(i4);
                switch (iM1815) {
                    case 1:
                        C0917 c0917M2058 = m2058(i4);
                        bitSet.set(i);
                        abstractC0777M2420 = c0917M2058;
                        c2815.m3925();
                        if (abstractC0777M2420 == null && abstractC0777M2420.mo2268()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0777Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0777Arr[i + 1] = null;
                        }
                        if (abstractC0777M2420 != null && abstractC0777Arr[i] == null && (abstractC0777 = abstractC0777Arr[(i3 = i - 1)]) != null && abstractC0777.mo2268()) {
                            abstractC0777Arr[i3] = null;
                        }
                        abstractC0777Arr[i] = abstractC0777M2420;
                        return abstractC0777M2420;
                    case 2:
                    case 13:
                    case Opcodes.DCONST_0 /* 14 */:
                    case Opcodes.SIPUSH /* 17 */:
                    default:
                        throw new C2331("unknown tag byte: ".concat(AbstractC1460.m3222(iM1815)), null);
                    case 3:
                        abstractC0777M2420 = C0903.m2420(c0516.m1812(i4 + 1));
                        c2815.m3925();
                        if (abstractC0777M2420 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0777Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0777Arr[i + 1] = null;
                        }
                        if (abstractC0777M2420 != null) {
                            abstractC0777Arr[i3] = null;
                        }
                        abstractC0777Arr[i] = abstractC0777M2420;
                        return abstractC0777M2420;
                    case 4:
                        abstractC0777M2420 = new C0900(c0516.m1812(i4 + 1));
                        c2815.m3925();
                        if (abstractC0777M2420 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0777Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0777Arr[i + 1] = null;
                        }
                        if (abstractC0777M2420 != null) {
                            abstractC0777Arr[i3] = null;
                        }
                        abstractC0777Arr[i] = abstractC0777M2420;
                        return abstractC0777M2420;
                    case 5:
                        c0910 = new C0910(c0516.m1813(i4 + 1));
                        abstractC0777M2420 = c0910;
                        c2815.m3925();
                        if (abstractC0777M2420 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0777Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0777Arr[i + 1] = null;
                        }
                        if (abstractC0777M2420 != null) {
                            abstractC0777Arr[i3] = null;
                        }
                        abstractC0777Arr[i] = abstractC0777M2420;
                        return abstractC0777M2420;
                    case 6:
                        c0910 = new C0897(c0516.m1813(i4 + 1));
                        abstractC0777M2420 = c0910;
                        c2815.m3925();
                        if (abstractC0777M2420 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0777Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0777Arr[i + 1] = null;
                        }
                        if (abstractC0777M2420 != null) {
                            abstractC0777Arr[i3] = null;
                        }
                        abstractC0777Arr[i] = abstractC0777M2420;
                        return abstractC0777M2420;
                    case 7:
                        abstractC0777M2420 = new C0918(C3448.m4962(((C0917) m2056(bitSet, c0516.m1817(i4 + 1))).f3378));
                        c2815.m3925();
                        if (abstractC0777M2420 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0777Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0777Arr[i + 1] = null;
                        }
                        if (abstractC0777M2420 != null) {
                            abstractC0777Arr[i3] = null;
                        }
                        abstractC0777Arr[i] = abstractC0777M2420;
                        return abstractC0777M2420;
                    case 8:
                        abstractC0777M2420 = m2056(bitSet, c0516.m1817(i4 + 1));
                        c2815.m3925();
                        if (abstractC0777M2420 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0777Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0777Arr[i + 1] = null;
                        }
                        if (abstractC0777M2420 != null) {
                            abstractC0777Arr[i3] = null;
                        }
                        abstractC0777Arr[i] = abstractC0777M2420;
                        return abstractC0777M2420;
                    case 9:
                        abstractC0777M2420 = new C0899((C0918) m2056(bitSet, c0516.m1817(i4 + 1)), (C0914) m2056(bitSet, c0516.m1817(i4 + 3)));
                        c2815.m3925();
                        if (abstractC0777M2420 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0777Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0777Arr[i + 1] = null;
                        }
                        if (abstractC0777M2420 != null) {
                            abstractC0777Arr[i3] = null;
                        }
                        abstractC0777Arr[i] = abstractC0777M2420;
                        return abstractC0777M2420;
                    case 10:
                        abstractC0777M2420 = new C0913((C0918) m2056(bitSet, c0516.m1817(i4 + 1)), (C0914) m2056(bitSet, c0516.m1817(i4 + 3)));
                        c2815.m3925();
                        if (abstractC0777M2420 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0777Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0777Arr[i + 1] = null;
                        }
                        if (abstractC0777M2420 != null) {
                            abstractC0777Arr[i3] = null;
                        }
                        abstractC0777Arr[i] = abstractC0777M2420;
                        return abstractC0777M2420;
                    case 11:
                        C0904 c0904 = new C0904((C0918) m2056(bitSet, c0516.m1817(i4 + 1)), (C0914) m2056(bitSet, c0516.m1817(i4 + 3)));
                        c0904.f3356 = null;
                        abstractC0777M2420 = c0904;
                        c2815.m3925();
                        if (abstractC0777M2420 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0777Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0777Arr[i + 1] = null;
                        }
                        if (abstractC0777M2420 != null) {
                            abstractC0777Arr[i3] = null;
                        }
                        abstractC0777Arr[i] = abstractC0777M2420;
                        return abstractC0777M2420;
                    case Opcodes.FCONST_1 /* 12 */:
                        abstractC0777M2420 = new C0914((C0917) m2056(bitSet, c0516.m1817(i4 + 1)), (C0917) m2056(bitSet, c0516.m1817(i4 + 3)));
                        c2815.m3925();
                        if (abstractC0777M2420 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0777Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0777Arr[i + 1] = null;
                        }
                        if (abstractC0777M2420 != null) {
                            abstractC0777Arr[i3] = null;
                        }
                        abstractC0777Arr[i] = abstractC0777M2420;
                        return abstractC0777M2420;
                    case 15:
                        int iM1816 = c0516.m1815(i4 + 1);
                        int iM1817 = c0516.m1817(i4 + 2);
                        switch (iM1816) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                abstractC0777M2056 = (C0899) m2056(bitSet, iM1817);
                                break;
                            case 5:
                            case 8:
                                abstractC0777M2056 = (C0913) m2056(bitSet, iM1817);
                                break;
                            case 6:
                            case 7:
                                abstractC0777M2056 = m2056(bitSet, iM1817);
                                if (!(abstractC0777M2056 instanceof C0913) && !(abstractC0777M2056 instanceof C0904)) {
                                    throw new C2331("Unsupported ref constant type for MethodHandle " + abstractC0777M2056.getClass(), null);
                                }
                                break;
                            case 9:
                                abstractC0777M2056 = (C0904) m2056(bitSet, iM1817);
                                break;
                            default:
                                throw new C2331("Unsupported MethodHandle kind: " + iM1816, null);
                        }
                        switch (iM1816) {
                            case 1:
                                i2 = 3;
                                break;
                            case 2:
                                i2 = 1;
                                break;
                            case 3:
                                i2 = 2;
                                break;
                            case 4:
                                i2 = 0;
                                break;
                            case 5:
                                i2 = 5;
                                break;
                            case 6:
                                i2 = 4;
                                break;
                            case 7:
                                i2 = 7;
                                break;
                            case 8:
                                i2 = 6;
                                break;
                            case 9:
                                i2 = 8;
                                break;
                            default:
                                throw new IllegalArgumentException(AbstractC1194.m2779(iM1816, "invalid kind: "));
                        }
                        abstractC0777M2420 = C0912.m2427(i2, abstractC0777M2056);
                        c2815.m3925();
                        if (abstractC0777M2420 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0777Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0777Arr[i + 1] = null;
                        }
                        if (abstractC0777M2420 != null) {
                            abstractC0777Arr[i3] = null;
                        }
                        abstractC0777Arr[i] = abstractC0777M2420;
                        return abstractC0777M2420;
                    case 16:
                        abstractC0777M2420 = new C0915(C2440.m4419(((C0917) m2056(bitSet, c0516.m1817(i4 + 1))).f3378));
                        c2815.m3925();
                        if (abstractC0777M2420 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0777Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0777Arr[i + 1] = null;
                        }
                        if (abstractC0777M2420 != null) {
                            abstractC0777Arr[i3] = null;
                        }
                        abstractC0777Arr[i] = abstractC0777M2420;
                        return abstractC0777M2420;
                    case Opcodes.LDC /* 18 */:
                        abstractC0777M2420 = new C0905(c0516.m1817(i4 + 1), (C0914) m2056(bitSet, c0516.m1817(i4 + 3)));
                        c2815.m3925();
                        if (abstractC0777M2420 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0777Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0777Arr[i + 1] = null;
                        }
                        if (abstractC0777M2420 != null) {
                            abstractC0777Arr[i3] = null;
                        }
                        abstractC0777Arr[i] = abstractC0777M2420;
                        return abstractC0777M2420;
                }
            } catch (C2331 e) {
                e.m2885("...while parsing cst " + AbstractC1460.m3223(i) + " at offset " + AbstractC1460.m3224(i4));
                throw e;
            } catch (RuntimeException e2) {
                C2331 c2331 = new C2331(null, e2);
                c2331.m2885("...while parsing cst " + AbstractC1460.m3223(i) + " at offset " + AbstractC1460.m3224(i4));
                throw c2331;
            }
        } catch (IndexOutOfBoundsException unused) {
            throw new C1238("invalid constant pool index ".concat(AbstractC1460.m3223(i)), null);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public void m2057() {
        int i;
        if (this.f2529 < 0) {
            int[] iArr = (int[]) this.f2532;
            C0516 c0516 = (C0516) this.f2530;
            int iM1817 = 10;
            int i2 = 1;
            while (i2 < iArr.length) {
                iArr[i2] = iM1817;
                int iM1815 = c0516.m1815(iM1817);
                switch (iM1815) {
                    case 1:
                        iM1817 = c0516.m1817(iM1817 + 1) + 3 + iM1817;
                        break;
                    case 2:
                    case 13:
                    case Opcodes.DCONST_0 /* 14 */:
                    case Opcodes.SIPUSH /* 17 */:
                    default:
                        throw new C2331("unknown tag byte: " + AbstractC1460.m3222(iM1815), null);
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case Opcodes.FCONST_1 /* 12 */:
                    case Opcodes.LDC /* 18 */:
                        try {
                            iM1817 += 5;
                        } catch (C2331 e) {
                            e.m2885("...while preparsing cst " + AbstractC1460.m3223(i2) + " at offset " + AbstractC1460.m3224(iM1817));
                            throw e;
                        }
                        break;
                    case 5:
                    case 6:
                        iM1817 += 9;
                        i = 2;
                        continue;
                        i2 += i;
                        break;
                    case 7:
                    case 8:
                    case 16:
                        iM1817 += 3;
                        break;
                    case 15:
                        iM1817 += 4;
                        break;
                }
                i = 1;
                i2 += i;
            }
            this.f2529 = iM1817;
            BitSet bitSet = new BitSet(iArr.length);
            for (int i3 = 1; i3 < iArr.length; i3++) {
                if (iArr[i3] != 0) {
                    C2815 c2815 = (C2815) this.f2531;
                    c2815.getClass();
                    try {
                        if (c2815.f9024[i3] == null) {
                            m2056(bitSet, i3);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                        throw new C1238("invalid constant pool index ".concat(AbstractC1460.m3223(i3)), null);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public C0917 m2058(int i) {
        C0516 c0516 = (C0516) this.f2530;
        int iM1817 = c0516.m1817(i + 1);
        int i2 = i + 3;
        try {
            return new C0917(c0516.m1825(i2, iM1817 + i2));
        } catch (IllegalArgumentException e) {
            throw new C2331(null, e);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public void m2059() {
        int i;
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) this.f2531;
        C0943 c0943 = (C0943) this.f2532;
        int i2 = c0943.f3451;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) this.f2530;
        if (dialogXBaseRelativeLayout == null || c0943.m754() == null) {
            return;
        }
        AbstractC2205 abstractC2205 = AbstractC1034.f3778;
        maxRelativeLayout.getClass();
        int i3 = c0943.f921;
        int i4 = 0;
        if (i3 == 0) {
            i3 = 0;
        }
        if (i3 > 0) {
            maxRelativeLayout.f957 = i3;
        }
        maxRelativeLayout.setMinimumWidth(0);
        maxRelativeLayout.setMinimumHeight(0);
        dialogXBaseRelativeLayout.f934 = c0943.f913;
        int[] iArr = c0943.f922;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int[] iArr2 = dialogXBaseRelativeLayout.f949;
        iArr2[0] = i5;
        iArr2[1] = i6;
        iArr2[2] = i7;
        iArr2[3] = i8;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) maxRelativeLayout.getLayoutParams();
        if (layoutParams == null || ((i = this.f2529) != 0 && i != i2)) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        switch (AbstractC2784.m4759(i2)) {
            case 0:
                layoutParams.removeRule(10);
                layoutParams.removeRule(12);
                layoutParams.addRule(13);
                break;
            case 1:
            case 2:
                layoutParams.removeRule(13);
                layoutParams.addRule(10);
                layoutParams.addRule(14);
                break;
            case 3:
            case 11:
                layoutParams.removeRule(13);
                layoutParams.addRule(10);
                layoutParams.addRule(9);
                break;
            case 4:
            case 15:
                layoutParams.removeRule(13);
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                break;
            case 5:
            case 6:
                layoutParams.removeRule(13);
                layoutParams.addRule(12);
                layoutParams.addRule(14);
                break;
            case 7:
            case Opcodes.FCONST_1 /* 12 */:
                layoutParams.removeRule(13);
                layoutParams.addRule(12);
                break;
            case 8:
            case 16:
                layoutParams.removeRule(13);
                layoutParams.addRule(12);
                layoutParams.addRule(11);
                break;
            case 9:
            case 10:
                layoutParams.removeRule(13);
                layoutParams.addRule(5);
                layoutParams.addRule(15);
                break;
            case 13:
            case Opcodes.DCONST_0 /* 14 */:
                layoutParams.removeRule(13);
                layoutParams.addRule(11);
                layoutParams.addRule(15);
                break;
        }
        this.f2529 = i2;
        maxRelativeLayout.setLayoutParams(layoutParams);
        if (!c0943.f3453) {
            dialogXBaseRelativeLayout.setClickable(false);
        } else if (c0943.f915) {
            dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC0940(i4, this));
        } else {
            dialogXBaseRelativeLayout.setOnClickListener(null);
        }
        C2674 c2674 = c0943.f3446;
        if (c2674 != null && c2674.m3676() != null) {
            c0943.f3446.m3672(maxRelativeLayout, c0943.f3447);
        }
        int i9 = c0943.f3455;
        if (i9 != -1) {
            if (i9 > 0) {
                maxRelativeLayout.f956 = i9;
            }
            maxRelativeLayout.setMinimumWidth(i9);
        }
        int i10 = c0943.f3456;
        if (i10 != -1) {
            if (i10 > 0) {
                maxRelativeLayout.f957 = i10;
            }
            maxRelativeLayout.setMinimumHeight(i10);
        }
        dialogXBaseRelativeLayout.setBackgroundColor(c0943.f3452);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public void m2060() {
        int i = this.f2529 * 2;
        this.f2531 = Arrays.copyOf((Object[]) this.f2531, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        AbstractC0270.m1381(0, 14, (int[]) this.f2532, iArr);
        this.f2532 = iArr;
    }

    public C0662(C0404 c0404, int i) {
        this.f2528 = 5;
        if (i >= 0) {
            this.f2530 = c0404;
            this.f2529 = i;
            this.f2531 = null;
            this.f2532 = null;
            return;
        }
        throw new IllegalArgumentException("firstLabel < 0");
    }

    public C0662(C0516 c0516) {
        this.f2528 = 1;
        int iM1817 = c0516.m1817(8);
        this.f2530 = c0516;
        this.f2531 = new C2815(iM1817);
        this.f2532 = new int[iM1817];
        this.f2529 = -1;
    }

    public C0662(C0943 c0943, View view) {
        this.f2528 = 2;
        this.f2532 = c0943;
        if (view == null) {
            return;
        }
        c0943.f909 = new WeakReference(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f2530 = dialogXBaseRelativeLayout;
        this.f2531 = (MaxRelativeLayout) view.findViewById(R.id.box_custom);
        c0943.m753().setTranslationZ(0);
        dialogXBaseRelativeLayout.m764(c0943.f3447);
        dialogXBaseRelativeLayout.f937 = new C0938(0, this);
        dialogXBaseRelativeLayout.f938 = new C0094(11, this);
        dialogXBaseRelativeLayout.post(new RunnableC0939(this, 0));
        c0943.f3448 = this;
        m2059();
    }

    public C0662(C2596 c2596, int i) {
        this.f2528 = 6;
        this.f2532 = c2596;
        this.f2529 = i;
        int i2 = c2596.f8233;
        this.f2531 = new BitSet(i2);
        this.f2530 = new BitSet(i2);
        c2596.f8242 = true;
    }

    public C0662(C1676 c1676) {
        this.f2528 = 7;
        this.f2532 = c1676;
        this.f2530 = (C2597) c1676.f5658;
        this.f2531 = null;
    }

    public C0662(int i) {
        this.f2528 = 4;
        this.f2530 = new ArrayList(i);
        this.f2529 = 0;
        this.f2531 = null;
        this.f2532 = null;
    }

    public C0662(C0658 c0658, RecyclerView recyclerView, List list) {
        this.f2528 = 0;
        this.f2531 = c0658;
        this.f2532 = recyclerView;
        this.f2529 = -1;
        this.f2530 = list;
    }
}
