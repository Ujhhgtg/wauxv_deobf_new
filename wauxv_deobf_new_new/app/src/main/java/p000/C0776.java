package p000;

import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.ConcurrentHashMap;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᤞᲀᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0776 implements InterfaceC0518 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2877;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f2878;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f2879;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f2880;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f2881;

    public C0776(C1732 c1732) {
        this.f2877 = 2;
        this.f2879 = c1732;
        this.f2880 = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f2881 = iArr;
        this.f2878 = -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static C2581 m2372(C2581 c2581) {
        return (c2581 == null || c2581.f8206.getType() != C3505.f11035) ? c2581 : c2581.m4567(C3505.f11042);
    }

    public String toString() {
        switch (this.f2877) {
            case 2:
                return m2379();
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo1683(int i, int i2, C0917 c0917, ArrayList arrayList) {
        C2655 c2655 = (C2655) this.f2879;
        c2655.m5131((C0253) this.f2880, C3505.f11031);
        c2655.f11206 = arrayList;
        if (c0917 == null) {
            throw new NullPointerException("cst == null");
        }
        c2655.f11203 = c0917;
        c2655.m4649((C0253) this.f2880, i, Opcodes.NEWARRAY);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public void mo1684(int i, int i2, int i3, int i4, C3505 c3505, int i5) {
        C3505 c3505M5023;
        C2655 c2655 = (C2655) this.f2879;
        C1859 c1859M3764 = ((C1860) ((C1927) this.f2881).f6347).m3764(i == 54 ? i3 + i2 : i2, i4);
        C1853 c1853 = null;
        if (c1859M3764 != null) {
            c3505M5023 = C3505.m5023(c1859M3764.f6197.f3385);
            if (c3505M5023.mo4558() != c3505.mo4558()) {
                c3505M5023 = c3505;
                c1859M3764 = null;
            }
        } else {
            c3505M5023 = c3505;
        }
        if (i == 21) {
            C0253 c0253 = (C0253) this.f2880;
            c2655.m5127();
            c2655.f11199[0] = ((AbstractC1861) c0253.f1478).mo3767(i4);
            c2655.f11200 = 1;
            c2655.f11207 = i4;
            c2655.f11208 = c1859M3764 != null;
            c2655.f11201 = c3505;
        } else if (i == 54) {
            if (c1859M3764 != null) {
                C0916 c0916 = c1859M3764.f6196;
                C0916 c0917 = c1859M3764.f6198;
                if (c0916 != null || c0917 != null) {
                    c1853 = new C1853(c0916, c0917);
                }
            }
            c2655.m5131((C0253) this.f2880, c3505);
            c2655.f11201 = c3505;
            c2655.f11209 = C2581.m4554(i4, c3505M5023, c1853);
        } else if (i != 132) {
            if (i != 169) {
                mo1691(i, i2);
                throw null;
            }
            C0253 c0254 = (C0253) this.f2880;
            c2655.m5127();
            c2655.f11199[0] = ((AbstractC1861) c0254.f1478).mo3767(i4);
            c2655.f11200 = 1;
            c2655.f11207 = i4;
            c2655.f11208 = c1859M3764 != null;
            c2655.f11201 = c3505;
        } else {
            if (c1859M3764 != null) {
                C0916 c0918 = c1859M3764.f6196;
                C0916 c0919 = c1859M3764.f6198;
                if (c0918 != null || c0919 != null) {
                    c1853 = new C1853(c0918, c0919);
                }
            }
            C0253 c0255 = (C0253) this.f2880;
            c2655.m5127();
            c2655.f11199[0] = ((AbstractC1861) c0255.f1478).mo3767(i4);
            c2655.f11200 = 1;
            c2655.f11207 = i4;
            c2655.f11209 = C2581.m4554(i4, c3505M5023, c1853);
            c2655.f11201 = c3505;
            c2655.f11202 = i5;
            c2655.f11203 = C0902.m2537(i5);
        }
        c2655.m4649((C0253) this.f2880, i2, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void m2373(int i, int i2) {
        int[] iArr = (int[]) this.f2881;
        boolean z = iArr == null;
        if (i != 0 || z) {
            if (i < 0) {
                throw new RuntimeException("shouldn't happen");
            }
            if (z || i2 >= iArr.length) {
                int i3 = i2 + 1;
                C2583 c2583 = new C2583(i3);
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, -1);
                if (!z) {
                    C2583 c2584 = (C2583) this.f2880;
                    int length = c2584.f8209.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        C2581 c2581M4573 = c2584.m4573(i4);
                        if (c2581M4573 != null) {
                            c2583.m4574(c2581M4573);
                        }
                    }
                    int[] iArr3 = (int[]) this.f2881;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                }
                this.f2880 = c2583;
                this.f2881 = iArr2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0130  */
    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public void mo1686(int i, int i2, int i3, AbstractC0775 abstractC0775, int i4) {
        AbstractC0775 abstractC0776;
        C0912 c0912M2539;
        boolean zM2099 = C0561.m2099(26);
        C1927 c1927 = (C1927) this.f2881;
        C2655 c2655 = (C2655) this.f2879;
        if (i == 18 || i == 19) {
            if (((abstractC0775 instanceof C0911) || (abstractC0775 instanceof C0914)) && !C0561.m2099(28)) {
                c1927.m3880(String.format("invalid constant type %s requires --min-sdk-version >= %d (currently %d)", abstractC0775.mo2371(), 28, 13));
                throw null;
            }
            c2655.m5127();
            abstractC0776 = abstractC0775;
        } else if (i != 189) {
            if (i == 197) {
                C3505 c3505 = C3505.f11034;
                ConcurrentHashMap concurrentHashMap = C2492.f7897;
                StringBuilder sb = new StringBuilder(100);
                sb.append('(');
                for (int i5 = 0; i5 < i4; i5++) {
                    sb.append('I');
                }
                sb.append(')');
                sb.append(c3505.f11064);
                c2655.m5130((C0253) this.f2880, C2492.m4441(sb.toString()));
                abstractC0776 = abstractC0775;
            } else if (i != 192 && i != 193) {
                switch (i) {
                    case Opcodes.PUTSTATIC /* 179 */:
                        c2655.m5131((C0253) this.f2880, ((C0898) abstractC0775).f3376.m2545());
                        abstractC0776 = abstractC0775;
                        break;
                    case Opcodes.GETFIELD /* 180 */:
                        c2655.m5131((C0253) this.f2880, C3505.f11042);
                        abstractC0776 = abstractC0775;
                        break;
                    case Opcodes.PUTFIELD /* 181 */:
                        c2655.m5132((C0253) this.f2880, C3505.f11042, ((C0898) abstractC0775).f3376.m2545());
                        abstractC0776 = abstractC0775;
                        break;
                    case Opcodes.INVOKEVIRTUAL /* 182 */:
                    case Opcodes.INVOKESPECIAL /* 183 */:
                    case Opcodes.INVOKESTATIC /* 184 */:
                    case Opcodes.INVOKEINTERFACE /* 185 */:
                        boolean z = abstractC0775 instanceof C0903;
                        AbstractC0775 abstractC0777 = abstractC0775;
                        if (z) {
                            c0912M2539 = ((C0903) abstractC0775).m2539();
                            if (i != 185 && !C0561.m2099(24)) {
                                c1927.m3880(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)", i == 184 ? "static" : "default", c0912M2539.f3375.f3408.mo1360(), c0912M2539.f3376.mo1360(), 24, 13));
                                throw null;
                            }
                        }
                        abstractC0777 = c0912M2539;
                        abstractC0777 = c0912M2539;
                        abstractC0777 = c0912M2539;
                        if ((abstractC0777 instanceof C0912) && ((C0912) abstractC0777).m2527()) {
                            if (!zM2099) {
                                c1927.m3880(String.format("invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)", 26, 13));
                                throw null;
                            }
                            if (i != 182) {
                                c1927.m3880("Unsupported signature polymorphic invocation (" + AbstractC0514.m1961(i) + ")");
                                throw null;
                            }
                        }
                        i5 = i == 184 ? 1 : 0;
                        C0912 c0912 = (C0912) abstractC0777;
                        C2492 c2492 = c0912.f3337;
                        if (i5 == 0) {
                            if (c0912.f3338 == null) {
                                c0912.f3338 = c2492.m4444(c0912.f3375.f3408);
                            }
                            c2492 = c0912.f3338;
                        }
                        c2655.m5130((C0253) this.f2880, c2492);
                        abstractC0776 = abstractC0777;
                        break;
                    case 186:
                        if (!zM2099) {
                            c1927.m3880(String.format("invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)", Integer.valueOf(i), 26, 13));
                            throw null;
                        }
                        C0904 c0904 = (C0904) abstractC0775;
                        c2655.m5130((C0253) this.f2880, c0904.f3366);
                        ArrayList arrayList = c0904.f3369;
                        C0894 c0894 = new C0894(c0904, arrayList.size());
                        arrayList.add(c0894);
                        abstractC0776 = c0894;
                        break;
                        break;
                    default:
                        c2655.m5127();
                        abstractC0776 = abstractC0775;
                        break;
                }
            } else {
                c2655.m5131((C0253) this.f2880, C3505.f11042);
                abstractC0776 = abstractC0775;
            }
        } else {
            c2655.m5131((C0253) this.f2880, C3505.f11031);
            abstractC0776 = abstractC0775;
        }
        c2655.f11202 = i4;
        if (abstractC0776 == null) {
            throw new NullPointerException("cst == null");
        }
        c2655.f11203 = abstractC0776;
        c2655.m4649((C0253) this.f2880, i2, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public void m2374(int i, int i2, C2581 c2581) {
        int i3 = c2581.f8205;
        ArrayList arrayList = (ArrayList) this.f2879;
        arrayList.add(new C1854(i, i2, c2581));
        if (i2 == 1) {
            ((C2583) this.f2880).m4574(c2581);
            ((int[]) this.f2881)[i3] = -1;
        } else {
            ((C2583) this.f2880).m4575(c2581);
            ((int[]) this.f2881)[i3] = arrayList.size() - 1;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public void m2375(int i, int i2, C2581 c2581) {
        ArrayList arrayList = (ArrayList) this.f2879;
        if (i2 == 1) {
            throw new RuntimeException("shouldn't happen");
        }
        int i3 = ((int[]) this.f2881)[c2581.f8205];
        if (i3 >= 0) {
            C1854 c1854 = (C1854) arrayList.get(i3);
            int i4 = c1854.f6185;
            C2581 c2582 = c1854.f6187;
            if (i4 == i && c2582.equals(c2581)) {
                if (i2 != c1854.f6186) {
                    c1854 = new C1854(c1854.f6185, i2, c2582);
                }
                arrayList.set(i3, c1854);
                ((C2583) this.f2880).m4575(c2581);
                return;
            }
        }
        int i5 = c2581.f8205;
        C2581 c2581M2372 = m2372(c2581);
        m2373(i, i5);
        if (((int[]) this.f2881)[i5] >= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f2879;
        boolean z = true;
        int size = arrayList2.size() - 1;
        while (size >= 0) {
            C1854 c1855 = (C1854) arrayList2.get(size);
            if (c1855 != null) {
                if (c1855.f6185 != i) {
                    m2374(i, i2, c2581M2372);
                    return;
                } else if (c1855.f6187.m4561(c2581M2372)) {
                    break;
                }
            }
            size--;
        }
        ((C2583) this.f2880).m4575(c2581M2372);
        C1854 c1856 = null;
        arrayList2.set(size, null);
        this.f2878++;
        int i6 = c2581M2372.f8205;
        while (true) {
            size--;
            if (size < 0) {
                z = false;
                break;
            }
            c1856 = (C1854) arrayList2.get(size);
            if (c1856 != null && c1856.f6187.f8205 == i6) {
                break;
            }
        }
        if (z) {
            ((int[]) this.f2881)[i6] = size;
            int i7 = c1856.f6185;
            if (i7 == i) {
                if (2 != c1856.f6186) {
                    c1856 = new C1854(i7, 2, c1856.f6187);
                }
                arrayList2.set(size, c1856);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public void m2376(C3505 c3505) {
        C3505 c3506 = ((C2655) this.f2879).f11198.f7899;
        if (AbstractC2727.m4703(c3506, c3505)) {
            return;
        }
        ((C1927) this.f2881).m3880("return type mismatch: prototype indicates " + c3506.mo1360() + ", but encountered type " + c3505.mo1360());
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public void m2377(View view) {
        MaxRelativeLayout maxRelativeLayout;
        C0942 c0942 = (C0942) this.f2881;
        if (view != null) {
            view.setEnabled(false);
        }
        if (c0942.f989 || (maxRelativeLayout = (MaxRelativeLayout) this.f2880) == null) {
            return;
        }
        c0942.f989 = true;
        maxRelativeLayout.post(new RunnableC0938(this, 1));
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public void mo1691(int i, int i2) {
        throw new C2766("invalid opcode ".concat(AbstractC2902.m4905(i)), null);
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public void mo1692(int i, int i2, C1244 c1244, int i3) {
        C2655 c2655 = (C2655) this.f2879;
        c2655.m5131((C0253) this.f2880, C3505.f11031);
        c2655.f11202 = i3;
        c2655.f11205 = c1244;
        c2655.m4649((C0253) this.f2880, i, Opcodes.LOOKUPSWITCH);
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public int mo1693() {
        return this.f2878;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public long m2378(Animation animation) {
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) this.f2880;
        if (animation == null && maxRelativeLayout.getAnimation() != null) {
            animation = maxRelativeLayout.getAnimation();
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = ((C0942) this.f2881).f986;
        return j != -1 ? j : duration;
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public void mo1696(int i, int i2, int i3, int i4) {
        C2655 c2655 = (C2655) this.f2879;
        switch (i) {
            case Opcodes.IFEQ /* 153 */:
            case Opcodes.IFNE /* 154 */:
            case Opcodes.IFLT /* 155 */:
            case Opcodes.IFGE /* 156 */:
            case Opcodes.IFGT /* 157 */:
            case Opcodes.IFLE /* 158 */:
                c2655.m5131((C0253) this.f2880, C3505.f11031);
                c2655.f11204 = i4;
                c2655.m4649((C0253) this.f2880, i2, i);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
            case Opcodes.IF_ICMPNE /* 160 */:
            case Opcodes.IF_ICMPLT /* 161 */:
            case Opcodes.IF_ICMPGE /* 162 */:
            case Opcodes.IF_ICMPGT /* 163 */:
            case Opcodes.IF_ICMPLE /* 164 */:
                C0253 c0253 = (C0253) this.f2880;
                C3505 c3505 = C3505.f11031;
                c2655.m5132(c0253, c3505, c3505);
                c2655.f11204 = i4;
                c2655.m4649((C0253) this.f2880, i2, i);
                return;
            case Opcodes.IF_ACMPEQ /* 165 */:
            case Opcodes.IF_ACMPNE /* 166 */:
                C0253 c0254 = (C0253) this.f2880;
                C3505 c3506 = C3505.f11042;
                c2655.m5132(c0254, c3506, c3506);
                c2655.f11204 = i4;
                c2655.m4649((C0253) this.f2880, i2, i);
                return;
            default:
                switch (i) {
                    case Opcodes.IFNULL /* 198 */:
                    case Opcodes.IFNONNULL /* 199 */:
                        c2655.m5131((C0253) this.f2880, C3505.f11042);
                        break;
                    case 200:
                    case 201:
                        break;
                    default:
                        mo1691(i, i2);
                        throw null;
                }
                c2655.f11204 = i4;
                c2655.m4649((C0253) this.f2880, i2, i);
                return;
            case Opcodes.GOTO /* 167 */:
            case Opcodes.JSR /* 168 */:
                c2655.m5127();
                c2655.f11204 = i4;
                c2655.m4649((C0253) this.f2880, i2, i);
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:117:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:159:0x03fc  */
    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public void mo1697(int i, int i2, C3505 c3505) {
        C2655 c2655 = (C2655) this.f2879;
        if (i == 0) {
            c2655.m5127();
        } else if (i == 190) {
            C3505 c3505M3018 = ((C1244) ((C0253) this.f2880).f1479).m3018(0);
            if (!c3505M3018.m5032() && !c3505M3018.equals(C3505.f11035)) {
                ((C1927) this.f2881).m3880("type mismatch: expected array type but encountered " + c3505M3018.mo1360());
                throw null;
            }
            c2655.m5131((C0253) this.f2880, C3505.f11042);
        } else if (i != 191 && i != 194 && i != 195) {
            switch (i) {
                case 0:
                    c2655.m5127();
                    break;
                case Opcodes.IALOAD /* 46 */:
                    C3505 c3505M3879 = C1927.m3879(c3505, ((C1244) ((C0253) this.f2880).f1479).m3018(1));
                    C3505 c3505M5030 = C3505.f11035;
                    if (c3505M3879 != c3505M5030) {
                        c3505M5030 = c3505M3879.m5030();
                    }
                    c2655.m5132((C0253) this.f2880, c3505M3879, C3505.f11031);
                    c3505 = c3505M5030;
                    break;
                case Opcodes.IASTORE /* 79 */:
                    C1244 c1244 = (C1244) ((C0253) this.f2880).f1479;
                    int i3 = c3505.m5033() ? 2 : 3;
                    C3505 c3505M3019 = c1244.m3018(i3);
                    int i4 = c1244.f4506;
                    if (i3 >= i4) {
                        throw new C2766("stack: underflow", null);
                    }
                    boolean z = ((boolean[]) c1244.f4508)[(i4 - i3) - 1];
                    C3505 c3505M38710 = C1927.m3879(c3505, c3505M3019);
                    if (z && c3505M38710 != (c3505 = C3505.f11035)) {
                        c3505 = c3505M38710.m5030();
                    }
                    C0253 c0253 = (C0253) this.f2880;
                    C3505 c3506 = C3505.f11031;
                    c2655.m5129(c0253, 3);
                    if (!AbstractC2727.m4703(c3505M38710, c2655.f11199[0])) {
                        throw new C2766("expected type " + c3505M38710.mo1360() + " but found " + c2655.f11199[0].getType().mo1360(), null);
                    }
                    if (!AbstractC2727.m4703(c3506, c2655.f11199[1])) {
                        throw new C2766("expected type " + c3506.mo1360() + " but found " + c2655.f11199[1].getType().mo1360(), null);
                    }
                    if (!AbstractC2727.m4703(c3505, c2655.f11199[2])) {
                        throw new C2766("expected type " + c3505.mo1360() + " but found " + c2655.f11199[2].getType().mo1360(), null);
                    }
                    break;
                case 100:
                case 104:
                case Opcodes.IDIV /* 108 */:
                case 112:
                case 126:
                case 128:
                case Opcodes.IXOR /* 130 */:
                    c2655.m5132((C0253) this.f2880, c3505, c3505);
                    break;
                case Opcodes.INEG /* 116 */:
                    c2655.m5131((C0253) this.f2880, c3505);
                    break;
                case 120:
                case 122:
                case Opcodes.IUSHR /* 124 */:
                    c2655.m5132((C0253) this.f2880, c3505, C3505.f11031);
                    break;
                case Opcodes.IRETURN /* 172 */:
                    C3505 c3505M30110 = c3505 == C3505.f11042 ? ((C1244) ((C0253) this.f2880).f1479).m3018(0) : c3505;
                    c2655.m5131((C0253) this.f2880, c3505);
                    m2376(c3505M30110);
                    break;
                case Opcodes.RETURN /* 177 */:
                    c2655.m5127();
                    m2376(C3505.f11034);
                    break;
                default:
                    int i5 = 17;
                    switch (i) {
                        case Opcodes.POP /* 87 */:
                            if (((C1244) ((C0253) this.f2880).f1479).m3018(0).m5034()) {
                                throw C1927.m3878();
                            }
                            c2655.m5129((C0253) this.f2880, 1);
                            break;
                        case Opcodes.POP2 /* 88 */:
                        case Opcodes.DUP2 /* 92 */:
                            C1244 c1245 = (C1244) ((C0253) this.f2880).f1479;
                            if (c1245.m3018(0).m5034()) {
                                c2655.m5129((C0253) this.f2880, 1);
                            } else {
                                if (!c1245.m3018(1).m5033()) {
                                    throw C1927.m3878();
                                }
                                c2655.m5129((C0253) this.f2880, 2);
                                i5 = 8481;
                            }
                            if (i == 92) {
                                c2655.f11202 = i5;
                            }
                            break;
                        case Opcodes.DUP /* 89 */:
                            if (((C1244) ((C0253) this.f2880).f1479).m3018(0).m5034()) {
                                throw C1927.m3878();
                            }
                            c2655.m5129((C0253) this.f2880, 1);
                            c2655.f11202 = 17;
                            break;
                        case 90:
                            C1244 c1246 = (C1244) ((C0253) this.f2880).f1479;
                            if (!c1246.m3018(0).m5033() || !c1246.m3018(1).m5033()) {
                                throw C1927.m3878();
                            }
                            c2655.m5129((C0253) this.f2880, 2);
                            c2655.f11202 = 530;
                            break;
                            break;
                        case 91:
                            C1244 c1247 = (C1244) ((C0253) this.f2880).f1479;
                            if (c1247.m3018(0).m5034()) {
                                throw C1927.m3878();
                            }
                            if (c1247.m3018(1).m5034()) {
                                c2655.m5129((C0253) this.f2880, 2);
                                c2655.f11202 = 530;
                            } else {
                                if (!c1247.m3018(2).m5033()) {
                                    throw C1927.m3878();
                                }
                                c2655.m5129((C0253) this.f2880, 3);
                                c2655.f11202 = 12819;
                            }
                            break;
                            break;
                        case 93:
                            C1244 c1248 = (C1244) ((C0253) this.f2880).f1479;
                            if (!c1248.m3018(0).m5034()) {
                                if (c1248.m3018(1).m5034() || c1248.m3018(2).m5034()) {
                                    throw C1927.m3878();
                                }
                                c2655.m5129((C0253) this.f2880, 3);
                                c2655.f11202 = 205106;
                            } else {
                                if (c1248.m3018(2).m5034()) {
                                    throw C1927.m3878();
                                }
                                c2655.m5129((C0253) this.f2880, 2);
                                c2655.f11202 = 530;
                            }
                            break;
                        case 94:
                            C1244 c1249 = (C1244) ((C0253) this.f2880).f1479;
                            if (!c1249.m3018(0).m5034()) {
                                if (!c1249.m3018(1).m5033()) {
                                    throw C1927.m3878();
                                }
                                if (c1249.m3018(2).m5034()) {
                                    c2655.m5129((C0253) this.f2880, 3);
                                    c2655.f11202 = 205106;
                                } else {
                                    if (!c1249.m3018(3).m5033()) {
                                        throw C1927.m3878();
                                    }
                                    c2655.m5129((C0253) this.f2880, 4);
                                    c2655.f11202 = 4399427;
                                }
                            } else if (c1249.m3018(2).m5034()) {
                                c2655.m5129((C0253) this.f2880, 2);
                                c2655.f11202 = 530;
                            } else {
                                if (!c1249.m3018(3).m5033()) {
                                    throw C1927.m3878();
                                }
                                c2655.m5129((C0253) this.f2880, 3);
                                c2655.f11202 = 12819;
                            }
                            break;
                        case Opcodes.SWAP /* 95 */:
                            C1244 c12410 = (C1244) ((C0253) this.f2880).f1479;
                            if (!c12410.m3018(0).m5033() || !c12410.m3018(1).m5033()) {
                                throw C1927.m3878();
                            }
                            c2655.m5129((C0253) this.f2880, 2);
                            c2655.f11202 = 18;
                            break;
                            break;
                        case Opcodes.IADD /* 96 */:
                            c2655.m5132((C0253) this.f2880, c3505, c3505);
                            break;
                        default:
                            switch (i) {
                                case Opcodes.I2L /* 133 */:
                                case Opcodes.I2F /* 134 */:
                                case Opcodes.I2D /* 135 */:
                                case Opcodes.I2B /* 145 */:
                                case Opcodes.I2C /* 146 */:
                                case Opcodes.I2S /* 147 */:
                                    c2655.m5131((C0253) this.f2880, C3505.f11031);
                                    break;
                                case Opcodes.L2I /* 136 */:
                                case 137:
                                case 138:
                                    c2655.m5131((C0253) this.f2880, C3505.f11032);
                                    break;
                                case Opcodes.F2I /* 139 */:
                                case Opcodes.F2L /* 140 */:
                                case 141:
                                    c2655.m5131((C0253) this.f2880, C3505.f11030);
                                    break;
                                case Opcodes.D2I /* 142 */:
                                case Opcodes.D2L /* 143 */:
                                case 144:
                                    c2655.m5131((C0253) this.f2880, C3505.f11029);
                                    break;
                                case Opcodes.LCMP /* 148 */:
                                    C0253 c0254 = (C0253) this.f2880;
                                    C3505 c3507 = C3505.f11032;
                                    c2655.m5132(c0254, c3507, c3507);
                                    break;
                                case Opcodes.FCMPL /* 149 */:
                                case Opcodes.FCMPG /* 150 */:
                                    C0253 c0255 = (C0253) this.f2880;
                                    C3505 c3508 = C3505.f11030;
                                    c2655.m5132(c0255, c3508, c3508);
                                    break;
                                case Opcodes.DCMPL /* 151 */:
                                case Opcodes.DCMPG /* 152 */:
                                    C0253 c0256 = (C0253) this.f2880;
                                    C3505 c3509 = C3505.f11029;
                                    c2655.m5132(c0256, c3509, c3509);
                                    break;
                                default:
                                    mo1691(i, i2);
                                    throw null;
                            }
                            break;
                    }
                    break;
            }
        } else {
            c2655.m5131((C0253) this.f2880, C3505.f11042);
        }
        c2655.f11201 = c3505;
        c2655.m4649((C0253) this.f2880, i2, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public String m2379() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f2878 + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f2880)[i2];
            if (obj instanceof InterfaceC2715) {
                InterfaceC2715 interfaceC2715 = (InterfaceC2715) obj;
                if (!AbstractC1469.m3322(interfaceC2715.mo3640(), C2911.f9281)) {
                    int i3 = ((int[]) this.f2881)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC2715.mo3642(i3));
                    }
                } else if (((int[]) this.f2881)[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f2881)[i2]);
                    sb.append("]");
                }
            } else if (obj == C1139.f4220) {
                sb.append("[<debug info disabled>]");
            } else if (obj != C1139.f4221) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x0201  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public AbstractC0775 m2380(BitSet bitSet, int i) {
        AbstractC0775 c0909;
        AbstractC0775 abstractC0775M2537;
        AbstractC0775 abstractC0775M2380;
        int i2;
        boolean z;
        int i3;
        AbstractC0775 abstractC0775;
        C0493 c0493 = (C0493) this.f2879;
        C2875 c2875 = (C2875) this.f2880;
        c2875.getClass();
        AbstractC0775[] abstractC0775Arr = c2875.f9186;
        try {
            AbstractC0775 abstractC0776 = abstractC0775Arr[i];
            if (abstractC0776 != null) {
                return abstractC0776;
            }
            int i4 = ((int[]) this.f2881)[i];
            try {
                int iM1909 = c0493.m1909(i4);
                switch (iM1909) {
                    case 1:
                        C0916 c0916M2382 = m2382(i4);
                        bitSet.set(i);
                        abstractC0775M2537 = c0916M2382;
                        c2875.m4109();
                        if (abstractC0775M2537 == null && abstractC0775M2537.mo2370()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0775Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0775Arr[i + 1] = null;
                        }
                        if (abstractC0775M2537 != null && abstractC0775Arr[i] == null && (abstractC0775 = abstractC0775Arr[(i3 = i - 1)]) != null && abstractC0775.mo2370()) {
                            abstractC0775Arr[i3] = null;
                        }
                        abstractC0775Arr[i] = abstractC0775M2537;
                        return abstractC0775M2537;
                    case 2:
                    case 13:
                    case Opcodes.DCONST_0 /* 14 */:
                    case Opcodes.SIPUSH /* 17 */:
                    default:
                        throw new C2371("unknown tag byte: ".concat(AbstractC2902.m4905(iM1909)), null);
                    case 3:
                        abstractC0775M2537 = C0902.m2537(c0493.m1906(i4 + 1));
                        c2875.m4109();
                        if (abstractC0775M2537 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0775Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0775Arr[i + 1] = null;
                        }
                        if (abstractC0775M2537 != null) {
                            abstractC0775Arr[i3] = null;
                        }
                        abstractC0775Arr[i] = abstractC0775M2537;
                        return abstractC0775M2537;
                    case 4:
                        abstractC0775M2537 = new C0899(c0493.m1906(i4 + 1));
                        c2875.m4109();
                        if (abstractC0775M2537 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0775Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0775Arr[i + 1] = null;
                        }
                        if (abstractC0775M2537 != null) {
                            abstractC0775Arr[i3] = null;
                        }
                        abstractC0775Arr[i] = abstractC0775M2537;
                        return abstractC0775M2537;
                    case 5:
                        c0909 = new C0909(c0493.m1907(i4 + 1));
                        abstractC0775M2537 = c0909;
                        c2875.m4109();
                        if (abstractC0775M2537 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0775Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0775Arr[i + 1] = null;
                        }
                        if (abstractC0775M2537 != null) {
                            abstractC0775Arr[i3] = null;
                        }
                        abstractC0775Arr[i] = abstractC0775M2537;
                        return abstractC0775M2537;
                    case 6:
                        c0909 = new C0896(c0493.m1907(i4 + 1));
                        abstractC0775M2537 = c0909;
                        c2875.m4109();
                        if (abstractC0775M2537 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0775Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0775Arr[i + 1] = null;
                        }
                        if (abstractC0775M2537 != null) {
                            abstractC0775Arr[i3] = null;
                        }
                        abstractC0775Arr[i] = abstractC0775M2537;
                        return abstractC0775M2537;
                    case 7:
                        abstractC0775M2537 = new C0917(C3505.m5024(((C0916) m2380(bitSet, c0493.m1911(i4 + 1))).f3385));
                        c2875.m4109();
                        if (abstractC0775M2537 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0775Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0775Arr[i + 1] = null;
                        }
                        if (abstractC0775M2537 != null) {
                            abstractC0775Arr[i3] = null;
                        }
                        abstractC0775Arr[i] = abstractC0775M2537;
                        return abstractC0775M2537;
                    case 8:
                        abstractC0775M2537 = m2380(bitSet, c0493.m1911(i4 + 1));
                        c2875.m4109();
                        if (abstractC0775M2537 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0775Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0775Arr[i + 1] = null;
                        }
                        if (abstractC0775M2537 != null) {
                            abstractC0775Arr[i3] = null;
                        }
                        abstractC0775Arr[i] = abstractC0775M2537;
                        return abstractC0775M2537;
                    case 9:
                        abstractC0775M2537 = new C0898((C0917) m2380(bitSet, c0493.m1911(i4 + 1)), (C0913) m2380(bitSet, c0493.m1911(i4 + 3)));
                        c2875.m4109();
                        if (abstractC0775M2537 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0775Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0775Arr[i + 1] = null;
                        }
                        if (abstractC0775M2537 != null) {
                            abstractC0775Arr[i3] = null;
                        }
                        abstractC0775Arr[i] = abstractC0775M2537;
                        return abstractC0775M2537;
                    case 10:
                        abstractC0775M2537 = new C0912((C0917) m2380(bitSet, c0493.m1911(i4 + 1)), (C0913) m2380(bitSet, c0493.m1911(i4 + 3)));
                        c2875.m4109();
                        if (abstractC0775M2537 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0775Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0775Arr[i + 1] = null;
                        }
                        if (abstractC0775M2537 != null) {
                            abstractC0775Arr[i3] = null;
                        }
                        abstractC0775Arr[i] = abstractC0775M2537;
                        return abstractC0775M2537;
                    case 11:
                        C0903 c0903 = new C0903((C0917) m2380(bitSet, c0493.m1911(i4 + 1)), (C0913) m2380(bitSet, c0493.m1911(i4 + 3)));
                        c0903.f3363 = null;
                        abstractC0775M2537 = c0903;
                        c2875.m4109();
                        if (abstractC0775M2537 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0775Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0775Arr[i + 1] = null;
                        }
                        if (abstractC0775M2537 != null) {
                            abstractC0775Arr[i3] = null;
                        }
                        abstractC0775Arr[i] = abstractC0775M2537;
                        return abstractC0775M2537;
                    case Opcodes.FCONST_1 /* 12 */:
                        abstractC0775M2537 = new C0913((C0916) m2380(bitSet, c0493.m1911(i4 + 1)), (C0916) m2380(bitSet, c0493.m1911(i4 + 3)));
                        c2875.m4109();
                        if (abstractC0775M2537 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0775Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0775Arr[i + 1] = null;
                        }
                        if (abstractC0775M2537 != null) {
                            abstractC0775Arr[i3] = null;
                        }
                        abstractC0775Arr[i] = abstractC0775M2537;
                        return abstractC0775M2537;
                    case 15:
                        int iM19010 = c0493.m1909(i4 + 1);
                        int iM1911 = c0493.m1911(i4 + 2);
                        switch (iM19010) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                abstractC0775M2380 = (C0898) m2380(bitSet, iM1911);
                                break;
                            case 5:
                            case 8:
                                abstractC0775M2380 = (C0912) m2380(bitSet, iM1911);
                                break;
                            case 6:
                            case 7:
                                abstractC0775M2380 = m2380(bitSet, iM1911);
                                if (!(abstractC0775M2380 instanceof C0912) && !(abstractC0775M2380 instanceof C0903)) {
                                    throw new C2371("Unsupported ref constant type for MethodHandle " + abstractC0775M2380.getClass(), null);
                                }
                                break;
                            case 9:
                                abstractC0775M2380 = (C0903) m2380(bitSet, iM1911);
                                break;
                            default:
                                throw new C2371("Unsupported MethodHandle kind: " + iM19010, null);
                        }
                        switch (iM19010) {
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
                                throw new IllegalArgumentException(AbstractC1095.m2794(iM19010, "invalid kind: "));
                        }
                        abstractC0775M2537 = C0911.m2544(i2, abstractC0775M2380);
                        c2875.m4109();
                        if (abstractC0775M2537 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0775Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0775Arr[i + 1] = null;
                        }
                        if (abstractC0775M2537 != null) {
                            abstractC0775Arr[i3] = null;
                        }
                        abstractC0775Arr[i] = abstractC0775M2537;
                        return abstractC0775M2537;
                    case 16:
                        abstractC0775M2537 = new C0914(C2492.m4440(((C0916) m2380(bitSet, c0493.m1911(i4 + 1))).f3385));
                        c2875.m4109();
                        if (abstractC0775M2537 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0775Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0775Arr[i + 1] = null;
                        }
                        if (abstractC0775M2537 != null) {
                            abstractC0775Arr[i3] = null;
                        }
                        abstractC0775Arr[i] = abstractC0775M2537;
                        return abstractC0775M2537;
                    case Opcodes.LDC /* 18 */:
                        abstractC0775M2537 = new C0904(c0493.m1911(i4 + 1), (C0913) m2380(bitSet, c0493.m1911(i4 + 3)));
                        c2875.m4109();
                        if (abstractC0775M2537 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC0775Arr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC0775Arr[i + 1] = null;
                        }
                        if (abstractC0775M2537 != null) {
                            abstractC0775Arr[i3] = null;
                        }
                        abstractC0775Arr[i] = abstractC0775M2537;
                        return abstractC0775M2537;
                }
            } catch (C2371 e) {
                e.m3004("...while parsing cst " + AbstractC2902.m4906(i) + " at offset " + AbstractC2902.m4907(i4));
                throw e;
            } catch (RuntimeException e2) {
                C2371 c2371 = new C2371(null, e2);
                c2371.m3004("...while parsing cst " + AbstractC2902.m4906(i) + " at offset " + AbstractC2902.m4907(i4));
                throw c2371;
            }
        } catch (IndexOutOfBoundsException unused) {
            throw new C1240("invalid constant pool index ".concat(AbstractC2902.m4906(i)), null);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public void m2381() {
        int i;
        if (this.f2878 < 0) {
            int[] iArr = (int[]) this.f2881;
            C0493 c0493 = (C0493) this.f2879;
            int iM1911 = 10;
            int i2 = 1;
            while (i2 < iArr.length) {
                iArr[i2] = iM1911;
                int iM1909 = c0493.m1909(iM1911);
                switch (iM1909) {
                    case 1:
                        iM1911 = c0493.m1911(iM1911 + 1) + 3 + iM1911;
                        break;
                    case 2:
                    case 13:
                    case Opcodes.DCONST_0 /* 14 */:
                    case Opcodes.SIPUSH /* 17 */:
                    default:
                        throw new C2371("unknown tag byte: " + AbstractC2902.m4905(iM1909), null);
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case Opcodes.FCONST_1 /* 12 */:
                    case Opcodes.LDC /* 18 */:
                        try {
                            iM1911 += 5;
                        } catch (C2371 e) {
                            e.m3004("...while preparsing cst " + AbstractC2902.m4906(i2) + " at offset " + AbstractC2902.m4907(iM1911));
                            throw e;
                        }
                        break;
                    case 5:
                    case 6:
                        iM1911 += 9;
                        i = 2;
                        continue;
                        i2 += i;
                        break;
                    case 7:
                    case 8:
                    case 16:
                        iM1911 += 3;
                        break;
                    case 15:
                        iM1911 += 4;
                        break;
                }
                i = 1;
                i2 += i;
            }
            this.f2878 = iM1911;
            BitSet bitSet = new BitSet(iArr.length);
            for (int i3 = 1; i3 < iArr.length; i3++) {
                if (iArr[i3] != 0) {
                    C2875 c2875 = (C2875) this.f2880;
                    c2875.getClass();
                    try {
                        if (c2875.f9186[i3] == null) {
                            m2380(bitSet, i3);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                        throw new C1240("invalid constant pool index ".concat(AbstractC2902.m4906(i3)), null);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public C0916 m2382(int i) {
        C0493 c0493 = (C0493) this.f2879;
        int iM1911 = c0493.m1911(i + 1);
        int i2 = i + 3;
        try {
            return new C0916(c0493.m1919(i2, iM1911 + i2));
        } catch (IllegalArgumentException e) {
            throw new C2371(null, e);
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public void m2383() {
        int i;
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) this.f2880;
        C0942 c0942 = (C0942) this.f2881;
        int i2 = c0942.f3458;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) this.f2879;
        if (dialogXBaseRelativeLayout == null || c0942.m898() == null) {
            return;
        }
        AbstractC1469 abstractC1469 = AbstractC1037.f3785;
        maxRelativeLayout.getClass();
        int i3 = c0942.f987;
        int i4 = 0;
        if (i3 == 0) {
            i3 = 0;
        }
        if (i3 > 0) {
            maxRelativeLayout.f1023 = i3;
        }
        maxRelativeLayout.setMinimumWidth(0);
        maxRelativeLayout.setMinimumHeight(0);
        dialogXBaseRelativeLayout.f1000 = c0942.f979;
        int[] iArr = c0942.f988;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int[] iArr2 = dialogXBaseRelativeLayout.f1015;
        iArr2[0] = i5;
        iArr2[1] = i6;
        iArr2[2] = i7;
        iArr2[3] = i8;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) maxRelativeLayout.getLayoutParams();
        if (layoutParams == null || ((i = this.f2878) != 0 && i != i2)) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        switch (AbstractC2844.m4792(i2)) {
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
        this.f2878 = i2;
        maxRelativeLayout.setLayoutParams(layoutParams);
        if (!c0942.f3460) {
            dialogXBaseRelativeLayout.setClickable(false);
        } else if (c0942.f981) {
            dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC0939(this, i4));
        } else {
            dialogXBaseRelativeLayout.setOnClickListener(null);
        }
        AbstractC1915 abstractC1915 = c0942.f3453;
        if (abstractC1915 != null && abstractC1915.m3854() != null) {
            c0942.f3453.m3850(maxRelativeLayout, c0942.f3454);
        }
        int i9 = c0942.f3462;
        if (i9 != -1) {
            if (i9 > 0) {
                maxRelativeLayout.f1022 = i9;
            }
            maxRelativeLayout.setMinimumWidth(i9);
        }
        int i10 = c0942.f3463;
        if (i10 != -1) {
            if (i10 > 0) {
                maxRelativeLayout.f1023 = i10;
            }
            maxRelativeLayout.setMinimumHeight(i10);
        }
        dialogXBaseRelativeLayout.setBackgroundColor(c0942.f3459);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public void m2384() {
        int i = this.f2878 * 2;
        this.f2880 = Arrays.copyOf((Object[]) this.f2880, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        AbstractC0280.m1527(0, 14, (int[]) this.f2881, iArr);
        this.f2881 = iArr;
    }

    public C0776(C0379 c0379, int i) {
        this.f2877 = 4;
        if (i >= 0) {
            this.f2879 = c0379;
            this.f2878 = i;
            this.f2880 = null;
            this.f2881 = null;
            return;
        }
        throw new IllegalArgumentException("firstLabel < 0");
    }

    public C0776(C0493 c0493) {
        this.f2877 = 0;
        int iM1911 = c0493.m1911(8);
        this.f2879 = c0493;
        this.f2880 = new C2875(iM1911);
        this.f2881 = new int[iM1911];
        this.f2878 = -1;
    }

    public C0776(C0942 c0942, View view) {
        this.f2877 = 1;
        this.f2881 = c0942;
        if (view == null) {
            return;
        }
        c0942.f975 = new WeakReference(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f2879 = dialogXBaseRelativeLayout;
        this.f2880 = (MaxRelativeLayout) view.findViewById(R.id.box_custom);
        c0942.m897().setTranslationZ(0);
        dialogXBaseRelativeLayout.m908(c0942.f3454);
        dialogXBaseRelativeLayout.f1003 = new C0937(this, 0);
        dialogXBaseRelativeLayout.f1004 = new C0102(this, 12);
        dialogXBaseRelativeLayout.post(new RunnableC0938(this, 0));
        c0942.f3455 = this;
        m2383();
    }

    public C0776(C2654 c2654, int i) {
        this.f2877 = 5;
        this.f2881 = c2654;
        this.f2878 = i;
        int i2 = c2654.f8385;
        this.f2880 = new BitSet(i2);
        this.f2879 = new BitSet(i2);
        c2654.f8394 = true;
    }

    public C0776(C1927 c1927) {
        this.f2877 = 6;
        this.f2881 = c1927;
        this.f2879 = (C2655) c1927.f6344;
        this.f2880 = null;
    }

    public C0776(int i) {
        this.f2877 = 3;
        this.f2879 = new ArrayList(i);
        this.f2878 = 0;
        this.f2880 = null;
        this.f2881 = null;
    }
}
