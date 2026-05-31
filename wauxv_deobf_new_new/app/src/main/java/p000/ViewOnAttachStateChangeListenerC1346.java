package p000;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲁᲈᤞᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1346 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4814;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f4815;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f4816;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1346(Object obj, int i, Object obj2) {
        this.f4814 = i;
        this.f4816 = obj;
        this.f4815 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2;
        ViewOnLayoutChangeListenerC0420 viewOnLayoutChangeListenerC0420;
        switch (this.f4814) {
            case 0:
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                C1349 c1349 = (C1349) this.f4816;
                int i = DialogXBaseRelativeLayout.f998;
                int i2 = 0;
                if (Build.VERSION.SDK_INT >= 30) {
                    int i3 = -1;
                    try {
                        Application applicationM880 = AbstractC0034.m880();
                        if (applicationM880 != null) {
                            i3 = applicationM880.getPackageManager().getApplicationInfo(applicationM880.getPackageName(), 0).targetSdkVersion;
                            break;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (i3 < 30) {
                        view2 = (View) view.getParent();
                        viewOnLayoutChangeListenerC0420 = c1349.f4827;
                        if (viewOnLayoutChangeListenerC0420 != null) {
                            view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC0420);
                        }
                        ViewOnLayoutChangeListenerC0420 viewOnLayoutChangeListenerC0421 = new ViewOnLayoutChangeListenerC0420(this, 1);
                        c1349.f4827 = viewOnLayoutChangeListenerC0421;
                        view2.addOnLayoutChangeListener(viewOnLayoutChangeListenerC0421);
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1346(this, i2, view2));
                    }
                } else {
                    view2 = (View) view.getParent();
                    viewOnLayoutChangeListenerC0420 = c1349.f4827;
                    if (viewOnLayoutChangeListenerC0420 != null) {
                        view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC0420);
                    }
                    ViewOnLayoutChangeListenerC0420 viewOnLayoutChangeListenerC0422 = new ViewOnLayoutChangeListenerC0420(this, 1);
                    c1349.f4827 = viewOnLayoutChangeListenerC0422;
                    view2.addOnLayoutChangeListener(viewOnLayoutChangeListenerC0422);
                    view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1346(this, i2, view2));
                }
                Field field = AbstractC3638.f11333;
                view.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f4814) {
            case 0:
                ((View) this.f4815).removeOnLayoutChangeListener(((C1349) ((ViewOnAttachStateChangeListenerC1346) this.f4816).f4816).f4827);
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    private final void m3157(View view) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    private final void m3158(View view) {
    }
}
