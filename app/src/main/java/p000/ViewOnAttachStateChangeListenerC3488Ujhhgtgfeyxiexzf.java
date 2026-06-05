package p000;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛴ能不能ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3488Ujhhgtgfeyxiexzf implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10829Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f10830Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f10831Ujhhgtgfeyxiexzf;

    public /* synthetic */ ViewOnAttachStateChangeListenerC3488Ujhhgtgfeyxiexzf(Object obj, int i, Object obj2) {
        this.f10829Ujhhgtgfeyxiexzf = i;
        this.f10831Ujhhgtgfeyxiexzf = obj;
        this.f10830Ujhhgtgfeyxiexzf = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2;
        ViewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg viewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg;
        switch (this.f10829Ujhhgtgfeyxiexzf) {
            case 0:
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                C3491Ujhhgtgfeyxiexzf c3491Ujhhgtgfeyxiexzf = (C3491Ujhhgtgfeyxiexzf) this.f10831Ujhhgtgfeyxiexzf;
                int i = DialogXBaseRelativeLayout.f1012Ujhhgtgfeyxiexzf;
                int i2 = 0;
                if (Build.VERSION.SDK_INT >= 30) {
                    int i3 = -1;
                    try {
                        Application applicationM881Ujhhgtgfeyxiexzf = Ujhhgtgfeyxiexzf.m881Ujhhgtgfeyxiexzf();
                        if (applicationM881Ujhhgtgfeyxiexzf != null) {
                            i3 = applicationM881Ujhhgtgfeyxiexzf.getPackageManager().getApplicationInfo(applicationM881Ujhhgtgfeyxiexzf.getPackageName(), 0).targetSdkVersion;
                            break;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (i3 < 30) {
                        view2 = (View) view.getParent();
                        viewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg = c3491Ujhhgtgfeyxiexzf.f10842Ujhhgtgfeyxiexzf;
                        if (viewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg != null) {
                            view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg);
                        }
                        ViewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg viewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg2 = new ViewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg(1, this);
                        c3491Ujhhgtgfeyxiexzf.f10842Ujhhgtgfeyxiexzf = viewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg2;
                        view2.addOnLayoutChangeListener(viewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg2);
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3488Ujhhgtgfeyxiexzf(this, i2, view2));
                    }
                } else {
                    view2 = (View) view.getParent();
                    viewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg = c3491Ujhhgtgfeyxiexzf.f10842Ujhhgtgfeyxiexzf;
                    if (viewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg != null) {
                        view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg);
                    }
                    ViewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg viewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg3 = new ViewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg(1, this);
                    c3491Ujhhgtgfeyxiexzf.f10842Ujhhgtgfeyxiexzf = viewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg3;
                    view2.addOnLayoutChangeListener(viewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg3);
                    view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3488Ujhhgtgfeyxiexzf(this, i2, view2));
                }
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                view.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f10829Ujhhgtgfeyxiexzf) {
            case 0:
                ((View) this.f10830Ujhhgtgfeyxiexzf).removeOnLayoutChangeListener(((C3491Ujhhgtgfeyxiexzf) ((ViewOnAttachStateChangeListenerC3488Ujhhgtgfeyxiexzf) this.f10831Ujhhgtgfeyxiexzf).f10831Ujhhgtgfeyxiexzf).f10842Ujhhgtgfeyxiexzf);
                break;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    private final void m4973Ujhhgtgfeyxiexzf(View view) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    private final void m4974Ujhhgtgfeyxiexzf(View view) {
    }
}
