package p000;

import com.drake.net.exception.HttpFailureException;
import com.drake.net.exception.NetConnectException;
import com.drake.net.exception.NetException;
import com.drake.net.exception.NetSocketTimeoutException;
import com.drake.net.exception.NetUnknownHostException;
import com.drake.net.exception.NoCacheException;
import java.lang.ref.WeakReference;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᲀᲇᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2183 implements Interceptor {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2183 f7224 = new C2183();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m4139(Interceptor.Chain chain) {
        AbstractC2174.f7207.add(new WeakReference(chain.call()));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m4140(Interceptor.Chain chain) {
        Iterator it = AbstractC2174.f7207.iterator();
        while (it.hasNext()) {
            Call call = (Call) ((WeakReference) it.next()).get();
            if (call == null) {
                it.remove();
            } else if (call.equals(chain.call())) {
                it.remove();
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4, types: [okhttp3.Response, ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᛸᲀᲇᲁ] */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        ConnectException connectException;
        Throwable th;
        Response responseProceed;
        Request request = chain.request();
        RequestBody requestBodyBody = request.body();
        C2186 c2186 = requestBodyBody != null ? new C2186(requestBodyBody, (ConcurrentLinkedQueue) request.tag(AbstractC2243.class)) : null;
        C1399 c1399 = (C1399) request.tag(C1399.class);
        ?? r1 = c1399;
        if (c1399 == null) {
            r1 = AbstractC2174.f7204;
        }
        EnumC0521 enumC0521 = (EnumC0521) request.tag(EnumC0521.class);
        Request.Builder builderNewBuilder = request.newBuilder();
        if (r1 != 0 && enumC0521 != null) {
            builderNewBuilder.cacheControl(new CacheControl.Builder().noCache().noStore().build());
        }
        Request requestBuild = builderNewBuilder.method(request.method(), c2186).build();
        try {
            try {
                try {
                    m4139(chain);
                    if (r1 != 0) {
                        int i = enumC0521 == null ? -1 : AbstractC2181.f7222[enumC0521.ordinal()];
                        if (i == 1) {
                            responseProceed = r1.m3210(requestBuild);
                            if (responseProceed == null) {
                                throw new NoCacheException(requestBuild, null, null, 6, null);
                            }
                        } else if (i == 2) {
                            responseProceed = r1.m3210(requestBuild);
                            if (responseProceed == null) {
                                responseProceed = r1.m3211(chain.proceed(requestBuild));
                            }
                        } else if (i != 3) {
                            responseProceed = i != 4 ? chain.proceed(requestBuild) : r1.m3211(chain.proceed(requestBuild));
                        } else {
                            try {
                                responseProceed = r1.m3211(chain.proceed(requestBuild));
                            } catch (Exception unused) {
                                responseProceed = r1.m3210(requestBuild);
                                if (responseProceed == null) {
                                    throw new NoCacheException(requestBuild, null, null, 6, null);
                                }
                            }
                        }
                    } else {
                        responseProceed = chain.proceed(requestBuild);
                    }
                    Response response = responseProceed;
                    try {
                        ResponseBody responseBodyBody = response.body();
                        Response responseBuild = response.newBuilder().body(responseBodyBody != null ? new C2189(responseBodyBody, (ConcurrentLinkedQueue) requestBuild.tag(AbstractC2239.class), new C2182(chain)) : null).build();
                        if ((responseBuild != null ? responseBuild.body() : null) == null) {
                            m4140(chain);
                        }
                        return responseBuild;
                    } catch (NetException e) {
                        throw e;
                    } catch (ConnectException e2) {
                        connectException = e2;
                        throw new NetConnectException(requestBuild, null, connectException, 2, null);
                    } catch (SocketTimeoutException e3) {
                        e = e3;
                        throw new NetSocketTimeoutException(requestBuild, e.getMessage(), e);
                    } catch (UnknownHostException e4) {
                        e = e4;
                        throw new NetUnknownHostException(requestBuild, e.getMessage(), null, 4, null);
                    } catch (Throwable th2) {
                        th = th2;
                        throw new HttpFailureException(requestBuild, null, th, 2, null);
                    }
                } catch (Throwable th3) {
                    if ((r1 != 0 ? r1.body() : null) == null) {
                        m4140(chain);
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (NetException e5) {
            throw e5;
        } catch (ConnectException e6) {
            connectException = e6;
        } catch (SocketTimeoutException e7) {
            e = e7;
        } catch (UnknownHostException e8) {
            e = e8;
        }
    }
}
