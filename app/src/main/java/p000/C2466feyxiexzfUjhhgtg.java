package p000;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Arrays;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ要点脸ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2466feyxiexzfUjhhgtg implements InterfaceC2512feyxiexzfUjhhgtg, InterfaceC2304feyxiexzfUjhhgtg, InterfaceC0288Ujhhgtgfeyxiexzf, InterfaceC3330Ujhhgtgfeyxiexzf, InterfaceC3184feyxiexzfUjhhgtg, InterfaceC3217feyxiexzfUjhhgtg, InterfaceC0853feyxiexzfUjhhgtg, InterfaceC0401Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static C2466feyxiexzfUjhhgtg f7995Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7996Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2466feyxiexzfUjhhgtg(int i) {
        this.f7996Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static ByteArrayInputStream m3697Ujhhgtgfeyxiexzf(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3 A[RETURN] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static C2633Ujhhgtgfeyxiexzf m3698Ujhhgtgfeyxiexzf(String str) {
        int i;
        char cCharAt;
        byte[] bArr = AbstractC2917Ujhhgtgfeyxiexzf.f9201Ujhhgtgfeyxiexzf;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 >= length) {
                int i7 = i4 % 4;
                if (i7 != 1) {
                    if (i7 == 2) {
                        bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i7 == 3) {
                        int i8 = i5 << 6;
                        int i9 = i6 + 1;
                        bArrCopyOf[i6] = (byte) (i8 >> 16);
                        i6 += 2;
                        bArrCopyOf[i9] = (byte) (i8 >> 8);
                    }
                    if (i6 != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                    }
                }
                if (bArrCopyOf != null) {
                    return new C2633Ujhhgtgfeyxiexzf(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i3);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                        break;
                    }
                } else {
                    i = 63;
                }
                i3++;
            }
            i5 = (i5 << 6) | i;
            i4++;
            if (i4 % 4 == 0) {
                bArrCopyOf[i6] = (byte) (i5 >> 16);
                int i10 = i6 + 2;
                bArrCopyOf[i6 + 1] = (byte) (i5 >> 8);
                i6 += 3;
                bArrCopyOf[i10] = (byte) i5;
            }
            i3++;
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new C2633Ujhhgtgfeyxiexzf(bArrCopyOf);
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static C2633Ujhhgtgfeyxiexzf m3699Ujhhgtgfeyxiexzf(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (AbstractC2855feyxiexzfUjhhgtg.m4194Ujhhgtgfeyxiexzf(str.charAt(i2 + 1)) + (AbstractC2855feyxiexzfUjhhgtg.m4194Ujhhgtgfeyxiexzf(str.charAt(i2)) << 4));
        }
        return new C2633Ujhhgtgfeyxiexzf(bArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static C2633Ujhhgtgfeyxiexzf m3700Ujhhgtgfeyxiexzf(String str) {
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf = new C2633Ujhhgtgfeyxiexzf(str.getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf));
        c2633Ujhhgtgfeyxiexzf.f8469Ujhhgtgfeyxiexzf = str;
        return c2633Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean m3701Ujhhgtgfeyxiexzf(C3288Ujhhgtgfeyxiexzf c3288Ujhhgtgfeyxiexzf, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                C1777feyxiexzfUjhhgtg[] c1777feyxiexzfUjhhgtgArr = (C1777feyxiexzfUjhhgtg[]) editable.getSpans(selectionStart, iMin, C1777feyxiexzfUjhhgtg.class);
                if (c1777feyxiexzfUjhhgtgArr != null && c1777feyxiexzfUjhhgtgArr.length > 0) {
                    for (C1777feyxiexzfUjhhgtg c1777feyxiexzfUjhhgtg : c1777feyxiexzfUjhhgtgArr) {
                        int spanStart = editable.getSpanStart(c1777feyxiexzfUjhhgtg);
                        int spanEnd = editable.getSpanEnd(c1777feyxiexzfUjhhgtg);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    c3288Ujhhgtgfeyxiexzf.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    c3288Ujhhgtgfeyxiexzf.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C2633Ujhhgtgfeyxiexzf m3702feyxiexzfUjhhgtg(byte[] bArr) {
        int length = bArr.length;
        AbstractC3085Ujhhgtgfeyxiexzf.m4552Ujhhgtgfeyxiexzf(bArr.length, 0, length);
        return new C2633Ujhhgtgfeyxiexzf(AbstractC2391Ujhhgtgfeyxiexzf.m3648feyxiexzfUjhhgtg(0, length, bArr));
    }

    @Override // p000.InterfaceC2304feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public C2256feyxiexzfUjhhgtg mo3509Ujhhgtgfeyxiexzf(View view, C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg, C3490feyxiexzfUjhhgtg c3490feyxiexzfUjhhgtg) {
        C2252Ujhhgtgfeyxiexzf c2252Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg.f7334Ujhhgtgfeyxiexzf;
        c3490feyxiexzfUjhhgtg.f10837Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtg.m3451Ujhhgtgfeyxiexzf() + c3490feyxiexzfUjhhgtg.f10837Ujhhgtgfeyxiexzf;
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        boolean z = view.getLayoutDirection() == 1;
        int i = c2252Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf().f2818Ujhhgtgfeyxiexzf;
        int i2 = c2252Ujhhgtgfeyxiexzf.mo3436Ujhhgtgfeyxiexzf().f2820Ujhhgtgfeyxiexzf;
        int i3 = c3490feyxiexzfUjhhgtg.f10834Ujhhgtgfeyxiexzf + (z ? i2 : i);
        c3490feyxiexzfUjhhgtg.f10834Ujhhgtgfeyxiexzf = i3;
        int i4 = c3490feyxiexzfUjhhgtg.f10836Ujhhgtgfeyxiexzf;
        if (!z) {
            i = i2;
        }
        int i5 = i4 + i;
        c3490feyxiexzfUjhhgtg.f10836Ujhhgtgfeyxiexzf = i5;
        view.setPaddingRelative(i3, c3490feyxiexzfUjhhgtg.f10835Ujhhgtgfeyxiexzf, i5, c3490feyxiexzfUjhhgtg.f10837Ujhhgtgfeyxiexzf);
        return c2256feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC0401Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public Drawable mo1682Ujhhgtgfeyxiexzf(int i) {
        return null;
    }

    @Override // p000.InterfaceC2512feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public Bitmap mo1471Ujhhgtgfeyxiexzf(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC2512feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public void mo1472Ujhhgtgfeyxiexzf(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p000.InterfaceC0401Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public int mo1683Ujhhgtgfeyxiexzf() {
        return 0;
    }

    @Override // p000.InterfaceC0401Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public int mo1684Ujhhgtgfeyxiexzf() {
        return 0;
    }

    @Override // p000.InterfaceC0853feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public CharSequence mo2260Ujhhgtgfeyxiexzf(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f310Ujhhgtgfeyxiexzf.getString(R.string.not_set);
        }
        return null;
    }

    @Override // p000.InterfaceC0401Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public int mo1685Ujhhgtgfeyxiexzf() {
        return 0;
    }

    @Override // p000.InterfaceC3330Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public boolean mo2018Ujhhgtgfeyxiexzf(Object obj, File file, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) throws Throwable {
        try {
            AbstractC2648Ujhhgtgfeyxiexzf.m3981Ujhhgtgfeyxiexzf((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }

    @Override // p000.InterfaceC3184feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public File mo3704Ujhhgtgfeyxiexzf(InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf) {
        return null;
    }

    @Override // p000.InterfaceC2512feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public Bitmap mo1474Ujhhgtgfeyxiexzf(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0288Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public InterfaceC0285Ujhhgtgfeyxiexzf mo1497Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf) {
        switch (this.f7996Ujhhgtgfeyxiexzf) {
            case 7:
                return new C2616feyxiexzfUjhhgtg(0, new C2466feyxiexzfUjhhgtg(6));
            case 8:
            default:
                return new C1939Ujhhgtgfeyxiexzf(1);
            case 9:
                return new C2616feyxiexzfUjhhgtg(0, new C2466feyxiexzfUjhhgtg(8));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public Signature[] mo3707Ujhhgtgfeyxiexzf(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public void m3708feyxiexzfUjhhgtg(C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf, float f) {
        C0947feyxiexzfUjhhgtg c0947feyxiexzfUjhhgtg = (C0947feyxiexzfUjhhgtg) ((Drawable) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf);
        AbstractC2777Ujhhgtgfeyxiexzf abstractC2777Ujhhgtgfeyxiexzf = (AbstractC2777Ujhhgtgfeyxiexzf) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf;
        boolean useCompatPadding = abstractC2777Ujhhgtgfeyxiexzf.getUseCompatPadding();
        boolean preventCornerOverlap = abstractC2777Ujhhgtgfeyxiexzf.getPreventCornerOverlap();
        if (f != c0947feyxiexzfUjhhgtg.f3802Ujhhgtgfeyxiexzf || c0947feyxiexzfUjhhgtg.f3803Ujhhgtgfeyxiexzf != useCompatPadding || c0947feyxiexzfUjhhgtg.f3804Ujhhgtgfeyxiexzf != preventCornerOverlap) {
            c0947feyxiexzfUjhhgtg.f3802Ujhhgtgfeyxiexzf = f;
            c0947feyxiexzfUjhhgtg.f3803Ujhhgtgfeyxiexzf = useCompatPadding;
            c0947feyxiexzfUjhhgtg.f3804Ujhhgtgfeyxiexzf = preventCornerOverlap;
            c0947feyxiexzfUjhhgtg.m2438Ujhhgtgfeyxiexzf(null);
            c0947feyxiexzfUjhhgtg.invalidateSelf();
        }
        if (!abstractC2777Ujhhgtgfeyxiexzf.getUseCompatPadding()) {
            c2629Ujhhgtgfeyxiexzf.m3967feyxiexzfUjhhgtg(0, 0, 0, 0);
            return;
        }
        C0947feyxiexzfUjhhgtg c0947feyxiexzfUjhhgtg2 = (C0947feyxiexzfUjhhgtg) ((Drawable) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf);
        float f2 = c0947feyxiexzfUjhhgtg2.f3802Ujhhgtgfeyxiexzf;
        float f3 = c0947feyxiexzfUjhhgtg2.f3798Ujhhgtgfeyxiexzf;
        int iCeil = (int) Math.ceil(AbstractC0943feyxiexzfUjhhgtg.m2433Ujhhgtgfeyxiexzf(f2, f3, abstractC2777Ujhhgtgfeyxiexzf.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC0943feyxiexzfUjhhgtg.m2434Ujhhgtgfeyxiexzf(f2, f3, abstractC2777Ujhhgtgfeyxiexzf.getPreventCornerOverlap()));
        c2629Ujhhgtgfeyxiexzf.m3967feyxiexzfUjhhgtg(iCeil, iCeil2, iCeil, iCeil2);
    }

    public C2466feyxiexzfUjhhgtg(DialogInterfaceOnCancelListenerC3175feyxiexzfUjhhgtg dialogInterfaceOnCancelListenerC3175feyxiexzfUjhhgtg) {
        this.f7996Ujhhgtgfeyxiexzf = 19;
    }

    @Override // p000.InterfaceC3217feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public void mo3703Ujhhgtgfeyxiexzf() {
    }

    @Override // p000.InterfaceC2512feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public void mo1476Ujhhgtgfeyxiexzf() {
    }

    @Override // p000.InterfaceC2512feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public void mo1475Ujhhgtgfeyxiexzf(int i) {
    }

    @Override // p000.InterfaceC3217feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public void mo3705Ujhhgtgfeyxiexzf(InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg, Bitmap bitmap) {
    }

    @Override // p000.InterfaceC3184feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void mo3706Ujhhgtgfeyxiexzf(InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf, C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf) {
    }
}
