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
import p000.AbstractC1246feyxiexzfUjhhgtg;
import p000.AbstractC1791feyxiexzfUjhhgtg;
import p000.AbstractC1860Ujhhgtgfeyxiexzf;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.AbstractC3593Ujhhgtgfeyxiexzf;
import p000.C0180Ujhhgtgfeyxiexzf;
import p000.C0271Ujhhgtgfeyxiexzf;
import p000.C0274Ujhhgtgfeyxiexzf;
import p000.C0377Ujhhgtgfeyxiexzf;
import p000.C0378Ujhhgtgfeyxiexzf;
import p000.C0540Ujhhgtgfeyxiexzf;
import p000.C0709Ujhhgtgfeyxiexzf;
import p000.C0897feyxiexzfUjhhgtg;
import p000.C1030feyxiexzfUjhhgtg;
import p000.C2412Ujhhgtgfeyxiexzf;
import p000.C2466feyxiexzfUjhhgtg;
import p000.C2579Ujhhgtgfeyxiexzf;
import p000.C3107Ujhhgtgfeyxiexzf;
import p000.C3167feyxiexzfUjhhgtg;
import p000.C3331feyxiexzfUjhhgtg;
import p000.C3334feyxiexzfUjhhgtg;
import p000.C3339feyxiexzfUjhhgtg;
import p000.C3589Ujhhgtgfeyxiexzf;
import p000.C3596feyxiexzfUjhhgtg;
import p000.ComponentCallbacks2C0894feyxiexzfUjhhgtg;
import p000.ExecutorServiceC3600feyxiexzfUjhhgtg;
import p000.InterfaceC2512feyxiexzfUjhhgtg;
import p000.ThreadFactoryC3013Ujhhgtgfeyxiexzf;
import p000.ThreadFactoryC3599feyxiexzfUjhhgtg;

/* JADX INFO: renamed from: com.bumptech.glide.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: invalid class name */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Ujhhgtgfeyxiexzf implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static volatile Ujhhgtgfeyxiexzf f601Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static volatile boolean f602Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC2512feyxiexzfUjhhgtg f603Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0180Ujhhgtgfeyxiexzf f604Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C3589Ujhhgtgfeyxiexzf f605Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0271Ujhhgtgfeyxiexzf f606Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C0897feyxiexzfUjhhgtg f607Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C2466feyxiexzfUjhhgtg f608Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final ArrayList f609Ujhhgtgfeyxiexzf = new ArrayList();

    public Ujhhgtgfeyxiexzf(Context context, C3334feyxiexzfUjhhgtg c3334feyxiexzfUjhhgtg, C0180Ujhhgtgfeyxiexzf c0180Ujhhgtgfeyxiexzf, InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf, C0897feyxiexzfUjhhgtg c0897feyxiexzfUjhhgtg, C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg, C3339feyxiexzfUjhhgtg c3339feyxiexzfUjhhgtg, C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf, List list, ArrayList arrayList, AbstractC1246feyxiexzfUjhhgtg abstractC1246feyxiexzfUjhhgtg, C3596feyxiexzfUjhhgtg c3596feyxiexzfUjhhgtg) {
        new C3331feyxiexzfUjhhgtg(new C2579Ujhhgtgfeyxiexzf(this));
        this.f603Ujhhgtgfeyxiexzf = interfaceC2512feyxiexzfUjhhgtg;
        this.f606Ujhhgtgfeyxiexzf = c0271Ujhhgtgfeyxiexzf;
        this.f604Ujhhgtgfeyxiexzf = c0180Ujhhgtgfeyxiexzf;
        this.f607Ujhhgtgfeyxiexzf = c0897feyxiexzfUjhhgtg;
        this.f608Ujhhgtgfeyxiexzf = c2466feyxiexzfUjhhgtg;
        if (c3596feyxiexzfUjhhgtg.f11193Ujhhgtgfeyxiexzf.get(AbstractC3593Ujhhgtgfeyxiexzf.class) != null) {
            throw new ClassCastException();
        }
        this.f605Ujhhgtgfeyxiexzf = new C3589Ujhhgtgfeyxiexzf(context, c0271Ujhhgtgfeyxiexzf, new C1030feyxiexzfUjhhgtg(this, arrayList, abstractC1246feyxiexzfUjhhgtg), new C3339feyxiexzfUjhhgtg(20), c3339feyxiexzfUjhhgtg, c2412Ujhhgtgfeyxiexzf, list, c3334feyxiexzfUjhhgtg, c3596feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static Ujhhgtgfeyxiexzf m756Ujhhgtgfeyxiexzf(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f601Ujhhgtgfeyxiexzf == null) {
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
            synchronized (Ujhhgtgfeyxiexzf.class) {
                if (f601Ujhhgtgfeyxiexzf == null) {
                    if (f602Ujhhgtgfeyxiexzf) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f602Ujhhgtgfeyxiexzf = true;
                    try {
                        m757Ujhhgtgfeyxiexzf(context, generatedAppGlideModule);
                        f602Ujhhgtgfeyxiexzf = false;
                    } catch (Throwable th) {
                        f602Ujhhgtgfeyxiexzf = false;
                        throw th;
                    }
                }
            }
        }
        return f601Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m757Ujhhgtgfeyxiexzf(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = new C2412Ujhhgtgfeyxiexzf(0);
        C3107Ujhhgtgfeyxiexzf c3107Ujhhgtgfeyxiexzf = new C3107Ujhhgtgfeyxiexzf(1);
        C3339feyxiexzfUjhhgtg c3339feyxiexzfUjhhgtg = new C3339feyxiexzfUjhhgtg(15);
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
                        AbstractC1791feyxiexzfUjhhgtg.m3147feyxiexzfUjhhgtg(str);
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
                throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it3);
        }
        ThreadFactoryC3013Ujhhgtgfeyxiexzf threadFactoryC3013Ujhhgtgfeyxiexzf = new ThreadFactoryC3013Ujhhgtgfeyxiexzf(1);
        if (ExecutorServiceC3600feyxiexzfUjhhgtg.f11210Ujhhgtgfeyxiexzf == 0) {
            ExecutorServiceC3600feyxiexzfUjhhgtg.f11210Ujhhgtgfeyxiexzf = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = ExecutorServiceC3600feyxiexzfUjhhgtg.f11210Ujhhgtgfeyxiexzf;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        ThreadFactoryC3599feyxiexzfUjhhgtg threadFactoryC3599feyxiexzfUjhhgtg = new ThreadFactoryC3599feyxiexzfUjhhgtg(threadFactoryC3013Ujhhgtgfeyxiexzf, "source", false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ExecutorServiceC3600feyxiexzfUjhhgtg executorServiceC3600feyxiexzfUjhhgtg = new ExecutorServiceC3600feyxiexzfUjhhgtg(new ThreadPoolExecutor(i, i, 0L, timeUnit, new PriorityBlockingQueue(), threadFactoryC3599feyxiexzfUjhhgtg));
        ThreadFactoryC3013Ujhhgtgfeyxiexzf threadFactoryC3013Ujhhgtgfeyxiexzf2 = new ThreadFactoryC3013Ujhhgtgfeyxiexzf(1);
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        ExecutorServiceC3600feyxiexzfUjhhgtg executorServiceC3600feyxiexzfUjhhgtg2 = new ExecutorServiceC3600feyxiexzfUjhhgtg(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC3599feyxiexzfUjhhgtg(threadFactoryC3013Ujhhgtgfeyxiexzf2, "disk-cache", true)));
        if (ExecutorServiceC3600feyxiexzfUjhhgtg.f11210Ujhhgtgfeyxiexzf == 0) {
            ExecutorServiceC3600feyxiexzfUjhhgtg.f11210Ujhhgtgfeyxiexzf = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = ExecutorServiceC3600feyxiexzfUjhhgtg.f11210Ujhhgtgfeyxiexzf >= 4 ? 2 : 1;
        ThreadFactoryC3013Ujhhgtgfeyxiexzf threadFactoryC3013Ujhhgtgfeyxiexzf3 = new ThreadFactoryC3013Ujhhgtgfeyxiexzf(1);
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        ExecutorServiceC3600feyxiexzfUjhhgtg executorServiceC3600feyxiexzfUjhhgtg3 = new ExecutorServiceC3600feyxiexzfUjhhgtg(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC3599feyxiexzfUjhhgtg(threadFactoryC3013Ujhhgtgfeyxiexzf3, "animation", true)));
        C0378Ujhhgtgfeyxiexzf c0378Ujhhgtgfeyxiexzf = new C0378Ujhhgtgfeyxiexzf(new C0377Ujhhgtgfeyxiexzf(applicationContext));
        C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg = new C2466feyxiexzfUjhhgtg(16);
        int i3 = c0378Ujhhgtgfeyxiexzf.f2088Ujhhgtgfeyxiexzf;
        InterfaceC2512feyxiexzfUjhhgtg c0274Ujhhgtgfeyxiexzf = i3 > 0 ? new C0274Ujhhgtgfeyxiexzf(i3) : new C2466feyxiexzfUjhhgtg(3);
        C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = new C0271Ujhhgtgfeyxiexzf(c0378Ujhhgtgfeyxiexzf.f2090Ujhhgtgfeyxiexzf);
        C0180Ujhhgtgfeyxiexzf c0180Ujhhgtgfeyxiexzf = new C0180Ujhhgtgfeyxiexzf(c0378Ujhhgtgfeyxiexzf.f2089Ujhhgtgfeyxiexzf);
        C3167feyxiexzfUjhhgtg c3167feyxiexzfUjhhgtg = new C3167feyxiexzfUjhhgtg(applicationContext, 4);
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = new C0709Ujhhgtgfeyxiexzf();
        c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf = c3167feyxiexzfUjhhgtg;
        C3334feyxiexzfUjhhgtg c3334feyxiexzfUjhhgtg = new C3334feyxiexzfUjhhgtg(c0180Ujhhgtgfeyxiexzf, c0709Ujhhgtgfeyxiexzf, executorServiceC3600feyxiexzfUjhhgtg2, executorServiceC3600feyxiexzfUjhhgtg, new ExecutorServiceC3600feyxiexzfUjhhgtg(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC3600feyxiexzfUjhhgtg.f11209Ujhhgtgfeyxiexzf, timeUnit, new SynchronousQueue(), new ThreadFactoryC3599feyxiexzfUjhhgtg(new ThreadFactoryC3013Ujhhgtgfeyxiexzf(1), "source-unlimited", false))), executorServiceC3600feyxiexzfUjhhgtg3);
        List list2 = Collections.EMPTY_LIST;
        C3596feyxiexzfUjhhgtg c3596feyxiexzfUjhhgtg = new C3596feyxiexzfUjhhgtg(c3107Ujhhgtgfeyxiexzf);
        C0897feyxiexzfUjhhgtg c0897feyxiexzfUjhhgtg = new C0897feyxiexzfUjhhgtg();
        new HashMap();
        if (C0540Ujhhgtgfeyxiexzf.f2510Ujhhgtgfeyxiexzf && C0540Ujhhgtgfeyxiexzf.f2509Ujhhgtgfeyxiexzf) {
            Collections.newSetFromMap(new WeakHashMap());
        }
        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = new Ujhhgtgfeyxiexzf(applicationContext, c3334feyxiexzfUjhhgtg, c0180Ujhhgtgfeyxiexzf, c0274Ujhhgtgfeyxiexzf, c0271Ujhhgtgfeyxiexzf, c0897feyxiexzfUjhhgtg, c2466feyxiexzfUjhhgtg, c3339feyxiexzfUjhhgtg, c2412Ujhhgtgfeyxiexzf, list2, arrayList, generatedAppGlideModule, c3596feyxiexzfUjhhgtg);
        applicationContext.registerComponentCallbacks(ujhhgtgfeyxiexzf);
        f601Ujhhgtgfeyxiexzf = ujhhgtgfeyxiexzf;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        AbstractC1860Ujhhgtgfeyxiexzf.m3192Ujhhgtgfeyxiexzf();
        this.f604Ujhhgtgfeyxiexzf.m1249Ujhhgtgfeyxiexzf(0L);
        this.f603Ujhhgtgfeyxiexzf.mo1476Ujhhgtgfeyxiexzf();
        C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = this.f606Ujhhgtgfeyxiexzf;
        synchronized (c0271Ujhhgtgfeyxiexzf) {
            c0271Ujhhgtgfeyxiexzf.m1461Ujhhgtgfeyxiexzf(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        AbstractC1860Ujhhgtgfeyxiexzf.m3192Ujhhgtgfeyxiexzf();
        synchronized (this.f609Ujhhgtgfeyxiexzf) {
            try {
                Iterator it = this.f609Ujhhgtgfeyxiexzf.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C0894feyxiexzfUjhhgtg) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0180Ujhhgtgfeyxiexzf c0180Ujhhgtgfeyxiexzf = this.f604Ujhhgtgfeyxiexzf;
        c0180Ujhhgtgfeyxiexzf.getClass();
        if (i >= 40) {
            c0180Ujhhgtgfeyxiexzf.m1249Ujhhgtgfeyxiexzf(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c0180Ujhhgtgfeyxiexzf) {
                j = c0180Ujhhgtgfeyxiexzf.f1383Ujhhgtgfeyxiexzf;
            }
            c0180Ujhhgtgfeyxiexzf.m1249Ujhhgtgfeyxiexzf(j / 2);
        }
        this.f603Ujhhgtgfeyxiexzf.mo1475Ujhhgtgfeyxiexzf(i);
        C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = this.f606Ujhhgtgfeyxiexzf;
        synchronized (c0271Ujhhgtgfeyxiexzf) {
            try {
                if (i >= 40) {
                    synchronized (c0271Ujhhgtgfeyxiexzf) {
                        c0271Ujhhgtgfeyxiexzf.m1461Ujhhgtgfeyxiexzf(0);
                    }
                } else if (i >= 20 || i == 15) {
                    c0271Ujhhgtgfeyxiexzf.m1461Ujhhgtgfeyxiexzf(c0271Ujhhgtgfeyxiexzf.f1665Ujhhgtgfeyxiexzf / 2);
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
