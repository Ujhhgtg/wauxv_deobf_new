package p000;

import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲁᲈᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2008 extends ContextWrapper {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public LayoutInflater f6691;

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        if (C2003.f6671 == null) {
            C2003.f6671 = new C2003(C2003.class.getClassLoader());
        }
        return C2003.f6671;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = super.getResources();
        if (!AbstractC1460.f5199.isEmpty()) {
            try {
                AssetManager assets = resources.getAssets();
                Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(assets, AbstractC1460.f5199);
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
        if (this.f6691 == null) {
            LayoutInflater layoutInflaterCloneInContext = ((LayoutInflater) systemService).cloneInContext(this);
            this.f6691 = layoutInflaterCloneInContext;
            this.f6691.setFactory(new LayoutInflaterFactoryC2024(layoutInflaterCloneInContext.getFactory(), (C2003) getClassLoader()));
        }
        return this.f6691;
    }
}
