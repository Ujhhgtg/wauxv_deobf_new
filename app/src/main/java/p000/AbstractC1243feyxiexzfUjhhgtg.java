package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toast;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import me.hd.wauxv.R;
import okhttp3.Call;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛲᛳ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1243feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C3290Ujhhgtgfeyxiexzf f4580Ujhhgtgfeyxiexzf = new C3290Ujhhgtgfeyxiexzf("REMOVED_TASK", 1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C3290Ujhhgtgfeyxiexzf f4581Ujhhgtgfeyxiexzf = new C3290Ujhhgtgfeyxiexzf("CLOSED_EMPTY", 1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final int[] f4582Ujhhgtgfeyxiexzf = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final int[] f4583Ujhhgtgfeyxiexzf = {R.attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static Toast f4584Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C0207Ujhhgtgfeyxiexzf m2727Ujhhgtgfeyxiexzf(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new C0207Ujhhgtgfeyxiexzf(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final String m2728Ujhhgtgfeyxiexzf(Object[] objArr, int i, int i2, AbstractC2935Ujhhgtgfeyxiexzf abstractC2935Ujhhgtgfeyxiexzf) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC2935Ujhhgtgfeyxiexzf) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final void m2729Ujhhgtgfeyxiexzf(InterfaceC3737Ujhhgtgfeyxiexzf interfaceC3737Ujhhgtgfeyxiexzf) {
        if (interfaceC3737Ujhhgtgfeyxiexzf == null) {
            return;
        }
        Iterator it = AbstractC0427Ujhhgtgfeyxiexzf.f2280Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            Call call = (Call) ((WeakReference) it.next()).get();
            if (call == null) {
                it.remove();
            } else {
                C1253feyxiexzfUjhhgtg c1253feyxiexzfUjhhgtg = (C1253feyxiexzfUjhhgtg) call.request().tag(C1253feyxiexzfUjhhgtg.class);
                Object obj = c1253feyxiexzfUjhhgtg != null ? c1253feyxiexzfUjhhgtg.f4608Ujhhgtgfeyxiexzf : null;
                if (interfaceC3737Ujhhgtgfeyxiexzf.equals(obj != null ? obj : null)) {
                    call.cancel();
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static void m2730Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3153feyxiexzfUjhhgtg, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m2732Ujhhgtgfeyxiexzf(context, f4583Ujhhgtgfeyxiexzf, "Theme.MaterialComponents");
            }
        }
        m2732Ujhhgtgfeyxiexzf(context, f4582Ujhhgtgfeyxiexzf, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static void m2731Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3153feyxiexzfUjhhgtg, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m2732Ujhhgtgfeyxiexzf(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final void m2733Ujhhgtgfeyxiexzf(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC1791feyxiexzfUjhhgtg.m3129Ujhhgtgfeyxiexzf(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static C3626Ujhhgtgfeyxiexzf m2734Ujhhgtgfeyxiexzf(Context context) {
        ProviderInfo providerInfo;
        C3624feyxiexzfUjhhgtg c3624feyxiexzfUjhhgtg;
        ApplicationInfo applicationInfo;
        C2466feyxiexzfUjhhgtg c3127Ujhhgtgfeyxiexzf = Build.VERSION.SDK_INT >= 28 ? new C3127Ujhhgtgfeyxiexzf(17) : new C2466feyxiexzfUjhhgtg(17);
        PackageManager packageManager = context.getPackageManager();
        AbstractC3594Ujhhgtgfeyxiexzf.m5169Ujhhgtgfeyxiexzf(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c3624feyxiexzfUjhhgtg = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo3707Ujhhgtgfeyxiexzf = c3127Ujhhgtgfeyxiexzf.mo3707Ujhhgtgfeyxiexzf(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo3707Ujhhgtgfeyxiexzf) {
                    arrayList.add(signature.toByteArray());
                }
                c3624feyxiexzfUjhhgtg = new C3624feyxiexzfUjhhgtg(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                c3624feyxiexzfUjhhgtg = null;
            }
        }
        if (c3624feyxiexzfUjhhgtg == null) {
            return null;
        }
        return new C3626Ujhhgtgfeyxiexzf(new C3625Ujhhgtgfeyxiexzf(context, c3624feyxiexzfUjhhgtg));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final void m2735Ujhhgtgfeyxiexzf(Throwable th) {
        String str;
        String string;
        if (AbstractC0427Ujhhgtgfeyxiexzf.f2278Ujhhgtgfeyxiexzf) {
            if (th != null) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                string = stringWriter.toString();
            } else {
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                StackTraceElement stackTraceElement = 1 < stackTrace.length ? stackTrace[1] : null;
                if (stackTraceElement != null) {
                    str = " (" + stackTraceElement.getFileName() + ':' + stackTraceElement.getLineNumber() + ')';
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = "";
                }
                string = th + str;
            }
            Log.d(AbstractC0427Ujhhgtgfeyxiexzf.f2279Ujhhgtgfeyxiexzf, string);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static int m2736Ujhhgtgfeyxiexzf(List list, InputStream inputStream, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C0790feyxiexzfUjhhgtg(inputStream, c0271Ujhhgtgfeyxiexzf);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iMo2091Ujhhgtgfeyxiexzf = ((InterfaceC0751Ujhhgtgfeyxiexzf) list.get(i)).mo2091Ujhhgtgfeyxiexzf(inputStream, c0271Ujhhgtgfeyxiexzf);
                inputStream.reset();
                if (iMo2091Ujhhgtgfeyxiexzf != -1) {
                    return iMo2091Ujhhgtgfeyxiexzf;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static ImageHeaderParser$ImageType m2737Ujhhgtgfeyxiexzf(List list, InputStream inputStream, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C0790feyxiexzfUjhhgtg(inputStream, c0271Ujhhgtgfeyxiexzf);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2090Ujhhgtgfeyxiexzf = ((InterfaceC0751Ujhhgtgfeyxiexzf) list.get(i)).mo2090Ujhhgtgfeyxiexzf(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeMo2090Ujhhgtgfeyxiexzf != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo2090Ujhhgtgfeyxiexzf;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static ImageHeaderParser$ImageType m2738Ujhhgtgfeyxiexzf(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2087Ujhhgtgfeyxiexzf = ((InterfaceC0751Ujhhgtgfeyxiexzf) list.get(i)).mo2087Ujhhgtgfeyxiexzf(byteBuffer);
                AtomicReference atomicReference = AbstractC2648Ujhhgtgfeyxiexzf.f8502Ujhhgtgfeyxiexzf;
                if (imageHeaderParser$ImageTypeMo2087Ujhhgtgfeyxiexzf != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo2087Ujhhgtgfeyxiexzf;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = AbstractC2648Ujhhgtgfeyxiexzf.f8502Ujhhgtgfeyxiexzf;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final int m2739Ujhhgtgfeyxiexzf(C2392Ujhhgtgfeyxiexzf c2392Ujhhgtgfeyxiexzf, Object obj, int i) {
        int i2 = c2392Ujhhgtgfeyxiexzf.f7778Ujhhgtgfeyxiexzf;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM5147Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5147Ujhhgtgfeyxiexzf(i2, i, c2392Ujhhgtgfeyxiexzf.f7776Ujhhgtgfeyxiexzf);
            if (iM5147Ujhhgtgfeyxiexzf < 0 || C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj, c2392Ujhhgtgfeyxiexzf.f7777Ujhhgtgfeyxiexzf[iM5147Ujhhgtgfeyxiexzf])) {
                return iM5147Ujhhgtgfeyxiexzf;
            }
            int i3 = iM5147Ujhhgtgfeyxiexzf + 1;
            while (i3 < i2 && c2392Ujhhgtgfeyxiexzf.f7776Ujhhgtgfeyxiexzf[i3] == i) {
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj, c2392Ujhhgtgfeyxiexzf.f7777Ujhhgtgfeyxiexzf[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM5147Ujhhgtgfeyxiexzf - 1; i4 >= 0 && c2392Ujhhgtgfeyxiexzf.f7776Ujhhgtgfeyxiexzf[i4] == i; i4--) {
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj, c2392Ujhhgtgfeyxiexzf.f7777Ujhhgtgfeyxiexzf[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static TypedArray m2740Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m2730Ujhhgtgfeyxiexzf(context, attributeSet, i, i2);
        m2731Ujhhgtgfeyxiexzf(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static C2366Ujhhgtgfeyxiexzf m2741Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m2730Ujhhgtgfeyxiexzf(context, attributeSet, i, i2);
        m2731Ujhhgtgfeyxiexzf(context, attributeSet, iArr, i, i2, iArr2);
        return new C2366Ujhhgtgfeyxiexzf(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final void m2742Ujhhgtgfeyxiexzf(Object[] objArr, int i, int i2) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m2743feyxiexzfUjhhgtg(C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf, int i, long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i2 = (iNumberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 * 8));
        c2608Ujhhgtgfeyxiexzf.m3893Ujhhgtgfeyxiexzf(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            c2608Ujhhgtgfeyxiexzf.m3893Ujhhgtgfeyxiexzf((byte) j2);
            j2 >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m2744feyxiexzfUjhhgtg(C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf, int i, long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i2 = (iNumberOfLeadingZeros + 7) >> 3;
        c2608Ujhhgtgfeyxiexzf.m3893Ujhhgtgfeyxiexzf(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            c2608Ujhhgtgfeyxiexzf.m3893Ujhhgtgfeyxiexzf((byte) j);
            j >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public abstract int mo2664Ujhhgtgfeyxiexzf(View view, int i);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public abstract int mo2665Ujhhgtgfeyxiexzf(View view, int i);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public int mo2666Ujhhgtgfeyxiexzf(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int mo2745Ujhhgtgfeyxiexzf() {
        return 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public abstract void mo2668Ujhhgtgfeyxiexzf(int i);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ */
    public abstract void mo2669Ujhhgtgfeyxiexzf(View view, int i, int i2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ */
    public abstract void mo2670Ujhhgtgfeyxiexzf(View view, float f, float f2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ */
    public abstract boolean mo2671feyxiexzfUjhhgtg(View view, int i);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ */
    public void mo2667Ujhhgtgfeyxiexzf(View view, int i) {
    }
}
