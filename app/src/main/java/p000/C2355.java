package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.database.Cursor;
import android.util.Pair;
import bsh.C0007;
import bsh.Primitive;
import dalvik.system.InMemoryDexClassLoader;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2355 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final File f7549;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final File f7550;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final File f7551;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final File f7552;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2873 f7553;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f7554;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2873 f7555;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C2873 f7556;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2873 f7557;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C2873 f7558;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C2873 f7559;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final String f7560;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final C1744 f7561;

    public C2355(File file) {
        this.f7549 = file;
        this.f7550 = new File(file, "main.java");
        this.f7551 = new File(file, "info.prop");
        this.f7552 = new File(file, "readme.md");
        this.f7553 = new C2873(new C2354(this, 0));
        String name = file.getName();
        this.f7554 = name;
        this.f7555 = new C2873(new C2354(this, 1));
        this.f7556 = new C2873(new C2354(this, 2));
        this.f7557 = new C2873(new C2354(this, 3));
        this.f7558 = new C2873(new C2354(this, 4));
        this.f7559 = new C2873(new C2354(this, 5));
        StringBuilder sbM4753 = AbstractC2784.m4753(name);
        sbM4753.append(".enabled");
        this.f7560 = sbM4753.toString();
        this.f7561 = new C1744(this);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2355) && AbstractC2207.m4087(((C2355) obj).f7550.getAbsolutePath(), this.f7550.getAbsolutePath());
    }

    public final int hashCode() {
        return this.f7550.getAbsolutePath().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plugin(pluginDir=");
        sb.append(this.f7549);
        sb.append(", id='");
        sb.append(this.f7554);
        sb.append("', name='");
        sb.append((String) this.f7555.getValue());
        sb.append("', author='");
        sb.append((String) this.f7556.getValue());
        sb.append("', version='");
        sb.append((String) this.f7557.getValue());
        sb.append("', updateTime='");
        sb.append((String) this.f7558.getValue());
        sb.append("', isEnabled=");
        sb.append(m4334());
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m4332(String str, Object... objArr) throws IOException {
        Object c2585;
        C0501 c0501;
        if (this.f7550.exists()) {
            try {
                C0501[] c0501ArrM351 = m4333().f5634.m351();
                int length = c0501ArrM351.length;
                C0501 c0502 = null;
                while (true) {
                    if (0 >= length) {
                        if (false) {
                            c0501 = c0502;
                            break;
                        }
                    } else {
                        C0501 c0503 = c0501ArrM351[0];
                        if (AbstractC2207.m4087(c0503.m1748(), str)) {
                            if (true) {
                                c0502 = c0503;
                            }
                        }
                        0++;
                    }
                    c0501 = null;
                    break;
                }
                if (false) {
                    c2585 = c0501.m1754(objArr, m4333(), null, null, false);
                    if (AbstractC2207.m4087(c2585, Primitive.VOID)) {
                        c2585 = Unit.INSTANCE;
                    } else if (c2585 instanceof Primitive) {
                        c2585 = ((Primitive) c2585).getValue();
                    }
                    Throwable thM4594 = C2586.m4594(c2585);
                    if (thM4594 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Plugin[");
                        sb.append(this.f7554);
                        sb.append("]: callBshMethod ");
                        sb.append(str);
                        sb.append(" Failed: ");
                        sb.append(thM4594.getMessage());
                        C3678.m5306(sb.toString(), null, 14);
                        this.f7561.m3489("callBshMethod " + str + " Failed: " + thM4594.getMessage());
                    }
                    if (c2585 instanceof C2585) {
                        return null;
                    }
                    return c2585;
                }
            } catch (Throwable th) {
                c2585 = new C2585(th);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final RunnableC1668 m4333() throws C1229 {
        HashMap map = AbstractC2371.f7621;
        HashMap map2 = AbstractC2371.f7620;
        String str = this.f7554;
        boolean zContainsKey = map2.containsKey(str);
        File file = this.f7550;
        if (zContainsKey && AbstractC2207.m4087(map.get(str), AbstractC2205.m4055(file))) {
            return (RunnableC1668) map2.get(str);
        }
        RunnableC1668 runnableC1668 = new RunnableC1668(null, "");
        runnableC1668.f5636 = null;
        ClassLoader classLoader = C2361.class.getClassLoader();
        C0482 c0482M346 = runnableC1668.f5634.m346();
        c0482M346.f2094 = classLoader;
        c0482M346.mo298();
        C0007 c0007 = runnableC1668.f5634;

        c0007.mo314("hostContext", C1565.m3276(), true);
        runnableC1668.f5634.mo314("hostVerName", C1565.m3279(), true);
        runnableC1668.f5634.mo314("hostVerCode", Integer.valueOf(C1565.m3278()), true);
        runnableC1668.f5634.mo314("hostVerClient", (String) C1565.f5450.m1086(C1565.f5441[8]), true);
        runnableC1668.f5634.mo314("moduleVer", 1356, true);
        C0007 c0008 = runnableC1668.f5634;
        c0008.mo314("cacheDir", AbstractC2342.m4330("Cache"), true);
        runnableC1668.f5634.mo314("pluginDir", this.f7549, true);
        runnableC1668.f5634.mo314("pluginId", str, true);
        runnableC1668.f5634.mo314("pluginName", (String) this.f7555.getValue(), true);
        runnableC1668.f5634.mo314("pluginAuthor", (String) this.f7556.getValue(), true);
        runnableC1668.f5634.mo314("pluginVersion", (String) this.f7557.getValue(), true);
        runnableC1668.f5634.mo314("pluginUpdateTime", (String) this.f7558.getValue(), true);
        C0007 c0009 = runnableC1668.f5634;
        c0009.mo313(new C0501("mp3ToSilkFile", new Class[]{String.class}, new C1039(3)));
        c0009.mo313(new C0501("mp3ToSilkPath", new Class[]{String.class}, new C1039(4)));
        c0009.mo313(new C0501("mp3ToSilk", new Class[]{String.class, String.class}, new C1039(5)));
        c0009.mo313(new C0501("silkToMp3File", new Class[]{String.class}, new C1039(6)));
        c0009.mo313(new C0501("silkToMp3Path", new Class[]{String.class}, new C1039(7)));
        c0009.mo313(new C0501("silkToMp3", new Class[]{String.class, String.class}, new C1039(8)));
        c0009.mo313(new C0501("getSilkDuration", new Class[]{String.class}, new C1039(9)));
        C0007 c00010 = runnableC1668.f5634;

        c00010.mo313(new C0501("getString", new Class[]{String.class, String.class}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                C2355 c2355 = this.f7563;
                Object obj = objArr[0];
                Object obj2 = objArr[1];
                String str4 = (String) obj2;

                String property = C2357.m4337(C2357.m4336(c2355)).getProperty((String) obj);
                return property == null ? str4 : property;

                /* 12 */

                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */

            }
        }));
        c00010.mo313(new C0501("getStringSet", new Class[]{String.class, Set.class}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Object c2585;
                C2355 c2355 = this.f7563;
                switch (5) {

                    case 5:
                        Object obj11 = objArr[0];
                        Object obj12 = objArr[1];
                        Set set = (Set) obj12;
                        
                        String property2 = C2357.m4337(C2357.m4336(c2355)).getProperty((String) obj11);
                        if (property2 == null) {
                            return set;
                        }
                        try {
                            JSONArray jSONArray = new JSONArray(property2);
                            C2664 c2664 = new C2664(new C1890(jSONArray.length()));
                            C1890 c1890 = c2664.f8579;
                            int length = jSONArray.length();
                            while (0 < length) {
                                c2664.add(jSONArray.optString(0));
                                0++;
                            }
                            c1890.m3682();
                            c1890.f6255 = true;
                            if (c1890.f6251 <= 0) {
                            }
                            c2585 = c1890.f6251 <= 0 ? C2664.f8578 : c2664;
                            break;
                        } catch (Throwable th9) {
                            c2585 = new C2585(th9);
                        }
                        Object obj13 = set;
                        if (false) {
                            obj13 = c2585;
                        }
                        return (Set) obj13;

                    /* 12 */

                    // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                    // java.util.function.Function
                    /* 14 */
                    // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                    // java.util.function.Function
                    /* 17 */

                }
            }
        }));
        Class cls = Boolean.TYPE;
        c00010.mo313(new C0501("getBoolean", new Class[]{String.class, cls}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Boolean bool = null;
                C2355 c2355 = this.f7563;
                Object obj14 = objArr[0];
                Object obj15 = objArr[1];
                boolean zBooleanValue2 = ((Boolean) obj15).booleanValue();

                String property3 = C2357.m4337(C2357.m4336(c2355)).getProperty((String) obj14);
                if (property3 != null) {
                    if (property3.equals("true")) {
                        bool = Boolean.TRUE;
                    } else if (property3.equals("false")) {
                        bool = Boolean.FALSE;
                    }
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                    }
                }
                return Boolean.valueOf(zBooleanValue2);

                /* 12 */

                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */

            }
        }));
        Class cls2 = Integer.TYPE;
        c00010.mo313(new C0501("getInt", new Class[]{String.class, cls2}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Integer numM4853;
                C2355 c2355 = this.f7563;
                Object obj16 = objArr[0];
                Object obj17 = objArr[1];
                int iIntValue2 = ((Integer) obj17).intValue();

                String property4 = C2357.m4337(C2357.m4336(c2355)).getProperty((String) obj16);
                if (property4 != null && (numM4853 = AbstractC2848.m4853(property4)) != null) {
                    iIntValue2 = numM4853.intValue();
                }
                return Integer.valueOf(iIntValue2);

                /* 12 */

                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */

            }
        }));
        Class cls3 = Float.TYPE;
        c00010.mo313(new C0501("getFloat", new Class[]{String.class, cls3}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Float fM4851;
                C2355 c2355 = this.f7563;
                Object obj18 = objArr[0];
                Object obj19 = objArr[1];
                float fFloatValue2 = ((Float) obj19).floatValue();

                String property5 = C2357.m4337(C2357.m4336(c2355)).getProperty((String) obj18);
                if (property5 != null && (fM4851 = AbstractC2847.m4851(property5)) != null) {
                    fFloatValue2 = fM4851.floatValue();
                }
                return Float.valueOf(fFloatValue2);

                /* 12 */

                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */

            }
        }));
        Class cls4 = Long.TYPE;
        c00010.mo313(new C0501("getLong", new Class[]{String.class, cls4}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Long lM4854;
                C2355 c2355 = this.f7563;
                Object obj20 = objArr[0];
                Object obj21 = objArr[1];
                long jLongValue2 = ((Long) obj21).longValue();

                String property6 = C2357.m4337(C2357.m4336(c2355)).getProperty((String) obj20);
                if (property6 != null && (lM4854 = AbstractC2848.m4854(property6)) != null) {
                    jLongValue2 = lM4854.longValue();
                }
                return Long.valueOf(jLongValue2);

                /* 12 */

                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */

            }
        }));
        c00010.mo313(new C0501("putString", new Class[]{String.class, String.class}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Unit unit = Unit.INSTANCE;
                C2355 c2355 = this.f7563;
                Object obj22 = objArr[0];
                Object obj23 = objArr[1];

                File fileM43310 = C2357.m4336(c2355);
                Properties propertiesM43311 = C2357.m4337(fileM43310);
                propertiesM43311.setProperty((String) obj22, (String) obj23);
                OutputStreamWriter outputStreamWriter5 = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(fileM43310), 8192), StandardCharsets.UTF_8);
                try {
                    propertiesM43311.store(outputStreamWriter5, (String) null);
                    outputStreamWriter5.close();
                    return unit;
                } catch (Throwable th10) {
                    try {
                        throw th10;
                    } catch (Throwable th11) {
                        AbstractC1458.m3154(outputStreamWriter5, th10);
                        throw th11;
                    }
                }

                /* 12 */

                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */

            }
        }));
        c00010.mo313(new C0501("putStringSet", new Class[]{String.class, Set.class}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Unit unit = Unit.INSTANCE;
                C2355 c2355 = this.f7563;
                Object obj24 = objArr[0];
                Object obj25 = objArr[1];

                File fileM43311 = C2357.m4336(c2355);
                Properties propertiesM43312 = C2357.m4337(fileM43311);
                propertiesM43312.setProperty((String) obj24, new JSONArray((Collection) AbstractC0744.m2206((Set) obj25)).toString());
                OutputStreamWriter outputStreamWriter6 = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(fileM43311), 8192), StandardCharsets.UTF_8);
                try {
                    propertiesM43312.store(outputStreamWriter6, (String) null);
                    outputStreamWriter6.close();
                    return unit;
                } catch (Throwable th12) {
                    try {
                        throw th12;
                    } catch (Throwable th13) {
                        AbstractC1458.m3154(outputStreamWriter6, th12);
                        throw th13;
                    }
                }
                /* 12 */

                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */

            }
        }));
        c00010.mo313(new C0501("putBoolean", new Class[]{String.class, cls}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Unit unit = Unit.INSTANCE;
                C2355 c2355 = this.f7563;
                Object obj3 = objArr[0];
                Object obj4 = objArr[1];
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();

                File fileM4336 = C2357.m4336(c2355);
                Properties propertiesM4337 = C2357.m4337(fileM4336);
                propertiesM4337.setProperty((String) obj3, String.valueOf(zBooleanValue));
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(fileM4336), 8192), StandardCharsets.UTF_8);
                try {
                    propertiesM4337.store(outputStreamWriter, (String) null);
                    outputStreamWriter.close();
                    return unit;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1458.m3154(outputStreamWriter, th);
                        throw th2;
                    }
                }

                /* 12 */

                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */

            }
        }));
        c00010.mo313(new C0501("putInt", new Class[]{String.class, cls2}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Unit unit = Unit.INSTANCE;
                C2355 c2355 = this.f7563;
                Object obj5 = objArr[0];
                Object obj6 = objArr[1];
                int iIntValue = ((Integer) obj6).intValue();

                File fileM4337 = C2357.m4336(c2355);
                Properties propertiesM4338 = C2357.m4337(fileM4337);
                propertiesM4338.setProperty((String) obj5, String.valueOf(iIntValue));
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(fileM4337), 8192), StandardCharsets.UTF_8);
                try {
                    propertiesM4338.store(outputStreamWriter2, (String) null);
                    outputStreamWriter2.close();
                    return unit;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC1458.m3154(outputStreamWriter2, th3);
                        throw th4;
                    }
                }

                /* 12 */

                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */

            }
        }));
        c00010.mo313(new C0501("putFloat", new Class[]{String.class, cls3}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Unit unit = Unit.INSTANCE;
                C2355 c2355 = this.f7563;
                Object obj7 = objArr[0];
                Object obj8 = objArr[1];
                float fFloatValue = ((Float) obj8).floatValue();

                File fileM4338 = C2357.m4336(c2355);
                Properties propertiesM4339 = C2357.m4337(fileM4338);
                propertiesM4339.setProperty((String) obj7, String.valueOf(fFloatValue));
                OutputStreamWriter outputStreamWriter3 = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(fileM4338), 8192), StandardCharsets.UTF_8);
                try {
                    propertiesM4339.store(outputStreamWriter3, (String) null);
                    outputStreamWriter3.close();
                    return unit;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        AbstractC1458.m3154(outputStreamWriter3, th5);
                        throw th6;
                    }
                }

                /* 12 */

                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */

            }
        }));
        c00010.mo313(new C0501("putLong", new Class[]{String.class, cls4}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Unit unit = Unit.INSTANCE;
                C2355 c2355 = this.f7563;
                Object obj9 = objArr[0];
                Object obj10 = objArr[1];
                long jLongValue = ((Long) obj10).longValue();

                File fileM4339 = C2357.m4336(c2355);
                Properties propertiesM43310 = C2357.m4337(fileM4339);
                propertiesM43310.setProperty((String) obj9, String.valueOf(jLongValue));
                OutputStreamWriter outputStreamWriter4 = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(fileM4339), 8192), StandardCharsets.UTF_8);
                try {
                    propertiesM43310.store(outputStreamWriter4, (String) null);
                    outputStreamWriter4.close();
                    return unit;
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        AbstractC1458.m3154(outputStreamWriter4, th7);
                        throw th8;
                    }
                }

                /* 12 */

                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */

            }
        }));
        C0007 c00011 = runnableC1668.f5634;
        c00011.mo313(new C0501("getLoginWxid", new Class[0], new C1039(10)));
        c00011.mo313(new C0501("getLoginAlias", new Class[0], new C1039(12)));
        c00011.mo313(new C0501("getTargetTalker", new Class[0], new C1039(17)));
        c00011.mo313(new C0501("getFriendList", new Class[0], new C1039(18)));
        c00011.mo313(new C0501("getFriendNickName", new Class[]{String.class}, new C1039(19)));
        c00011.mo313(new C0501("getFriendRemarkName", new Class[]{String.class}, new C1039(20)));
        c00011.mo313(new C0501("getFriendDisplayName", new Class[]{String.class, String.class}, new C1039(22)));
        c00011.mo313(new C0501("getFriendName", new Class[]{String.class}, new C1039(23)));
        c00011.mo313(new C0501("getFriendName", new Class[]{String.class, String.class}, new C1039(24)));
        c00011.mo313(new C0501("getAvatarUrl", new Class[]{String.class}, new C1039(25)));
        c00011.mo313(new C0501("getAvatarUrl", new Class[]{String.class, cls}, new C1039(21)));
        c00011.mo313(new C0501("getGroupList", new Class[0], new C1039(26)));
        c00011.mo313(new C0501("getGroupMemberList", new Class[]{String.class}, new C1039(27)));
        c00011.mo313(new C0501("getGroupMemberCount", new Class[]{String.class}, new C1039(28)));
        c00011.mo313(new C0501("addChatroomMember", new Class[]{String.class, String.class}, new C1039(29)));
        c00011.mo313(new C0501("addChatroomMember", new Class[]{String.class, List.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                Object obj = objArr[0];
                Object obj2 = objArr[1];

                C2180.addNetSceneToQueue(AbstractC1574.dexToCtor(C2156.f7116).newInstance((String) obj, (List) obj2, null, null));
                return unit;

                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00011.mo313(new C0501("inviteChatroomMember", new Class[]{String.class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                Object obj3 = objArr[0];
                Object obj4 = objArr[1];
                List listSingletonList = Collections.singletonList((String) obj4);

                C2180.addNetSceneToQueue(AbstractC1574.dexToCtor(C2166.f7127).newInstance((String) obj3, listSingletonList, 0, null));
                return unit;

                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00011.mo313(new C0501("inviteChatroomMember", new Class[]{String.class, List.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                Object obj5 = objArr[0];
                Object obj6 = objArr[1];

                C2180.addNetSceneToQueue(AbstractC1574.dexToCtor(C2166.f7127).newInstance((String) obj5, (List) obj6, 0, null));
                return unit;

                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00011.mo313(new C0501("delChatroomMember", new Class[]{String.class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                Object obj7 = objArr[0];
                Object obj8 = objArr[1];
                List listSingletonList2 = Collections.singletonList((String) obj8);

                C2180.addNetSceneToQueue(AbstractC1574.dexToCtor(C2161.f7121).newInstance((String) obj7, listSingletonList2, 0));
                return unit;

                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00011.mo313(new C0501("delChatroomMember", new Class[]{String.class, List.class}, new C1039(11)));
        c00011.mo313(new C0501("verifyUser", new Class[]{String.class, String.class, cls2}, new C1039(13)));
        c00011.mo313(new C0501("verifyUser", new Class[]{String.class, String.class, cls2, cls2}, new C1039(14)));
        c00011.mo313(new C0501("modifyContactLabelList", new Class[]{String.class, String.class}, new C1039(15)));
        c00011.mo313(new C0501("modifyContactLabelList", new Class[]{String.class, List.class}, new C1039(16)));
        C0007 c00012 = runnableC1668.f5634;
        c00012.mo313(new C0501("findClassList", new Class[]{List.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Object obj9 = objArr[0];
                List list = (List) obj9;

                ClassLoader classLoaderM3275 = C1565.m3275();
                try {
                    if (!Class.forName("dalvik.system.BaseDexClassLoader").isInstance(classLoaderM3275)) {
                        throw new IllegalStateException("classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)");
                    }
                    DexKitBridge dexKitBridge = new DexKitBridge(classLoaderM3275);
                    try {
                        C0700<C0698> c0700M903 = dexKitBridge.m903(new C0055(7, list));
                        ArrayList arrayList = new ArrayList(AbstractC0746.m2214(c0700M903, 10));
                        for (C0698 c0698 : c0700M903) {

                            ClassLoader classLoaderM3276 = C1565.m3275();
                            C1019 c1019M2115 = c0698.m2115();

                            arrayList.add(AbstractC1651.m3379(classLoaderM3276, c1019M2115.f3730));
                        }
                        dexKitBridge.close();
                        return arrayList;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC1458.m3154(dexKitBridge, th);
                            throw th2;
                        }
                    }
                } catch (ClassNotFoundException unused) {
                    throw new IllegalStateException("This method requires Android runtime");
                }

                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00012.mo313(new C0501("findMemberList", new Class[]{List.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                GenericDeclaration genericDeclarationM2597;
                Object obj10 = objArr[0];
                List list2 = (List) obj10;

                ClassLoader classLoaderM3277 = C1565.m3275();
                try {
                    if (!Class.forName("dalvik.system.BaseDexClassLoader").isInstance(classLoaderM3277)) {
                        throw new IllegalStateException("classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)");
                    }
                    DexKitBridge dexKitBridge2 = new DexKitBridge(classLoaderM3277);
                    try {
                        C1333 c1333 = new C1333(4);
                        C1981 c1981 = new C1981(4);
                        ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new C2837((String) it.next(), 5, false));
                        }
                        c1981.f6562 = new ArrayList(arrayList2);
                        c1333.f4794 = c1981;
                        C1975<C1974> c1975M904 = dexKitBridge2.m904(c1333);
                        ArrayList arrayList3 = new ArrayList(AbstractC0746.m2214(c1975M904, 10));
                        for (C1974 c1974 : c1975M904) {
                            String str8 = c1974.m3801().f3755;
                            if ((AbstractC2207.m4087(str8, "<clinit>") || AbstractC2207.m4087(str8, "<init>")) ? false : true) {

                                genericDeclarationM2597 = c1974.m3802(C1565.m3275());
                            } else {

                                genericDeclarationM2597 = c1974.m3801().m2597(C1565.m3275());
                            }
                            arrayList3.add(genericDeclarationM2597);
                            break;
                        }
                        dexKitBridge2.close();
                        return arrayList3;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC1458.m3154(dexKitBridge2, th3);
                            throw th4;
                        }
                    }
                } catch (ClassNotFoundException unused2) {
                    throw new IllegalStateException("This method requires Android runtime");
                }
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        C0007 c00013 = runnableC1668.f5634;
        c00013.mo313(new C0501("get", new Class[]{String.class, Map.class, Consumer.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                Object obj11 = objArr[0];
                String str9 = (String) obj11;
                Map map3 = (Map) objArr[1];
                Object obj12 = objArr[2];
                AbstractC0968.m2487(new C2366(str9, map3, 30L, (Consumer) obj12, null));
                return unit;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00013.mo313(new C0501("get", new Class[]{String.class, Map.class, cls4, Consumer.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                Object obj13 = objArr[0];
                String str10 = (String) obj13;
                Map map4 = (Map) objArr[1];
                Object obj14 = objArr[2];
                long jLongValue = ((Long) obj14).longValue();
                Object obj15 = objArr[3];
                AbstractC0968.m2487(new C2366(str10, map4, jLongValue, (Consumer) obj15, null));
                return unit;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00013.mo313(new C0501("post", new Class[]{String.class, Map.class, Map.class, Consumer.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                Object obj16 = objArr[0];
                String str11 = (String) obj16;
                Map map5 = (Map) objArr[1];
                Map map6 = (Map) objArr[2];
                Object obj17 = objArr[3];
                AbstractC0968.m2487(new C2367(str11, map6, map5, 30L, (Consumer) obj17, null));
                return unit;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00013.mo313(new C0501("post", new Class[]{String.class, Map.class, Map.class, cls4, Consumer.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                Object obj18 = objArr[0];
                String str12 = (String) obj18;
                Map map7 = (Map) objArr[1];
                Map map8 = (Map) objArr[2];
                Object obj19 = objArr[3];
                long jLongValue2 = ((Long) obj19).longValue();
                Object obj20 = objArr[4];
                AbstractC0968.m2487(new C2367(str12, map8, map7, jLongValue2, (Consumer) obj20, null));
                return unit;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00013.mo313(new C0501("download", new Class[]{String.class, String.class, Map.class, Consumer.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                Object obj21 = objArr[0];
                String str13 = (String) obj21;
                Object obj22 = objArr[1];
                String str14 = (String) obj22;
                Map map9 = (Map) objArr[2];
                Object obj23 = objArr[3];
                AbstractC0968.m2487(new C2364(str13, map9, str14, 30L, (Consumer) obj23, null));
                return unit;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00013.mo313(new C0501("download", new Class[]{String.class, String.class, Map.class, cls4, Consumer.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                Object obj24 = objArr[0];
                String str15 = (String) obj24;
                Object obj25 = objArr[1];
                String str16 = (String) obj25;
                Map map10 = (Map) objArr[2];
                Object obj26 = objArr[3];
                long jLongValue3 = ((Long) obj26).longValue();
                Object obj27 = objArr[4];
                AbstractC0968.m2487(new C2364(str15, map10, str16, jLongValue3, (Consumer) obj27, null));
                return unit;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        C0007 c00014 = runnableC1668.f5634;
        c00014.mo313(new C0501("sendMediaMsg", new Class[]{String.class, Object.class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                Object obj28 = objArr[0];
                Object obj29 = objArr[1];
                Object obj30 = objArr[2];
                AbstractC0743.m2187((String) obj28, (String) obj30, obj29);
                return unit;
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00014.mo313(new C0501("shareFile", new Class[]{String.class, String.class, String.class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                Object obj31 = objArr[0];
                Object obj32 = objArr[1];
                Object obj33 = objArr[2];
                Object obj34 = objArr[3];
                Object objM2131 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXFileObject"), new Object[0]);
                C1299 c1299M3490 = AbstractC0968.startFieldResolution(objM2131).m3490();
                c1299M3490.f6370 = "filePath";
                ((C1315) AbstractC0744.firstInList(c1299M3490.resolve())).set((String) obj33);
                AbstractC0743.m2187((String) obj31, (String) obj34, C1133.m2709((String) obj32, null, objM2131, 6));
                return unit;
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00014.mo313(new C0501("shareMiniProgram", new Class[]{String.class, String.class, String.class, String.class, String.class, byte[].class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */
                Object obj35 = objArr[0];
                Object obj36 = objArr[1];
                Object obj37 = objArr[2];
                Object obj38 = objArr[3];
                Object obj39 = objArr[4];
                byte[] bArr = (byte[]) objArr[5];
                Object obj40 = objArr[6];
                Object objM2132 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject"), new Object[0]);
                C1744 c1744M2484 = AbstractC0968.startFieldResolution(objM2132);
                C1299 c1299M3491 = c1744M2484.m3490();
                c1299M3491.f6370 = "userName";
                ((C1315) AbstractC0744.firstInList(c1299M3491.resolve())).set((String) obj38);
                C1299 c1299M3492 = c1744M2484.m3490();
                c1299M3492.f6370 = "path";
                ((C1315) AbstractC0744.firstInList(c1299M3492.resolve())).set((String) obj39);
                AbstractC0743.m2187((String) obj35, (String) obj40, C1133.m2708((String) obj36, (String) obj37, bArr, objM2132));
                return unit;

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00014.mo313(new C0501("shareMusic", new Class[]{String.class, String.class, String.class, String.class, String.class, byte[].class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */
                Object obj41 = objArr[0];
                Object obj42 = objArr[1];
                Object obj43 = objArr[2];
                Object obj44 = objArr[3];
                Object obj45 = objArr[4];
                byte[] bArr2 = (byte[]) objArr[5];
                Object obj46 = objArr[6];
                Object objM2133 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXMusicObject"), new Object[0]);
                C1744 c1744M2485 = AbstractC0968.startFieldResolution(objM2133);
                C1299 c1299M3493 = c1744M2485.m3490();
                c1299M3493.f6370 = "musicUrl";
                ((C1315) AbstractC0744.firstInList(c1299M3493.resolve())).set((String) obj44);
                C1299 c1299M3494 = c1744M2485.m3490();
                c1299M3494.f6370 = "musicDataUrl";
                ((C1315) AbstractC0744.firstInList(c1299M3494.resolve())).set((String) obj45);
                AbstractC0743.m2187((String) obj41, (String) obj46, C1133.m2708((String) obj42, (String) obj43, bArr2, objM2133));
                return unit;

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00014.mo313(new C0501("shareMusicVideo", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, cls2, String.class, byte[].class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */
                Object obj47 = objArr[0];
                Object obj48 = objArr[1];
                Object obj49 = objArr[2];
                Object obj50 = objArr[3];
                Object obj51 = objArr[4];
                Object obj52 = objArr[5];
                Object obj53 = objArr[6];
                Integer num = (Integer) obj53;

                Object obj54 = objArr[7];
                byte[] bArr3 = (byte[]) objArr[8];
                Object obj55 = objArr[9];
                Object objM2134 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject"), new Object[0]);
                C1744 c1744M2486 = AbstractC0968.startFieldResolution(objM2134);
                C1299 c1299M3495 = c1744M2486.m3490();
                c1299M3495.f6370 = "musicUrl";
                ((C1315) AbstractC0744.firstInList(c1299M3495.resolve())).set((String) obj50);
                C1299 c1299M3496 = c1744M2486.m3490();
                c1299M3496.f6370 = "musicDataUrl";
                ((C1315) AbstractC0744.firstInList(c1299M3496.resolve())).set((String) obj51);
                C1299 c1299M3497 = c1744M2486.m3490();
                c1299M3497.f6370 = "singerName";
                ((C1315) AbstractC0744.firstInList(c1299M3497.resolve())).set((String) obj52);
                C1299 c1299M3498 = c1744M2486.m3490();
                c1299M3498.f6370 = "duration";
                ((C1315) AbstractC0744.firstInList(c1299M3498.resolve())).set(num);
                C1299 c1299M3499 = c1744M2486.m3490();
                c1299M3499.f6370 = "songLyric";
                ((C1315) AbstractC0744.firstInList(c1299M3499.resolve())).set((String) obj54);
                AbstractC0743.m2187((String) obj47, (String) obj55, C1133.m2708((String) obj48, (String) obj49, bArr3, objM2134));
                return unit;
                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00014.mo313(new C0501("shareText", new Class[]{String.class, String.class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */

                /* 17 */
                Object obj56 = objArr[0];
                Object obj57 = objArr[1];
                String str17 = (String) obj57;
                Object obj58 = objArr[2];
                Object objM2135 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXTextObject"), new Object[0]);
                C1299 c1299M34910 = AbstractC0968.startFieldResolution(objM2135).m3490();
                c1299M34910.f6370 = "text";
                ((C1315) AbstractC0744.firstInList(c1299M34910.resolve())).set(str17);
                AbstractC0743.m2187((String) obj56, (String) obj58, C1133.m2709(null, str17, objM2135, 5));
                return unit;
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00014.mo313(new C0501("shareVideo", new Class[]{String.class, String.class, String.class, String.class, byte[].class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */
                Object obj59 = objArr[0];
                Object obj60 = objArr[1];
                Object obj61 = objArr[2];
                Object obj62 = objArr[3];
                byte[] bArr4 = (byte[]) objArr[4];
                Object obj63 = objArr[5];
                Object objM2136 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXVideoObject"), new Object[0]);
                C1299 c1299M34911 = AbstractC0968.startFieldResolution(objM2136).m3490();
                c1299M34911.f6370 = "videoUrl";
                ((C1315) AbstractC0744.firstInList(c1299M34911.resolve())).set((String) obj62);
                AbstractC0743.m2187((String) obj59, (String) obj63, C1133.m2708((String) obj60, (String) obj61, bArr4, objM2136));
                return unit;

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00014.mo313(new C0501("shareWebpage", new Class[]{String.class, String.class, String.class, String.class, byte[].class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */
                Object obj64 = objArr[0];
                Object obj65 = objArr[1];
                Object obj66 = objArr[2];
                Object obj67 = objArr[3];
                byte[] bArr5 = (byte[]) objArr[4];
                Object obj68 = objArr[5];
                Object objM2137 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXWebpageObject"), new Object[0]);
                C1299 c1299M34912 = AbstractC0968.startFieldResolution(objM2137).m3490();
                c1299M34912.f6370 = "webpageUrl";
                ((C1315) AbstractC0744.firstInList(c1299M34912.resolve())).set((String) obj67);
                AbstractC0743.m2187((String) obj64, (String) obj68, C1133.m2708((String) obj65, (String) obj66, bArr5, objM2137));
                return unit;

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        C0007 c00015 = runnableC1668.f5634;
        c00015.mo313(new C0501("sendText", new Class[]{String.class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                GenericDeclaration genericDeclarationM2597;
                Unit unit = Unit.INSTANCE;
                switch (29) {
                    case 0:
                        Object obj = objArr[0];
                        Object obj2 = objArr[1];
                        
                        C2180.addNetSceneToQueue(AbstractC1574.dexToCtor(C2156.f7116).newInstance((String) obj, (List) obj2, null, null));
                        return unit;
                    case 1:
                        Object obj3 = objArr[0];
                        Object obj4 = objArr[1];
                        List listSingletonList = Collections.singletonList((String) obj4);
                        
                        C2180.addNetSceneToQueue(AbstractC1574.dexToCtor(C2166.f7127).newInstance((String) obj3, listSingletonList, 0, null));
                        return unit;
                    case 2:
                        Object obj5 = objArr[0];
                        Object obj6 = objArr[1];
                        
                        C2180.addNetSceneToQueue(AbstractC1574.dexToCtor(C2166.f7127).newInstance((String) obj5, (List) obj6, 0, null));
                        return unit;
                    case 3:
                        Object obj7 = objArr[0];
                        Object obj8 = objArr[1];
                        List listSingletonList2 = Collections.singletonList((String) obj8);
                        
                        C2180.addNetSceneToQueue(AbstractC1574.dexToCtor(C2161.f7121).newInstance((String) obj7, listSingletonList2, 0));
                        return unit;
                    case 4:
                        int i111 = 7;
                        Object obj9 = objArr[0];
                        List list = (List) obj9;
                        
                        ClassLoader classLoaderM3275 = C1565.m3275();
                        try {
                            if (!Class.forName("dalvik.system.BaseDexClassLoader").isInstance(classLoaderM3275)) {
                                throw new IllegalStateException("classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)");
                            }
                            DexKitBridge dexKitBridge = new DexKitBridge(classLoaderM3275);
                            try {
                                C0700<C0698> c0700M903 = dexKitBridge.m903(new C0055(i111, list));
                                ArrayList arrayList = new ArrayList(AbstractC0746.m2214(c0700M903, 10));
                                for (C0698 c0698 : c0700M903) {
                                    
                                    ClassLoader classLoaderM3276 = C1565.m3275();
                                    C1019 c1019M2115 = c0698.m2115();

                                    arrayList.add(AbstractC1651.m3379(classLoaderM3276, c1019M2115.f3730));
                                }
                                dexKitBridge.close();
                                return arrayList;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    AbstractC1458.m3154(dexKitBridge, th);
                                    throw th2;
                                }
                            }
                        } catch (ClassNotFoundException unused) {
                            throw new IllegalStateException("This method requires Android runtime");
                        }
                    case 5:
                        Object obj10 = objArr[0];
                        List list2 = (List) obj10;
                        
                        ClassLoader classLoaderM3277 = C1565.m3275();
                        try {
                            if (!Class.forName("dalvik.system.BaseDexClassLoader").isInstance(classLoaderM3277)) {
                                throw new IllegalStateException("classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)");
                            }
                            DexKitBridge dexKitBridge2 = new DexKitBridge(classLoaderM3277);
                            try {
                                C1333 c1333 = new C1333(4);
                                C1981 c1981 = new C1981(4);
                                ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(list2, 10));
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(new C2837((String) it.next(), 5, false));
                                }
                                c1981.f6562 = new ArrayList(arrayList2);
                                c1333.f4794 = c1981;
                                C1975<C1974> c1975M904 = dexKitBridge2.m904(c1333);
                                ArrayList arrayList3 = new ArrayList(AbstractC0746.m2214(c1975M904, 10));
                                for (C1974 c1974 : c1975M904) {
                                    String str8 = c1974.m3801().f3755;
                                    if ((AbstractC2207.m4087(str8, "<clinit>") || AbstractC2207.m4087(str8, "<init>")) ? false : true) {
                                        
                                        genericDeclarationM2597 = c1974.m3802(C1565.m3275());
                                    } else {
                                        
                                        genericDeclarationM2597 = c1974.m3801().m2597(C1565.m3275());
                                    }
                                    arrayList3.add(genericDeclarationM2597);
                                    break;
                                }
                                dexKitBridge2.close();
                                return arrayList3;
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    AbstractC1458.m3154(dexKitBridge2, th3);
                                    throw th4;
                                }
                            }
                        } catch (ClassNotFoundException unused2) {
                            throw new IllegalStateException("This method requires Android runtime");
                        }
                    case 6:
                        Object obj11 = objArr[0];
                        String str9 = (String) obj11;
                        Map map3 = (Map) objArr[1];
                        Object obj12 = objArr[2];
                        AbstractC0968.m2487(new C2366(str9, map3, 30L, (Consumer) obj12, null));
                        return unit;
                    case 7:
                        Object obj13 = objArr[0];
                        String str10 = (String) obj13;
                        Map map4 = (Map) objArr[1];
                        Object obj14 = objArr[2];
                        long jLongValue = ((Long) obj14).longValue();
                        Object obj15 = objArr[3];
                        AbstractC0968.m2487(new C2366(str10, map4, jLongValue, (Consumer) obj15, null));
                        return unit;
                    case 8:
                        Object obj16 = objArr[0];
                        String str11 = (String) obj16;
                        Map map5 = (Map) objArr[1];
                        Map map6 = (Map) objArr[2];
                        Object obj17 = objArr[3];
                        AbstractC0968.m2487(new C2367(str11, map6, map5, 30L, (Consumer) obj17, null));
                        return unit;
                    case 9:
                        Object obj18 = objArr[0];
                        String str12 = (String) obj18;
                        Map map7 = (Map) objArr[1];
                        Map map8 = (Map) objArr[2];
                        Object obj19 = objArr[3];
                        long jLongValue2 = ((Long) obj19).longValue();
                        Object obj20 = objArr[4];
                        AbstractC0968.m2487(new C2367(str12, map8, map7, jLongValue2, (Consumer) obj20, null));
                        return unit;
                    case 10:
                        Object obj21 = objArr[0];
                        String str13 = (String) obj21;
                        Object obj22 = objArr[1];
                        String str14 = (String) obj22;
                        Map map9 = (Map) objArr[2];
                        Object obj23 = objArr[3];
                        AbstractC0968.m2487(new C2364(str13, map9, str14, 30L, (Consumer) obj23, null));
                        return unit;
                    case 11:
                        Object obj24 = objArr[0];
                        String str15 = (String) obj24;
                        Object obj25 = objArr[1];
                        String str16 = (String) obj25;
                        Map map10 = (Map) objArr[2];
                        Object obj26 = objArr[3];
                        long jLongValue3 = ((Long) obj26).longValue();
                        Object obj27 = objArr[4];
                        AbstractC0968.m2487(new C2364(str15, map10, str16, jLongValue3, (Consumer) obj27, null));
                        return unit;
                    case 12 /* 12 */:
                        Object obj28 = objArr[0];
                        Object obj29 = objArr[1];
                        Object obj30 = objArr[2];
                        AbstractC0743.m2187((String) obj28, (String) obj30, obj29);
                        return unit;
                    case 13:
                        Object obj31 = objArr[0];
                        Object obj32 = objArr[1];
                        Object obj33 = objArr[2];
                        Object obj34 = objArr[3];
                        Object objM2131 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXFileObject"), new Object[0]);
                        C1299 c1299M3490 = AbstractC0968.startFieldResolution(objM2131).m3490();
                        c1299M3490.f6370 = "filePath";
                        ((C1315) AbstractC0744.firstInList(c1299M3490.resolve())).set((String) obj33);
                        AbstractC0743.m2187((String) obj31, (String) obj34, C1133.m2709((String) obj32, null, objM2131, 6));
                        return unit;
                    case 14 /* 14 */:
                        Object obj35 = objArr[0];
                        Object obj36 = objArr[1];
                        Object obj37 = objArr[2];
                        Object obj38 = objArr[3];
                        Object obj39 = objArr[4];
                        byte[] bArr = (byte[]) objArr[5];
                        Object obj40 = objArr[6];
                        Object objM2132 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject"), new Object[0]);
                        C1744 c1744M2484 = AbstractC0968.startFieldResolution(objM2132);
                        C1299 c1299M3491 = c1744M2484.m3490();
                        c1299M3491.f6370 = "userName";
                        ((C1315) AbstractC0744.firstInList(c1299M3491.resolve())).set((String) obj38);
                        C1299 c1299M3492 = c1744M2484.m3490();
                        c1299M3492.f6370 = "path";
                        ((C1315) AbstractC0744.firstInList(c1299M3492.resolve())).set((String) obj39);
                        AbstractC0743.m2187((String) obj35, (String) obj40, C1133.m2708((String) obj36, (String) obj37, bArr, objM2132));
                        return unit;
                    case 15:
                        Object obj41 = objArr[0];
                        Object obj42 = objArr[1];
                        Object obj43 = objArr[2];
                        Object obj44 = objArr[3];
                        Object obj45 = objArr[4];
                        byte[] bArr2 = (byte[]) objArr[5];
                        Object obj46 = objArr[6];
                        Object objM2133 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXMusicObject"), new Object[0]);
                        C1744 c1744M2485 = AbstractC0968.startFieldResolution(objM2133);
                        C1299 c1299M3493 = c1744M2485.m3490();
                        c1299M3493.f6370 = "musicUrl";
                        ((C1315) AbstractC0744.firstInList(c1299M3493.resolve())).set((String) obj44);
                        C1299 c1299M3494 = c1744M2485.m3490();
                        c1299M3494.f6370 = "musicDataUrl";
                        ((C1315) AbstractC0744.firstInList(c1299M3494.resolve())).set((String) obj45);
                        AbstractC0743.m2187((String) obj41, (String) obj46, C1133.m2708((String) obj42, (String) obj43, bArr2, objM2133));
                        return unit;
                    case 16:
                        Object obj47 = objArr[0];
                        Object obj48 = objArr[1];
                        Object obj49 = objArr[2];
                        Object obj50 = objArr[3];
                        Object obj51 = objArr[4];
                        Object obj52 = objArr[5];
                        Object obj53 = objArr[6];
                        Integer num = (Integer) obj53;
                        
                        Object obj54 = objArr[7];
                        byte[] bArr3 = (byte[]) objArr[8];
                        Object obj55 = objArr[9];
                        Object objM2134 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject"), new Object[0]);
                        C1744 c1744M2486 = AbstractC0968.startFieldResolution(objM2134);
                        C1299 c1299M3495 = c1744M2486.m3490();
                        c1299M3495.f6370 = "musicUrl";
                        ((C1315) AbstractC0744.firstInList(c1299M3495.resolve())).set((String) obj50);
                        C1299 c1299M3496 = c1744M2486.m3490();
                        c1299M3496.f6370 = "musicDataUrl";
                        ((C1315) AbstractC0744.firstInList(c1299M3496.resolve())).set((String) obj51);
                        C1299 c1299M3497 = c1744M2486.m3490();
                        c1299M3497.f6370 = "singerName";
                        ((C1315) AbstractC0744.firstInList(c1299M3497.resolve())).set((String) obj52);
                        C1299 c1299M3498 = c1744M2486.m3490();
                        c1299M3498.f6370 = "duration";
                        ((C1315) AbstractC0744.firstInList(c1299M3498.resolve())).set(num);
                        C1299 c1299M3499 = c1744M2486.m3490();
                        c1299M3499.f6370 = "songLyric";
                        ((C1315) AbstractC0744.firstInList(c1299M3499.resolve())).set((String) obj54);
                        AbstractC0743.m2187((String) obj47, (String) obj55, C1133.m2708((String) obj48, (String) obj49, bArr3, objM2134));
                        return unit;
                    case 17 /* 17 */:
                        Object obj56 = objArr[0];
                        Object obj57 = objArr[1];
                        String str17 = (String) obj57;
                        Object obj58 = objArr[2];
                        Object objM2135 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXTextObject"), new Object[0]);
                        C1299 c1299M34910 = AbstractC0968.startFieldResolution(objM2135).m3490();
                        c1299M34910.f6370 = "text";
                        ((C1315) AbstractC0744.firstInList(c1299M34910.resolve())).set(str17);
                        AbstractC0743.m2187((String) obj56, (String) obj58, C1133.m2709(null, str17, objM2135, 5));
                        return unit;
                    case 18 /* 18 */:
                        Object obj59 = objArr[0];
                        Object obj60 = objArr[1];
                        Object obj61 = objArr[2];
                        Object obj62 = objArr[3];
                        byte[] bArr4 = (byte[]) objArr[4];
                        Object obj63 = objArr[5];
                        Object objM2136 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXVideoObject"), new Object[0]);
                        C1299 c1299M34911 = AbstractC0968.startFieldResolution(objM2136).m3490();
                        c1299M34911.f6370 = "videoUrl";
                        ((C1315) AbstractC0744.firstInList(c1299M34911.resolve())).set((String) obj62);
                        AbstractC0743.m2187((String) obj59, (String) obj63, C1133.m2708((String) obj60, (String) obj61, bArr4, objM2136));
                        return unit;
                    case 19:
                        Object obj64 = objArr[0];
                        Object obj65 = objArr[1];
                        Object obj66 = objArr[2];
                        Object obj67 = objArr[3];
                        byte[] bArr5 = (byte[]) objArr[4];
                        Object obj68 = objArr[5];
                        Object objM2137 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXWebpageObject"), new Object[0]);
                        C1299 c1299M34912 = AbstractC0968.startFieldResolution(objM2137).m3490();
                        c1299M34912.f6370 = "webpageUrl";
                        ((C1315) AbstractC0744.firstInList(c1299M34912.resolve())).set((String) obj67);
                        AbstractC0743.m2187((String) obj64, (String) obj68, C1133.m2708((String) obj65, (String) obj66, bArr5, objM2137));
                        return unit;
                    case 20:
                        Object obj69 = objArr[0];
                        Object obj70 = objArr[1];
                        String str18 = (String) obj70;
                        Object obj71 = objArr[2];
                        C2372 c2372 = new C2372((Consumer) obj71, 0);
                        C2523 c2523 = new C2523("\\[AtWx=([^]]+)]");
                        List listM4655 = AbstractC2652.m4655(new C1009(C2523.m4530(c2523, str18), new C2158(11), 2));
                        String strM4531 = c2523.m4531(str18, new C2158(12));
                        int i213 = EnumC3673.f11469.f11492;
                        boolean z = !listM4655.isEmpty();
                        
                        Object objM3958 = C2173.m3958((String) obj69, strM4531, i213, z, listM4655);
                        C2165 c2165 = new C2165(c2372, 0);
                        
                        C2180.m3961(objM3958, c2165);
                        return unit;
                    case 21 /* 21 */:
                        Object obj72 = objArr[0];
                        Object obj73 = objArr[1];
                        String str19 = (String) obj73;
                        C1133.m2721(AbstractC1459.m3188(str19), (String) obj72, str19);
                        return unit;
                    case 22 /* 22 */:
                        Object obj74 = objArr[0];
                        Object obj75 = objArr[1];
                        Object obj76 = objArr[2];
                        C1133.m2721(((Integer) obj76).intValue(), (String) obj74, (String) obj75);
                        return unit;
                    case 23 /* 23 */:
                        Object obj77 = objArr[0];
                        Object obj78 = objArr[1];
                        C1133.m2718((String) obj77, (String) obj78, null);
                        return unit;
                    case 24 /* 24 */:
                        Object obj79 = objArr[0];
                        Object obj80 = objArr[1];
                        Object obj81 = objArr[2];
                        C1133.m2718((String) obj79, (String) obj80, (String) obj81);
                        return unit;
                    case 25 /* 25 */:
                        Object obj82 = objArr[0];
                        Object obj83 = objArr[1];
                        C1133.m2720((String) obj82, (String) obj83);
                        return unit;
                    case 26:
                        Object obj84 = objArr[0];
                        Object obj85 = objArr[1];
                        C1170 c1170 = C1170.f4301;
                        
                        String strM2762 = C1170.m2762((String) obj85);
                        
                        C1170.m2763(c1170, (String) obj84, C1164.m2761(strM2762));
                        return unit;
                    case 27:
                        Object obj86 = objArr[0];
                        String str20 = (String) obj86;
                        Object obj87 = objArr[1];
                        String str21 = (String) obj87;

                        String strM2264 = C0774.getSelfWxId();


                        C2339 c2339 = C2339.f7525;
                        MethodResolver c1973M3492 = AbstractC0968.startFieldResolution(C2663.m4656(AbstractC1574.dexToClass(c2339))).m3492();
                        c1973M3492.returnType = AbstractC2519.classToKClass(String.class);
                        String str22 = (String) ((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(String.class)}, 2, c1973M3492)).invoke(str21, str20);
                        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
                        
                        MethodResolver c1973M3493 = AbstractC0968.startFieldResolution(C2663.m4656(AbstractC1574.dexToClass(c2339))).m3492();
                        c1973M3493.returnType = AbstractC2519.classToKClass(Pair.class);
                        Pair pair = (Pair) ((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(Integer.TYPE), AbstractC2519.classToKClass(Long.TYPE)}, 6, c1973M3493)).invoke(str20, strM2264, str21, str22, Integer.valueOf(iCurrentTimeMillis), 0L);
                        AbstractC0968.m2486(ExecutorC0990.f3609, new C2142(pair, str20, str21, null));
                        return unit;
                    case 28:
                        Object obj88 = objArr[0];
                        String[] strArr28 = AbstractC1574.f5469;
                        String str23 = (String) obj88;
                        Object obj89 = objArr[1];
                        String str24 = (String) obj89;
                        C2173 c2174 = C2173.f7134;
                        JSONObject jSONObject = new JSONObject();
                        String str25 = "msg";
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("username", str24);
                        String str26 = "nickname";
                        Cursor cursorM2715 = C1133.m2715("select * from rcontact where username = '" + str24 + '\'');
                        if (cursorM2715 != null) {
                            cursorM2715.moveToFirst();
                        } else {
                            cursorM2715 = null;
                        }
                        FriendInfo friendInfoM2176 = cursorM2715 != null ? AbstractC0743.m2176(cursorM2715) : null;
                        jSONObject2.put(str26, friendInfoM2176 != null ? friendInfoM2176.getNickname() : null);
                        jSONObject2.put("certflag", MagicFactory.get(str24.startsWith("gh_") ? -106686987631284L : -106699872533172L, strArr28));
                        jSONObject.put(str25, jSONObject2);
                        HashSet hashSet = new HashSet();
                        HashSet hashSet2 = new HashSet();
                        hashSet.add("/msg/username");
                        hashSet.add("/msg/nickname");
                        hashSet.add("/msg/certflag");
                        C1732 c1732 = new C1732();
                        c1732.f5829 = jSONObject;
                        c1732.f5830 = hashSet;
                        c1732.f5831 = hashSet2;
                        C2180.addNetSceneToQueue(C2173.m3959(c2174, str23, c1732.toString(), EnumC3673.f11472.f11492));
                        return unit;
                    default:
                        Object obj90 = objArr[0];
                        Object obj91 = objArr[1];
                        String str27 = (String) obj91;
                        C2523 c2524 = new C2523("\\[AtWx=([^]]+)]");
                        List listM4656 = AbstractC2652.m4655(new C1009(C2523.m4530(c2524, str27), new C2158(9), 2));
                        String strM4532 = c2524.m4531(str27, new C2158(10));
                        int i215 = EnumC3673.f11469.f11492;
                        boolean z2 = !listM4656.isEmpty();
                        
                        C2180.addNetSceneToQueue(C2173.m3958((String) obj90, strM4532, i215, z2, listM4656));
                        return unit;
                }
            }
        }));
        c00015.mo313(new C0501("sendText", new Class[]{String.class, String.class, Consumer.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */
                Object obj69 = objArr[0];
                Object obj70 = objArr[1];
                String str18 = (String) obj70;
                Object obj71 = objArr[2];
                C2372 c2372 = new C2372((Consumer) obj71, 0);
                C2523 c2523 = new C2523("\\[AtWx=([^]]+)]");
                List listM4655 = AbstractC2652.m4655(new C1009(C2523.m4530(c2523, str18), new C2158(11), 2));
                String strM4531 = c2523.m4531(str18, new C2158(12));
                int i213 = EnumC3673.f11469.f11492;
                boolean z = !listM4655.isEmpty();

                Object objM3958 = C2173.m3958((String) obj69, strM4531, i213, z, listM4655);
                C2165 c2165 = new C2165(c2372, 0);

                C2180.m3961(objM3958, c2165);
                return unit;
                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00015.mo313(new C0501("sendVoice", new Class[]{String.class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                Object obj72 = objArr[0];
                Object obj73 = objArr[1];
                String str19 = (String) obj73;
                C1133.m2721(AbstractC1459.m3188(str19), (String) obj72, str19);
                return unit;
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00015.mo313(new C0501("sendVoice", new Class[]{String.class, String.class, cls2}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                Object obj74 = objArr[0];
                Object obj75 = objArr[1];
                Object obj76 = objArr[2];
                C1133.m2721(((Integer) obj76).intValue(), (String) obj74, (String) obj75);
                return unit;
                /* 23 */
                /* 24 */
                /* 25 */


            }
        }));
        c00015.mo313(new C0501("sendImage", new Class[]{String.class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                Object obj77 = objArr[0];
                Object obj78 = objArr[1];
                C1133.m2718((String) obj77, (String) obj78, null);
                return unit;
                /* 24 */
                /* 25 */


            }
        }));
        c00015.mo313(new C0501("sendImage", new Class[]{String.class, String.class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                Object obj79 = objArr[0];
                Object obj80 = objArr[1];
                Object obj81 = objArr[2];
                C1133.m2718((String) obj79, (String) obj80, (String) obj81);
                return unit;
                /* 25 */


            }
        }));
        c00015.mo313(new C0501("sendVideo", new Class[]{String.class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */
                Object obj82 = objArr[0];
                Object obj83 = objArr[1];
                C1133.m2720((String) obj82, (String) obj83);
                return unit;


            }
        }));
        c00015.mo313(new C0501("sendEmoji", new Class[]{String.class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */
                Object obj84 = objArr[0];
                Object obj85 = objArr[1];
                C1170 c1170 = C1170.f4301;

                String strM2762 = C1170.m2762((String) obj85);

                C1170.m2763(c1170, (String) obj84, C1164.m2761(strM2762));
                return unit;


            }
        }));
        c00015.mo313(new C0501("sendPat", new Class[]{String.class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */

                Object obj86 = objArr[0];
                String str20 = (String) obj86;
                Object obj87 = objArr[1];
                String str21 = (String) obj87;

                String strM2264 = C0774.getSelfWxId();


                C2339 c2339 = C2339.f7525;
                MethodResolver c1973M3492 = AbstractC0968.startFieldResolution(C2663.m4656(AbstractC1574.dexToClass(c2339))).m3492();
                c1973M3492.returnType = AbstractC2519.classToKClass(String.class);
                String str22 = (String) ((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(String.class)}, 2, c1973M3492)).invoke(str21, str20);
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));

                MethodResolver c1973M3493 = AbstractC0968.startFieldResolution(C2663.m4656(AbstractC1574.dexToClass(c2339))).m3492();
                c1973M3493.returnType = AbstractC2519.classToKClass(Pair.class);
                Pair pair = (Pair) ((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(Integer.TYPE), AbstractC2519.classToKClass(Long.TYPE)}, 6, c1973M3493)).invoke(str20, strM2264, str21, str22, Integer.valueOf(iCurrentTimeMillis), 0L);
                AbstractC0968.m2486(ExecutorC0990.f3609, new C2142(pair, str20, str21, null));
                return unit;

            }
        }));
        c00015.mo313(new C0501("sendShareCard", new Class[]{String.class, String.class}, new InterfaceC0500() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲈᲇ
            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws JSONException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
                Unit unit = Unit.INSTANCE;
                /* 12 */
                /* 14 */

                /* 17 */
                /* 18 */

                /* 21 */
                /* 22 */
                /* 23 */
                /* 24 */
                /* 25 */


                Object obj88 = objArr[0];
                String[] strArr28 = AbstractC1574.f5469;
                String str23 = (String) obj88;
                Object obj89 = objArr[1];
                String str24 = (String) obj89;
                C2173 c2174 = C2173.f7134;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("username", str24);
                Cursor cursorM2715 = C1133.m2715("select * from rcontact where username = '" + str24 + '\'');
                if (cursorM2715 != null) {
                    cursorM2715.moveToFirst();
                } else {
                    cursorM2715 = null;
                }
                FriendInfo friendInfoM2176 = cursorM2715 != null ? AbstractC0743.m2176(cursorM2715) : null;
                jSONObject2.put("nickname", friendInfoM2176 != null ? friendInfoM2176.getNickname() : null);
                jSONObject2.put("certflag", MagicFactory.get(str24.startsWith("gh_") ? -106686987631284L : -106699872533172L, strArr28));
                jSONObject.put("msg", jSONObject2);
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                hashSet.add("/msg/username");
                hashSet.add("/msg/nickname");
                hashSet.add("/msg/certflag");
                C1732 c1732 = new C1732();
                c1732.f5829 = jSONObject;
                c1732.f5830 = hashSet;
                c1732.f5831 = hashSet2;
                C2180.addNetSceneToQueue(C2173.m3959(c2174, str23, c1732.toString(), EnumC3673.f11472.f11492));
                return unit;

            }
        }));
        c00015.mo313(new C0501("sendLocation", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, new C2373(0)));
        c00015.mo313(new C0501("sendLocation", new Class[]{String.class, JSONObject.class}, new C2373(1)));
        c00015.mo313(new C0501("sendCipherMsg", new Class[]{String.class, String.class, String.class}, new C2373(2)));
        c00015.mo313(new C0501("sendAppBrandMsg", new Class[]{String.class, String.class, String.class, String.class}, new C2373(3)));
        c00015.mo313(new C0501("sendNoteMsg", new Class[]{String.class, String.class}, new C2373(4)));
        c00015.mo313(new C0501("sendQuoteMsg", new Class[]{String.class, cls4, String.class}, new C2373(5)));
        c00015.mo313(new C0501("revokeMsg", new Class[]{cls4}, new C2373(6)));
        c00015.mo313(new C0501("insertSystemMsg", new Class[]{String.class, String.class, cls4}, new C2373(7)));
        C0007 c00016 = runnableC1668.f5634;
        c00016.mo313(new C0501("eval", new Class[]{String.class}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Unit unit = Unit.INSTANCE;
                C2355 c2355 = this.f7563;
                /* 12 */
                Object obj26 = objArr[0];
                String strConcat = (String) obj26;
                RunnableC1668 runnableC1668M4333 = c2355.m4333();

                RunnableC1668.m3389("eval(String): ", strConcat);
                C0007 c00017 = runnableC1668M4333.f5634;
                if (!strConcat.endsWith(";")) {
                    strConcat = strConcat.concat(";");
                }
                runnableC1668M4333.m3391(new StringReader(strConcat), c00017, "Memory");
                return unit;
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */

            }
        }));
        c00016.mo313(new C0501("loadJava", new Class[]{String.class}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Unit unit = Unit.INSTANCE;
                C2355 c2355 = this.f7563;
                /* 12 */

                Object obj27 = objArr[0];
                String str9 = (String) obj27;
                String canonicalPath = (new File(str9).isAbsolute() ? new File(str9) : new File(c2355.f7549, str9)).getCanonicalPath();
                RunnableC1668 runnableC1668M4334 = c2355.m4333();
                C0007 c00018 = runnableC1668M4334.f5634;
                File fileM3393 = runnableC1668M4334.m3393(canonicalPath);
                RunnableC1668.m3389("Sourcing file: ", fileM3393);
                BufferedReader bufferedReader = new BufferedReader(new C1326(new FileInputStream(fileM3393)));
                try {
                    runnableC1668M4334.m3391(bufferedReader, c00018, fileM3393.getPath());
                    return unit;
                } finally {
                    bufferedReader.close();
                }
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */

            }
        }));
        c00016.mo313(new C0501("loadDex", new Class[]{String.class}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Unit unit = Unit.INSTANCE;
                C2355 c2355 = this.f7563;
                /* 12 */

                /* 14 */
                Object obj28 = objArr[0];
                String str10 = (String) obj28;
                final String canonicalPath2 = (new File(str10).isAbsolute() ? new File(str10) : new File(c2355.f7549, str10)).getCanonicalPath();
                RunnableC1668 runnableC1668M4335 = c2355.m4333();
                final ClassLoader classLoader2 = C2361.class.getClassLoader();
                String strM2983 = AbstractC1270.m2983(canonicalPath2);
                ClassLoader classLoader3 = strM2983 != null ? (ClassLoader) AbstractC0499.f2146.computeIfAbsent(AbstractC0499.m1743("dex", strM2983, classLoader2), new Function() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                    @Override // java.util.function.Function
                    public final Object apply(Object obj210) {
                        switch (1) {
                            case 0:
                                try {
                                    return AbstractC2202.m4001(classLoader2, canonicalPath2);
                                } catch (Exception e) {
                                    System.err.println("[BeanShell] GetLoaderByJar: " + e);
                                    return null;
                                }
                            default:
                                try {
                                    return new InMemoryDexClassLoader(ByteBuffer.wrap(Files.readAllBytes(new File(canonicalPath2).toPath())), classLoader2);
                                } catch (Exception e2) {
                                    System.err.println("[BeanShell] GetLoaderByDex: " + e2);
                                    return null;
                                }
                        }
                    }
                }) : null;
                C0482 c0482M347 = runnableC1668M4335.f5634.m346();
                C0094 c0094 = c0482M347.f2095;
                if (classLoader3 != null) {
                    ((HashSet) c0094.f1049).add(classLoader3);
                } else {

                }
                c0482M347.mo298();
                return unit;
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */

            }
        }));
        c00016.mo313(new C0501("loadJar", new Class[]{String.class}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Unit unit = Unit.INSTANCE;
                C2355 c2355 = this.f7563;
                /* 12 */

                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                Object obj29 = objArr[0];
                String str11 = (String) obj29;
                final String canonicalPath3 = (new File(str11).isAbsolute() ? new File(str11) : new File(c2355.f7549, str11)).getCanonicalPath();
                RunnableC1668 runnableC1668M4336 = c2355.m4333();
                final ClassLoader classLoader4 = C2361.class.getClassLoader();
                String strM2984 = AbstractC1270.m2983(canonicalPath3);
                ClassLoader classLoader5 = strM2984 != null ? (ClassLoader) AbstractC0499.f2146.computeIfAbsent(AbstractC0499.m1743("jar", strM2984, classLoader4), new Function() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                    @Override // java.util.function.Function
                    public final Object apply(Object obj210) {
                        switch (0) {
                            case 0:
                                try {
                                    return AbstractC2202.m4001(classLoader4, canonicalPath3);
                                } catch (Exception e) {
                                    System.err.println("[BeanShell] GetLoaderByJar: " + e);
                                    return null;
                                }
                            default:
                                try {
                                    return new InMemoryDexClassLoader(ByteBuffer.wrap(Files.readAllBytes(new File(canonicalPath3).toPath())), classLoader4);
                                } catch (Exception e2) {
                                    System.err.println("[BeanShell] GetLoaderByDex: " + e2);
                                    return null;
                                }
                        }
                    }
                }) : null;
                C0482 c0482M348 = runnableC1668M4336.f5634.m346();
                C0094 c0095 = c0482M348.f2095;
                if (classLoader5 != null) {
                    ((HashSet) c0095.f1049).add(classLoader5);
                } else {

                }
                c0482M348.mo298();
                return unit;
                /* 17 */

            }
        }));
        c00016.mo313(new C0501("log", new Class[]{Object.class}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Unit unit = Unit.INSTANCE;
                C2355 c2355 = this.f7563;
                /* 12 */

                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                Object obj30 = objArr[0];
                StringBuilder sb = new StringBuilder();
                sb.append("Plugin[");
                sb.append(c2355.f7554);
                sb.append("]: ");
                sb.append(obj30);
                C3678.m5305(14, sb.toString());
                C1744 c1744 = c2355.f7561;
                c1744.m3491(new C2368(((C2355) c1744.f5843).f7554, "D", String.valueOf(obj30)));
                return unit;
                /* 17 */

            }
        }));
        c00016.mo313(new C0501("toast", new Class[]{String.class}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Unit unit = Unit.INSTANCE;
                C2355 c2355 = this.f7563;
                /* 12 */

                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 14 */
                // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                // java.util.function.Function
                /* 17 */
                Object obj31 = objArr[0];
                AbstractC2834.m4823(null, 3, c2355.f7554 + ": " + ((String) obj31));
                return unit;

            }
        }));
        c00016.mo313(new C0501("notify", new Class[]{String.class, String.class}, new InterfaceC0500(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ C2355 f7563;

            {
                this.f7563 = this;
            }

            @Override // p000.InterfaceC0500
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
            public final Object mo1745(Object[] objArr) throws C1229, IOException {
                Object c2585;
                Integer numM4853;
                Float fM4851;
                Long lM4854;
                Boolean bool = null;
                Unit unit = Unit.INSTANCE;
                C2355 c2355 = this.f7563;
                switch (18) {
                    case 0:
                        Object obj = objArr[0];
                        Object obj2 = objArr[1];
                        String str8 = (String) obj2;
                        
                        String property = C2357.m4337(C2357.m4336(c2355)).getProperty((String) obj);
                        return property == null ? str8 : property;
                    case 1:
                        Object obj3 = objArr[0];
                        Object obj4 = objArr[1];
                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        
                        File fileM4336 = C2357.m4336(c2355);
                        Properties propertiesM4337 = C2357.m4337(fileM4336);
                        propertiesM4337.setProperty((String) obj3, String.valueOf(zBooleanValue));
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(fileM4336), 8192), StandardCharsets.UTF_8);
                        try {
                            propertiesM4337.store(outputStreamWriter, (String) null);
                            outputStreamWriter.close();
                            return unit;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC1458.m3154(outputStreamWriter, th);
                                throw th2;
                            }
                        }
                    case 2:
                        Object obj5 = objArr[0];
                        Object obj6 = objArr[1];
                        int iIntValue = ((Integer) obj6).intValue();
                        
                        File fileM4337 = C2357.m4336(c2355);
                        Properties propertiesM4338 = C2357.m4337(fileM4337);
                        propertiesM4338.setProperty((String) obj5, String.valueOf(iIntValue));
                        OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(fileM4337), 8192), StandardCharsets.UTF_8);
                        try {
                            propertiesM4338.store(outputStreamWriter2, (String) null);
                            outputStreamWriter2.close();
                            return unit;
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC1458.m3154(outputStreamWriter2, th3);
                                throw th4;
                            }
                        }
                    case 3:
                        Object obj7 = objArr[0];
                        Object obj8 = objArr[1];
                        float fFloatValue = ((Float) obj8).floatValue();
                        
                        File fileM4338 = C2357.m4336(c2355);
                        Properties propertiesM4339 = C2357.m4337(fileM4338);
                        propertiesM4339.setProperty((String) obj7, String.valueOf(fFloatValue));
                        OutputStreamWriter outputStreamWriter3 = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(fileM4338), 8192), StandardCharsets.UTF_8);
                        try {
                            propertiesM4339.store(outputStreamWriter3, (String) null);
                            outputStreamWriter3.close();
                            return unit;
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                AbstractC1458.m3154(outputStreamWriter3, th5);
                                throw th6;
                            }
                        }
                    case 4:
                        Object obj9 = objArr[0];
                        Object obj10 = objArr[1];
                        long jLongValue = ((Long) obj10).longValue();
                        
                        File fileM4339 = C2357.m4336(c2355);
                        Properties propertiesM43310 = C2357.m4337(fileM4339);
                        propertiesM43310.setProperty((String) obj9, String.valueOf(jLongValue));
                        OutputStreamWriter outputStreamWriter4 = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(fileM4339), 8192), StandardCharsets.UTF_8);
                        try {
                            propertiesM43310.store(outputStreamWriter4, (String) null);
                            outputStreamWriter4.close();
                            return unit;
                        } catch (Throwable th7) {
                            try {
                                throw th7;
                            } catch (Throwable th8) {
                                AbstractC1458.m3154(outputStreamWriter4, th7);
                                throw th8;
                            }
                        }
                    case 5:
                        Object obj11 = objArr[0];
                        Object obj12 = objArr[1];
                        Set set = (Set) obj12;
                        
                        String property2 = C2357.m4337(C2357.m4336(c2355)).getProperty((String) obj11);
                        if (property2 == null) {
                            return set;
                        }
                        try {
                            JSONArray jSONArray = new JSONArray(property2);
                            C2664 c2664 = new C2664(new C1890(jSONArray.length()));
                            C1890 c1890 = c2664.f8579;
                            int length = jSONArray.length();
                            while (0 < length) {
                                c2664.add(jSONArray.optString(0));
                                0++;
                            }
                            c1890.m3682();
                            c1890.f6255 = true;
                            if (c1890.f6251 <= 0) {
                            }
                            c2585 = c1890.f6251 <= 0 ? C2664.f8578 : c2664;
                            break;
                        } catch (Throwable th9) {
                            c2585 = new C2585(th9);
                        }
                        Object obj13 = set;
                        if (!(c2585 instanceof C2585)) {
                            obj13 = c2585;
                        }
                        return (Set) obj13;
                    case 6:
                        Object obj14 = objArr[0];
                        Object obj15 = objArr[1];
                        boolean zBooleanValue2 = ((Boolean) obj15).booleanValue();
                        
                        String property3 = C2357.m4337(C2357.m4336(c2355)).getProperty((String) obj14);
                        if (property3 != null) {
                            if (property3.equals("true")) {
                                bool = Boolean.TRUE;
                            } else if (property3.equals("false")) {
                                bool = Boolean.FALSE;
                            }
                            if (bool != null) {
                                zBooleanValue2 = bool.booleanValue();
                            }
                        }
                        return Boolean.valueOf(zBooleanValue2);
                    case 7:
                        Object obj16 = objArr[0];
                        Object obj17 = objArr[1];
                        int iIntValue2 = ((Integer) obj17).intValue();
                        
                        String property4 = C2357.m4337(C2357.m4336(c2355)).getProperty((String) obj16);
                        if (property4 != null && (numM4853 = AbstractC2848.m4853(property4)) != null) {
                            iIntValue2 = numM4853.intValue();
                        }
                        return Integer.valueOf(iIntValue2);
                    case 8:
                        Object obj18 = objArr[0];
                        Object obj19 = objArr[1];
                        float fFloatValue2 = ((Float) obj19).floatValue();
                        
                        String property5 = C2357.m4337(C2357.m4336(c2355)).getProperty((String) obj18);
                        if (property5 != null && (fM4851 = AbstractC2847.m4851(property5)) != null) {
                            fFloatValue2 = fM4851.floatValue();
                        }
                        return Float.valueOf(fFloatValue2);
                    case 9:
                        Object obj20 = objArr[0];
                        Object obj21 = objArr[1];
                        long jLongValue2 = ((Long) obj21).longValue();
                        
                        String property6 = C2357.m4337(C2357.m4336(c2355)).getProperty((String) obj20);
                        if (property6 != null && (lM4854 = AbstractC2848.m4854(property6)) != null) {
                            jLongValue2 = lM4854.longValue();
                        }
                        return Long.valueOf(jLongValue2);
                    case 10:
                        Object obj22 = objArr[0];
                        Object obj23 = objArr[1];
                        
                        File fileM43310 = C2357.m4336(c2355);
                        Properties propertiesM43311 = C2357.m4337(fileM43310);
                        propertiesM43311.setProperty((String) obj22, (String) obj23);
                        OutputStreamWriter outputStreamWriter5 = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(fileM43310), 8192), StandardCharsets.UTF_8);
                        try {
                            propertiesM43311.store(outputStreamWriter5, (String) null);
                            outputStreamWriter5.close();
                            return unit;
                        } catch (Throwable th10) {
                            try {
                                throw th10;
                            } catch (Throwable th11) {
                                AbstractC1458.m3154(outputStreamWriter5, th10);
                                throw th11;
                            }
                        }
                    case 11:
                        Object obj24 = objArr[0];
                        Object obj25 = objArr[1];
                        
                        File fileM43311 = C2357.m4336(c2355);
                        Properties propertiesM43312 = C2357.m4337(fileM43311);
                        propertiesM43312.setProperty((String) obj24, new JSONArray((Collection) AbstractC0744.m2206((Set) obj25)).toString());
                        OutputStreamWriter outputStreamWriter6 = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(fileM43311), 8192), StandardCharsets.UTF_8);
                        try {
                            propertiesM43312.store(outputStreamWriter6, (String) null);
                            outputStreamWriter6.close();
                            return unit;
                        } catch (Throwable th12) {
                            try {
                                throw th12;
                            } catch (Throwable th13) {
                                AbstractC1458.m3154(outputStreamWriter6, th12);
                                throw th13;
                            }
                        }
                    case 12 /* 12 */:
                        Object obj26 = objArr[0];
                        String strConcat = (String) obj26;
                        RunnableC1668 runnableC1668M4333 = c2355.m4333();
                        
                        RunnableC1668.m3389("eval(String): ", strConcat);
                        C0007 c00017 = runnableC1668M4333.f5634;
                        if (!strConcat.endsWith(";")) {
                            strConcat = strConcat.concat(";");
                        }
                        runnableC1668M4333.m3391(new StringReader(strConcat), c00017, "Memory");
                        return unit;
                    case 13:
                        Object obj27 = objArr[0];
                        String str9 = (String) obj27;
                        String canonicalPath = (new File(str9).isAbsolute() ? new File(str9) : new File(c2355.f7549, str9)).getCanonicalPath();
                        RunnableC1668 runnableC1668M4334 = c2355.m4333();
                        C0007 c00018 = runnableC1668M4334.f5634;
                        File fileM3393 = runnableC1668M4334.m3393(canonicalPath);
                        RunnableC1668.m3389("Sourcing file: ", fileM3393);
                        BufferedReader bufferedReader = new BufferedReader(new C1326(new FileInputStream(fileM3393)));
                        try {
                            runnableC1668M4334.m3391(bufferedReader, c00018, fileM3393.getPath());
                            return unit;
                        } finally {
                            bufferedReader.close();
                        }
                    case 14 /* 14 */:
                        Object obj28 = objArr[0];
                        String str10 = (String) obj28;
                        final String canonicalPath2 = (new File(str10).isAbsolute() ? new File(str10) : new File(c2355.f7549, str10)).getCanonicalPath();
                        RunnableC1668 runnableC1668M4335 = c2355.m4333();
                        final ClassLoader classLoader2 = C2361.class.getClassLoader();
                        String strM2983 = AbstractC1270.m2983(canonicalPath2);
                        ClassLoader classLoader3 = strM2983 != null ? (ClassLoader) AbstractC0499.f2146.computeIfAbsent(AbstractC0499.m1743("dex", strM2983, classLoader2), new Function() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                            @Override // java.util.function.Function
                            public final Object apply(Object obj210) {
                                switch (1) {
                                    case 0:
                                        try {
                                            return AbstractC2202.m4001(classLoader2, canonicalPath2);
                                        } catch (Exception e) {
                                            System.err.println("[BeanShell] GetLoaderByJar: " + e);
                                            return null;
                                        }
                                    default:
                                        try {
                                            return new InMemoryDexClassLoader(ByteBuffer.wrap(Files.readAllBytes(new File(canonicalPath2).toPath())), classLoader2);
                                        } catch (Exception e2) {
                                            System.err.println("[BeanShell] GetLoaderByDex: " + e2);
                                            return null;
                                        }
                                }
                            }
                        }) : null;
                        C0482 c0482M347 = runnableC1668M4335.f5634.m346();
                        C0094 c0094 = c0482M347.f2095;
                        if (classLoader3 != null) {
                            ((HashSet) c0094.f1049).add(classLoader3);
                        } else {
                            
                        }
                        c0482M347.mo298();
                        return unit;
                    case 15:
                        Object obj29 = objArr[0];
                        String str11 = (String) obj29;
                        final String canonicalPath3 = (new File(str11).isAbsolute() ? new File(str11) : new File(c2355.f7549, str11)).getCanonicalPath();
                        RunnableC1668 runnableC1668M4336 = c2355.m4333();
                        final ClassLoader classLoader4 = C2361.class.getClassLoader();
                        String strM2984 = AbstractC1270.m2983(canonicalPath3);
                        ClassLoader classLoader5 = strM2984 != null ? (ClassLoader) AbstractC0499.f2146.computeIfAbsent(AbstractC0499.m1743("jar", strM2984, classLoader4), new Function() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᤞᲀ
                            @Override // java.util.function.Function
                            public final Object apply(Object obj210) {
                                switch (0) {
                                    case 0:
                                        try {
                                            return AbstractC2202.m4001(classLoader4, canonicalPath3);
                                        } catch (Exception e) {
                                            System.err.println("[BeanShell] GetLoaderByJar: " + e);
                                            return null;
                                        }
                                    default:
                                        try {
                                            return new InMemoryDexClassLoader(ByteBuffer.wrap(Files.readAllBytes(new File(canonicalPath3).toPath())), classLoader4);
                                        } catch (Exception e2) {
                                            System.err.println("[BeanShell] GetLoaderByDex: " + e2);
                                            return null;
                                        }
                                }
                            }
                        }) : null;
                        C0482 c0482M348 = runnableC1668M4336.f5634.m346();
                        C0094 c0095 = c0482M348.f2095;
                        if (classLoader5 != null) {
                            ((HashSet) c0095.f1049).add(classLoader5);
                        } else {
                            
                        }
                        c0482M348.mo298();
                        return unit;
                    case 16:
                        Object obj30 = objArr[0];
                        StringBuilder sb = new StringBuilder();
                        sb.append("Plugin[");
                        sb.append(c2355.f7554);
                        sb.append("]: ");
                        sb.append(obj30);
                        C3678.m5305(14, sb.toString());
                        C1744 c1744 = c2355.f7561;
                        c1744.m3491(new C2368(((C2355) c1744.f5843).f7554, "D", String.valueOf(obj30)));
                        return unit;
                    case 17 /* 17 */:
                        Object obj31 = objArr[0];
                        AbstractC2834.m4823(null, 3, c2355.f7554 + ": " + ((String) obj31));
                        return unit;
                    default:
                        Object obj32 = objArr[0];
                        Object obj33 = objArr[1];
                        
                        Context contextM3276 = C1565.m3276();
                        C1654 c1654 = new C1654("WAuxiliary");
                        c1654.f5600 = "WAuxiliary";
                        C0542 c0542 = new C0542(c1654);
                        C2103 c2103 = new C2103(contextM3276, c0542);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c2355.f7554);
                        c2103.f6937 = AbstractC2784.m4752(sb2, ": ", (String) obj32);
                        c2103.f6938 = (String) obj33;
                        C0542 c0543 = new C0542(c2103);
                        C2873 c2874 = (C2873) new C0542(c0543).f2253;
                        C2239 c2239 = (C2239) c2874.getValue();
                        C2234 c2234 = (C2234) ((C2873) c0542.f2253).getValue();
                        
                        NotificationChannel notificationChannel = new NotificationChannel(c2234.f7232, c2234.f7233, c2234.f7234);
                        notificationChannel.setDescription(c2234.f7235);
                        notificationChannel.setGroup(null);
                        notificationChannel.setShowBadge(true);
                        notificationChannel.setSound(c2234.f7236, c2234.f7237);
                        notificationChannel.enableLights(false);
                        notificationChannel.setLightColor(0);
                        notificationChannel.setVibrationPattern(null);
                        notificationChannel.enableVibration(false);
                        c2239.f7258.createNotificationChannel(notificationChannel);
                        Notification notification = (Notification) ((C2873) c0543.f2253).getValue();
                        if (AbstractC2841.m4836("")) {
                            ((C2239) c2874.getValue()).m4148(null, notification);
                        } else {
                            ((C2239) c2874.getValue()).m4148("", notification);
                        }
                        ((Number) AbstractC0156.f1167.getValue()).intValue();
                        return unit;
                }
            }
        }));
        c00016.mo313(new C0501("getTopActivity", new Class[0], new C2373(8)));
        c00016.mo313(new C0501("uploadDeviceStep", new Class[]{cls4}, new C2373(9)));
        C0007 c00017 = runnableC1668.f5634;
        c00017.mo313(new C0501("uploadText", new Class[]{String.class}, new C2373(10)));
        c00017.mo313(new C0501("uploadText", new Class[]{String.class, String.class, String.class}, new C2373(11)));
        c00017.mo313(new C0501("uploadText", new Class[]{JSONObject.class}, new C2373(12)));
        c00017.mo313(new C0501("uploadTextAndPicList", new Class[]{String.class, String.class}, new C2373(13)));
        c00017.mo313(new C0501("uploadTextAndPicList", new Class[]{String.class, String.class, String.class, String.class}, new C2373(14)));
        c00017.mo313(new C0501("uploadTextAndPicList", new Class[]{String.class, List.class}, new C2373(15)));
        c00017.mo313(new C0501("uploadTextAndPicList", new Class[]{String.class, List.class, String.class, String.class}, new C2373(16)));
        c00017.mo313(new C0501("uploadTextAndPicList", new Class[]{JSONObject.class}, new C2373(17)));
        C0007 c00018 = runnableC1668.f5634;
        c00018.mo313(new C0501("confirmTransfer", new Class[]{String.class, String.class, String.class, cls2}, new C2373(18)));
        c00018.mo313(new C0501("refuseTransfer", new Class[]{String.class, String.class, String.class}, new C2373(19)));
        c00018.mo313(new C0501("jsLogin", new Class[]{String.class, Consumer.class}, new C2373(20)));
        c00018.mo313(new C0501("sendXmlMsg", new Class[]{String.class, String.class}, new C2373(21)));
        c00018.mo313(new C0501("addToQueue", new Class[]{Object.class}, new C2373(22)));
        map2.put(str, runnableC1668);
        map.put(str, AbstractC2205.m4055(file));
        runnableC1668.m3391(new InputStreamReader(new FileInputStream(file), AbstractC0599.f2413), runnableC1668.f5634, "eval stream");
        return runnableC1668;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean m4334() {
        C0542 c0542 = AbstractC0968.f3516;
        if (c0542 != null) {
            return c0542.m1891().getBoolean(this.f7560, false);
        }
        throw new IllegalArgumentException("PluginConfig must be init".toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4335(boolean z) {
        C0542 c0542 = AbstractC0968.f3516;
        if (c0542 == null) {
            throw new IllegalArgumentException("PluginConfig must be init".toString());
        }
        c0542.m1891().putBoolean(this.f7560, z);
    }
}
