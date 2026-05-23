package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.core.p001native.AudioNative;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲇᤞᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1459 implements InterfaceC0974, InterfaceC0766 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final Object[] f5193 = new Object[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C0373 f5194 = new C0373(17);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static String f5195;

    public AbstractC1459() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C1809 m3173(C1809 c1809) {
        c1809.m3568();
        c1809.f6046 = true;
        return c1809.f6045 > 0 ? c1809 : C1809.f6043;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C2656 m3174(String str, AbstractC1460 abstractC1460, InterfaceC2654[] interfaceC2654Arr, InterfaceC1425 interfaceC1425) {
        if (AbstractC2841.m4836(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC1460.equals(C2851.f9111)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C0708 c0708 = new C0708(str);
        interfaceC1425.invoke(c0708);
        return new C2656(str, abstractC1460, c0708.f2691.size(), AbstractC0270.m1389(interfaceC2654Arr), c0708);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final void m3175(View view) {
        C2651 c2651 = new C2651();
        C3585 c3585 = new C3585(view, c2651);
        c3585.f11220 = c2651;
        c2651.f8556 = c3585;
        while (c2651.hasNext()) {
            View view2 = (View) c2651.next();
            C2377 c2377 = (C2377) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (c2377 == null) {
                c2377 = new C2377();
                view2.setTag(R.id.pooling_container_listener_holder_tag, c2377);
            }
            ArrayList arrayList = c2377.f7632;
            int iM2211 = AbstractC0745.m2211(arrayList);
            if (-1 < iM2211) {
                arrayList.get(iM2211).getClass();
                throw new ClassCastException();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final void m3176(int i, int i2, InterfaceC2654 interfaceC2654) {
        if (i > 0) {
            return;
        }
        throw new C1653(i + " is not allowed in ProtoNumber for property '" + interfaceC2654.mo3474(i2) + "' of '" + interfaceC2654.mo1342() + "', because protobuf supports field numbers in range 1..2147483647");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static void m3177(File file, String str) throws IOException {
        if (!file.exists() || file.length() == 0) {
            StringBuilder sbM4753 = AbstractC2784.m4753(str);
            sbM4753.append(": 文件不存在或为空");
            throw new IOException(sbM4753.toString());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static C1374 m3178(Context context) {
        ProviderInfo providerInfo;
        C1372 c1372;
        ApplicationInfo applicationInfo;
        C0373 c0983 = Build.VERSION.SDK_INT >= 28 ? new C0983(16) : new C0373(16);
        PackageManager packageManager = context.getPackageManager();
        AbstractC2665.m4661(packageManager, "Package manager required to locate emoji font provider");
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
            c1372 = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo1517 = c0983.mo1517(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo1517) {
                    arrayList.add(signature.toByteArray());
                }
                c1372 = new C1372(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                c1372 = null;
            }
        }
        if (c1372 == null) {
            return null;
        }
        return new C1374(new C1373(context, c1372));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static void m3179(View view, InterfaceC3594 interfaceC3594) {
        Field field = AbstractC3578.f11184;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        C1348 c1348 = new C1348();
        c1348.f4822 = paddingStart;
        c1348.f4823 = paddingTop;
        c1348.f4824 = paddingEnd;
        c1348.f4825 = paddingBottom;
        AbstractC3570.m5151(view, new C2825(interfaceC3594, 5, c1348));
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3593());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static float m3180(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static final long m3181(InterfaceC2654 interfaceC2654, int i) {
        List listMo3475 = interfaceC2654.mo3475(i);
        int i2 = i + 1;
        int size = listMo3475.size();
        EnumC2429 enumC2429Type = EnumC2429.DEFAULT;
        int iNumber = i2;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            Annotation annotation = (Annotation) listMo3475.get(i3);
            if (annotation instanceof InterfaceC2430) {
                iNumber = ((InterfaceC2430) annotation).number();
                m3176(iNumber, i3, interfaceC2654);
            } else if (annotation instanceof InterfaceC2433) {
                enumC2429Type = ((InterfaceC2433) annotation).type();
            } else if (annotation instanceof InterfaceC2432) {
                z2 = true;
            } else if (annotation instanceof InterfaceC2431) {
                z = true;
            }
        }
        if (!z) {
            i2 = iNumber;
        }
        return ((long) i2) | (z ? JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL : 0L) | (z2 ? JSONWriter.MASK_IGNORE_NON_FIELD_GETTER : 0L) | enumC2429Type.f7726;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static final int m3182(InterfaceC2654 interfaceC2654, int i) {
        List listMo3475 = interfaceC2654.mo3475(i);
        int iNumber = i + 1;
        int size = listMo3475.size();
        for (int i2 = 0; i2 < size; i2++) {
            Annotation annotation = (Annotation) listMo3475.get(i2);
            if (annotation instanceof InterfaceC2431) {
                return -2;
            }
            if (annotation instanceof InterfaceC2430) {
                iNumber = ((InterfaceC2430) annotation).number();
                m3176(iNumber, i2, interfaceC2654);
            }
        }
        return iNumber;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static C1974 m3183(DexKitBridge dexKitBridge, C0049 c0049) {
        int iM910 = c0049.m910(10);
        int i = iM910 != 0 ? c0049.f980.getInt(iM910 + c0049.f979) : 0;
        if ((i & 131072) > 0) {
            i = (i ^ 131072) | 32;
        }
        int i2 = i;
        int iM911 = c0049.m910(4);
        int i3 = iM911 != 0 ? c0049.f980.getInt(iM911 + c0049.f979) : 0;
        int iM912 = c0049.m910(6);
        int i4 = iM912 != 0 ? c0049.f980.getInt(iM912 + c0049.f979) : 0;
        int iM913 = c0049.m910(8);
        int i5 = iM913 != 0 ? c0049.f980.getInt(iM913 + c0049.f979) : 0;
        int iM914 = c0049.m910(12);
        String strM912 = iM914 != 0 ? c0049.m912(iM914 + c0049.f979) : null;
        if (strM912 == null) {
            strM912 = "";
        }
        String str = strM912;
        int iM915 = c0049.m910(14);
        int i6 = iM915 != 0 ? c0049.f980.getInt(iM915 + c0049.f979) : 0;
        ArrayList arrayList = new ArrayList();
        int iM916 = c0049.m910(16);
        int iM917 = iM916 != 0 ? c0049.m914(iM916) : 0;
        for (int i7 = 0; i7 < iM917; i7++) {
            int iM918 = c0049.m910(16);
            arrayList.add(Integer.valueOf(iM918 != 0 ? c0049.f980.getInt((i7 * 4) + c0049.m913(iM918)) : 0));
        }
        return new C1974(dexKitBridge, i3, i4, i5, i2, str, i6, arrayList);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public static final List m3184(InterfaceC2654 interfaceC2654) {
        List<InterfaceC2654> listM2206;
        AbstractC1460 abstractC1460Mo3472 = interfaceC2654.mo3472();
        if (AbstractC2207.m4087(abstractC1460Mo3472, C2374.f7630)) {
            InterfaceC1736 interfaceC1736M4004 = AbstractC2202.m4004(interfaceC2654);
            listM2206 = C1189.f4329;
            if (interfaceC1736M4004 != null) {
                listM2206 = new ArrayList(AbstractC0746.m2214(listM2206, 10));
            }
        } else {
            if (!AbstractC2207.m4087(abstractC1460Mo3472, C2374.f7631)) {
                throw new IllegalArgumentException("Class " + interfaceC2654.mo1342() + " should be abstract or sealed or interface to be used as @ProtoOneOf property.");
            }
            listM2206 = AbstractC0744.m2206(new C1630(2, interfaceC2654.mo3476(1)));
        }
        for (InterfaceC2654 interfaceC2655 : listM2206) {
            List listMo3475 = interfaceC2655.mo3475(0);
            if (listMo3475 == null || !listMo3475.isEmpty()) {
                Iterator it = listMo3475.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!(((Annotation) it.next()) instanceof InterfaceC2430));
            }
            throw new IllegalArgumentException(interfaceC2655.mo1342() + " implementing oneOf type " + interfaceC2654.mo1342() + " should have @ProtoNumber annotation in its single property.");
        }
        return listM2206;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static ViewGroup m3185(View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static Set m3186() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public static final EnumC2429 m3187(long j) {
        long j2 = j & 25769803776L;
        if (j2 == 0) {
            return EnumC2429.DEFAULT;
        }
        return j2 == 8589934592L ? EnumC2429.SIGNED : EnumC2429.FIXED;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public static int m3188(String str) throws IOException {
        File file = new File(str);
        String[] strArr = AbstractC1574.f5469;
        m3177(file, "getSilkDuration");
        File fileM3189 = m3189("pcm");
        AudioNative.f969.silkToPcmConvert(file.getAbsolutePath(), fileM3189.getAbsolutePath(), false, 24000, 0);
        int length = (int) ((fileM3189.length() / ((long) 48000)) * ((long) 1000));
        fileM3189.delete();
        if (length < 1) {
            return 1;
        }
        return length;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public static File m3189(String str) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("tmp_audio_");
        sb.append(str);
        sb.append('_');
        sb.append(System.currentTimeMillis());
        sb.append('.');
        sb.append(str);
        String string = sb.toString();
        String str2 = f5195;
        if (str2 != null) {
            return new File(str2, string);
        }
        throw new IllegalArgumentException("AudioUtil must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public static final boolean m3190(C1706 c1706, InterfaceC2654 interfaceC2654) {
        c1706.f5799.getClass();
        List annotations = interfaceC2654.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof InterfaceC1719) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public static boolean m3191(View view) {
        Field field = AbstractC3578.f11184;
        return view.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public static final boolean m3192(long j) {
        return (j & JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public static final boolean m3193(InterfaceC2654 interfaceC2654) {
        return !interfaceC2654.mo3358() ? !(interfaceC2654.mo3472() instanceof AbstractC2398) || AbstractC2207.m4087(interfaceC2654.mo3472(), C2397.f7668) : !(interfaceC2654.mo3473() == 1 && m3193(interfaceC2654.mo3476(0)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public static final void m3194(C1706 c1706, InterfaceC2654 interfaceC2654) {
        if (AbstractC2207.m4087(interfaceC2654.mo3472(), C2851.f9111)) {
            c1706.f5799.getClass();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public static PorterDuff.Mode m3195(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case Opcodes.DCONST_0 /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public static File m3196(File file) throws IOException {
        String[] strArr = AbstractC1574.f5469;
        m3177(file, "silkToMp3");
        File fileM3189 = m3189("pcm");
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = fileM3189.getAbsolutePath();
        AudioNative audioNative = AudioNative.f969;
        audioNative.silkToPcmConvert(absolutePath, absolutePath2, false, 24000, 0);
        File fileM31810 = m3189("mp3");
        String absolutePath3 = fileM3189.getAbsolutePath();
        String absolutePath4 = fileM31810.getAbsolutePath();
        audioNative.pcmToMp3Init(24000, 1.0f, 1, 24000, 48, 8, 5, 128, 0, 3, 0, 0);
        audioNative.pcmToMp3Convert(absolutePath3, absolutePath4);
        audioNative.pcmToMp3Close();
        fileM3189.delete();
        return fileM31810;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
    public static final Object[] m3197(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArrCopyOf, i2);
                    }
                    i = i2;
                }
            }
        }
        return f5193;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
    public static final Object[] m3198(Collection collection, Object[] objArr) {
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ, reason: contains not printable characters */
    public static int m3199(int i) {
        int i2 = i >> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 7;
            i3++;
        }
        return i3 + 1;
    }

    @Override // p000.InterfaceC0766
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public InterfaceC0974 mo2229(C2395 c2395, int i) {
        return mo2517(c2395.mo3476(i));
    }

    @Override // p000.InterfaceC0974
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public boolean mo2513() {
        m3204();
        throw null;
    }

    @Override // p000.InterfaceC0974
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public char mo2514() {
        m3204();
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public abstract Typeface mo3200(Context context, C1380 c1380, Resources resources, int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public abstract Typeface mo3201(Context context, C1383[] c1383Arr, int i);

    @Override // p000.InterfaceC0766
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public double mo2231(C2395 c2395, int i) {
        return mo2524();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public Typeface mo3202(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    @Override // p000.InterfaceC0766
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public char mo2232(C2395 c2395, int i) {
        return mo2514();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public Typeface mo3203(Context context, Resources resources, int i, String str, int i2) {
        File fileM3217 = AbstractC1460.m3217(context);
        if (fileM3217 == null) {
            return null;
        }
        try {
            if (AbstractC1460.m3213(fileM3217, resources, i)) {
                return Typeface.createFromFile(fileM3217.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM3217.delete();
        }
    }

    @Override // p000.InterfaceC0766
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public float mo2233(C2395 c2395, int i) {
        return mo2523();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public void m3204() {
        throw new C1653(AbstractC2519.m4527(getClass()) + " can't retrieve untyped values");
    }

    @Override // p000.InterfaceC0766
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public byte mo2234(C2395 c2395, int i) {
        return mo2521();
    }

    @Override // p000.InterfaceC0766
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public String mo2235(InterfaceC2654 interfaceC2654, int i) {
        return mo2518();
    }

    @Override // p000.InterfaceC0974
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public abstract int mo2516();

    @Override // p000.InterfaceC0766
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ */
    public short mo2236(C2395 c2395, int i) {
        return mo2522();
    }

    @Override // p000.InterfaceC0766
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public Object mo2237(InterfaceC2654 interfaceC2654, int i, InterfaceC1743 interfaceC1743, Object obj) {
        return mo2515(interfaceC1743);
    }

    @Override // p000.InterfaceC0766
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public int mo2238(InterfaceC2654 interfaceC2654, int i) {
        return mo2516();
    }

    @Override // p000.InterfaceC0974
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ */
    public String mo2518() {
        m3204();
        throw null;
    }

    @Override // p000.InterfaceC0974
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public abstract long mo2519();

    @Override // p000.InterfaceC0974
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public boolean mo2520() {
        return true;
    }

    @Override // p000.InterfaceC0766
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ */
    public Object mo2239(InterfaceC2654 interfaceC2654, int i, InterfaceC1743 interfaceC1743, Object obj) {
        if (interfaceC1743.mo1363().mo3470() || mo2520()) {
            return mo2515(interfaceC1743);
        }
        return null;
    }

    @Override // p000.InterfaceC0766
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ */
    public long mo2240(C2395 c2395, int i) {
        return mo2519();
    }

    @Override // p000.InterfaceC0766
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ */
    public boolean mo2241(InterfaceC2654 interfaceC2654, int i) {
        return mo2513();
    }

    @Override // p000.InterfaceC0974
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ */
    public abstract byte mo2521();

    @Override // p000.InterfaceC0974
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ */
    public abstract short mo2522();

    @Override // p000.InterfaceC0974
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ */
    public float mo2523() {
        m3204();
        throw null;
    }

    @Override // p000.InterfaceC0974
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ */
    public double mo2524() {
        m3204();
        throw null;
    }

    @Override // p000.InterfaceC0766
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo2228(InterfaceC2654 interfaceC2654) {
    }

    @Override // p000.InterfaceC0974
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public InterfaceC0766 mo2512(InterfaceC2654 interfaceC2654) {
        return this;
    }

    @Override // p000.InterfaceC0974
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ */
    public InterfaceC0974 mo2517(InterfaceC2654 interfaceC2654) {
        return this;
    }
}
