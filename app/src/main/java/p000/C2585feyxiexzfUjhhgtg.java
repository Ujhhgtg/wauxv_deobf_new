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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2585feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final Pattern f8361Ujhhgtgfeyxiexzf = Pattern.compile("[/\\\\]");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Pattern f8362Ujhhgtgfeyxiexzf = Pattern.compile("^modules/[^/]+/");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final Pattern f8363Ujhhgtgfeyxiexzf = Pattern.compile("\\.[^\\.]+$");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final Pattern f8364Ujhhgtgfeyxiexzf = Pattern.compile("\\.(?=[^.]+$)");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static URL[] f8365Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static C2585feyxiexzfUjhhgtg f8366Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static C2585feyxiexzfUjhhgtg f8367Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f8368Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f8369Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f8370Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ConcurrentHashMap f8371Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final ConcurrentHashMap f8372Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f8373Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C2604feyxiexzfUjhhgtg f8374Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Vector f8375Ujhhgtgfeyxiexzf;

    public C2585feyxiexzfUjhhgtg(String str) {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        this.f8369Ujhhgtgfeyxiexzf = keySetViewNewKeySet;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet2 = ConcurrentHashMap.newKeySet();
        this.f8370Ujhhgtgfeyxiexzf = keySetViewNewKeySet2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f8371Ujhhgtgfeyxiexzf = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.f8372Ujhhgtgfeyxiexzf = concurrentHashMap2;
        this.f8375Ujhhgtgfeyxiexzf = new Vector();
        this.f8368Ujhhgtgfeyxiexzf = str;
        keySetViewNewKeySet.clear();
        keySetViewNewKeySet2.clear();
        this.f8373Ujhhgtgfeyxiexzf = false;
        concurrentHashMap.clear();
        concurrentHashMap2.clear();
        this.f8374Ujhhgtgfeyxiexzf = null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static String m3833Ujhhgtgfeyxiexzf(String str) {
        if (str.startsWith("modules/")) {
            str = f8362Ujhhgtgfeyxiexzf.matcher(str).replaceFirst("");
        }
        if (str.indexOf(47) >= 0 || str.indexOf(92) >= 0) {
            str = f8361Ujhhgtgfeyxiexzf.matcher(str).replaceAll(".");
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
        return str.endsWith(".class") ? f8363Ujhhgtgfeyxiexzf.matcher(str).replaceFirst("") : str;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m3834Ujhhgtgfeyxiexzf(String str) {
        System.err.println("Mapping: " + str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static C2585feyxiexzfUjhhgtg m3835Ujhhgtgfeyxiexzf() throws C2811Ujhhgtgfeyxiexzf {
        if (f8367Ujhhgtgfeyxiexzf == null) {
            try {
                f8367Ujhhgtgfeyxiexzf = new C2585feyxiexzfUjhhgtg("Boot Class Path", new URL[]{m3836Ujhhgtgfeyxiexzf()});
            } catch (MalformedURLException e) {
                throw new C2811Ujhhgtgfeyxiexzf(" can't find boot jar: " + e, e);
            }
        }
        return f8367Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static URL m3836Ujhhgtgfeyxiexzf() {
        String externalForm = Class.class.getResource("/java/lang/String.class").toExternalForm();
        return externalForm.startsWith("jrt:/") ? new URL(externalForm.substring(0, externalForm.indexOf(47, 5))) : new URL(externalForm.replaceFirst("[^!]*$", "/"));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static C2585feyxiexzfUjhhgtg m3837Ujhhgtgfeyxiexzf() throws C2811Ujhhgtgfeyxiexzf {
        if (f8366Ujhhgtgfeyxiexzf == null) {
            URL[] urlArr = f8365Ujhhgtgfeyxiexzf;
            if (urlArr == null) {
                String property = System.getProperty("java.class.path");
                String[] strArrSplit = property == null ? new String[0] : property.split(File.pathSeparator);
                URL[] urlArr2 = new URL[strArrSplit.length];
                for (int i = 0; i < strArrSplit.length; i++) {
                    try {
                        urlArr2[i] = new File(new File(strArrSplit[i]).getCanonicalPath()).toURI().toURL();
                    } catch (IOException e) {
                        throw new C2811Ujhhgtgfeyxiexzf("can't parse class path: " + e, e);
                    }
                }
                f8365Ujhhgtgfeyxiexzf = urlArr2;
                urlArr = urlArr2;
            }
            f8366Ujhhgtgfeyxiexzf = new C2585feyxiexzfUjhhgtg("User Class Path", urlArr);
        }
        return f8366Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static ArrayList m3838Ujhhgtgfeyxiexzf(File file, File file2) throws IOException {
        ArrayList arrayList = new ArrayList();
        String absolutePath = file.getAbsolutePath();
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file3 : fileArrListFiles) {
            if (file3.isDirectory()) {
                arrayList.addAll(m3838Ujhhgtgfeyxiexzf(file, file3));
            } else {
                String absolutePath2 = file3.getAbsolutePath();
                if (!absolutePath2.toLowerCase().endsWith(".class")) {
                    continue;
                } else {
                    if (!absolutePath2.startsWith(absolutePath)) {
                        throw new IOException("problem parsing paths");
                    }
                    arrayList.add(m3833Ujhhgtgfeyxiexzf(absolutePath2.substring(absolutePath.length() + 1)));
                }
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "BshClassPath " + this.f8368Ujhhgtgfeyxiexzf + "(" + super.toString() + ") path= " + this.f8369Ujhhgtgfeyxiexzf + "\ncompPaths = {" + this.f8370Ujhhgtgfeyxiexzf + " }";
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3839Ujhhgtgfeyxiexzf(C2585feyxiexzfUjhhgtg c2585feyxiexzfUjhhgtg) {
        if (c2585feyxiexzfUjhhgtg == null) {
            return;
        }
        this.f8370Ujhhgtgfeyxiexzf.add(c2585feyxiexzfUjhhgtg);
        c2585feyxiexzfUjhhgtg.f8375Ujhhgtgfeyxiexzf.addElement(new WeakReference(this));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final AbstractC2601feyxiexzfUjhhgtg m3840Ujhhgtgfeyxiexzf(String str) {
        ConcurrentHashMap concurrentHashMap = this.f8372Ujhhgtgfeyxiexzf;
        AbstractC2601feyxiexzfUjhhgtg abstractC2601feyxiexzfUjhhgtg = (AbstractC2601feyxiexzfUjhhgtg) concurrentHashMap.get(str);
        if (abstractC2601feyxiexzfUjhhgtg != null) {
            return abstractC2601feyxiexzfUjhhgtg;
        }
        m3841Ujhhgtgfeyxiexzf(true);
        Iterator it = this.f8370Ujhhgtgfeyxiexzf.iterator();
        AbstractC2601feyxiexzfUjhhgtg abstractC2601feyxiexzfUjhhgtgM3840Ujhhgtgfeyxiexzf = (AbstractC2601feyxiexzfUjhhgtg) concurrentHashMap.get(str);
        while (abstractC2601feyxiexzfUjhhgtgM3840Ujhhgtgfeyxiexzf == null && it.hasNext()) {
            abstractC2601feyxiexzfUjhhgtgM3840Ujhhgtgfeyxiexzf = ((C2585feyxiexzfUjhhgtg) it.next()).m3840Ujhhgtgfeyxiexzf(str);
        }
        return abstractC2601feyxiexzfUjhhgtgM3840Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m3841Ujhhgtgfeyxiexzf(boolean z) {
        if (z && !this.f8373Ujhhgtgfeyxiexzf) {
            System.err.println("Start ClassPath Mapping");
        }
        this.f8370Ujhhgtgfeyxiexzf.forEach(new C2572Ujhhgtgfeyxiexzf(0));
        if (!this.f8373Ujhhgtgfeyxiexzf) {
            m3844Ujhhgtgfeyxiexzf((URL[]) this.f8369Ujhhgtgfeyxiexzf.toArray(new URL[0]));
        }
        if (z && !this.f8373Ujhhgtgfeyxiexzf) {
            System.err.println("End ClassPath Mapping");
        }
        this.f8373Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m3842Ujhhgtgfeyxiexzf(URL url) throws Exception {
        String[] strArr;
        String[] strArr2;
        if (!"jrt".equals(url.getProtocol())) {
            if ("jar".equals(url.getProtocol())) {
                m3834Ujhhgtgfeyxiexzf("FileSystem: " + url);
                try {
                    try {
                        FileSystems.newFileSystem(url.toURI(), new HashMap());
                    } catch (FileSystemAlreadyExistsException unused) {
                    }
                    try {
                        Stream<Path> streamWalk = Files.walk(FileSystems.getFileSystem(url.toURI()).getPath("/", new String[0]), new FileVisitOption[0]);
                        try {
                            strArr = (String[]) streamWalk.map(new C2389Ujhhgtgfeyxiexzf(3)).filter(new C2574Ujhhgtgfeyxiexzf(1)).map(new C2389Ujhhgtgfeyxiexzf(4)).toArray(new C2571Ujhhgtgfeyxiexzf(1));
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
                m3843Ujhhgtgfeyxiexzf(strArr, new C2603feyxiexzfUjhhgtg(url));
                return;
            }
            String file = url.getFile();
            File file2 = new File(file);
            if (file2.isDirectory()) {
                m3834Ujhhgtgfeyxiexzf("Directory " + file2.toString());
                ArrayList arrayListM3838Ujhhgtgfeyxiexzf = m3838Ujhhgtgfeyxiexzf(file2, file2);
                String[] strArr3 = (String[]) arrayListM3838Ujhhgtgfeyxiexzf.toArray(new String[arrayListM3838Ujhhgtgfeyxiexzf.size()]);
                C2602feyxiexzfUjhhgtg c2602feyxiexzfUjhhgtg = new C2602feyxiexzfUjhhgtg(0);
                c2602feyxiexzfUjhhgtg.f8405Ujhhgtgfeyxiexzf = file2;
                m3843Ujhhgtgfeyxiexzf(strArr3, c2602feyxiexzfUjhhgtg);
                return;
            }
            String lowerCase = file.toLowerCase();
            if (!lowerCase.endsWith(".jar") && !lowerCase.endsWith(".zip") && !lowerCase.endsWith(".jmod")) {
                System.err.println("Not a classpath component: ".concat(file));
                return;
            }
            m3834Ujhhgtgfeyxiexzf("Archive: " + url);
            ArrayList arrayList = new ArrayList();
            ZipInputStream zipInputStream = new ZipInputStream(url.openStream());
            while (zipInputStream.available() == 1) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null && nextEntry.getName().toLowerCase().endsWith(".class")) {
                    arrayList.add(m3833Ujhhgtgfeyxiexzf(nextEntry.getName()));
                }
            }
            zipInputStream.close();
            m3843Ujhhgtgfeyxiexzf((String[]) arrayList.toArray(new String[arrayList.size()]), new C2603feyxiexzfUjhhgtg(url));
            return;
        }
        m3834Ujhhgtgfeyxiexzf("FileSystem: " + url);
        try {
            try {
                Stream<Path> streamWalk2 = Files.walk(FileSystems.getFileSystem(new URI("jrt:/")).getPath("modules", url.getPath()), new FileVisitOption[0]);
                try {
                    strArr2 = (String[]) streamWalk2.map(new C2389Ujhhgtgfeyxiexzf(3)).filter(new C2574Ujhhgtgfeyxiexzf(1)).map(new C2389Ujhhgtgfeyxiexzf(4)).toArray(new C2571Ujhhgtgfeyxiexzf(0));
                    streamWalk2.close();
                    C2602feyxiexzfUjhhgtg c2602feyxiexzfUjhhgtg2 = new C2602feyxiexzfUjhhgtg(2);
                    c2602feyxiexzfUjhhgtg2.f8405Ujhhgtgfeyxiexzf = url;
                    m3843Ujhhgtgfeyxiexzf(strArr2, c2602feyxiexzfUjhhgtg2);
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3843Ujhhgtgfeyxiexzf(String[] strArr, AbstractC2601feyxiexzfUjhhgtg abstractC2601feyxiexzfUjhhgtg) {
        for (String str : strArr) {
            String strM3833Ujhhgtgfeyxiexzf = m3833Ujhhgtgfeyxiexzf(str);
            String str2 = (strM3833Ujhhgtgfeyxiexzf.indexOf(46) == -1 ? new String[]{"<unpackaged>", strM3833Ujhhgtgfeyxiexzf} : f8364Ujhhgtgfeyxiexzf.split(strM3833Ujhhgtgfeyxiexzf))[0];
            ConcurrentHashMap concurrentHashMap = this.f8371Ujhhgtgfeyxiexzf;
            Set hashSet = (Set) concurrentHashMap.get(str2);
            if (hashSet == null) {
                hashSet = new HashSet();
                concurrentHashMap.put(str2, hashSet);
            }
            hashSet.add(str);
            ConcurrentHashMap concurrentHashMap2 = this.f8372Ujhhgtgfeyxiexzf;
            if (concurrentHashMap2.get(str) == null) {
                concurrentHashMap2.put(str, abstractC2601feyxiexzfUjhhgtg);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m3844Ujhhgtgfeyxiexzf(URL[] urlArr) {
        for (int i = 0; i < urlArr.length; i++) {
            try {
                m3842Ujhhgtgfeyxiexzf(urlArr[i]);
            } catch (Exception e) {
                System.err.println("Error constructing classpath: " + urlArr[i] + ": " + e);
                throw new RuntimeException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Failed to map class path "), e);
            }
        }
    }

    public C2585feyxiexzfUjhhgtg(String str, URL[] urlArr) {
        this(str);
        this.f8369Ujhhgtgfeyxiexzf.addAll(Arrays.asList(urlArr));
        if (this.f8373Ujhhgtgfeyxiexzf) {
            m3844Ujhhgtgfeyxiexzf(urlArr);
        }
    }
}
