package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᤝᲈᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactoryC2056 implements LayoutInflater.Factory {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final LayoutInflater.Factory f6901;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ClassLoader f6902;

    public LayoutInflaterFactoryC2056(LayoutInflater.Factory factory, C2033 c2033) {
        this.f6901 = factory;
        this.f6902 = c2033;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View view;
        try {
            view = (View) this.f6902.loadClass(str).getConstructor(Context.class, AttributeSet.class).newInstance(context, attributeSet);
        } catch (Exception unused) {
            view = null;
        }
        if (view != null) {
            return view;
        }
        LayoutInflater.Factory factory = this.f6901;
        if (factory != null) {
            return factory.onCreateView(str, context, attributeSet);
        }
        return null;
    }
}
