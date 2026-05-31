package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.Executor;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤝᲈᲁᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2234 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C0382 f7284 = new C0382();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2135 f7285 = new C2135(7);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1734 m4156(InterfaceC2715 interfaceC2715) {
        String str = "Value of type '" + interfaceC2715.mo1488() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC2715.mo3640() + '\'';
        interfaceC2715.mo1488();
        return new C1734(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static boolean m4157(C0792 c0792) {
        int[] iArr = c0792.f3141;
        int i = iArr[0];
        int i2 = iArr[1];
        C0792 c0793 = c0792.f3119;
        C0793 c0794 = c0793 != null ? (C0793) c0793 : null;
        if (c0794 != null) {
            int i3 = c0794.f3141[0];
        }
        if (c0794 != null) {
            int i4 = c0794.f3141[1];
        }
        boolean z = i == 1 || i == 2 || (i == 3 && c0792.f3091 == 0 && c0792.f3122 == 0.0f && c0792.m2434(0)) || c0792.mo1592();
        boolean z2 = i2 == 1 || i2 == 2 || (i2 == 3 && c0792.f3092 == 0 && c0792.f3122 == 0.0f && c0792.m2434(1)) || c0792.mo1593();
        return (c0792.f3122 > 0.0f && (z || z2)) || (z && z2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static int m4158(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static Drawable m4159(Drawable drawable, Drawable drawable2, int i, int i2) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static boolean m4160(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zM4161 = m4161(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zM4161;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static boolean m4161(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static Drawable m4162(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final float m4163(Number number, Context context) {
        return number.floatValue() * context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final void m4164(AbstractC0064 abstractC0064, Throwable th) throws Throwable {
        if (th instanceof C1076) {
            th = ((C1076) th).f3896;
        }
        abstractC0064.mo1077(new C2641(th));
        throw th;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final InterfaceC0876 m4165(InterfaceC0876 interfaceC0876, InterfaceC0876 interfaceC0877, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC0876.mo1084(bool, new C0192(6))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC0877.mo1084(bool, new C0192(6))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC0876.mo1085(interfaceC0877);
        }
        C0192 c0192 = new C0192(4);
        C1189 c1189 = C1189.f4324;
        InterfaceC0876 interfaceC0878 = (InterfaceC0876) interfaceC0876.mo1084(c1189, c0192);
        Object objMo1084 = interfaceC0877;
        if (zBooleanValue2) {
            objMo1084 = interfaceC0877.mo1084(c1189, new C0192(5));
        }
        return interfaceC0878.mo1085((InterfaceC0876) objMo1084);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static String m4166(Float f) {
        return new DecimalFormat("0.00").format(f);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String m4167(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !AbstractC2901.m4869(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !AbstractC2901.m4869(str3)) {
            sb.append("\n" + str3);
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static C0160 m4168() {
        return (C0160) C0160.f1227.getValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static int[] m4169(int[] iArr) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static ColorStateList m4170(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC0089.m1165(drawable)) {
            return null;
        }
        return AbstractC0089.m1147(drawable).getColorStateList();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static File m4171(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static void m4172(C0783 c0783, C0792 c0792, boolean z) {
        HashSet<C0778> hashSet;
        C0778 c0778;
        C0778 c0779;
        float f;
        C0778 c07710;
        C0778 c07711;
        C0778 c07712;
        if (!(c0792 instanceof C0793) && c0792.m2439() && m4157(c0792)) {
            C0793.m2452(c0792, c0783, new C0382());
        }
        C0778 c0778Mo2426 = c0792.mo2426(2);
        C0778 c0778Mo2427 = c0792.mo2426(4);
        int iM2388 = c0778Mo2426.m2388();
        int iM2389 = c0778Mo2427.m2388();
        HashSet<C0778> hashSet2 = c0778Mo2426.f2883;
        if (hashSet2 != null && c0778Mo2426.f2885) {
            for (C0778 c07713 : hashSet2) {
                C0792 c0793 = c07713.f2886;
                boolean zM4157 = m4157(c0793);
                C0778 c07714 = c0793.f3108;
                C0778 c07715 = c0793.f3110;
                if (c0793.m2439() && zM4157) {
                    f = 0.0f;
                    C0793.m2452(c0793, c0783, new C0382());
                } else {
                    f = 0.0f;
                }
                int i = c0793.f3141[0];
                if (i != 3 || zM4157) {
                    if (!c0793.m2439()) {
                        if (c07713 == c07714 && c07715.f2888 == null) {
                            int iM23810 = c07714.m2389() + iM2388;
                            c0793.m2444(iM23810, c0793.m2431() + iM23810);
                            m4172(c0783, c0793, z);
                        } else if (c07713 == c07715 && c07714.f2888 == null) {
                            int iM23811 = iM2388 - c07715.m2389();
                            c0793.m2444(iM23811 - c0793.m2431(), iM23811);
                            m4172(c0783, c0793, z);
                        } else if (c07713 == c07714 && (c07710 = c07715.f2888) != null && c07710.f2885 && !c0793.m2437()) {
                            m4182(c0783, c0793, z);
                        }
                    }
                } else if (i == 3 && c0793.f3095 >= 0 && c0793.f3094 >= 0 && (c0793.f3132 == 8 || (c0793.f3091 == 0 && c0793.f3122 == f))) {
                    if (!c0793.m2437() && !c0793.f3105 && ((c07713 == c07714 && (c07712 = c07715.f2888) != null && c07712.f2885) || (c07713 == c07715 && (c07711 = c07714.f2888) != null && c07711.f2885))) {
                        if (!c0793.m2437()) {
                            m4183(c0792, c0783, c0793, z);
                        }
                    }
                }
            }
        }
        if ((c0792 instanceof C1518) || (hashSet = c0778Mo2427.f2883) == null || !c0778Mo2427.f2885) {
            return;
        }
        for (C0778 c07716 : hashSet) {
            C0792 c0794 = c07716.f2886;
            boolean zM4158 = m4157(c0794);
            C0778 c07717 = c0794.f3108;
            C0778 c07718 = c0794.f3110;
            if (c0794.m2439() && zM4158) {
                C0793.m2452(c0794, c0783, new C0382());
            }
            boolean z2 = (c07716 == c07717 && (c0779 = c07718.f2888) != null && c0779.f2885) || (c07716 == c07718 && (c0778 = c07717.f2888) != null && c0778.f2885);
            int i2 = c0794.f3141[0];
            if (i2 != 3 || zM4158) {
                if (!c0794.m2439()) {
                    if (c07716 == c07717 && c07718.f2888 == null) {
                        int iM23812 = c07717.m2389() + iM2389;
                        c0794.m2444(iM23812, c0794.m2431() + iM23812);
                        m4172(c0783, c0794, z);
                    } else if (c07716 == c07718 && c07717.f2888 == null) {
                        int iM23813 = iM2389 - c07718.m2389();
                        c0794.m2444(iM23813 - c0794.m2431(), iM23813);
                        m4172(c0783, c0794, z);
                    } else if (z2 && !c0794.m2437()) {
                        m4182(c0783, c0794, z);
                    }
                }
            } else if (i2 == 3 && c0794.f3095 >= 0 && c0794.f3094 >= 0 && (c0794.f3132 == 8 || (c0794.f3091 == 0 && c0794.f3122 == 0.0f))) {
                if (!c0794.m2437() && !c0794.f3105 && z2 && !c0794.m2437()) {
                    m4183(c0792, c0783, c0794, z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static int m4173(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(AbstractC1095.m2794(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final void m4174(C0154 c0154, String str) {
        c0154.m1315(c0154.f1217 - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static /* synthetic */ void m4175(C0154 c0154) {
        m4174(c0154, "object");
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final boolean m4176(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static final CharSequence m4177(int i, CharSequence charSequence) {
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbM4787 = AbstractC2844.m4787(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbM4787.append(charSequence.subSequence(i2, i3).toString());
                sbM4787.append(str2);
                return sbM4787.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static MappedByteBuffer m4178(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static final String m4179(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return AbstractC2844.m4786(sb, str != null ? AbstractC1095.m2800(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static void m4180(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final void m4181(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static void m4182(C0783 c0783, C0792 c0792, boolean z) {
        float f = c0792.f3129;
        C0778 c0778 = c0792.f3108;
        int iM2388 = c0778.f2888.m2388();
        C0778 c0779 = c0792.f3110;
        int iM2389 = c0779.f2888.m2388();
        int iM23810 = c0778.m2389() + iM2388;
        int iM23811 = iM2389 - c0779.m2389();
        if (iM2388 == iM2389) {
            f = 0.5f;
        } else {
            iM2388 = iM23810;
            iM2389 = iM23811;
        }
        int iM2431 = c0792.m2431();
        int i = (iM2389 - iM2388) - iM2431;
        if (iM2388 > iM2389) {
            i = (iM2388 - iM2389) - iM2431;
        }
        int i2 = ((int) ((f * i) + 0.5f)) + iM2388;
        int i3 = i2 + iM2431;
        if (iM2388 > iM2389) {
            i3 = i2 - iM2431;
        }
        c0792.m2444(i2, i3);
        m4172(c0783, c0792, z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static void m4183(C0792 c0792, C0783 c0783, C0792 c0793, boolean z) {
        float f = c0793.f3129;
        C0778 c0778 = c0793.f3108;
        int iM2389 = c0778.m2389() + c0778.f2888.m2388();
        C0778 c0779 = c0793.f3110;
        int iM2388 = c0779.f2888.m2388() - c0779.m2389();
        if (iM2388 >= iM2389) {
            int iM2431 = c0793.m2431();
            if (c0793.f3132 != 8) {
                int i = c0793.f3091;
                if (i == 2) {
                    iM2431 = (int) (c0793.f3129 * 0.5f * (c0792 instanceof C0793 ? c0792.m2431() : c0792.f3119.m2431()));
                } else if (i == 0) {
                    iM2431 = iM2388 - iM2389;
                }
                iM2431 = Math.max(c0793.f3094, iM2431);
                int i2 = c0793.f3095;
                if (i2 > 0) {
                    iM2431 = Math.min(i2, iM2431);
                }
            }
            int i3 = iM2389 + ((int) ((f * ((iM2388 - iM2389) - iM2431)) + 0.5f));
            c0793.m2444(i3, iM2431 + i3);
            m4172(c0783, c0793, z);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static void m4184(C0783 c0783, C0792 c0792) {
        float f = c0792.f3130;
        C0778 c0778 = c0792.f3109;
        int iM2388 = c0778.f2888.m2388();
        C0778 c0779 = c0792.f3111;
        int iM2389 = c0779.f2888.m2388();
        int iM23810 = c0778.m2389() + iM2388;
        int iM23811 = iM2389 - c0779.m2389();
        if (iM2388 == iM2389) {
            f = 0.5f;
        } else {
            iM2388 = iM23810;
            iM2389 = iM23811;
        }
        int iM2428 = c0792.m2428();
        int i = (iM2389 - iM2388) - iM2428;
        if (iM2388 > iM2389) {
            i = (iM2388 - iM2389) - iM2428;
        }
        int i2 = (int) ((f * i) + 0.5f);
        int i3 = iM2388 + i2;
        int i4 = i3 + iM2428;
        if (iM2388 > iM2389) {
            i3 = iM2388 - i2;
            i4 = i3 - iM2428;
        }
        c0792.m2445(i3, i4);
        m4190(c0783, c0792);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static void m4185(C0792 c0792, C0783 c0783, C0792 c0793) {
        float f = c0793.f3130;
        C0778 c0778 = c0793.f3109;
        int iM2389 = c0778.m2389() + c0778.f2888.m2388();
        C0778 c0779 = c0793.f3111;
        int iM2388 = c0779.f2888.m2388() - c0779.m2389();
        if (iM2388 >= iM2389) {
            int iM2428 = c0793.m2428();
            if (c0793.f3132 != 8) {
                int i = c0793.f3092;
                if (i == 2) {
                    iM2428 = (int) (f * 0.5f * (c0792 instanceof C0793 ? c0792.m2428() : c0792.f3119.m2428()));
                } else if (i == 0) {
                    iM2428 = iM2388 - iM2389;
                }
                iM2428 = Math.max(c0793.f3097, iM2428);
                int i2 = c0793.f3098;
                if (i2 > 0) {
                    iM2428 = Math.min(i2, iM2428);
                }
            }
            int i3 = iM2389 + ((int) ((f * ((iM2388 - iM2389) - iM2428)) + 0.5f));
            c0793.m2445(i3, iM2428 + i3);
            m4190(c0783, c0793);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static final void m4186(int[] iArr, int[] iArr2, InterfaceC2715 interfaceC2715) {
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr2[i] & (~iArr[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(interfaceC2715.mo3642((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new C2016(interfaceC2715.mo1488(), arrayList);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static final void m4187(int i, int i2, InterfaceC2715 interfaceC2715) {
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(interfaceC2715.mo3642(i4));
            }
            i3 >>>= 1;
        }
        throw new C2016(interfaceC2715.mo1488(), arrayList);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static String m4188(long j, String str, ZoneId zoneId, int i) {
        if ((i & 1) != 0) {
            str = "yyyy-MM-dd HH:mm:ss";
        }
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return DateTimeFormatter.ofPattern(str).withZone(zoneId).format(Instant.ofEpochMilli(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲁᲈᲀᤞᲇ] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲁᲀᤞᲇ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲁᲀᤞᲇ] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static final C3550 m4189(AbstractC0842 abstractC0842, InterfaceC0876 interfaceC0876, Object obj) {
        C3550 c3550 = null;
        if (abstractC0842 != 0 && interfaceC0876.mo1086(C3551.f11146) != null) {
            while (!(abstractC0842 instanceof C1078) && (abstractC0842 = abstractC0842.mo1596()) != 0) {
                if (abstractC0842 instanceof C3550) {
                    c3550 = (C3550) abstractC0842;
                    break;
                }
            }
            if (c3550 != null) {
                c3550.m5106(interfaceC0876, obj);
            }
        }
        return c3550;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static void m4190(C0783 c0783, C0792 c0792) {
        C0778 c0778;
        C0778 c0779;
        C0778 c07710;
        C0778 c07711;
        C0778 c07712;
        if (!(c0792 instanceof C0793) && c0792.m2439() && m4157(c0792)) {
            C0793.m2452(c0792, c0783, new C0382());
        }
        C0778 c0778Mo2426 = c0792.mo2426(3);
        C0778 c0778Mo2427 = c0792.mo2426(5);
        int iM2388 = c0778Mo2426.m2388();
        int iM2389 = c0778Mo2427.m2388();
        HashSet<C0778> hashSet = c0778Mo2426.f2883;
        if (hashSet != null && c0778Mo2426.f2885) {
            for (C0778 c07713 : hashSet) {
                C0792 c0793 = c07713.f2886;
                boolean zM4157 = m4157(c0793);
                C0778 c07714 = c0793.f3109;
                C0778 c07715 = c0793.f3111;
                if (c0793.m2439() && zM4157) {
                    C0793.m2452(c0793, c0783, new C0382());
                }
                int i = c0793.f3141[1];
                if (i != 3 || zM4157) {
                    if (!c0793.m2439()) {
                        if (c07713 == c07714 && c07715.f2888 == null) {
                            int iM23810 = c07714.m2389() + iM2388;
                            c0793.m2445(iM23810, c0793.m2428() + iM23810);
                            m4190(c0783, c0793);
                        } else if (c07713 == c07715 && c07715.f2888 == null) {
                            int iM23811 = iM2388 - c07715.m2389();
                            c0793.m2445(iM23811 - c0793.m2428(), iM23811);
                            m4190(c0783, c0793);
                        } else if (c07713 == c07714 && (c07710 = c07715.f2888) != null && c07710.f2885) {
                            m4184(c0783, c0793);
                        }
                    }
                } else if (i == 3 && c0793.f3098 >= 0 && c0793.f3097 >= 0 && (c0793.f3132 == 8 || (c0793.f3092 == 0 && c0793.f3122 == 0.0f))) {
                    if (!c0793.m2438() && !c0793.f3105 && ((c07713 == c07714 && (c07712 = c07715.f2888) != null && c07712.f2885) || (c07713 == c07715 && (c07711 = c07714.f2888) != null && c07711.f2885))) {
                        if (!c0793.m2438()) {
                            m4185(c0792, c0783, c0793);
                        }
                    }
                }
            }
        }
        if (c0792 instanceof C1518) {
            return;
        }
        HashSet<C0778> hashSet2 = c0778Mo2427.f2883;
        if (hashSet2 != null && c0778Mo2427.f2885) {
            for (C0778 c07716 : hashSet2) {
                C0792 c0794 = c07716.f2886;
                boolean zM4158 = m4157(c0794);
                C0778 c07717 = c0794.f3109;
                C0778 c07718 = c0794.f3111;
                if (c0794.m2439() && zM4158) {
                    C0793.m2452(c0794, c0783, new C0382());
                }
                boolean z = (c07716 == c07717 && (c0779 = c07718.f2888) != null && c0779.f2885) || (c07716 == c07718 && (c0778 = c07717.f2888) != null && c0778.f2885);
                int i2 = c0794.f3141[1];
                if (i2 != 3 || zM4158) {
                    if (!c0794.m2439()) {
                        if (c07716 == c07717 && c07718.f2888 == null) {
                            int iM23812 = c07717.m2389() + iM2389;
                            c0794.m2445(iM23812, c0794.m2428() + iM23812);
                            m4190(c0783, c0794);
                        } else if (c07716 == c07718 && c07717.f2888 == null) {
                            int iM23813 = iM2389 - c07718.m2389();
                            c0794.m2445(iM23813 - c0794.m2428(), iM23813);
                            m4190(c0783, c0794);
                        } else if (z && !c0794.m2438()) {
                            m4184(c0783, c0794);
                        }
                    }
                } else if (i2 == 3 && c0794.f3098 >= 0 && c0794.f3097 >= 0 && (c0794.f3132 == 8 || (c0794.f3092 == 0 && c0794.f3122 == 0.0f))) {
                    if (!c0794.m2438() && !c0794.f3105 && z && !c0794.m2438()) {
                        m4185(c0792, c0783, c0794);
                    }
                }
            }
        }
        C0778 c0778Mo2428 = c0792.mo2426(6);
        if (c0778Mo2428.f2883 == null || !c0778Mo2428.f2885) {
            return;
        }
        int iM23814 = c0778Mo2428.m2388();
        for (C0778 c07719 : c0778Mo2428.f2883) {
            C0792 c0795 = c07719.f2886;
            boolean zM4159 = m4157(c0795);
            C0778 c07720 = c0795.f3112;
            if (c0795.m2439() && zM4159) {
                C0793.m2452(c0795, c0783, new C0382());
            }
            if (c0795.f3141[1] != 3 || zM4159) {
                if (!c0795.m2439() && c07719 == c07720) {
                    if (c0795.f3104) {
                        int i3 = iM23814 - c0795.f3126;
                        int i4 = c0795.f3121 + i3;
                        c0795.f3125 = i3;
                        c0795.f3109.m2396(i3);
                        c0795.f3111.m2396(i4);
                        c07720.m2396(iM23814);
                        c0795.f3088 = true;
                    }
                    m4190(c0783, c0795);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x01c8 A[Catch: all -> 0x01d6, TRY_LEAVE, TryCatch #30 {all -> 0x01d6, blocks: (B:124:0x01bc, B:126:0x01c8, B:135:0x01d9), top: B:249:0x01bc, outer: #29 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01d9 A[Catch: all -> 0x01d6, TRY_ENTER, TRY_LEAVE, TryCatch #30 {all -> 0x01d6, blocks: (B:124:0x01bc, B:126:0x01c8, B:135:0x01d9), top: B:249:0x01bc, outer: #29 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:150:0x0200  */
    /* JADX WARN: Code duplicated, block: B:151:0x0204  */
    /* JADX WARN: Code duplicated, block: B:159:0x021e A[Catch: all -> 0x0240, TRY_LEAVE, TryCatch #16 {all -> 0x0240, blocks: (B:156:0x0216, B:157:0x0218, B:159:0x021e), top: B:227:0x0216 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x026d  */
    /* JADX WARN: Code duplicated, block: B:204:0x0277  */
    /* JADX WARN: Code duplicated, block: B:209:0x0284 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x0288  */
    /* JADX WARN: Code duplicated, block: B:251:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static void m4191(Context context, Executor executor, InterfaceC2462 interfaceC2462, boolean z) {
        char c;
        FileInputStream fileInputStreamM2716;
        C1030[] c1030ArrM4210;
        InterfaceC2462 interfaceC2463;
        C1030[] c1030Arr;
        byte[] bArr;
        byte[] bArr2;
        boolean z2;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr3;
        int i;
        boolean z3;
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        C1021 c1021;
        boolean z4;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j == packageInfo.lastUpdateTime;
                            if (z5) {
                                interfaceC2462.mo3554(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    AbstractC2468.m4404(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr4 = AbstractC2235.f7288;
            int i3 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C1021 c1022 = new C1021(assets, executor, interfaceC2462, name, file2);
            byte[] bArr5 = c1022.f3731;
            if (bArr5 == null) {
                c1022.m2717(3, Integer.valueOf(i3));
            } else {
                try {
                    try {
                        if (file2.exists()) {
                            if (!file2.canWrite()) {
                                c1022.m2717(4, null);
                            }
                            if (z3 || !z) {
                                z4 = 0;
                            } else {
                                z4 = c;
                            }
                            AbstractC2468.m4404(context, z4);
                        }
                        try {
                            file2.createNewFile();
                        } catch (IOException unused2) {
                            c = 1;
                            c1022.m2717(4, null);
                            z3 = false;
                        }
                        fileInputStreamM2716 = c1022.m2716(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        interfaceC2462.mo3554(6, e);
                        fileInputStreamM2716 = null;
                    } catch (IOException e2) {
                        interfaceC2462.mo3554(7, e2);
                        fileInputStreamM2716 = null;
                    }
                    if (fileInputStreamM2716 != null) {
                        try {
                            if (!Arrays.equals(bArr4, AbstractC0738.m2276(fileInputStreamM2716, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c1030ArrM4210 = AbstractC2235.m4210(fileInputStreamM2716, AbstractC0738.m2276(fileInputStreamM2716, 4), c1022.f3733);
                            try {
                                fileInputStreamM2716.close();
                            } catch (IOException e3) {
                                interfaceC2462.mo3554(7, e3);
                            }
                            c1022.f3735 = c1030ArrM4210;
                        } catch (IOException e4) {
                            interfaceC2462.mo3554(7, e4);
                            try {
                                fileInputStreamM2716.close();
                            } catch (IOException e5) {
                                interfaceC2462.mo3554(7, e5);
                            }
                            c1030ArrM4210 = null;
                        } catch (IllegalStateException e6) {
                            interfaceC2462.mo3554(8, e6);
                            fileInputStreamM2716.close();
                            c1030ArrM4210 = null;
                        }
                    }
                    C1030[] c1030Arr2 = c1022.f3735;
                    if (c1030Arr2 != null && (i2 = Build.VERSION.SDK_INT) <= 34) {
                        switch (i2) {
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                                try {
                                    FileInputStream fileInputStreamM2717 = c1022.m2716(assets, "dexopt/baseline.profm");
                                    if (fileInputStreamM2717 != null) {
                                        try {
                                            if (!Arrays.equals(AbstractC2235.f7289, AbstractC0738.m2276(fileInputStreamM2717, 4))) {
                                                throw new IllegalStateException("Invalid magic");
                                            }
                                            c1022.f3735 = AbstractC2235.m4207(fileInputStreamM2717, AbstractC0738.m2276(fileInputStreamM2717, 4), bArr5, c1030Arr2);
                                            fileInputStreamM2717.close();
                                            c1021 = c1022;
                                        } catch (Throwable th4) {
                                            try {
                                                fileInputStreamM2717.close();
                                                throw th4;
                                            } catch (Throwable th5) {
                                                th4.addSuppressed(th5);
                                                throw th4;
                                            }
                                        }
                                    } else {
                                        if (fileInputStreamM2717 != null) {
                                            fileInputStreamM2717.close();
                                        }
                                        c1021 = null;
                                    }
                                } catch (FileNotFoundException e7) {
                                    interfaceC2462.mo3554(9, e7);
                                } catch (IOException e8) {
                                    interfaceC2462.mo3554(7, e8);
                                } catch (IllegalStateException e9) {
                                    c1022.f3735 = null;
                                    interfaceC2462.mo3554(8, e9);
                                }
                                if (c1021 != null) {
                                    c1022 = c1021;
                                    break;
                                }
                            default:
                                interfaceC2463 = c1022.f3730;
                                c1030Arr = c1022.f3735;
                                bArr = c1022.f3731;
                                if (c1030Arr != null && bArr != null) {
                                    if (c1022.f3734) {
                                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    }
                                    try {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byteArrayOutputStream.write(bArr4);
                                            byteArrayOutputStream.write(bArr);
                                            if (AbstractC2235.m4218(byteArrayOutputStream, bArr, c1030Arr)) {
                                                c1022.f3736 = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                c1022.f3735 = null;
                                            } else {
                                                interfaceC2463.mo3554(5, null);
                                                c1022.f3735 = null;
                                                byteArrayOutputStream.close();
                                            }
                                        } catch (Throwable th6) {
                                            try {
                                                byteArrayOutputStream.close();
                                                throw th6;
                                            } catch (Throwable th7) {
                                                th6.addSuppressed(th7);
                                                throw th6;
                                            }
                                        }
                                    } catch (IOException e10) {
                                        interfaceC2463.mo3554(7, e10);
                                    } catch (IllegalStateException e11) {
                                        interfaceC2463.mo3554(8, e11);
                                    }
                                }
                                bArr2 = c1022.f3736;
                                if (bArr2 != null) {
                                    z2 = false;
                                    c = 1;
                                } else {
                                    try {
                                        if (c1022.f3734) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            try {
                                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                try {
                                                    fileOutputStream = new FileOutputStream(c1022.f3732);
                                                    try {
                                                        try {
                                                            bArr3 = new byte[512];
                                                            while (true) {
                                                                i = byteArrayInputStream.read(bArr3);
                                                                if (i > 0) {
                                                                    fileOutputStream.write(bArr3, 0, i);
                                                                } else {
                                                                    c = 1;
                                                                    try {
                                                                        c1022.m2717(1, null);
                                                                        fileOutputStream.close();
                                                                        byteArrayInputStream.close();
                                                                        c1022.f3736 = null;
                                                                        c1022.f3735 = null;
                                                                        z2 = true;
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                    }
                                                                }
                                                                th = th;
                                                                try {
                                                                    fileOutputStream.close();
                                                                    throw th;
                                                                } catch (Throwable th9) {
                                                                    th.addSuppressed(th9);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            Throwable th11 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th11;
                                                            } catch (Throwable th12) {
                                                                th11.addSuppressed(th12);
                                                                throw th11;
                                                            }
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                }
                                            } catch (FileNotFoundException e12) {
                                                e = e12;
                                                c1022.m2717(6, e);
                                                c1022.f3736 = null;
                                                c1022.f3735 = null;
                                                z2 = false;
                                            } catch (IOException e13) {
                                                e = e13;
                                                c1022.m2717(7, e);
                                                c1022.f3736 = null;
                                                c1022.f3735 = null;
                                                z2 = false;
                                            }
                                        } catch (FileNotFoundException e14) {
                                            e = e14;
                                            c = 1;
                                            c1022.m2717(6, e);
                                            c1022.f3736 = null;
                                            c1022.f3735 = null;
                                            z2 = false;
                                        } catch (IOException e15) {
                                            e = e15;
                                            c = 1;
                                            c1022.m2717(7, e);
                                            c1022.f3736 = null;
                                            c1022.f3735 = null;
                                            z2 = false;
                                        }
                                    } catch (Throwable th15) {
                                        c1022.f3736 = null;
                                        c1022.f3735 = null;
                                        throw th15;
                                    }
                                }
                                if (z2) {
                                    m4180(packageInfo, filesDir);
                                }
                                z3 = z2;
                                if (z3) {
                                    z4 = 0;
                                } else {
                                    z4 = 0;
                                }
                                AbstractC2468.m4404(context, z4);
                        }
                    }
                    interfaceC2463 = c1022.f3730;
                    c1030Arr = c1022.f3735;
                    bArr = c1022.f3731;
                    if (c1030Arr != null) {
                        if (c1022.f3734) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArr4);
                        byteArrayOutputStream.write(bArr);
                        if (AbstractC2235.m4218(byteArrayOutputStream, bArr, c1030Arr)) {
                            interfaceC2463.mo3554(5, null);
                            c1022.f3735 = null;
                            byteArrayOutputStream.close();
                        } else {
                            c1022.f3736 = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            c1022.f3735 = null;
                        }
                    }
                    bArr2 = c1022.f3736;
                    if (bArr2 != null) {
                        if (c1022.f3734) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                        fileOutputStream = new FileOutputStream(c1022.f3732);
                        bArr3 = new byte[512];
                        while (true) {
                            i = byteArrayInputStream.read(bArr3);
                            if (i > 0) {
                                fileOutputStream.write(bArr3, 0, i);
                            } else {
                                c = 1;
                                c1022.m2717(1, null);
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                c1022.f3736 = null;
                                c1022.f3735 = null;
                                z2 = true;
                            }
                            th = th;
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                    z2 = false;
                    c = 1;
                    if (z2) {
                        m4180(packageInfo, filesDir);
                    }
                    z3 = z2;
                    if (z3) {
                        z4 = 0;
                    } else {
                        z4 = 0;
                    }
                    AbstractC2468.m4404(context, z4);
                } catch (Throwable th16) {
                    try {
                        fileInputStreamM2716.close();
                        throw th16;
                    } catch (IOException e16) {
                        interfaceC2462.mo3554(7, e16);
                        throw th16;
                    }
                }
                c1022.f3734 = true;
                c = '\b';
            }
            c = 1;
            z3 = false;
            if (z3) {
                z4 = 0;
            } else {
                z4 = 0;
            }
            AbstractC2468.m4404(context, z4);
        } catch (PackageManager.NameNotFoundException e17) {
            interfaceC2462.mo3554(7, e17);
            AbstractC2468.m4404(context, false);
        }
    }
}
