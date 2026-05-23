package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᲈᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0452 implements InterfaceC3594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f2021;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f2022;

    public /* synthetic */ C0452(Object obj, boolean z) {
        this.f2022 = obj;
        this.f2021 = z;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    @Override // p000.InterfaceC3594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public C3669 mo1501(View view, C3669 c3669, C1348 c1348) {
        boolean z;
        C3665 c3665 = c3669.f11452;
        C1646 c1646Mo5265 = c3665.mo5265(519);
        C1646 c1646Mo5266 = c3665.mo5265(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2022;
        int i = c1646Mo5265.f5581;
        int i2 = c1646Mo5265.f5582;
        int i3 = c1646Mo5265.f5580;
        bottomSheetBehavior.f594 = i;
        boolean zM3191 = AbstractC1459.m3191(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z2 = bottomSheetBehavior.f586;
        if (z2) {
            int iM5300 = c3669.m5300();
            bottomSheetBehavior.f593 = iM5300;
            paddingBottom = iM5300 + c1348.f4825;
        }
        if (bottomSheetBehavior.f587) {
            paddingLeft = (zM3191 ? c1348.f4824 : c1348.f4822) + i3;
        }
        if (bottomSheetBehavior.f588) {
            paddingRight = (zM3191 ? c1348.f4822 : c1348.f4824) + i2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z3 = true;
        if (!bottomSheetBehavior.f590 || marginLayoutParams.leftMargin == i3) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i3;
            z = true;
        }
        if (bottomSheetBehavior.f591 && marginLayoutParams.rightMargin != i2) {
            marginLayoutParams.rightMargin = i2;
            z = true;
        }
        if (bottomSheetBehavior.f592) {
            int i4 = marginLayoutParams.topMargin;
            int i5 = c1646Mo5265.f5581;
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
        boolean z4 = this.f2021;
        if (z4) {
            bottomSheetBehavior.f584 = c1646Mo5266.f5583;
        }
        if (!z2 && !z4) {
            return c3669;
        }
        bottomSheetBehavior.m656();
        return c3669;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean m1670() {
        return this.f2021;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean m1671(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        C1133 c1133 = (C1133) this.f2022;
        if (c1133 == null) {
            return m1670();
        }
        c1133.getClass();
        char c = 0;
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            C0452 c0452 = AbstractC2905.f9345;
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
            return m1670();
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void m1672() {
        this.f2021 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public void mo1673(byte b) {
        ((C0408) this.f2022).m1609(String.valueOf(b));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public void m1674(char c) {
        C0408 c0408 = (C0408) this.f2022;
        c0408.m1603(c0408.f1921, 1);
        char[] cArr = (char[]) c0408.f1922;
        int i = c0408.f1921;
        c0408.f1921 = i + 1;
        cArr[i] = c;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public void mo1675(int i) {
        ((C0408) this.f2022).m1609(String.valueOf(i));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public void mo1676(long j) {
        ((C0408) this.f2022).m1609(String.valueOf(j));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void m1677(String str) {
        ((C0408) this.f2022).m1609(str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void mo1678(short s) {
        ((C0408) this.f2022).m1609(String.valueOf(s));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void mo1679(String str) {
        byte b;
        C0408 c0408 = (C0408) this.f2022;
        c0408.m1603(c0408.f1921, str.length() + 2);
        char[] cArr = (char[]) c0408.f1922;
        int i = c0408.f1921;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = AbstractC2838.f9107;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    c0408.m1603(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = AbstractC2838.f9107;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) c0408.f1922)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = AbstractC2838.f9106[cCharAt];
                        c0408.m1603(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) c0408.f1922, i4);
                        int length3 = str2.length() + i4;
                        c0408.f1921 = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) c0408.f1922;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        c0408.f1921 = i4;
                    }
                }
                c0408.m1603(i4, 1);
                ((char[]) c0408.f1922)[i4] = '\"';
                c0408.f1921 = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        c0408.f1921 = i3 + 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public synchronized void m1680(InterfaceC2568 interfaceC2568, boolean z) {
        try {
            if (this.f2021 || z) {
                ((Handler) this.f2022).obtainMessage(1, interfaceC2568).sendToTarget();
            } else {
                this.f2021 = true;
                interfaceC2568.mo1206();
                this.f2021 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C0452() {
        this.f2022 = new Handler(Looper.getMainLooper(), new C0390(1));
    }

    public C0452(C0408 c0408) {
        this.f2022 = c0408;
        this.f2021 = true;
    }

    public C0452(C1133 c1133, boolean z) {
        this.f2022 = c1133;
        this.f2021 = z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public void m1681() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public void m1682() {
    }
}
