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
import p000.AbstractC1194;
import p000.AbstractC2203;
import p000.AbstractC3522;
import p000.AbstractC3681;
import p000.C0094;
import p000.C0264;
import p000.C0373;
import p000.C0963;
import p000.C1216;
import p000.C1227;
import p000.C1461;
import p000.C1466;
import p000.C1519;
import p000.C1867;
import p000.C1868;
import p000.C1871;
import p000.C1939;
import p000.C1940;
import p000.C2564;
import p000.C2712;
import p000.ComponentCallbacks2C2563;
import p000.ExecutorServiceC1465;
import p000.InterfaceC0424;
import p000.ThreadFactoryC0142;
import p000.ThreadFactoryC1464;

/* JADX INFO: renamed from: com.bumptech.glide.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0020 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static volatile ComponentCallbacks2C0020 f535;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static volatile boolean f536;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0424 f537;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1871 f538;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1461 f539;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C1867 f540;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C2564 f541;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0373 f542;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final ArrayList f543 = new ArrayList();

    public ComponentCallbacks2C0020(Context context, C1216 c1216, C1871 c1871, InterfaceC0424 interfaceC0424, C1867 c1867, C2564 c2564, C0373 c0373, C1227 c1227, C0264 c0264, List list, ArrayList arrayList, AbstractC3681 abstractC3681, C1466 c1466) {
        this.f537 = interfaceC0424;
        this.f540 = c1867;
        this.f538 = c1871;
        this.f541 = c2564;
        this.f542 = c0373;
        this.f539 = new C1461(context, c1867, new C2712(this, arrayList, abstractC3681), new C1227(19), c1227, c0264, list, c1216, c1466);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static ComponentCallbacks2C0020 m614(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f535 == null) {
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
            synchronized (ComponentCallbacks2C0020.class) {
                if (f535 == null) {
                    if (f536) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f536 = true;
                    try {
                        m615(context, generatedAppGlideModule);
                        f536 = false;
                    } catch (Throwable th) {
                        f536 = false;
                        throw th;
                    }
                }
            }
        }
        return f535;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m615(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        C0264 c0264 = new C0264(0);
        C0963 c0963 = new C0963(1);
        C1227 c1227 = new C1227(14);
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
                        AbstractC2203.m4037(str);
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
                throw AbstractC1194.m2777(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw AbstractC1194.m2777(it2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            throw AbstractC1194.m2777(it3);
        }
        ThreadFactoryC0142 threadFactoryC0142 = new ThreadFactoryC0142(1);
        if (ExecutorServiceC1465.f5229 == 0) {
            ExecutorServiceC1465.f5229 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = ExecutorServiceC1465.f5229;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ExecutorServiceC1465 executorServiceC1465 = new ExecutorServiceC1465(new ThreadPoolExecutor(i, i, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC1464(threadFactoryC0142, "source", false)));
        ThreadFactoryC0142 threadFactoryC0143 = new ThreadFactoryC0142(1);
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        ExecutorServiceC1465 executorServiceC1466 = new ExecutorServiceC1465(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC1464(threadFactoryC0143, "disk-cache", true)));
        if (ExecutorServiceC1465.f5229 == 0) {
            ExecutorServiceC1465.f5229 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = ExecutorServiceC1465.f5229 >= 4 ? 2 : 1;
        ThreadFactoryC0142 threadFactoryC0144 = new ThreadFactoryC0142(1);
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        ExecutorServiceC1465 executorServiceC1467 = new ExecutorServiceC1465(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC1464(threadFactoryC0144, "animation", true)));
        C1940 c1940 = new C1940(new C1939(applicationContext));
        C0373 c0373 = new C0373(15);
        int i3 = c1940.f6397;
        InterfaceC0424 c1868 = i3 > 0 ? new C1868(i3) : new C0373(3);
        C1867 c1867 = new C1867(c1940.f6399);
        C1871 c1871 = new C1871(c1940.f6398);
        C1216 c1216 = new C1216(c1871, new C0094(applicationContext), executorServiceC1466, executorServiceC1465, new ExecutorServiceC1465(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC1465.f5228, timeUnit, new SynchronousQueue(), new ThreadFactoryC1464(new ThreadFactoryC0142(1), "source-unlimited", false))), executorServiceC1467);
        List list2 = Collections.EMPTY_LIST;
        C1466 c1466 = new C1466(c0963);
        C2564 c2564 = new C2564();
        new HashMap();
        if (C1519.f5351 && C1519.f5350) {
            Collections.newSetFromMap(new WeakHashMap());
        }
        ComponentCallbacks2C0020 componentCallbacks2C0020 = new ComponentCallbacks2C0020(applicationContext, c1216, c1871, c1868, c1867, c2564, c0373, c1227, c0264, list2, arrayList, generatedAppGlideModule, c1466);
        applicationContext.registerComponentCallbacks(componentCallbacks2C0020);
        f535 = componentCallbacks2C0020;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        AbstractC3522.m5104();
        this.f538.m3653(0L);
        this.f537.mo1516();
        C1867 c1867 = this.f540;
        synchronized (c1867) {
            c1867.m3639(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        AbstractC3522.m5104();
        synchronized (this.f543) {
            try {
                Iterator it = this.f543.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C2563) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1871 c1871 = this.f538;
        c1871.getClass();
        if (i >= 40) {
            c1871.m3653(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c1871) {
                j = c1871.f6216;
            }
            c1871.m3653(j / 2);
        }
        this.f537.mo1515(i);
        C1867 c1867 = this.f540;
        synchronized (c1867) {
            try {
                if (i >= 40) {
                    synchronized (c1867) {
                        c1867.m3639(0);
                    }
                } else if (i >= 20 || i == 15) {
                    c1867.m3639(c1867.f6197 / 2);
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
