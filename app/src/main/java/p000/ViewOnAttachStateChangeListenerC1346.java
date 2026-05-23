package p000;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC0027;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᛸᲀᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1346 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4817;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f4818;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f4819;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1346(Object obj, int i, Object obj2) {
        this.f4817 = i;
        this.f4819 = obj;
        this.f4818 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2;
        ViewOnLayoutChangeListenerC0445 viewOnLayoutChangeListenerC0445;
        switch (this.f4817) {
            case 0:
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                C1349 c1349 = (C1349) this.f4819;
                int i = DialogXBaseRelativeLayout.f932;
                int i2 = 0;
                if (Build.VERSION.SDK_INT >= 30) {
                    int i3 = -1;
                    try {
                        Application applicationM736 = AbstractC0027.m736();
                        if (applicationM736 != null) {
                            i3 = applicationM736.getPackageManager().getApplicationInfo(applicationM736.getPackageName(), 0).targetSdkVersion;
                            break;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (i3 < 30) {
                        view2 = (View) view.getParent();
                        viewOnLayoutChangeListenerC0445 = c1349.f4830;
                        if (viewOnLayoutChangeListenerC0445 != null) {
                            view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC0445);
                        }
                        ViewOnLayoutChangeListenerC0445 viewOnLayoutChangeListenerC0446 = new ViewOnLayoutChangeListenerC0445(1, this);
                        c1349.f4830 = viewOnLayoutChangeListenerC0446;
                        view2.addOnLayoutChangeListener(viewOnLayoutChangeListenerC0446);
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1346(this, i2, view2));
                    }
                } else {
                    view2 = (View) view.getParent();
                    viewOnLayoutChangeListenerC0445 = c1349.f4830;
                    if (viewOnLayoutChangeListenerC0445 != null) {
                        view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC0445);
                    }
                    ViewOnLayoutChangeListenerC0445 viewOnLayoutChangeListenerC0447 = new ViewOnLayoutChangeListenerC0445(1, this);
                    c1349.f4830 = viewOnLayoutChangeListenerC0447;
                    view2.addOnLayoutChangeListener(viewOnLayoutChangeListenerC0447);
                    view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1346(this, i2, view2));
                }
                Field field = AbstractC3578.f11184;
                view.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f4817) {
            case 0:
                ((View) this.f4818).removeOnLayoutChangeListener(((C1349) ((ViewOnAttachStateChangeListenerC1346) this.f4819).f4819).f4830);
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    private final void m3054(View view) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    private final void m3055(View view) {
    }
}
