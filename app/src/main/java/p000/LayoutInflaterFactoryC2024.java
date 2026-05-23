package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲀᤝᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactoryC2024 implements LayoutInflater.Factory {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final LayoutInflater.Factory f6778;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ClassLoader f6779;

    public LayoutInflaterFactoryC2024(LayoutInflater.Factory factory, C2003 c2003) {
        this.f6778 = factory;
        this.f6779 = c2003;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View view;
        try {
            view = (View) this.f6779.loadClass(str).getConstructor(Context.class, AttributeSet.class).newInstance(context, attributeSet);
        } catch (Exception unused) {
            view = null;
        }
        if (view != null) {
            return view;
        }
        LayoutInflater.Factory factory = this.f6778;
        if (factory != null) {
            return factory.onCreateView(str, context, attributeSet);
        }
        return null;
    }
}
