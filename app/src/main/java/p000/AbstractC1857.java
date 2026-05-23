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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᲀᲈᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1857 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static volatile int f6172;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2115 f6173 = new C2115(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C2115 f6174 = new C2115(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static volatile C2115 f6175;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final String[] f6176;

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
        f6176 = new String[]{"2.0"};
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static ArrayList m3623() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = AbstractC1857.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        C2115 c2115 = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i = AbstractC2553.f8109;
                if (AbstractC2784.m4759(2) >= AbstractC2784.m4759(AbstractC2553.f8110)) {
                    AbstractC2553.m4566().println("SLF4J(I): " + str);
                }
                c2115 = (C2115) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                AbstractC2553.m4565("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                AbstractC2553.m4565("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e3) {
                e = e3;
                AbstractC2553.m4565("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e4) {
                e = e4;
                AbstractC2553.m4565("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                AbstractC2553.m4565("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e6) {
                e = e6;
                AbstractC2553.m4565("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (c2115 != null) {
            arrayList.add(c2115);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(C2115.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᲀᲇᲈᤝ
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(C2115.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((C2115) it.next());
            } catch (ServiceConfigurationError e7) {
                String str2 = "A service provider failed to instantiate:\n" + e7.getMessage();
                AbstractC2553.m4566().println("SLF4J(E): " + str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static InterfaceC1855 m3624() {
        C2115 c2115;
        InterfaceC1589 interfaceC1589;
        if (f6172 == 0) {
            synchronized (AbstractC1857.class) {
                try {
                    if (f6172 == 0) {
                        f6172 = 1;
                        m3625();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = f6172;
        if (i == 1) {
            c2115 = f6173;
        } else {
            if (i == 2) {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i == 3) {
                c2115 = f6175;
            } else {
                if (i != 4) {
                    throw new IllegalStateException("Unreachable code");
                }
                c2115 = f6174;
            }
        }
        switch (c2115.f6967) {
            case 0:
                interfaceC1589 = (C2102) c2115.f6968;
                break;
            default:
                interfaceC1589 = (C2855) c2115.f6968;
                break;
        }
        return interfaceC1589.mo3338();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final void m3625() {
        try {
            ArrayList arrayListM3623 = m3623();
            m3629(arrayListM3623);
            if (arrayListM3623.isEmpty()) {
                f6172 = 4;
                AbstractC2553.m4567("No SLF4J providers were found.");
                AbstractC2553.m4567("Defaulting to no-operation (NOP) logger implementation");
                AbstractC2553.m4567("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = AbstractC1857.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e) {
                    AbstractC2553.m4565("Error getting resources from path", e);
                }
                m3628(linkedHashSet);
            } else {
                f6175 = (C2115) arrayListM3623.get(0);
                f6175.getClass();
                f6175.getClass();
                f6172 = 3;
                m3627(arrayListM3623);
            }
            m3626();
            if (f6172 == 3) {
                try {
                    switch (f6175.f6967) {
                        case 0:
                            boolean z = false;
                            for (String str : f6176) {
                                if ("2.0.99".startsWith(str)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                            AbstractC2553.m4567("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f6176).toString());
                            AbstractC2553.m4567("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    AbstractC2553.m4565("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e2) {
            f6172 = 2;
            AbstractC2553.m4565("Failed to instantiate SLF4J LoggerFactory", e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static void m3626() {
        C2115 c2115 = f6173;
        synchronized (c2115) {
            try {
                ((C2855) c2115.f6968).f9123 = true;
                C2855 c2855 = (C2855) c2115.f6968;
                c2855.getClass();
                for (C2854 c2854 : new ArrayList(c2855.f9124.values())) {
                    c2854.getClass();
                    c2854.f9117 = m3624();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((C2855) f6173.f6968).f9125;
        int size = linkedBlockingQueue.size();
        ArrayList<C2856> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C2856 c2856 : arrayList) {
                if (c2856 != null) {
                    C2854 c2857 = c2856.f9127;
                    c2857.getClass();
                    if (c2857.f9117 == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(c2857.f9117 instanceof C2114)) {
                        if (!c2857.m4859()) {
                            AbstractC2553.m4567("KavaRef");
                        } else if (c2857.mo3622(c2856.f9126) && c2857.m4859()) {
                            try {
                                c2857.f9119.invoke(c2857.f9117, c2856);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c2856.f9127.m4859()) {
                        AbstractC2553.m4567("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC2553.m4567("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC2553.m4567("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c2856.f9127.f9117 instanceof C2114)) {
                        AbstractC2553.m4567("The following set of substitute loggers may have been accessed");
                        AbstractC2553.m4567("during the initialization phase. Logging calls during this");
                        AbstractC2553.m4567("phase were not honored. However, subsequent logging calls to these");
                        AbstractC2553.m4567("loggers will work as normally expected.");
                        AbstractC2553.m4567("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        C2855 c2858 = (C2855) f6173.f6968;
        c2858.f9124.clear();
        c2858.f9125.clear();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m3627(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i = AbstractC2553.f8109;
            if (AbstractC2784.m4759(2) >= AbstractC2784.m4759(AbstractC2553.f8110)) {
                AbstractC2553.m4566().println("SLF4J(I): " + str);
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((C2115) arrayList.get(0)).getClass().getName() + "]";
        int i2 = AbstractC2553.f8109;
        if (AbstractC2784.m4759(1) >= AbstractC2784.m4759(AbstractC2553.f8110)) {
            AbstractC2553.m4566().println("SLF4J(D): " + str2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m3628(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        AbstractC2553.m4567("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC2553.m4567("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC2553.m4567("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m3629(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            AbstractC2553.m4567("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC2553.m4567("Found provider [" + ((C2115) it.next()) + "]");
            }
            AbstractC2553.m4567("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
