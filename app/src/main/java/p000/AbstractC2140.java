package p000;

import android.content.Context;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2140 {

    public static Context f7078;

    public static OkHttpClient f7079;

    public static C1391 f7080;

    public static final boolean f7081;

    public static final String f7082;

    public static final ConcurrentLinkedQueue f7083;

    public static final C2141 f7084;

    public static final C1133 f7085;

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        AbstractC2271.m4154(builder);
        f7079 = builder.build();
        f7081 = true;
        f7082 = "NET_LOG";
        f7083 = new ConcurrentLinkedQueue();
        f7084 = C2141.f7086;
        f7085 = C1133.f4212;
    }
}
