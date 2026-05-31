package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewParent;
import com.alibaba.fastjson2.JSONB;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲈᲀᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1586 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final byte[] f5499 = {1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 2, 3, 5, 2, 2, 3, 2, 1, 1, 2, 2, 1, 2, 2, 3, 3, 3, 1, 1, 2, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 1, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 3, 3, 2, 2};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final InterfaceC2715[] f5500 = new InterfaceC2715[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static volatile boolean f5501 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C0519 f5502 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static boolean f5503 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static Field f5504;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static boolean f5505;

    public AbstractC1586() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final void m3467(InterfaceC1207 interfaceC1207) {
        if ((interfaceC1207 instanceof C2889 ? (C2889) interfaceC1207 : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + AbstractC2574.m4549(interfaceC1207.getClass()));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2888 m3468(InterfaceC0978 interfaceC0978) {
        C2888 c2888 = interfaceC0978 instanceof C2888 ? (C2888) interfaceC0978 : null;
        if (c2888 != null) {
            return c2888;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + AbstractC2574.m4549(interfaceC0978.getClass()));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final Set m3469(InterfaceC2715 interfaceC2715) {
        if (interfaceC2715 instanceof InterfaceC0523) {
            return ((InterfaceC0523) interfaceC2715).mo2015();
        }
        HashSet hashSet = new HashSet(interfaceC2715.mo3641());
        int iMo3641 = interfaceC2715.mo3641();
        for (int i = 0; i < iMo3641; i++) {
            hashSet.add(interfaceC2715.mo3642(i));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final InterfaceC2715[] m3470(List list) {
        InterfaceC2715[] interfaceC2715Arr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC2715Arr = (InterfaceC2715[]) list.toArray(new InterfaceC2715[0])) == null) ? f5500 : interfaceC2715Arr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static int m3471(C2559 c2559, AbstractC1144 abstractC1144, View view, View view2, AbstractC2546 abstractC2546, boolean z) {
        if (abstractC2546.m4489() == 0 || c2559.m4527() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC2546.m4482(view) - AbstractC2546.m4482(view2)) + 1;
        }
        return Math.min(abstractC1144.mo2891(), abstractC1144.mo2881(view2) - abstractC1144.mo2884(view));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static int m3472(C2559 c2559, AbstractC1144 abstractC1144, View view, View view2, AbstractC2546 abstractC2546, boolean z, boolean z2) {
        if (abstractC2546.m4489() == 0 || c2559.m4527() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c2559.m4527() - Math.max(AbstractC2546.m4482(view), AbstractC2546.m4482(view2))) - 1) : Math.max(0, Math.min(AbstractC2546.m4482(view), AbstractC2546.m4482(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC1144.mo2881(view2) - abstractC1144.mo2884(view)) / (Math.abs(AbstractC2546.m4482(view) - AbstractC2546.m4482(view2)) + 1))) + (abstractC1144.mo2890() - abstractC1144.mo2884(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static int m3473(C2559 c2559, AbstractC1144 abstractC1144, View view, View view2, AbstractC2546 abstractC2546, boolean z) {
        if (abstractC2546.m4489() == 0 || c2559.m4527() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c2559.m4527();
        }
        return (int) (((abstractC1144.mo2881(view2) - abstractC1144.mo2884(view)) / (Math.abs(AbstractC2546.m4482(view) - AbstractC2546.m4482(view2)) + 1)) * c2559.m4527());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static AbstractC1471 m3474(int i) {
        if (i != 0) {
            return i != 1 ? new C2666() : new C0950();
        }
        return new C2666();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static Drawable m3475(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f5501) {
                return m3479(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            f5501 = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = AbstractC2638.f8340;
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static Activity m3476() {
        String[] strArr = AbstractC1471.f5234;
        try {
            int i = AbstractC1768.f5906;
            C1681 c1681M4712 = AbstractC2727.m4712(AbstractC0972.m2606("android.app.ActivityThread"));
            C2933 c2933 = C0160.f1227;
            ((C1958) c1681M4712.f5660).f6471 = AbstractC2234.m4168();
            C2004 c2004M3560 = c1681M4712.m3560();
            c2004M3560.f6475 = "currentActivityThread";
            C1300 c1300M3558 = AbstractC2727.m4713(((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4025(new Object[0])).m3558();
            c1300M3558.f6475 = "mActivities";
            for (Object obj : ((Map) ((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3127()).values()) {
                int i2 = AbstractC1768.f5906;
                C1300 c1300M3559 = AbstractC2727.m4713(obj).m3558();
                c1300M3559.f6475 = "paused";
                if (!((Boolean) ((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3127()).booleanValue()) {
                    C1300 c1300M35510 = AbstractC2727.m4713(obj).m3558();
                    c1300M35510.f6475 = "activity";
                    return (Activity) ((C1316) AbstractC0739.m2290(c1300M35510.m3117())).m3127();
                }
            }
            return null;
        } catch (Exception e) {
            ArrayList arrayList = C3741.f11709;
            C3741.m5315("getCurrentActivity Failed", e, 12);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static ArrayList m3477(byte[] bArr, C1029 c1029, String str) throws NoSuchMethodException {
        int iM3488;
        Integer num;
        String[] strArr = AbstractC1471.f5234;
        "buf == null";
        "method == null";
        m3484(88, bArr);
        int iM3484 = m3484(92, bArr);
        int iM3485 = m3484(96, bArr);
        int iM3486 = m3484(100, bArr);
        int i = 0;
        loop0: while (true) {
            if (i >= iM3485) {
                iM3488 = 0;
                break;
            }
            int i2 = (i * 32) + iM3486;
            int iM3487 = m3484(i2, bArr);
            int iM3489 = m3484(i2 + 24, bArr);
            String str2 = c1029.f3766;
            String str3 = c1029.f3768;
            String str4 = c1029.f3767;
            if (str2.equals(m3487(iM3487, bArr))) {
                int[] iArr = {iM3489};
                if (iM3489 == 0) {
                    continue;
                } else {
                    int iM34810 = m3488(bArr, iArr);
                    int iM34811 = m3488(bArr, iArr);
                    int iM34812 = m3488(bArr, iArr);
                    int iM34813 = m3488(bArr, iArr);
                    for (int i3 = 0; i3 < iM34810 + iM34811; i3++) {
                        m3488(bArr, iArr);
                        m3488(bArr, iArr);
                    }
                    int iM34814 = 0;
                    for (int i4 = 0; i4 < iM34812; i4++) {
                        iM34814 += m3488(bArr, iArr);
                        m3488(bArr, iArr);
                        iM3488 = m3488(bArr, iArr);
                        if (iM3488 != 0) {
                            int i5 = (iM34814 * 8) + iM3484;
                            String strM3486 = m3486(m3484(i5 + 4, bArr), bArr);
                            String strM3485 = m3485(m3483(i5 + 2, bArr), bArr);
                            if (str4.equals(strM3486) && str3.equals(strM3485)) {
                                break loop0;
                            }
                        }
                    }
                    int iM34815 = 0;
                    for (int i6 = 0; i6 < iM34813; i6++) {
                        iM34815 += m3488(bArr, iArr);
                        m3488(bArr, iArr);
                        iM3488 = m3488(bArr, iArr);
                        if (iM3488 != 0) {
                            int i7 = (iM34815 * 8) + iM3484;
                            String strM3487 = m3486(m3484(i7 + 4, bArr), bArr);
                            String strM3488 = m3485(m3483(i7 + 2, bArr), bArr);
                            if (str4.equals(strM3487) && str3.equals(strM3488)) {
                                break loop0;
                            }
                        }
                    }
                }
            }
            i++;
        }
        if (iM3488 == 0) {
            throw new NoSuchMethodException(c1029.toString());
        }
        int iM3483 = m3483(iM3488, bArr);
        m3483(iM3488 + 2, bArr);
        m3483(iM3488 + 4, bArr);
        m3483(iM3488 + 6, bArr);
        int iM34816 = m3483(iM3488 + 12, bArr);
        int i8 = iM3488 + 16;
        Integer[] numArr = new Integer[iM3483];
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < iM34816) {
            int i10 = (i9 * 2) + i8;
            int i11 = bArr[i10] & 255;
            byte b = f5499[i11];
            if (b == 0) {
                throw new RuntimeException(String.format(Locale.ROOT, "Unrecognized opcode = 0x%02x", Integer.valueOf(i11)));
            }
            if (i11 == 20) {
                numArr[bArr[i10 + 1] & 255] = Integer.valueOf(((m3483(i10 + 4, bArr) << 16) & (-65536)) | m3483(i10 + 2, bArr));
            } else {
                if (i11 == 110) {
                    int iM34817 = (m3483(i10 + 2, bArr) * 8) + m3484(92, bArr);
                    String strM3489 = m3487(m3483(iM34817, bArr), bArr);
                    String strM34810 = m3485(m3483(iM34817 + 2, bArr), bArr);
                    String strM34811 = m3486(m3484(iM34817 + 4, bArr), bArr);
                    strM34810.getClass();
                    StringBuilder sbM4787 = AbstractC2844.m4787(strM3489);
                    sbM4787.append("->");
                    sbM4787.append(strM34811);
                    sbM4787.append(strM34810);
                    if (sbM4787.toString().equals(str) && (num = numArr[(m3483(i10 + 4, bArr) >> 4) & 15]) != null) {
                        arrayList.add(num);
                    }
                }
                i9 += b;
            }
            i9 += b;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final void m3478(C0535 c0535, C0532 c0532) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0535.f2241;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c0535);
            if (obj instanceof C0148) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c0535, obj, c0532)) {
                    if (atomicReferenceFieldUpdater.get(c0535) != obj) {
                    }
                }
                return;
            }
            Throwable th = null;
            if (obj instanceof C0532) {
                C0535.m2033(c0532, obj);
                throw null;
            }
            if (obj instanceof C0757) {
                C0757 c0757 = (C0757) obj;
                if (!C0757.f2860.compareAndSet(c0757, 0, 1)) {
                    C0535.m2033(c0532, obj);
                    throw null;
                }
                if (obj instanceof C0536) {
                    c0535.m2040(c0532, c0757.f2861);
                    return;
                }
                return;
            }
            if (!(obj instanceof C0755)) {
                C0755 c0755 = new C0755(obj, c0532, th, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(c0535, obj, c0755)) {
                    if (atomicReferenceFieldUpdater.get(c0535) != obj) {
                    }
                }
                return;
            }
            C0755 c0756 = (C0755) obj;
            if (c0756.f2855 != null) {
                C0535.m2033(c0532, obj);
                throw null;
            }
            Throwable th2 = c0756.f2858;
            if (th2 != null) {
                c0535.m2040(c0532, th2);
                return;
            }
            C0755 c0755M2328 = C0755.m2328(c0756, c0532, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(c0535, obj, c0755M2328)) {
                if (atomicReferenceFieldUpdater.get(c0535) != obj) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static Drawable m3479(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C0840 c0840 = new C0840(context);
            c0840.f3252 = theme;
            Configuration configuration = theme.getResources().getConfiguration();
            if (c0840.f3255 != null) {
                throw new IllegalStateException("getResources() or getAssets() has already been called");
            }
            if (c0840.f3254 != null) {
                throw new IllegalStateException("Override configuration has already been set");
            }
            c0840.f3254 = new Configuration(configuration);
            context = c0840;
        }
        return C1787.m3667(context, i);
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011b A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x011f A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x014c A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0150 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static InterfaceC1387 m3480(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i;
        int i2;
        ?? r3;
        long j;
        Throwable th;
        ?? r4;
        ExecutorService executorService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m3490(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2517.f7967);
        int i3 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i4 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2517.f7968);
                        int i5 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i6 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i7 = typedArrayObtainAttributes2.getInt(i6, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i8, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i8);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m3490(xmlResourceParser);
                        }
                        arrayList.add(new C1389(string7, i5, z, string6, i7, resourceId2));
                    } else {
                        m3490(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C1388((C1389[]) arrayList.toArray(new C1389[0]));
        }
        List listM3482 = m3482(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i4) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2517.f7969);
                    int i9 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i3);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            r3 = typedArrayObtainAttributes3;
                            j = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                m3490(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r4 = typedArrayObtainAttributes3;
                                j = 1;
                            }
                        }
                        try {
                            r3 = typedArrayObtainAttributes3;
                            i2 = i9;
                            j = 1;
                            try {
                                C1380 c1380 = new C1380(string, string2, string8, listM3482, string9, string10);
                                if (r3 instanceof AutoCloseable) {
                                    ((AutoCloseable) r3).close();
                                } else if (r3 instanceof ExecutorService) {
                                    ExecutorService executorService2 = (ExecutorService) r3;
                                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                                        executorService2.shutdown();
                                        boolean z2 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService2.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r3.recycle();
                                }
                                arrayList2.add(c1380);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r3 = typedArrayObtainAttributes3;
                            j = 1;
                            th = th;
                            r4 = r3;
                            if (r4 != 0) {
                                throw th;
                            }
                            try {
                                if (!(r4 instanceof AutoCloseable)) {
                                    ((AutoCloseable) r4).close();
                                    throw th;
                                }
                                if (r4 instanceof ExecutorService) {
                                    r4.recycle();
                                    throw th;
                                }
                                executorService = (ExecutorService) r4;
                                if (executorService != ForkJoinPool.commonPool()) {
                                    throw th;
                                }
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                        th = th3;
                    } catch (Throwable th6) {
                        th = th6;
                        r3 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r4 = r3;
                    if (r4 != 0) {
                        throw th;
                    }
                    if (!(r4 instanceof AutoCloseable)) {
                        ((AutoCloseable) r4).close();
                        throw th;
                    }
                    if (r4 instanceof ExecutorService) {
                        r4.recycle();
                        throw th;
                    }
                    executorService = (ExecutorService) r4;
                    if (executorService != ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        throw th;
                    }
                    executorService.shutdown();
                    boolean z3 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(j, TimeUnit.DAYS);
                        } catch (InterruptedException unused2) {
                            if (!z3) {
                                executorService.shutdownNow();
                                z3 = true;
                            }
                        }
                    }
                    if (!z3) {
                        throw th;
                    }
                    Thread.currentThread().interrupt();
                    throw th;
                }
                i2 = integer;
                m3490(xmlResourceParser);
                integer = i2;
                string3 = string3;
                string4 = string4;
                i = 2;
                i3 = 0;
                i4 = 3;
            }
        }
        int i10 = integer;
        String str = string3;
        String str2 = string4;
        if (!arrayList2.isEmpty()) {
            return new C1390(arrayList2, i10, integer2, string5);
        }
        if (str == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new C1380(string, string2, str, listM3482, null, null));
        if (str2 != null) {
            arrayList2.add(new C1380(string, string2, str2, listM3482, null, null));
        }
        return new C1390(arrayList2, i10, integer2, string5);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static InterfaceC0876 m3481(InterfaceC0876 interfaceC0876, InterfaceC0876 interfaceC0877) {
        return interfaceC0877 == C1189.f4324 ? interfaceC0876 : (InterfaceC0876) interfaceC0877.mo1084(interfaceC0876, new C0192(3));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static List m3482(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static int m3483(int i, byte[] bArr) {
        return ((bArr[i + 1] << 8) & 65280) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static int m3484(int i, byte[] bArr) {
        return ((bArr[i + 3] << 24) & (-16777216)) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280) | ((bArr[i + 2] << 16) & 16711680);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static String m3485(int i, byte[] bArr) {
        int iM3484 = (i * 12) + m3484(76, bArr);
        int iM3485 = m3484(iM3484 + 4, bArr);
        int iM3486 = m3484(iM3484 + 8, bArr);
        String[] strArr = AbstractC1471.f5234;
        StringBuilder sb = new StringBuilder("(");
        if (iM3486 != 0) {
            int iM3487 = m3484(iM3486, bArr);
            for (int i2 = 0; i2 < iM3487; i2++) {
                sb.append(m3487(m3483((i2 * 2) + iM3486 + 4, bArr), bArr));
            }
        }
        sb.append(")");
        sb.append(m3487(iM3485, bArr));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static String m3486(int i, byte[] bArr) {
        int[] iArr = {m3484((i * 4) + m3484(60, bArr), bArr)};
        return new String(bArr, iArr[0], m3488(bArr, iArr));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static String m3487(int i, byte[] bArr) {
        return m3486(m3484((i * 4) + m3484(68, bArr), bArr), bArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static int m3488(byte[] bArr, int[] iArr) {
        int i = 0;
        int i2 = 0;
        do {
            int i3 = iArr[0];
            byte b = bArr[i3];
            i |= (b & JSONB.Constants.BC_SYMBOL) << (i2 * 7);
            i2++;
            iArr[0] = i3 + 1;
            if ((b & 128) != 128) {
                break;
            }
        } while (i2 < 5);
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static void m3489(View view, C1948 c1948) {
        C1142 c1142 = c1948.f6437.f6420;
        if (c1142 == null || !c1142.f4238) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            Field field = AbstractC3638.f11333;
            elevation += ((View) parent).getElevation();
        }
        C1947 c1947 = c1948.f6437;
        if (c1947.f6430 != elevation) {
            c1947.f6430 = elevation;
            c1948.m3921();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static void m3490(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public abstract Typeface mo3491(Context context, C1388 c1388, Resources resources, int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public abstract Typeface mo3492(Context context, C1391[] c1391Arr, int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public Typeface mo3493(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Typeface mo3494(Context context, Resources resources, int i, String str, int i2) {
        File fileM4171 = AbstractC2234.m4171(context);
        if (fileM4171 == null) {
            return null;
        }
        try {
            if (AbstractC2234.m4160(fileM4171, resources, i)) {
                return Typeface.createFromFile(fileM4171.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM4171.delete();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public float mo3495(View view) {
        if (f5503) {
            try {
                return AbstractC3656.m5212(view);
            } catch (NoSuchMethodError unused) {
                f5503 = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public void mo3496(View view, float f) {
        if (f5503) {
            try {
                AbstractC3656.m5213(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f5503 = false;
            }
        }
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public void mo3497(View view, int i) {
        if (!f5505) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f5504 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f5505 = true;
        }
        Field field = f5504;
        if (field != null) {
            try {
                f5504.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
