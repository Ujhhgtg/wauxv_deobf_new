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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᛸᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2882 extends AbstractC2867 implements InterfaceC1602 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2882 f9230;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final Set f9231;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final Set f9232;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f9233;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final String f9234;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final String f9235;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final C2798 f9236;

    static {
        String[] strArr = AbstractC1574.f5469;
        f9230 = new C2882("SystemBrowserHook");
        String[] strArr2 = {"weixin.com", "qq.com", "weixin.qq.com.cn", "wechatpay.cn", "tenpay.com", "weixinbridge.com"};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1898.m3693(6));
        for (int i = 0; i < 6; i++) {
            linkedHashSet.add(strArr2[i]);
        }
        f9231 = linkedHashSet;
        String[] strArr3 = {"test.com"};
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC1898.m3693(1));
        linkedHashSet2.add("test.com");
        f9232 = linkedHashSet2;
        f9233 = "杂项";
        f9234 = "系统浏览器";
        f9235 = "致敬经典模块 '去你大爷的内置浏览器' ";
        f9236 = new C2798(26);
    }

    @Override // p000.InterfaceC1602
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1407(C1563 c1563, Intent intent) {
        String stringExtra;
        String shortClassName;
        ActivityOptions activityOptionsMakeBasic;
        String[] strArr = AbstractC1574.f5469;
        if (!mo3264() || (stringExtra = intent.getStringExtra("rawUrl")) == null || AbstractC2841.m4836(stringExtra)) {
            return;
        }
        if (stringExtra.startsWith("http://") || stringExtra.startsWith("https://")) {
            String strM4845 = AbstractC2841.m4845(AbstractC2841.m4844(stringExtra, "://", stringExtra), "/");
            int iM2538 = C2880.f9228.m2538();
            if (iM2538 == EnumC2876.f9220.f9223) {
                Set setM2541 = C2881.f9229.m2541();
                if (setM2541 == null || !setM2541.isEmpty()) {
                    Iterator it = setM2541.iterator();
                    while (it.hasNext()) {
                        if (strM4845.endsWith((String) it.next())) {
                            return;
                        }
                    }
                }
            } else if (iM2538 == EnumC2876.f9221.f9223) {
                Set setM2542 = C2879.f9227.m2541();
                if (setM2542 == null || !setM2542.isEmpty()) {
                    Iterator it2 = setM2542.iterator();
                    while (it2.hasNext()) {
                        if (strM4845.endsWith((String) it2.next())) {
                        }
                    }
                    return;
                }
                return;
            }
            ComponentName component = intent.getComponent();
            if (component == null || (shortClassName = component.getShortClassName()) == null || !AbstractC2841.m4828(shortClassName, "MMWebViewUI", false)) {
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
                AbstractC0088.m1077(activityOptionsMakeBasic);
            } else {
                activityOptionsMakeBasic = null;
            }
            if (i >= 36) {
                if (false) {
                    activityOptionsMakeBasic = ActivityOptions.makeBasic();
                }
                AbstractC0089.m1082(activityOptionsMakeBasic, true ^ intent2.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
            }
            Bundle bundle2 = activityOptionsMakeBasic != null ? activityOptionsMakeBasic.toBundle() : null;
            intent2.addFlags(268435456);
            
            Context contextM3276 = C1565.m3276();
            intent2.setData(Uri.parse(stringExtra));
            contextM3276.startActivity(intent2, bundle2);
            c1563.m3272(null);
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f9235;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f9234;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f9233;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f9236;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
