package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.be;
import com.umeng.analytics.pro.dh;
import com.umeng.analytics.pro.dn;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class f {
    public static final long a = 86400000;
    public static f b;
    private static final String c = be.b().b("id");
    private static Object j = new Object();
    private File d;
    private long f;
    private a i;
    private com.umeng.commonsdk.statistics.proto.c e = null;
    private Set<com.umeng.commonsdk.statistics.idtracking.a> h = new HashSet();
    private long g = 86400000;

    /* JADX INFO: compiled from: obf */
    public static class a {
        private Context a;
        private Set<String> b = new HashSet();

        public a(Context context) {
            this.a = context;
        }

        public synchronized boolean a(String str) {
            return !this.b.contains(str);
        }

        public synchronized void b(String str) {
            this.b.add(str);
        }

        public void c(String str) {
            this.b.remove(str);
        }

        public synchronized void a() {
            try {
                if (!this.b.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = this.b.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(',');
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    PreferenceWrapper.getDefault(this.a).edit().putString("invld_id", sb.toString()).commit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized void b() {
            String[] strArrSplit;
            String string = PreferenceWrapper.getDefault(this.a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(",")) != null) {
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        this.b.add(str);
                    }
                }
            }
        }
    }

    public f(Context context) {
        this.i = null;
        this.d = new File(context.getFilesDir(), c);
        a aVar = new a(context);
        this.i = aVar;
        aVar.b();
    }

    public static synchronized void a() {
        f fVar = b;
        if (fVar != null) {
            fVar.e();
            b = null;
        }
    }

    private synchronized void h() {
        try {
            com.umeng.commonsdk.statistics.proto.c cVar = new com.umeng.commonsdk.statistics.proto.c();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
                if (aVar.c()) {
                    if (aVar.d() != null) {
                        map.put(aVar.b(), aVar.d());
                    }
                    if (aVar.e() != null && !aVar.e().isEmpty()) {
                        arrayList.addAll(aVar.e());
                    }
                }
            }
            cVar.a(arrayList);
            cVar.a(map);
            synchronized (this) {
                this.e = cVar;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private com.umeng.commonsdk.statistics.proto.c i() {
        Throwable th;
        FileInputStream fileInputStream;
        synchronized (j) {
            if (!this.d.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.d);
                try {
                    try {
                        byte[] streamToByteArray = HelperUtils.readStreamToByteArray(fileInputStream);
                        com.umeng.commonsdk.statistics.proto.c cVar = new com.umeng.commonsdk.statistics.proto.c();
                        new dh().a(cVar, streamToByteArray);
                        HelperUtils.safeClose(fileInputStream);
                        return cVar;
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        HelperUtils.safeClose(fileInputStream);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    HelperUtils.safeClose(fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                HelperUtils.safeClose(fileInputStream);
                throw th;
            }
        }
    }

    public synchronized void b() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f >= this.g) {
                boolean z = false;
                for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
                    if (aVar.c() && aVar.a()) {
                        if (!aVar.c()) {
                            this.i.b(aVar.b());
                        }
                        z = true;
                    }
                }
                if (z) {
                    h();
                    this.i.a();
                    g();
                }
                this.f = jCurrentTimeMillis;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized com.umeng.commonsdk.statistics.proto.c c() {
        return this.e;
    }

    public String d() {
        return null;
    }

    public synchronized void e() {
        try {
            if (b == null) {
                return;
            }
            boolean z = false;
            for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
                if (aVar.c() && aVar.e() != null && !aVar.e().isEmpty()) {
                    aVar.a((List<com.umeng.commonsdk.statistics.proto.a>) null);
                    z = true;
                }
            }
            if (z) {
                com.umeng.commonsdk.statistics.proto.c cVar = this.e;
                if (cVar != null) {
                    cVar.b(false);
                }
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void f() {
        try {
            com.umeng.commonsdk.statistics.proto.c cVarI = i();
            if (cVarI == null) {
                return;
            }
            a(cVarI);
            ArrayList arrayList = new ArrayList(this.h.size());
            synchronized (this) {
                try {
                    this.e = cVarI;
                    for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
                        aVar.a(this.e);
                        if (!aVar.c()) {
                            arrayList.add(aVar);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.h.remove((com.umeng.commonsdk.statistics.idtracking.a) it.next());
                    }
                    h();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void g() {
        com.umeng.commonsdk.statistics.proto.c cVar = this.e;
        if (cVar != null) {
            b(cVar);
        }
    }

    public static synchronized f a(Context context) {
        try {
            if (b == null) {
                f fVar = new f(context);
                b = fVar;
                fVar.a(new g(context));
                b.a(new b(context));
                b.a(new k(context));
                b.a(new e(context));
                b.a(new d(context));
                b.a(new h(context));
                b.a(new j());
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
                    b.a(new i(context));
                    if (DeviceConfig.isHonorDevice()) {
                        b.a(new c(context));
                    }
                }
                b.f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    private void b(com.umeng.commonsdk.statistics.proto.c cVar) {
        byte[] bArrA;
        synchronized (j) {
            if (cVar != null) {
                try {
                    synchronized (this) {
                        a(cVar);
                        bArrA = new dn().a(cVar);
                    }
                    if (bArrA != null) {
                        HelperUtils.writeFile(this.d, bArrA);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private boolean a(com.umeng.commonsdk.statistics.idtracking.a aVar) {
        if (this.i.a(aVar.b())) {
            return this.h.add(aVar);
        }
        if (!AnalyticsConstants.UM_DEBUG) {
            return false;
        }
        MLog.w("invalid domain: " + aVar.b());
        return false;
    }

    public void a(long j2) {
        this.g = j2;
    }

    private void a(com.umeng.commonsdk.statistics.proto.c cVar) {
        Map<String, com.umeng.commonsdk.statistics.proto.b> map;
        if (cVar == null || (map = cVar.a) == null) {
            return;
        }
        if (map.containsKey("mac") && !FieldManager.allow(com.umeng.commonsdk.utils.d.h)) {
            cVar.a.remove("mac");
        }
        if (cVar.a.containsKey("imei") && !FieldManager.allow(com.umeng.commonsdk.utils.d.g)) {
            cVar.a.remove("imei");
        }
        if (cVar.a.containsKey("android_id") && !FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
            cVar.a.remove("android_id");
        }
        if (cVar.a.containsKey("serial") && !FieldManager.allow(com.umeng.commonsdk.utils.d.j)) {
            cVar.a.remove("serial");
        }
        if (cVar.a.containsKey("idfa") && !FieldManager.allow(com.umeng.commonsdk.utils.d.w)) {
            cVar.a.remove("idfa");
        }
        if (!cVar.a.containsKey("oaid") || FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            return;
        }
        cVar.a.remove("oaid");
    }
}
