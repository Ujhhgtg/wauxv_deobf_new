package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3703Ujhhgtgfeyxiexzf extends ContextWrapper {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static Configuration f11740Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f11741Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public Resources.Theme f11742Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public LayoutInflater f11743Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Configuration f11744Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Resources f11745Ujhhgtgfeyxiexzf;

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f11745Ujhhgtgfeyxiexzf == null) {
            Configuration configuration = this.f11744Ujhhgtgfeyxiexzf;
            if (configuration == null) {
                this.f11745Ujhhgtgfeyxiexzf = super.getResources();
            } else {
                if (f11740Ujhhgtgfeyxiexzf == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f11740Ujhhgtgfeyxiexzf = configuration2;
                }
                if (configuration.equals(f11740Ujhhgtgfeyxiexzf)) {
                    this.f11745Ujhhgtgfeyxiexzf = super.getResources();
                } else {
                    this.f11745Ujhhgtgfeyxiexzf = createConfigurationContext(this.f11744Ujhhgtgfeyxiexzf).getResources();
                }
            }
        }
        return this.f11745Ujhhgtgfeyxiexzf;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f11743Ujhhgtgfeyxiexzf == null) {
            this.f11743Ujhhgtgfeyxiexzf = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f11743Ujhhgtgfeyxiexzf;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f11742Ujhhgtgfeyxiexzf;
        if (theme != null) {
            return theme;
        }
        if (this.f11741Ujhhgtgfeyxiexzf == 0) {
            this.f11741Ujhhgtgfeyxiexzf = R.style.Theme_AppCompat_Light;
        }
        m5381Ujhhgtgfeyxiexzf();
        return this.f11742Ujhhgtgfeyxiexzf;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f11741Ujhhgtgfeyxiexzf != i) {
            this.f11741Ujhhgtgfeyxiexzf = i;
            m5381Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m5381Ujhhgtgfeyxiexzf() {
        if (this.f11742Ujhhgtgfeyxiexzf == null) {
            this.f11742Ujhhgtgfeyxiexzf = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f11742Ujhhgtgfeyxiexzf.setTo(theme);
            }
        }
        this.f11742Ujhhgtgfeyxiexzf.applyStyle(this.f11741Ujhhgtgfeyxiexzf, true);
    }
}
