package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛲᛴ能不能要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactoryC0316Ujhhgtgfeyxiexzf implements LayoutInflater.Factory {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final LayoutInflater.Factory f1872Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ClassLoader f1873Ujhhgtgfeyxiexzf;

    public LayoutInflaterFactoryC0316Ujhhgtgfeyxiexzf(LayoutInflater.Factory factory, C0291Ujhhgtgfeyxiexzf c0291Ujhhgtgfeyxiexzf) {
        this.f1872Ujhhgtgfeyxiexzf = factory;
        this.f1873Ujhhgtgfeyxiexzf = c0291Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View view;
        try {
            view = (View) this.f1873Ujhhgtgfeyxiexzf.loadClass(str).getConstructor(Context.class, AttributeSet.class).newInstance(context, attributeSet);
        } catch (Exception unused) {
            view = null;
        }
        if (view != null) {
            return view;
        }
        LayoutInflater.Factory factory = this.f1872Ujhhgtgfeyxiexzf;
        if (factory != null) {
            return factory.onCreateView(str, context, attributeSet);
        }
        return null;
    }
}
