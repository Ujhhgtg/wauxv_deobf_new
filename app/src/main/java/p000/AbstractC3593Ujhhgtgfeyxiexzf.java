package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛳᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3593Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final int[] f11180Ujhhgtgfeyxiexzf = new int[0];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Object[] f11181Ujhhgtgfeyxiexzf = new Object[0];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C2366Ujhhgtgfeyxiexzf f11182Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static C2366Ujhhgtgfeyxiexzf f11183Ujhhgtgfeyxiexzf;

    static {
        Object obj = null;
        f11182Ujhhgtgfeyxiexzf = new C2366Ujhhgtgfeyxiexzf(obj, obj, obj, 18);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final int m5147Ujhhgtgfeyxiexzf(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final int m5148Ujhhgtgfeyxiexzf(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static void m5149Ujhhgtgfeyxiexzf(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m5150Ujhhgtgfeyxiexzf(Object obj) {
        m5151Ujhhgtgfeyxiexzf(obj, "Argument must not be null");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m5151Ujhhgtgfeyxiexzf(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static Drawable m5152Ujhhgtgfeyxiexzf(Drawable drawable, Drawable drawable2, int i, int i2) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static Drawable m5153Ujhhgtgfeyxiexzf(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
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

    /* JADX WARN: Code duplicated, block: B:49:0x0167  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m5154Ujhhgtgfeyxiexzf(SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf, int i) {
        int i2;
        MappedByteBuffer mappedByteBufferM4224Ujhhgtgfeyxiexzf;
        ArrayList arrayList = sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10951Ujhhgtgfeyxiexzf;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            C1089feyxiexzfUjhhgtg c1089feyxiexzfUjhhgtg = (C1089feyxiexzfUjhhgtg) arrayList.get(0);
            int size = arrayList.size();
            int i3 = 0;
            for (int i4 = 1; i4 < size; i4++) {
                C1089feyxiexzfUjhhgtg c1089feyxiexzfUjhhgtg2 = (C1089feyxiexzfUjhhgtg) arrayList.get(i4);
                if (c1089feyxiexzfUjhhgtg2.f4169Ujhhgtgfeyxiexzf == c1089feyxiexzfUjhhgtg.f4170Ujhhgtgfeyxiexzf) {
                    c1089feyxiexzfUjhhgtg.f4170Ujhhgtgfeyxiexzf = c1089feyxiexzfUjhhgtg2.f4170Ujhhgtgfeyxiexzf;
                } else {
                    i3++;
                    if (i3 != i4) {
                        arrayList.set(i3, c1089feyxiexzfUjhhgtg2);
                    }
                    c1089feyxiexzfUjhhgtg = c1089feyxiexzfUjhhgtg2;
                }
            }
            int i5 = i3 + 1;
            if (size > i5) {
                arrayList.subList(i5, size).clear();
            }
        }
        C1089feyxiexzfUjhhgtg c1089feyxiexzfUjhhgtg3 = (C1089feyxiexzfUjhhgtg) arrayList.get(0);
        int i6 = c1089feyxiexzfUjhhgtg3.f4169Ujhhgtgfeyxiexzf;
        int i7 = sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10940Ujhhgtgfeyxiexzf;
        int i8 = i7 - sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10950Ujhhgtgfeyxiexzf;
        int i9 = i8 - 12;
        int i10 = i8 - i6;
        int i11 = i7 - i6;
        boolean z = i9 < i11 + i10;
        if (!z) {
            sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10941Ujhhgtgfeyxiexzf ^= sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10944Ujhhgtgfeyxiexzf.m3538Ujhhgtgfeyxiexzf(i6, i11);
        }
        int size2 = arrayList.size();
        int i12 = size2 - 1;
        int i13 = sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10940Ujhhgtgfeyxiexzf - ((C1089feyxiexzfUjhhgtg) arrayList.get(i12)).f4170Ujhhgtgfeyxiexzf;
        int i14 = i13 > 0 ? size2 : i12;
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        int i15 = c1089feyxiexzfUjhhgtg3.f4169Ujhhgtgfeyxiexzf;
        int i16 = c1089feyxiexzfUjhhgtg3.f4170Ujhhgtgfeyxiexzf;
        int i17 = 1;
        while (i17 < size2) {
            ArrayList arrayList2 = arrayList;
            C1089feyxiexzfUjhhgtg c1089feyxiexzfUjhhgtg4 = (C1089feyxiexzfUjhhgtg) arrayList.get(i17);
            int i18 = i17;
            int i19 = c1089feyxiexzfUjhhgtg4.f4169Ujhhgtgfeyxiexzf - i16;
            int i20 = size2;
            byte[] bArr = (byte[]) sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10944Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf;
            System.arraycopy(bArr, i16, bArr, i15, i19);
            int i21 = i18 - 1;
            iArr[i21] = i16;
            iArr2[i21] = i16 - i15;
            i15 += i19;
            i16 = c1089feyxiexzfUjhhgtg4.f4170Ujhhgtgfeyxiexzf;
            i17 = i18 + 1;
            arrayList = arrayList2;
            size2 = i20;
        }
        ArrayList arrayList3 = arrayList;
        if (i13 > 0) {
            byte[] bArr2 = (byte[]) sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10944Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf;
            System.arraycopy(bArr2, i16, bArr2, i15, i13);
            iArr[i12] = i16;
            iArr2[i12] = i16 - i15;
        }
        sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10950Ujhhgtgfeyxiexzf = 0;
        arrayList3.clear();
        if (z) {
            sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10941Ujhhgtgfeyxiexzf = sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10944Ujhhgtgfeyxiexzf.m3538Ujhhgtgfeyxiexzf(12, i9);
        } else {
            sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10941Ujhhgtgfeyxiexzf ^= sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10944Ujhhgtgfeyxiexzf.m3538Ujhhgtgfeyxiexzf(i6, i10);
        }
        sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10940Ujhhgtgfeyxiexzf = i8;
        if (sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10939Ujhhgtgfeyxiexzf != null) {
            i9 |= 1073741824;
        }
        if (sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10959Ujhhgtgfeyxiexzf == 0) {
            sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10956Ujhhgtgfeyxiexzf.putInt(0, -1);
            sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10956Ujhhgtgfeyxiexzf.putLong(4, sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10941Ujhhgtgfeyxiexzf);
            sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10956Ujhhgtgfeyxiexzf.position(i6);
            sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10956Ujhhgtgfeyxiexzf.put((byte[]) sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10944Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf, i6, i10);
            sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10956Ujhhgtgfeyxiexzf.putInt(0, i9);
            sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10957Ujhhgtgfeyxiexzf.putInt(0, i9);
            sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10957Ujhhgtgfeyxiexzf.putLong(4, sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10941Ujhhgtgfeyxiexzf);
            sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10957Ujhhgtgfeyxiexzf.position(i6);
            sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10957Ujhhgtgfeyxiexzf.put((byte[]) sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10944Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf, i6, i10);
        } else {
            sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10944Ujhhgtgfeyxiexzf.m3550Ujhhgtgfeyxiexzf(0, i9);
            sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10944Ujhhgtgfeyxiexzf.m3551Ujhhgtgfeyxiexzf(4, sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10941Ujhhgtgfeyxiexzf);
        }
        int i22 = sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10940Ujhhgtgfeyxiexzf + i;
        if (((byte[]) sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10944Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf).length - i22 > 32768) {
            int i23 = SharedPreferencesC3515Ujhhgtgfeyxiexzf.f10935feyxiexzfUjhhgtg;
            int iM4212Ujhhgtgfeyxiexzf = AbstractC2855feyxiexzfUjhhgtg.m4212Ujhhgtgfeyxiexzf(i23, i22 + i23);
            byte[] bArr3 = (byte[]) sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10944Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf;
            if (iM4212Ujhhgtgfeyxiexzf >= bArr3.length) {
                i2 = 0;
            } else {
                byte[] bArr4 = new byte[iM4212Ujhhgtgfeyxiexzf];
                i2 = 0;
                System.arraycopy(bArr3, 0, bArr4, 0, sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10940Ujhhgtgfeyxiexzf);
                sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10944Ujhhgtgfeyxiexzf.f7650Ujhhgtgfeyxiexzf = bArr4;
                if (sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10959Ujhhgtgfeyxiexzf == 0) {
                    FileChannel fileChannel = sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10954Ujhhgtgfeyxiexzf;
                    long j = iM4212Ujhhgtgfeyxiexzf;
                    MappedByteBuffer mappedByteBufferM4224Ujhhgtgfeyxiexzf2 = null;
                    try {
                        fileChannel.truncate(j);
                        mappedByteBufferM4224Ujhhgtgfeyxiexzf = AbstractC2855feyxiexzfUjhhgtg.m4224Ujhhgtgfeyxiexzf(fileChannel, iM4212Ujhhgtgfeyxiexzf);
                    } catch (IOException unused) {
                        mappedByteBufferM4224Ujhhgtgfeyxiexzf = null;
                    }
                    FileChannel fileChannel2 = sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10955Ujhhgtgfeyxiexzf;
                    try {
                        fileChannel2.truncate(j);
                        mappedByteBufferM4224Ujhhgtgfeyxiexzf2 = AbstractC2855feyxiexzfUjhhgtg.m4224Ujhhgtgfeyxiexzf(fileChannel2, iM4212Ujhhgtgfeyxiexzf);
                    } catch (IOException unused2) {
                    }
                    if (mappedByteBufferM4224Ujhhgtgfeyxiexzf == null || mappedByteBufferM4224Ujhhgtgfeyxiexzf2 == null) {
                        Log.e("FastKV", sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10937Ujhhgtgfeyxiexzf, new Exception("map failed"));
                        AbstractC2855feyxiexzfUjhhgtg.m4229Ujhhgtgfeyxiexzf(sharedPreferencesC3515Ujhhgtgfeyxiexzf);
                    } else {
                        sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10956Ujhhgtgfeyxiexzf = mappedByteBufferM4224Ujhhgtgfeyxiexzf;
                        sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10957Ujhhgtgfeyxiexzf = mappedByteBufferM4224Ujhhgtgfeyxiexzf2;
                    }
                }
                AbstractC1252feyxiexzfUjhhgtg.m2786Ujhhgtgfeyxiexzf(sharedPreferencesC3515Ujhhgtgfeyxiexzf, "truncate finish");
            }
        } else {
            i2 = 0;
        }
        for (AbstractC3686Ujhhgtgfeyxiexzf abstractC3686Ujhhgtgfeyxiexzf : sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10942Ujhhgtgfeyxiexzf.values()) {
            int i24 = abstractC3686Ujhhgtgfeyxiexzf.f11716Ujhhgtgfeyxiexzf;
            if (i24 > i6) {
                int i25 = i14 - 1;
                int i26 = i2;
                while (i26 <= i25) {
                    int i27 = (i26 + i25) >>> 1;
                    int i28 = iArr[i27];
                    if (i28 >= i24) {
                        if (i28 <= i24) {
                            i25 = i27;
                            break;
                        }
                        i25 = i27 - 1;
                    } else {
                        i26 = i27 + 1;
                    }
                }
                int i29 = iArr2[i25];
                abstractC3686Ujhhgtgfeyxiexzf.f11716Ujhhgtgfeyxiexzf -= i29;
                if (abstractC3686Ujhhgtgfeyxiexzf.mo5374Ujhhgtgfeyxiexzf() >= 6) {
                    ((AbstractC3694feyxiexzfUjhhgtg) abstractC3686Ujhhgtgfeyxiexzf).f11724Ujhhgtgfeyxiexzf -= i29;
                }
            }
        }
        AbstractC1252feyxiexzfUjhhgtg.m2786Ujhhgtgfeyxiexzf(sharedPreferencesC3515Ujhhgtgfeyxiexzf, "gc finish");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final C2839feyxiexzfUjhhgtg m5155Ujhhgtgfeyxiexzf(Annotation annotation) {
        return AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(annotation.annotationType());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static int[] m5156Ujhhgtgfeyxiexzf(int[] iArr) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static ColorStateList m5157Ujhhgtgfeyxiexzf(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC2952feyxiexzfUjhhgtg.m4360Ujhhgtgfeyxiexzf(drawable)) {
            return null;
        }
        return AbstractC2952feyxiexzfUjhhgtg.m4342Ujhhgtgfeyxiexzf(drawable).getColorStateList();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Class m5158Ujhhgtgfeyxiexzf(InterfaceC0144Ujhhgtgfeyxiexzf interfaceC0144Ujhhgtgfeyxiexzf) {
        Class clsMo2998Ujhhgtgfeyxiexzf = ((InterfaceC2808Ujhhgtgfeyxiexzf) interfaceC0144Ujhhgtgfeyxiexzf).mo2998Ujhhgtgfeyxiexzf();
        if (clsMo2998Ujhhgtgfeyxiexzf.isPrimitive()) {
            String name = clsMo2998Ujhhgtgfeyxiexzf.getName();
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
        return clsMo2998Ujhhgtgfeyxiexzf;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final Class m5159Ujhhgtgfeyxiexzf(C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtg) {
        Class clsMo2998Ujhhgtgfeyxiexzf = c2839feyxiexzfUjhhgtg.mo2998Ujhhgtgfeyxiexzf();
        if (clsMo2998Ujhhgtgfeyxiexzf.isPrimitive()) {
            return clsMo2998Ujhhgtgfeyxiexzf;
        }
        String name = clsMo2998Ujhhgtgfeyxiexzf.getName();
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static final InterfaceC0146Ujhhgtgfeyxiexzf m5160Ujhhgtgfeyxiexzf(InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146Ujhhgtgfeyxiexzf) {
        return interfaceC0146Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf().mo1183Ujhhgtgfeyxiexzf() ? interfaceC0146Ujhhgtgfeyxiexzf : new C1278feyxiexzfUjhhgtg(interfaceC0146Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static boolean m5161feyxiexzfUjhhgtg(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static boolean m5162feyxiexzfUjhhgtg(byte[] bArr) {
        int iNextInt;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        byte[] bytes = MagicFactory.get(4928258905240241546L, strArr).getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
        MagicFactory.get(4928258883765405066L, strArr);
        if (bArr.length >= bytes.length) {
            Iterable c0682Ujhhgtgfeyxiexzf = new C0682Ujhhgtgfeyxiexzf(0, bytes.length - 1, 1);
            if (!(c0682Ujhhgtgfeyxiexzf instanceof Collection) || !((Collection) c0682Ujhhgtgfeyxiexzf).isEmpty()) {
                Iterator it = c0682Ujhhgtgfeyxiexzf.iterator();
                do {
                    C0679Ujhhgtgfeyxiexzf c0679Ujhhgtgfeyxiexzf = (C0679Ujhhgtgfeyxiexzf) it;
                    if (c0679Ujhhgtgfeyxiexzf.f2803Ujhhgtgfeyxiexzf) {
                        iNextInt = c0679Ujhhgtgfeyxiexzf.nextInt();
                    }
                } while (bArr[iNextInt] == bytes[iNextInt]);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static InterfaceC3739feyxiexzfUjhhgtg m5163feyxiexzfUjhhgtg(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg2) {
        return interfaceC3739feyxiexzfUjhhgtg2 == C3303feyxiexzfUjhhgtg.f10342Ujhhgtgfeyxiexzf ? interfaceC3739feyxiexzfUjhhgtg : (InterfaceC3739feyxiexzfUjhhgtg) interfaceC3739feyxiexzfUjhhgtg2.mo1763feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtg, new C2432Ujhhgtgfeyxiexzf(3));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public static final Object m5164feyxiexzfUjhhgtg(C1076feyxiexzfUjhhgtg c1076feyxiexzfUjhhgtg, C1076feyxiexzfUjhhgtg c1076feyxiexzfUjhhgtg2, InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg) throws Throwable {
        Object c2874Ujhhgtgfeyxiexzf;
        Object objM2072feyxiexzfUjhhgtg;
        Object objM2065feyxiexzfUjhhgtg;
        C3290Ujhhgtgfeyxiexzf c3290Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.f9540Ujhhgtgfeyxiexzf;
        try {
            AbstractC1791feyxiexzfUjhhgtg.m3132Ujhhgtgfeyxiexzf(2, interfaceC3553feyxiexzfUjhhgtg);
            c2874Ujhhgtgfeyxiexzf = interfaceC3553feyxiexzfUjhhgtg.mo1179Ujhhgtgfeyxiexzf(c1076feyxiexzfUjhhgtg2, c1076feyxiexzfUjhhgtg);
        } catch (C3198feyxiexzfUjhhgtg e) {
            Throwable th = e.f9884Ujhhgtgfeyxiexzf;
            C2874Ujhhgtgfeyxiexzf c2874Ujhhgtgfeyxiexzf2 = new C2874Ujhhgtgfeyxiexzf(th, false);
            do {
                objM2072feyxiexzfUjhhgtg = c1076feyxiexzfUjhhgtg.m2072feyxiexzfUjhhgtg(C0731Ujhhgtgfeyxiexzf.f3004Ujhhgtgfeyxiexzf.get(c1076feyxiexzfUjhhgtg), c2874Ujhhgtgfeyxiexzf2);
                if (objM2072feyxiexzfUjhhgtg == AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf || objM2072feyxiexzfUjhhgtg == c3290Ujhhgtgfeyxiexzf) {
                }
                throw th;
            } while (objM2072feyxiexzfUjhhgtg == AbstractC3085Ujhhgtgfeyxiexzf.f9541Ujhhgtgfeyxiexzf);
            c1076feyxiexzfUjhhgtg.mo2048Ujhhgtgfeyxiexzf(objM2072feyxiexzfUjhhgtg);
            throw th;
        } catch (Throwable th2) {
            c2874Ujhhgtgfeyxiexzf = new C2874Ujhhgtgfeyxiexzf(th2, false);
        }
        EnumC3746Ujhhgtgfeyxiexzf enumC3746Ujhhgtgfeyxiexzf = EnumC3746Ujhhgtgfeyxiexzf.f11822Ujhhgtgfeyxiexzf;
        if (c2874Ujhhgtgfeyxiexzf == enumC3746Ujhhgtgfeyxiexzf || (objM2065feyxiexzfUjhhgtg = c1076feyxiexzfUjhhgtg.m2065feyxiexzfUjhhgtg(c2874Ujhhgtgfeyxiexzf)) == c3290Ujhhgtgfeyxiexzf) {
            return enumC3746Ujhhgtgfeyxiexzf;
        }
        c1076feyxiexzfUjhhgtg.mo2554feyxiexzfUjhhgtg();
        if (objM2065feyxiexzfUjhhgtg instanceof C2874Ujhhgtgfeyxiexzf) {
            throw ((C2874Ujhhgtgfeyxiexzf) objM2065feyxiexzfUjhhgtg).f9139Ujhhgtgfeyxiexzf;
        }
        return AbstractC3085Ujhhgtgfeyxiexzf.m4573feyxiexzfUjhhgtg(objM2065feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public abstract int mo1059Ujhhgtgfeyxiexzf(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public abstract float mo1060Ujhhgtgfeyxiexzf(int i);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public abstract int mo1061Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public abstract int mo1062Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public abstract int mo1063Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public abstract int mo1064Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public abstract int mo1065Ujhhgtgfeyxiexzf(View view);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ */
    public abstract int mo1066Ujhhgtgfeyxiexzf(CoordinatorLayout coordinatorLayout);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ */
    public abstract int mo1067Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ */
    public abstract boolean mo1068Ujhhgtgfeyxiexzf(float f);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ */
    public abstract boolean mo1069feyxiexzfUjhhgtg(View view);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ */
    public abstract boolean mo1070feyxiexzfUjhhgtg(float f, float f2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ */
    public abstract boolean mo1071feyxiexzfUjhhgtg(View view, float f);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ */
    public abstract void mo1072feyxiexzfUjhhgtg(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);
}
