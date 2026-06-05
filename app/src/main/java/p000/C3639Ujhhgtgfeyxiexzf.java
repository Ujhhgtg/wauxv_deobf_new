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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3639Ujhhgtgfeyxiexzf implements InterfaceC2630Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f11367Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f11368Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object f11369Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object f11370Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Object f11371Ujhhgtgfeyxiexzf;

    public C3639Ujhhgtgfeyxiexzf(C0136Ujhhgtgfeyxiexzf c0136Ujhhgtgfeyxiexzf) {
        this.f11367Ujhhgtgfeyxiexzf = 2;
        this.f11369Ujhhgtgfeyxiexzf = c0136Ujhhgtgfeyxiexzf;
        this.f11370Ujhhgtgfeyxiexzf = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f11371Ujhhgtgfeyxiexzf = iArr;
        this.f11368Ujhhgtgfeyxiexzf = -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static C0961feyxiexzfUjhhgtg m5272Ujhhgtgfeyxiexzf(C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg) {
        return (c0961feyxiexzfUjhhgtg == null || c0961feyxiexzfUjhhgtg.f3831Ujhhgtgfeyxiexzf.getType() != C1784feyxiexzfUjhhgtg.f5988Ujhhgtgfeyxiexzf) ? c0961feyxiexzfUjhhgtg : c0961feyxiexzfUjhhgtg.m2460Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg);
    }

    public String toString() {
        switch (this.f11367Ujhhgtgfeyxiexzf) {
            case 2:
                return m5279Ujhhgtgfeyxiexzf();
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public void mo3763Ujhhgtgfeyxiexzf(int i, int i2, C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf, ArrayList arrayList) {
        C0907feyxiexzfUjhhgtg c0907feyxiexzfUjhhgtg = (C0907feyxiexzfUjhhgtg) this.f11369Ujhhgtgfeyxiexzf;
        c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf);
        c0907feyxiexzfUjhhgtg.f6213Ujhhgtgfeyxiexzf = arrayList;
        if (c3057Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("cst == null");
        }
        c0907feyxiexzfUjhhgtg.f6210Ujhhgtgfeyxiexzf = c3057Ujhhgtgfeyxiexzf;
        c0907feyxiexzfUjhhgtg.m2395Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, i, Opcodes.NEWARRAY);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public void mo3764Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4, C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg, int i5) {
        C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtgM3114Ujhhgtgfeyxiexzf;
        C0907feyxiexzfUjhhgtg c0907feyxiexzfUjhhgtg = (C0907feyxiexzfUjhhgtg) this.f11369Ujhhgtgfeyxiexzf;
        C0237Ujhhgtgfeyxiexzf c0237UjhhgtgfeyxiexzfM1405Ujhhgtgfeyxiexzf = ((C0245Ujhhgtgfeyxiexzf) ((C0210Ujhhgtgfeyxiexzf) this.f11371Ujhhgtgfeyxiexzf).f1473Ujhhgtgfeyxiexzf).m1405Ujhhgtgfeyxiexzf(i == 54 ? i3 + i2 : i2, i4);
        C0258Ujhhgtgfeyxiexzf c0258Ujhhgtgfeyxiexzf = null;
        if (c0237UjhhgtgfeyxiexzfM1405Ujhhgtgfeyxiexzf != null) {
            c1784feyxiexzfUjhhgtgM3114Ujhhgtgfeyxiexzf = C1784feyxiexzfUjhhgtg.m3114Ujhhgtgfeyxiexzf(c0237UjhhgtgfeyxiexzfM1405Ujhhgtgfeyxiexzf.f1559Ujhhgtgfeyxiexzf.f9450Ujhhgtgfeyxiexzf);
            if (c1784feyxiexzfUjhhgtgM3114Ujhhgtgfeyxiexzf.mo2412Ujhhgtgfeyxiexzf() != c1784feyxiexzfUjhhgtg.mo2412Ujhhgtgfeyxiexzf()) {
                c1784feyxiexzfUjhhgtgM3114Ujhhgtgfeyxiexzf = c1784feyxiexzfUjhhgtg;
                c0237UjhhgtgfeyxiexzfM1405Ujhhgtgfeyxiexzf = null;
            }
        } else {
            c1784feyxiexzfUjhhgtgM3114Ujhhgtgfeyxiexzf = c1784feyxiexzfUjhhgtg;
        }
        if (i == 21) {
            C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = (C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf;
            c0907feyxiexzfUjhhgtg.m3178Ujhhgtgfeyxiexzf();
            c0907feyxiexzfUjhhgtg.f6206Ujhhgtgfeyxiexzf[0] = ((AbstractC0246Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf).mo1396Ujhhgtgfeyxiexzf(i4);
            c0907feyxiexzfUjhhgtg.f6207Ujhhgtgfeyxiexzf = 1;
            c0907feyxiexzfUjhhgtg.f6214Ujhhgtgfeyxiexzf = i4;
            c0907feyxiexzfUjhhgtg.f6215Ujhhgtgfeyxiexzf = c0237UjhhgtgfeyxiexzfM1405Ujhhgtgfeyxiexzf != null;
            c0907feyxiexzfUjhhgtg.f6208Ujhhgtgfeyxiexzf = c1784feyxiexzfUjhhgtg;
        } else if (i == 54) {
            if (c0237UjhhgtgfeyxiexzfM1405Ujhhgtgfeyxiexzf != null) {
                C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf = c0237UjhhgtgfeyxiexzfM1405Ujhhgtgfeyxiexzf.f1558Ujhhgtgfeyxiexzf;
                C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf2 = c0237UjhhgtgfeyxiexzfM1405Ujhhgtgfeyxiexzf.f1560Ujhhgtgfeyxiexzf;
                if (c3056Ujhhgtgfeyxiexzf != null || c3056Ujhhgtgfeyxiexzf2 != null) {
                    c0258Ujhhgtgfeyxiexzf = new C0258Ujhhgtgfeyxiexzf(c3056Ujhhgtgfeyxiexzf, c3056Ujhhgtgfeyxiexzf2);
                }
            }
            c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, c1784feyxiexzfUjhhgtg);
            c0907feyxiexzfUjhhgtg.f6208Ujhhgtgfeyxiexzf = c1784feyxiexzfUjhhgtg;
            c0907feyxiexzfUjhhgtg.f6216Ujhhgtgfeyxiexzf = C0961feyxiexzfUjhhgtg.m2451Ujhhgtgfeyxiexzf(i4, c1784feyxiexzfUjhhgtgM3114Ujhhgtgfeyxiexzf, c0258Ujhhgtgfeyxiexzf);
        } else if (i != 132) {
            if (i != 169) {
                mo3769Ujhhgtgfeyxiexzf(i, i2);
                throw null;
            }
            C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf2 = (C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf;
            c0907feyxiexzfUjhhgtg.m3178Ujhhgtgfeyxiexzf();
            c0907feyxiexzfUjhhgtg.f6206Ujhhgtgfeyxiexzf[0] = ((AbstractC0246Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf2.f7714Ujhhgtgfeyxiexzf).mo1396Ujhhgtgfeyxiexzf(i4);
            c0907feyxiexzfUjhhgtg.f6207Ujhhgtgfeyxiexzf = 1;
            c0907feyxiexzfUjhhgtg.f6214Ujhhgtgfeyxiexzf = i4;
            c0907feyxiexzfUjhhgtg.f6215Ujhhgtgfeyxiexzf = c0237UjhhgtgfeyxiexzfM1405Ujhhgtgfeyxiexzf != null;
            c0907feyxiexzfUjhhgtg.f6208Ujhhgtgfeyxiexzf = c1784feyxiexzfUjhhgtg;
        } else {
            if (c0237UjhhgtgfeyxiexzfM1405Ujhhgtgfeyxiexzf != null) {
                C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf3 = c0237UjhhgtgfeyxiexzfM1405Ujhhgtgfeyxiexzf.f1558Ujhhgtgfeyxiexzf;
                C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf4 = c0237UjhhgtgfeyxiexzfM1405Ujhhgtgfeyxiexzf.f1560Ujhhgtgfeyxiexzf;
                if (c3056Ujhhgtgfeyxiexzf3 != null || c3056Ujhhgtgfeyxiexzf4 != null) {
                    c0258Ujhhgtgfeyxiexzf = new C0258Ujhhgtgfeyxiexzf(c3056Ujhhgtgfeyxiexzf3, c3056Ujhhgtgfeyxiexzf4);
                }
            }
            C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf3 = (C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf;
            c0907feyxiexzfUjhhgtg.m3178Ujhhgtgfeyxiexzf();
            c0907feyxiexzfUjhhgtg.f6206Ujhhgtgfeyxiexzf[0] = ((AbstractC0246Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf3.f7714Ujhhgtgfeyxiexzf).mo1396Ujhhgtgfeyxiexzf(i4);
            c0907feyxiexzfUjhhgtg.f6207Ujhhgtgfeyxiexzf = 1;
            c0907feyxiexzfUjhhgtg.f6214Ujhhgtgfeyxiexzf = i4;
            c0907feyxiexzfUjhhgtg.f6216Ujhhgtgfeyxiexzf = C0961feyxiexzfUjhhgtg.m2451Ujhhgtgfeyxiexzf(i4, c1784feyxiexzfUjhhgtgM3114Ujhhgtgfeyxiexzf, c0258Ujhhgtgfeyxiexzf);
            c0907feyxiexzfUjhhgtg.f6208Ujhhgtgfeyxiexzf = c1784feyxiexzfUjhhgtg;
            c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = i5;
            c0907feyxiexzfUjhhgtg.f6210Ujhhgtgfeyxiexzf = C3144Ujhhgtgfeyxiexzf.m4660Ujhhgtgfeyxiexzf(i5);
        }
        c0907feyxiexzfUjhhgtg.m2395Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, i2, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m5273Ujhhgtgfeyxiexzf(int i, int i2) {
        int[] iArr = (int[]) this.f11371Ujhhgtgfeyxiexzf;
        boolean z = iArr == null;
        if (i != 0 || z) {
            if (i < 0) {
                throw new RuntimeException("shouldn't happen");
            }
            if (z || i2 >= iArr.length) {
                int i3 = i2 + 1;
                C0963feyxiexzfUjhhgtg c0963feyxiexzfUjhhgtg = new C0963feyxiexzfUjhhgtg(i3);
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, -1);
                if (!z) {
                    C0963feyxiexzfUjhhgtg c0963feyxiexzfUjhhgtg2 = (C0963feyxiexzfUjhhgtg) this.f11370Ujhhgtgfeyxiexzf;
                    int length = c0963feyxiexzfUjhhgtg2.f3833Ujhhgtgfeyxiexzf.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtgM2461Ujhhgtgfeyxiexzf = c0963feyxiexzfUjhhgtg2.m2461Ujhhgtgfeyxiexzf(i4);
                        if (c0961feyxiexzfUjhhgtgM2461Ujhhgtgfeyxiexzf != null) {
                            c0963feyxiexzfUjhhgtg.m2462Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtgM2461Ujhhgtgfeyxiexzf);
                        }
                    }
                    int[] iArr3 = (int[]) this.f11371Ujhhgtgfeyxiexzf;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                }
                this.f11370Ujhhgtgfeyxiexzf = c0963feyxiexzfUjhhgtg;
                this.f11371Ujhhgtgfeyxiexzf = iArr2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0130  */
    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public void mo3766Ujhhgtgfeyxiexzf(int i, int i2, int i3, AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf, int i4) {
        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf2;
        C3154Ujhhgtgfeyxiexzf c3154UjhhgtgfeyxiexzfM4662Ujhhgtgfeyxiexzf;
        boolean zM4029Ujhhgtgfeyxiexzf = C2697Ujhhgtgfeyxiexzf.m4029Ujhhgtgfeyxiexzf(26);
        C0210Ujhhgtgfeyxiexzf c0210Ujhhgtgfeyxiexzf = (C0210Ujhhgtgfeyxiexzf) this.f11371Ujhhgtgfeyxiexzf;
        C0907feyxiexzfUjhhgtg c0907feyxiexzfUjhhgtg = (C0907feyxiexzfUjhhgtg) this.f11369Ujhhgtgfeyxiexzf;
        if (i == 18 || i == 19) {
            if (((abstractC3638Ujhhgtgfeyxiexzf instanceof C3153Ujhhgtgfeyxiexzf) || (abstractC3638Ujhhgtgfeyxiexzf instanceof C3156Ujhhgtgfeyxiexzf)) && !C2697Ujhhgtgfeyxiexzf.m4029Ujhhgtgfeyxiexzf(28)) {
                c0210Ujhhgtgfeyxiexzf.m1291Ujhhgtgfeyxiexzf(String.format("invalid constant type %s requires --min-sdk-version >= %d (currently %d)", abstractC3638Ujhhgtgfeyxiexzf.mo4533Ujhhgtgfeyxiexzf(), 28, 13));
                throw null;
            }
            c0907feyxiexzfUjhhgtg.m3178Ujhhgtgfeyxiexzf();
            abstractC3638Ujhhgtgfeyxiexzf2 = abstractC3638Ujhhgtgfeyxiexzf;
        } else if (i != 189) {
            if (i == 197) {
                C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg = C1784feyxiexzfUjhhgtg.f5987Ujhhgtgfeyxiexzf;
                ConcurrentHashMap concurrentHashMap = C0870feyxiexzfUjhhgtg.f3379Ujhhgtgfeyxiexzf;
                StringBuilder sb = new StringBuilder(100);
                sb.append('(');
                for (int i5 = 0; i5 < i4; i5++) {
                    sb.append('I');
                }
                sb.append(')');
                sb.append(c1784feyxiexzfUjhhgtg.f6017Ujhhgtgfeyxiexzf);
                c0907feyxiexzfUjhhgtg.m3181Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C0870feyxiexzfUjhhgtg.m2300Ujhhgtgfeyxiexzf(sb.toString()));
                abstractC3638Ujhhgtgfeyxiexzf2 = abstractC3638Ujhhgtgfeyxiexzf;
            } else if (i != 192 && i != 193) {
                switch (i) {
                    case Opcodes.PUTSTATIC /* 179 */:
                        c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, ((C3140Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f9761Ujhhgtgfeyxiexzf.m4668Ujhhgtgfeyxiexzf());
                        abstractC3638Ujhhgtgfeyxiexzf2 = abstractC3638Ujhhgtgfeyxiexzf;
                        break;
                    case Opcodes.GETFIELD /* 180 */:
                        c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg);
                        abstractC3638Ujhhgtgfeyxiexzf2 = abstractC3638Ujhhgtgfeyxiexzf;
                        break;
                    case Opcodes.PUTFIELD /* 181 */:
                        c0907feyxiexzfUjhhgtg.m3183Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg, ((C3140Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f9761Ujhhgtgfeyxiexzf.m4668Ujhhgtgfeyxiexzf());
                        abstractC3638Ujhhgtgfeyxiexzf2 = abstractC3638Ujhhgtgfeyxiexzf;
                        break;
                    case Opcodes.INVOKEVIRTUAL /* 182 */:
                    case Opcodes.INVOKESPECIAL /* 183 */:
                    case Opcodes.INVOKESTATIC /* 184 */:
                    case Opcodes.INVOKEINTERFACE /* 185 */:
                        boolean z = abstractC3638Ujhhgtgfeyxiexzf instanceof C3145Ujhhgtgfeyxiexzf;
                        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf3 = abstractC3638Ujhhgtgfeyxiexzf;
                        if (z) {
                            c3154UjhhgtgfeyxiexzfM4662Ujhhgtgfeyxiexzf = ((C3145Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).m4662Ujhhgtgfeyxiexzf();
                            if (i != 185 && !C2697Ujhhgtgfeyxiexzf.m4029Ujhhgtgfeyxiexzf(24)) {
                                c0210Ujhhgtgfeyxiexzf.m1291Ujhhgtgfeyxiexzf(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)", i == 184 ? "static" : "default", c3154UjhhgtgfeyxiexzfM4662Ujhhgtgfeyxiexzf.f9760Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf(), c3154UjhhgtgfeyxiexzfM4662Ujhhgtgfeyxiexzf.f9761Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf(), 24, 13));
                                throw null;
                            }
                        }
                        abstractC3638Ujhhgtgfeyxiexzf3 = c3154UjhhgtgfeyxiexzfM4662Ujhhgtgfeyxiexzf;
                        abstractC3638Ujhhgtgfeyxiexzf3 = c3154UjhhgtgfeyxiexzfM4662Ujhhgtgfeyxiexzf;
                        abstractC3638Ujhhgtgfeyxiexzf3 = c3154UjhhgtgfeyxiexzfM4662Ujhhgtgfeyxiexzf;
                        if ((abstractC3638Ujhhgtgfeyxiexzf3 instanceof C3154Ujhhgtgfeyxiexzf) && ((C3154Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf3).m5408Ujhhgtgfeyxiexzf()) {
                            if (!zM4029Ujhhgtgfeyxiexzf) {
                                c0210Ujhhgtgfeyxiexzf.m1291Ujhhgtgfeyxiexzf(String.format("invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)", 26, 13));
                                throw null;
                            }
                            if (i != 182) {
                                c0210Ujhhgtgfeyxiexzf.m1291Ujhhgtgfeyxiexzf("Unsupported signature polymorphic invocation (" + AbstractC2651Ujhhgtgfeyxiexzf.m3982Ujhhgtgfeyxiexzf(i) + ")");
                                throw null;
                            }
                        }
                        i5 = i == 184 ? 1 : 0;
                        C3154Ujhhgtgfeyxiexzf c3154Ujhhgtgfeyxiexzf = (C3154Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf3;
                        C0870feyxiexzfUjhhgtg c0870feyxiexzfUjhhgtg = c3154Ujhhgtgfeyxiexzf.f11831Ujhhgtgfeyxiexzf;
                        if (i5 == 0) {
                            if (c3154Ujhhgtgfeyxiexzf.f11832Ujhhgtgfeyxiexzf == null) {
                                c3154Ujhhgtgfeyxiexzf.f11832Ujhhgtgfeyxiexzf = c0870feyxiexzfUjhhgtg.m2303Ujhhgtgfeyxiexzf(c3154Ujhhgtgfeyxiexzf.f9760Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf);
                            }
                            c0870feyxiexzfUjhhgtg = c3154Ujhhgtgfeyxiexzf.f11832Ujhhgtgfeyxiexzf;
                        }
                        c0907feyxiexzfUjhhgtg.m3181Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, c0870feyxiexzfUjhhgtg);
                        abstractC3638Ujhhgtgfeyxiexzf2 = abstractC3638Ujhhgtgfeyxiexzf3;
                        break;
                    case 186:
                        if (!zM4029Ujhhgtgfeyxiexzf) {
                            c0210Ujhhgtgfeyxiexzf.m1291Ujhhgtgfeyxiexzf(String.format("invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)", Integer.valueOf(i), 26, 13));
                            throw null;
                        }
                        C3146Ujhhgtgfeyxiexzf c3146Ujhhgtgfeyxiexzf = (C3146Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf;
                        c0907feyxiexzfUjhhgtg.m3181Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, c3146Ujhhgtgfeyxiexzf.f9751Ujhhgtgfeyxiexzf);
                        ArrayList arrayList = c3146Ujhhgtgfeyxiexzf.f9754Ujhhgtgfeyxiexzf;
                        C3136Ujhhgtgfeyxiexzf c3136Ujhhgtgfeyxiexzf = new C3136Ujhhgtgfeyxiexzf(c3146Ujhhgtgfeyxiexzf, arrayList.size());
                        arrayList.add(c3136Ujhhgtgfeyxiexzf);
                        abstractC3638Ujhhgtgfeyxiexzf2 = c3136Ujhhgtgfeyxiexzf;
                        break;
                        break;
                    default:
                        c0907feyxiexzfUjhhgtg.m3178Ujhhgtgfeyxiexzf();
                        abstractC3638Ujhhgtgfeyxiexzf2 = abstractC3638Ujhhgtgfeyxiexzf;
                        break;
                }
            } else {
                c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg);
                abstractC3638Ujhhgtgfeyxiexzf2 = abstractC3638Ujhhgtgfeyxiexzf;
            }
        } else {
            c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf);
            abstractC3638Ujhhgtgfeyxiexzf2 = abstractC3638Ujhhgtgfeyxiexzf;
        }
        c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = i4;
        if (abstractC3638Ujhhgtgfeyxiexzf2 == null) {
            throw new NullPointerException("cst == null");
        }
        c0907feyxiexzfUjhhgtg.f6210Ujhhgtgfeyxiexzf = abstractC3638Ujhhgtgfeyxiexzf2;
        c0907feyxiexzfUjhhgtg.m2395Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, i2, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public void m5274Ujhhgtgfeyxiexzf(int i, int i2, C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg) {
        int i3 = c0961feyxiexzfUjhhgtg.f3830Ujhhgtgfeyxiexzf;
        ArrayList arrayList = (ArrayList) this.f11369Ujhhgtgfeyxiexzf;
        arrayList.add(new C0239Ujhhgtgfeyxiexzf(i, i2, c0961feyxiexzfUjhhgtg));
        if (i2 == 1) {
            ((C0963feyxiexzfUjhhgtg) this.f11370Ujhhgtgfeyxiexzf).m2462Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtg);
            ((int[]) this.f11371Ujhhgtgfeyxiexzf)[i3] = -1;
        } else {
            ((C0963feyxiexzfUjhhgtg) this.f11370Ujhhgtgfeyxiexzf).m2463Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtg);
            ((int[]) this.f11371Ujhhgtgfeyxiexzf)[i3] = arrayList.size() - 1;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public void m5275Ujhhgtgfeyxiexzf(int i, int i2, C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg) {
        ArrayList arrayList = (ArrayList) this.f11369Ujhhgtgfeyxiexzf;
        if (i2 == 1) {
            throw new RuntimeException("shouldn't happen");
        }
        int i3 = ((int[]) this.f11371Ujhhgtgfeyxiexzf)[c0961feyxiexzfUjhhgtg.f3830Ujhhgtgfeyxiexzf];
        if (i3 >= 0) {
            C0239Ujhhgtgfeyxiexzf c0239Ujhhgtgfeyxiexzf = (C0239Ujhhgtgfeyxiexzf) arrayList.get(i3);
            int i4 = c0239Ujhhgtgfeyxiexzf.f1566Ujhhgtgfeyxiexzf;
            C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg2 = c0239Ujhhgtgfeyxiexzf.f1568Ujhhgtgfeyxiexzf;
            if (i4 == i && c0961feyxiexzfUjhhgtg2.equals(c0961feyxiexzfUjhhgtg)) {
                if (i2 != c0239Ujhhgtgfeyxiexzf.f1567Ujhhgtgfeyxiexzf) {
                    c0239Ujhhgtgfeyxiexzf = new C0239Ujhhgtgfeyxiexzf(c0239Ujhhgtgfeyxiexzf.f1566Ujhhgtgfeyxiexzf, i2, c0961feyxiexzfUjhhgtg2);
                }
                arrayList.set(i3, c0239Ujhhgtgfeyxiexzf);
                ((C0963feyxiexzfUjhhgtg) this.f11370Ujhhgtgfeyxiexzf).m2463Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtg);
                return;
            }
        }
        int i5 = c0961feyxiexzfUjhhgtg.f3830Ujhhgtgfeyxiexzf;
        C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtgM5272Ujhhgtgfeyxiexzf = m5272Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtg);
        m5273Ujhhgtgfeyxiexzf(i, i5);
        if (((int[]) this.f11371Ujhhgtgfeyxiexzf)[i5] >= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f11369Ujhhgtgfeyxiexzf;
        boolean z = true;
        int size = arrayList2.size() - 1;
        while (size >= 0) {
            C0239Ujhhgtgfeyxiexzf c0239Ujhhgtgfeyxiexzf2 = (C0239Ujhhgtgfeyxiexzf) arrayList2.get(size);
            if (c0239Ujhhgtgfeyxiexzf2 != null) {
                if (c0239Ujhhgtgfeyxiexzf2.f1566Ujhhgtgfeyxiexzf != i) {
                    m5274Ujhhgtgfeyxiexzf(i, i2, c0961feyxiexzfUjhhgtgM5272Ujhhgtgfeyxiexzf);
                    return;
                } else if (c0239Ujhhgtgfeyxiexzf2.f1568Ujhhgtgfeyxiexzf.m2454Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtgM5272Ujhhgtgfeyxiexzf)) {
                    break;
                }
            }
            size--;
        }
        ((C0963feyxiexzfUjhhgtg) this.f11370Ujhhgtgfeyxiexzf).m2463Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtgM5272Ujhhgtgfeyxiexzf);
        C0239Ujhhgtgfeyxiexzf c0239Ujhhgtgfeyxiexzf3 = null;
        arrayList2.set(size, null);
        this.f11368Ujhhgtgfeyxiexzf++;
        int i6 = c0961feyxiexzfUjhhgtgM5272Ujhhgtgfeyxiexzf.f3830Ujhhgtgfeyxiexzf;
        while (true) {
            size--;
            if (size < 0) {
                z = false;
                break;
            }
            c0239Ujhhgtgfeyxiexzf3 = (C0239Ujhhgtgfeyxiexzf) arrayList2.get(size);
            if (c0239Ujhhgtgfeyxiexzf3 != null && c0239Ujhhgtgfeyxiexzf3.f1568Ujhhgtgfeyxiexzf.f3830Ujhhgtgfeyxiexzf == i6) {
                break;
            }
        }
        if (z) {
            ((int[]) this.f11371Ujhhgtgfeyxiexzf)[i6] = size;
            int i7 = c0239Ujhhgtgfeyxiexzf3.f1566Ujhhgtgfeyxiexzf;
            if (i7 == i) {
                if (2 != c0239Ujhhgtgfeyxiexzf3.f1567Ujhhgtgfeyxiexzf) {
                    c0239Ujhhgtgfeyxiexzf3 = new C0239Ujhhgtgfeyxiexzf(i7, 2, c0239Ujhhgtgfeyxiexzf3.f1568Ujhhgtgfeyxiexzf);
                }
                arrayList2.set(size, c0239Ujhhgtgfeyxiexzf3);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public void m5276Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg) {
        C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg2 = ((C0907feyxiexzfUjhhgtg) this.f11369Ujhhgtgfeyxiexzf).f6205Ujhhgtgfeyxiexzf.f3381Ujhhgtgfeyxiexzf;
        if (AbstractC3594Ujhhgtgfeyxiexzf.m5182Ujhhgtgfeyxiexzf(c1784feyxiexzfUjhhgtg2, c1784feyxiexzfUjhhgtg)) {
            return;
        }
        ((C0210Ujhhgtgfeyxiexzf) this.f11371Ujhhgtgfeyxiexzf).m1291Ujhhgtgfeyxiexzf("return type mismatch: prototype indicates " + c1784feyxiexzfUjhhgtg2.mo1392Ujhhgtgfeyxiexzf() + ", but encountered type " + c1784feyxiexzfUjhhgtg.mo1392Ujhhgtgfeyxiexzf());
        throw null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public void m5277Ujhhgtgfeyxiexzf(View view) {
        MaxRelativeLayout maxRelativeLayout;
        C3082Ujhhgtgfeyxiexzf c3082Ujhhgtgfeyxiexzf = (C3082Ujhhgtgfeyxiexzf) this.f11371Ujhhgtgfeyxiexzf;
        if (view != null) {
            view.setEnabled(false);
        }
        if (c3082Ujhhgtgfeyxiexzf.f1003Ujhhgtgfeyxiexzf || (maxRelativeLayout = (MaxRelativeLayout) this.f11370Ujhhgtgfeyxiexzf) == null) {
            return;
        }
        c3082Ujhhgtgfeyxiexzf.f1003Ujhhgtgfeyxiexzf = true;
        maxRelativeLayout.post(new RunnableC3051Ujhhgtgfeyxiexzf(this, 1));
    }

    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public void mo3769Ujhhgtgfeyxiexzf(int i, int i2) {
        throw new C1045feyxiexzfUjhhgtg("invalid opcode ".concat(AbstractC1264feyxiexzfUjhhgtg.m2808Ujhhgtgfeyxiexzf(i)), null);
    }

    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public void mo3770Ujhhgtgfeyxiexzf(int i, int i2, C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg, int i3) {
        C0907feyxiexzfUjhhgtg c0907feyxiexzfUjhhgtg = (C0907feyxiexzfUjhhgtg) this.f11369Ujhhgtgfeyxiexzf;
        c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf);
        c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = i3;
        c0907feyxiexzfUjhhgtg.f6212Ujhhgtgfeyxiexzf = c3366feyxiexzfUjhhgtg;
        c0907feyxiexzfUjhhgtg.m2395Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, i, Opcodes.LOOKUPSWITCH);
    }

    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public int mo3771Ujhhgtgfeyxiexzf() {
        return this.f11368Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public long m5278Ujhhgtgfeyxiexzf(Animation animation) {
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) this.f11370Ujhhgtgfeyxiexzf;
        if (animation == null && maxRelativeLayout.getAnimation() != null) {
            animation = maxRelativeLayout.getAnimation();
        }
        long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
        long j = ((C3082Ujhhgtgfeyxiexzf) this.f11371Ujhhgtgfeyxiexzf).f1000Ujhhgtgfeyxiexzf;
        return j != -1 ? j : duration;
    }

    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public void mo3772Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4) {
        C0907feyxiexzfUjhhgtg c0907feyxiexzfUjhhgtg = (C0907feyxiexzfUjhhgtg) this.f11369Ujhhgtgfeyxiexzf;
        switch (i) {
            case Opcodes.IFEQ /* 153 */:
            case Opcodes.IFNE /* 154 */:
            case Opcodes.IFLT /* 155 */:
            case Opcodes.IFGE /* 156 */:
            case Opcodes.IFGT /* 157 */:
            case Opcodes.IFLE /* 158 */:
                c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf);
                c0907feyxiexzfUjhhgtg.f6211Ujhhgtgfeyxiexzf = i4;
                c0907feyxiexzfUjhhgtg.m2395Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, i2, i);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
            case Opcodes.IF_ICMPNE /* 160 */:
            case Opcodes.IF_ICMPLT /* 161 */:
            case Opcodes.IF_ICMPGE /* 162 */:
            case Opcodes.IF_ICMPGT /* 163 */:
            case Opcodes.IF_ICMPLE /* 164 */:
                C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = (C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf;
                C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg = C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf;
                c0907feyxiexzfUjhhgtg.m3183Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf, c1784feyxiexzfUjhhgtg, c1784feyxiexzfUjhhgtg);
                c0907feyxiexzfUjhhgtg.f6211Ujhhgtgfeyxiexzf = i4;
                c0907feyxiexzfUjhhgtg.m2395Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, i2, i);
                return;
            case Opcodes.IF_ACMPEQ /* 165 */:
            case Opcodes.IF_ACMPNE /* 166 */:
                C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf2 = (C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf;
                C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg2 = C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg;
                c0907feyxiexzfUjhhgtg.m3183Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf2, c1784feyxiexzfUjhhgtg2, c1784feyxiexzfUjhhgtg2);
                c0907feyxiexzfUjhhgtg.f6211Ujhhgtgfeyxiexzf = i4;
                c0907feyxiexzfUjhhgtg.m2395Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, i2, i);
                return;
            default:
                switch (i) {
                    case Opcodes.IFNULL /* 198 */:
                    case Opcodes.IFNONNULL /* 199 */:
                        c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg);
                        break;
                    case 200:
                    case 201:
                        break;
                    default:
                        mo3769Ujhhgtgfeyxiexzf(i, i2);
                        throw null;
                }
                c0907feyxiexzfUjhhgtg.f6211Ujhhgtgfeyxiexzf = i4;
                c0907feyxiexzfUjhhgtg.m2395Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, i2, i);
                return;
            case Opcodes.GOTO /* 167 */:
            case Opcodes.JSR /* 168 */:
                c0907feyxiexzfUjhhgtg.m3178Ujhhgtgfeyxiexzf();
                c0907feyxiexzfUjhhgtg.f6211Ujhhgtgfeyxiexzf = i4;
                c0907feyxiexzfUjhhgtg.m2395Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, i2, i);
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:117:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:159:0x03fc  */
    @Override // p000.InterfaceC2630Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public void mo3773Ujhhgtgfeyxiexzf(int i, int i2, C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg) {
        C0907feyxiexzfUjhhgtg c0907feyxiexzfUjhhgtg = (C0907feyxiexzfUjhhgtg) this.f11369Ujhhgtgfeyxiexzf;
        if (i == 0) {
            c0907feyxiexzfUjhhgtg.m3178Ujhhgtgfeyxiexzf();
        } else if (i == 190) {
            C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtgM4873Ujhhgtgfeyxiexzf = ((C3366feyxiexzfUjhhgtg) ((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf).f7715Ujhhgtgfeyxiexzf).m4873Ujhhgtgfeyxiexzf(0);
            if (!c1784feyxiexzfUjhhgtgM4873Ujhhgtgfeyxiexzf.m3123Ujhhgtgfeyxiexzf() && !c1784feyxiexzfUjhhgtgM4873Ujhhgtgfeyxiexzf.equals(C1784feyxiexzfUjhhgtg.f5988Ujhhgtgfeyxiexzf)) {
                ((C0210Ujhhgtgfeyxiexzf) this.f11371Ujhhgtgfeyxiexzf).m1291Ujhhgtgfeyxiexzf("type mismatch: expected array type but encountered " + c1784feyxiexzfUjhhgtgM4873Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
                throw null;
            }
            c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg);
        } else if (i != 191 && i != 194 && i != 195) {
            switch (i) {
                case 0:
                    c0907feyxiexzfUjhhgtg.m3178Ujhhgtgfeyxiexzf();
                    break;
                case Opcodes.IALOAD /* 46 */:
                    C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtgM1290Ujhhgtgfeyxiexzf = C0210Ujhhgtgfeyxiexzf.m1290Ujhhgtgfeyxiexzf(c1784feyxiexzfUjhhgtg, ((C3366feyxiexzfUjhhgtg) ((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf).f7715Ujhhgtgfeyxiexzf).m4873Ujhhgtgfeyxiexzf(1));
                    C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtgM3121Ujhhgtgfeyxiexzf = C1784feyxiexzfUjhhgtg.f5988Ujhhgtgfeyxiexzf;
                    if (c1784feyxiexzfUjhhgtgM1290Ujhhgtgfeyxiexzf != c1784feyxiexzfUjhhgtgM3121Ujhhgtgfeyxiexzf) {
                        c1784feyxiexzfUjhhgtgM3121Ujhhgtgfeyxiexzf = c1784feyxiexzfUjhhgtgM1290Ujhhgtgfeyxiexzf.m3121Ujhhgtgfeyxiexzf();
                    }
                    c0907feyxiexzfUjhhgtg.m3183Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, c1784feyxiexzfUjhhgtgM1290Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf);
                    c1784feyxiexzfUjhhgtg = c1784feyxiexzfUjhhgtgM3121Ujhhgtgfeyxiexzf;
                    break;
                case Opcodes.IASTORE /* 79 */:
                    C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg = (C3366feyxiexzfUjhhgtg) ((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf).f7715Ujhhgtgfeyxiexzf;
                    int i3 = c1784feyxiexzfUjhhgtg.m3124Ujhhgtgfeyxiexzf() ? 2 : 3;
                    C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtgM4873Ujhhgtgfeyxiexzf2 = c3366feyxiexzfUjhhgtg.m4873Ujhhgtgfeyxiexzf(i3);
                    int i4 = c3366feyxiexzfUjhhgtg.f10526Ujhhgtgfeyxiexzf;
                    if (i3 >= i4) {
                        throw new C1045feyxiexzfUjhhgtg("stack: underflow", null);
                    }
                    boolean z = ((boolean[]) c3366feyxiexzfUjhhgtg.f10528Ujhhgtgfeyxiexzf)[(i4 - i3) - 1];
                    C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtgM1290Ujhhgtgfeyxiexzf2 = C0210Ujhhgtgfeyxiexzf.m1290Ujhhgtgfeyxiexzf(c1784feyxiexzfUjhhgtg, c1784feyxiexzfUjhhgtgM4873Ujhhgtgfeyxiexzf2);
                    if (z && c1784feyxiexzfUjhhgtgM1290Ujhhgtgfeyxiexzf2 != (c1784feyxiexzfUjhhgtg = C1784feyxiexzfUjhhgtg.f5988Ujhhgtgfeyxiexzf)) {
                        c1784feyxiexzfUjhhgtg = c1784feyxiexzfUjhhgtgM1290Ujhhgtgfeyxiexzf2.m3121Ujhhgtgfeyxiexzf();
                    }
                    C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = (C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf;
                    C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg2 = C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf;
                    c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf, 3);
                    if (!AbstractC3594Ujhhgtgfeyxiexzf.m5182Ujhhgtgfeyxiexzf(c1784feyxiexzfUjhhgtgM1290Ujhhgtgfeyxiexzf2, c0907feyxiexzfUjhhgtg.f6206Ujhhgtgfeyxiexzf[0])) {
                        throw new C1045feyxiexzfUjhhgtg("expected type " + c1784feyxiexzfUjhhgtgM1290Ujhhgtgfeyxiexzf2.mo1392Ujhhgtgfeyxiexzf() + " but found " + c0907feyxiexzfUjhhgtg.f6206Ujhhgtgfeyxiexzf[0].getType().mo1392Ujhhgtgfeyxiexzf(), null);
                    }
                    if (!AbstractC3594Ujhhgtgfeyxiexzf.m5182Ujhhgtgfeyxiexzf(c1784feyxiexzfUjhhgtg2, c0907feyxiexzfUjhhgtg.f6206Ujhhgtgfeyxiexzf[1])) {
                        throw new C1045feyxiexzfUjhhgtg("expected type " + c1784feyxiexzfUjhhgtg2.mo1392Ujhhgtgfeyxiexzf() + " but found " + c0907feyxiexzfUjhhgtg.f6206Ujhhgtgfeyxiexzf[1].getType().mo1392Ujhhgtgfeyxiexzf(), null);
                    }
                    if (!AbstractC3594Ujhhgtgfeyxiexzf.m5182Ujhhgtgfeyxiexzf(c1784feyxiexzfUjhhgtg, c0907feyxiexzfUjhhgtg.f6206Ujhhgtgfeyxiexzf[2])) {
                        throw new C1045feyxiexzfUjhhgtg("expected type " + c1784feyxiexzfUjhhgtg.mo1392Ujhhgtgfeyxiexzf() + " but found " + c0907feyxiexzfUjhhgtg.f6206Ujhhgtgfeyxiexzf[2].getType().mo1392Ujhhgtgfeyxiexzf(), null);
                    }
                    break;
                case 100:
                case 104:
                case Opcodes.IDIV /* 108 */:
                case 112:
                case 126:
                case 128:
                case Opcodes.IXOR /* 130 */:
                    c0907feyxiexzfUjhhgtg.m3183Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, c1784feyxiexzfUjhhgtg, c1784feyxiexzfUjhhgtg);
                    break;
                case Opcodes.INEG /* 116 */:
                    c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, c1784feyxiexzfUjhhgtg);
                    break;
                case 120:
                case 122:
                case Opcodes.IUSHR /* 124 */:
                    c0907feyxiexzfUjhhgtg.m3183Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, c1784feyxiexzfUjhhgtg, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.IRETURN /* 172 */:
                    C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtgM4873Ujhhgtgfeyxiexzf3 = c1784feyxiexzfUjhhgtg == C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg ? ((C3366feyxiexzfUjhhgtg) ((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf).f7715Ujhhgtgfeyxiexzf).m4873Ujhhgtgfeyxiexzf(0) : c1784feyxiexzfUjhhgtg;
                    c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, c1784feyxiexzfUjhhgtg);
                    m5276Ujhhgtgfeyxiexzf(c1784feyxiexzfUjhhgtgM4873Ujhhgtgfeyxiexzf3);
                    break;
                case Opcodes.RETURN /* 177 */:
                    c0907feyxiexzfUjhhgtg.m3178Ujhhgtgfeyxiexzf();
                    m5276Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg.f5987Ujhhgtgfeyxiexzf);
                    break;
                default:
                    int i5 = 17;
                    switch (i) {
                        case Opcodes.POP /* 87 */:
                            if (((C3366feyxiexzfUjhhgtg) ((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf).f7715Ujhhgtgfeyxiexzf).m4873Ujhhgtgfeyxiexzf(0).m3125Ujhhgtgfeyxiexzf()) {
                                throw C0210Ujhhgtgfeyxiexzf.m1289Ujhhgtgfeyxiexzf();
                            }
                            c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, 1);
                            break;
                        case Opcodes.POP2 /* 88 */:
                        case Opcodes.DUP2 /* 92 */:
                            C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg2 = (C3366feyxiexzfUjhhgtg) ((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf).f7715Ujhhgtgfeyxiexzf;
                            if (c3366feyxiexzfUjhhgtg2.m4873Ujhhgtgfeyxiexzf(0).m3125Ujhhgtgfeyxiexzf()) {
                                c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, 1);
                            } else {
                                if (!c3366feyxiexzfUjhhgtg2.m4873Ujhhgtgfeyxiexzf(1).m3124Ujhhgtgfeyxiexzf()) {
                                    throw C0210Ujhhgtgfeyxiexzf.m1289Ujhhgtgfeyxiexzf();
                                }
                                c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, 2);
                                i5 = 8481;
                            }
                            if (i == 92) {
                                c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = i5;
                            }
                            break;
                        case Opcodes.DUP /* 89 */:
                            if (((C3366feyxiexzfUjhhgtg) ((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf).f7715Ujhhgtgfeyxiexzf).m4873Ujhhgtgfeyxiexzf(0).m3125Ujhhgtgfeyxiexzf()) {
                                throw C0210Ujhhgtgfeyxiexzf.m1289Ujhhgtgfeyxiexzf();
                            }
                            c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, 1);
                            c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = 17;
                            break;
                        case 90:
                            C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg3 = (C3366feyxiexzfUjhhgtg) ((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf).f7715Ujhhgtgfeyxiexzf;
                            if (!c3366feyxiexzfUjhhgtg3.m4873Ujhhgtgfeyxiexzf(0).m3124Ujhhgtgfeyxiexzf() || !c3366feyxiexzfUjhhgtg3.m4873Ujhhgtgfeyxiexzf(1).m3124Ujhhgtgfeyxiexzf()) {
                                throw C0210Ujhhgtgfeyxiexzf.m1289Ujhhgtgfeyxiexzf();
                            }
                            c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, 2);
                            c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = 530;
                            break;
                            break;
                        case 91:
                            C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg4 = (C3366feyxiexzfUjhhgtg) ((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf).f7715Ujhhgtgfeyxiexzf;
                            if (c3366feyxiexzfUjhhgtg4.m4873Ujhhgtgfeyxiexzf(0).m3125Ujhhgtgfeyxiexzf()) {
                                throw C0210Ujhhgtgfeyxiexzf.m1289Ujhhgtgfeyxiexzf();
                            }
                            if (c3366feyxiexzfUjhhgtg4.m4873Ujhhgtgfeyxiexzf(1).m3125Ujhhgtgfeyxiexzf()) {
                                c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, 2);
                                c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = 530;
                            } else {
                                if (!c3366feyxiexzfUjhhgtg4.m4873Ujhhgtgfeyxiexzf(2).m3124Ujhhgtgfeyxiexzf()) {
                                    throw C0210Ujhhgtgfeyxiexzf.m1289Ujhhgtgfeyxiexzf();
                                }
                                c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, 3);
                                c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = 12819;
                            }
                            break;
                            break;
                        case 93:
                            C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg5 = (C3366feyxiexzfUjhhgtg) ((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf).f7715Ujhhgtgfeyxiexzf;
                            if (!c3366feyxiexzfUjhhgtg5.m4873Ujhhgtgfeyxiexzf(0).m3125Ujhhgtgfeyxiexzf()) {
                                if (c3366feyxiexzfUjhhgtg5.m4873Ujhhgtgfeyxiexzf(1).m3125Ujhhgtgfeyxiexzf() || c3366feyxiexzfUjhhgtg5.m4873Ujhhgtgfeyxiexzf(2).m3125Ujhhgtgfeyxiexzf()) {
                                    throw C0210Ujhhgtgfeyxiexzf.m1289Ujhhgtgfeyxiexzf();
                                }
                                c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, 3);
                                c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = 205106;
                            } else {
                                if (c3366feyxiexzfUjhhgtg5.m4873Ujhhgtgfeyxiexzf(2).m3125Ujhhgtgfeyxiexzf()) {
                                    throw C0210Ujhhgtgfeyxiexzf.m1289Ujhhgtgfeyxiexzf();
                                }
                                c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, 2);
                                c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = 530;
                            }
                            break;
                        case 94:
                            C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg6 = (C3366feyxiexzfUjhhgtg) ((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf).f7715Ujhhgtgfeyxiexzf;
                            if (!c3366feyxiexzfUjhhgtg6.m4873Ujhhgtgfeyxiexzf(0).m3125Ujhhgtgfeyxiexzf()) {
                                if (!c3366feyxiexzfUjhhgtg6.m4873Ujhhgtgfeyxiexzf(1).m3124Ujhhgtgfeyxiexzf()) {
                                    throw C0210Ujhhgtgfeyxiexzf.m1289Ujhhgtgfeyxiexzf();
                                }
                                if (c3366feyxiexzfUjhhgtg6.m4873Ujhhgtgfeyxiexzf(2).m3125Ujhhgtgfeyxiexzf()) {
                                    c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, 3);
                                    c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = 205106;
                                } else {
                                    if (!c3366feyxiexzfUjhhgtg6.m4873Ujhhgtgfeyxiexzf(3).m3124Ujhhgtgfeyxiexzf()) {
                                        throw C0210Ujhhgtgfeyxiexzf.m1289Ujhhgtgfeyxiexzf();
                                    }
                                    c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, 4);
                                    c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = 4399427;
                                }
                            } else if (c3366feyxiexzfUjhhgtg6.m4873Ujhhgtgfeyxiexzf(2).m3125Ujhhgtgfeyxiexzf()) {
                                c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, 2);
                                c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = 530;
                            } else {
                                if (!c3366feyxiexzfUjhhgtg6.m4873Ujhhgtgfeyxiexzf(3).m3124Ujhhgtgfeyxiexzf()) {
                                    throw C0210Ujhhgtgfeyxiexzf.m1289Ujhhgtgfeyxiexzf();
                                }
                                c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, 3);
                                c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = 12819;
                            }
                            break;
                        case Opcodes.SWAP /* 95 */:
                            C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg7 = (C3366feyxiexzfUjhhgtg) ((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf).f7715Ujhhgtgfeyxiexzf;
                            if (!c3366feyxiexzfUjhhgtg7.m4873Ujhhgtgfeyxiexzf(0).m3124Ujhhgtgfeyxiexzf() || !c3366feyxiexzfUjhhgtg7.m4873Ujhhgtgfeyxiexzf(1).m3124Ujhhgtgfeyxiexzf()) {
                                throw C0210Ujhhgtgfeyxiexzf.m1289Ujhhgtgfeyxiexzf();
                            }
                            c0907feyxiexzfUjhhgtg.m3180Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, 2);
                            c0907feyxiexzfUjhhgtg.f6209Ujhhgtgfeyxiexzf = 18;
                            break;
                            break;
                        case Opcodes.IADD /* 96 */:
                            c0907feyxiexzfUjhhgtg.m3183Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, c1784feyxiexzfUjhhgtg, c1784feyxiexzfUjhhgtg);
                            break;
                        default:
                            switch (i) {
                                case Opcodes.I2L /* 133 */:
                                case Opcodes.I2F /* 134 */:
                                case Opcodes.I2D /* 135 */:
                                case Opcodes.I2B /* 145 */:
                                case Opcodes.I2C /* 146 */:
                                case Opcodes.I2S /* 147 */:
                                    c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf);
                                    break;
                                case Opcodes.L2I /* 136 */:
                                case 137:
                                case 138:
                                    c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5985Ujhhgtgfeyxiexzf);
                                    break;
                                case Opcodes.F2I /* 139 */:
                                case Opcodes.F2L /* 140 */:
                                case 141:
                                    c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5983Ujhhgtgfeyxiexzf);
                                    break;
                                case Opcodes.D2I /* 142 */:
                                case Opcodes.D2L /* 143 */:
                                case 144:
                                    c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5982Ujhhgtgfeyxiexzf);
                                    break;
                                case Opcodes.LCMP /* 148 */:
                                    C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf2 = (C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf;
                                    C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg3 = C1784feyxiexzfUjhhgtg.f5985Ujhhgtgfeyxiexzf;
                                    c0907feyxiexzfUjhhgtg.m3183Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf2, c1784feyxiexzfUjhhgtg3, c1784feyxiexzfUjhhgtg3);
                                    break;
                                case Opcodes.FCMPL /* 149 */:
                                case Opcodes.FCMPG /* 150 */:
                                    C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf3 = (C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf;
                                    C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg4 = C1784feyxiexzfUjhhgtg.f5983Ujhhgtgfeyxiexzf;
                                    c0907feyxiexzfUjhhgtg.m3183Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf3, c1784feyxiexzfUjhhgtg4, c1784feyxiexzfUjhhgtg4);
                                    break;
                                case Opcodes.DCMPL /* 151 */:
                                case Opcodes.DCMPG /* 152 */:
                                    C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf4 = (C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf;
                                    C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg5 = C1784feyxiexzfUjhhgtg.f5982Ujhhgtgfeyxiexzf;
                                    c0907feyxiexzfUjhhgtg.m3183Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf4, c1784feyxiexzfUjhhgtg5, c1784feyxiexzfUjhhgtg5);
                                    break;
                                default:
                                    mo3769Ujhhgtgfeyxiexzf(i, i2);
                                    throw null;
                            }
                            break;
                    }
                    break;
            }
        } else {
            c0907feyxiexzfUjhhgtg.m3182Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, C1784feyxiexzfUjhhgtg.f5995feyxiexzfUjhhgtg);
        }
        c0907feyxiexzfUjhhgtg.f6208Ujhhgtgfeyxiexzf = c1784feyxiexzfUjhhgtg;
        c0907feyxiexzfUjhhgtg.m2395Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) this.f11370Ujhhgtgfeyxiexzf, i2, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public String m5279Ujhhgtgfeyxiexzf() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f11368Ujhhgtgfeyxiexzf + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f11370Ujhhgtgfeyxiexzf)[i2];
            if (obj instanceof InterfaceC1121feyxiexzfUjhhgtg) {
                InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg = (InterfaceC1121feyxiexzfUjhhgtg) obj;
                if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf(), C1189feyxiexzfUjhhgtg.f4475Ujhhgtgfeyxiexzf)) {
                    int i3 = ((int[]) this.f11371Ujhhgtgfeyxiexzf)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC1121feyxiexzfUjhhgtg.mo1121Ujhhgtgfeyxiexzf(i3));
                    }
                } else if (((int[]) this.f11371Ujhhgtgfeyxiexzf)[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f11371Ujhhgtgfeyxiexzf)[i2]);
                    sb.append("]");
                }
            } else if (obj == C3382feyxiexzfUjhhgtg.f10562Ujhhgtgfeyxiexzf) {
                sb.append("[<debug info disabled>]");
            } else if (obj != C3382feyxiexzfUjhhgtg.f10563Ujhhgtgfeyxiexzf) {
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public AbstractC3638Ujhhgtgfeyxiexzf m5280Ujhhgtgfeyxiexzf(BitSet bitSet, int i) {
        AbstractC3638Ujhhgtgfeyxiexzf c3151Ujhhgtgfeyxiexzf;
        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638UjhhgtgfeyxiexzfM5280Ujhhgtgfeyxiexzf;
        int i2;
        boolean z;
        int i3;
        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf;
        C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = (C2610Ujhhgtgfeyxiexzf) this.f11369Ujhhgtgfeyxiexzf;
        C1132feyxiexzfUjhhgtg c1132feyxiexzfUjhhgtg = (C1132feyxiexzfUjhhgtg) this.f11370Ujhhgtgfeyxiexzf;
        c1132feyxiexzfUjhhgtg.getClass();
        AbstractC3638Ujhhgtgfeyxiexzf[] abstractC3638UjhhgtgfeyxiexzfArr = c1132feyxiexzfUjhhgtg.f4283Ujhhgtgfeyxiexzf;
        try {
            AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf2 = abstractC3638UjhhgtgfeyxiexzfArr[i];
            if (abstractC3638Ujhhgtgfeyxiexzf2 != null) {
                return abstractC3638Ujhhgtgfeyxiexzf2;
            }
            int i4 = ((int[]) this.f11371Ujhhgtgfeyxiexzf)[i];
            try {
                int iM3904Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i4);
                switch (iM3904Ujhhgtgfeyxiexzf) {
                    case 1:
                        C3056Ujhhgtgfeyxiexzf c3056UjhhgtgfeyxiexzfM5282Ujhhgtgfeyxiexzf = m5282Ujhhgtgfeyxiexzf(i4);
                        bitSet.set(i);
                        abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf = c3056UjhhgtgfeyxiexzfM5282Ujhhgtgfeyxiexzf;
                        c1132feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf == null && abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf.mo4536Ujhhgtgfeyxiexzf()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC3638UjhhgtgfeyxiexzfArr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC3638UjhhgtgfeyxiexzfArr[i + 1] = null;
                        }
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf != null && abstractC3638UjhhgtgfeyxiexzfArr[i] == null && (abstractC3638Ujhhgtgfeyxiexzf = abstractC3638UjhhgtgfeyxiexzfArr[(i3 = i - 1)]) != null && abstractC3638Ujhhgtgfeyxiexzf.mo4536Ujhhgtgfeyxiexzf()) {
                            abstractC3638UjhhgtgfeyxiexzfArr[i3] = null;
                        }
                        abstractC3638UjhhgtgfeyxiexzfArr[i] = abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                        return abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                    case 2:
                    case 13:
                    case Opcodes.DCONST_0 /* 14 */:
                    case Opcodes.SIPUSH /* 17 */:
                    default:
                        throw new C1404feyxiexzfUjhhgtg("unknown tag byte: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2808Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf)), null);
                    case 3:
                        abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf = C3144Ujhhgtgfeyxiexzf.m4660Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3901Ujhhgtgfeyxiexzf(i4 + 1));
                        c1132feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC3638UjhhgtgfeyxiexzfArr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC3638UjhhgtgfeyxiexzfArr[i + 1] = null;
                        }
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf != null) {
                            abstractC3638UjhhgtgfeyxiexzfArr[i3] = null;
                        }
                        abstractC3638UjhhgtgfeyxiexzfArr[i] = abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                        return abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                    case 4:
                        abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf = new C3141Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3901Ujhhgtgfeyxiexzf(i4 + 1));
                        c1132feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC3638UjhhgtgfeyxiexzfArr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC3638UjhhgtgfeyxiexzfArr[i + 1] = null;
                        }
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf != null) {
                            abstractC3638UjhhgtgfeyxiexzfArr[i3] = null;
                        }
                        abstractC3638UjhhgtgfeyxiexzfArr[i] = abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                        return abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                    case 5:
                        c3151Ujhhgtgfeyxiexzf = new C3151Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3902Ujhhgtgfeyxiexzf(i4 + 1));
                        abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf = c3151Ujhhgtgfeyxiexzf;
                        c1132feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC3638UjhhgtgfeyxiexzfArr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC3638UjhhgtgfeyxiexzfArr[i + 1] = null;
                        }
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf != null) {
                            abstractC3638UjhhgtgfeyxiexzfArr[i3] = null;
                        }
                        abstractC3638UjhhgtgfeyxiexzfArr[i] = abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                        return abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                    case 6:
                        c3151Ujhhgtgfeyxiexzf = new C3138Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3902Ujhhgtgfeyxiexzf(i4 + 1));
                        abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf = c3151Ujhhgtgfeyxiexzf;
                        c1132feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC3638UjhhgtgfeyxiexzfArr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC3638UjhhgtgfeyxiexzfArr[i + 1] = null;
                        }
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf != null) {
                            abstractC3638UjhhgtgfeyxiexzfArr[i3] = null;
                        }
                        abstractC3638UjhhgtgfeyxiexzfArr[i] = abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                        return abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                    case 7:
                        abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf = new C3057Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg.m3115Ujhhgtgfeyxiexzf(((C3056Ujhhgtgfeyxiexzf) m5280Ujhhgtgfeyxiexzf(bitSet, c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i4 + 1))).f9450Ujhhgtgfeyxiexzf));
                        c1132feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC3638UjhhgtgfeyxiexzfArr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC3638UjhhgtgfeyxiexzfArr[i + 1] = null;
                        }
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf != null) {
                            abstractC3638UjhhgtgfeyxiexzfArr[i3] = null;
                        }
                        abstractC3638UjhhgtgfeyxiexzfArr[i] = abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                        return abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                    case 8:
                        abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf = m5280Ujhhgtgfeyxiexzf(bitSet, c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i4 + 1));
                        c1132feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC3638UjhhgtgfeyxiexzfArr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC3638UjhhgtgfeyxiexzfArr[i + 1] = null;
                        }
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf != null) {
                            abstractC3638UjhhgtgfeyxiexzfArr[i3] = null;
                        }
                        abstractC3638UjhhgtgfeyxiexzfArr[i] = abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                        return abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                    case 9:
                        abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf = new C3140Ujhhgtgfeyxiexzf((C3057Ujhhgtgfeyxiexzf) m5280Ujhhgtgfeyxiexzf(bitSet, c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i4 + 1)), (C3155Ujhhgtgfeyxiexzf) m5280Ujhhgtgfeyxiexzf(bitSet, c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i4 + 3)));
                        c1132feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC3638UjhhgtgfeyxiexzfArr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC3638UjhhgtgfeyxiexzfArr[i + 1] = null;
                        }
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf != null) {
                            abstractC3638UjhhgtgfeyxiexzfArr[i3] = null;
                        }
                        abstractC3638UjhhgtgfeyxiexzfArr[i] = abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                        return abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                    case 10:
                        abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf = new C3154Ujhhgtgfeyxiexzf((C3057Ujhhgtgfeyxiexzf) m5280Ujhhgtgfeyxiexzf(bitSet, c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i4 + 1)), (C3155Ujhhgtgfeyxiexzf) m5280Ujhhgtgfeyxiexzf(bitSet, c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i4 + 3)));
                        c1132feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC3638UjhhgtgfeyxiexzfArr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC3638UjhhgtgfeyxiexzfArr[i + 1] = null;
                        }
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf != null) {
                            abstractC3638UjhhgtgfeyxiexzfArr[i3] = null;
                        }
                        abstractC3638UjhhgtgfeyxiexzfArr[i] = abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                        return abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                    case 11:
                        C3145Ujhhgtgfeyxiexzf c3145Ujhhgtgfeyxiexzf = new C3145Ujhhgtgfeyxiexzf((C3057Ujhhgtgfeyxiexzf) m5280Ujhhgtgfeyxiexzf(bitSet, c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i4 + 1)), (C3155Ujhhgtgfeyxiexzf) m5280Ujhhgtgfeyxiexzf(bitSet, c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i4 + 3)));
                        c3145Ujhhgtgfeyxiexzf.f9748Ujhhgtgfeyxiexzf = null;
                        abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf = c3145Ujhhgtgfeyxiexzf;
                        c1132feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC3638UjhhgtgfeyxiexzfArr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC3638UjhhgtgfeyxiexzfArr[i + 1] = null;
                        }
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf != null) {
                            abstractC3638UjhhgtgfeyxiexzfArr[i3] = null;
                        }
                        abstractC3638UjhhgtgfeyxiexzfArr[i] = abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                        return abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                    case Opcodes.FCONST_1 /* 12 */:
                        abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf = new C3155Ujhhgtgfeyxiexzf((C3056Ujhhgtgfeyxiexzf) m5280Ujhhgtgfeyxiexzf(bitSet, c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i4 + 1)), (C3056Ujhhgtgfeyxiexzf) m5280Ujhhgtgfeyxiexzf(bitSet, c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i4 + 3)));
                        c1132feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC3638UjhhgtgfeyxiexzfArr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC3638UjhhgtgfeyxiexzfArr[i + 1] = null;
                        }
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf != null) {
                            abstractC3638UjhhgtgfeyxiexzfArr[i3] = null;
                        }
                        abstractC3638UjhhgtgfeyxiexzfArr[i] = abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                        return abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                    case 15:
                        int iM3904Ujhhgtgfeyxiexzf2 = c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(i4 + 1);
                        int iM3906Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i4 + 2);
                        switch (iM3904Ujhhgtgfeyxiexzf2) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                abstractC3638UjhhgtgfeyxiexzfM5280Ujhhgtgfeyxiexzf = (C3140Ujhhgtgfeyxiexzf) m5280Ujhhgtgfeyxiexzf(bitSet, iM3906Ujhhgtgfeyxiexzf);
                                break;
                            case 5:
                            case 8:
                                abstractC3638UjhhgtgfeyxiexzfM5280Ujhhgtgfeyxiexzf = (C3154Ujhhgtgfeyxiexzf) m5280Ujhhgtgfeyxiexzf(bitSet, iM3906Ujhhgtgfeyxiexzf);
                                break;
                            case 6:
                            case 7:
                                abstractC3638UjhhgtgfeyxiexzfM5280Ujhhgtgfeyxiexzf = m5280Ujhhgtgfeyxiexzf(bitSet, iM3906Ujhhgtgfeyxiexzf);
                                if (!(abstractC3638UjhhgtgfeyxiexzfM5280Ujhhgtgfeyxiexzf instanceof C3154Ujhhgtgfeyxiexzf) && !(abstractC3638UjhhgtgfeyxiexzfM5280Ujhhgtgfeyxiexzf instanceof C3145Ujhhgtgfeyxiexzf)) {
                                    throw new C1404feyxiexzfUjhhgtg("Unsupported ref constant type for MethodHandle " + abstractC3638UjhhgtgfeyxiexzfM5280Ujhhgtgfeyxiexzf.getClass(), null);
                                }
                                break;
                            case 9:
                                abstractC3638UjhhgtgfeyxiexzfM5280Ujhhgtgfeyxiexzf = (C3145Ujhhgtgfeyxiexzf) m5280Ujhhgtgfeyxiexzf(bitSet, iM3906Ujhhgtgfeyxiexzf);
                                break;
                            default:
                                throw new C1404feyxiexzfUjhhgtg("Unsupported MethodHandle kind: " + iM3904Ujhhgtgfeyxiexzf2, null);
                        }
                        switch (iM3904Ujhhgtgfeyxiexzf2) {
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
                                throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf2, "invalid kind: "));
                        }
                        abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf = C3153Ujhhgtgfeyxiexzf.m4667Ujhhgtgfeyxiexzf(i2, abstractC3638UjhhgtgfeyxiexzfM5280Ujhhgtgfeyxiexzf);
                        c1132feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC3638UjhhgtgfeyxiexzfArr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC3638UjhhgtgfeyxiexzfArr[i + 1] = null;
                        }
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf != null) {
                            abstractC3638UjhhgtgfeyxiexzfArr[i3] = null;
                        }
                        abstractC3638UjhhgtgfeyxiexzfArr[i] = abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                        return abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                    case 16:
                        abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf = new C3156Ujhhgtgfeyxiexzf(C0870feyxiexzfUjhhgtg.m2299Ujhhgtgfeyxiexzf(((C3056Ujhhgtgfeyxiexzf) m5280Ujhhgtgfeyxiexzf(bitSet, c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i4 + 1))).f9450Ujhhgtgfeyxiexzf));
                        c1132feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC3638UjhhgtgfeyxiexzfArr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC3638UjhhgtgfeyxiexzfArr[i + 1] = null;
                        }
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf != null) {
                            abstractC3638UjhhgtgfeyxiexzfArr[i3] = null;
                        }
                        abstractC3638UjhhgtgfeyxiexzfArr[i] = abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                        return abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                    case Opcodes.LDC /* 18 */:
                        abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf = new C3146Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i4 + 1), (C3155Ujhhgtgfeyxiexzf) m5280Ujhhgtgfeyxiexzf(bitSet, c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i4 + 3)));
                        c1132feyxiexzfUjhhgtg.m1729Ujhhgtgfeyxiexzf();
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (i >= 1) {
                            throw new IllegalArgumentException("n < 1");
                        }
                        if (z) {
                            if (i != abstractC3638UjhhgtgfeyxiexzfArr.length - 1) {
                                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                            }
                            abstractC3638UjhhgtgfeyxiexzfArr[i + 1] = null;
                        }
                        if (abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf != null) {
                            abstractC3638UjhhgtgfeyxiexzfArr[i3] = null;
                        }
                        abstractC3638UjhhgtgfeyxiexzfArr[i] = abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                        return abstractC3638UjhhgtgfeyxiexzfM4660Ujhhgtgfeyxiexzf;
                }
            } catch (C1404feyxiexzfUjhhgtg e) {
                e.m4861Ujhhgtgfeyxiexzf("...while parsing cst " + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i) + " at offset " + AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i4));
                throw e;
            } catch (RuntimeException e2) {
                C1404feyxiexzfUjhhgtg c1404feyxiexzfUjhhgtg = new C1404feyxiexzfUjhhgtg(null, e2);
                c1404feyxiexzfUjhhgtg.m4861Ujhhgtgfeyxiexzf("...while parsing cst " + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i) + " at offset " + AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i4));
                throw c1404feyxiexzfUjhhgtg;
            }
        } catch (IndexOutOfBoundsException unused) {
            throw new C3355feyxiexzfUjhhgtg("invalid constant pool index ".concat(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i)), null);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m5281Ujhhgtgfeyxiexzf() {
        int i;
        if (this.f11368Ujhhgtgfeyxiexzf < 0) {
            int[] iArr = (int[]) this.f11371Ujhhgtgfeyxiexzf;
            C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = (C2610Ujhhgtgfeyxiexzf) this.f11369Ujhhgtgfeyxiexzf;
            int iM3906Ujhhgtgfeyxiexzf = 10;
            int i2 = 1;
            while (i2 < iArr.length) {
                iArr[i2] = iM3906Ujhhgtgfeyxiexzf;
                int iM3904Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3904Ujhhgtgfeyxiexzf(iM3906Ujhhgtgfeyxiexzf);
                switch (iM3904Ujhhgtgfeyxiexzf) {
                    case 1:
                        iM3906Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(iM3906Ujhhgtgfeyxiexzf + 1) + 3 + iM3906Ujhhgtgfeyxiexzf;
                        break;
                    case 2:
                    case 13:
                    case Opcodes.DCONST_0 /* 14 */:
                    case Opcodes.SIPUSH /* 17 */:
                    default:
                        throw new C1404feyxiexzfUjhhgtg("unknown tag byte: " + AbstractC1264feyxiexzfUjhhgtg.m2808Ujhhgtgfeyxiexzf(iM3904Ujhhgtgfeyxiexzf), null);
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case Opcodes.FCONST_1 /* 12 */:
                    case Opcodes.LDC /* 18 */:
                        try {
                            iM3906Ujhhgtgfeyxiexzf += 5;
                        } catch (C1404feyxiexzfUjhhgtg e) {
                            e.m4861Ujhhgtgfeyxiexzf("...while preparsing cst " + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i2) + " at offset " + AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM3906Ujhhgtgfeyxiexzf));
                            throw e;
                        }
                        break;
                    case 5:
                    case 6:
                        iM3906Ujhhgtgfeyxiexzf += 9;
                        i = 2;
                        continue;
                        i2 += i;
                        break;
                    case 7:
                    case 8:
                    case 16:
                        iM3906Ujhhgtgfeyxiexzf += 3;
                        break;
                    case 15:
                        iM3906Ujhhgtgfeyxiexzf += 4;
                        break;
                }
                i = 1;
                i2 += i;
            }
            this.f11368Ujhhgtgfeyxiexzf = iM3906Ujhhgtgfeyxiexzf;
            BitSet bitSet = new BitSet(iArr.length);
            for (int i3 = 1; i3 < iArr.length; i3++) {
                if (iArr[i3] != 0) {
                    C1132feyxiexzfUjhhgtg c1132feyxiexzfUjhhgtg = (C1132feyxiexzfUjhhgtg) this.f11370Ujhhgtgfeyxiexzf;
                    c1132feyxiexzfUjhhgtg.getClass();
                    try {
                        if (c1132feyxiexzfUjhhgtg.f4283Ujhhgtgfeyxiexzf[i3] == null) {
                            m5280Ujhhgtgfeyxiexzf(bitSet, i3);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                        throw new C3355feyxiexzfUjhhgtg("invalid constant pool index ".concat(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i3)), null);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public C3056Ujhhgtgfeyxiexzf m5282Ujhhgtgfeyxiexzf(int i) {
        C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = (C2610Ujhhgtgfeyxiexzf) this.f11369Ujhhgtgfeyxiexzf;
        int iM3906Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(i + 1);
        int i2 = i + 3;
        try {
            return new C3056Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.m3914Ujhhgtgfeyxiexzf(i2, iM3906Ujhhgtgfeyxiexzf + i2));
        } catch (IllegalArgumentException e) {
            throw new C1404feyxiexzfUjhhgtg(null, e);
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public void m5283Ujhhgtgfeyxiexzf() {
        int i;
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) this.f11370Ujhhgtgfeyxiexzf;
        C3082Ujhhgtgfeyxiexzf c3082Ujhhgtgfeyxiexzf = (C3082Ujhhgtgfeyxiexzf) this.f11371Ujhhgtgfeyxiexzf;
        int i2 = c3082Ujhhgtgfeyxiexzf.f9530feyxiexzfUjhhgtg;
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) this.f11369Ujhhgtgfeyxiexzf;
        if (dialogXBaseRelativeLayout == null || c3082Ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf() == null) {
            return;
        }
        AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
        maxRelativeLayout.getClass();
        int i3 = c3082Ujhhgtgfeyxiexzf.f1001Ujhhgtgfeyxiexzf;
        int i4 = 0;
        if (i3 == 0) {
            i3 = 0;
        }
        if (i3 > 0) {
            maxRelativeLayout.f1037Ujhhgtgfeyxiexzf = i3;
        }
        maxRelativeLayout.setMinimumWidth(0);
        maxRelativeLayout.setMinimumHeight(0);
        dialogXBaseRelativeLayout.f1014Ujhhgtgfeyxiexzf = c3082Ujhhgtgfeyxiexzf.f993Ujhhgtgfeyxiexzf;
        int[] iArr = c3082Ujhhgtgfeyxiexzf.f1002Ujhhgtgfeyxiexzf;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int[] iArr2 = dialogXBaseRelativeLayout.f1029Ujhhgtgfeyxiexzf;
        iArr2[0] = i5;
        iArr2[1] = i6;
        iArr2[2] = i7;
        iArr2[3] = i8;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) maxRelativeLayout.getLayoutParams();
        if (layoutParams == null || ((i = this.f11368Ujhhgtgfeyxiexzf) != 0 && i != i2)) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        switch (AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i2)) {
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
        this.f11368Ujhhgtgfeyxiexzf = i2;
        maxRelativeLayout.setLayoutParams(layoutParams);
        if (!c3082Ujhhgtgfeyxiexzf.f9532feyxiexzfUjhhgtg) {
            dialogXBaseRelativeLayout.setClickable(false);
        } else if (c3082Ujhhgtgfeyxiexzf.f995Ujhhgtgfeyxiexzf) {
            dialogXBaseRelativeLayout.setOnClickListener(new ViewOnClickListenerC3079Ujhhgtgfeyxiexzf(i4, this));
        } else {
            dialogXBaseRelativeLayout.setOnClickListener(null);
        }
        AbstractC0171Ujhhgtgfeyxiexzf abstractC0171Ujhhgtgfeyxiexzf = c3082Ujhhgtgfeyxiexzf.f9525feyxiexzfUjhhgtg;
        if (abstractC0171Ujhhgtgfeyxiexzf != null && abstractC0171Ujhhgtgfeyxiexzf.m1228Ujhhgtgfeyxiexzf() != null) {
            c3082Ujhhgtgfeyxiexzf.f9525feyxiexzfUjhhgtg.m1224Ujhhgtgfeyxiexzf(maxRelativeLayout, c3082Ujhhgtgfeyxiexzf.f9526feyxiexzfUjhhgtg);
        }
        int i9 = c3082Ujhhgtgfeyxiexzf.f9534feyxiexzfUjhhgtg;
        if (i9 != -1) {
            if (i9 > 0) {
                maxRelativeLayout.f1036Ujhhgtgfeyxiexzf = i9;
            }
            maxRelativeLayout.setMinimumWidth(i9);
        }
        int i10 = c3082Ujhhgtgfeyxiexzf.f9535feyxiexzfUjhhgtg;
        if (i10 != -1) {
            if (i10 > 0) {
                maxRelativeLayout.f1037Ujhhgtgfeyxiexzf = i10;
            }
            maxRelativeLayout.setMinimumHeight(i10);
        }
        dialogXBaseRelativeLayout.setBackgroundColor(c3082Ujhhgtgfeyxiexzf.f9531feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public void m5284Ujhhgtgfeyxiexzf() {
        int i = this.f11368Ujhhgtgfeyxiexzf * 2;
        this.f11370Ujhhgtgfeyxiexzf = Arrays.copyOf((Object[]) this.f11370Ujhhgtgfeyxiexzf, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        AbstractC2391Ujhhgtgfeyxiexzf.m3645feyxiexzfUjhhgtg(0, 14, (int[]) this.f11371Ujhhgtgfeyxiexzf, iArr);
        this.f11371Ujhhgtgfeyxiexzf = iArr;
    }

    public C3639Ujhhgtgfeyxiexzf(C2492feyxiexzfUjhhgtg c2492feyxiexzfUjhhgtg, int i) {
        this.f11367Ujhhgtgfeyxiexzf = 4;
        if (i >= 0) {
            this.f11369Ujhhgtgfeyxiexzf = c2492feyxiexzfUjhhgtg;
            this.f11368Ujhhgtgfeyxiexzf = i;
            this.f11370Ujhhgtgfeyxiexzf = null;
            this.f11371Ujhhgtgfeyxiexzf = null;
            return;
        }
        throw new IllegalArgumentException("firstLabel < 0");
    }

    public C3639Ujhhgtgfeyxiexzf(C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf) {
        this.f11367Ujhhgtgfeyxiexzf = 0;
        int iM3906Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3906Ujhhgtgfeyxiexzf(8);
        this.f11369Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf;
        this.f11370Ujhhgtgfeyxiexzf = new C1132feyxiexzfUjhhgtg(iM3906Ujhhgtgfeyxiexzf);
        this.f11371Ujhhgtgfeyxiexzf = new int[iM3906Ujhhgtgfeyxiexzf];
        this.f11368Ujhhgtgfeyxiexzf = -1;
    }

    public C3639Ujhhgtgfeyxiexzf(C3082Ujhhgtgfeyxiexzf c3082Ujhhgtgfeyxiexzf, View view) {
        this.f11367Ujhhgtgfeyxiexzf = 1;
        this.f11371Ujhhgtgfeyxiexzf = c3082Ujhhgtgfeyxiexzf;
        if (view == null) {
            return;
        }
        c3082Ujhhgtgfeyxiexzf.f989Ujhhgtgfeyxiexzf = new WeakReference(view);
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) view.findViewById(R.id.box_root);
        this.f11369Ujhhgtgfeyxiexzf = dialogXBaseRelativeLayout;
        this.f11370Ujhhgtgfeyxiexzf = (MaxRelativeLayout) view.findViewById(R.id.box_custom);
        c3082Ujhhgtgfeyxiexzf.m898Ujhhgtgfeyxiexzf().setTranslationZ(0);
        dialogXBaseRelativeLayout.m909Ujhhgtgfeyxiexzf(c3082Ujhhgtgfeyxiexzf.f9526feyxiexzfUjhhgtg);
        dialogXBaseRelativeLayout.f1017Ujhhgtgfeyxiexzf = new C3052Ujhhgtgfeyxiexzf(0, this);
        dialogXBaseRelativeLayout.f1018Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(12, this);
        dialogXBaseRelativeLayout.post(new RunnableC3051Ujhhgtgfeyxiexzf(this, 0));
        c3082Ujhhgtgfeyxiexzf.f9527feyxiexzfUjhhgtg = this;
        m5283Ujhhgtgfeyxiexzf();
    }

    public C3639Ujhhgtgfeyxiexzf(C0906feyxiexzfUjhhgtg c0906feyxiexzfUjhhgtg, int i) {
        this.f11367Ujhhgtgfeyxiexzf = 5;
        this.f11371Ujhhgtgfeyxiexzf = c0906feyxiexzfUjhhgtg;
        this.f11368Ujhhgtgfeyxiexzf = i;
        int i2 = c0906feyxiexzfUjhhgtg.f3482Ujhhgtgfeyxiexzf;
        this.f11370Ujhhgtgfeyxiexzf = new BitSet(i2);
        this.f11369Ujhhgtgfeyxiexzf = new BitSet(i2);
        c0906feyxiexzfUjhhgtg.f3491Ujhhgtgfeyxiexzf = true;
    }

    public C3639Ujhhgtgfeyxiexzf(C0210Ujhhgtgfeyxiexzf c0210Ujhhgtgfeyxiexzf) {
        this.f11367Ujhhgtgfeyxiexzf = 6;
        this.f11371Ujhhgtgfeyxiexzf = c0210Ujhhgtgfeyxiexzf;
        this.f11369Ujhhgtgfeyxiexzf = (C0907feyxiexzfUjhhgtg) c0210Ujhhgtgfeyxiexzf.f1470Ujhhgtgfeyxiexzf;
        this.f11370Ujhhgtgfeyxiexzf = null;
    }

    public C3639Ujhhgtgfeyxiexzf(int i) {
        this.f11367Ujhhgtgfeyxiexzf = 3;
        this.f11369Ujhhgtgfeyxiexzf = new ArrayList(i);
        this.f11368Ujhhgtgfeyxiexzf = 0;
        this.f11370Ujhhgtgfeyxiexzf = null;
        this.f11371Ujhhgtgfeyxiexzf = null;
    }
}
