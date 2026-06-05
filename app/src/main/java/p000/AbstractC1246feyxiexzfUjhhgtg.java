package p000;

import android.content.ContentValues;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛲ要点脸ᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1246feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final String[] f4591Ujhhgtgfeyxiexzf = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Object f4592Ujhhgtgfeyxiexzf = new Object();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static C2629Ujhhgtgfeyxiexzf f4593Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m2762Ujhhgtgfeyxiexzf(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static ImageView.ScaleType m2763Ujhhgtgfeyxiexzf(int i) {
        if (i == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i != 5) {
            return i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static boolean m2764Ujhhgtgfeyxiexzf(File file) {
        if (!file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (m2764Ujhhgtgfeyxiexzf(file2)) {
                }
            }
            if (file.delete()) {
                return true;
            }
        } else if (file.delete()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static View m2765Ujhhgtgfeyxiexzf(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static long m2766Ujhhgtgfeyxiexzf(File file) {
        long jM2766Ujhhgtgfeyxiexzf = 0;
        if (file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    jM2766Ujhhgtgfeyxiexzf += m2766Ujhhgtgfeyxiexzf(file2);
                }
            }
        }
        return jM2766Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static long m2767Ujhhgtgfeyxiexzf(int i, String str, String str2, long j) throws IllegalAccessException, InvocationTargetException {
        C0479Ujhhgtgfeyxiexzf c0479Ujhhgtgfeyxiexzf = C0479Ujhhgtgfeyxiexzf.f2392Ujhhgtgfeyxiexzf;
        ContentValues contentValues = new ContentValues();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        contentValues.put(MagicFactory.get(4928272580416112010L, strArr), (Integer) 0);
        String str3 = MagicFactory.get(4928272554646308234L, strArr);
        C0805feyxiexzfUjhhgtg c0805feyxiexzfUjhhgtg = AbstractC0804feyxiexzfUjhhgtg.f3192Ujhhgtgfeyxiexzf;
        contentValues.put(str3, Long.valueOf(((long) AbstractC0804feyxiexzfUjhhgtg.f3193Ujhhgtgfeyxiexzf.mo2927Ujhhgtgfeyxiexzf().nextInt()) + j));
        contentValues.put(MagicFactory.get(4928272653430556042L, strArr), Integer.valueOf(i));
        contentValues.put(MagicFactory.get(4928272631955719562L, strArr), (Integer) 3);
        contentValues.put(MagicFactory.get(4928272601890948490L, strArr), Long.valueOf(j));
        contentValues.put(MagicFactory.get(4928272692085261706L, strArr), str);
        contentValues.put(MagicFactory.get(4928272662020490634L, strArr), str2);
        c0479Ujhhgtgfeyxiexzf.getClass();
        Object objM4168Ujhhgtgfeyxiexzf = AbstractC2842feyxiexzfUjhhgtg.m4168Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C0498Ujhhgtgfeyxiexzf.f2425Ujhhgtgfeyxiexzf), new Object[0]);
        int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4168Ujhhgtgfeyxiexzf).m2024Ujhhgtgfeyxiexzf();
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928228990793024906L, strArr);
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m4863Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(ContentValues.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Boolean.TYPE)}, 2));
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1306Ujhhgtgfeyxiexzf();
        ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(contentValues, Boolean.TRUE);
        C0519Ujhhgtgfeyxiexzf.f2467Ujhhgtgfeyxiexzf.getClass();
        Method methodM3154feyxiexzfUjhhgtg = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C0517Ujhhgtgfeyxiexzf.f2465Ujhhgtgfeyxiexzf);
        C1168feyxiexzfUjhhgtg c1168feyxiexzfUjhhgtg = C1168feyxiexzfUjhhgtg.f4410Ujhhgtgfeyxiexzf;
        c1168feyxiexzfUjhhgtg.getClass();
        C1104feyxiexzfUjhhgtg.f4199Ujhhgtgfeyxiexzf.getClass();
        c1168feyxiexzfUjhhgtg.getClass();
        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(C1104feyxiexzfUjhhgtg.m2574feyxiexzfUjhhgtg(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C1160feyxiexzfUjhhgtg.f4356Ujhhgtgfeyxiexzf))).m2024Ujhhgtgfeyxiexzf();
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f2121feyxiexzfUjhhgtg = AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C0489Ujhhgtgfeyxiexzf.f2403Ujhhgtgfeyxiexzf);
        Object objInvoke = methodM3154feyxiexzfUjhhgtg.invoke(((C0393Ujhhgtgfeyxiexzf) AbstractC3317feyxiexzfUjhhgtg.m4794Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2)).m1649Ujhhgtgfeyxiexzf(new Object[0]), objM4168Ujhhgtgfeyxiexzf);
        MagicFactory.get(4928552917226489226L, strArr);
        return ((Long) objInvoke).longValue();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static String m2768Ujhhgtgfeyxiexzf(int i) {
        switch (i) {
            case 1:
                return "nop";
            case 2:
                return "move";
            case 3:
                return "move-param";
            case 4:
                return "move-exception";
            case 5:
                return "const";
            case 6:
                return "goto";
            case 7:
                return "if-eq";
            case 8:
                return "if-ne";
            case 9:
                return "if-lt";
            case 10:
                return "if-ge";
            case 11:
                return "if-le";
            case Opcodes.FCONST_1 /* 12 */:
                return "if-gt";
            case 13:
                return "switch";
            case Opcodes.DCONST_0 /* 14 */:
                return "add";
            case 15:
                return "sub";
            case 16:
                return "mul";
            case Opcodes.SIPUSH /* 17 */:
                return "div";
            case Opcodes.LDC /* 18 */:
                return "rem";
            case 19:
                return "neg";
            case 20:
                return "and";
            case Opcodes.ILOAD /* 21 */:
                return "or";
            case Opcodes.LLOAD /* 22 */:
                return "xor";
            case Opcodes.FLOAD /* 23 */:
                return "shl";
            case Opcodes.DLOAD /* 24 */:
                return "shr";
            case Opcodes.ALOAD /* 25 */:
                return "ushr";
            case 26:
                return "not";
            case 27:
                return "cmpl";
            case 28:
                return "cmpg";
            case 29:
                return "conv";
            case 30:
                return "to-byte";
            case 31:
                return "to-char";
            case 32:
                return "to-short";
            case 33:
                return "return";
            case 34:
                return "array-length";
            case 35:
                return "throw";
            case 36:
                return "monitor-enter";
            case 37:
                return "monitor-exit";
            case 38:
                return "aget";
            case 39:
                return "aput";
            case 40:
                return "new-instance";
            case 41:
                return "new-array";
            case 42:
                return "filled-new-array";
            case 43:
                return "check-cast";
            case 44:
                return "instance-of";
            case 45:
                return "get-field";
            case Opcodes.IALOAD /* 46 */:
                return "get-static";
            case 47:
                return "put-field";
            case 48:
                return "put-static";
            case 49:
                return "invoke-static";
            case Opcodes.AALOAD /* 50 */:
                return "invoke-virtual";
            case Opcodes.BALOAD /* 51 */:
                return "invoke-super";
            case 52:
                return "invoke-direct";
            case Opcodes.SALOAD /* 53 */:
                return "invoke-interface";
            case Opcodes.ISTORE /* 54 */:
            default:
                return "unknown-".concat(AbstractC1264feyxiexzfUjhhgtg.m2808Ujhhgtgfeyxiexzf(i));
            case Opcodes.LSTORE /* 55 */:
                return "move-result";
            case Opcodes.FSTORE /* 56 */:
                return "move-result-pseudo";
            case Opcodes.DSTORE /* 57 */:
                return "fill-array-data";
            case Opcodes.ASTORE /* 58 */:
                return "invoke-polymorphic";
            case 59:
                return "invoke-custom";
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m2769Ujhhgtgfeyxiexzf(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0078 A[RETURN] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static int m2770Ujhhgtgfeyxiexzf(int i, CharSequence charSequence) {
        char cCharAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) == '<') {
            while (true) {
                i++;
                if (i >= charSequence.length() || (cCharAt = charSequence.charAt(i)) == '\n' || cCharAt == '<') {
                    break;
                }
                if (cCharAt == '>') {
                    return i + 1;
                }
                if (cCharAt == '\\') {
                    int i2 = i + 1;
                    if (C3052Ujhhgtgfeyxiexzf.m4520Ujhhgtgfeyxiexzf(i2, charSequence)) {
                        i = i2;
                    }
                }
            }
            return -1;
        }
        int i3 = 0;
        int i4 = i;
        while (i4 < charSequence.length()) {
            char cCharAt2 = charSequence.charAt(i4);
            if (cCharAt2 == 0 || cCharAt2 == ' ') {
                if (i4 != i) {
                    return i4;
                }
                return -1;
            }
            if (cCharAt2 == '\\') {
                int i5 = i4 + 1;
                if (C3052Ujhhgtgfeyxiexzf.m4520Ujhhgtgfeyxiexzf(i5, charSequence)) {
                    i4 = i5;
                }
            } else if (cCharAt2 == '(') {
                i3++;
                if (i3 > 32) {
                    return -1;
                }
            } else if (cCharAt2 != ')') {
                if (Character.isISOControl(cCharAt2)) {
                    if (i4 != i) {
                        return i4;
                    }
                    return -1;
                }
            } else {
                if (i3 == 0) {
                    return i4;
                }
                i3--;
            }
            i4++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static int m2771Ujhhgtgfeyxiexzf(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case Opcodes.DUP2 /* 92 */:
                    int i2 = i + 1;
                    if (C3052Ujhhgtgfeyxiexzf.m4520Ujhhgtgfeyxiexzf(i2, charSequence)) {
                        i = i2;
                    }
                    break;
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:21:0x001a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018 A[DONT_INVERT] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static int m2772Ujhhgtgfeyxiexzf(CharSequence charSequence, int i, char c) {
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                if (C3052Ujhhgtgfeyxiexzf.m4520Ujhhgtgfeyxiexzf(i2, charSequence)) {
                    i = i2;
                } else {
                    if (cCharAt == c) {
                        return i;
                    }
                    if (c == ')' && cCharAt == '(') {
                        return -1;
                    }
                }
            } else {
                if (cCharAt == c) {
                    return i;
                }
                if (c == ')') {
                    continue;
                }
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m2773Ujhhgtgfeyxiexzf(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final String m2774Ujhhgtgfeyxiexzf(TextView textView) {
        CharSequence text = textView.getText();
        String str = text instanceof String ? (String) text : null;
        if (str != null) {
            return str;
        }
        CharSequence text2 = textView.getText();
        String string = text2 != null ? text2.toString() : null;
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public abstract InputFilter[] mo2775Ujhhgtgfeyxiexzf(InputFilter[] inputFilterArr);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public abstract boolean mo2776Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public abstract void mo2777Ujhhgtgfeyxiexzf(boolean z);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public abstract void mo2778Ujhhgtgfeyxiexzf(boolean z);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public abstract TransformationMethod mo2779Ujhhgtgfeyxiexzf(TransformationMethod transformationMethod);
}
