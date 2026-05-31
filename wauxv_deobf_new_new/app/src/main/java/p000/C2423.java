package p000;

import android.view.View;
import bsh.C0012;
import bsh.RunnableC0008;
import dalvik.system.InMemoryDexClassLoader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᲁᲈᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2423 implements InterfaceC0476, InterfaceC2306 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7760;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f7761;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f7762;

    public /* synthetic */ C2423(Object obj, int i, Object obj2) {
        this.f7760 = i;
        this.f7761 = obj;
        this.f7762 = obj2;
    }

    @Override // p000.InterfaceC0476
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public Object mo1848(Object[] objArr) throws IOException {
        int i = this.f7760;
        ClassLoader classLoader = null;
        C3554 c3554 = C3554.UNIT;
        Object obj = this.f7762;
        final int i2 = 0;
        C2426 c2426 = (C2426) this.f7761;
        C2400 c2400 = (C2400) obj;
        switch (i) {
            case 0:
                Object obj2 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                String str = (String) obj2;
                String canonicalPath = (new File(str).isAbsolute() ? new File(str) : new File(c2400.f7679, str)).getCanonicalPath();
                RunnableC0008 runnableC0008 = c2426.f7771;
                C0012 c0012 = runnableC0008.f505;
                File fileM343 = runnableC0008.m343(canonicalPath);
                RunnableC0008.m333("Sourcing file: ", fileM343);
                BufferedReader bufferedReader = new BufferedReader(new C1328_InputStreamReader_UTF8(new FileInputStream(fileM343)));
                try {
                    runnableC0008.m339(bufferedReader, c0012, fileM343.getName());
                    return c3554;
                } finally {
                    bufferedReader.close();
                }
            case 1:
                Object obj3 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                String str2 = (String) obj3;
                final String canonicalPath2 = (new File(str2).isAbsolute() ? new File(str2) : new File(c2400.f7679, str2)).getCanonicalPath();
                RunnableC0008 runnableC0009 = c2426.f7771;
                final ClassLoader classLoader2 = C2406.class.getClassLoader();
                ConcurrentHashMap concurrentHashMap = AbstractC0475.f2114;
                String strM4253 = AbstractC2240.m4253(canonicalPath2);
                if (strM4253 != null) {
                    final int i3 = 1;
                    classLoader = (ClassLoader) AbstractC0475.f2115.computeIfAbsent(AbstractC0475.m1846("dex", strM4253, classLoader2), new Function() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᲇᤝᤞᲈ
                        @Override // java.util.function.Function
                        public final Object apply(Object obj4) {
                            switch (i3) {
                                case 0:
                                    try {
                                        return AbstractC1469.m3329(classLoader2, canonicalPath2);
                                    } catch (Exception e) {
                                        System.err.println("[BeanShell] GetLoaderByJar: " + e);
                                        return null;
                                    }
                                default:
                                    try {
                                        return new InMemoryDexClassLoader(ByteBuffer.wrap(Files.readAllBytes(new File(canonicalPath2).toPath())), classLoader2);
                                    } catch (Exception e2) {
                                        System.err.println("[BeanShell] GetLoaderByDex: " + e2);
                                        return null;
                                    }
                            }
                        }
                    });
                }
                C0458 c0458M365 = runnableC0009.f505.m365();
                C0102 c0102 = c0458M365.f2068;
                if (classLoader != null) {
                    ((HashSet) c0102.f1117).add(classLoader);
                } else {
                    c0102.getClass();
                }
                c0458M365.mo304();
                return c3554;
            default:
                Object obj4 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                String str3 = (String) obj4;
                final String canonicalPath3 = (new File(str3).isAbsolute() ? new File(str3) : new File(c2400.f7679, str3)).getCanonicalPath();
                RunnableC0008 runnableC00010 = c2426.f7771;
                final ClassLoader classLoader3 = C2406.class.getClassLoader();
                ConcurrentHashMap concurrentHashMap2 = AbstractC0475.f2114;
                String strM4254 = AbstractC2240.m4253(canonicalPath3);
                if (strM4254 != null) {
                    classLoader = (ClassLoader) AbstractC0475.f2115.computeIfAbsent(AbstractC0475.m1846("jar", strM4254, classLoader3), new Function() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᲇᤝᤞᲈ
                        @Override // java.util.function.Function
                        public final Object apply(Object obj5) {
                            switch (i2) {
                                case 0:
                                    try {
                                        return AbstractC1469.m3329(classLoader3, canonicalPath3);
                                    } catch (Exception e) {
                                        System.err.println("[BeanShell] GetLoaderByJar: " + e);
                                        return null;
                                    }
                                default:
                                    try {
                                        return new InMemoryDexClassLoader(ByteBuffer.wrap(Files.readAllBytes(new File(canonicalPath3).toPath())), classLoader3);
                                    } catch (Exception e2) {
                                        System.err.println("[BeanShell] GetLoaderByDex: " + e2);
                                        return null;
                                    }
                            }
                        }
                    });
                }
                C0458 c0458M366 = runnableC00010.f505.m365();
                C0102 c0103 = c0458M366.f2068;
                if (classLoader != null) {
                    ((HashSet) c0103.f1117).add(classLoader);
                } else {
                    c0103.getClass();
                }
                c0458M366.mo304();
                return c3554;
        }
    }

    @Override // p000.InterfaceC2306
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public C3729 mo1254(View view, C3729 c3729) {
        C1349 c1349 = (C1349) this.f7761;
        C1348 c1348 = (C1348) this.f7762;
        if (c1349.f4823) {
            return c3729;
        }
        c1349.m3160(c3729, new C1348(c1348));
        return c3729;
    }
}
