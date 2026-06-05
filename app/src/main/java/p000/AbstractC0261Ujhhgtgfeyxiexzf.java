package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ要点脸ᛱfeyxiexzfᛱᛴᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0261Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static volatile int f1638Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C0408Ujhhgtgfeyxiexzf f1639Ujhhgtgfeyxiexzf = new C0408Ujhhgtgfeyxiexzf(1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C0408Ujhhgtgfeyxiexzf f1640Ujhhgtgfeyxiexzf = new C0408Ujhhgtgfeyxiexzf(0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static volatile C0408Ujhhgtgfeyxiexzf f1641Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final String[] f1642Ujhhgtgfeyxiexzf;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            property.equalsIgnoreCase("true");
        }
        f1642Ujhhgtgfeyxiexzf = new String[]{"2.0"};
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static ArrayList m1436Ujhhgtgfeyxiexzf() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = AbstractC0261Ujhhgtgfeyxiexzf.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        C0408Ujhhgtgfeyxiexzf c0408Ujhhgtgfeyxiexzf = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i = AbstractC0986feyxiexzfUjhhgtg.f3883Ujhhgtgfeyxiexzf;
                if (AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(2) >= AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(AbstractC0986feyxiexzfUjhhgtg.f3884Ujhhgtgfeyxiexzf)) {
                    AbstractC0986feyxiexzfUjhhgtg.m2478Ujhhgtgfeyxiexzf().println("SLF4J(I): " + str);
                }
                c0408Ujhhgtgfeyxiexzf = (C0408Ujhhgtgfeyxiexzf) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                AbstractC0986feyxiexzfUjhhgtg.m2477Ujhhgtgfeyxiexzf("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                AbstractC0986feyxiexzfUjhhgtg.m2477Ujhhgtgfeyxiexzf("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e3) {
                e = e3;
                AbstractC0986feyxiexzfUjhhgtg.m2477Ujhhgtgfeyxiexzf("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e4) {
                e = e4;
                AbstractC0986feyxiexzfUjhhgtg.m2477Ujhhgtgfeyxiexzf("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                AbstractC0986feyxiexzfUjhhgtg.m2477Ujhhgtgfeyxiexzf("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e6) {
                e = e6;
                AbstractC0986feyxiexzfUjhhgtg.m2477Ujhhgtgfeyxiexzf("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (c0408Ujhhgtgfeyxiexzf != null) {
            arrayList.add(c0408Ujhhgtgfeyxiexzf);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(C0408Ujhhgtgfeyxiexzf.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ要点脸ᛱfeyxiexzfᛱᛴ能不能ᛳ
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(C0408Ujhhgtgfeyxiexzf.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((C0408Ujhhgtgfeyxiexzf) it.next());
            } catch (ServiceConfigurationError e7) {
                String str2 = "A service provider failed to instantiate:\n" + e7.getMessage();
                AbstractC0986feyxiexzfUjhhgtg.m2478Ujhhgtgfeyxiexzf().println("SLF4J(E): " + str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static InterfaceC0259Ujhhgtgfeyxiexzf m1437Ujhhgtgfeyxiexzf(String str) {
        C0408Ujhhgtgfeyxiexzf c0408Ujhhgtgfeyxiexzf;
        InterfaceC0603Ujhhgtgfeyxiexzf interfaceC0603Ujhhgtgfeyxiexzf;
        if (f1638Ujhhgtgfeyxiexzf == 0) {
            synchronized (AbstractC0261Ujhhgtgfeyxiexzf.class) {
                try {
                    if (f1638Ujhhgtgfeyxiexzf == 0) {
                        f1638Ujhhgtgfeyxiexzf = 1;
                        m1438Ujhhgtgfeyxiexzf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = f1638Ujhhgtgfeyxiexzf;
        if (i == 1) {
            c0408Ujhhgtgfeyxiexzf = f1639Ujhhgtgfeyxiexzf;
        } else {
            if (i == 2) {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i == 3) {
                c0408Ujhhgtgfeyxiexzf = f1641Ujhhgtgfeyxiexzf;
            } else {
                if (i != 4) {
                    throw new IllegalStateException("Unreachable code");
                }
                c0408Ujhhgtgfeyxiexzf = f1640Ujhhgtgfeyxiexzf;
            }
        }
        switch (c0408Ujhhgtgfeyxiexzf.f2196Ujhhgtgfeyxiexzf) {
            case 0:
                interfaceC0603Ujhhgtgfeyxiexzf = (C0420Ujhhgtgfeyxiexzf) c0408Ujhhgtgfeyxiexzf.f2197Ujhhgtgfeyxiexzf;
                break;
            default:
                interfaceC0603Ujhhgtgfeyxiexzf = (C1173feyxiexzfUjhhgtg) c0408Ujhhgtgfeyxiexzf.f2197Ujhhgtgfeyxiexzf;
                break;
        }
        return interfaceC0603Ujhhgtgfeyxiexzf.mo1741Ujhhgtgfeyxiexzf(str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final void m1438Ujhhgtgfeyxiexzf() {
        try {
            ArrayList arrayListM1436Ujhhgtgfeyxiexzf = m1436Ujhhgtgfeyxiexzf();
            m1442Ujhhgtgfeyxiexzf(arrayListM1436Ujhhgtgfeyxiexzf);
            if (arrayListM1436Ujhhgtgfeyxiexzf.isEmpty()) {
                f1638Ujhhgtgfeyxiexzf = 4;
                AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("No SLF4J providers were found.");
                AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("Defaulting to no-operation (NOP) logger implementation");
                AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = AbstractC0261Ujhhgtgfeyxiexzf.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e) {
                    AbstractC0986feyxiexzfUjhhgtg.m2477Ujhhgtgfeyxiexzf("Error getting resources from path", e);
                }
                m1441Ujhhgtgfeyxiexzf(linkedHashSet);
            } else {
                f1641Ujhhgtgfeyxiexzf = (C0408Ujhhgtgfeyxiexzf) arrayListM1436Ujhhgtgfeyxiexzf.get(0);
                f1641Ujhhgtgfeyxiexzf.getClass();
                f1641Ujhhgtgfeyxiexzf.getClass();
                f1638Ujhhgtgfeyxiexzf = 3;
                m1440Ujhhgtgfeyxiexzf(arrayListM1436Ujhhgtgfeyxiexzf);
            }
            m1439Ujhhgtgfeyxiexzf();
            if (f1638Ujhhgtgfeyxiexzf == 3) {
                try {
                    switch (f1641Ujhhgtgfeyxiexzf.f2196Ujhhgtgfeyxiexzf) {
                        case 0:
                            boolean z = false;
                            for (String str : f1642Ujhhgtgfeyxiexzf) {
                                if ("2.0.99".startsWith(str)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                            AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f1642Ujhhgtgfeyxiexzf).toString());
                            AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    AbstractC0986feyxiexzfUjhhgtg.m2477Ujhhgtgfeyxiexzf("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e2) {
            f1638Ujhhgtgfeyxiexzf = 2;
            AbstractC0986feyxiexzfUjhhgtg.m2477Ujhhgtgfeyxiexzf("Failed to instantiate SLF4J LoggerFactory", e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static void m1439Ujhhgtgfeyxiexzf() {
        C0408Ujhhgtgfeyxiexzf c0408Ujhhgtgfeyxiexzf = f1639Ujhhgtgfeyxiexzf;
        synchronized (c0408Ujhhgtgfeyxiexzf) {
            try {
                ((C1173feyxiexzfUjhhgtg) c0408Ujhhgtgfeyxiexzf.f2197Ujhhgtgfeyxiexzf).f4452Ujhhgtgfeyxiexzf = true;
                C1173feyxiexzfUjhhgtg c1173feyxiexzfUjhhgtg = (C1173feyxiexzfUjhhgtg) c0408Ujhhgtgfeyxiexzf.f2197Ujhhgtgfeyxiexzf;
                c1173feyxiexzfUjhhgtg.getClass();
                for (C1190feyxiexzfUjhhgtg c1190feyxiexzfUjhhgtg : new ArrayList(c1173feyxiexzfUjhhgtg.f4453Ujhhgtgfeyxiexzf.values())) {
                    c1190feyxiexzfUjhhgtg.f4479Ujhhgtgfeyxiexzf = m1437Ujhhgtgfeyxiexzf(c1190feyxiexzfUjhhgtg.f4478Ujhhgtgfeyxiexzf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((C1173feyxiexzfUjhhgtg) f1639Ujhhgtgfeyxiexzf.f2197Ujhhgtgfeyxiexzf).f4454Ujhhgtgfeyxiexzf;
        int size = linkedBlockingQueue.size();
        ArrayList<C1172feyxiexzfUjhhgtg> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C1172feyxiexzfUjhhgtg c1172feyxiexzfUjhhgtg : arrayList) {
                if (c1172feyxiexzfUjhhgtg != null) {
                    C1190feyxiexzfUjhhgtg c1190feyxiexzfUjhhgtg2 = c1172feyxiexzfUjhhgtg.f4451Ujhhgtgfeyxiexzf;
                    String str = c1190feyxiexzfUjhhgtg2.f4478Ujhhgtgfeyxiexzf;
                    if (c1190feyxiexzfUjhhgtg2.f4479Ujhhgtgfeyxiexzf == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(c1190feyxiexzfUjhhgtg2.f4479Ujhhgtgfeyxiexzf instanceof C0405Ujhhgtgfeyxiexzf)) {
                        if (!c1190feyxiexzfUjhhgtg2.m2678Ujhhgtgfeyxiexzf()) {
                            AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf(str);
                        } else if (c1190feyxiexzfUjhhgtg2.mo1434Ujhhgtgfeyxiexzf(c1172feyxiexzfUjhhgtg.f4450Ujhhgtgfeyxiexzf) && c1190feyxiexzfUjhhgtg2.m2678Ujhhgtgfeyxiexzf()) {
                            try {
                                c1190feyxiexzfUjhhgtg2.f4481Ujhhgtgfeyxiexzf.invoke(c1190feyxiexzfUjhhgtg2.f4479Ujhhgtgfeyxiexzf, c1172feyxiexzfUjhhgtg);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c1172feyxiexzfUjhhgtg.f4451Ujhhgtgfeyxiexzf.m2678Ujhhgtgfeyxiexzf()) {
                        AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c1172feyxiexzfUjhhgtg.f4451Ujhhgtgfeyxiexzf.f4479Ujhhgtgfeyxiexzf instanceof C0405Ujhhgtgfeyxiexzf)) {
                        AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("The following set of substitute loggers may have been accessed");
                        AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("during the initialization phase. Logging calls during this");
                        AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("phase were not honored. However, subsequent logging calls to these");
                        AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("loggers will work as normally expected.");
                        AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        C1173feyxiexzfUjhhgtg c1173feyxiexzfUjhhgtg2 = (C1173feyxiexzfUjhhgtg) f1639Ujhhgtgfeyxiexzf.f2197Ujhhgtgfeyxiexzf;
        c1173feyxiexzfUjhhgtg2.f4453Ujhhgtgfeyxiexzf.clear();
        c1173feyxiexzfUjhhgtg2.f4454Ujhhgtgfeyxiexzf.clear();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static void m1440Ujhhgtgfeyxiexzf(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i = AbstractC0986feyxiexzfUjhhgtg.f3883Ujhhgtgfeyxiexzf;
            if (AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(2) >= AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(AbstractC0986feyxiexzfUjhhgtg.f3884Ujhhgtgfeyxiexzf)) {
                AbstractC0986feyxiexzfUjhhgtg.m2478Ujhhgtgfeyxiexzf().println("SLF4J(I): " + str);
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((C0408Ujhhgtgfeyxiexzf) arrayList.get(0)).getClass().getName() + "]";
        int i2 = AbstractC0986feyxiexzfUjhhgtg.f3883Ujhhgtgfeyxiexzf;
        if (AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(1) >= AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(AbstractC0986feyxiexzfUjhhgtg.f3884Ujhhgtgfeyxiexzf)) {
            AbstractC0986feyxiexzfUjhhgtg.m2478Ujhhgtgfeyxiexzf().println("SLF4J(D): " + str2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m1441Ujhhgtgfeyxiexzf(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m1442Ujhhgtgfeyxiexzf(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("Found provider [" + ((C0408Ujhhgtgfeyxiexzf) it.next()) + "]");
            }
            AbstractC0986feyxiexzfUjhhgtg.m2479Ujhhgtgfeyxiexzf("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
