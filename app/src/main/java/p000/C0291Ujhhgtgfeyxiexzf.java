package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ能不能ᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0291Ujhhgtgfeyxiexzf extends ClassLoader {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static C0291Ujhhgtgfeyxiexzf f1734Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1735Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object f1736Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0291Ujhhgtgfeyxiexzf(ClassLoader classLoader, int i) {
        super(classLoader);
        this.f1735Ujhhgtgfeyxiexzf = i;
        switch (i) {
            case 1:
                super(classLoader);
                this.f1736Ujhhgtgfeyxiexzf = new ConcurrentHashMap();
                break;
            default:
                this.f1736Ujhhgtgfeyxiexzf = classLoader;
                break;
        }
    }

    @Override // java.lang.ClassLoader
    public Class findClass(String str) throws ClassNotFoundException {
        switch (this.f1735Ujhhgtgfeyxiexzf) {
            case 1:
                Class cls = (Class) ((ConcurrentHashMap) this.f1736Ujhhgtgfeyxiexzf).get(str);
                if (cls != null) {
                    return cls;
                }
                throw new ClassNotFoundException(str);
            default:
                return super.findClass(str);
        }
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) {
        switch (this.f1735Ujhhgtgfeyxiexzf) {
            case 0:
                try {
                    Class<?> clsLoadClass = ((ClassLoader) this.f1736Ujhhgtgfeyxiexzf).loadClass(str);
                    if (clsLoadClass != null) {
                        return clsLoadClass;
                    }
                } catch (Throwable unused) {
                }
                return super.loadClass(str, z);
            default:
                return super.loadClass(str, z);
        }
    }
}
