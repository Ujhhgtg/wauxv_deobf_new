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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᛸᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1883 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static volatile int f6246;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2148 f6247 = new C2148(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C2148 f6248 = new C2148(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static volatile C2148 f6249;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final String[] f6250;

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
        f6250 = new String[]{"2.0"};
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static ArrayList m3801() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = AbstractC1883.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        C2148 c2148 = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i = AbstractC2609.f8262;
                if (AbstractC2844.m4792(2) >= AbstractC2844.m4792(AbstractC2609.f8263)) {
                    AbstractC2609.m4588().println("SLF4J(I): " + str);
                }
                c2148 = (C2148) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                AbstractC2609.m4587("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                AbstractC2609.m4587("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e3) {
                e = e3;
                AbstractC2609.m4587("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e4) {
                e = e4;
                AbstractC2609.m4587("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                AbstractC2609.m4587("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e6) {
                e = e6;
                AbstractC2609.m4587("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (c2148 != null) {
            arrayList.add(c2148);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(C2148.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᛸᲈᲀᲇ
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(C2148.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((C2148) it.next());
            } catch (ServiceConfigurationError e7) {
                String str2 = "A service provider failed to instantiate:\n" + e7.getMessage();
                AbstractC2609.m4588().println("SLF4J(E): " + str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static InterfaceC1881 m3802(String str) {
        C2148 c2148;
        InterfaceC1601 interfaceC1601;
        if (f6246 == 0) {
            synchronized (AbstractC1883.class) {
                try {
                    if (f6246 == 0) {
                        f6246 = 1;
                        m3803();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = f6246;
        if (i == 1) {
            c2148 = f6247;
        } else {
            if (i == 2) {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i == 3) {
                c2148 = f6249;
            } else {
                if (i != 4) {
                    throw new IllegalStateException("Unreachable code");
                }
                c2148 = f6248;
            }
        }
        switch (c2148.f7091) {
            case 0:
                interfaceC1601 = (C2135) c2148.f7092;
                break;
            default:
                interfaceC1601 = (C2915) c2148.f7092;
                break;
        }
        return interfaceC1601.mo3502(str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final void m3803() {
        try {
            ArrayList arrayListM3801 = m3801();
            m3807(arrayListM3801);
            if (arrayListM3801.isEmpty()) {
                f6246 = 4;
                AbstractC2609.m4589("No SLF4J providers were found.");
                AbstractC2609.m4589("Defaulting to no-operation (NOP) logger implementation");
                AbstractC2609.m4589("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = AbstractC1883.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e) {
                    AbstractC2609.m4587("Error getting resources from path", e);
                }
                m3806(linkedHashSet);
            } else {
                f6249 = (C2148) arrayListM3801.get(0);
                f6249.getClass();
                f6249.getClass();
                f6246 = 3;
                m3805(arrayListM3801);
            }
            m3804();
            if (f6246 == 3) {
                try {
                    switch (f6249.f7091) {
                        case 0:
                            boolean z = false;
                            for (String str : f6250) {
                                if ("2.0.99".startsWith(str)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                            AbstractC2609.m4589("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f6250).toString());
                            AbstractC2609.m4589("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    AbstractC2609.m4587("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e2) {
            f6246 = 2;
            AbstractC2609.m4587("Failed to instantiate SLF4J LoggerFactory", e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static void m3804() {
        C2148 c2148 = f6247;
        synchronized (c2148) {
            try {
                ((C2915) c2148.f7092).f9293 = true;
                C2915 c2915 = (C2915) c2148.f7092;
                c2915.getClass();
                for (C2914 c2914 : new ArrayList(c2915.f9294.values())) {
                    c2914.f9287 = m3802(c2914.f9286);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((C2915) f6247.f7092).f9295;
        int size = linkedBlockingQueue.size();
        ArrayList<C2916> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C2916 c2916 : arrayList) {
                if (c2916 != null) {
                    C2914 c2917 = c2916.f9297;
                    String str = c2917.f9286;
                    if (c2917.f9287 == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(c2917.f9287 instanceof C2147)) {
                        if (!c2917.m4920()) {
                            AbstractC2609.m4589(str);
                        } else if (c2917.mo3800(c2916.f9296) && c2917.m4920()) {
                            try {
                                c2917.f9289.invoke(c2917.f9287, c2916);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c2916.f9297.m4920()) {
                        AbstractC2609.m4589("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC2609.m4589("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC2609.m4589("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c2916.f9297.f9287 instanceof C2147)) {
                        AbstractC2609.m4589("The following set of substitute loggers may have been accessed");
                        AbstractC2609.m4589("during the initialization phase. Logging calls during this");
                        AbstractC2609.m4589("phase were not honored. However, subsequent logging calls to these");
                        AbstractC2609.m4589("loggers will work as normally expected.");
                        AbstractC2609.m4589("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        C2915 c2918 = (C2915) f6247.f7092;
        c2918.f9294.clear();
        c2918.f9295.clear();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m3805(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i = AbstractC2609.f8262;
            if (AbstractC2844.m4792(2) >= AbstractC2844.m4792(AbstractC2609.f8263)) {
                AbstractC2609.m4588().println("SLF4J(I): " + str);
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((C2148) arrayList.get(0)).getClass().getName() + "]";
        int i2 = AbstractC2609.f8262;
        if (AbstractC2844.m4792(1) >= AbstractC2844.m4792(AbstractC2609.f8263)) {
            AbstractC2609.m4588().println("SLF4J(D): " + str2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m3806(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        AbstractC2609.m4589("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC2609.m4589("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC2609.m4589("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m3807(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            AbstractC2609.m4589("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC2609.m4589("Found provider [" + ((C2148) it.next()) + "]");
            }
            AbstractC2609.m4589("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
