package p000;

import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛲ能不能要点脸ᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0323Ujhhgtgfeyxiexzf extends ContextWrapper {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public LayoutInflater f1905Ujhhgtgfeyxiexzf;

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        if (C0291Ujhhgtgfeyxiexzf.f1734Ujhhgtgfeyxiexzf == null) {
            C0291Ujhhgtgfeyxiexzf.f1734Ujhhgtgfeyxiexzf = new C0291Ujhhgtgfeyxiexzf(C0291Ujhhgtgfeyxiexzf.class.getClassLoader(), 0);
        }
        return C0291Ujhhgtgfeyxiexzf.f1734Ujhhgtgfeyxiexzf;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = super.getResources();
        if (!AbstractC0217Ujhhgtgfeyxiexzf.f1493Ujhhgtgfeyxiexzf.isEmpty()) {
            try {
                AssetManager assets = resources.getAssets();
                Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(assets, AbstractC0217Ujhhgtgfeyxiexzf.f1493Ujhhgtgfeyxiexzf);
            } catch (Throwable unused) {
            }
        }
        return resources;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Object systemService = super.getSystemService(str);
        if (!(systemService instanceof LayoutInflater)) {
            return systemService;
        }
        if (this.f1905Ujhhgtgfeyxiexzf == null) {
            LayoutInflater layoutInflaterCloneInContext = ((LayoutInflater) systemService).cloneInContext(this);
            this.f1905Ujhhgtgfeyxiexzf = layoutInflaterCloneInContext;
            this.f1905Ujhhgtgfeyxiexzf.setFactory(new LayoutInflaterFactoryC0316Ujhhgtgfeyxiexzf(layoutInflaterCloneInContext.getFactory(), (C0291Ujhhgtgfeyxiexzf) getClassLoader()));
        }
        return this.f1905Ujhhgtgfeyxiexzf;
    }
}
