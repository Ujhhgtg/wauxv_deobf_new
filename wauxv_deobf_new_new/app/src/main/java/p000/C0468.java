package p000;

import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᤞᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0468 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final Pattern f2081 = Pattern.compile("[/\\\\]");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final Pattern f2082 = Pattern.compile("^modules/[^/]+/");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final Pattern f2083 = Pattern.compile("\\.[^\\.]+$");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final Pattern f2084 = Pattern.compile("\\.(?=[^.]+$)");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static URL[] f2085;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static C0468 f2086;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static C0468 f2087;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f2088;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f2089;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f2090;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ConcurrentHashMap f2091;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ConcurrentHashMap f2092;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f2093;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0467 f2094;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Vector f2095;

    public C0468(String str) {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        this.f2089 = keySetViewNewKeySet;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet2 = ConcurrentHashMap.newKeySet();
        this.f2090 = keySetViewNewKeySet2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f2091 = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.f2092 = concurrentHashMap2;
        this.f2095 = new Vector();
        this.f2088 = str;
        keySetViewNewKeySet.clear();
        keySetViewNewKeySet2.clear();
        this.f2093 = false;
        concurrentHashMap.clear();
        concurrentHashMap2.clear();
        this.f2094 = null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static String m1833(String str) {
        if (str.startsWith("modules/")) {
            str = f2082.matcher(str).replaceFirst("");
        }
        if (str.indexOf(47) >= 0 || str.indexOf(92) >= 0) {
            str = f2081.matcher(str).replaceAll(".");
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        if (str.startsWith("class ")) {
            str = str.substring(6);
        }
        if (str.startsWith("classes.")) {
            str = str.substring(8);
        }
        return str.endsWith(".class") ? f2083.matcher(str).replaceFirst("") : str;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m1834(String str) {
        System.err.println("Mapping: " + str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C0468 m1835() throws C0701 {
        if (f2087 == null) {
            try {
                f2087 = new C0468("Boot Class Path", new URL[]{m1836()});
            } catch (MalformedURLException e) {
                throw new C0701(" can't find boot jar: " + e, e);
            }
        }
        return f2087;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static URL m1836() {
        String externalForm = Class.class.getResource("/java/lang/String.class").toExternalForm();
        return externalForm.startsWith("jrt:/") ? new URL(externalForm.substring(0, externalForm.indexOf(47, 5))) : new URL(externalForm.replaceFirst("[^!]*$", "/"));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static C0468 m1837() throws C0701 {
        if (f2086 == null) {
            URL[] urlArr = f2085;
            if (urlArr == null) {
                String property = System.getProperty("java.class.path");
                String[] strArrSplit = property == null ? new String[0] : property.split(File.pathSeparator);
                URL[] urlArr2 = new URL[strArrSplit.length];
                for (int i = 0; i < strArrSplit.length; i++) {
                    try {
                        urlArr2[i] = new File(new File(strArrSplit[i]).getCanonicalPath()).toURI().toURL();
                    } catch (IOException e) {
                        throw new C0701("can't parse class path: " + e, e);
                    }
                }
                f2085 = urlArr2;
                urlArr = urlArr2;
            }
            f2086 = new C0468("User Class Path", urlArr);
        }
        return f2086;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static ArrayList m1838(File file, File file2) throws IOException {
        ArrayList arrayList = new ArrayList();
        String absolutePath = file.getAbsolutePath();
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file3 : fileArrListFiles) {
            if (file3.isDirectory()) {
                arrayList.addAll(m1838(file, file3));
            } else {
                String absolutePath2 = file3.getAbsolutePath();
                if (!absolutePath2.toLowerCase().endsWith(".class")) {
                    continue;
                } else {
                    if (!absolutePath2.startsWith(absolutePath)) {
                        throw new IOException("problem parsing paths");
                    }
                    arrayList.add(m1833(absolutePath2.substring(absolutePath.length() + 1)));
                }
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "BshClassPath " + this.f2088 + "(" + super.toString() + ") path= " + this.f2089 + "\ncompPaths = {" + this.f2090 + " }";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1839(C0468 c0468) {
        if (c0468 == null) {
            return;
        }
        this.f2090.add(c0468);
        c0468.f2095.addElement(new WeakReference(this));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AbstractC0464 m1840(String str) {
        ConcurrentHashMap concurrentHashMap = this.f2092;
        AbstractC0464 abstractC0464 = (AbstractC0464) concurrentHashMap.get(str);
        if (abstractC0464 != null) {
            return abstractC0464;
        }
        m1841(true);
        Iterator it = this.f2090.iterator();
        AbstractC0464 abstractC0464M1840 = (AbstractC0464) concurrentHashMap.get(str);
        while (abstractC0464M1840 == null && it.hasNext()) {
            abstractC0464M1840 = ((C0468) it.next()).m1840(str);
        }
        return abstractC0464M1840;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m1841(boolean z) {
        if (z && !this.f2093) {
            System.err.println("Start ClassPath Mapping");
        }
        this.f2090.forEach(new C0460());
        if (!this.f2093) {
            m1844((URL[]) this.f2089.toArray(new URL[0]));
        }
        if (z && !this.f2093) {
            System.err.println("End ClassPath Mapping");
        }
        this.f2093 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m1842(URL url) throws Exception {
        String[] strArr;
        String[] strArr2;
        if (!"jrt".equals(url.getProtocol())) {
            if ("jar".equals(url.getProtocol())) {
                m1834("FileSystem: " + url);
                try {
                    try {
                        FileSystems.newFileSystem(url.toURI(), new HashMap());
                    } catch (FileSystemAlreadyExistsException unused) {
                    }
                    try {
                        Stream<Path> streamWalk = Files.walk(FileSystems.getFileSystem(url.toURI()).getPath("/", new String[0]), new FileVisitOption[0]);
                        try {
                            strArr = (String[]) streamWalk.map(new C0278(3)).filter(new C0456(1)).map(new C0278(4)).toArray(new C0461(1));
                            streamWalk.close();
                        } catch (Throwable th) {
                            if (streamWalk != null) {
                                try {
                                    streamWalk.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (URISyntaxException unused2) {
                    strArr = new String[0];
                }
                m1843(strArr, new C0466(url));
                return;
            }
            String file = url.getFile();
            File file2 = new File(file);
            if (file2.isDirectory()) {
                m1834("Directory " + file2.toString());
                ArrayList arrayListM1838 = m1838(file2, file2);
                String[] strArr3 = (String[]) arrayListM1838.toArray(new String[arrayListM1838.size()]);
                C0465 c0465 = new C0465(0);
                c0465.f2079 = file2;
                m1843(strArr3, c0465);
                return;
            }
            String lowerCase = file.toLowerCase();
            if (!lowerCase.endsWith(".jar") && !lowerCase.endsWith(".zip") && !lowerCase.endsWith(".jmod")) {
                System.err.println("Not a classpath component: ".concat(file));
                return;
            }
            m1834("Archive: " + url);
            ArrayList arrayList = new ArrayList();
            ZipInputStream zipInputStream = new ZipInputStream(url.openStream());
            while (zipInputStream.available() == 1) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null && nextEntry.getName().toLowerCase().endsWith(".class")) {
                    arrayList.add(m1833(nextEntry.getName()));
                }
            }
            zipInputStream.close();
            m1843((String[]) arrayList.toArray(new String[arrayList.size()]), new C0466(url));
            return;
        }
        m1834("FileSystem: " + url);
        try {
            try {
                Stream<Path> streamWalk2 = Files.walk(FileSystems.getFileSystem(new URI("jrt:/")).getPath("modules", url.getPath()), new FileVisitOption[0]);
                try {
                    strArr2 = (String[]) streamWalk2.map(new C0278(3)).filter(new C0456(1)).map(new C0278(4)).toArray(new C0461(0));
                    streamWalk2.close();
                    C0465 c0466 = new C0465(2);
                    c0466.f2079 = url;
                    m1843(strArr2, c0466);
                } catch (Throwable th3) {
                    if (streamWalk2 != null) {
                        try {
                            streamWalk2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (URISyntaxException unused3) {
            strArr2 = new String[0];
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m1843(String[] strArr, AbstractC0464 abstractC0464) {
        for (String str : strArr) {
            String strM1833 = m1833(str);
            String str2 = (strM1833.indexOf(46) == -1 ? new String[]{"<unpackaged>", strM1833} : f2084.split(strM1833))[0];
            ConcurrentHashMap concurrentHashMap = this.f2091;
            Set hashSet = (Set) concurrentHashMap.get(str2);
            if (hashSet == null) {
                hashSet = new HashSet();
                concurrentHashMap.put(str2, hashSet);
            }
            hashSet.add(str);
            ConcurrentHashMap concurrentHashMap2 = this.f2092;
            if (concurrentHashMap2.get(str) == null) {
                concurrentHashMap2.put(str, abstractC0464);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m1844(URL[] urlArr) {
        for (int i = 0; i < urlArr.length; i++) {
            try {
                m1842(urlArr[i]);
            } catch (Exception e) {
                System.err.println("Error constructing classpath: " + urlArr[i] + ": " + e);
                throw new RuntimeException(AbstractC1095.m2794(i, "Failed to map class path "), e);
            }
        }
    }

    public C0468(String str, URL[] urlArr) {
        this(str);
        this.f2089.addAll(Arrays.asList(urlArr));
        if (this.f2093) {
            m1844(urlArr);
        }
    }
}
