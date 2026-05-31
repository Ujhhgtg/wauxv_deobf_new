package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.AbstractC1095;
import p000.AbstractC1467;
import p000.AbstractC1469;
import p000.AbstractC2240;
import p000.AbstractC3580;
import p000.C0274;
import p000.C0348;
import p000.C0441;
import p000.C0967;
import p000.C1047;
import p000.C1216;
import p000.C1217;
import p000.C1224;
import p000.C1472;
import p000.C1477;
import p000.C1531;
import p000.C1681;
import p000.C1893;
import p000.C1894;
import p000.C1897;
import p000.C1970;
import p000.C1971;
import p000.C2620;
import p000.C2773;
import p000.ComponentCallbacks2C2619;
import p000.ExecutorServiceC1476;
import p000.InterfaceC0399;
import p000.ThreadFactoryC0150;
import p000.ThreadFactoryC1475;

/* JADX INFO: renamed from: com.bumptech.glide.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0027 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static volatile ComponentCallbacks2C0027 f587;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static volatile boolean f588;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC0399 f589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1897 f590;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1472 f591;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1893 f592;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2620 f593;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0348 f594;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final ArrayList f595 = new ArrayList();

    public ComponentCallbacks2C0027(Context context, C1217 c1217, C1897 c1897, InterfaceC0399 interfaceC0399, C1893 c1893, C2620 c2620, C0348 c0348, C1224 c1224, C0274 c0274, List list, ArrayList arrayList, AbstractC2240 abstractC2240, C1477 c1477) {
        new C1216(new C0441(this));
        this.f589 = interfaceC0399;
        this.f592 = c1893;
        this.f590 = c1897;
        this.f593 = c2620;
        this.f594 = c0348;
        if (c1477.f5263.get(AbstractC1469.class) != null) {
            throw new ClassCastException();
        }
        this.f591 = new C1472(context, c1893, new C2773(this, arrayList, abstractC2240), new C1224(20), c1224, c0274, list, c1217, c1477);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static ComponentCallbacks2C0027 m757(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f587 == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (ComponentCallbacks2C0027.class) {
                if (f587 == null) {
                    if (f588) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f588 = true;
                    try {
                        m758(context, generatedAppGlideModule);
                        f588 = false;
                    } catch (Throwable th) {
                        f588 = false;
                        throw th;
                    }
                }
            }
        }
        return f587;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m758(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        C0274 c0274 = new C0274(0);
        C0967 c0967 = new C0967(1);
        C1224 c1224 = new C1224(15);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        AbstractC1467.m3283(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw AbstractC1095.m2792(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw AbstractC1095.m2792(it2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            throw AbstractC1095.m2792(it3);
        }
        ThreadFactoryC0150 threadFactoryC0150 = new ThreadFactoryC0150(1);
        if (ExecutorServiceC1476.f5261 == 0) {
            ExecutorServiceC1476.f5261 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = ExecutorServiceC1476.f5261;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        ThreadFactoryC1475 threadFactoryC1475 = new ThreadFactoryC1475(threadFactoryC0150, "source", false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ExecutorServiceC1476 executorServiceC1476 = new ExecutorServiceC1476(new ThreadPoolExecutor(i, i, 0L, timeUnit, new PriorityBlockingQueue(), threadFactoryC1475));
        ThreadFactoryC0150 threadFactoryC0151 = new ThreadFactoryC0150(1);
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        ExecutorServiceC1476 executorServiceC1477 = new ExecutorServiceC1476(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC1475(threadFactoryC0151, "disk-cache", true)));
        if (ExecutorServiceC1476.f5261 == 0) {
            ExecutorServiceC1476.f5261 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = ExecutorServiceC1476.f5261 >= 4 ? 2 : 1;
        ThreadFactoryC0150 threadFactoryC0152 = new ThreadFactoryC0150(1);
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        ExecutorServiceC1476 executorServiceC1478 = new ExecutorServiceC1476(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC1475(threadFactoryC0152, "animation", true)));
        C1971 c1971 = new C1971(new C1970(applicationContext));
        C0348 c0348 = new C0348(16);
        int i3 = c1971.f6502;
        InterfaceC0399 c1894 = i3 > 0 ? new C1894(i3) : new C0348(3);
        C1893 c1893 = new C1893(c1971.f6504);
        C1897 c1897 = new C1897(c1971.f6503);
        C1047 c1047 = new C1047(applicationContext, 4);
        C1681 c1681 = new C1681();
        c1681.f5660 = c1047;
        C1217 c1217 = new C1217(c1897, c1681, executorServiceC1477, executorServiceC1476, new ExecutorServiceC1476(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC1476.f5260, timeUnit, new SynchronousQueue(), new ThreadFactoryC1475(new ThreadFactoryC0150(1), "source-unlimited", false))), executorServiceC1478);
        List list2 = Collections.EMPTY_LIST;
        C1477 c1477 = new C1477(c0967);
        C2620 c2620 = new C2620();
        new HashMap();
        if (C1531.f5382 && C1531.f5381) {
            Collections.newSetFromMap(new WeakHashMap());
        }
        ComponentCallbacks2C0027 componentCallbacks2C0027 = new ComponentCallbacks2C0027(applicationContext, c1217, c1897, c1894, c1893, c2620, c0348, c1224, c0274, list2, arrayList, generatedAppGlideModule, c1477);
        applicationContext.registerComponentCallbacks(componentCallbacks2C0027);
        f587 = componentCallbacks2C0027;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        AbstractC3580.m5116();
        this.f590.m3831(0L);
        this.f589.mo1621();
        C1893 c1893 = this.f592;
        synchronized (c1893) {
            c1893.m3817(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        AbstractC3580.m5116();
        synchronized (this.f595) {
            try {
                Iterator it = this.f595.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C2619) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1897 c1897 = this.f590;
        c1897.getClass();
        if (i >= 40) {
            c1897.m3831(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c1897) {
                j = c1897.f6290;
            }
            c1897.m3831(j / 2);
        }
        this.f589.mo1620(i);
        C1893 c1893 = this.f592;
        synchronized (c1893) {
            try {
                if (i >= 40) {
                    synchronized (c1893) {
                        c1893.m3817(0);
                    }
                } else if (i >= 20 || i == 15) {
                    c1893.m3817(c1893.f6271 / 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
