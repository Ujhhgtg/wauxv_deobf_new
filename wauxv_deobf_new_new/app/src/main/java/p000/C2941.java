package p000;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᤞᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2941 extends AbstractC2927 implements InterfaceC1615 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2941 f9397;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final Set f9398;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final Set f9399;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f9400;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f9401;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final String f9402;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final C2868 f9403;

    static {
        String[] strArr = AbstractC1471.f5234;
        f9397 = new C2941("SystemBrowserHook");
        String[] strArr2 = {"weixin.com", "qq.com", "weixin.qq.com.cn", "wechatpay.cn", "tenpay.com", "weixinbridge.com"};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1924.m3872(6));
        for (int i = 0; i < 6; i++) {
            linkedHashSet.add(strArr2[i]);
        }
        f9398 = linkedHashSet;
        String[] strArr3 = {"test.com"};
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC1924.m3872(1));
        linkedHashSet2.add(strArr3[0]);
        f9399 = linkedHashSet2;
        f9400 = "杂项";
        f9401 = "系统浏览器";
        f9402 = "致敬经典模块 '去你大爷的内置浏览器' ";
        f9403 = new C2868(18);
    }

    @Override // p000.InterfaceC1615
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1553(C1574 c1574, Intent intent) {
        String stringExtra;
        String shortClassName;
        ActivityOptions activityOptionsMakeBasic;
        String[] strArr = AbstractC1471.f5234;
        if (!mo3445() || (stringExtra = intent.getStringExtra("rawUrl")) == null || AbstractC2901.m4869(stringExtra)) {
            return;
        }
        if (stringExtra.startsWith("http://") || stringExtra.startsWith("https://")) {
            String strM4879 = AbstractC2901.m4879(AbstractC2901.m4877(stringExtra, "://", stringExtra), "/");
            int iM2662 = C2939.f9395.m2662();
            if (iM2662 == EnumC2935.f9387.f9390) {
                Set setM2665 = C2940.f9396.m2665();
                if (setM2665 == null || !setM2665.isEmpty()) {
                    Iterator it = setM2665.iterator();
                    while (it.hasNext()) {
                        if (strM4879.endsWith((String) it.next())) {
                            return;
                        }
                    }
                }
            } else if (iM2662 == EnumC2935.f9388.f9390) {
                Set setM2666 = C2938.f9394.m2665();
                if (setM2666 == null || !setM2666.isEmpty()) {
                    Iterator it2 = setM2666.iterator();
                    while (it2.hasNext()) {
                        if (strM4879.endsWith((String) it2.next())) {
                        }
                    }
                    return;
                }
                return;
            }
            ComponentName component = intent.getComponent();
            if (component == null || (shortClassName = component.getShortClassName()) == null || !AbstractC2901.m4861(shortClassName, "MMWebViewUI", false)) {
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW");
            if (!intent2.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                intent2.putExtras(bundle);
            }
            intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent2.putExtras(new Bundle());
            intent2.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            int i = Build.VERSION.SDK_INT;
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
            if (!TextUtils.isEmpty(languageTag)) {
                Bundle bundleExtra = intent2.hasExtra("com.android.browser.headers") ? intent2.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", languageTag);
                    intent2.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
            if (i >= 34) {
                activityOptionsMakeBasic = ActivityOptions.makeBasic();
                AbstractC0096.m1222(activityOptionsMakeBasic);
            } else {
                activityOptionsMakeBasic = null;
            }
            if (i >= 36) {
                if (activityOptionsMakeBasic == null) {
                    activityOptionsMakeBasic = ActivityOptions.makeBasic();
                }
                AbstractC0097.m1227(activityOptionsMakeBasic, true ^ intent2.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
            }
            Bundle bundle2 = activityOptionsMakeBasic != null ? activityOptionsMakeBasic.toBundle() : null;
            intent2.addFlags(268435456);
            C1576.f5470.getClass();
            Context contextM3456 = C1576.m3456();
            intent2.setData(Uri.parse(stringExtra));
            contextM3456.startActivity(intent2, bundle2);
            c1574.m3452(null);
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f9402;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f9401;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f9400;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f9403;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
