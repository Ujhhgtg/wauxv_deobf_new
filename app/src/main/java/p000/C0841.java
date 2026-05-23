package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0841 extends ContextWrapper {

    public static Configuration f3243;

    public int f3244;

    public Resources.Theme f3245;

    public LayoutInflater f3246;

    public Configuration f3247;

    public Resources f3248;

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
        if (this.f3248 == null) {
            Configuration configuration = this.f3247;
            if (configuration == null) {
                this.f3248 = super.getResources();
            } else {
                if (f3243 == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f3243 = configuration2;
                }
                if (configuration.equals(f3243)) {
                    this.f3248 = super.getResources();
                } else {
                    this.f3248 = createConfigurationContext(this.f3247).getResources();
                }
            }
        }
        return this.f3248;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3246 == null) {
            this.f3246 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3246;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f3245;
        if (theme != null) {
            return theme;
        }
        if (this.f3244 == 0) {
            this.f3244 = R.style.Theme_AppCompat_Light;
        }
        m2379();
        return this.f3245;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f3244 != i) {
            this.f3244 = i;
            m2379();
        }
    }

    public final void m2379() {
        if (this.f3245 == null) {
            this.f3245 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3245.setTo(theme);
            }
        }
        this.f3245.applyStyle(this.f3244, true);
    }
}
