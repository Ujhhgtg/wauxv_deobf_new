package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲ要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2667feyxiexzfUjhhgtg implements InterfaceC2304feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f8533Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f8534Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2667feyxiexzfUjhhgtg(Object obj, boolean z) {
        this.f8534Ujhhgtgfeyxiexzf = obj;
        this.f8533Ujhhgtgfeyxiexzf = z;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    @Override // p000.InterfaceC2304feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public C2256feyxiexzfUjhhgtg mo3509Ujhhgtgfeyxiexzf(View view, C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg, C3490feyxiexzfUjhhgtg c3490feyxiexzfUjhhgtg) {
        boolean z;
        C2252Ujhhgtgfeyxiexzf c2252Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg.f7334Ujhhgtgfeyxiexzf;
        C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf = c2252Ujhhgtgfeyxiexzf.mo3422Ujhhgtgfeyxiexzf(519);
        C0688Ujhhgtgfeyxiexzf c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf2 = c2252Ujhhgtgfeyxiexzf.mo3422Ujhhgtgfeyxiexzf(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f8534Ujhhgtgfeyxiexzf;
        int i = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf.f2819Ujhhgtgfeyxiexzf;
        int i2 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf.f2820Ujhhgtgfeyxiexzf;
        int i3 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf.f2818Ujhhgtgfeyxiexzf;
        bottomSheetBehavior.f660Ujhhgtgfeyxiexzf = i;
        boolean zM3282Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3282Ujhhgtgfeyxiexzf(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z2 = bottomSheetBehavior.f652Ujhhgtgfeyxiexzf;
        if (z2) {
            int iM3451Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg.m3451Ujhhgtgfeyxiexzf();
            bottomSheetBehavior.f659Ujhhgtgfeyxiexzf = iM3451Ujhhgtgfeyxiexzf;
            paddingBottom = iM3451Ujhhgtgfeyxiexzf + c3490feyxiexzfUjhhgtg.f10837Ujhhgtgfeyxiexzf;
        }
        if (bottomSheetBehavior.f653Ujhhgtgfeyxiexzf) {
            paddingLeft = (zM3282Ujhhgtgfeyxiexzf ? c3490feyxiexzfUjhhgtg.f10836Ujhhgtgfeyxiexzf : c3490feyxiexzfUjhhgtg.f10834Ujhhgtgfeyxiexzf) + i3;
        }
        if (bottomSheetBehavior.f654Ujhhgtgfeyxiexzf) {
            paddingRight = (zM3282Ujhhgtgfeyxiexzf ? c3490feyxiexzfUjhhgtg.f10834Ujhhgtgfeyxiexzf : c3490feyxiexzfUjhhgtg.f10836Ujhhgtgfeyxiexzf) + i2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z3 = true;
        if (!bottomSheetBehavior.f656Ujhhgtgfeyxiexzf || marginLayoutParams.leftMargin == i3) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i3;
            z = true;
        }
        if (bottomSheetBehavior.f657Ujhhgtgfeyxiexzf && marginLayoutParams.rightMargin != i2) {
            marginLayoutParams.rightMargin = i2;
            z = true;
        }
        if (bottomSheetBehavior.f658Ujhhgtgfeyxiexzf) {
            int i4 = marginLayoutParams.topMargin;
            int i5 = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf.f2819Ujhhgtgfeyxiexzf;
            if (i4 != i5) {
                marginLayoutParams.topMargin = i5;
            } else {
                z3 = z;
            }
        } else {
            z3 = z;
        }
        if (z3) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z4 = this.f8533Ujhhgtgfeyxiexzf;
        if (z4) {
            bottomSheetBehavior.f650Ujhhgtgfeyxiexzf = c0688UjhhgtgfeyxiexzfMo3422Ujhhgtgfeyxiexzf2.f2821Ujhhgtgfeyxiexzf;
        }
        if (!z2 && !z4) {
            return c2256feyxiexzfUjhhgtg;
        }
        bottomSheetBehavior.m798feyxiexzfUjhhgtg();
        return c2256feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public boolean m4009Ujhhgtgfeyxiexzf() {
        return this.f8533Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void mo4010Ujhhgtgfeyxiexzf() {
        this.f8533Ujhhgtgfeyxiexzf = true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean m4011Ujhhgtgfeyxiexzf(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg = (C3382feyxiexzfUjhhgtg) this.f8534Ujhhgtgfeyxiexzf;
        if (c3382feyxiexzfUjhhgtg == null) {
            return m4009Ujhhgtgfeyxiexzf();
        }
        c3382feyxiexzfUjhhgtg.getClass();
        char c = 0;
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            C2667feyxiexzfUjhhgtg c2667feyxiexzfUjhhgtg = AbstractC1968Ujhhgtgfeyxiexzf.f6449Ujhhgtgfeyxiexzf;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case Opcodes.DCONST_0 /* 14 */:
                    case 15:
                        c = 1;
                        continue;
                    case 16:
                    case Opcodes.SIPUSH /* 17 */:
                        break;
                    default:
                        c = 2;
                        continue;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return m4009Ujhhgtgfeyxiexzf();
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public void mo4012Ujhhgtgfeyxiexzf() {
        this.f8533Ujhhgtgfeyxiexzf = false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public void mo4013Ujhhgtgfeyxiexzf() {
        this.f8533Ujhhgtgfeyxiexzf = false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public void mo4014Ujhhgtgfeyxiexzf(byte b) {
        ((C2501feyxiexzfUjhhgtg) this.f8534Ujhhgtgfeyxiexzf).m3787Ujhhgtgfeyxiexzf(String.valueOf(b));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public void m4015Ujhhgtgfeyxiexzf(char c) {
        C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg = (C2501feyxiexzfUjhhgtg) this.f8534Ujhhgtgfeyxiexzf;
        c2501feyxiexzfUjhhgtg.m3781Ujhhgtgfeyxiexzf(c2501feyxiexzfUjhhgtg.f8170Ujhhgtgfeyxiexzf, 1);
        char[] cArr = (char[]) c2501feyxiexzfUjhhgtg.f8171Ujhhgtgfeyxiexzf;
        int i = c2501feyxiexzfUjhhgtg.f8170Ujhhgtgfeyxiexzf;
        c2501feyxiexzfUjhhgtg.f8170Ujhhgtgfeyxiexzf = i + 1;
        cArr[i] = c;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void mo4016Ujhhgtgfeyxiexzf(int i) {
        ((C2501feyxiexzfUjhhgtg) this.f8534Ujhhgtgfeyxiexzf).m3787Ujhhgtgfeyxiexzf(String.valueOf(i));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void mo4017Ujhhgtgfeyxiexzf(long j) {
        ((C2501feyxiexzfUjhhgtg) this.f8534Ujhhgtgfeyxiexzf).m3787Ujhhgtgfeyxiexzf(String.valueOf(j));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public void m4018Ujhhgtgfeyxiexzf(String str) {
        ((C2501feyxiexzfUjhhgtg) this.f8534Ujhhgtgfeyxiexzf).m3787Ujhhgtgfeyxiexzf(str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void mo4019Ujhhgtgfeyxiexzf(short s) {
        ((C2501feyxiexzfUjhhgtg) this.f8534Ujhhgtgfeyxiexzf).m3787Ujhhgtgfeyxiexzf(String.valueOf(s));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public void mo4020Ujhhgtgfeyxiexzf(String str) {
        byte b;
        C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg = (C2501feyxiexzfUjhhgtg) this.f8534Ujhhgtgfeyxiexzf;
        c2501feyxiexzfUjhhgtg.m3781Ujhhgtgfeyxiexzf(c2501feyxiexzfUjhhgtg.f8170Ujhhgtgfeyxiexzf, str.length() + 2);
        char[] cArr = (char[]) c2501feyxiexzfUjhhgtg.f8171Ujhhgtgfeyxiexzf;
        int i = c2501feyxiexzfUjhhgtg.f8170Ujhhgtgfeyxiexzf;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = AbstractC1154feyxiexzfUjhhgtg.f4347Ujhhgtgfeyxiexzf;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    c2501feyxiexzfUjhhgtg.m3781Ujhhgtgfeyxiexzf(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = AbstractC1154feyxiexzfUjhhgtg.f4347Ujhhgtgfeyxiexzf;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) c2501feyxiexzfUjhhgtg.f8171Ujhhgtgfeyxiexzf)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = AbstractC1154feyxiexzfUjhhgtg.f4346Ujhhgtgfeyxiexzf[cCharAt];
                        c2501feyxiexzfUjhhgtg.m3781Ujhhgtgfeyxiexzf(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) c2501feyxiexzfUjhhgtg.f8171Ujhhgtgfeyxiexzf, i4);
                        int length3 = str2.length() + i4;
                        c2501feyxiexzfUjhhgtg.f8170Ujhhgtgfeyxiexzf = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) c2501feyxiexzfUjhhgtg.f8171Ujhhgtgfeyxiexzf;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        c2501feyxiexzfUjhhgtg.f8170Ujhhgtgfeyxiexzf = i4;
                    }
                }
                c2501feyxiexzfUjhhgtg.m3781Ujhhgtgfeyxiexzf(i4, 1);
                ((char[]) c2501feyxiexzfUjhhgtg.f8171Ujhhgtgfeyxiexzf)[i4] = '\"';
                c2501feyxiexzfUjhhgtg.f8170Ujhhgtgfeyxiexzf = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        c2501feyxiexzfUjhhgtg.f8170Ujhhgtgfeyxiexzf = i3 + 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public synchronized void m4021Ujhhgtgfeyxiexzf(InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg, boolean z) {
        try {
            if (this.f8533Ujhhgtgfeyxiexzf || z) {
                ((Handler) this.f8534Ujhhgtgfeyxiexzf).obtainMessage(1, interfaceC0901feyxiexzfUjhhgtg).sendToTarget();
            } else {
                this.f8533Ujhhgtgfeyxiexzf = true;
                interfaceC0901feyxiexzfUjhhgtg.mo1444Ujhhgtgfeyxiexzf();
                this.f8533Ujhhgtgfeyxiexzf = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C2667feyxiexzfUjhhgtg() {
        this.f8534Ujhhgtgfeyxiexzf = new Handler(Looper.getMainLooper(), new C2503feyxiexzfUjhhgtg(1));
    }

    public C2667feyxiexzfUjhhgtg(C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg) {
        this.f8534Ujhhgtgfeyxiexzf = c2501feyxiexzfUjhhgtg;
        this.f8533Ujhhgtgfeyxiexzf = true;
    }

    public C2667feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg, boolean z) {
        this.f8534Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg;
        this.f8533Ujhhgtgfeyxiexzf = z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void mo4022Ujhhgtgfeyxiexzf() {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void mo4023Ujhhgtgfeyxiexzf() {
    }
}
