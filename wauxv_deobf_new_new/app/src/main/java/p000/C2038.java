package p000;

import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲀᲁᲈᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2038 extends ContextWrapper {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public LayoutInflater f6792;

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        if (C2033.f6771 == null) {
            C2033.f6771 = new C2033(C2033.class.getClassLoader(), 0);
        }
        return C2033.f6771;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = super.getResources();
        if (!AbstractC2902.f9279.isEmpty()) {
            try {
                AssetManager assets = resources.getAssets();
                Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(assets, AbstractC2902.f9279);
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
        if (this.f6792 == null) {
            LayoutInflater layoutInflaterCloneInContext = ((LayoutInflater) systemService).cloneInContext(this);
            this.f6792 = layoutInflaterCloneInContext;
            this.f6792.setFactory(new LayoutInflaterFactoryC2056(layoutInflaterCloneInContext.getFactory(), (C2033) getClassLoader()));
        }
        return this.f6792;
    }
}
