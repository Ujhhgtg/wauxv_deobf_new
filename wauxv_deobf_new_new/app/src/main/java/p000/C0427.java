package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᲇᤞᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0427 implements InterfaceC3654 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f1993;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f1994;

    public /* synthetic */ C0427(Object obj, boolean z) {
        this.f1994 = obj;
        this.f1993 = z;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    @Override // p000.InterfaceC3654
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public C3729 mo1606(View view, C3729 c3729, C1348 c1348) {
        boolean z;
        C3725 c3725 = c3729.f11601;
        C1660 c1660Mo5271 = c3725.mo5271(519);
        C1660 c1660Mo5272 = c3725.mo5271(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1994;
        int i = c1660Mo5271.f5616;
        int i2 = c1660Mo5271.f5617;
        int i3 = c1660Mo5271.f5615;
        bottomSheetBehavior.f646 = i;
        boolean zM3399 = AbstractC1471.m3399(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z2 = bottomSheetBehavior.f638;
        if (z2) {
            int iM5306 = c3729.m5306();
            bottomSheetBehavior.f645 = iM5306;
            paddingBottom = iM5306 + c1348.f4822;
        }
        if (bottomSheetBehavior.f639) {
            paddingLeft = (zM3399 ? c1348.f4821 : c1348.f4819) + i3;
        }
        if (bottomSheetBehavior.f640) {
            paddingRight = (zM3399 ? c1348.f4819 : c1348.f4821) + i2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z3 = true;
        if (!bottomSheetBehavior.f642 || marginLayoutParams.leftMargin == i3) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i3;
            z = true;
        }
        if (bottomSheetBehavior.f643 && marginLayoutParams.rightMargin != i2) {
            marginLayoutParams.rightMargin = i2;
            z = true;
        }
        if (bottomSheetBehavior.f644) {
            int i4 = marginLayoutParams.topMargin;
            int i5 = c1660Mo5271.f5616;
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
        boolean z4 = this.f1993;
        if (z4) {
            bottomSheetBehavior.f636 = c1660Mo5272.f5618;
        }
        if (!z2 && !z4) {
            return c3729;
        }
        bottomSheetBehavior.m799();
        return c3729;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean m1776() {
        return this.f1993;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void mo1777() {
        this.f1993 = true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean m1778(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        C1139 c1139 = (C1139) this.f1994;
        if (c1139 == null) {
            return m1776();
        }
        c1139.getClass();
        char c = 0;
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            C0427 c0427 = AbstractC2964.f9512;
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
            return m1776();
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public void mo1779() {
        this.f1993 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public void mo1780() {
        this.f1993 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public void mo1781(byte b) {
        ((C0383) this.f1994).m1715(String.valueOf(b));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public void m1782(char c) {
        C0383 c0383 = (C0383) this.f1994;
        c0383.m1709(c0383.f1893, 1);
        char[] cArr = (char[]) c0383.f1894;
        int i = c0383.f1893;
        c0383.f1893 = i + 1;
        cArr[i] = c;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void mo1783(int i) {
        ((C0383) this.f1994).m1715(String.valueOf(i));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void mo1784(long j) {
        ((C0383) this.f1994).m1715(String.valueOf(j));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void m1785(String str) {
        ((C0383) this.f1994).m1715(str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public void mo1786(short s) {
        ((C0383) this.f1994).m1715(String.valueOf(s));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public void mo1787(String str) {
        byte b;
        C0383 c0383 = (C0383) this.f1994;
        c0383.m1709(c0383.f1893, str.length() + 2);
        char[] cArr = (char[]) c0383.f1894;
        int i = c0383.f1893;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = AbstractC2898.f9269;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    c0383.m1709(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = AbstractC2898.f9269;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) c0383.f1894)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = AbstractC2898.f9268[cCharAt];
                        c0383.m1709(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) c0383.f1894, i4);
                        int length3 = str2.length() + i4;
                        c0383.f1893 = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) c0383.f1894;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        c0383.f1893 = i4;
                    }
                }
                c0383.m1709(i4, 1);
                ((char[]) c0383.f1894)[i4] = '\"';
                c0383.f1893 = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        c0383.f1893 = i3 + 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public synchronized void m1788(InterfaceC2624 interfaceC2624, boolean z) {
        try {
            if (this.f1993 || z) {
                ((Handler) this.f1994).obtainMessage(1, interfaceC2624).sendToTarget();
            } else {
                this.f1993 = true;
                interfaceC2624.mo1352();
                this.f1993 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C0427() {
        this.f1994 = new Handler(Looper.getMainLooper(), new C0365(1));
    }

    public C0427(C0383 c0383) {
        this.f1994 = c0383;
        this.f1993 = true;
    }

    public C0427(C1139 c1139, boolean z) {
        this.f1994 = c1139;
        this.f1993 = z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void mo1789() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public void mo1790() {
    }
}
