package p000;

import android.view.View;
import bsh.C0029Ujhhgtgfeyxiexzf;
import bsh.RunnableC0026Ujhhgtgfeyxiexzf;
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
import javax.crypto.spec.SecretKeySpec;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛴ能不能ᛳᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1457feyxiexzfUjhhgtg implements InterfaceC2588feyxiexzfUjhhgtg, InterfaceC1319feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f5069Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f5070Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f5071Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1457feyxiexzfUjhhgtg(Object obj, int i, Object obj2) {
        this.f5069Ujhhgtgfeyxiexzf = i;
        this.f5070Ujhhgtgfeyxiexzf = obj;
        this.f5071Ujhhgtgfeyxiexzf = obj2;
    }

    @Override // p000.InterfaceC2588feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public Object mo2919Ujhhgtgfeyxiexzf(Object[] objArr) throws IOException {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        int i = this.f5069Ujhhgtgfeyxiexzf;
        ClassLoader classLoader = null;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        Object obj = this.f5071Ujhhgtgfeyxiexzf;
        final int i2 = 0;
        C1435feyxiexzfUjhhgtg c1435feyxiexzfUjhhgtg = (C1435feyxiexzfUjhhgtg) this.f5070Ujhhgtgfeyxiexzf;
        C1414feyxiexzfUjhhgtg c1414feyxiexzfUjhhgtg = (C1414feyxiexzfUjhhgtg) obj;
        switch (i) {
            case 0:
                Object obj2 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                String str = (String) obj2;
                final String canonicalPath = (new File(str).isAbsolute() ? new File(str) : new File(c1414feyxiexzfUjhhgtg.f4963Ujhhgtgfeyxiexzf, str)).getCanonicalPath();
                RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf = c1435feyxiexzfUjhhgtg.f5033Ujhhgtgfeyxiexzf;
                final ClassLoader classLoader2 = C1420feyxiexzfUjhhgtg.class.getClassLoader();
                ConcurrentHashMap concurrentHashMap = AbstractC2592feyxiexzfUjhhgtg.f8390Ujhhgtgfeyxiexzf;
                String strM2827Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2827Ujhhgtgfeyxiexzf(canonicalPath);
                if (strM2827Ujhhgtgfeyxiexzf != null) {
                    classLoader = (ClassLoader) AbstractC2592feyxiexzfUjhhgtg.f8391Ujhhgtgfeyxiexzf.computeIfAbsent(AbstractC2592feyxiexzfUjhhgtg.m3849Ujhhgtgfeyxiexzf("jar", strM2827Ujhhgtgfeyxiexzf, classLoader2), new Function() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛳ要点脸ᛱUjhhgtgᛱᛴ
                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            switch (i2) {
                                case 0:
                                    try {
                                        return AbstractC3611Ujhhgtgfeyxiexzf.m5214Ujhhgtgfeyxiexzf(classLoader2, canonicalPath);
                                    } catch (Exception e) {
                                        System.err.println("[BeanShell] GetLoaderByJar: " + e);
                                        return null;
                                    }
                                default:
                                    try {
                                        return new InMemoryDexClassLoader(ByteBuffer.wrap(Files.readAllBytes(new File(canonicalPath).toPath())), classLoader2);
                                    } catch (Exception e2) {
                                        System.err.println("[BeanShell] GetLoaderByDex: " + e2);
                                        return null;
                                    }
                            }
                        }
                    });
                }
                C2809Ujhhgtgfeyxiexzf c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf.f519Ujhhgtgfeyxiexzf.m364Ujhhgtgfeyxiexzf();
                C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf.f8933Ujhhgtgfeyxiexzf;
                if (classLoader != null) {
                    ((HashSet) c2965Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).add(classLoader);
                } else {
                    c2965Ujhhgtgfeyxiexzf.getClass();
                }
                c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf.m4134Ujhhgtgfeyxiexzf();
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                Object obj3 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                String str2 = (String) obj3;
                String canonicalPath2 = (new File(str2).isAbsolute() ? new File(str2) : new File(c1414feyxiexzfUjhhgtg.f4963Ujhhgtgfeyxiexzf, str2)).getCanonicalPath();
                RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf2 = c1435feyxiexzfUjhhgtg.f5033Ujhhgtgfeyxiexzf;
                C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf2.f519Ujhhgtgfeyxiexzf;
                File fileM341Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf2.m341Ujhhgtgfeyxiexzf(canonicalPath2);
                RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Sourcing file: ", fileM341Ujhhgtgfeyxiexzf);
                BufferedReader bufferedReader = new BufferedReader(new C3450Ujhhgtgfeyxiexzf(new FileInputStream(fileM341Ujhhgtgfeyxiexzf)));
                try {
                    runnableC0026Ujhhgtgfeyxiexzf2.m337Ujhhgtgfeyxiexzf(bufferedReader, c0029Ujhhgtgfeyxiexzf, fileM341Ujhhgtgfeyxiexzf.getName());
                    return c1943Ujhhgtgfeyxiexzf;
                } finally {
                    bufferedReader.close();
                }
            case 2:
                Object obj4 = objArr[0];
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                String str3 = (String) obj4;
                String canonicalPath3 = (new File(str3).isAbsolute() ? new File(str3) : new File(c1414feyxiexzfUjhhgtg.f4963Ujhhgtgfeyxiexzf, str3)).getCanonicalPath();
                StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str3);
                sbM2707Ujhhgtgfeyxiexzf.append(".bshs");
                try {
                    c1435feyxiexzfUjhhgtg.f5033Ujhhgtgfeyxiexzf.m335Ujhhgtgfeyxiexzf(canonicalPath3, sbM2707Ujhhgtgfeyxiexzf.toString(), c1435feyxiexzfUjhhgtg.f5035Ujhhgtgfeyxiexzf);
                    c0919feyxiexzfUjhhgtg = c1943Ujhhgtgfeyxiexzf;
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                if (C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg) != null) {
                    c1435feyxiexzfUjhhgtg.f5032Ujhhgtgfeyxiexzf.m2925Ujhhgtgfeyxiexzf("compileSnapshot Failed");
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                Object obj5 = objArr[0];
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                "null cannot be cast to non-null type kotlin.String";
                String str4 = (String) obj5;
                String canonicalPath4 = (new File(str4).isAbsolute() ? new File(str4) : new File(c1414feyxiexzfUjhhgtg.f4963Ujhhgtgfeyxiexzf, str4)).getCanonicalPath();
                try {
                    RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf3 = c1435feyxiexzfUjhhgtg.f5033Ujhhgtgfeyxiexzf;
                    SecretKeySpec secretKeySpec = c1435feyxiexzfUjhhgtg.f5035Ujhhgtgfeyxiexzf;
                    File fileM341Ujhhgtgfeyxiexzf2 = runnableC0026Ujhhgtgfeyxiexzf3.m341Ujhhgtgfeyxiexzf(canonicalPath4);
                    FileInputStream fileInputStream = new FileInputStream(fileM341Ujhhgtgfeyxiexzf2);
                    try {
                        c0919feyxiexzfUjhhgtg2 = runnableC0026Ujhhgtgfeyxiexzf3.m338Ujhhgtgfeyxiexzf(fileInputStream, secretKeySpec, fileM341Ujhhgtgfeyxiexzf2.getName());
                        fileInputStream.close();
                        if (C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg2) != null) {
                            c1435feyxiexzfUjhhgtg.f5032Ujhhgtgfeyxiexzf.m2925Ujhhgtgfeyxiexzf("evalSnapshot Failed");
                        }
                        return c1943Ujhhgtgfeyxiexzf;
                    } catch (Throwable th2) {
                        fileInputStream.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th3);
                }
                break;
            default:
                Object obj6 = objArr[0];
                "null cannot be cast to non-null type kotlin.String";
                String str5 = (String) obj6;
                final String canonicalPath5 = (new File(str5).isAbsolute() ? new File(str5) : new File(c1414feyxiexzfUjhhgtg.f4963Ujhhgtgfeyxiexzf, str5)).getCanonicalPath();
                RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf4 = c1435feyxiexzfUjhhgtg.f5033Ujhhgtgfeyxiexzf;
                final ClassLoader classLoader3 = C1420feyxiexzfUjhhgtg.class.getClassLoader();
                ConcurrentHashMap concurrentHashMap2 = AbstractC2592feyxiexzfUjhhgtg.f8390Ujhhgtgfeyxiexzf;
                String strM2827Ujhhgtgfeyxiexzf2 = AbstractC1265feyxiexzfUjhhgtg.m2827Ujhhgtgfeyxiexzf(canonicalPath5);
                if (strM2827Ujhhgtgfeyxiexzf2 != null) {
                    final int i3 = 1;
                    classLoader = (ClassLoader) AbstractC2592feyxiexzfUjhhgtg.f8391Ujhhgtgfeyxiexzf.computeIfAbsent(AbstractC2592feyxiexzfUjhhgtg.m3849Ujhhgtgfeyxiexzf("dex", strM2827Ujhhgtgfeyxiexzf2, classLoader3), new Function() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛳ要点脸ᛱUjhhgtgᛱᛴ
                        @Override // java.util.function.Function
                        public final Object apply(Object obj7) {
                            switch (i3) {
                                case 0:
                                    try {
                                        return AbstractC3611Ujhhgtgfeyxiexzf.m5214Ujhhgtgfeyxiexzf(classLoader3, canonicalPath5);
                                    } catch (Exception e) {
                                        System.err.println("[BeanShell] GetLoaderByJar: " + e);
                                        return null;
                                    }
                                default:
                                    try {
                                        return new InMemoryDexClassLoader(ByteBuffer.wrap(Files.readAllBytes(new File(canonicalPath5).toPath())), classLoader3);
                                    } catch (Exception e2) {
                                        System.err.println("[BeanShell] GetLoaderByDex: " + e2);
                                        return null;
                                    }
                            }
                        }
                    });
                }
                C2809Ujhhgtgfeyxiexzf c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf2 = runnableC0026Ujhhgtgfeyxiexzf4.f519Ujhhgtgfeyxiexzf.m364Ujhhgtgfeyxiexzf();
                C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf2 = c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf2.f8933Ujhhgtgfeyxiexzf;
                if (classLoader != null) {
                    ((HashSet) c2965Ujhhgtgfeyxiexzf2.f9276Ujhhgtgfeyxiexzf).add(classLoader);
                } else {
                    c2965Ujhhgtgfeyxiexzf2.getClass();
                }
                c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf2.m4134Ujhhgtgfeyxiexzf();
                return c1943Ujhhgtgfeyxiexzf;
        }
    }

    @Override // p000.InterfaceC1319feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public C2256feyxiexzfUjhhgtg mo2853Ujhhgtgfeyxiexzf(View view, C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtg) {
        C3491Ujhhgtgfeyxiexzf c3491Ujhhgtgfeyxiexzf = (C3491Ujhhgtgfeyxiexzf) this.f5070Ujhhgtgfeyxiexzf;
        C3490feyxiexzfUjhhgtg c3490feyxiexzfUjhhgtg = (C3490feyxiexzfUjhhgtg) this.f5071Ujhhgtgfeyxiexzf;
        if (c3491Ujhhgtgfeyxiexzf.f10838Ujhhgtgfeyxiexzf) {
            return c2256feyxiexzfUjhhgtg;
        }
        c3491Ujhhgtgfeyxiexzf.m4976Ujhhgtgfeyxiexzf(c2256feyxiexzfUjhhgtg, new C3490feyxiexzfUjhhgtg(c3490feyxiexzfUjhhgtg));
        return c2256feyxiexzfUjhhgtg;
    }
}
