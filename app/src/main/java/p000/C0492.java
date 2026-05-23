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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲀᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0492 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final Pattern f2108 = Pattern.compile("[/\\\\]");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final Pattern f2109 = Pattern.compile("^modules/[^/]+/");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final Pattern f2110 = Pattern.compile("\\.[^\\.]+$");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final Pattern f2111 = Pattern.compile("\\.(?=[^.]+$)");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static URL[] f2112;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static C0492 f2113;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static C0492 f2114;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f2115;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f2116;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f2117;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ConcurrentHashMap f2118;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ConcurrentHashMap f2119;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f2120;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0491 f2121;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Vector f2122;

    public C0492(String str) {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        this.f2116 = keySetViewNewKeySet;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet2 = ConcurrentHashMap.newKeySet();
        this.f2117 = keySetViewNewKeySet2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f2118 = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.f2119 = concurrentHashMap2;
        this.f2122 = new Vector();
        this.f2115 = str;
        keySetViewNewKeySet.clear();
        keySetViewNewKeySet2.clear();
        this.f2120 = false;
        concurrentHashMap.clear();
        concurrentHashMap2.clear();
        this.f2121 = null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static String m1727(String str) {
        if (str.startsWith("modules/")) {
            str = f2109.matcher(str).replaceFirst("");
        }
        if (str.indexOf(47) >= 0 || str.indexOf(92) >= 0) {
            str = f2108.matcher(str).replaceAll(".");
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
        return str.endsWith(".class") ? f2110.matcher(str).replaceFirst("") : str;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m1728(String str) {
        System.err.println("Mapping: " + str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C0492 m1729() throws C0706 {
        if (f2114 == null) {
            try {
                f2114 = new C0492("Boot Class Path", new URL[]{m1730()});
            } catch (MalformedURLException e) {
                throw new C0706(" can't find boot jar: " + e, e);
            }
        }
        return f2114;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static URL m1730() {
        String externalForm = Class.class.getResource("/java/lang/String.class").toExternalForm();
        return externalForm.startsWith("jrt:/") ? new URL(externalForm.substring(0, externalForm.indexOf(47, 5))) : new URL(externalForm.replaceFirst("[^!]*$", "/"));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static C0492 m1731() throws C0706 {
        if (f2113 == null) {
            URL[] urlArr = f2112;
            if (urlArr == null) {
                String property = System.getProperty("java.class.path");
                String[] strArrSplit = property == null ? new String[0] : property.split(File.pathSeparator);
                URL[] urlArr2 = new URL[strArrSplit.length];
                for (int i = 0; i < strArrSplit.length; i++) {
                    try {
                        urlArr2[i] = new File(new File(strArrSplit[i]).getCanonicalPath()).toURI().toURL();
                    } catch (IOException e) {
                        throw new C0706("can't parse class path: " + e, e);
                    }
                }
                f2112 = urlArr2;
                urlArr = urlArr2;
            }
            f2113 = new C0492("User Class Path", urlArr);
        }
        return f2113;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static ArrayList m1732(File file, File file2) throws IOException {
        ArrayList arrayList = new ArrayList();
        String absolutePath = file.getAbsolutePath();
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file3 : fileArrListFiles) {
            if (file3.isDirectory()) {
                arrayList.addAll(m1732(file, file3));
            } else {
                String absolutePath2 = file3.getAbsolutePath();
                if (!absolutePath2.toLowerCase().endsWith(".class")) {
                    continue;
                } else {
                    if (!absolutePath2.startsWith(absolutePath)) {
                        throw new IOException("problem parsing paths");
                    }
                    arrayList.add(m1727(absolutePath2.substring(absolutePath.length() + 1)));
                }
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "BshClassPath " + this.f2115 + "(" + super.toString() + ") path= " + this.f2116 + "\ncompPaths = {" + this.f2117 + " }";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1733(C0492 c0492) {
        if (c0492 == null) {
            return;
        }
        this.f2117.add(c0492);
        c0492.f2122.addElement(new WeakReference(this));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AbstractC0488 m1734(String str) {
        ConcurrentHashMap concurrentHashMap = this.f2119;
        AbstractC0488 abstractC0488 = (AbstractC0488) concurrentHashMap.get(str);
        if (abstractC0488 != null) {
            return abstractC0488;
        }
        m1735(true);
        Iterator it = this.f2117.iterator();
        AbstractC0488 abstractC0488M1734 = (AbstractC0488) concurrentHashMap.get(str);
        while (abstractC0488M1734 == null && it.hasNext()) {
            abstractC0488M1734 = ((C0492) it.next()).m1734(str);
        }
        return abstractC0488M1734;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m1735(boolean z) {
        if (z && !this.f2120) {
            System.err.println("Start ClassPath Mapping");
        }
        this.f2117.forEach(new C0483());
        if (!this.f2120) {
            m1738((URL[]) this.f2116.toArray(new URL[0]));
        }
        if (z && !this.f2120) {
            System.err.println("End ClassPath Mapping");
        }
        this.f2120 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m1736(URL url) throws Exception {
        String[] strArr;
        String[] strArr2;
        if (!"jrt".equals(url.getProtocol())) {
            if ("jar".equals(url.getProtocol())) {
                m1728("FileSystem: " + url);
                try {
                    try {
                        FileSystems.newFileSystem(url.toURI(), new HashMap());
                    } catch (FileSystemAlreadyExistsException unused) {
                    }
                    try {
                        Stream<Path> streamWalk = Files.walk(FileSystems.getFileSystem(url.toURI()).getPath("/", new String[0]), new FileVisitOption[0]);
                        try {
                            strArr = (String[]) streamWalk.map(new C0268(3)).filter(new C0335(2)).map(new C0268(4)).toArray(new C0484(1));
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
                m1737(strArr, new C0490(url));
                return;
            }
            String file = url.getFile();
            File file2 = new File(file);
            if (file2.isDirectory()) {
                m1728("Directory " + file2.toString());
                ArrayList arrayListM1732 = m1732(file2, file2);
                String[] strArr3 = (String[]) arrayListM1732.toArray(new String[arrayListM1732.size()]);
                C0489 c0489 = new C0489(0);
                c0489.f2105 = file2;
                m1737(strArr3, c0489);
                return;
            }
            String lowerCase = file.toLowerCase();
            if (!lowerCase.endsWith(".jar") && !lowerCase.endsWith(".zip") && !lowerCase.endsWith(".jmod")) {
                System.err.println("Not a classpath component: ".concat(file));
                return;
            }
            m1728("Archive: " + url);
            ArrayList arrayList = new ArrayList();
            ZipInputStream zipInputStream = new ZipInputStream(url.openStream());
            while (zipInputStream.available() == 1) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null && nextEntry.getName().toLowerCase().endsWith(".class")) {
                    arrayList.add(m1727(nextEntry.getName()));
                }
            }
            zipInputStream.close();
            m1737((String[]) arrayList.toArray(new String[arrayList.size()]), new C0490(url));
            return;
        }
        m1728("FileSystem: " + url);
        try {
            try {
                Stream<Path> streamWalk2 = Files.walk(FileSystems.getFileSystem(new URI("jrt:/")).getPath("modules", url.getPath()), new FileVisitOption[0]);
                try {
                    strArr2 = (String[]) streamWalk2.map(new C0268(3)).filter(new C0335(2)).map(new C0268(4)).toArray(new C0484(0));
                    streamWalk2.close();
                    C0489 c04810 = new C0489(2);
                    c04810.f2105 = url;
                    m1737(strArr2, c04810);
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
    public final void m1737(String[] strArr, AbstractC0488 abstractC0488) {
        for (String str : strArr) {
            String strM1727 = m1727(str);
            String str2 = (strM1727.indexOf(46) == -1 ? new String[]{"<unpackaged>", strM1727} : f2111.split(strM1727))[0];
            ConcurrentHashMap concurrentHashMap = this.f2118;
            Set hashSet = (Set) concurrentHashMap.get(str2);
            if (hashSet == null) {
                hashSet = new HashSet();
                concurrentHashMap.put(str2, hashSet);
            }
            hashSet.add(str);
            ConcurrentHashMap concurrentHashMap2 = this.f2119;
            if (concurrentHashMap2.get(str) == null) {
                concurrentHashMap2.put(str, abstractC0488);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m1738(URL[] urlArr) {
        for (int i = 0; i < urlArr.length; i++) {
            try {
                m1736(urlArr[i]);
            } catch (Exception e) {
                System.err.println("Error constructing classpath: " + urlArr[i] + ": " + e);
                throw new RuntimeException(AbstractC1194.m2779(i, "Failed to map class path "), e);
            }
        }
    }

    public C0492(String str, URL[] urlArr) {
        this(str);
        this.f2116.addAll(Arrays.asList(urlArr));
        if (this.f2120) {
            m1738(urlArr);
        }
    }
}
