package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3052Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C0849feyxiexzfUjhhgtg f9438Ujhhgtgfeyxiexzf = new C0849feyxiexzfUjhhgtg("image-destination");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C0849feyxiexzfUjhhgtg f9439Ujhhgtgfeyxiexzf = new C0849feyxiexzfUjhhgtg("image-replacement-text-is-link");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C0849feyxiexzfUjhhgtg f9440Ujhhgtgfeyxiexzf = new C0849feyxiexzfUjhhgtg("image-size");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9441Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f9442Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3052Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f9441Ujhhgtgfeyxiexzf = i;
        this.f9442Ujhhgtgfeyxiexzf = obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static boolean m4512Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final View m4513Ujhhgtgfeyxiexzf(ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt == null) {
            childAt = null;
        }
        if (childAt != null) {
            return childAt;
        }
        Class<View> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(View.class));
        throw new IllegalStateException(("This view at " + i + " is not a type of " + (clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : View.class) + " or is null.").toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static int m4514Ujhhgtgfeyxiexzf(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static boolean m4515Ujhhgtgfeyxiexzf(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m4515Ujhhgtgfeyxiexzf(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static int m4516Ujhhgtgfeyxiexzf(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final String m4517Ujhhgtgfeyxiexzf(File file) throws NoSuchAlgorithmException, IOException {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        MessageDigest messageDigest = MessageDigest.getInstance(MagicFactory.get(4928339968452986250L, strArr));
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = fileInputStream.read(bArr, 0, 1024);
            if (i == -1) {
                break;
            }
            messageDigest.update(bArr, 0, i);
        }
        fileInputStream.close();
        byte[] bArrDigest = messageDigest.digest();
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArrDigest) {
            String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.getDefault());
            MagicFactory.get(4928339921208345994L, strArr);
            if (upperCase.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(upperCase);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static C2344Ujhhgtgfeyxiexzf m4518Ujhhgtgfeyxiexzf(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C2344Ujhhgtgfeyxiexzf c2344UjhhgtgfeyxiexzfM3534Ujhhgtgfeyxiexzf;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C2344Ujhhgtgfeyxiexzf((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c2344UjhhgtgfeyxiexzfM3534Ujhhgtgfeyxiexzf = C2344Ujhhgtgfeyxiexzf.m3534Ujhhgtgfeyxiexzf(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c2344UjhhgtgfeyxiexzfM3534Ujhhgtgfeyxiexzf = null;
            }
            if (c2344UjhhgtgfeyxiexzfM3534Ujhhgtgfeyxiexzf != null) {
                return c2344UjhhgtgfeyxiexzfM3534Ujhhgtgfeyxiexzf;
            }
        }
        return new C2344Ujhhgtgfeyxiexzf((Shader) null, (ColorStateList) null, 0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static boolean m4519Ujhhgtgfeyxiexzf(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static boolean m4520Ujhhgtgfeyxiexzf(int i, CharSequence charSequence) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static TypedArray m4521Ujhhgtgfeyxiexzf(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final ViewGroup m4522Ujhhgtgfeyxiexzf(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) parent;
        if (viewGroup2 != null) {
            return viewGroup2;
        }
        Class<ViewGroup> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(ViewGroup.class));
        throw new IllegalStateException(("This view's parent is not a type of " + (clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : ViewGroup.class) + " or is null.").toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Object m4523Ujhhgtgfeyxiexzf(Object obj) {
        return obj instanceof C2874Ujhhgtgfeyxiexzf ? new C0919feyxiexzfUjhhgtg(((C2874Ujhhgtgfeyxiexzf) obj).f9139Ujhhgtgfeyxiexzf) : obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static TypedValue m4524Ujhhgtgfeyxiexzf(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static boolean m4525Ujhhgtgfeyxiexzf(Context context, int i, boolean z) {
        TypedValue typedValueM4524Ujhhgtgfeyxiexzf = m4524Ujhhgtgfeyxiexzf(context, i);
        if (typedValueM4524Ujhhgtgfeyxiexzf == null || typedValueM4524Ujhhgtgfeyxiexzf.type != 18) {
            return z;
        }
        return typedValueM4524Ujhhgtgfeyxiexzf.data != 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static TypedValue m4526Ujhhgtgfeyxiexzf(Context context, int i, String str) {
        TypedValue typedValueM4524Ujhhgtgfeyxiexzf = m4524Ujhhgtgfeyxiexzf(context, i);
        if (typedValueM4524Ujhhgtgfeyxiexzf != null) {
            return typedValueM4524Ujhhgtgfeyxiexzf;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m4527Ujhhgtgfeyxiexzf(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final C3027feyxiexzfUjhhgtg m4528Ujhhgtgfeyxiexzf(AbstractC3740feyxiexzfUjhhgtg abstractC3740feyxiexzfUjhhgtg, InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg) {
        C3027feyxiexzfUjhhgtg c3027feyxiexzfUjhhgtg = new C3027feyxiexzfUjhhgtg(Ujhhgtgfeyxiexzf.ON_DESTROY, abstractC3740feyxiexzfUjhhgtg);
        AbstractC3612feyxiexzfUjhhgtg.m5240Ujhhgtgfeyxiexzf(c3027feyxiexzfUjhhgtg, C3303feyxiexzfUjhhgtg.f10342Ujhhgtgfeyxiexzf, new C3024feyxiexzfUjhhgtg(interfaceC3553feyxiexzfUjhhgtg, (InterfaceC3704Ujhhgtgfeyxiexzf) null)).m2062feyxiexzfUjhhgtg(new C3025Ujhhgtgfeyxiexzf(1));
        return c3027feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m4529Ujhhgtgfeyxiexzf(InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg) {
        C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
        C0438Ujhhgtgfeyxiexzf c0438Ujhhgtgfeyxiexzf = new C0438Ujhhgtgfeyxiexzf(Ujhhgtgfeyxiexzf.ON_DESTROY, AbstractC0166Ujhhgtgfeyxiexzf.f1350Ujhhgtgfeyxiexzf);
        AbstractC3612feyxiexzfUjhhgtg.m5240Ujhhgtgfeyxiexzf(c0438Ujhhgtgfeyxiexzf, C3303feyxiexzfUjhhgtg.f10342Ujhhgtgfeyxiexzf, new C0436Ujhhgtgfeyxiexzf(c0438Ujhhgtgfeyxiexzf, interfaceC3553feyxiexzfUjhhgtg, (InterfaceC3704Ujhhgtgfeyxiexzf) null)).m2062feyxiexzfUjhhgtg(new C0435Ujhhgtgfeyxiexzf(c0438Ujhhgtgfeyxiexzf));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static final int m4530Ujhhgtgfeyxiexzf(C1116feyxiexzfUjhhgtg c1116feyxiexzfUjhhgtg, int i) {
        int i2;
        int[] iArr = c1116feyxiexzfUjhhgtg.f4219Ujhhgtgfeyxiexzf;
        int i3 = i + 1;
        int length = c1116feyxiexzfUjhhgtg.f4218Ujhhgtgfeyxiexzf.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            i2 = (i4 + length) >>> 1;
            int i5 = iArr[i2];
            if (i5 < i3) {
                i4 = i2 + 1;
            } else {
                if (i5 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                length = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static int m4531Ujhhgtgfeyxiexzf(char c, int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static int m4532Ujhhgtgfeyxiexzf(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }
}
